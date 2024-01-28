package com.example.parsething

import org.junit.jupiter.api.Test

class KotlinGrammarTest {

    @Test
    fun grammarTest() {

        val listTest = listOf(1 , "TE", null, "", 33, 77)
        val listTe = listTest.mapNotNull { num -> num }

        val lli = listOf(1, 2 ,3 ,4, 5)
        val li2 = lli.mapNotNull { num -> takeIf { num > 2 } }

        println("TEST CHECK : " + lli.mapNotNull { it.takeIf { it % 2 ==0 } })
        println("TEST 222 : " + lli.mapNotNull { num -> num.takeIf { num % 2 == 0 } })

        println(li2)

        val listStr = listOf("T", "F", "3", "3" , "7")
        val testSet = emptySet<String>()
        
        val setTest = listStr.toSet()
        // listStr.forEach { str ->  }
        // listTest.mapNotNull { num -> n }

        println(listTe)

//        val strTest = "TESTT !!"
//        println(strTest.orEmpty())
//
//        val strT1 = ""
//        println(strTest.orEmpty())
//
//        val str2 = null
//        println(strTest.orEmpty())





    }

}