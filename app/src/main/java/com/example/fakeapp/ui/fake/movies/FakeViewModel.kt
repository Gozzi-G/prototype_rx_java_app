package com.example.fakeapp.ui.fake.movies

import com.example.fakeapp.base.BaseViewModel
import com.example.fakeapp.base.MmDbLogger
import com.example.fakeapp.data.repositories.fake_user.FakeRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class FakeViewModel(
    private val fakeRepository: FakeRepository
) : BaseViewModel() {

    fun onViewCreated() {
        getFakeUsers()
    }

    private fun getFakeUsers() {
        disposables += fakeRepository.getFakeUsers()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                MmDbLogger.d("Success ${it.data.map { it.firstname }}")
            },{
                MmDbLogger.d("Success ${it.message}")
            })

    }
}

