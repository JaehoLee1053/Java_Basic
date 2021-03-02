# Java_Basic

- 자바는 다른 언어와 다르게 자바 컴파일러 중간 단계인 바이트 코드로 변환되는데 가상머신(JVM)만 있으면 어떤 OS에서도 실행 가능

## 용어

- 컴파일 : 프로그래밍 언어를 기계어로 변환하는 것

- 컴파일러 : 기계어로 바꾸어 주는 프로그램

- 바이트 코드/바이너리 파일 (.class) : 특정 HW가 아닌 가상머신에서 돌아가는 실행 프로그램을 위한 이진 표현법

- 인코딩 : 각 문자에 따른 특정 코드 값 부여

- 디코딩 : 숫자 값을 원래 문자로 변환
  
- JVM (Java Virtual Machine)
  
  - 자바 소스코드로부터 만들어진 자바 바이너리 파일(.class)을 실행
  
  - 플랫폼 의존적
    
  - 바이너리 코드 읽기/검증/실행
    
  - Runtime Environment의 규격 제공 (라이브러리 및 기타 파일)
  
- JRE (Java Runtime Environment)
  
  - JVM이 자바 프로그램을 동작시킬 때 필요한 라이브러리 및 파일, 기타 파일을 
    
- JDK (Java Develpoment Kit)
  
  - JRE + 개발에 필요한 도구(javac, java) 등을 포함

- 객체

  - 객체 지향 프로그램의 대상, 생성된 인스턴스

- 클래스

  - 객체를 프로그래밍하기 위해 코드로 만든 상태

- 인스턴스

  - 클래스가 메모리에 생성된 상태

- 멤버 변수

  - 클래스의 속성, 특성

- 메서드

  - 멤버 변수를 이용하여 클래스의 기능 구현

- 참조 변수

  - 메모리에 생성된 인스턴스를 가리키는 변수

- 참조 값

  - 

## 변수

기본형

- 자바 언어에서 기본으로 제공하는 자료형

- 메모리 크기 고정

- int, char, float, double, boolean, ...

참조형

- 클래스 자료형

- JDK에서 제공되는 클래스와 프로그래머가 정의하느 클래스

- 클래스에 따라 크기 다름

- String, Student, ...

상수

- 변하지 않는 수


`
final int a = 0;
`

리터럴

- 프로그램에서 사용하는 모든 숫자, 값, 논리 값

- 모든 리터럴은 상수 풀에 저장

  - 상수 풀에 저장될 때는 정수는 int, 실수는 double로 저장
  

형 변환 : 서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어남

- 묵시적 형 변환 (Implicit type conversion)
  
  - 작은 수에서 큰 수로 변환
  
  - ex) 정수 -> 실수

- 명시적 형 변환 (Explicit type conversion)

  - 변환되는 자료 형을 명시
  
  - 데이터 손실 가능성
  
  
## 연산자

항 (operand) : 연산에 사용되는 값

연산자 (operator) : 항을 이용하여 연산하는 기호

- 대입 연산자

- 부호 연산자

- 산술 연산자

  - 사칙연산 연산자 (+, -, *, /, %)
  
- 복합 대입 연산자 (+=, -=, *=, ...)

- 증감 연산자 (++, --)

- 관계 연사자 (>, <=, ==, ...)

- 논리 연산자 (&&, ||, !)

- 삼항 연산자

`int num = (5>3)?10:20;`

- 비트 연산자 (~, &, |, ^, <<, >>, >>>)

항의 개수와 연산자

|연산자|설명|연산 예|
|:---:|:---:|:---:|
|단한 연산자|항이 한 개인 연산자|++num|
|이항 연산자|항이 두 개인 연산자|num1 + num2;|
|삼항 연산자|항이 세 개인 연산자|(5 > 3) ? 1 : 0;|

## 배열

배열

- 동일한 자료형의 순차적 자료 구조

- 배열 선언

```
int[] arr = new int[10];
int arr[] = new int[10];
int[][] arr = new int[2][3];
```

- 처음 선언된 값으로 고정된 길이

객체 배열

- 얕은 복사 : 주소 값자체를 공유, 기존 값 변경시 같이 변경

`System.arraycopy(library, 0, copyLibrary, 0, library.length);`
		
- 깊은 복사 : 값만 복사

ArrayList 클래스

|메서드|설명|
|-|-|
|boolean add(E e)|요소 하나를 배열에 추가합니다. E는 요소의 자료형을 의미합니다.|
|int size()|배열에 추가된 요소 전체 개수를 반환합니다.|
|E get(int index)|배열의 index 위치에 있는 요소 값을 반환합니다.|
|E remove(int index)|배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환합니다.|
|boolean isEmpty()|배열이 비어 있는지 확인합니다.|

## 제어문

### 조건문

if-else 문

```
if (Conditional expression) {
  Execution statement;
} else {
  Execution statement;
}
```

