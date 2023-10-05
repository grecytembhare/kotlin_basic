//fun main() {
//    val lowerLimit = readIntss("Enter the lower limit of the range: ")
//    val upperLimit = readIntss("Enter the upper limit of the range: ")
//
//    println("Perfect numbers in the range $lowerLimit to $upperLimit are:")
//
//    for (number in lowerLimit..upperLimit) {
//        if (isPerfectNumber(number)) {
//            println(number)
//        }
//    }
//}
//
//fun isPerfectNumber(number: Int): Boolean {
//    if (number <= 1) {
//        return false
//    }
//
//    var sum = 1 // Start with 1 as the first divisor
//
//    for (i in 2 until number) {
//        if (number % i == 0) {
//            sum += i
//        }
//    }
//
//    return sum == number
//}
//
//fun readIntss(prompt: String): Int {
//    print(prompt)
//    return readLine()?.toIntOrNull() ?: 0
//}

//fun main() {
//    println("Enter a number : ")
//    var inputsfromUser = readln().toInt()
//    var result = 1
////    untill will exclude the inputsfromUser
//    for (i in 2 until  inputsfromUser){
//        if ( inputsfromUser % i == 0 ){
//            result += i
//        }
//    }
//    if (inputsfromUser == result){
//        println("$result is a perfect number")
//    }
//
//}
fun main(){
    println("enter the number")
    var n = readln().toInt()
    var result = 1
    for (i in 2 until n){
        if(n % i == 0){
            result+=i
        }
    }
    if (n == result){
        println("$result is a perfect")
    } else{
        println("$result not a perfact nu ")
                }

}