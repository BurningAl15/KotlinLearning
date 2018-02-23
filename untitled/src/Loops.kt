fun main(args:Array<String>)
{
    //////////////////////////
    //Basics of Loop control//
    //////////////////////////


    //Simple for
    //in for statements the value that iterates is a val, so it can't be changed

    print("Simple for \n")
    for(item in 0..9) {
        print(" Hi :" + item + "\n")
    }

    print("Nested for \n")

    //Nested for
    for(item in 0..9)
    {
        print(" Hi :" +item + "\n")
        for(item2 in 0..9) {
            print("hey! " + item2+ " \n")

        }
    }

    //While loop
    //in while statements the value that iterates could be var or val, so is more flexible about it
    print("While loop\n")
    var count=1
    while(count <=5)
    {
        print("count:$count \n")
        count++
    }

    //Do while
    //Diference between do while and while is that not matter if the condition is not fullfilled, it will be done at least once
    print("Do While loop\n")
    count=6
    do {
        print("count:$count \n")
        count++
    }while(count <=5)

    //Control loops
    //Returns N Jumps

    print("\n")
    for(count in 1..10) {
        if(count==4)
        {
            continue
        }
        else if(count==9)
        {
            break
        }

        print("count:$count \n")
    }


}