
# 제네릭 (Generic) 
- 열혈 자바 프로그래밍(윤성우)으로 공부했습니다.

## 제네릭 클래스

### 용어
- 타입 매개변수(Type parameter)               Box<T> 에서 T
- 타입 인자(Type argument)                   Box<Apple> 에서 Apple
- 매개변수화 타입(Parameterized Type)         Box<Apple> 에서 Box<Apple>   === 제네릭 타입(Generic type)

### 제네릭 타입 매개변수 이름으로 보편적으로 사용하는 단어
- E : Element
- K : Key
- N : Number
- T : Type
- V : Value

***

- 제네릭 클래스는 기본 자료형의 이름은 '타입인자'로 사용할 수 없다.
  - ex. Box<int> box = new Box<int>(); XXXXX 
  - ex. Box<Integer> box = new Box<Integer>(); OOOOO 

### quiz
- 다음은 앞서 예제에서 작성한 수납공간이 둘로 나눠져 있는 상자를 표현한 제네릭 클래스이다
  - ex. DBox 참고
- 이어서 수납공간이 둘로 나눠져 있는 상자를 표현한 클래스를 DDBox<U,D>라는 이름으로 하나더 정의 하여 
DBox<L,R> 인스턴스 둘을 이상자에 저장하고자 한다.

1. 그럼 다음 main 메소드를 기반으로 컴파일 및 실행이 가능하도록 DDBox<U,D> 제네릭 클래스를 정의해보자
     - ex. Main 참고
    ```
    //출력 결과는 
    Apple & 25
    Orange & 35
    ```
2. DDBOx를 없에고 DBox하나로 출력 결과가 동일하게 출력되게 하라

### 제네릭 클래스의 타입 인자 제한하기
```java
Box<String> box1 = new Box<>();
Box<Apple> box2 = new Box<>();
```
- 이렇게 아무거나 담을 수 있다.  혹시 타입 인자를 제한하고 싶을때에는??
```java
class Box<T extends Number> {...} //Number또는 이를 상속하는 클래스만 오게하기
```
- 이처럼 임의의 인터페이스도 만들어서 타입 인자를 제한 할 수 있다.
