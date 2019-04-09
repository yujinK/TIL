# Kotlin

1. Introduction

   1.1. Hello World

   ```kotlin
   package org.kotlinlang.play		//1
   
   fun main() {					//2
       println("Hello, World!")	//3
   }
   ```

   1. 코틀린 코드는 보통 패키지를 선언한다. 패키지 선언은 옵션이다. 만약 아무 것도 명시하지 않으면 default pakage로 선언된다.
   2. 코틀린 애플리케이션은 main 함수에서 시작한다. `코틀린 1.3`에서는 파라미터 없이 main함수를 정의할 수 있다. return type이 명시되지 않으면 아무것도 리턴하지 않는다.
   3. 코틀린에서는 `세미콜론(;)`을 사용하지 않는다.

   ```kotlin
   fun main(args: Array<String>) {	//1
       println("Hello, World!")
   }
   ```

   1. `코틀린 버전 1.3 이하`에서는 main 함수에 반드시 Array<String> 파라미터가 필요하다.

   

   1.2. Functions

   **Default Parameter Values and Named Arguments**

   ```kotlin
   fun printMessage(message: String): Unit {								//1
       println(message)
   }
   
   fun printMessageWithPrefix(message: String, prefix: String = "Info") {	//2
       println("[$prefix] $message")
   }
   
   fun sum(x: Int, y: Int): Int {											//3
       return x + y
   }
   
   fun multiply(x: Int, y: Int) = x * y;									//4
   
   fun main() {
       printMessage("Hello")												//5
       printMessageWithPrefix("Hello", "Log")								//6
       printMessageWithPrefix("Hello")										//7
       printMessageWithPrefix(prefix = "Log", message = "Hello")			//8
       println(sum(1, 2))													//9
   }
   ```

   1. String 파라미터를 가진 간단한 함수. return Unit (리턴값이 없다. 자바에서의 void라고 생각하면 됨. 코틀린은 모든 함수 구현이 반환값을 가지며 return을 명시적으로 쓸수도 생략할수도 있음. 반환이 없는 코드는 Unit을 리턴한다.)
   2. 두 가지의 파라미터와 default value로 Info를 가지는 함수. return Unit
   3. 두 가지의 파라미터를 가지고 x + y를 반환하는 함수. return Integer
   4. single-expression function. return Integer(추론)
   5. argument Hello로 첫 번째 함수 호출
   6. 두 가지 값을 가지고 함수 호출
   7. 두 번째 요소는 생략된 채로 함수 호출. default value인 Info를 사용한다.
   8. arguments의 이름을 사용해서 함수를 호출. arguments의 순서가 바뀜.

   

   **Infix Functions**

   Member functions and extensions with a single parameter can be turned into `infix(중위) functions`.

   ```kotlin
   fun main() {
       infix fun Int.times(str: String) = str.repeat(this)			//1
       println(2 times "Bye ")										//2
       
       val pair = "Ferrari" to "Katrina"							//3
       println(pair)
       
       infix fun String.onto(other: String) = Pair(this, other)	//4
       val myPair = "McLaren" onto "Lucas"
       println(myPair)
       
       val sophia = Person("Sophia")
       val claudia = Person("Claudia")
       sophia likes claudia										//5
   }
   
   class Person(val name: String) {
       val likedPeople = mutableListOf<Person>()
       infix fun likes(other: Person) { likedPeople.add(other) }	//6
   }
   ```

   1. Int로 된 `infix extension function(중위 확장 함수)` 정의
   2. 중위 함수 호출
   3. standard library로 부터 to 중위 함수 호출하여 Pair 생성
   4. to 중위 함수를 onto라는 이름으로 구현
   5. `Infix notation(중위 기호)`는 멤버 함수나 메서드로도 동작
   6. 포함 클래스가 첫 번째 파라미터가 된다

   

   **Operator Functions**

   ```kotlin
   operator fun Int.times(str: String) = str.repeat(this)			//1
   println(2 * "Bye ")												//2
   
   operator fun String.get(range: IntRange) = substring(range)		//3
   val str = "Always forgive your enemies; nothing annoys them so much."
   println(str[0..14])												//4
   ```

   1. 연산자를 사용한 중위함수
   2. times() 연산자 기호인 *를 사용하여 함수 호출을 한다
   3. strings의 범위 접근을 허용한다
   4. get() 연산자는 [] 괄호를 사용한다

   

   **Functions with vararg Parameters**

   콤마(,)로 구분된 여러 개의 arguments(인수)를 사용할 수 있다.

   ```kotlin
   fun printAll(vararg messages: String) {								//1
       for (m in message) println(m)
   }
   printAll("Hello", "Hallo", "Salut", "Hola", "안녕하세요")			//2
   
   fun printAllWithPrefix(vararg messages: String, prefix: String) {	//3
       for (m in message) println(prefix + m)
   }
   printAllWithPrefix(
   	"Hello", "Hallo", "Salut", "Hola", "안녕하세요",
       prefix = "Greeting: "											//4
   )
   
   fun log(vararg entries: String) {
       printAll(*entries)												//5
   }
   ```

   1. 파라미터로 들어온 vararg를 순회한다
   2. 어떤 수의 arguments(인수)를 가지더라도 호출 가능하다
   3. 파라미터에 이름 붙인 덕분에 vararg 이후에 같은 타입을 가진 다른 파라미터를 추가 할 수 있다. Java에서는 값을 넘길 방법이 없기 때문에 허용하지 않는 문법.
   4. 이름 붙인 파라미터를 사용해서 vararg와는 분리된  prefix 값을 설정할 수 있다
   5. 런타임 때, vararg는 array이다. vararg 파라미터는 넘겨주기 위해, 분할 연산자 *를 사용한다. entries(Array<String>) 대신에 *entries(vararg의 String) 사용.

   

   **Variables**

   코틀린은 엄청난 타입 추론을 가지고 있다. 변수의 타입을 정확하게 정의하지 않는 동안 컴파일러가 정의를 추추론한다. 코틀린은 타입 정의를 추천하지만 강요하지는 않는다.

   ```kotlin
   var a: String = "initial"	//1
   println(a)
   val b: Int = 1				//2
   val c = 3					//3
   ```

   1. 변수 a를 선언하고 초기화했다
   2. 상수 b를 선언하고 초기화했다
   3. 상수 c를 선언하고 타입 지정없이 초기화했다. 컴파일러는 타입을 Int라고 추론했다.

   ```kotlin
   var e: Int	//1
   println(e)	//2
   ```

   1. 초기화없이 변수 e를 선언했다
   2. 변수 e를 사용하면 컴파일러 에러가 발생한다. `Variable 'e' must be initialized.`

   ```kotlin
   val d: Int	//1
   
   if (someCondition()) {
       d = 1	//2
   } else {
       d = 2	//2
   }
   
   println(d)	//3
   ```

   초기화 할 변수를 맘대로 선택 할 수 있다. 하지만, 반드시 첫 번째로 읽기 전에 초기화를 해야 한다.

   1. 초기화 없이 변수 d를 선언했다
   2. 조건에 따라 다른 값으로 변수를 초기화 한다
   3. 이미 초기화됐기 때문에 변수 d를 읽을 수 있다

   

   **Null Safety**

   `NullPointerException`의 세계를 제거하려는 노력으로(ㅋㅋㅋ) 코틀린의 변수 타입에는 null을 허용하지 않는다. 만약 null이 될 수 있는 변수라면 타입 끝에 ?를 붙여 null일수도 있다고 선언한다.

   ```kotlin
   var neverNull: String = "This can't be null"
   
   neverNull = null
   
   var nullable: String? = "You can keep a null here"
   
   nullable = null
   
   var inferredNonNull = "The compiler assumes non-null"
   
   inferredNonNull = null
   
   fun strLength(notNull: String): Int {
       return notNull.length
   }
   
   strLength(neverNull)
   strLength(nullable)
   ```

   1. non-null String 변수 선언
   2. non-nullable 변수에 null을 선언하려 할 때, compilation error 발생
   3. nullable String 변수 선언
   4. nullable 변수에 null 정의 가능
   5. 타입을 추론할 때, 컴파일러는 초기화 시키기 위해 non-null로 추론한다
   6. 추론된 타입의 변수에 null을 정의하려 하면 compilation error 발생
   7. non-null String 파라미터를 가진 함수 선언
   8. non-nullale arguments(인수)로 함수 호출 가능
   9. String?(nullable) arguments(인수)로 함수 호출하면 compilation error 발생

   

   **Working with Nulls**

   때때로 코틀린 프로그램이 null값으로 작업해야 할 필요가 있다. 예를 들면 외부의 자바 코드와 작업하거나 완전히 비어있는 상태를 대신해야 할 때. 코틀린은 이런 상황을 다루는 null tracking을 제공한다.

   ```kotlin
   fun describeString(maybeString: String?): String {			//1
       if (maybeString != null && maybeString.length > 0) {	//2
           return "String of length ${maybeString.length}"
       } else {
           return "Empty or null string"						//3
       }
   }
   ```

   1. nullable string을 가져와서 그것을 설명하는 함수
   2. 만약 string이 null이 아니고 비어있지 않으면, 그것의 길이 정보를 return
   3. 그렇지 않다면, string은 비어있거나 null



