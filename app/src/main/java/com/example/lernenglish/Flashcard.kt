package com.example.lernenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Flashcard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        val flashcardList = Constants.getFlashcard()
        Log.i("Flashcard Size", "${flashcardList.size}")
    }
}