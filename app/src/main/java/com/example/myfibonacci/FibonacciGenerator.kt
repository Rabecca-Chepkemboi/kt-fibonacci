package com.example.myfibonacci

object FibonacciGenerator {

        fun generateFibonacciNumbers(): List<Int> {
            val fibonacciList = mutableListOf<Int>()

            var first = 0
            var second = 1

            while (second < 1000) {
                fibonacciList.add(second)
                val temp = first
                first = second
                second += temp
            }

            return fibonacciList
        }
    }
