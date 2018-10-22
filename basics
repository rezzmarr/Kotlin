class Car {
    var yearOfRegistration = 2015
        set(value) {
            if(value > 2018)
                throw RuntimeException("Not in the future!")
            field = value
            println("Reg year set to $value")
        }
        get(){println("You got the Reg year!")
            return field}

}


fun main(args: Array<String>) {

    val myAge = 29;
    println("Hello world, I am $myAge years old!")

    when(myAge){
        in 0..28 -> println("You are young!")
        29 -> println("You are 29!")
        in 30..100 -> println("You are old!")
    }

    val string = """This is a test.
                    |I want to see how the multi-line string works.
                    |End of msg."""

    println(string.trimMargin())


    val declareRights = if(myAge > 18) "you can vote!" else "You're too young to vote."
    println(declareRights)

    fun greet(name:String, msg: String = "Hi") = println("${msg} $name")
    greet("Ray", "Hello")
    greet("Ray")
    greet(name = "Jeff", msg = "Howdy")

    fun max(vararg numbers: Int) = numbers.reduce {max, e -> if(max>e) max else e }
    println("The largest number in the set is: ${max(1,2)}")
    println("The largest number in the set is: ${max(7,3,9,4)}")

    val values = intArrayOf(4,5,23,2)

    println("The largest number in the set is: ${max(1,2,3,*values,9,2)}")

    for (x in 1..10 step 2){
        println(x)
    }

    for (x in 10 downTo 0 step 5){
        println(x)
    }


    val names = listOf("Tom", "Jerry", "Spike")
    for(index in names.indices){
        println("$index ${names.get(index)}")
    }

    val double = {e: Int -> e*2}
    listOf(1,2,3,4,5,6).filter { e -> e%2 == 0 }
            .map(double).forEach{println(it)}


    //infers the method shout when called from any string.
    fun String.shout() = toUpperCase()
    val greet = "hello"
    println(greet.shout())

    //Compiler really does this:
    fun shout2(x:String) = x.toUpperCase()
    println(shout2(greet))

    val car = Car()
    car.yearOfRegistration = 2018
    println(car.yearOfRegistration)


    val number = 5
    fun doSomething():Int {
        println("Something was done")
        return 10
    }
    val number2 = doSomething()

    if (4 > 8 && number > number2){
        println("Conditions passed!")
    }
    //by lazy does not call the method, unless first condition is passed
    val number3 by lazy {doSomething()}
    if (4 > 8 && number > number3){
        println("Conditions passed!")
    }

}
