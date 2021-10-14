



//Return :
/* Code prints a sentence and is called without any return value, only calling because the sentence is printed in the function */
fun myName  (firstName : String , lastName : String ) : String {
    var myName : String = firstName + lastName
    return myName }




// Non-Return :
/* The return is used when used to return the value and use it in the function */

fun main (args :Array < String> ){
    myName()
}

fun myName () {
    println(" my name is : raghad ") }