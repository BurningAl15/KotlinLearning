

fun main(args:Array<String>)
{
    //print N println are almost the same if you want an output
    println("Welcome 2 Kotlin!")

    var name:String = "Aldhair"
    var age:Int=28

    var person:String?
    person="Little pio"

    print(name + " - "+ age + " " + person)
    print("\n")

    //If a value will not be updated later you must use val instead of var
    val xName="Me"
    //This line of code give an error, a val cannot be reasigned
    //xName="Also me"

    //Input
    var getVal= readLine()

    if(getVal=="Pio")
        print(getVal)
    else if(getVal=="pio")
        print(getVal +5)
    else
        print("Hi there, I'm pio")

    print("\n")
     //for number type of values
    var myAge:Int= readLine()!!.toInt()
    var height:Double=readLine()!!.toDouble()

    print("My age is: "+myAge+" and my height is: "+height)

    //Null safety
    //!! is used when your variable is waiting for an input value
    var myName:String?
    myName= null
    print(myName!!)
}