package com.example.horoscapp.domain.model
// A diferencia de PredictionResponse, no contiene @SerializedName.
// Por lo tanto, puede ser consumido por más plataformas.

data class PredictionModel(
    val horoscope: String,
    val sign: String
)
