//3 mini programing challenges in Kotlin
fun main(args: Array<String>) {

    //outputs FIZZ BUZZ WIZZ BOOP LOOP or combinations there of, depending if number is divisible by their key value.
    outputFizzBuzz()

    //Outputs all prime numbers between 1 and 1000
    outputPrimes()

    //Poorly translates to German from random string within array of hashmap dictionary <String, Array<String>>.
    poorTranslate("Hello, my name is Ray and I like tennis!!!")
}


abstract class Random

fun poorTranslate(sentence: String){
    var dictionary = hashMapOf<String, Array<String>>()
    dictionary.put("hello", arrayOf("hallo","guten tag", "moin"))
    dictionary.put("my", arrayOf("meine"))
    dictionary.put("name", arrayOf("name"))
    dictionary.put("is", arrayOf("ist"))
    dictionary.put("and", arrayOf("und"))
    dictionary.put("i", arrayOf("ich"))
    dictionary.put("like", arrayOf("mag", "liebe"))
    dictionary.put("tennis", arrayOf("Tennis"))

    var words = sentence.split(" ")

    for (word in words){
        try {
            var cleanWord = word.toLowerCase().replace("""[^a-zA-Z]""".toRegex(), "")
            var wordArray = dictionary.getValue(cleanWord)
            val randomNum: Int = (0..(wordArray!!.size-1)).shuffled().first()
            print(" " + (wordArray[randomNum]))
            if(word.contains("""[^a-zA-Z]""".toRegex())) print(word.replace("""[a-zA-Z]""".toRegex(),""))
        }catch (e: Exception){
            print(" $word")
        }
    }
}



//Outputs all prime numbers between 1 and 1000
fun outputPrimes(){
    for(i in 2..1000){
        var divisibleCounter = 0
        for(j in i downTo 1){
            if(i%j==0) divisibleCounter++
        }
        if(divisibleCounter == 2) println(i)
    }
}



//outputs FIZZ BUZZ WIZZ BOOP LOOP or combinations there of, depending if number is divisible by their key value.
fun outputFizzBuzz(){
    var hm = hashMapOf<Int,String>()
    hm.put(2,"Fizz")
    hm.put(4,"Buzz")
    hm.put(5,"Wizz")
    hm.put(6,"Boop")
    hm.put(7,"Loop")

    for(i in 1..100){
        print("$i ")
        for(key in hm.keys) {
            if (i % key  == 0) print(hm.get(key))
        }
        println()
    }
}
