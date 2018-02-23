fun main(args:Array<String>)
{
    ////&//////////
    ////HashMap////
    ///////////////

    //Classic Java form

    //Needs a key and a value
    //HasMap<Key,Value>
    var map= HashMap<Int,String>()
    map.put(1,"Aldhair")
    map.put(2,"Nancy")

    println(map.get(2))

    for(k in map.keys)
    {
        println("The key is: $k")
    }

    for(k in map.values)
    {
        println("The value is: $k")
    }

    //Kotlin native form
    var map2= hashMapOf(1 to "Aldhair",2 to "Nancy")
    map2.put(3,"Stormy")

    for(index in map2.values)
    {
        println(index)
    }

    /////////////////
    //Back to Array//
    /////////////////

    var ar= arrayOf(1,10,22,11)
    for(index in ar)
    {
        println(index)
    }
    println()
    //Is based on linkedList so cannot get it by index
    //After you define it you cannot change the value inside it (immutable)
    var list= listOf(1,10,22,11)
    for(item in list)
    {
        println(item)
    }

    println()
    //If you want to have a mutable list
    var list2= mutableListOf(11,12,25,32)


    for(index in 0..list2.size-1)
    {
        if(list2[index]%2==0)
        {
            list2[index]=100
        }
        else
            list2[index]=6121997
        println(list2[index])
    }

    ////////////////
    //     Sets   //
    ////////////////

    println()
    //Set will output just 1 of the 55 values so a set will not repeat a value when outputs
    //Set is immutable
    var setelement= setOf(1,2,3,11,44,55,55)
    for(element in setelement)
    {
        println(element)
    }
    //mutableSetOf is mutable, so you can add values, in a simple setOf you cannot (immutable)
    var setMutableElement= mutableSetOf(1,2,3,11,44,55,55)
    setMutableElement.add(77)
    for(element in setMutableElement)
    {
        println(element)
    }
}