package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private var _score = 0

    val score : Int
        get() = _score

    private var _currentWordCount = 0

    val currentWordCount : Int
        get() = _currentWordCount

    private var _currentScrambledWord = "test"

    val currentScrambleWord : String
        get() = _currentScrambledWord

    init{
        Log.d("GameFragment", "GamveViewModel created!")
    }

    override fun onCleared(){
        super.onCleared()
        Log.d("GameFragment","GameViewModel destroyed!")
    }

}