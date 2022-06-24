package com.rizal.daggermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rizal.daggermvvm.adapter.DogsAdapter
import com.rizal.daggermvvm.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeDogBreeds()
    }

    private fun observeDogBreeds() {
        viewModel.dogBreeds.observe(this){
            val dogsList = findViewById<RecyclerView>(R.id.dogs_list)
            dogsList.layoutManager = LinearLayoutManager(this)
            dogsList.adapter = DogsAdapter(it)
        }
    }
}