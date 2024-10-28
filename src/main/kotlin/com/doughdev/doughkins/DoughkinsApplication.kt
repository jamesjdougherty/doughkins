package com.doughdev.doughkins

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoughkinsApplication

fun main(args: Array<String>) {
    runApplication<DoughkinsApplication>(*args)
}
