package com.example.siksham.ui.theme

import com.example.siksham.R

internal val alignYourBodyData = listOf(
    DrawableStringPair(R.drawable.i5, "Description for image2"),
    DrawableStringPair(R.drawable.i2, "Description for image1"),
    DrawableStringPair(R.drawable.i5, "Description for image1")

)
data class DrawableStringPair(
    val drawable: Int,
    val description: String,

)