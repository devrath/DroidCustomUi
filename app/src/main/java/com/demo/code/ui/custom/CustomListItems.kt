package com.demo.code.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.code.R
import com.demo.code.databinding.ListCustomViewBinding

class CustomListItems  @JvmOverloads constructor(context: Context,
                                                 attributes: AttributeSet? = null,
                                                 defStyleAttr: Int = 0)
    : ConstraintLayout(context, attributes, defStyleAttr) {

    companion object {
        const val TAG = "ParentErrorView"
    }

    private var binding = ListCustomViewBinding.inflate(LayoutInflater.from(context), this, true)

    private var adapter : CustomListAdapter = CustomListAdapter()

    init {
        setListViewDisplay()
    }

   /* fun updateTracks(tracksList: MplTrackList) {
        adapter.updateTracks(tracksList)
    }*/

    fun setCallback(callback: CustomListAdapter.Callback) {
        adapter.setCallback(callback)
    }

    private fun setListViewDisplay() {
        binding.listId.layoutManager = videoListLayoutManager()
        binding.listId.addItemDecoration(videosDividerItemDecoration())
        binding.listId.itemAnimator = DefaultItemAnimator()
        binding.listId.adapter = adapter
    }


    private fun videoListLayoutManager(): LinearLayoutManager {
        val recommendedVideosManager = LinearLayoutManager(context)
        recommendedVideosManager.orientation = LinearLayoutManager.HORIZONTAL
        return recommendedVideosManager
    }

    private fun videosDividerItemDecoration(): DividerItemDecoration {
        val verticalDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        val verticalDivider = ContextCompat.getDrawable(context, R.drawable.reco_vid_divider)
        verticalDecoration.setDrawable(verticalDivider!!)
        return verticalDecoration
    }

}
