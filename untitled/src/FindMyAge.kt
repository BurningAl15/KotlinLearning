import java.util.*

fun main(args:Array<String>)
{
    //Input
    print("Enter yout Date Of Birth: ")
    var DOB:Int= readLine()!!.toInt()
    //process
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var age=year-DOB

    if(age>0 && age <=16)
    {
        if(age==15)
        {
            print("r u getting your 15 party?")
        }
        else {
            print("U r a kiddo")
        }
    }
    else if(age >17 && age <=23)
    {
        print("U r in the better age")
    }
    else if(age >24 && age <=30)
    {
        print("Man u r getting older, aren't u?")
    }
    print("\n")
    //Output
    print(age)


    //When
    //This decision structure is like the switch in c/c++
    var x= readLine()!!.toInt()

    when(x)
    {

        1->print(" Value is 1")
        2->print(" Value is 2")
        3->print(" Value is 3")
        4->print(" Value is 4")
        else -> print(" Value is out of range")
    }


}