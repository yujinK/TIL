# [JWT] JSON Web Token 소개 및 구조

## JSON Web Token?

- JSON Web Token (JWT)은 웹표준(RFC 7519)으로서 두 개체에서 JSON 객체를 사용하여 가볍고 자가수용적인(self-contained) 방식으로 정보를 안전성있게 전달
- 많은 프로그래밍 언어에서 지원 (대부분의 주류 프로그래밍 언어)
  - C, Java, Python, C++, R, C#, PHP, JavaScript, Ruby, Go, Swift 등
- 자가 수용적 (self-contained)
  - 필요한 모든 정보를 자체적으로 지님
  - 토큰에 대한 기본정보, 전단할 정보, signature 포함
- 쉽게 전달 가능
  - 자가수용적이므로 두 개체 사이에서 손쉽게 전달 가능
  - 웹서버의 경우 HTTP 헤더에 넣어서 전달 / URL의 파라미터로 전달



## JWT의 생김새

<img src="https://velopert.com/wp-content/uploads/2016/12/jwt.png">

- `.`을 구분자로 3가지의 문자열로 구성



### 헤더 (Header)

- 두 가지의 정보를 가짐
  - typ: 토큰의 타입 지정 = JWT
  - alg: 해싱 알고리즘 지정, 보통 `HMAC SHA256, RSA` 사용, 토큰 검증 시 사용되는 signature에서 사용



### 정보 (Payload)

- 토큰에 담을 정보를 가짐

- 정보의 한 '조각'을 클레임(claim)이라고 부르고, name / value의 한 쌍으로 이루어짐, 토큰에 여러개의 클레임 넣기 가능

- 클레임의 종류

  - 등록된 (registered) 클레임

    - 서비스에서 필요한 정보들이 아닌, 토큰에 대한 정보들을 담기위해 이름이 이미 정해진 클레임
    - 등록된 클레임의 사용은 모두 선택적 (optional)
    - 포함된 클레임 이름
      - iss : 토큰 발급자 (issuer)
      - sub : 토큰 제목  (subject)
      - aud : 토큰 대상자 (audience)
      - exp : 토큰의 만료시간 (expiration), 시간은 NumericDate 형식(ex. 1480849147370)으로 되어있어야 하며 언제나 현재시간보다 이후로 설정되어 있어야 함
      - nbf: Not Before, 토큰의 활성 날짜와 비슷한 개념, NumericDate 형식, 이 날짜가 지나기 전까지는 토큰이 처리되지 않음
      - iat: 토큰이 발급된 시간 (issued at), 토큰의 age 판단 가능
      - jti: JWT의 고유 식별자, 중복적인 처리를 방지하기 위해 사용, 일회용 토큰에 사용 시 유용

  - 공개 (public) 클레임

    - 충돌이 방지된 (collision-resistant) 이름을 가지고 있어야 함
    - 충돌 방지를 위해 클레임 이름을 URI 형식으로 지음

  - 비공개 (private) 클레임

    - 양 측간에 (보통 클라이언트 <-> 서버) 협의 하에 사용되는 클레임 이름

    - 공개 클레임과는 달리 이름이 중복되어 충돌될 수 있으니 사용 유의

      

### 서명 (Signature)

- 헤더의 인코딩값, 정보의 인코딩값을 합친 후 주어진 비밀키로 해쉬를 하여 생성





참고 : https://velopert.com/2389