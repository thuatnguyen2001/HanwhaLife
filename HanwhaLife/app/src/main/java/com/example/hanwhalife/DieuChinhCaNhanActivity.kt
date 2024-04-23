package com.example.hanwhalife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class DieuChinhCaNhanActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieu_chinh_ca_nhan)

        val value = intent.getStringExtra("DieuChinh")

        if(value==null)
        {
            val buoc1Frame = DieuChinhCaNhan1Fragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameDieuChinh, buoc1Frame)
                commit()
            }
        }else
        {
            val buoc2Frame = DieuChinhCaNhan2Fragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameDieuChinh,buoc2Frame)
                commit()
            }
        }


    }

}