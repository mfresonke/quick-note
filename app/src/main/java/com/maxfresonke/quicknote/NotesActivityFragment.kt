package com.maxfresonke.quicknote

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.fragment_notes.*
import android.support.v7.widget.RecyclerView

private const val TAG = "NoteFragment"

private const val KEY_LAYOUT_MANAGER = "layoutManager"

/**
 * A placeholder fragment containing a simple view.
 */
class NotesActivityFragment : Fragment() {

    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_notes, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // use a linear layout manager
        mLayoutManager = LinearLayoutManager(activity)

        noteRecyclerView.layoutManager = mLayoutManager

        // specify an adapter (see also next example)
        mAdapter = NoteAdapter(DummyNoteList())
        noteRecyclerView.adapter = mAdapter
    }
}
