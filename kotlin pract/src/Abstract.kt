abstract class Abstract(val name:String, val dought:String,val cream:String,val ccal:Double,val price:Double):Interface{
    override fun fun2(){
        println("Название: $name\n" +
                "Тесто $dought\n" +
                "Крем: $cream\n" +
                "Каллорийность: $ccal\n" +
                "Цена: $price\n")
    }


}