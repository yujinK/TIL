# Python

출처 : https://programmers.co.kr/learn/courses/2



- powershell 명령
  - ls : 현재 디렉토리(폴더)의 내용 확인
  - cd : powershell에서 현재 디렉토리(폴더)를 바꾸는 명령



- print()
  - 괄호 안에 있는 내용을 화면에 출력
  - 화면에 표시하고 싶은 글은 따옴표('')로 묶어서 표현



- 변수
  - 파이썬은 변수를 선언하는 명령이 없고 이름을 정의하고 처음 값을 할당할 때 변수가 만들어짐
  - 선언 이후 다른 자료형으로 수정도 가능



- 주석
  - `#` 한 줄 주석
  - `""" """` 여러 줄 주석 (따옴표 3개로 감싸기)



- 숫자와 문자열
  - 숫자
    - 숫자 계산 가능 (더하기 +, 곱하기 *, 나누기 /, 거듭제곱 **, 나머지 %)
  - 문자열
    - 따옴표로 감싸진 글
    - 텍스트는 더하기만 가능 (+ 로 문자열 이어붙이기 가능)



- REPL
  - Powershell에서 파일 이름 없이 python이라고만 입력하면 나오는 창
  - 파이썬 코드를 한 줄씩 입력해 가면서 테스트 해 볼 수 있는 입력창
  - 종료 : exit()



- Shell 사용법
  - Shell 명령어
    - pwd : 현재 폴더 경로 출력
    - ls : 현재 폴더 내용물 출력
    - cd <폴더명> : 다른 폴더로 이동
      - cd .. : 상위 폴더로 이동
    - cp : 파일을 다른 이름으로 복사
    - rm : 파일 삭제
  - 파일이름 자동완성
    - 앞 1~2글자 입력 후 tab키를 누르면 자동 완성



- if문

  ``````python
  if people > apple:
      print('사람이 너무 많아! 몇 명은 못먹겠네')
  ``````

  - if : 조건문 시작 (조건은 참/거짓 판단 가능한 조건)
  - : 조건의 끝을 표현
  - 실행하고자 하는 코드는 tab키로 들여쓰기
  - True, False : 첫글자 대문자



- 조건식
  - 조건
    - 숫자비교 (<, >, <=, >=, ==, !=)
  - boolean 연산
    - and : 두 조건이 모두 참인지 체크
    - or : 두 조건 중 하나라도 참인지 체크
    - not : true/false 뒤집기



- 블럭

  1. 함께 실행되는 하나의 코드 덩어리
  2. 들여쓰기로 블럭 구분
  3. 들여쓰기가 어긋나면 오류 발생
  4. 블럭 안에 다른 블럭이 들어갈 수 있음
  5. 내부의 블럭은 외부의 블럭에 종속적
  6. 파이썬 코드 전체를 하나의 블럭으로 볼 수 있다

  ** 다른 언어처럼 괄호 사용하지 않음



- if else

  - else

    - if의 조건이 맞지 않는 경우 항상 실행
    - 반드시 if 뒤에 나와야 함

    ``````python
    if mine == yours:
        result = DRAW
    else:
        result = '이기거나 지거나'
    ``````

    

  - elif

    - else와 if의 결합
    - 조건이 맞지 않는 경우 다른 경우를 검사
    - 기능의 차이가 아닌 보이는 것의 차이

    ``````python
    if mine == SCISSOR:
        result = '가위'	# 조건이 참일 때
    elif mine == ROCK:
        result = '바위'	# 다른 조건이 참일 때 실행
    else:
        result = '나머지'	# 조건이 거짓일 때
    ``````

    

- 함수

  1. 함수는 코드의 덩어리에 이름을 붙인 것
  2. 새 함수를 정의할 수 있다
  3. print는 미리 만들어진 함수
  4. 함수를 한 번 만들고 나면, 그 안은 잊어버려도 좋다

  ``````python
  def function():				# 함수의 정의
      print('안녕, 함수!')
  print('첫줄 실행')
  function()					# 함수의 호출
  print('끝줄 실행')
  ``````



