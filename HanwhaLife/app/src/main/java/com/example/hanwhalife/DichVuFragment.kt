package com.example.hanwhalife

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DichVuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DichVuFragment : Fragment() {


    lateinit var itemGQQL: LinearLayout
    lateinit var itemThanhToan: LinearLayout
    lateinit var itemDieuChinhTTCN: LinearLayout
    lateinit var itemDieuChinhHD: LinearLayout
    lateinit var itemChamSoc: LinearLayout
    lateinit var itemThuVien: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dich_vu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        anhXa(view)
        addEvent()
    }

    private fun addEvent() {
        xuLyChucNangGQQL();
        xuLyChucNangThanhToan();
        xuLyChucNangDieuChinhTTCN();
        xuLyChucNangDieuChinhHD();
        xuLyChucNangChamSoc();
        xuLyChucNangThuVien();
    }

    private fun xuLyChucNangThuVien() {
        itemThuVien.setOnClickListener{
            Toast.makeText(this.context,"Chức năng này đang cập nhật", Toast.LENGTH_SHORT).show();
        }
    }

    private fun xuLyChucNangChamSoc() {
        itemChamSoc.setOnClickListener{
            Toast.makeText(this.context,"Chức năng này đang cập nhật", Toast.LENGTH_SHORT).show();
        }
    }

    private fun xuLyChucNangDieuChinhHD() {
        itemDieuChinhHD.setOnClickListener{
            Toast.makeText(this.context,"Chức năng này đang cập nhật", Toast.LENGTH_SHORT).show();
        }
    }

    private fun xuLyChucNangDieuChinhTTCN() {
        itemDieuChinhTTCN.setOnClickListener{
            Toast.makeText(this.context,"Chức năng này đang cập nhật", Toast.LENGTH_SHORT).show();
        }
    }

    private fun xuLyChucNangThanhToan() {
        itemThanhToan.setOnClickListener{
            Toast.makeText(this.context,"Chức năng này đang cập nhật", Toast.LENGTH_SHORT).show();
        }
    }

    private fun xuLyChucNangGQQL() {
        itemGQQL.setOnClickListener{
            Toast.makeText(this.context,"Chức năng này đang cập nhật", Toast.LENGTH_SHORT).show();
        }
    }

    private fun anhXa(view: View) {
        itemGQQL = view.findViewById(R.id.itemGQQL)
        itemThanhToan = view.findViewById(R.id.itemThanhToan)
        itemDieuChinhTTCN = view.findViewById(R.id.itemDieuChinhTTCN)
        itemDieuChinhHD = view.findViewById(R.id.itemDieuChinhHD)
        itemChamSoc = view.findViewById(R.id.itemChamSoc)
        itemThuVien = view.findViewById(R.id.itemThuVien)
    }
}

