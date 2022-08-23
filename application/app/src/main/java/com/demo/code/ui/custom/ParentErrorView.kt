package com.demo.code.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.code.databinding.ErrorViewBinding
import com.demo.code.databinding.ParentErrorViewBinding

class ParentErrorView @JvmOverloads constructor(context: Context,
                                                attributes: AttributeSet? = null,
                                                defStyleAttr: Int = 0
) : ConstraintLayout(context, attributes, defStyleAttr) {

    companion object {
        const val TAG = "ParentErrorView"
    }

    private var binding = ParentErrorViewBinding.inflate(LayoutInflater.from(context), this, true)

    // Set click listener for the parent view
    fun setParentButtonViewListener(listener: OnClickListener) = binding.parentButtonId.setOnClickListener(listener)

    // Set click listener for the nested view ( Parent view, has a child view which has a try again button )
    fun setTryAgainClickListener(listener: OnClickListener) = binding.errorViewId.setTryAgainClickListener(listener)

    // Setting the visibility of the view in child
    fun hideChildView() {
        binding.errorViewId.hideView()
    }

}