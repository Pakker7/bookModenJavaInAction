
# 제네릭 (Generic) 
- 열혈 자바 프로그래밍(윤성우)으로 공부했습니다.

## 제네릭 메소드
### 선언
```java
public static Box<T> makeBox(T o) {...} // 메소드의 이름은 makeBox이고 반환형은 Box<T> 이다.
```
그러나 위의 메서드 정이는 완전하지 않다. 이상테에서 컴파일러는 T가 무엇이냐고 물어보며 컴파일 에러를 뿜는다.
```java
public static <T> Box<T> makeBox(T o) {...} // static과 Box<T> 사이에 위치한 <T>는 T가 타입 매개변수임을 알리는 표시 
```

### 제네릭 메소드의 제한된 타입 매개변수 선언

```java
public static<T extends Number> Box<T> makeBox(T o) {}
```

### quiz
- 다음 코드가 실행되도록 swapBox 메소드를 정의하되, Box<T> 인스턴스를 인자로 전달 받을 수 있도록 정의하자.
단 이때 Box<T> 인스턴스의 T는 Number 또는 이를 상속하는 하위 클래스만 올 수 있도록 제한된 매개변수 선언을 하자.
  - BoxSwapDemo 참고, swapBox 메서드 만들기
  
  실행결과는 다음과 같아야 한다. swapBox 메소드의 호출 겨로가로 두 상자 안에 저장 된 내용물이 서로 달라야 한다.
  ```
  99 & 55
  55 & 99
  ```