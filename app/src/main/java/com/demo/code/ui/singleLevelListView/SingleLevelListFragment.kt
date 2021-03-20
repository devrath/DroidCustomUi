package com.demo.code.ui.singleLevelListView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.code.databinding.FragmentListBinding
import com.demo.code.ui.Listview.SingleLevelListViewModel

class SingleLevelListFragment : Fragment() {

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    private lateinit var singleLevelListViewModel: SingleLevelListViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        singleLevelListViewModel = ViewModelProvider(this).get(SingleLevelListViewModel::class.java)
        /*listViewModel.text.observe(viewLifecycleOwner, {
            binding.textNotifications.text = it
        })*/
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}