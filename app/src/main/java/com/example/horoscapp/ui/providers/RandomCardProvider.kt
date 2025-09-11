package com.example.horoscapp.ui.providers

import com.example.horoscapp.R
import com.example.horoscapp.ui.model.LuckyModel
import javax.inject.Inject
import kotlin.random.Random

class RandomCardProvider @Inject constructor() {
    fun getLucky(): LuckyModel? {
        return when (Random.nextInt(0, 21)) {
            0 -> LuckyModel(R.drawable.card_sun, R.string.luck_0)
            1 -> LuckyModel(R.drawable.card_fool, R.string.luck_1)
            2 -> LuckyModel(R.drawable.card_moon, R.string.luck_2)
            3 -> LuckyModel(R.drawable.card_star, R.string.luck_3)
            4 -> LuckyModel(R.drawable.card_devil, R.string.luck_4)
            5 -> LuckyModel(R.drawable.card_chariot, R.string.luck_5)
            6 -> LuckyModel(R.drawable.card_colgado, R.string.luck_7)
            7 -> LuckyModel(R.drawable.card_emperor, R.string.luck_6)
            8 -> LuckyModel(R.drawable.card_emptress, R.string.luck_8)
            9 -> LuckyModel(R.drawable.card_hierophant, R.string.luck_9)
            10 -> LuckyModel(R.drawable.card_justice, R.string.luck_10)
            11 -> LuckyModel(R.drawable.card_judgment, R.string.luck_11)
            12 -> LuckyModel(R.drawable.card_lovers, R.string.luck_12)
            13 -> LuckyModel(R.drawable.card_magician, R.string.luck_13)
            14 -> LuckyModel(R.drawable.card_priestess, R.string.luck_14)
            15 -> LuckyModel(R.drawable.card_rueda, R.string.luck_15)
            16 -> LuckyModel(R.drawable.card_stepple, R.string.luck_16)
            17 -> LuckyModel(R.drawable.card_strenght, R.string.luck_17)
            18 -> LuckyModel(R.drawable.card_world, R.string.luck_18)
            19 -> LuckyModel(R.drawable.card_temperance, R.string.luck_19)
            else -> null
        }
    }
}