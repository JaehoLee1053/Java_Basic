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

## OOP

객체 (Object)

- 구체적, 추상적 데이터 단위

OOP (Object Oriented Programming)

- 객체 지향 프로그래밍

- 객체 정의, 기능 구현, cooperation 구현

- ch. 절차 지향 프로그래밍 (Procedural Programming) 
  - 객체 (Entity)
 
  - 시간, 사건의 흐름에 따라 구현
  - ex. C언어

Class

- 객체를 코드로 구현한 것
- OOP의 기본 요소
- 객체의 blueprint
