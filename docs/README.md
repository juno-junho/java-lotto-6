
## 기능 목록
- [ ] 1~45까지의 숫자를 가진 로또를 발행한다.
- [ ] 한개의 로또를 발행할 때 중복되지 않는 숫가 6개를 뽑는다.
- [ ] 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.

- [ ] 로또 장 수 만큼 로또를 자동으로 생성해 반환한다.

- [ ] 한장의 로또 번호리스트와 당첨 번호를 비교해 당첨 결과를 반환한다.
  - [ ] 당첨 번호와 일치하는 개수를 계산한다.
  - [ ] 당첨 번호와 보너스 번호 일치 개수를 계산한다.

- [ ] 전체 로또의 당첨 결과를 입력하면 당첨금 총액을 반환한다.
  - [ ] overflow에 주의한다 -> long으로 계산한다.
- [ ] 구매금액과 당첨 금액을 통해 수익률을 반환한다
  - [ ] 소수점 둘째 자리에서 반올림 한다.

### 입력
- [ ] 구매 금액을 입력 받는다.
  - [ ]  1_000원 단위가 아니면 예외 처리 후 다시 입력 받는다.
    - [ ] 잘못된 입력 목록 : -1, 0 , 1, 999, 1001, 12345
  - [ ] 숫자가 아닌 다른 값이면 예외 처리 후 다시 입력 받는다.
  - [ ] int 범위가 벗어난다면 예외처리 후 다시 입력 받는다. (21억 이상 수)
- [ ] 구매금액을 입력하면 구매할 수 있는 로또 장수를 반환한다.

- [ ] 6개의 당첨번호 문자열을 `,`로 구분하여 입력받는다.
  - [ ] 문자열에 중복된 숫자가 포함되어 있으면 IllegalArgumentException를 발생시키고 `[ERROR]`로 시작하는 에러 메세지를 출력하고 다시 입력 받는다.
  - [ ] 문자열에 숫자가 아닌 다른 값이 있다면 IllegalArgumentException를 발생시키고 `[ERROR]`로 시작하는 에러 메세지를 출력하고 다시 입력 받는다.
  - [ ] 문자열의 숫자 범위가 1~45를 벗어난다면 IllegalArgumentException를 발생시키고 `[ERROR]`로 시작하는 에러 메세지를 출력하고 다시 입력 받는다.
  - [ ] 보너스 번호를 입력 받는다
    - [ ] 보너스 번호가 당첨 번호에 포함되어 있다면 IllegalArgumentException를 발생시키고 `[ERROR]`로 시작하는 에러 메세지를 출력하고 다시 입력 받는다.
    - [ ] 보너스 번호가 숫자가 아니라면 IllegalArgumentException를 발생시키고 `[ERROR]`로 시작하는 에러 메세지를 출력하고 다시 입력 받는다.
    - [ ] 보너스 번호의 범위가 1~45를 벗어난다면 IllegalArgumentException를 발생시키고 `[ERROR]`로 시작하는 에러 메세지를 출력하고 다시 입력 받는다.