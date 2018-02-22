class Student(var name:String = "默认值",var age:Int=11){
	init{
		println("name = $name age = $age")
	}
    constructor(name:String,ss:String,age:Int):this(name,age){
       println(ss)
    }

}
fun main(args: Array<String>) {
	var s1 = Student()
	var s2 = Student("喵喵",22)
	var s3 = Student("汪汪","啦啦啦",33)
    
}