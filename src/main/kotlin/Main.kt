import kotlin.random.Random

fun main() {
    //oneTask()
    twoTask()
    //threeTask()
}

fun threeTask(){
    val alf = mapOf('A' to 1,'B' to 2)
}

fun twoTask(){
    print("Введите матрицу 5 на 5: ")
    val col = 5
    val row = 5
    val mas = Array(col,{
        Array(row,{ readln().toInt() })
    })
    var boo = true
    for(i in 0 until col){
        for (j in 0 until row){
            if ((mas[i][j]!=mas[j][i]) and (i!=j)){
                boo=false
            }
        }
    }
    println("Матрица")
    for (i in 0 until col){
        for (j in 0 until row){
            print("${mas[i][j]} ")
        }
        println()
    }
    if (boo){
        println("является симметричным относительно главной диагонали")
    }else{
        println("не является симметричным относительно главной диагонали")
    }
}

fun oneTask(){
    print("Введите количесвто строк: ")
    val col = readln().toInt()
    print("Введите количесвто столбцов: ")
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