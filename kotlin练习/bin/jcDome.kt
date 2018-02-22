open class jcDome{
	open fun eat(){
		println("吃饭")
	}
}

class Dome : jcDome(){
	fun eat(s:String){
		println("${s}吃饭饭")
	}
		
}
fun main(args: Array<String>) {
	var s = Dome()
    s.eat()
    s.eat("笑笑")
}