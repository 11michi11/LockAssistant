/*
 * DisconnectRequest.kt
 *
 * This code was generated by json-kotlin-schema-codegen - JSON Schema Code Generator
 * See https://github.com/pwall567/json-kotlin-schema-codegen
 *
 * It is not advisable to modify generated code as any modifications will be lost
 * when the generation process is re-run.
 */
package com.lock.lockassistant.model.intents.disconnect

import java.util.UUID

/**
 * This intent is triggered to inform you when a user has unlinked the app account from the Google Assistant. After receiving a DISCONNECT intent, you should not report state for this user's devices.
 */
data class DisconnectRequest(
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
        private const val cg_str0 = "action.devices.DISCONNECT"
    }

}
