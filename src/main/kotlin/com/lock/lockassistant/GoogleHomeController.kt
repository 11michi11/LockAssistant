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

        val devices = listOf(
            SyncResponse.Device(
                id = "0c:06:e7:a:34:25",
                type = "action.devices.types.DOOR",
                traits = listOf(
                    "action.devices.commands.LockUnlock",
                    "action.devices.commands.OpenClose",
                    "openPercent",
                    "isLocked",
                    "isJammed"
                ),
                name = SyncResponse.Name(name = "Domek"),
                willReportState = false
            )
        )
        // agentUserId should be exchanged by an account number rather than email
        val payload = SyncResponse.Payload(agentUserId = "11michi11@gmail.com", devices = devices)
        return SyncResponse(body.requestId, payload)
    }


}
