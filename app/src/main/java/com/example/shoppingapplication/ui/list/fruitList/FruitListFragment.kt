package com.example.shoppingapplication.ui.list.fruitList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoppingapplication.R


/**
 * A simple [Fragment] subclass.
 * Use the [FruitListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FruitListFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fruit_list, container, false)
    }


}