- 매개변수

  - 매개변수
    - 함수를 정의할 때 사용하는 이름
  - 실행 인자
    - 함수를 실행할 때 넘기는 변수, 값
  - 매개변수와 실행 인자
    - 매개변수와 실행 인자의 개수는 동일해야 함
    - 여러 개일 경우 쉼표(,)로 구분

  ``````python
  def print_round(number):		# 함수의 정의
      rounded = round(number)
      print(rounded)
      
  print_round(4.6)				# 함수의 호출
  print_round(2.2)
  ``````

  

- 함수의 값

  - return을 이용해 값을 돌려줄 수 있다

    ``````python
    def add_10(value):
        result = value + 10
        return result
    n = add_10(5)
    print(n)
    ``````

    

  - 여러 값 반환

    - return 뒤에 여러 값을 쉼표로 구분해서 값을 보내고, 받을 때도 쉼표로 구분하여 받는다



- format

  - 문자열.format()

    - 문자열의 중괄호 자리에 format 뒤의 괄호 안에 들어있는 값을 하나씩 넣는다

    - 문자열에 포함된 중괄호 개수 보다 format 안에 들어 있는 값의 수가 많으면 정상 동작

      ``````python
      print('{} 번 손님'.format(number, greeting))
      ``````

    - 문자열에 포함된 중괄호 개수 보다 format 안에 들어 있는 값의 수가 적으면 에러

      ``````python
      print('{} 번 손님 {}'.format(number))
      ``````



- 문자열

  - ' 또는 " 로 글의 양쪽을 감싸면 문자열로 인식
  - ' 로 감싼 문자열 안에는 " 를 쓸 수 있다
  - " 로 감싼 문자열 안에는 ' 를 쓸 수 있다
  - 따옴표/큰따옴표 3개로 문자열을 만들면 줄 바꿈도 인식 가능

  ``````python
  string1 = '따옴표로 싼 문자열 안에는 큰따옴표(")를 사용할 수 있다.'
  string2 = "큰따옴표로 싼 문자열 안에는 따옴표(')를 사용할 수 있다."
  string3="""줄도 바꾸고
  큰따옴표"와 따옴표'를 마음대로 쓸 수 있음"""
  ``````



- 정수와 실수

  - 정수

    - int로 표현

    - 정수끼리 더하기, 곱하기, 빼기 = 정수

    - 정수끼리 나누면 실수가 나올 수 있으나, 나눗셈의 몫만을 구하려면 // 연산자를 이용

      ``````python
      a = 5//3 #계산결과 a=1
      ``````

    - 실수를 정수로 바꾸려면 int를 이용

      - a = int(5.4) 라고 하면 a는 5를 값으로 가짐

  - 실수

    - 부동소수점이라는 표현법을 이용해 소숫점을 표시할 수 있는 숫자

    - 계산에 있어서 완벽한 정확성은 가지지 않음

      ``````python
      0.1+0.1+0.1 == 0.3 #FALSE
      ``````

    - 정수를 실수로 바꾸려면 float를 이용
      
      - a=float(5) 라고 하면 a는 5.0을 값으로 가짐

 

- 사용자 입력 받기

  - 프로그래밍의 3단계

    - 사용자 입력
    - 자료 처리
    - 결과 출력

  - input()

    - 사용자의 키보드 입력을 return

      ``````python
      print('가위 바위 보 중 하나를 내주세요> ', end = ' ')
      mine = input()
      print('mine:', mine)
      ``````

    - 간단한 print 기능 내장

      ``````python
      mine = input('가위 바위 보 중 하나를 내주세요> ')
      print('mine:', mine)
      ``````



