import kotlin.math.sqrt

fun main(args:Array<String>)
{
    /*Just the priority of the math operations
    1-()
    2-++,--(before Var)
    3-^
    4-*, /
    5-+,-
    6-=
    7-++,--(After var)
    */
    var n1:Int=10
    var n2:Int=10
    var n3:Int=5
    var sum:Int?
    var nSum:Float?
    sum=n1+n2*n3-3
    print("sum:$sum")
    print("\n")
    nSum= sqrt(n1.toFloat())
    print(nSum)



}