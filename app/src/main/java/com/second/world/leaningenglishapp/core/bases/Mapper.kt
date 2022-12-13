package com.second.world.leaningenglishapp.core.bases

interface Mapper<T, R> {

    fun map(data : T) : R
}