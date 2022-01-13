package com.example.lernenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_flashcard.*

class Flashcard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)

        val flashcardList = Constants.getFlashcard()
        Log.i("Flashcard Size", "${flashcardList.size}")

        val currentPosition = 1
        val flashcard: Pictures? = flashcardList[currentPosition -1]

        ProgressBar.progress = currentPosition

        progressText.text = "$currentPosition" + "/" + ProgressBar.max

        word.text = flashcard!!.option
        image.setImageResource(flashcard.image)
        word.text = (flashcard.option)
        sentence.text = (flashcard.sentence)




    }
}