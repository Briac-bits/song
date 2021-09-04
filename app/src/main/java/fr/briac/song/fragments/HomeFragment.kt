package fr.briac.song.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.briac.song.R
import fr.briac.song.adapter.GenreAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.menu_principale, container,false)

        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.genres_view)
        horizontalRecyclerView.adapter = GenreAdapter()

        return  view
    }

}