# kotlin-lotto
## 1단계 - 문자열 덧셈 계산기
### 기능 요구 사항
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- [x] 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 
- [x] 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 
- [x] 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- [x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

### 프로그래밍 요구 사항
- [x] indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- [x] 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- [x] 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- [x] 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
- [x] 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.

<br>

## 2단계 - 로또(자동)
### 기능 요구사항
- [x] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- [x] 로또 1장의 가격은 1000원이다.
- [x] 로또 1장당 로또 번호는 6개이다.
- [x] 로또 1장간의 번호는 서로 중복되지 않는다.
- [x] 로또 번호의 숫자 범위는 1~45이다.
- [x] 로또 번호 6자리는 오름차순으로 정렬된다.
- [x] 로또 당첨 번호는 6개이다.
- [x] 로또 당첨 번호는 서로 중복되지 않는다.
- [x] 3개 일치 5_000원
- [x] 4개 일치 50_000원
- [x] 5개 일치 1_500_000원
- [x] 6개 일치 2_000_000_000원

<br>

## 3단계 - 로또(2등)
### 기능 요구사항
- [x] 2등을 위한 추가(보너스) 번호를 더 추첨한다.
  - [x] 추가(보너스) 번호는 다른 번호들과 중복되지 않는다.
- [x] 당첨 통계에 2등을 추가한다.
  - 3개 일치 (5000원)
  - 4개 일치 (50000원)
  - 5개 일치 (1500000원)
  - 5개 일치, 보너스 볼 일치(30000000원)
  - 6개 일치 (2000000000원)

### 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 
  - 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

<br>

## 4단계 - 로또(수동)
- [x] 수동으로 구매할 로또 개수를 정할 수 있다.
  - [x] 정해진 만큼의 수동 구매 후 남는 금액에 따라 자동 로또를 구매한다.
  - [x] 수동으로 입력한 번호에 중복 번호가 있으면 예외를 발생 시킨다.
