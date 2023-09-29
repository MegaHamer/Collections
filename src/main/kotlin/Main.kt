import kotlin.random.Random

fun main() {
    //oneTask()
    //twoTask()
    threeTask()
}

fun threeTask(){
    //делаю случайный алфавит
    //делаю две коллекции для букв и случайных чисел от 1 до 33
    val bukvi= ('А'..'Е')+'Ё'+('Ж'..'Я').toMutableSet()
    val cifri = mutableSetOf((0 .. 32).random())
    while(cifri.size != 33){
        cifri.add((0..32).random())
    }
    //соединяю коллекции в map
    val alf: Map<Char, Int> = bukvi.zip(cifri).toMap()
    println(alf)
    var shifr:String =""
    for (iii in generateSequence(0) { it }){
        println("\nВыберите дейстиве: \n1.Шифровка\n2.Расшифровка\n3.Выход")
        when(readln()){
            "1"->{
                print("Введие ключевое слово: ")
                val key = readln().toString().uppercase()
                print("Введи слово для шифровки: ")
                val word = readln().toString().uppercase()
                shifr = ""
                for (i in 0 until word.length){
                    shifr+=alf.filterValues { it == (alf.get(word[i])!! +(alf.get(key[i%4])!!))!! %33 }.keys
                }
                print("Защифрованное слово - ")
                shifr.forEach { print(it) }
            }
            "2"->{
                println("Выберите действие: \n1.Расшифровать ранее зашифрованный текст(из 1 действия)\n2.Ввести свой шифр(старый шифр сотрется)")
                when(readln()){
                    "1"->{
                        print("Введие ключевое слово: ")
                        val key = readln().toString().uppercase()
                        var word =""
                        for (i in 0 until shifr.length){
                            word+=alf.filterValues { it == (alf.get(shifr[i])!! +(alf.get(key[i%4])!!))!! %33 }
                        }
                        print("Расшифрованное слово - ")
                        word.forEach { print(it) }
                    }
                    "2"->{

                    }
                    else -> println("Хаха, смешно")
                }
            }
            "3"->{
                break
            }
        }
    }



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