@file:Suppress("MemberVisibilityCanBePrivate")

package com.nao20010128nao.CodedEnglishWordList

import java.util.*

object Words {
    private var internalWords: List<String> = emptyList()
    val isLoaded: Boolean get() = internalWords.isNotEmpty()
    private fun ensureLoaded() {
        if (isLoaded) {
            return
        }
        internalWords = javaClass.classLoader.getResourceAsStream("cewl/words_alpha.txt").bufferedReader().useLines {
            it.sorted().toList()
        }
    }

    val words: List<String> get() = Collections.unmodifiableList(also { ensureLoaded() }.internalWords)
}
