package com.example.legocharacters.data

import com.example.legocharacters.R
import com.example.legocharacters.model.LegoCharacter

class DataSource {

    fun loadLegoCharacters(): List<LegoCharacter> {
        return listOf<LegoCharacter>(
            LegoCharacter(R.string.character1, R.drawable.image1),
            LegoCharacter(R.string.character2, R.drawable.image2),
            LegoCharacter(R.string.character3, R.drawable.image3),
            LegoCharacter(R.string.character4, R.drawable.image4),
            LegoCharacter(R.string.character5, R.drawable.image5),
            LegoCharacter(R.string.character6, R.drawable.image6)
        )
    }
}