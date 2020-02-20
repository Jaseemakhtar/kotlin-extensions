import java.util.regex.Pattern
test()
fun test(){
    val urls = listOf(
        "https://www.youtube.com/watch?v=My2FRPA3Gf8",
        "http://youtu.be/My2FRPA3Gf8",
        "http://youtube.com/watch?v=My2FRPA3Gf8",
        "https://m.youtube.com/watch?v=My2FRPA3Gf8",
        "ftp://youtube.com/watch?v=My2FRPA3Gf8",
        "https://m.youtube.com/"
    )
    val regexString = "(http:|https:)//(www.|m.)?(youtu(be.com|.be|be.googleapis.com))/(watch\\?v=|v/)?([a-z0-9._%-]*)"
    val regexString2 = "(http:|https:)\\/\\/(www.|m.)?(youtube.com|youtu.be)\\/(watch\\?v=|v\\/)?([a-z0-9._%-]{11})\\&?"
    val regexString3 = "(http:|https:|)\\/\\/(www\\.|m\\.)?(youtube\\.com|youtu\\.be)\\/(watch\\?v=|v\\/)?([A-Za-z0-9._%-]{11})(\\&\\S+)?"
    val regex = Regex(regexString3)

    /*val pattern = Pattern.compile(regexString)
    val matcher = pattern.matcher(urls[1])

    val groupCount = matcher.groupCount()
    println(groupCount)
    while(matcher.find()){
        for(i in 0 until groupCount){
            println("Group($i): ${matcher.group(i)}")
        }
    }*/
   /* urls.forEach { url ->
        val found = regex.findAll(url)
        println(found.count())
        found.forEach { f ->
            val m = f.value
            println(m)
        }
    }*/
    println()
    urls.forEach { url ->
        //println("${url.matches(regex)}")
        if(url.matches(regex)){
            val match = regex.find(url)
            if(match != null) {
                val videoId = match.groups[5]
                if(videoId != null){
                    println(url.substring(videoId.range))
                }
            }
        }else{
            println("didn't matched")
        }
    }
    println()
    /*val found = regex.findAll(urls[6])

    found.forEach { f ->
        println(f.value)
    }

    val vals = mutableListOf<String>()
    val matcher = Pattern.compile(regexString).matcher(urls[5])
    println(matcher.groupCount())
    //println(matcher.group(1))
    println(vals)*/
}
