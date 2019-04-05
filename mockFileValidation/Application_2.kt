import org.json.JSONObject
import spark.kotlin.*


fun main(args: Array<String>) {
    val http: Http = ignite()
//    port(4567)

    http.get("/test") {
        val testString = "11110111011100001111111011101011111111"
        var htmlReport :String = getHTMLReport(testString)
        return@get htmlReport
    }

}


fun getHTMLReport(line: String):String{
   //val jsonReport = getJSONReport(line)
    var htmlBuilder = StringBuilder()
    var errors = checkTestLine(line)


    var currentPos = 0

    for(error in errors){
        if (error.startPos != currentPos-1){
            htmlBuilder.append(line.substring(currentPos,error.startPos))
            htmlBuilder.append("<font color=\"red\"><span title=\"${error.errorMsg}\"><a>")
            htmlBuilder.append("<b>"+line.substring(error.startPos,error.endPos)+"</b>")
            htmlBuilder.append("</a></span></font>")
        }else{
            htmlBuilder.append("<b>"+line.substring(error.startPos,error.endPos)+"</b>")
        }
        currentPos = error.endPos
    }
    if (currentPos != line.length)htmlBuilder.append(line.substring(currentPos,line.length))

    var htmlResponse = htmlBuilder.toString()
    return htmlResponse
}


fun checkTestLine(testString: String):MutableList<Error>{
    var pos = 0
    var errors = mutableListOf<Error>()
    for(char in testString){
        if (char != '1') errors.add(Error( pos, pos+1, "Value is not 1!" ))
        pos++
    }
    return errors
}

}
