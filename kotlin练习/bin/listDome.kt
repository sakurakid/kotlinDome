fun main(args: Array<String>) {
	var lists = listOf("��Ե�","��ȵ�","�����")
	for(lis in lists ){
		println(lis)
	}
	for((i,e)in lists.withIndex()){
		println("$i $e")
	}
	

}