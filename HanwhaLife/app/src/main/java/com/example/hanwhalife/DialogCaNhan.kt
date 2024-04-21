package com.example.hanwhalife

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DialogCaNhan : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dialog_ca_nhan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnClose = view.findViewById<ImageButton>(R.id.btnClose)
        val btnListYeuCau = view.findViewById<Button>(R.id.btnListYeuCau)
        val btnNewYeuCau = view.findViewById<Button>(R.id.btnNewYeuCau)

        btnClose.setOnClickListener {
            this.dismiss()
        }

        btnNewYeuCau.setOnClickListener {
            val intent = Intent(activity, DieuChinhCaNhanActivity::class.java)
            startActivity(intent)
            this.dismiss()
        }

        btnListYeuCau.setOnClickListener {
            Toast.makeText(this.context,"List",Toast.LENGTH_SHORT).show()
        }
    }
}