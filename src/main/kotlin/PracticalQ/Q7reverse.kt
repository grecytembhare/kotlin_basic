fun main() {
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