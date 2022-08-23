package com.demo.code.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.demo.code.databinding.ErrorViewBinding

class ErrorView  @JvmOverloads constructor(context: Context,
                                           attributes: AttributeSet? = null,
                                           defStyleAttr: Int = 0
) : ConstraintLayout(context, attributes, defStyleAttr) {

    companion object {
        const val TAG = "ErrorView"
    }

    private var binding = ErrorViewBinding.inflate(LayoutInflater.from(context), this, true)

    fun hideView() {
        binding.txtPleaseTryAgain.visibility = View.GONE
    }

    fun setTryAgainClickListener(listener: OnClickListener) = binding.txtTryAgain.setOnClickListener(listener)

}