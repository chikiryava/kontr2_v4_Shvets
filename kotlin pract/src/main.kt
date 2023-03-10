fun main(){
    val pies = Pies("Test","Крутое","Вкусный",1205.0,240.0)
    println("Введите количество повоторений")
    var k:Int
    while(true){
        try {
            k = readLine()!!.toInt()
            if (k <= 0)
                println("введите число больше 0")
            else
                break
        }
        catch (e:Exception){
            println("вы ввели не число")
        }
    }
    pies.fun2()
    pies.fun1(k)
}