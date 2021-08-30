package Hangman

import kotlin.random.Random
import kotlin.random.nextInt

val words = listOf<String>("Хроника","Кафель","Камбала","Лаваш","Бальзам","Бревно")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
val mistakes = 0

fun main(args: Array<String>) {
    setupGame()
    val value = Random.nextInt(0..6)
    printMistakeStatus(value)

}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].toUpperCase()
}

fun printMistakeStatus(mistake: Int){
    when(mistake) {
        0 -> print0Mistake()
        1 -> print1Mistake()
        2 -> print2Mistake()
        3 -> print3Mistake()
        4 -> print4Mistake()
        5 -> print5Mistake()
        6 -> print6Mistake()
     }
}


fun print0Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |       ")
    println("  |       ")
    println("  |       ")
    println(" /|\\     ")
    println("/ | \\    ")
}
fun print1Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      o")
    println("  |       ")
    println("  |       ")
    println(" /|\\     ")
    println("/ | \\    ")
}
fun print2Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      o")
    println("  |      |")
    println("  |      |")
    println(" /|\\     ")
    println("/ | \\    ")
}
fun print3Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      o")
    println("  |     /|")
    println("  |      |")
    println(" /|\\     ")
    println("/ | \\    ")
}
fun print4Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      o")
    println("  |     /|\\")
    println("  |      |")
    println(" /|\\     ")
    println("/ | \\    ")
}
fun print5Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      o")
    println("  |     /|\\")
    println("  |      |")
    println(" /|\\   / ")
    println("/ | \\    ")
}
fun print6Mistake(){
    println("  |------|")
    println("  |      |")
    println("  |      o")
    println("  |     /|\\")
    println("  |      |")
    println(" /|\\    / \\")
    println("/ | \\    ")
}