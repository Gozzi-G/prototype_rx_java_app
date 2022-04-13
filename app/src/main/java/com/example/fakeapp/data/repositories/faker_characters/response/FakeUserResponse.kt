package com.example.fakeapp.data.repositories.faker_characters.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
class FakeUserResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("email")
    val email: String,
    @SerializedName("firstname")
    val firstname: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("ip")
    val ip: String,
    @SerializedName("lastname")
    val lastname: String,
    @SerializedName("macAddress")
    val macAddress: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("website")
    val website: String
): Parcelable