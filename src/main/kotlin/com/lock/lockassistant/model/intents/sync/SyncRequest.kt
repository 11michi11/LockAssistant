/*
 * SyncRequest.kt
 *
 * This code was generated by json-kotlin-schema-codegen - JSON Schema Code Generator
 * See https://github.com/pwall567/json-kotlin-schema-codegen
 *
 * It is not advisable to modify generated code as any modifications will be lost
 * when the generation process is re-run.
 */
package com.lock.lockassistant.model.intents.sync

import java.util.UUID

/**
 * This intent is triggered at user setup or when a user reconnects through the Action (to reconnect or disconnect) when necessary to resync devices in batch (for example, when new traits are added).
 */
data class SyncRequest(
    /** ID of the request. */
    val requestId: UUID,
    /** List of inputs matching the intent request. */
    val inputs: List<Input>
) {

    /**
     * Type and payload associated with the intent request.
     */
    data class Input(
        /** Intent request type. */
        val intent: String
    ) {

        init {
            require(intent == cg_str0) { "intent not constant value $cg_str0 - $intent" }
        }

    }

    companion object {
        private const val cg_str0 = "action.devices.SYNC"
    }

}
