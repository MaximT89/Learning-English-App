package com.second.world.leaningenglishapp.core.remote


data class Failure(

    /**
     * Code == 1 - ProtocolException
     */
    val code: Int,
    val message: String
)