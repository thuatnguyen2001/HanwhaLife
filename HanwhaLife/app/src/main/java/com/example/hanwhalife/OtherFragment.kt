package com.example.hanwhalife

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout

class OtherFragment : Fragment() {

    lateinit var btnThongTinCaNhan:LinearLayout
    lateinit var btnContact:LinearLayout
    lateinit var btnDoiMatKhau:LinearLayout
    lateinit var btnDangXuat:LinearLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        anhXa(view)
        addEvent()
    }


    private fun addEvent() {
        xuLyThongTinCaNhan()
        xuLyContact()
    }

    private fun xuLyContact() {
        btnContact.setOnClickListener {
            val intent = Intent(activity, ContactActivity::class.java)
            startActivity(intent)
        }
    }

    private fun xuLyThongTinCaNhan() {

    }

    private fun anhXa(view: View) {
        btnThongTinCaNhan = view.findViewById(R.id.btnThongTinCaNhan)
        btnContact = view.findViewById(R.id.btnContact)
        btnDoiMatKhau = view.findViewById(R.id.btnDoiMatKhau)
        btnDangXuat = view.findViewById(R.id.btnDangXuat)

    }
}