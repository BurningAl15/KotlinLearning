fun main(args:Array<String>)
{
    var n1:Float?
    var n2:Float?
    var operation:String?
    print("First Value: ")
    n1= readLine()!!.toFloat()
    print("\n")
    print("Second Value: ")
    n2= readLine()!!.toFloat()
    var n3:Float?
    print("\n")
    print("Enter operation: ")
    operation= readLine()

    print("\n the result is: ")
    if(operation=="+")
    {
        n3=(n1+n2).toFloat()
        print(n3)
    }
    else if(operation=="-") {
        n3 = (n1 - n2).toFloat()
        print(n3)
    }
        else if(operation=="*") {
        n3 = (n1 * n2).toFloat()
        print(n3)
    }
    else if(operation=="/") {
        n3 = (n1 / n2).toFloat()
        print(n3)
    }


}