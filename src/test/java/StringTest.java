import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    @DisplayName("String을 ,로 split했을 때 문자열이 배열로 잘 구분된다.")
    void checkSplit() {
        String separator = ",";

        assertThat("1,2".split(separator)).containsExactly("1", "2");
        assertThat("1,".split(separator)).containsExactly("1");
    }

    @Test
    @DisplayName("String을 substring했을 때 문자열이 잘 제거된다.")
    void checkSubstring() {
        assertThat("(1,2)".substring(1, 4)).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String에 chatAt()으로 접근했을 때 올바른 값을 응답하거나 인덱스가 유효하지 않을 경우 오류가 발생한다.")
    void checkCharAt() {
        String input = "abc";

        assertThat(input.charAt(0)).isEqualTo('a');
        assertThatThrownBy(() -> {
            input.charAt(input.length());
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}