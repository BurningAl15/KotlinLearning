fun main(args:Array<String>) {

    ///////////////////////////////
    //Basics of string management//
    ///////////////////////////////


    var title = "Welcome dear"
    println(title)
    println("title:" + title)
    println("title:$title")

    var name = "Aldhair " + "Vera"
    println("name:$name")
    var temp=title

    for (item in 0..title.length - 1) {
        println(title[item])

    }
    println("\n ${temp.toLowerCase()}")
    println("\n ${temp.toUpperCase()}")
    println("\n ${temp.split(" ")}")
    println("\n ${temp.trim()}")
}