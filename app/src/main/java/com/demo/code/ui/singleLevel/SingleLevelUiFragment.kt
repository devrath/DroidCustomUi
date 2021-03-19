package com.demo.code.ui.singleLevel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.code.R
import com.demo.code.databinding.FragmentMultiLevelBinding
import com.demo.code.databinding.FragmentSingleLevelBinding
import com.demo.code.ui.multiLevel.MultiLevelUiViewModel

class SingleLevelUiFragment : Fragment() {

    private var _binding: FragmentSingleLevelBinding? = null
    private val binding get() = _binding!!

    private lateinit var singleLevelUiViewModel: SingleLevelUiViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSingleLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        singleLevelUiViewModel = ViewModelProvider(this).get(SingleLevelUiViewModel::class.java)
        singleLevelUiViewModel.text.observe(viewLifecycleOwner, {
            binding.textHome.text = it
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}