package com.demo.code.utils

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
 * Extension method use to display a [Snackbar] message to the user.
 */
fun View.displaySnakbar(message: String, duration: Int = Snackbar.LENGTH_SHORT): Snackbar {
    val snakbar = Snackbar.make(this, message, duration)
    snakbar.show()
    return snakbar
}