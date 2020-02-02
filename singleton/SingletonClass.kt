class SingletonClass {
    var name: String = "Myself singleton"

    private constructor(){
        println()
        println("constructor -> $name")
    }

    companion object {
        val SingletonInstance by lazy { SingletonClass() }
        //val SingletonInstance: SingletonClass by  lazy { SingletonClass() }
    }

    fun honk(){
        println("HONK!!!")
    }
}