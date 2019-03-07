import kotlin.random.Random

fun main(arg: Array<String>) {
    //generate new array
    val salaries = List(10) { Random.nextInt(40, 100) }
    for ((index, value) in salaries.withIndex()) {
        println("$index element is $value")
    }

    //part 1
    println("enter target value")
    var value = readLine()!!.toInt()
    var i = 0
    while (i < salaries.size && !(salaries[i] == value)) {
        i++
    }
    if (i == salaries.size) {
        println("not found")
    } else println("element with index $i")

    //part 2
    println("enter target value")
    value = readLine()!!.toInt()
    i = 0
    (salaries as ArrayList).add(value)
    while (salaries[i] != value) {
        i++
    }
    if (i == salaries.size - 1) {
        println("not found")
    } else println("element with index $i")

    //part 4
    var L = 0
    var R = salaries.size - 1
    var found = false
    salaries.sort()
    print("sorted array: $salaries")
    value = readLine()!!.toInt()
    while ((L <= R) && (!found)) {
        i = (L + R) / 2
        if (salaries[i] == value) found = true
        else if (salaries[i] < value) L = i + 1
        else R = i - 1
    }
}