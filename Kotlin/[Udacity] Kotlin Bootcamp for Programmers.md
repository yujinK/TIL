## Kotlin Bootcamp for Programmers - Udacity

1. `val` : unchangeable

   `var` : changeable



2. default not null

   `?` : null

   `!!` : not null

   > but, it's bad idea

   `?:` : elvis operator

   > if value is null, it is set to default value



3. `$val` : print value

   `==` : equals

   `!=` : not equals



4. `if (val in 1..100) something..` : flexible (using range)

   ```kotlin
   //automatically breaks
   when (val) {
       0 -> something..
       in 1..100 -> something..
       else -> something..
   }
   
   //when에서 바로 return 가능
   //when 조건 없이 가능
   return when (val) {
       0 -> something..
       in 1..100 -> something..
       else -> something..
   }
   ```

   

5. `arrayOf()` : Create an array

   > You can create untyped arrays. To print the array you can convert its contents to a string with toString.

   `intArrayOf()` : Create an int array 

   > You can create typed arrays. but, if you another type element it gives you an error.



6. 

   ```kotlin
   //range loop, step
   for (i in 0..100 step 7) something..
   ```

   

7. Start from main function

   ```kotlin
   //fun : function
   //all main() function arguments are Strings
   fun main(args: Array<String>) {
       ...
   }
   ```

   

8. `unit` : no value

   no return = return unit



9. Parameters in Kotlin can have a default value.

   = you don't have to specify a value every time for those parameters.

   ​	if the value is missing, the default value is used.

   ```kotlin
   fun shouldChangeWater(
       day: String,
       temperature: Int = 22,
       dirty: Int = 20
   ) {}
   
   fun feedTheFish() {
       val day = "FRI"
       shouldChangeWater(day, 20, 50) //all arguments
       shouldChangeWater(day) //only the required argument
       shouldChangeWater(day, dirty=50) //required argument and specifying the name of argument
   }
   ```

   * best practice

   - put arguments without defaults first and then ones with the defaults afterwards.



10. `.sum()`

    > This is a way to add up all elements in a list without having to use loops.



11. the return type can be inferred from the function, we don't need it here.

    ```kotlin
    fun isTooHot(temperature: Int) = temperature > 30
    ```

    > Sometimes, you might be tempted to use expensive functions to initialize default parameters.
    >
    > Examples of expensive operations include reading files or allocating a lot of memory.
    >
    > Be careful with this. They can affect the performance of your code quite a bit because default parameters are evaluated at call time by Kotlin.



12. while almost everything in Kotlin is an expression with a value, there are a few exceptions.

    There's no sensible value for while loops or for loops, so they don't have any value.

    If you try to assign a for loop a variable, you'll get an error saying it's a statement.



13. `.filter` 

    ```kotlin
    val decorations = listOf {"rock", "pagoda", "plastic plant", "alligator", "flowerpot"}
    
    println(decorations.filter {it[0] == 'p'})
    ```

    It refers to each element in the list on which we are calling the filter.

    In Kotlin, single quotes designate characters and double-quotes strings and they are not interchangeable like in some languages.

    논리 연산자 사용 가능



14. `sequence`

    > A sequence is a collection that can only look at one item at a time, starting at the beginning and going to end.



15. `Lambda` : use curly braces {}

    ```kotlin
    { println("Hello") }()
    val swim = {println("swim\n")}
    var dirty = 20
    
    //Lambda arguments go on the left hand side of What's called a function arrow.
    //The body of lambda goes after the function arrow.
    val waterFilter = { dirty: Int -> dirty / 2}
    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2}
    
    
    fun feedFish(dirty: Int) = dirty + 10
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }
    
    fun dirtyProcessor() {
        dirty = updateDirty(dirty, waterFilter)
        dirty = updateDirty(dirty, ::feedFish)	//parse it
    }
    ```



16. `class` 

    > Class names by convention start with a capital letter.
    >
    > Kotlin made a getter for all properties even though we didn't write any code.

    ```kotlin
    class Aquarium {
        var width: Int = 20
        var height: Int = 40
        var length: Int = 100
        
        val volume: Int
        	get() {
                return width * height * length / 1000
            } 
        	//or
        	get() = width * height * length / 1000
    }
    ```



17. Visibility

- Package Visibility

  `public` : Default. Everywhere

  `private` : File

  `internal` : Module

  > A module is a set of Kotlin files compiled together.

- Class Visibility

  `public` : Default. Class and public members.

  `private` : Inside class. Subclasses can't see.

  `protected` : Inside class. Subclasses CAN see.



18. Constructors

    ```kotlin
    class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
        val volume: Int
        	get() = width * height * length / 1000
        	set(value) {height = (value * 1000) / (width * length)}
    	constructor(numberOfFish: Int): this() {}
    }
    ```

    > To write good Kotlin code, just use one primary constructor and init blocks.
    >
    > When you need more flexibility, consider adding helper functions.



