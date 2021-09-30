package com.example.kotlin1_21

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

fun ImageView.gliding(uri: String) {
    Glide.with(this)
        .load(uri)
        .circleCrop()
        .into(this)
}
fun Context.showToast(messege: String){
    Toast.makeText(this,messege,Toast.LENGTH_SHORT).show()
}