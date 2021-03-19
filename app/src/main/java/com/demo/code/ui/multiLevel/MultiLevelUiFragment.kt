package com.demo.code.ui.multiLevel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.code.R
import com.demo.code.databinding.FragmentListBinding
import com.demo.code.databinding.FragmentMultiLevelBinding
import com.demo.code.ui.Listview.ListViewModel

class MultiLevelUiFragment : Fragment() {

    private var _binding: FragmentMultiLevelBinding? = null
    private val binding get() = _binding!!

    private lateinit var multiLevelUiViewModel: MultiLevelUiViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMultiLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        multiLevelUiViewModel = ViewModelProvider(this).get(MultiLevelUiViewModel::class.java)
        multiLevelUiViewModel.text.observe(viewLifecycleOwner, {
            binding.textDashboard.text = it
        })
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}