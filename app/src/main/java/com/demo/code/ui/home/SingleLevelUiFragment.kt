package com.demo.code.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.code.R

class SingleLevelUiFragment : Fragment() {

    private lateinit var singleLevelUiViewModel: SingleLevelUiViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        singleLevelUiViewModel = ViewModelProvider(this).get(SingleLevelUiViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_single_level, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        singleLevelUiViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }
}