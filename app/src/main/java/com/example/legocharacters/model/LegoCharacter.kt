package com.example.legocharacters.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LegoCharacter(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
