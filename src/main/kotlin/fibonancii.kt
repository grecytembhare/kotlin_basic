//fun main() {
//    val numTerms = 10 // Change this value to the number of terms you want to generate
//
//    println("Fibonacci series up to $numTerms terms:")
//
//    var firstTerm = 0
//    var secondTerm = 1
//
//    for (i in 1..numTerms) {
//        print("$firstTerm ")
//
//        val nextTerm = firstTerm + secondTerm
//        firstTerm = secondTerm
//        secondTerm = nextTerm
//    }
//}


//fun main() {
//    var prev = 0
//    var current = 1
//    var count = 2 // Already printed the first two terms (0 and 1)
//
//    println("Enter a number : ")
//    val n = readln().toInt()
//    if (n >= 1) {
//        print("0")
//    }
//    if (n >= 2) {
//        print(", 1")
//    }
//    while (count < n){
//        val next = prev + current
//        print(", $next")
//        prev = current
//        current = next
//        count++
//    }
//}
fun main(){
    var prev = 0
    var current = 1
    var count = 2
    println("enter the no :")
    var n = readln().toInt()
    if(n>=1){
        print("0")
    }
    if (n>=2){
        print(",1")
    }
    while(count < n){
        var next = prev + current
        print(", $next")
        prev = current
        current= next
        count++
    }

}