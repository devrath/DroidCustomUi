package com.demo.code.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

class GameStreamErrorView  @JvmOverloads constructor(context: Context,
                                                     attributes: AttributeSet? = null,
                                                     defStyleAttr: Int = 0
) : ConstraintLayout(context, attributes, defStyleAttr) {

    companion object {
        const val TAG = "GameStreamErrorView : GameStreamErrorView"
    }

    /*private var mBinding: GameStreamErrorViewBinding = bind(LayoutInflater.from(context),R.layout.game_stream_error_view)

    fun setCloseButtonInvisible() {
        mBinding.streamCloseId.invisiable()
    }

    fun setCloseButtonVisible() {
        mBinding.streamCloseId.visiable()
    }

    fun setCloseClickListener(listener: OnClickListener) {
        mBinding.streamCloseId.setOnClickListener(listener)
    }

    fun setTryAgainClickListener(listener: OnClickListener) {
        mBinding.txtTryAgain.setOnClickListener(listener)
    }*/

}