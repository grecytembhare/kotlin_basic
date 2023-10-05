fun main() {
    println("enter a year")
var year = readln().toInt()
    if (year % 4 == 0 && year % 100 !==0 && year % 400 ==0){
        println("it is a leap year")
    }else{
        println("it is not a leap year")
    }

}