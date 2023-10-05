fun main() {
//    variable
//    two variable
//val-------constant
//var--------changeble .
//    with datatype
//       var var_name : datatype = value
//    wothout datatype
//        var var_name = value
//    ________________________________________________________________
//    var r = 10
////    var pi=3.14
//    val pi = Math.PI
//    var area = pi*r*r
//    println(area)
//}
//    ___________________________________________________________________
//    function
//    we can create inside main or we can create outside main fun.
//    fun fun_name (){}
//fun area_of_circle(){
//    var r = 10
//    val pi = Math.PI
//    var area = pi*r*r
//    println(area)
//}

//    call a function using function name
//    if we create fun. outside main fun then call that fun. in the main fun.
//    area_of_circle()
//    _______________________________________________________________
//

    //    function with parameter
//    fun fun_name(varble_name : datatype)
//    fun area_of_circle(r: Double) {
//        val pi = Math.PI
//    var area = pi*r*r
//    println(area)
//    }
//    var radius = 10.0
//    area_of_circle(radius)
//__________________________________________________________

    //user input
//    fun area_of_triangle(b: Int, h: Int) {
//        var area = b * h / 2
//        println(area)
//    }
////    ---------
//    println("Enter Base")
//    var base = readln().toInt()
//    println("Enter Hieght")
//    var hieght = readln().toInt()
////    ---------
//
//    println(base)
//    println(hieght)
//    area_of_triangle(base,hieght)
//_____________________________________________________________________________________________

    //   named arguments
//    fun area_of_triangle(b: Int, h: Int) {
//        var area = b * h / 2
//        println(area)
//    }
////    ---------
//    println("Enter Base")
//    var base = readln().toInt()
//    println("Enter Hieght")
//    var hieght = readln().toInt()
////    ---------
//
//    area_of_triangle(b=base,h=hieght)
//   __________________________________________________________
//    defould argumnents(4/3 pi*r*r*r)
//    e.g variable_name : datatype = value......defoult
    fun volume_of_sphere(r: Int = 10) {
        val pi = Math.PI
        var fbyt:Double = 4.0/3.0
        var sphere = fbyt * pi * r * r * r
//    println("sphere radius $r and vloume is $sphere")
        println(sphere)
    }
    println("Enter Radius")
    var radius = readln().toInt()
    volume_of_sphere(radius)
}

