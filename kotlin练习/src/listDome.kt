fun main(args: Array<String>) {
	var lists = listOf("买吃的","买喝的","买面包")
	for(lis in lists ){
		println(lis)
	}
	for((i,e)in lists.withIndex()){
		println("$i $e")
	}
	

}