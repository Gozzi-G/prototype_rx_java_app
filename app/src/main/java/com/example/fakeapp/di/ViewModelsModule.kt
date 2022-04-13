package com.example.fakeapp.di

import com.example.fakeapp.ui.fake.movies.FakeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel {
        FakeViewModel(
            fakeRepository = get()
        )
    }
}