fun main(args:Array<String>) {
    println("Hello World!")
    var stringVar = "hii grecy"
    println(stringVar)

    var strVar:String
    strVar = "grecy"
    strVar = "gm"
    println(strVar)

    fun display (name:String){
        println(name)
    }
    display("grecy")

    class Person {
        fun a1 (name1: String){
            println(name1)
        }
    }
    // creating object of the classs
    var obj1 = Person()
    obj1.a1(name1 = "this is basic")

    //addition of two number
    var n1: Int=20
    var n2: Int=10
    fun addition ( n1:Int,n2:Int){
        println(n1+n2)
    }
    addition(n1,n2)

    fun add(){
        var a=30
        var b=40
        println(a+b)
        println(a-b)
        println(a*b)
        println(b/a)

    }
    add()


//    range
    val n = 5
//    val res1 = n in 1..5
    val res1 = n in 1 until 5
    println(res1)

//    use of when
    val res2 = when (n){
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        else -> "not in range"
    }
    println(res2)

    //loops
    print ("enter the number:")
    var n11= readln()
    var num:Int=n11.toInt()
    var i=1
    while(i<=10){
        println(num*i)
        i++
    }

    var ind=5
    do{
        println("good mornimg")
    }while (ind>5)

for(i in 1..5 step 2){
    println(i)
    }


    // Try adding program arguments vias Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}