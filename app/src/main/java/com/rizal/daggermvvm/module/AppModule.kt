package com.rizal.daggermvvm.module

import com.rizal.daggermvvm.repo.DogRepository
import com.rizal.daggermvvm.repo.DogsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDogsRepo(): DogRepository = DogsRepositoryImpl()
}