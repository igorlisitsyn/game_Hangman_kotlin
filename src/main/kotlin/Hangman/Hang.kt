package Hangman

import kotlin.random.Random
import kotlin.random.nextInt

val words = listOf<String>("Хроника","Кафель","Камбала","Лаваш","Бальзам","Бревно")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0

fun main(args: Array<String>) {
    setupGame()
    /*
    val value = Random.nextInt(0..6)
    printMistakeStatus(value)
    println("Введите букву : ")
    val input = readLine()?:"" */
    /*
    word.apply {
        for ((index, value) in this.withIndex()) {

            if (inputChar[0].toUpperCase() == value) {
                guesses[index] = inputChar[0].toUpperCase()

            }
        }
    }
    printMistakeStatus(value) */
    var gameOver = false
    do {
        printMistakeStatus(mistakes)
        println("Введите букву : ")
        val input = readLine()?:""
        val inputChar = input[0].toUpperCase()
        if (inputChar in '0'..'9') {
            println("Вводить нужно букву")
            continue
        }
        word.apply {
            for ((index, value) in this.withIndex()) {

                if (inputChar == value) {
                    guesses[index] = inputChar
                    mistakes --
                }
            }
            if (mistakes < -1) { mistakes = -1}
        }
        mistakes ++
        remainingGuesses --

        if (remainingGuesses == 0) {
            if (guesses.contains('_')) {
                println("Вы проиграли")
                mistakes = 6
                printMistakeStatus(mistakes)
                gameOver = true
            } else {
                println("Вы выиграли !!!! Это слово $guesses")
                gameOver = true
            }
        }
        if (!guesses.contains('_')) {
            println("Вы выиграли !!!! Это слово $guesses")
            gameOver = true
        }

    } while (!gameOver)
}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].toUpperCase()
    for (i in word.indices) {
        guesses.add('_')
    }
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

    print("загаданное слово :")
    for (element in guesses) {
        print("$element ")
    }
    println("\nУ Вас осталось еще $remainingGuesses попыток")
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