package com.lock.lockassistant

import com.lock.lockassistant.model.intents.sync.SyncRequest
import com.lock.lockassistant.model.intents.sync.SyncResponse
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/smarthome")
class GoogleHomeController {

    var logger: Logger = LoggerFactory.getLogger(GoogleHomeController::class.java)


    @PostMapping("/unlock")
    fun unlock(@RequestBody body: SyncRequest): SyncResponse {
        logger.info(body.toString())
    }



}
