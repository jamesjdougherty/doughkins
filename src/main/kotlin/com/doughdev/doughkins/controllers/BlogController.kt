package com.doughdev.doughkins.controllers

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("blog")
class BlogController() {

    val logger: Logger = LoggerFactory.getLogger("DoughkinsLogger")

    @CrossOrigin()
    @GetMapping("entry/{id}")
    fun getBlogEntry(@PathVariable id: String): ResponseEntity<String> {

        logger.info("Returning id::$id")
        return ResponseEntity.ok(id)
    }
}
