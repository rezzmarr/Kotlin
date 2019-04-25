fun main(args: Array<String>) {
    //outputs FIZZ BUZZ WIZZ BOOP LOOP or combinations there of, depending if number is divisible by their key value.
    outputFizzBuzz()
}


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
