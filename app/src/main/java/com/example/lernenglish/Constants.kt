package com.example.lernenglish

object Constants {

    const val USER_NAME: String = "user_name"
    fun getFlashcard():  ArrayList<Pictures>{
        val flashcardList = ArrayList<Pictures>()


        val flash1 = Pictures(1,
        R.drawable.dog, option = "Dog",
            sentence = "You have a beautiful dog as his name is?"
        )
        flashcardList.add(flash1)


        val flash2 = Pictures(2,
            R.drawable.cat, option = "Cat",
            sentence = "His cat is very fond of eating fish?"
        )
        flashcardList.add(flash2)


        val flash3 = Pictures(3,
            R.drawable.bicycle, option = "Bicycle",
            sentence = "I recently bought myself a new bicycle."
        )
        flashcardList.add(flash3)


        val flash4 = Pictures(4,
            R.drawable.plane, option = "Plane",
            sentence = "She is very afraid of flying ona plane"
        )
        flashcardList.add(flash4)

        return flashcardList
    }
}