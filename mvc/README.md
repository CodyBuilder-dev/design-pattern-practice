# MVC 패턴
## JSP 1 패턴
### JSP 1 패턴의 기술요소
- HTML/CSS/JavaScript
- Java
- JSP
- DBMS와 DBMS를 Java에서 사용하는 법

### JSP 1 패턴 동작 설명
- JSP란, HTML 내에 Java 코드를 입력하여 동작시킬 수 있도록 하는 기술
- 사용자에게 외부 표시용 JSP(=View + Controller)를 노출시킨다
- Request/Response는 해당 JSP에서 처리한다
- JSP는 자바 Bean(=Model)을 동작시켜 DB에 접근하여 데이터를 받아오도록 시킨다
- Model은 DB에 접근하여 데이터를 받아오고, 이를 JSP에 표기하여 사용자에게 보여준다

### JSP 1 패턴 장단점
|장점|단점|
|--|--|
|1. 완만한 러닝 커브 : Java랑 HTML만 알면 날코딩으로 페이지 생성 가능|1. 유지보수의 어려움 : JSP 파일 내에 HTML코드와 Java코드가 한곳에 엉켜있어 관리가 쉽지 않음|

## JSP2(=MVC) 패턴
### JSP 2 패턴 동작 설명
- 사용자에게 외부 표시용 JSP(=View)를 노출시킨다
- 외부 JSP로부터 들어온 Request/Response는 내부의 Servlet(=Controller) 역할을 하는 Java파일에서 처리한다
- Servlet는 자바 Bean(=Model)을 동작시켜 DB에 접근하여 데이터를 받아오도록 시킨다
- Model은 DB에 접근하여 데이터를 받아오고, 이를 Dispatcher가 다시 View에 Forward한다
- View는 데이터를 받아 사용자에게 표기해준다
### JSP 2패턴 설정파일
- JSP <-> Java간의 연결은 Web.xml파일에 설정할 수 있다

### JSP 2 패턴 장단점
|장점|단점|
|--|--|
|1. 유지보수의 편의성 : HTML은 HTML대로, Java는 Java대로 잘 나뉘어져 있어서 유지보수의 편의성|1. 추가적인 설정으로 인한 증가된 러닝커브 : HTML 과 Java를 이어주는 역할을 프로그래머가 직접 설정해야 함|

## FE/BE 구조
### FE/BE 구조 동작 설명
- Frontend는 HTML/CSS/JavaScript 파일만 처리
- Backend는 Java Servlet 파일만 처리
- FE/BE간의 통신방식을 통해 데이터 전달

### FE/BE 구조 장단점
|장점|단점|
|--|--|
|1. 유지보수의 편의성 : 역할별로 잘 나뉘어져 있어서 유지보수의 편의성|1. 협업의 난이도 증가 : FE/BE간 기술스택이 현격히 구분되므로 의사소통 및 협업의 어려움이 증가됨|
|2. 기술심화 가능 : 각 파트별로 자신이 맡은역할만 집중할 수 있으므로 고품질의 코드 적용 가능|2. 증가된 러닝 커브 : Ajax,Spring등의 추가적인 기술 학습이 필요|

## Spring MVC
### Spring MVC 구조 동작 설명
![](https://www.egovframe.go.kr/wiki/lib/exe/fetch.php?media=egovframework:rte:ptl:springmvcstructure.jpg)
- Dispatcher Servlet Java파일이 Request 수신
- HandlerMapping Java파일에 Controller 명 검색
- HandlerAdapter에 요청하여 Controller 호출
- HandlerAdapter는 DO와 View의 이름을 Dispatcher Servlet에 반환
- 해당 View이름을 ViewResolver에 검색 요청
- View에 DO를 넘겨줘 Response를 생성
- 해당 Response를 사용자에게 반환

### Spring MVC 설정
- Maven POM.xml
- IoC 컨테이너, Dispatcher Servlet을 정의하는 WEB.xml
- IoC 컨테이너의 상세 설정을 저장하는 applicationcontext.xml
- Dispatcher Servlet의 상세 설정을 저장하는 dispatcher-servlet.xml

### Spring MVC 장단점
|장점|단점|
|--|--|
|1. IoC/AOP의 장점 : 잡다한 기능 없이 비즈니스 로직에만 집중할 수 있게 해 줌|1. 설정으로 인한 급격한 러닝 커브 : AOP,IoC 등의 강력한 기능을 쓰기 위해선 그만큼 설정해야 할 것이 너무 많음|