package com.maxfresonke.quicknote

import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

import kotlinx.android.synthetic.main.note_item.view.*;

/**
 * Created by Max on 2/3/2018.
 */
class NoteAdapter(private val notes : List<Note>) : RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(note: Note/*, listener: (Note) -> Unit*/) = with(itemView) {
            noteText.setText(note.text, TextView.BufferType.EDITABLE)
            //setOnClickListener { listener(note) }
        }
    }



    override fun getItemCount(): Int {
        return notes.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false) as LinearLayout
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(notes[position])
    }

}
