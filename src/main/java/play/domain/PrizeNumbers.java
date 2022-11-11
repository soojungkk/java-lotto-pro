package play.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import play.util.SplitUtils;

public class PrizeNumbers {
    private static final String NUMBER_REGEX = "[\\s0-9,]+";

    private static final int LOTTO_SIZE = 6;

    private final Lotto lotto;

    public PrizeNumbers(String lottoNumber) {
        this.lotto = generatePrizeLotto(lottoNumber);
    }

    public Lotto generatePrizeLotto(String lottoNumber) {
        validLottoNumber(lottoNumber);

        String[] splitNumbers = SplitUtils.splitInputNumbers(lottoNumber);

        validSplitNumbersSize(splitNumbers);

        List<Integer> numberList = Arrays.stream(splitNumbers).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());

        return Lotto.MakeLotto(numberList);
    }

    public void validSplitNumbersSize(String[] splitNumbers) {
        if (splitNumbers.length != LOTTO_SIZE) {
            throw new IllegalArgumentException("올바른 형식의 지난 당첨 번호를 입력해주세요.");
        }
    }

    private void validLottoNumber(String winningLottoNumber) {
        if (!winningLottoNumber.matches(NUMBER_REGEX)) {
            throw new IllegalArgumentException("올바른 형식의 지난 당첨 번호를 입력해주세요.");
        }
    }

    public Lotto getLotto() {
        return this.lotto;
    }
}