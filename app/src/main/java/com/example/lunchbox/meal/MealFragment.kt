package com.example.lunchbox.meal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class MealFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val args: MealFragmentArgs by navArgs()

        return ComposeView(requireContext()).apply{
            setContent{
                MealScreen(args.mealType)
            }
        }
    }
}