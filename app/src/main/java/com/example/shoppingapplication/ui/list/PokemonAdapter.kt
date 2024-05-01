package com.example.shoppingapplication.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingapplication.R
import com.example.shoppingapplication.ui.data.model.Pokemon

class PokemonAdapter(private val dataSet: Array<Pokemon>) :
    RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView

            init {
                textView = view.findViewById(R.id.textView)
            }
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.fragment_pokemon_list, viewGroup, false)

        return ViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.textView.text = dataSet[position].toString()
    }

}