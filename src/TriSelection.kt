import java.util.*

fun <E: Comparable<E>> Array<E>.sort() {
    val len = size
    // Find the minimum value of the array
    for (i in 0 until (len - 1)) {
        // Getting the index where minimum value is present
        var minIndex = i
        for (j in (i + 1) until len) {
            if (this[j].compareTo(this[minIndex]) < 0) minIndex = j
        }

        // We got the minimum element, now swap that to first element
        val temp = this[minIndex]
        this[minIndex] = this[i]
        this[i] = temp
    }
}

fun <E: Comparable<E>> List<E>.sort(): List<E> {
    val len = size
    val resultList = toMutableList()
    // Find the minimum value of the array
    for (i in 0 until (len - 1)) {
        // Getting the index where minimum value is present
        var minIndex = i
        for (j in (i + 1) until len) {
            if (resultList[j].compareTo(resultList[minIndex]) < 0) minIndex = j
        }

        // We got the minimum element, now swap that to first element
        val temp = resultList[minIndex]
        resultList[minIndex] = resultList[i]
        resultList[i] = temp
    }
    return resultList
}

fun main(args: Array<String>) {
    println("Sort array of elements")
    val nums = arrayOf(2, 12, 89, 23, 76, 43, 12)
    println("Before sorting array of elements")
    println(Arrays.toString(nums))
    nums.sort()
    println("After sorting array of elements")
    println(Arrays.toString(nums))

    println()
    println("Sort List of elements")
    val nums1 = listOf(2, 12, 89, 23, 76, 43, 12)
    println("Before sorting list of elements")
    println(nums1)
    val result = nums1.sort()
    println("After sorting list of elements")
    println(result)
}