package com.lock.lockassistant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LockAssistantApplication

fun main(args: Array<String>) {
    runApplication<LockAssistantApplication>(*args)
}
