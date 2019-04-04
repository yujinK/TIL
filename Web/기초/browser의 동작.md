### browser의 동작

> Keyword
>
> - Web Browser Rendering



**브라우저 (browser)**

- 브라우저는 월드와이드웹(WWW)에서 정보를 검색, 표현하고 탐색하기 위한 소프트웨어
- 인터넷에서 특정 정보로 이동할 수 있는 주소 입력창이 있고 서버와 HTTP로 정보를 주고 받을 수 있는 네트워크 모듈도 포함
- 서버에서 받은 문서(HTML, CSS, Javascript)를 해석하고 실행하여 화면에 표현하기 위한 해석기(Parser)들을 가짐
- 브라우저마다 서로 다른 엔진을 포함



**Web Browser Rendering**

<img src="https://user-images.githubusercontent.com/42233535/55536841-c4c91700-56f5-11e9-814c-8baff754275c.png">

<사파리 브라우저에서 처리되는 webkit 렌더링엔진의 처리과정>

1) HTML을 해석해서 DOM Tree를 만들고, CSS를 해석해서 CSS Tree(CSS Object Model)을 만듦

2) 1)의 과정에서 Parsing 과정이 필요하며 토큰 단위로 해석되는 방식은 일반적인 소스코드의 컴파일 과정임

3) DOM Tree, CSS Tree는 연관되어 있으므로 Render Tree로 다시 조합

4) 조합된 결과는 화면에 어떻게 배치할지 크기와 위치 정보를 담고 있음

5) Render Tree 정보를 통해서 화면의 어떤 부분에 어떻게 색칠 할 지 Painging과정을 거침

출처 : https://www.edwith.org/boostcourse-web