- List

  - 여러 개의 값을 담을 수 있는 변수

    ``````python
    list1 = [1,2,3,4,5]
    ``````

  - 값 읽어오기
    - index 0부터 시작
    - 첫 번째 값 : list1[0]
    - 두 번째 값 : list1[1]
    - 뒤에서 첫 번째 값 : list1[-1]
    - 뒤에서 두 번째 값 : list1[-2]
    - 리스트에 들어있는 값 보다 큰 값을 읽어오려고 하면 에러
      - 위의 list1에서 list1[5] 또는 list1[-6]은 에러
  - 값 쓰기
    
    - 변수와 같이 list1[0] = 10 이라고 하면 list의 첫 번째 값이 10으로 변경
  - 리스트의 길이
    
    - len 함수 이용 : len(list1)



- 리스트 수정

  - 리스트에 새로운 값 추가
    - append 함수 사용
      - list1.append(4)
    - 뒤에 새로운 리스트를 더하기
      - list2 = list1 + [4]
      - list1은 그대로 두고, 새로운 리스트를 만들어 냄
    - 리스트끼리 더하기
      - list3 = list1 + list2

  - 리스트에 값이 들어있는지 확인하는 방법

    - in 연산 이용

      ``````python
      n = 12
      if n in list1:
          print('{}가 리스트에 있다.'.format(n))
      ``````

  - 리스트에서 필요 없는 값 지우는 방법
    - del을 이용해 특정 위치의 값 지우기
      - del list1[10] 리스트의 10번째 값을 지워라
    - remove를 이용해서 특정 값을 지우기
      - list1.remove(40) 을 하면 리스트에 40이라는 값이 있는 경우 삭제
      - 여러 개의 값이 있는 경우 가장 앞에 있는 하나만 지워짐



- for in list

  - for in 반복문

    - 코드를 필요한만큼 반복해서 실행

    ``````python
    for pattern in patterns:
        print(pattern)
    ``````

    

- for in range

  - range 함수

    - 필요한 만큼의 숫자를 만들어내는 유용한 기능

    ``````python
    for i in range(5):
        print(i)
    ``````

  - enumerate

    - 리스트가 있는 경우 순서와 리스트의 값을 전달하는 기능

    ``````python
    names = ['철수', '영희', '영수']
    for i, name in enumerate(names):
        print('{}번: {}'.format(i + 1, name))
    ``````

    

- 모듈 사용하기

  - 모듈

    - 미리 만들어진 코드를 가져와 쓰는 방법

    - import 모듈이름

    - 사용 방법 : 모듈이름.모듈 안 구성요소

      ``````python
      math.pi
      random.choice()
      ``````

      

- 모듈 만들기
  1. 사용할 함수, 메소드 코드를 작성한 모듈 파일을 생성
  2. 모듈이 쓰일 파일에 import를 사용하여 모듈을 호출
  3. 사용 방법은 기존 모듈과 동일
  4. 주의할 점은 사용자가 만든 모듈과 모듈을 쓸 파일이 같은 폴더에 있어야 함



- 딕셔너리

  - 여러 값을 저장해 두고 필요한 값을 꺼내 쓰는 기능
  - key를 이용하여 value를 꺼내 사용
  - 사용할 때는 리스트와 비슷한 방식
  - 딕셔너리명 = { 'key1' : 'value1', 'key2' : 'value2', ... }

  ``````python
  wintable = {
      '가위' : '보',
      '바위' : '가위',
      '보' : '바위',
  }
  
  print(wintable['가위'])
  ``````

  

- 딕셔너리 수정하기
  - 추가
    - dict['three'] = 3
  - 수정
    - dict['one'] = 11
  - 삭제
    - del(dict['one'])
    - dict.pop('two')



- 딕셔너리와 반복문

  - 경우에 따라 가져올 값을 정할 수 있다

    ``````python
    for key in ages.keys():	# keys() 생략 가능
        print(key)
    ``````

    ``````python
    for value in ages.values():
        print(value)
    ``````

  - key, value 둘 다 가져올 수 있다

    ``````python
    for key, value in ages.items():
        print('{}의 나이는 {} 입니다'.format(key, value))
    ``````

  - 딕셔너리는 <u>**값의 순서를 지키지 않는다**</u>



