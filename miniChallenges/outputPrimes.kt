fun main(args: Array<String>) {
    //Outputs all prime numbers between 1 and 1000
    outputPrimes()
}




fun outputPrimes(){
    for(i in 2..1000){
        var divisibleCounter = 0
        for(j in i downTo 1){
            if(i%j==0) divisibleCounter++
        }
        if(divisibleCounter == 2) println(i)
    }
}


