class PrimaryConstructor(name: String){
    var name: String
    init {
        this.name = name
        println("Primary constructor")
        println("Name : $name")
    }

    fun getName(){
        println(name);
    }
}