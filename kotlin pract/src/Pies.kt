import kotlinx.coroutines.*
class Pies(name:String, dought:String,cream:String,ccal:Double,price:Double):Abstract(name,dought,cream,ccal,price){
    override fun fun1(k:Int) {
        runBlocking {
            repeat(k) {
                launch {
                    delay(2000L)
                    var n: Int
                    println("Введите количество пирогов, чтобы расчитать их стоимость и каллории")
                    while (true) {
                        try {
                            n = readLine()!!.toInt()
                            if (n <= 0)
                                println("Введите значение больше нуля")
                            else
                                break
                        } catch (e: Exception) {
                            println("Вы ввели не число")
                        }
                    }
                    println("Стоимость пирогов будет равна ${price * n}")
                    println("Каллорий в этих пирогах: ${ccal * n}")
                }
            }
        }
    }
}