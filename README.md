# 프로젝트 설명

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