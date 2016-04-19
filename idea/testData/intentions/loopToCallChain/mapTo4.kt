// WITH_RUNTIME
fun foo(list: List<String>): List<Int> {
    val target = createCollection()
    <caret>for (s in list) {
        if (s.length > 0)
            target.add(s.hashCode())
    }
    return target
}

fun createCollection(): MutableList<Int> = java.util.ArrayList()