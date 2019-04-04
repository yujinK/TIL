### 웹의 동작 (HTTP 프로토콜 이해)

> Keyword
>
> - HTTP
> - Request 형식
> - Request Method
> - Response 형식
> - 응답 코드



**HTTP (Hypertext Transfer Protocol)란?**

- 팀 버너스리(Tim Berners-Lee)와 그가 속한 팀은 CERN에서 HTML뿐만 아니라 웹 브라우저 및 웹 브라우저 관련 기술과 HTTP를 발명
- HTTP는 서버와 클라이언트가 인터넷상에서 데이터를 주고받기 위한 프로토콜(protocol)
- HTTP/2 버전까지 등장



**HTTP 작동방식**

- HTTP는 서버/클라이언트 모델을 따름
- 장점
  - 불특정 다수를 대상으로 하는 서비스에 적합
  - 클라이언트와 서버가 계속 연결된 형태가 아니기 때문에 클라이언트와 서버 간의 최대 연결 수보다 훨씬 많은 요청과 응답을 처리할 수 있음
- 단점
  - 연결을 끊어버리기 때문에, 클라이언트의 이전 상황을 알 수 없음
  - 이런 특징을 <u>무상태(Stateless)</u>라고 함
  - 정보를 유지하기 위해 Cookie 같은 기술이 등장



**URL (Uniform Resource Locator)**

- 인터넷 상의 자원의 위치
- 특정 웹 서버의 특정 파일에 접근하기 위한 경로 혹은 주소

<img src="https://user-images.githubusercontent.com/42233535/55536237-32744380-56f4-11e9-82a0-4f2893b8157b.PNG">



**HTTP (Hypertext Transfer Protocol)**

- 요청 메서드 : GET, PUT, POST, PUSH, OPTIONS 등

  - 서버에게 요청의 종류를 알려주기 위해 사용
  - GET : 정보를 요청하기 위해 사용 (SELECT)
  - POST : 정보를 밀어넣기 위해 사용 (INSERT)
  - PUT : 정보를 업데이트하기 위해 사용 (UPDATE)
  - DELETE : 정보를 삭제하기 위해 사용 (DELETE)
  - HEAD : (HTTP)헤더 정보만 요청. 해당 자원이 존재하는지 혹은 서버에 문제가 없는지를 확인하기 위해서 사용.
  - OPTIONS : 웹 서버가 지원하는 메서드의 종류를 요청
  - TRACE : 클라이언트의 요청을 그대로 반환. echo 서비스로 서버 상태를 확인하기 위한 목적으로 주로 사용.

- 요청 URI : 요청하는 자원의 위치 명시

- HTTP 프로토콜 버전 : 웹 브라우저가 사용하는 프로토콜 버전

  

출처 : <https://www.edwith.org/boostcourse-web>
