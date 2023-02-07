package com.example.surveyapp

import androidx.lifecycle.ViewModel

abstract class SurveyViewModel: ViewModel() {

    private val voteQuestions = mutableListOf<String>()

    fun getSortvoteQuestions(): List<String> {
        return voteQuestions.sorted()
    }

    abstract fun addYesVote(vote: Int){
        yesVoteLabel.add(vote)
        noVoteLabel.add(vote)
    }


}