package com.example.hanwhalife

import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeFrame = HomeFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameMain,homeFrame)
            commit()
        }

        val navigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView);
        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.itemHome ->{
                    val homeFrame = HomeFragment()
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameMain,homeFrame)
                        commit()
                    }
                    true
                }
                R.id.itemDichVu ->{
                    val dichVuFrame = DichVuFragment()
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameMain,dichVuFrame)
                        commit()
                    }
                    true
                }

                R.id.itemHopDong  ->{
                    val hopDongFrame = HopDongFragment()
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameMain,hopDongFrame)
                        commit()
                    }
                    true
                }

                R.id.itemKhac ->{
                    val otherFrame = OtherFragment()
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameMain,otherFrame)
                        commit()
                    }
                    true
                }
                else -> {true}
            }
        }
    }


}