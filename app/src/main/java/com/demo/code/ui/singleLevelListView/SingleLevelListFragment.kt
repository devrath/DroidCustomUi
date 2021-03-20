package com.demo.code.ui.singleLevelListView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.code.databinding.FragmentSingleLevelListBinding
import com.demo.code.ui.Listview.SingleLevelListViewModel
import com.demo.code.ui.custom.CustomListAdapter
import com.demo.code.utils.displaySnakbar
import com.google.android.material.snackbar.Snackbar

class SingleLevelListFragment : Fragment() , CustomListAdapter.Callback{

    private var _binding: FragmentSingleLevelListBinding? = null
    private val binding get() = _binding!!

    private lateinit var singleLevelListViewModel: SingleLevelListViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSingleLevelListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        singleLevelListViewModel = ViewModelProvider(this).get(SingleLevelListViewModel::class.java)
        setActionsForCustomView()
    }

    override fun onCustItemSelected(position: Int) {
       binding.listRootId.displaySnakbar("Row $position".plus("Clicked"), Snackbar.LENGTH_LONG)
    }

    private fun setActionsForCustomView() {
        // Set the callback for list
        binding.customListId.setCallback(this)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}