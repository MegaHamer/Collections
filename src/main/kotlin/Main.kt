import kotlin.random.Random

fun main() {
    oneTask()
    //threeTask()
}

fun threeTask(){
    val alf = mapOf('A' to 1,'B' to 2)
}

fun oneTask(){
    val col = readln().toInt()
    val row = readln().toInt()
    //Создание 2 мерного массива
    val mas = Array (col,{Array<Int>(row,{
        (100..999).random()
        })
    })
    //вывод массива
    for (i in 0 until col){
        for (j in 0 until row){
            print("${mas[i][j]} ")
        }
        println()
    }
    //Создал список и добавил по символу
    val str= mutableSetOf("")
    str.remove("")
    for (i in 0 until col) {
        for (j in 0 until row) {
            str.add(mas[i][j].toString()[0].toString())
            str.add(mas[i][j].toString()[1].toString())
            str.add(mas[i][j].toString()[2].toString())

        }
    }
    println("В массиве использовано ${str.size} различных цифр")
    }