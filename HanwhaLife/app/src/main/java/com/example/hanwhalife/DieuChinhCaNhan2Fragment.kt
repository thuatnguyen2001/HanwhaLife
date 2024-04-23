package com.example.hanwhalife

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class DieuChinhCaNhan2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_dieu_chinh_ca_nhan2, container, false)

        val btnBack = view.findViewById<LinearLayout>(R.id.btnBack)
        val btnNext = view.findViewById<LinearLayout>(R.id.btnNext)

        btnBack.setOnClickListener {

        }

        return view;
    }

}