for 문 / while 문 / do-while 문

```
for (int i = 0; i < n; i++) {
  Execution statement;
}

while (i < 0) {
  Execution statement;
}

do {
  Execution statement;
} while(i > 0);
```
# OOP

## OOP

객체 (Object)

- 구체적, 추상적 데이터 단위

OOP (Object Oriented Programming)

- 객체 지향 프로그래밍

- 객체 정의, 기능 구현, cooperation 구현

- ch. 절차 지향 프로그래밍 (Procedural Programming) 

  - 객체 (Entity)
 
  - 시간, 사건의 흐름에 따라 구현
  - 
  - ex. C언어

멤버 변수

- 객체가 가지는 속성을 변수로 표현

- 클래스의 멤버변수

- member variable, property, attribute

메서드

- 객체의 기능을 구현

- method, member function

함수 (function)

- 하나의 기능을 수행하는 일련의 코드

- 함수로 구현된 기능은 여러 곳에서 호출되어 사용할 수 있음

- 이름, 매개변수, 반환 값, body로 구성

```
int add (int num1, int num2) {
  int result;
  result = num1 + nuum2;
  return result;
} 
```

### Class

- 객체를 코드로 구현한 것

- OOP의 기본 요소

- 객체의 blueprint

인스턴스

- 클래스로 부터 생성된 객체

- 힙 메모리에 멤버 변수 크기에 따라 메모리 생성

- 클래스를 기반으로 new 키워드를 이용하여 여러 개의 인스턴스 생성

생성자 (Constructor)

- 객체 생성시에만 new 키웓드와 함께 호출 가능

- 인스턴스 초기화 코드 (주로 멤버 변수)

- 반환 값 없음, 상속되지지 않음

- 클래스 이름과 동일

- 기본 생성자 (default constructor)

  - 프로그래머가 별도로 생성자를 구현하지 않으면 컴파일러가 기본 생성자를 생성

  - 매개변수와 구현부가 없음

  - 클래스 내에 생성자 구현 시, 디폴트 생성자는 제공 않음

- 생산자 오버로딩

  - 생성자를 두 개 이상 구현하는 경우 같은 이름의 생성자로 생성 가능

  - private 변수도 생성자로 초기화 가능

참조 자료형

- 클래스형을 변수로 선언

`String name;`

- 기본 자료형과 다르게 클래스에 따라 메모리 할당 다름

접근 제어자 (access modifier)

- 변수, 메서드, 생성자에 접근 권한 지정

- public, private, protected

- private는 외부에서 접근 불가

- 정보 은닉 (information hiding)

  - 외부에서 클래스 내부 정보에 접근 제한 (private 사용)

  - 클래스 내부 데이터를 잘못 사용하는 오류 방지 가능

this

- 자신의 메모리를 가리킴

- 인스턴스 자신의 주소 반환

static 변수

- static 변수는 처음 프로그램이 로드 될 때 데이터 영역에 생성

- 인스턴스의 생성과 상관 없이 사용할 수 있으므로 클래스 이름 참조

`ClassName.variable = 100;`

- 클래스 변수, 정적 변수

static 메서드

- static 변수를 위한 기능을 제공하는 static 메서드

- static 메서드에서는 인스턴트 변수 사용 불가

- 클래스 이름으로 참조하여 사용하는 메서드

`ClaaName.getStaticVariable();`

- 클래스 메서드, 정적 메서드

|변수 유형|선언 위치|사용 범위|메모리|생성과 소멸|
|---|---|---|---|---|
|지역 변수 (로컬 변수)|함수 내부에 선언|함수 내부에서만 사용|스택|삼수가 호출될 때 생성되고 함수가 끝나면 소멸함|
|멤버 변수 (인스턴트 변수)|클래스 멤버 변수로 선언|클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능|힙|인스턴스가 생성될 때 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됨|
|static 변수 (클래스 변수)|static 예약어를 사용하여 클래스 내부에 선언|클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능|데이터 영역|프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸|

Singleton Pattern

- 생성자는 privvate

- static으로 유일한 객체 생성 (ex) 날짜 등)

- 외부에서 유일한 객체를 참조할 수 있는 public static get() 메서드 구현

### 상속

상속 (inheritance)

- 새로운 클래스를 정의할 때 이미 구현된 클래스를 상속받아 기능이 확장된 클래스를 구현

- 상속하는 클래스 : 상위 클래스, **parent class**, base class, super class
- 상속받는 클래스 : 하위 클래스, **child class**, derived class, subclass

- java는 single inheritance만 가능

```
class Human extends Mammal {

}
```

- protected : 하위 클래스에게는 public, 외부에는 private처럼 동작

||외부 클래스|하위 클래스|동일 클래스|내부 클래스|
|-|-|-|-|-|
|public|O|O|O|O|
|protected|X|O|O|O|
|default|X|X|O|O|
|private|X|X|X|O|