- 리스트와 비교

  - 공통점

    |           |       List       |          Dictionary           |
    | :-------: | :--------------: | :---------------------------: |
    |   생성    | list = [1, 2, 3] | dict = { 'one': 1, 'two': 2 } |
    |   호출    |     list[0]      |          dict['one']          |
    |   삭제    |   del(list[0])   |       del(dict['one'])        |
    | 개수 확인 |    len(list)     |           len(dict)           |
    |  값 확인  |    2 in list     |     'two' in dict.keys()      |
    | 전부 삭제 |   list.clear()   |         dict.clear()          |

  - 차이점

    |      |                          List                          |                    Dictionary                    |
    | :--: | :----------------------------------------------------: | :----------------------------------------------: |
    | 순서 | 삭제 시 순서가 바뀌기 때문에 인덱스에 대한 값이 바뀐다 | key로 값을 가져오기 때문에 삭제 여부와 상관 없다 |
    | 결합 |                     list1 + list2                      |               dict1.update(dict2)                |

    

- 튜플 만들기

  - 튜플

    - <u>한 번 정해진 순서를 바꿀 수 없다</u>

    - 튜플 선언

      ``````python
      tuple1 = (1, 2, 3, 4)
      tuple2 = 1, 2, 3, 4
      
      mylist = [1, 2, 3, 4]
      tuple3 = tuple(mylist)	# 리스트로 튜플 만들기 가능
      ``````

    - 튜플은 <u>**값의 변경과 삭제가 불가능**</u>



- packing, unpacking (튜플을 사용)

  - packing
    - 하나의 변수에 여러 개의 값을 넣는 것
  - unpacking
    - 패킹된 변수에서 여러 개의 값을 꺼내오는 것

  ``````python
  c = (3, 4)
  d, e = c	# c의 값을 unpacking하여 d, e에 값을 넣음
  f = d, e	# 변수 d와 e를 f에 패킹
  ``````



- 튜플의 활용

  - 두 변수의 값을 바꿀 때 임시변수가 필요 없다

    ``````python
    x, y = y, x
    ``````

  - **함수의 리턴 값으로 여러 값을 전달할 수 있다**

    ``````python
    return 1, 2
    ``````



- 튜플을 이용한 함수의 리턴값

  - 튜플 리스트 활용

    ``````python
    for a in enumerate(list):
        print('{}번째 값: {}'.format(a[0], a[1]))
        
    for a in enumerate(list):
        print('{}번째 값: {}'.format(*a))	# *가 붙으면 튜플을 쪼개라는 의미
    ``````

  - 튜플 딕셔너리 활용

    ``````python
    for a in dict.items():
        print('{}의 나이는: {}'.format(a[0], a[1]))
        
    for a in dict.items():
        print('{}의 나이는: {}'.format(*a))
    ``````

    

- while문

  - 조건이 참인 경우 계속 실행하는 반복문

    ``````python
    while selected not in ['가위', '바위', '보']:
        selected = input('가위, 바위, 보 중에 선택하세요>')
    ``````

  - for 반복문으로 작성한 코드는 while 반복문으로 작성 할 수 있다



- break
  - 반복문을 종료시키는 기능
  -  for, while 사용 가능



- continue
  - 반복문의 나머지 부분을 보지 않고, 반복문의 처음으로 돌아가는 기능
  - for, while 사용 가능



- try except

  - 예외 처리

    ``````python
    try:
        # 에러가 발생할 가능성이 있는 코드
    except Exception:	# 에러 종류
        # 에러가 발생했을 경우 처리할 코드
    ``````

  - 경우에 따라 예외 처리 대신 if else 사용 가능

  - 예외 이름을 모르는 경우

    ``````python
    try:
        # 에러가 발생할 가능성이 있는 코드
    except Exception as ex: # 에러 종류
        print('에러가 발생했습니다', ex) # ex는 발생한 에러의 이름을 받아오는 변수
    ``````

    

