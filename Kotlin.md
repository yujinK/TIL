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



