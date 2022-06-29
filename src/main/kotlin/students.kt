class Students(var name:String,var gender:String,var course:String, var contact:Int) {

}

fun main() {
    var obj=Students("Jack","Male","MIT",222561655)
    println("The student name is " +obj.name)
    println("The student is a " +obj.gender)
    println("The students contact:" +obj.contact)
    println("The student takes: " +obj.course)

    var stud=Students("Levi", "Male", "Art", 55656554)
    println("The student's name is"+stud.name+" "+stud.gender+" ,he takes "+stud.course+" you can reach him through"+stud.contact)

}