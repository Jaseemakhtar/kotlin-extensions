fun main(args: Array<String>) {

    var singletonInstance = SingletonClass.SingletonInstance
    singletonInstance.honk()

    var anotherSingletonInst = SingletonClass.SingletonInstance
    anotherSingletonInst.honk()
}