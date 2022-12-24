# 프로젝트 설명

### SOLID 원칙
SRP (단일 책임의 원칙)
- 한 클래스는 하나의 책임만 가져야 한다

DIP (의존관계 역전 원칙)
- 추상화에 의존해야지, 구체화에 의존하면 안된다
- 의존성 주입은 이 원칙을 따르는 방법 중 하나이다

OCP (확장-변경 원칙)
- 소프트웨어 요소는 확장에는 열려있으나, 변경에는 닫혀있어야 한다   




### 클래스 설명 
- AppConfig
  - 애플리케이션의 실제 동작에 필요한 구현 객체를 생성한다(관심사 분리)
  - 생성한 객체 인스턴스의 참조(레퍼런스)를 생성자를 통해서 주입(연결)해준다
  - DI(Dependency Injection) : 의존관계/의존성 주입
- MemberService, OrderService
  - 추상화된 회원/주문 비즈니스 로직(인터페이스)
- MemberServiceImpl, OrderServiceImpl
  - MemberService/OrderService의 구체 클래스
  - 회원/주문 기능을 실행하는 역할만 갖는다
- 