19. Inheritance -> `open`

    `Any` : The root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass.

    - 모든 객체의 상위객체

    ```kotlin
    //상속하기 위해서 제일 먼저 class open
    open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
        open var volumn : Int
        	get() = width * height * length / 1000
        	set(value) {height = (value * 1000) / (width * length)}
        open var water = volumn * 0.9
        
        constructor(numberOfFish: Int): this() {
            val water = numberOfFish * 2000
            val tank = water + water * 0.1
            height = (tank / (length * width)).toInt()
        }
    }
    
    //상속은 : 뒤에 명시
    class TowerTank(): Aquarium() {
        override var water = volumn * 0.8
        
        override var volumn: Int
        	get() = (width * height * length / 1000 * PI).toInt()
        	set(value) {
                height = (value * 1000) / (width * length)
            }
    }
    ```

    > By default, classes are not subclassible. We have to explicitly allow it.
    >
    > just like classes, members are not available for subclassing by default.



20. abstract class = 추상 클래스

    - We can't make instance of aquarium fish directly.
    - We need to provide sub classes that implement its missing functionally.

    interface

    ```kotlin
    abstract class AquariumFish {
        abstract val color: String
    }
    
    class Shark: AquariumFish(), FishAction {
        override val color = "gray"
        override fun eat() {
            println("hunt and eat fish")
        }
    }
    
    class Plecostomus: AquariumFish(), FishAction {
        override val color = "gold"
        override fun eat() {
            println("munch on algae")
        }
    }
    
    interface FishAction {
        fun eat()
    }
    ```

    `Abstract Classes` VS `Interfaces`

    - Abstract Classes can have constructors and interfaces cannot.

    - Both interfaces and abstract classes can contain implementations of methods. On interfaces, we call them default implementations.

    - The big difference really is in when and how you use them.

      Use an interfaces if you have a lot of methods and one or two default implementations.

      Use an abstract class anytime you can't complete a class.



 - Kotlin let's us declare a class where we can only have one instance by using the keyword "`object`" instead of "class" = Singleton
   	- This will declare a class and make exactly one instance of it.



21. Data Classes

    ```kotlin
    fun makeDecorations() { 
        val d1 = Decorations("granite")
        val d2 = Decorations("slate")
        val d3 = Decorations("slate")
        
        println(d1.equals(d2)) //false
        println(d3.equals(d2)) //true
        
        val d4 : Decorations = d3.copy()
        val d5 = Decorations2("crystal", "wood", "diver")
        
        //cody value
        //대신 타입 동일, 순서 동일
        val (rock: String, wood: String, diver: String) = d5
    }
    
    data class Decorations(val rocks: String) {}
    
    data class Decorations2(val rocks: String, val wood: String, val diver: String) {}
    ```

    - 데이터 보관 목적으로 만든 클래스
    - property - toString(), hashCode(), equals(), copy() 메서드 자동 생성
    - Creating objects that only have properties without additional functionality.



22. Special Purpose Classes

    ```kotlin
    object MobyDickWhale {
        val author = "Herman Melville"	
        fun jump() {
            // ...
        }
    }
    
    enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x000ff);
    }
    
    sealed class Seal
    class SeaLion: Seal()
    class Walrus: Seal()
    
    fun matchSeal(seal: Seal): String {
        return when(seal) {
            is Walrus -> "walrus"
            is SeaLion -> "sea lion"
        }
    }
    ```

    

    1. `object` = Singleton Class

    2. `enum` = enumerate items

       Enums actually define a class and you can give them properties or even methods.

       They are objects that store groups of values that are related. They offer type safety.

    3. `sealed`
    
       It's a class that can be subclassed. but only inside the file which it's declared.
       If you try to subclass it in a different file, you'll get an error. Because the class and subclasses are in the same file, Kotlin will be able to know all subclasses statically. that is at compile time.



23. Pairs
24. Collections
    1. `Map`
       1. get value
          - .get(key)
          - [key]
          - .getOrDefault(key, defaultValue)
          - .getOrElse(key) { }



25. Constants

    <u>Storing simple values without any functionality.</u>

    `val` vs `const val`

    - For both we can assign a value directly. but `const val`, the value is always **determined at compile time.** Well, with `val`, the value that is assigned can be **determined during program execution.**
    - Const val only works at the top level and in classes declared with object not with regular classes declared with class. 

    ```kotlin
    class MyClass {
        companion object {
            
        }
    }
    ```

    - To define constants inside a class, you have to wrap them into a `companion object`.
      - Companion objects are initialized from the static constructor of the containing class, that is, they are created when the object is created.



26. Extension Functions

    ```kotlin
    //1.
    fun String.hasSpaces(): Boolean {
        val found = this.find { it == ' ' }
        return found != null
    }
    //2.
    fun String.hasSpaces(): Boolean = find { it == ' ' } != null
    
    
    class AquariumPlant(val color: String, private val size: Int)
    
    fun AquariumPlant.isRed() = color == "Red"
    fun AquariumPlant.isBig() = size > 50 
    
    fun AquariumPlant?.pull() {
        this?.apply {
            println("removing $this")
        }
    }
    ```

    - statically
      - That is at compile time. And the compiler, it just looks at the type of the variable. So at compile time.
    - public API
      - You should think of them as helper functions that rely only on the public API.
    - receiver nullable
      - `this?`
        - variable used in the body can be null.



