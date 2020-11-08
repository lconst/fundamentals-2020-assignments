package com.android.fundamentals.task_four

import android.app.Dialog
import android.view.View
import com.android.fundamentals.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SampleBottomSheet : BottomSheetDialogFragment() {

    override fun setupDialog(
        dialog: Dialog,
        style: Int
    ) {
        val contentView =
            View.inflate(context, R.layout.dialog_fragment, null)
        dialog.setContentView(contentView)
        (contentView.parent as View).setBackgroundColor(
            resources.getColor(
                android.R.color.transparent
            )
        )
    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog?.window?.setLayout(width, height)
    }
}