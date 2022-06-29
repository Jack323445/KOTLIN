fun main(args : Array<String>){

    for (num in 6..9){
        println("Before continue, Loop: $num")
        if(num==6||num==8)
            continue

        println("After continue, Loop: $num")

    }
}