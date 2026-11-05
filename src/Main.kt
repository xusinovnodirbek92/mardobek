fun main() {

//   val day = 4
//    val result = when (day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else --> "Invalid day"
//    }
//    println(result)
//    Outputs"Thursday"(day4)


//    val months = 9
//    val result = when (months) {
//        1 -> "Yanvar"
//        2 -> "Fevral"
//        3 -> "Mart"
//        4 -> "Aprel"
//        5 -> "May"
//        6 -> "Iyun"
//        7 -> "Iyul"
//        8 -> "Avgust"
//        9 -> "Sentabr"
//        10 -> "Oktyabr"
//        11 -> "Noyabr"
//        12 -> "Dekabr"
//        else -> "Invalid months"


//    val months = arrayOf(
//        "January",
//        "February",
//        "March",
//        "April",
//        "May",
//        "June",
//        "July",
//        "August",
//        "September",
//        "October",
//        "November",
//        "December"
//    )
//    println(months[9])
//
//    val animals = arrayOf(
//        "Rabbit",
//        "dog",
//        "bear",
//        "dolphin",
//        "elephant",
//        "monkey",
//        "mouse",
//        "cat",
//        "fish",
//        "horse",
//        "tiger",
//        "lion",
//        "pinguin",
//        "chicken",
//        "ship",
//        "parrot",
//    )
//    println(animals.size)
//
//    val seasons = arrayOf("Spring", "Summer", "Autunumn", "Winter")
//    println(seasons[2])
//
//    for (i in 1..10 step 2) {
//        println(i)
//    }

//    for (i in 1..3) {
//        println("salom")
//    }

//    for (i in 1 until  10 step 3) {
//        println(i)
//    }//ostirish

//    for (i in 1 downTo 10 step 2) {
//        println(i)
//    }//kamayish
//
//    for (i in 1 until 100 step 2) {
//        println(" Toq sonlar " + i)
//    }
//    println()

//    for (n in 2 until 100 step 2) {
//        println("Toq sonlar " + n)
//    }

// 70 - misol
//    val a = 5
//    val n = 6
//    for (i in 1..n) {
//        print(a)
//    }

//    val s = 5
//    val f = 11
//    var n = 0
//    for (i in s + 1 until f) {
//        n += i
//    }

//    print(n)
//    val a = 2
//    val n = 4
//    var sum = 1
//    for (i in 1..n) {
//        sum *= a
//    }
//    println(sum)


//    val cars = arrayOf("Volvo", "BMW", "Mazda") ///Foreach
//    for (x in cars) {
//        println(x)
//    }

    //1->10
//    for (i in 1..10 step 2) { ///For
//        println(i)
//    }

//    for (i in 1 until 10 step 3) {    ///o'stirish
//        println(i)
//    }

//    for (i in 10 downTo 1 step 2) {     ///Kamaytirish
//        println(i)
//    }

//    for (i in 1..100 step 2) {
//        println(i)
//    }
//    for (i in 2 .. 100 step 2) {
//        println(i)
//    }

//    val a = 2
//    val b = 4
//    for (i in 1..b) {
//        println(a)
//    }

//    val a = 2
//    val b = 5
//    var summ = 0
//    for (i in a + 1 until b) {
//        summ = +i
//    }

//    println(summ)
//    val a = 12
//    val b = 24
//    for (i in a + 1 until b) {
//        if (i % 4 == 0) {
//            println(i)
//        }
//    }

//    for (i in 100 until 1000) {
//        if (i / 10 % 10 == 7) {
//            println(i)
//        }
//       }

//    for (i in 100 until 1000) {
//        if (i / 100 == 3 && i % 10 == 3) {
//            println(i)
//        }
//    }

//    for (i in 10..99) {
//        if (i % 10 + i / 10 == 9 || i % 10 + i / 10 == 15) {
//            println(i)
//   }
//    }
//    for (i in 100..1000) {
//        if (i / 100  + i / 10 % 10 + i % 10 == 20) {
//         println(i)
//        }
//    }

//    var sum = 0
//    for (i in 1..100 step 2) {
//        if (i % 3 == 0 && i % 5 != 0) {
//            sum += i
//        }
//    }
//    println(sum)

//    val a = 12
//    val b = 24
//    for (i in a + 1 until b) {
//        if (i % 4 == 0) {
//            println(i)
//        }
//    }

//    for (i in 10..99) {
//        val on = i / 10
//        val bir = i % 10
//        if (on == 8 || bir == 8)
//            println(i)
//    }

//    for (i in 100..999) {
//        val on = i / 10 % 10
//        if (on == 7 )
//            println(i)
//    }

//    for (i in 10..99) {
//        val on = i / 10
//        val bir = i % 10
//        if (on + bir == 9 || on + bir == 15)
//            println(i)
//     }

//    var a = 0
//    for (i in 100..999) {
//        if (i % 3 == 0 && i % 5 != 0) {
//            a++
//        }
//    }
//    println(a)

//    for (i in 10..99) {
//        val on = i / 10
//        val bir = i % 10
//        if (on + bir > 12) {
//            println(i)
//        }
//    }

//    val kg = 20
//    for (i in 10..20) {
//        println(i * kg / 10.toDouble())
//    }

//    val n = 12
//    for (i in 0..12) {
//        println("$i=${sqrt(x = i.toDouble())}")
//    }

//    val a = 12
//    val b = 56
//    val c = 11
//    for (i in 12..56) {
//        c*= i
//    }
//    println(c)

//    var i = 0
//    while (i < 5) {
//        println(i)
//        i++
//    }

//       println(sum)
//    val s = 2
//    val d = 6
//    for (i in s+1 until  d) {
//        for (j in 0 until i) {
//            print(i)
//        }
//    }

//    var a = 12
///    var newnumber = 0
//    while (a > 0) {
//        newnumber = newnumber * 10 + a % 10
//        a /= 10
//    }
//    println(newnumber)

//    var i = 0
//    while (i < 254) {
//        println(i)
//        i++ }

//    var number = 456
//    var count = 0
//    while (number > 0) {
//        count++
//        number /= 10
//    }
//    println(count)

//    val a = 2
//    val b = 6
//    for (i in 2..6) {
//        for (j in 1..i) {
//            print(i)
//        }
//    }

//    val number = 323
//    var newNumber = 0
//    while (number > 0) {
//        newNumber = newNumber * 10 + number % 10
//        number /= 10
//    }
//    println(newNumber)


}