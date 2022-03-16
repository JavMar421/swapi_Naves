package com.example.naves

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName

@Parcelize
data class NavesResponse (
    val results: List<Naves>
): Parcelable
@Parcelize
data class Naves (
    val name: String,
    val pilots: List<String>,
    val url: String
): Parcelable