27. Generic Classes

    `T` : Generic

    - T doesn't have any bounds.
    - T pass null
      - it's turn out that by default T stands for the nullable any type, the type at the top of the type hierarchy.

    ```kotlin
    open class WaterSupply(var needsProcessed: Boolen)
    
    class TapWater : WaterSupply(true) {
        fun addChemicalCleaner() {
            needsProcessed = false
        }
    }
    
    class FishStoreWater : WaterSupply(false)
    class LakeWater : WaterSupply(true) {
        fun filter() {
            needsProcessed = false
        }
    }
    
    //pass null
    class Aquarium<T>(val waterSupply: T)
    //not pass null, must be nonnull
    class Aquarium<T: Any?>(val waterSupply: T)
    //pass WaterSupply
    class Aquarium<T: WaterSupply>(val waterSupply: T) {
        fun addWater() {
            //standard library function in Kotlin
            check(!waterSupply.needsProcessed) { "water supply needs processed"}
            println("adding water from $waterSupply")
        }
    }
    
    fun genericExample() {
        //1.
        val aquarium = Aquarium<TapWater>(TapWater())
        //2.
        val aquarium = Aquarium(TapWater())
        aquarium.waterSupply.addChemicalCleaner()
        
        val aquarium2 = Aquarium("String")
        println(aquarium2.)
    }
    ```

    Using type hierarchies with generic classes follows a pretty basic pattern that we introduced in the previous segment. There was a lot of material introducing generics, but basically, when you are building them, it boils down to the following steps:

    - Create a type/class hierarchy. The parent is non-specific and the sub-types/subclasses are specializations.
    - There is at least one shared property between the classes/types, and it has a different value depending on the subtype (otherwise, having the sub-types is pointless).
    - We then have a class that uses all the subtypes, and performs different actions depending on what the values of the subtype’s properties are.



28. Generic In and Out

    - in T : only write = Java ? super T
    - out T : only read = Java ? extends T

    - Out types are type parameters that only ever occur in return values of functions, or on Val properties.
    - In types can be used anytime the generic is only used as an argument to functions.
    - In types can only passed into an object. Out types can only be passed out of an object or returned.
    - **Out types can be used as return value, and in types can be used as parameters.**



29. Generic Functions

    **All generic types are only used at compile time by Kotlin.**

    However, at runtime, all the generic types are erased.

    

30. Annotations

    - a means of attaching metadata to code.



31. Labeled Breaks

    - Break is like return but for loops.

    ```kotlin
    fun labels() {
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (i > 10) break@loop
            }
        }
    }
    ```




32. Lambdas Recap

    ```kotlin
    {println("Hello Fish ")}() // Hello Fish kotlin.Unit
    
    val waterFilter = { dirty: Int -> dirty / 2 }
    waterFilter(30) // 15
    
    data class Fish (val name: String)
    val myFish = listOf (Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))
    myFish.filter { it.name.contains("i") }.joinToString(" "){it.name} // Flipper Moby Dick
    ```



33. Higher-Order Functions

    ```kotlin
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    //1.
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }
    //2.a single function
    numbers.map { it.length }.filter { it > 3 }.let(::println)
    
    ```

    `run()` vs `apply()`

    - Run returns the result of executing the lambda while apply returns the object after the lambda has been applied.

    `let()`

    - **The context object** is available as an argument (`it`). **The return value** is the lambda result.
    - `let` can be used to invoke one or more functions on results of call chains. For example, the following code prints the results of two operations on a collection:



33. Inlines

    ```kotlin
    fun main(args: Array<String>) {
        fishExamples()
    }
    
    data class Fish(val name: String)
    
    fun fishExamples() {
        val fish = Fish("splashy")
        
        // without inline an object is created every call to myWith
        myWith(fish.name, object: Function1<String, Unit> {
            override fun invoke(name: String) {
                name.capitalize()
            }
        })
        
        // with inline no object is created, and lambda body is inlined here
        fish.name.capitalize()
    }
    
    inline fun myWith(name: String, block: String.() -> Unit) {
        name.block()
    }
    ```

    - Inline is a promise that every time myWith is called, it will actually transform the source code to inLine, the function.

      That is, the compiler will change the code to replace the Lambda with the instructions inside the Lambda.

    - Zero overhead



34. SAM

    ```kotlin
    //Java
    public class JavaRun {
        public static void runNow(Runnable runnable) {
            runnable.run();
        }
    }
    
    //a lot of code just to call println.
    fun example() {
        val runnable = object: Runnable {
            override fun run() {
                println("I'm a runnable")
            }
        }
        JavaRun.runNow(runnable)
    }
    
    //Kotlin will take care of making the right kind of object for us.
    fun example() {
        JavaRun.runNow {
            println("Passing a lambda as a run")
        }
    }
    ```

    - SAM is an acronym for Single Abstract Method.
    - Basically, SAM just means an interface with one method on it. 