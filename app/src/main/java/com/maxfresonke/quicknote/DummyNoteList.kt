package com.maxfresonke.quicknote

/**
 * Created by Max on 2/3/2018.
 */

const val dummyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce molestie consequat rhoncus. Vivamus vitae felis ut ligula dapibus blandit. Nullam vel mi non odio dictum viverra. Proin ut venenatis leo. Donec tellus nisl, maximus vitae lorem a, porttitor egestas dui. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Lorem ipsum dolor sit amet, consectetur adipiscing elit."

class DummyNoteList : ArrayList<Note>() {

    init {
        for (i in 1..25) {
            add(Note(dummyText))
        }
    }

}