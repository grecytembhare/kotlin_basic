//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//
//    print("Enter a number: ")
//    val number = scanner.nextInt()
//
//    val reversedNumber = reverseNumber(number)
//
//    println("Reverse of $number is: $reversedNumber")
//}
//
//fun reverseNumber(number: Int): Int {
//    var num = number
//    var reversed = 0
//
//    while (num != 0) {
//        val digit = num % 10
//        reversed = reversed * 10 + digit
//        num /= 10
//    }
//
//    return reversed
//}

//fun main() {
//
//    println("Enter a number : ")
//    var thenum = readln().toInt()
//    var sum = 0
//
//    while (thenum != 0 ){12
//        var digit = thenum % 10
//        sum = sum * 10 + digit
//        thenum = thenum / 10
//    }
//
//    println("the reverse is $sum")
//}

fun main(){
    println("Enter the number:")
    var thenum = readln().toInt()
    var sum=0
    while(thenum !=0 ){
        var digit = thenum % 10
        sum = sum * 10 + digit
        thenum = thenum / 10
    }
    println("the reverse no is: $sum")
}




















