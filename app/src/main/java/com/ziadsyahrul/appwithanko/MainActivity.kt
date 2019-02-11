package com.ziadsyahrul.appwithanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnHello.onClick {
            toast("Hello, ${edtNama.text}") }

        btnAlert.onClick {
            alert("Happy Training", "Hello, ${edtNama.text}!"){
                yesButton { toast("Ohh.....") }
                noButton {}
            }.show()
        }

        btnSelector.onClick {
            val club = listOf("Arsenal", "Real Madrid", "Barcelona", "Liverpool")
            selector("Hello, ${edtNama.text}! Apa Club bola yang anda sukai?", club){_ , i ->
                toast("Jadi kamu menyukai, ${club}, benar")
            }
        }

        btnSnackbar.onClick {
            snackbar(edtNama, "Hai, ${edtNama.text}")
        }
    }
}
