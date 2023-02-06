package com.example.guestlist1

import androidx.lifecycle.ViewModel

class GuestListViewModel: ViewModel() {

    private val guestNames = mutableListOf<String>()

    fun addGuest(name: String) {
        guestNames.add(name)
    }

    fun getSortGuestName(): List<String> {
        return guestNames.sorted()
    }

    fun clearGuestList() {
        guestNames.clear()
    }
}
