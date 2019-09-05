#!/bin/bash

kt(){

echo '@file:Suppress("MemberVisibilityCanBePrivate")

package com.nao20010128nao.CodedEnglishWordList
import java.util.*

object Words {
    val isLoaded: Boolean = true
    val words: List<String> = listOf('

FIRST=yes
cat words_alpha.txt | tr -d '\r' | (
  read i
  echo -n \"$i\"
  while read i ; do
    echo -n ','
    echo -n \"$i\"
  done
)

echo ')
}'

}

kt | tee src/main/kotlin/com/nao20010128nao/CodedEnglishWordList/Words.kt
