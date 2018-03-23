package com.nao20010128nao.CodedEnglishWordList

import org.junit.Assert.assertTrue
import org.junit.Test

class Tests {
    @Test
    fun testLoaded() {
        println(Words.isLoaded)
        println(Words.words.size)
        assertTrue(Words.isLoaded)
    }
}