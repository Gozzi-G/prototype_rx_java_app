package com.example.fakeapp.data.repositories.fake_user

import com.example.fakeapp.data.network.RetrofitApiFactory
import com.example.fakeapp.data.repositories.faker_characters.response.FakeResponse
import io.reactivex.rxjava3.core.Single

class FakeRepository(
    retrofitApiFactory: RetrofitApiFactory
) {
    private val apiService = retrofitApiFactory.fakeApiService

    fun getFakeUsers(): Single<FakeResponse> {
        return apiService.getFakeUsers(5, "male")
    }

}