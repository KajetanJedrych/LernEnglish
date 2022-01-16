package com.example.lernenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_flashcard.*

class Flashcard : AppCompatActivity(), View.OnClickListener {
    private var CurrentPosition:Int = 1
    private var LocalFlashcardList: ArrayList<Pictures>? = null
    private var LocalUserName: String? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard)
        LocalUserName = intent.getStringExtra(Constants.USER_NAME)
        LocalFlashcardList = Constants.getFlashcard()
        setFlashcard()
        btn_next.setOnClickListener(this)


    }

    private fun setFlashcard(){

        val flashcard = LocalFlashcardList!![CurrentPosition-1]

        if(CurrentPosition == LocalFlashcardList!!.size){
            btn_next.text = "FINISH"
        }

        ProgressBar.progress = CurrentPosition

        progressText.text = "$CurrentPosition" + "/" + ProgressBar.max

        word.text = flashcard!!.option
        image.setImageResource(flashcard.image)
        word.text = (flashcard.option)
        sentence.text = (flashcard.sentence)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_next ->{ CurrentPosition ++

                when{
                    CurrentPosition <= LocalFlashcardList!!.size ->{
                        setFlashcard()
                    }else ->{
                        Toast.makeText(this, "Gratulacje " + LocalUserName + " Ukończyłeś lekcje", Toast.LENGTH_SHORT).show()
                    }
                }

            }
        }
    }


}