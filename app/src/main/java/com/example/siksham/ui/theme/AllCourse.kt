package com.example.siksham.ui.theme

import androidx.annotation.DrawableRes
import com.example.siksham.R

data class CourseItems(
    @DrawableRes val drawable: Int,
    val text: String,
    val texts: String
)

// Sample data
internal val D = listOf(
    CourseItems(R.drawable.i5,"Reset your emotions through ancient Smakya Dharsan","by Acharya Jamwat"),
    CourseItems(R.drawable.i2, "Bodhisattva: Yoga Darshan Live Class","by Vishal Chaurasia"),
    CourseItems(R.drawable.i2, "Bodhisattva: Decoding the principles of Tantra","by Vishal Chaurasia"),
    // Add more as needed
)