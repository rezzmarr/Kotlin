fun main(args: Array<String>) {
    val testString = "111101110"
    run(testString)
}



fun run(line: String){
    var report = StringBuilder()
    report.append("{\n")
    var errors = mutableListOf<String>()
    checkLine(line ,errors)
    var errorcounter = 0

    for (error in errors){
        if (errorcounter==0)report.append(error)
        else report.append(",\n$error")
        errorcounter++
    }
    report.append("\n}")

    println(report.toString())
}

fun checkLine(testString: String, errors: MutableList<String>){
   var pos = 0
    for(char in testString){
        pos++
        if (char != '1') errors.add(buildJsonError("Character should be equal to 1", pos, 1))
    }
}



fun buildJsonError(msg: String, pos: Int, length: Int):String{
    var sb = StringBuilder()
    sb.append("\"Error:\" {\n" +
            "\t\"Message\": \"$msg\",\n" +
            "\t\"Position\": \"$pos\",\n" +
            "\t\"Length\": \"$length\"\n" +
            "\t}")

    return sb.toString()
}
