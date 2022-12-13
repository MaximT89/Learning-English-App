package com.second.world.leaningenglishapp.core.di

import com.second.world.leaningenglishapp.core.bases.BaseSharedPreferences
import com.second.world.leaningenglishapp.core.bases.Dispatchers
import com.second.world.leaningenglishapp.core.common.ResourceProvider
import com.second.world.leaningenglishapp.core.remote.NetworkInterceptor
import com.second.world.leaningenglishapp.core.remote.ResponseWrapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CoreModule {

    @Binds
    abstract fun bindResponseWrapper(responseWrapper: ResponseWrapper.Impl) : ResponseWrapper

    @Binds
    abstract fun bindDispatchers(dispatchers : Dispatchers.Impl) : Dispatchers

    @Binds
    abstract fun bindResourceProvider(provider : ResourceProvider.Impl) : ResourceProvider

    @Binds
    abstract fun bindNetworkInterceptor(interceptor: NetworkInterceptor.Impl) : NetworkInterceptor

    @Binds
    abstract fun bindSharedPreferences(prefs : BaseSharedPreferences.Impl) : BaseSharedPreferences
}