- raise
  - 예외 발생
  - 사용자가 직접 에러를 발생시키는 기능
  - raise Exception # 에러 종류
  - 많이 사용하면 코드를 읽기 어려워짐



- 논리연산
  - and
  - or
  - 단락평가
    - 논리연산에서 코드의 앞만 보고 값을 정할 수 있는 경우 뒤는 보지 않고 값을 결정
    - 복잡한 코드를 단순하게 하는 방식



- bool 값과 논리연산
  - true
    - 숫자 0을 제외한 모든 수
    - 빈 딕셔너리, 빈 리스트를 제외한 모든 딕셔너리, 리스트
    - 빈 문자열을 제외한 모든 문자열
  - false
    - 아무 값도 없다는 의미인 None



- List의 다양한 기능
  - list.index(value) : 값을 이용하여 위치를 찾는 기능
  - list.extend([value1, value2]) : 리스트 뒤에 값을 추가
  - list.insert(index, value) : 원하는 위치에 값을 추가
  - list.sort() : 값을 순서대로 정렬
  - list.reverse() : 값을 역순으로 정렬



- List와 String
  - 리스트와 문자열은 유사
  - 서로 변환이 가능
  - list = str.split() : 문자열에서 리스트로 (split() : 공백을 기준으로 자름)
  - " ".join(list) : 리스트에서 문자열로



- Slice

  - slicing
    - 리스트나 문자열에서 값을 여러 개 가져오는 기능

  ``````python
  text = "hello world"
  text = text[ 1:5 ]
  
  list = [ 0, 1, 2, 3, 4, 5 ]
  list = list [ 1:3 ]
  ``````

  - slice를 하면 해당하는 부분의 리스트나 문자열을 새로 만들어 준다
  - 시작과 끝부분을 얻어 오는 방법
    - list[ 2: ] : 2번째부터 끝까지 반환
    - list[ : 2] : 처음부터 2번째까지 반환
    - list[ : ] : 처음부터 끝까지 전부 반환
  - step
    - slice한 값의 범위에서 step 값을 주어 그 값만큼 건너뛰어 가져오는 기능
    - list[시작값:끝값:step]
    - 음수 step의 경우 시작값 > 끝값이어야 함
  - 삭제
    - del list[ :5 ] : 처음부터 5번째까지 삭제
  - 수정
    - list[ 1:3 ] = [ 77, 88 ]
    - list[ 1:3 ] = [ 77, 88, 99 ] : 더 많은 개수로 변환
    - list[ 1:4 ] = [ 8 ] : 더 적은 개수로 변환



- 자료형
  - type(변수명) : 자료형
  - isinstance(값, 자료형) : 자료형 검사



- 클래스
  - 함수나 변수들을 모아 놓은 집합체



- 인스턴스
  - 클래스에 의해 생성된 객체
  - 인스턴스 각자 자신의 값을 가지고 있다



- 클래스 선언

  ``````python
  class Human():
      '''사람'''
  ``````



- 인스턴스 생성

  ``````python
  person1 = Human()
  person2 = Human()
  ``````

  - 클래스와 인스턴스를 이용하면 데이터와 코드를 사람이 이해하기 쉽게 포장할 수 있다



- 모델링(modeling)
  - 클래스로 현실의 개념을 표현하는 것



