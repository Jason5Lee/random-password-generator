@file:JvmName("RpgMain")

package me.jason5lee

fun main(args: Array<String>) {
    val len = args[0].toInt()
    val chars = mutableListOf<Char>().apply {
        addAll('a'..'z')
        addAll('A'..'Z')
        addAll('0'..'9')
        addAll("~!@#\$%^&*_-+=`|\\(){}[]:;\"'<>,.?/".asIterable())
    }.toList()

    for (i in 0 until len) {
        print(chars.random())
    }
}