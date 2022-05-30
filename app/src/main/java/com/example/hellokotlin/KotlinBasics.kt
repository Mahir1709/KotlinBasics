package com.example.hellokotlin

fun main() {

    /*
    val unveränderbare Variable
    var veränderbare Variable
    */

    /*val myName = "Mahir"
    println("Hallo "+ myName)
     */

    //var myAge = 26
    //println(myAge)

    // Integer TYPES: Byte (8 bit), Short (16 Bit), Int (32 bit), Long (64 bit)

    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_932_423_234_645_654

    //Floating Point number Types: Float (32 bit), Double (64 bit)
    //val myFloat: Float = 13.37F
    //val myDouble: Double = 3.14159265358979323846

    // Datentypen müssen nicht dazu geschrieben werden Kotlin macht dass automatisch
    /*
    var myBool = true
    myBool = false

    var letterChar = 'A'
    var digitChar = '2'

    val myString = "Hallo Welt"
    var firstChar = myString[0]
    var lastChar = myString[myString.length - 1]

    println(firstChar)
    println(lastChar)
     */

    /*
    Schreibe ein Programm, in welchem du folgende Werte zu Variablen mit dem korrekten (spezifischen) Datentyp zuweist:

    "Android Masterclass"

    13.37F

    3.14159265358979

    25

    2020

    18881234567

    true

    'a'
     */
    /*
    var Kursname :String = "Android Masterclass"
    var average: Float = 17.24F
    val pi: Double = 3.14159265358979
    var age: Byte = 26
    var year: Short = 2020
    var phoneNumber: Long = 18881234567
    var question: Boolean = true
    var size: Char = 'L'
     */

    //Arithmetische Operatoren (+,-,*,/,%)
    /*
    var result = 5 +3
    val a = 5.0
    val b = 3
    var resultDouble: Double = a / b
    println(result)
    println(resultDouble)
    result /= 2
    //result = 15%4  modulo(3 rest)
    println(result)
     */

    // Vergleichsoperatoren (==, !=, <, >, <=, >=)
    /*
    var c = 8
    var d = 2
    var isEqual = c == d
    println("isEquel ist $isEqual")

    var isNotEqual = 5 != 5
    println("isEqual ist $isNotEqual")

    println("5 ist größer als 3 ist ${5 > 3}")
    println("5 ist kleiner als 3 ist ${5 < 3}")
    println("5 ist kleiner oder gleich als 3 ist ${5 <= 5}")
     */

    //Zuordnungsoperatoren (+=, -=, *=, /=, %=)
    /*
    var myNumber = 4
    myNumber += 3
    println(myNumber)
    myNumber *= 5
    println(myNumber)
     */

    //IF´-Abfragen
    /*
    var age = 21
    if (age >= 18) {
        println("Du darfst alleine Auto fahren")
    } else if (age >= 17) {
        println("Du darfst begleitet fahren")
    } else if (age >= 16) {
        println("Du darfst deinen Führerschein beginnen")
    } else {
        println("Du bist zu jung")
    }

    val name = "Mahir"
    if (name == "Mahir")
        println("Hallo Mahir")
    else
        println("Wer bist du?")

    var isSunny = true

    if (isSunny)
        println("Es ist Sonnig")

    var season = 2
    when (season) {
        1 -> println("Frühling")
        2 -> println("Sommer")
        3 -> println("Herbst")
        4 -> println("Winter")
        else -> println("Ungültige Jahreszeit")
    }

    var month = 7
    when (month) {
        1, 2, 3 -> println("Frühling")
        in 4..6 -> println("Sommer")
        in 7..9 -> println("Herbst")
        in 10..12 -> println("Winter")
        else -> println("Ungültige Jahreszeit")
    }
     */

    //Aufgbe Führerschein Beispiel mint when Ausdruck machen
    /*
    var age = 17
    when (age) {
        !in 0..17 -> println("Du darfst alleine Auto fahren")
        17 -> println("Du darfst begleitet fahren")
        16 -> println("Du darfst deinen Führerschein beginnen")
        else -> println("Du bist zu jung")

    }

    var x: Any = 14.45
    when (x) {
        is Int -> println("$x ist ein Integer")
        is Double -> println("$x ist ein Doubble")
        is String -> println("$x ist ein String")
        else -> println("Keine der Datentypen")
    }

     */

    //While-Schleife
    /*
    var x = 1
    while (x <= 10){
        print("${x++}")
    }
    println("\nSchleife beendet")

    var y = 100
    while (y >= 50){
        print(y)
        y -= 5
    }
    println("\nSchleife beendet")
     */

    // Do-While-Schleife
    /*
    var z = 100
    do {
        print("$z ")
        z -= 5
    }while (z >= 50)
    println("\nDo-While-Schleife beendet")

    var feltTemp ="kalt"
    var roomTemp =10
    while (feltTemp == "kalt"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "warm"
            println("Jetzt ist es warm genug")
        }
    }
     */

    //For-Schleife
    /*
    for (num in 1..10) {
        println("$num")
    }
    for (i in 1 until 10) {
        println("$i")
    }
    for (i in 10 downTo 1) {
        println("$i")
    }
    for (i in 10 downTo 1 step 2) {
        println("$i")
    }
    //Aufgabe

    for (i in 1..10000) {
        if (i == 9001) {
            println("over 9000!!!")
        }
    }

    var feuchtigkeitslevel = 80
    var feuchtigkeit = "feucht"
    while (feuchtigkeit == "feucht"){
        feuchtigkeitslevel -=5
        println("feuchtigkeit nimmt ab $feuchtigkeitslevel")
        if (feuchtigkeitslevel < 60){
            println( "Nun ist es angenehm")
            feuchtigkeit = "angenehm"
        }
    }
     */

    //Funktionen
    /*
    val ergebnis = addieren(15,20)
    val ergebnis2 = multiplizieren(4, 9)
    val ergebnis3 = multiplizieren(addieren(2, 4), 9)
    println(ergebnis)
    println(ergebnis2)
    println(ergebnis3)
     */

    var name: String ="Mahir"
    //name =null Error in der Kompilierung
    var nullname: String? = null

    var len = name.length

    var len2 =nullname?.length

}
fun addieren(a: Int, b: Int):Int{
    return a + b
}

fun multiplizieren(a: Int, b: Int): Int{
    return a * b
}