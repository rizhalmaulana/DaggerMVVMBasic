package com.rizal.daggermvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rizal.daggermvvm.model.Dog
import com.rizal.daggermvvm.repo.DogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val dogsRepository: DogRepository): ViewModel() {
    private val dogBreedEmitter = MutableLiveData<List<Dog>>()
    val dogBreeds: LiveData<List<Dog>> = dogBreedEmitter

    init {
        loadDogBreeds()
    }

    private fun loadDogBreeds() {
        dogBreedEmitter.value = dogsRepository.getBreeds()
    }
}