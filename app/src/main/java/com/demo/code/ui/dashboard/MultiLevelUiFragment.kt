package com.demo.code.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.code.R

class MultiLevelUiFragment : Fragment() {

    private lateinit var multiLevelUiViewModel: MultiLevelUiViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        multiLevelUiViewModel = ViewModelProvider(this).get(MultiLevelUiViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_multi_level, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        multiLevelUiViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }
}