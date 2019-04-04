### WAS

> Keyword
>
> - WAS (Web Application Server)
> - Apache Tomcat



**클라이언트/서버 구조**

클라이언트(Client)는 서비스(Service)를 제공하는 서버(Server)에게 정보를 요청하여 응답 받을 결과를 사용

<img src="https://user-images.githubusercontent.com/42233535/55538246-f7c0da00-56f8-11e9-8b8e-2e47825f867d.png">



**DBMS (DataBase Management System)**

다수의 사용자가 데이터베이스 내의 데이터에 접근할 수 있도록 해주는 소프트웨어



**미들웨어 (MiddleWare)**

클라이언트 쪽에 비즈니스 로직이 많을 경우, 클라이언트 관리(배포 등)로 인해 비용이 많이 발생하는 문제가 있음

비즈니스 로직을 클라이언트와 DBMS 사이의 미들웨어 서버에서 동작하도록 함으로써 클라이언트는 입력과 출력만 담당하도록 함

<img src="https://user-images.githubusercontent.com/42233535/55538412-5dad6180-56f9-11e9-85cc-7d464e7ce2f2.PNG">



**WAS (Web Application Sever)**

WAS는 <u>일종의 미들웨어</u>로 웹 클라이언트(보통 웹 브라우저)의 요청 중 웹 애플리케이션이 동작하도록 지원하는 목적

<WAS가 가지는 중요한 기본 기능>

1) 프로그램 실행 환경과 데이터베이스 접속 기능 제공

2) 여러 개의 트랜잭션(논리적인 작업 단위) 관리

3) 업무를 처리하는 비즈니스 로직 수행

<img src="https://user-images.githubusercontent.com/42233535/55538794-3014e800-56fa-11e9-9761-08a3d08dac01.PNG">



**웹 서버 vs WAS**

- WAS도 보통 자체적으로 웹 서버 기능을 내장
- 현재는 WAS가 가지고 있는 웹 서버도 정적인 콘텐츠를 처리하는 데 있어서 성능상 큰 차이가 없음
- 규모가 커질수록 웹 서버와 WAS 분리
- 자원 이용의 효율성 및 장애 극복, 배포 및 유지보수의 편의성을 위해 웹 서버와 WAS를 대체로 분리
- cf. ) 웹 서버가 WAS 앞단에서 동작하면 좋은 이유
  - 웹 서버는 상대적으로 WAS보다 간단한 구조로 만들어짐
  - WAS를 재시작해야 되는 경우가 생겼을 때, 앞단의 웹 서버에서 먼저 해당 WAS를 이용하지 못하게 하고 WAS를 재시작한다면 해당 웹 애플리케이션을 사용하는 사람은 WAS의 문제 발생을 모르고 이용 가능 = **장애 극복 기능**



출처 : <https://www.edwith.org/boostcourse-web>
