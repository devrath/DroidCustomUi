package com.demo.code.ui.multiLevel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.code.databinding.FragmentMultiLevelBinding
import com.demo.code.utils.displaySnakbar
import com.google.android.material.snackbar.Snackbar

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
        setActionsForCustomView()
    }

    private fun setActionsForCustomView() {

        // Click action for the button in the parent view
        binding.parentErrorViewId.setParentButtonViewListener {
            it.displaySnakbar("Parent view Clicked !!", Snackbar.LENGTH_LONG)
        }

        // Click action for the button in child view
        binding.parentErrorViewId.setTryAgainClickListener {
            it.displaySnakbar("Try again Clicked !!", Snackbar.LENGTH_LONG)
        }

        // Hide the view in child container
        binding.parentErrorViewId.hideChildView()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}