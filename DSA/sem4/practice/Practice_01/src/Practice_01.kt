fun main(args: Array<String>) {
    //datatest
    val arr = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2, -3)
    println(arr)
    task_01(arr, 4)
    task_02(arr, 5)
    task_04(arr, 6)
}

fun task_01(array: ArrayList<Int>, target: Int) {
    var i = 0
    var counter = 0
    while ((array[i] != target) and (i <= array.size)) {
        if (i == array.size) {
            print("not found\n comparisons: $i\n")
        }
        i++
    }
    print("THIS!!! #$i\n comparisons: $i\n")
}

fun task_02(array: ArrayList<Int>, target: Int) {
    var i = 0
    while (i <= array.size) {
        if (array[i] == target) {
            print("THIS!!! #$i\n comparisons: $i\n")
            return
        }
        i++
    }
    print("not found\n comparisons: $i\n")
}

fun task_04(array: ArrayList<Int>, target: Int) {
    array.sort()
    println(array)
    var L = 0
    var R = array.size - 1
    while (L < R) {
        var m = (L + R) / 2
        if (target == array[m]) {
            print("THIS!!! #$m\n")
            return
        }
        if (array[m] < target) L = m + 1
        else R = m
    }
    print("not found\n")
}