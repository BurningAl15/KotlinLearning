fun main(args:Array<String>)
{
    /////////////////////////////
    //Basics of array in kotlin//
    /////////////////////////////

    //Fixed size
    var arrayInt=Array<Int>(5){0}
    arrayInt[3]=66
    println("Array[3]= "+arrayInt[3])

    println("Element by object")
    for(element in arrayInt)
    {

        println(element)
    }

    println("Element by index")
    for(index in 0..4)
    {
        if(arrayInt[index]==0) {
            if (index % 2 == 0)
                arrayInt[index] = 55
            else
                arrayInt[index]=20
        }

        println(arrayInt[index])
    }

    /*
    var limit:Int?
    limit= readLine()!!.toInt()
    var arrayStr=Array<String>(limit){""}
    for(index in 0..limit-1)
    {
        print("arrayStr[ $index ]")
        arrayStr[index]= readLine()!!
    }

    for(index in 0..limit-1) {
        println("arrayStr[ $index ]="+arrayStr[index])

    }
    println(arrayStr)
    */

    println()
    //ArrayList
    //for an arraylist you don't have to define the size
    var arraylist=ArrayList<String>()
    //Add
    arraylist.add("Pio1")
    arraylist.add("Pio2")
    arraylist.add("Pio3")
    arraylist.add("Pio4")

    //outputs Pio1
    //Get values from a position
    println("First name:"+arraylist.get(0))

    //V1
    println("First values")
    for(element in arraylist)
        println(element)

    println()
    println("Second values")
    //Set a new value instead of an old one
    arraylist.set(1,"Pio5")
    for(element in arraylist)
        println(element)


    //V2
    //for lists to get the size of it, use .size, in case of a simple array is .Length
    println("First values")
    for(index in 0..arraylist.size-1)
        println(arraylist.get(index))

    //Search
    println()
    println("Searching sample")
    if(arraylist.contains("Pio1"))
        println("Pio 1 exists")
}