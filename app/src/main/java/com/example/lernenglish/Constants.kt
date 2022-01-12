package com.example.lernenglish

object Constants {
    fun getFlashcard():  ArrayList<Pictures>{
        val flashcardList = ArrayList<Pictures>()


        val flash1 = Pictures(1,
        R.drawable.dog, option = "Dog"
        )
        flashcardList.add(flash1)


        val flash2 = Pictures(2,
            R.drawable.cat, option = "Cat"
        )
        flashcardList.add(flash2)


        val flash3 = Pictures(3,
            R.drawable.bicycle, option = "Bicycle"
        )
        flashcardList.add(flash3)


        val flash4 = Pictures(4,
            R.drawable.plane, option = "Plane"
        )
        flashcardList.add(flash4)

        return flashcardList
    }
}