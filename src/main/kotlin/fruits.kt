class Fruits {
    var type:String=""
    var color:String=""
    var price:Int=7
}

fun main(){
    val myFruits=Fruits()
    myFruits.type="Lemon"
    myFruits.color="Green"
    myFruits.price=100


    println(myFruits.type)
    println(myFruits.color)
    println(myFruits.price)


    myFruits.type="Orange"
    myFruits.color="Orange"
    myFruits.price=111

    println(myFruits.type)
    println(myFruits.color)
    println(myFruits.price)

}