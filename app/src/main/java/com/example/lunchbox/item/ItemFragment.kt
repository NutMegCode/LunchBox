package com.example.lunchbox.item

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class ItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val args: ItemFragmentArgs by navArgs()

        return ComposeView(requireContext()).apply{
            setContent{
                ItemScreen(args.itemType)
            }
        }
    }
}