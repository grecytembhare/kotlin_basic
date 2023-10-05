//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//
//    print("Enter a number: ")
//    val num = scanner.nextInt()
//
//    val factorial = calculateFactorial(num)
//
//    println("Factorial of $num is: $factorial")
//}
//
//fun calculateFactorial(n: Int): Long {
//    if (n < 0) {
//        return -1 // Factorial of negative number is not defined
//    }
//
//    var result: Long = 1
//
//    for (i in 1..n) {
//        result *= i.toLong()
//    }
//
//    return result
//}



//fun main() {
//    println("Enter a number :")
//    var thenumbers = readln().toInt()
//    var result = 1
//    if (thenumbers < 0)
//    {
//        println("$thenumbers is less 0")
//    }else{
//        for (i in 1..thenumbers){
//            result *= i
//        }
//    }
//    print("the factorial is : $result")
//
//}

fun main(){
    println("enter the nomber :")
    var n = readln().toInt()
    var result = 1
    if(n<0){
        print ("$n is less than 0")
    } else {
        for( i in 1..n)
              result *= i // result = result*i
    }
    print("this is result : $result ")
}