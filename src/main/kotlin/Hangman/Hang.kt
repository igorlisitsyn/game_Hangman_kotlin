package Hangman

import kotlin.random.Random

val words = listOf<String>("Хроника","Кафель","Камбала","Лаваш","Бальзам","Бревно")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
val mistakes = 0

fun main(args: Array<String>) {
    setupGame()
    println(word)

}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].toUpperCase()
}