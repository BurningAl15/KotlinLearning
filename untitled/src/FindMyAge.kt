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

    print("\n")
    //When
    //This decision structure is like the switch in c/c++
    var x= readLine()!!.toInt()
    print("\n")
    when(x)
    {
        1,2->print(" Value is 1 or 2")
        3->print(" Value is 3")
        in 10..30->print(" Value is in range between 10 and 30")
        !in 10..40->print(" Value is not in range between 10 and 40")
        else -> print(" Value is out of range")
    }

    //Extra
    //if
    var n=20
    var n2=30
    var max=if(n>n2) n else n2
    print("\n")
    print("max:$max")

    //when
    var Age=30
    var isYoung=when(Age)
    {
        30->true
        else->false
    }
    print("\n")
    print("isYoung:$isYoung")
}