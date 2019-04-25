fun main(args: Array<String>) {

    //Poorly translates to German from random string within array of hashmap dictionary <String, Array<String>>.
    poorTranslate("Hello, my name is Ray and I like tennis!!!")
}

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
