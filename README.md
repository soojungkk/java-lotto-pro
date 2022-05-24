# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## Goals
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급한다. 

## 기능
- `구입금액을 입력해주세요.` 문구 출력
- 금액 입력 기능
- `1000`원을 기준으로 `n개를 구매했습니다.` 문구 출력
- `지난 주 당첨 번호를 입력해 주세요.` 문구 출력
  `보너스 볼을 입력해주세요.` 문구 출력 
- 입력된 당첨 번호를 기준으로 당첨 통계 출력
    ```text
    당첨 통계
    ---------
    3개 일치 (5000원)- 1개
    4개 일치 (50000원)- 0개
    5개 일치 (1500000원)- 0개
    5개 일치, 보너스 볼 일치(30000000원) - 0개
    6개 일치 (2000000000원)- 0개
    총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
    ```

## 예외 사항
- 구입 금액 입력 시 `1000`원 단위로 나눈 후 나머지가 있는 경우 예외 발생
- 구입 금액이 음수인 경우 예외 발생
- 로또 번호는 `1 ~ 45` 이외의 숫자가 있는 경우 예외 발생
- 당첨 번호 입력 시 숫자와 `,`이외의 문자가 있는 경우 예외 발생
- 당첨 번호 입력 시 `6`개 이상의 수가 있는 경우 예외 발생
- 당첨 번호 입력 시 중복되는 수가 있는 경우 예외 발생
- 당첨 통계의 수익률은 소수점 2째자리까지만 표출함

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)