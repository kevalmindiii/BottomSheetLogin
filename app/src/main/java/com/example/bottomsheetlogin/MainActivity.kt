package com.example.bottomsheetlogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.bottomsheetlogin.databinding.ActivityMainBinding
import com.example.bottomsheetlogin.secondScreen.ShowSignupDetailsActivity
import com.google.android.material.bottomsheet.BottomSheetDialog


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsignupinligin.setOnClickListener {
            callBottomSheet()


        }
        binding.btnForgot.setOnClickListener {
            callBottomSheet()
        }
        binding.btnSubmit.setOnClickListener {
            callSecondScreen()
        }

    }
     private fun callBottomSheet()
     {
         val bottomSheet = LoginDialogFragment()
         bottomSheet.show(
                 supportFragmentManager,
                 "ModalBottomSheet")
     }
    private  fun callSecondScreen()
    {
        val intent:Intent = Intent(this@MainActivity, ShowSignupDetailsActivity::class.java)
        startActivity(intent)
    }



}