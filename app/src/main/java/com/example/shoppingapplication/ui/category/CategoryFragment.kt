package com.example.shoppingapplication.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.shoppingapplication.R
import com.example.shoppingapplication.ShoppingApplication
import com.example.shoppingapplication.databinding.FragmentCategoryBinding


/**
 * A simple [Fragment] subclass.
 * Use the [CategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryFragment : Fragment() {

    lateinit var binding: FragmentCategoryBinding
    lateinit var viewModel: CategoryViewModel
    val foodCategories = ShoppingApplication()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[CategoryViewModel::class.java]
        binding.apply {
            btProtein.text = viewModel.proteinCategory
            btCarb.text = viewModel.carbCategory
            btFruit.text = viewModel.fruitCategory
            btVegetable.text = viewModel.vegetableCategory


            btFruit.setOnClickListener {
                findNavController().navigate(R.id.action_nav_category_to_fruitListFragment)
            }

            btProtein.setOnClickListener {
                findNavController().navigate(R.id.action_nav_category_to_proteinListFragment)
            }

            btVegetable.setOnClickListener {
                findNavController().navigate(R.id.action_nav_category_to_vegetableListFragment)
            }
            btCarb.setOnClickListener {
                findNavController().navigate(R.id.action_nav_category_to_carbListFragment)
            }


        }
    }


}