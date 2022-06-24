package com.rizal.daggermvvm.repo

import com.rizal.daggermvvm.model.Dog

interface DogRepository {
    fun getBreeds(): List<Dog>
}