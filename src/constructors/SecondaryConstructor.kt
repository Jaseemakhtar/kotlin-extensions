class SecondaryConstructor {
    private var name: String
    constructor(name: String){
        this.name = name
        println("Secondary Constructor")
        println("Name : $name")
    }
}