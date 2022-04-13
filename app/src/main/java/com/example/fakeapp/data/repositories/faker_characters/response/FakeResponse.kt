package com.example.fakeapp.data.repositories.faker_characters.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
class FakeResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: List<FakeUserResponse>,
    @SerializedName("status")
    val status: String,
    @SerializedName("total")
    val total: Int
) : Parcelable




