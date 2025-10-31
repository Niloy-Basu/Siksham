package com.example.siksham.ui.theme

import androidx.annotation.DrawableRes
import com.example.siksham.R

// Data model
data class PCourseItem(
    @DrawableRes val drawables: Int,
    val text: String,
    val texts: String
)

// Sample data
internal val Data = listOf(
    PCourseItem(R.drawable.i5,"Tatvabodha: Samkhya Darshan Live Class","by Vishal Chaurasia"),
    PCourseItem(R.drawable.i2, "Tatvabodha: Yoga Darshan Live Class","by Vishal Chaurasia"),
    PCourseItem(R.drawable.i2, "Tatvabodha: Decoding the principles of Tantra","by Vishal Chaurasia"),
    // Add more as needed
)