- 메소드(Method)

  - 함수와 비슷
  - 클래스에 묶여서 클래스의 인스턴스와 관계되는 일을 하는 함수

  ``````python
  class Human():
      '''인간'''
      def create(name, weight):
          person = Human()
          person.name = name
          person.weight = weight
          return person
      
      def eat(self):
          self.weight += 0.1
          print("{}가 먹어서 {}kg이 되었습니다".format(self.name, self.weight))
          
  	def walk(self):
          self.weight -= 0.1
          print("{}가 걸어서 {}kg이 되었습니다".format(self.name, self.weight))
          
  person = Human.create("철수", 60.5)
  person.eat()
  ``````

  - self
    - 메소드의 첫번째 인자
    - 인스턴스에 매개변수를 전달할 때는 self 매개변수를 생략하고 전달



-  초기화 함수

  - `__init__` : 인스턴스를 만들 때 실행되는 함수

- 문자열화 함수

  - `__str__` : 인스턴스 자체를 출력할 때의 형식을 지정해주는 함수

  ``````python
  class Human():
      '''인간'''
      def __init__(self, name, weight):
          '''초기화 함수'''
          self.name = name
          self.weight = weight
          
  	def __str__(self):
          '''문자열화 함수'''
          return "{} ( 몸무게 {}kg )".format( self.name, self.weight )
      
  person = Human("사람", 60.5)	# 초기화 함수 사용
  print(person)	# 문자열화 함수 사용
  ``````

  

- 상속(Inheritance)

  - 부모 클래스
    - 상속하는 클래스
  - 자식 클래스
    - 상속받는 클래스
  - 자식 클래스가 부모 클래스의 내용을 가져다 쓸 수 있는 것

  `````python
  class Animal():
      def walk(self):
          print("걷는다")
  
  	def eat(self):
          print("먹는다")
          
  class Human(Animal):
      def wave(self):
          print("손을 흔든다")
          
  class Dog(Animal):
      def wag(self):
          print("꼬리를 흔든다")
  `````

  

- 오버라이드(Override)

  - 같은 이름을 가진 메소드를 덮어 쓴다

  ``````python
  class Animal():
      def greet(self):
          print("인사한다")
          
  class Human(Animal):
      def greet(self):
          print("손을 흔든다")
          
  class Dog(Animal):
      def greet(self):
          print("꼬리를 흔든다")
  ``````



- super()

  - 자식클래스에서 부모클래스의 내용을 사용하고 싶은 경우
  - super().부모클래스내용

  ``````python
  class Animal():
      def __init__(self, name):
          self.name = name
          
  class Human(Animal):
      def __init__(self, name, hand):
          super().__init__(name)
          self.hand = hand
          
  person = Human("사람", "오른손")
  ``````

  

- 예외 정의

  - 사용자가 직접 예외처리를 하면 코드의 직관성을 높일 수 있다
  - 파일을 하나 만들어 예외를 정의 (사용 : `from 파일명 import 클래스명`)
  - Exception 클래스를 상속받아 만든다

  ``````python
  try:
      sign_up()
  except BadUserName:
      print("이름으로 사용할 수 없는 입력")
  except PasswordNotMatched:
      print("입력한 패스워드 불일치")
  ``````

  

- List Comprehension
  - 파이썬의 유용한 도구
    - [ i*i for i in range(1,11) ]	# [ 계산식 for문 ]
    - [ i*i for i in range(1,11) if i % 2 == 0 ]   # [ 계산식 for문 조건문 ]
    - [ (x, y) for x in range(15) for y in range(15) ]   # [ 계산식 for문 for문 ]



- Dictionary Comprehension
  - 파이썬의 유용한 도구
    - { "{}번".format(number):name for number, name in enumerate(students) }   # [ 형식 for문 ]
    - { student:score for student, score in zip(students, scores) }  
      - zip은 두 개 이상의 리스트나 스트링을 받아서 인덱스에 맞게 자료를 묶어주는 역할



- datetime 모듈
  - 날짜와 시간을 사용하게 해주는 라이브러리
  - 뺄셈(-) 연산 지원 = timedelta
    - days
    - seconds



- timedelta 클래스
  - 시간의 연산을 가능하게 해주는 클래스
  - datetime과 timedelta 연산 가능