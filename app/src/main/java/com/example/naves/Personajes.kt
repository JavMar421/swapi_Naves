package com.example.naves

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName

@Parcelize
data class PersonajesResponse (
    val results: List<Personajes>
): Parcelable
@Parcelize
data class Personajes (
    val name: String,
    val starships: List<String>,
    val url: String
): Parcelable
