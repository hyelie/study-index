# CS

[계획](./plan.md)

## [지식]()
 - [MVC 구조]()
 - [디자인 패턴]()
   - coupling
 - [RESTful API]()
 - [Test-Driven Development]()

## [Object-Oriented Programming](https://hyelie.tistory.com/category/CS/OOP)
 - [객체 지향 프로그래밍](https://hyelie.tistory.com/entry/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-Object-Oriented-Programming)
 - 객체지향 설계 원칙 The SOLID Principles
   - [Single Responsibility Principle](https://hyelie.tistory.com/entry/OOP-SOLID-Single-Responsibility-Principle)
   - [Open Closed Princile](https://hyelie.tistory.com/entry/OOP-SOLID-Open-Closed-Principle)
   - [Liskov Substitution Principle](https://hyelie.tistory.com/entry/OOP-SOLID-Liskov-Substitution-Principle)
   - [Interface Segregation Principle](https://hyelie.tistory.com/entry/OOP-SOLID-Interface-Segregation-Principle)
   - [Dependency Inversion Principle](https://hyelie.tistory.com/entry/OOP-SOLID-Dependency-Inversion-Principle)
   - [SOLID 정리](https://hyelie.tistory.com/entry/OOP-SOLID-%EC%A0%95%EB%A6%AC)
 - [클린 코드 Clean Code](https://hyelie.tistory.com/entry/%EB%8B%A4%EC%8B%9C-%EC%93%B0%EB%8A%94-Clean-Code)
 - [클린 아키텍처 Clean Architecture](https://hyelie.tistory.com/entry/Clean-Architecture-%EC%A0%95%EB%A6%AC)

## [Data Structure]()

## [Network]()

## [Computer SW]()

## [Computer Architecture]()

## [Operating System]()

## [Database]()

# 언어 & 프레임워크

## [Java]()
- [data type, call by value](https://hyelie.tistory.com/entry/Data-types-String-constant-pool-Call-by-value)
  - string pool에 대한 작동 방식
- [class의 사용](https://hyelie.tistory.com/entry/Java-Class)
  - access modifier
  - identity, equality & hashCode
- [static, final](https://hyelie.tistory.com/entry/Java-static-final)
  - static final
- [상속 inheritance](https://hyelie.tistory.com/entry/Java-Inheritance)
  - access modifier에 따른 member 접근 여부
  - super
  - overriding
  - diamond problem
- [다형성 polymorphism](https://hyelie.tistory.com/entry/Java-Polymorphism)
  - static polymorphism(overloading)
  - dynamic polymorphism(overriding)
  - static method의 polymorphism
- [abstract class vs interface](https://hyelie.tistory.com/entry/Java-abstract-class-vs-interface)
  - abstract class
    - 특징과 사용 이유
  - interface
    - 특징과 사용 이유
    - default method와 multiple inheritance
  - abstract class와 interface 사용 목적의 차이
- [exception handling](https://hyelie.tistory.com/entry/Java-Exception-Handling)
  - throwable의 계층구조
    - check / unchecked exception
  - try-catch-finally에서 리턴 처리
  - try-with-resource
  - 예외처리 방법의 종류
- [JVM](https://hyelie.tistory.com/entry/Java-Java-Virtual-Machine)
  - java의 실행 방식
  - JVM 구조
    - 어떤 데이터가 각각의 메모리에 올라가는지
    - instance variable, class variable(static), local variable, parameter는 각각 어디에 올라갈까?
  - main method 실행 시 일어나는 일
  - GC 작동 방식   
- [generic](https://hyelie.tistory.com/entry/Java-Generic)
  - generic의 유의점
  - type 제한
    - `<T>`와 `<?>`의 차이
  - generic의 장점
  - heap pollution
- [primitive wrapper class](https://hyelie.tistory.com/entry/Java-Primitive-Wrapper-Class)
  - wrapper class의 정의와 특징
  - wrapper class의 비교함수, equals()
  - immutable의 중요성
- [String, StringBuffer, StringBuilder](https://hyelie.tistory.com/entry/Java-String-vs-StringBuffer-vs-StringBuilder)
  - 원리와 차이점
- [thread](https://hyelie.tistory.com/entry/Java-Multi-Thread)
  - thread 생성과 실행 방법
    - run()과 start()의 차이
  - runnable과 callable의 차이
  - JVM thread scheduling 규칙
  - JVM thread pool
- [Collection 비교](https://hyelie.tistory.com/entry/Java-Collection)
  - List
    -  ArrayList, LinkedList, Vector, Stack
  - Queue
    - PriorityQueue, ArrayDeque
  - Set
    - HashSet, LinkedHashSet, TreeSet
  - Map
    - HashMap, LinkedHashMap, TreeMap, Hashtable, Properties
- lambda, stream
  - lambda : 식별자 없이 실행가능한 함수이며 함수형 프로그래밍에 사용한다.
  - stream : collection 직접순회는 collection iterator를 받아오고 처리하는 코드를 써야 한다. 그렇지만 stream은 각 요소에서 어떤 처리를 할지만 전달해 주고 처리는 collection 내부에서 일어나며 병렬 처리가 되기 떄문에 더 빠르다.
  - 언제, 왜 쓰는지 정도만이라도 간단하게 알아두자.
- serialize
  - object를 byte[]로 만들어서 외부에서 사용가능하게 만드는 것.

## [Spring]()
 - [JPA와 영속성]()
 - [Spring Properties, Spring Profiles]()

## [MySQL]()
 - [MySQL만의 특징]()

## [Docker]()
 - [도커의 개념, 작동방식]()

## [Git]()
 - [Git의 개념, 작동방식]()
    
</br>
