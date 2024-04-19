package com.example.hanwhalife


import android.os.Bundle
import android.text.InputType
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    lateinit var edtUserName:EditText;
    lateinit var edtPassword:EditText;
    lateinit var btnView:ImageButton;
    lateinit var ckbLogin:CheckBox;
    lateinit var btnLogin:Button;
    lateinit var txtQuenMK:TextView;
    var viewPassword =true;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        anhXa();
        addEvent();
    }

    private fun addEvent() {
        hienThiMatKhau()
    }

    private fun hienThiMatKhau() {
        btnView.setOnClickListener {
            if(viewPassword){
                edtPassword.inputType = 1
                btnView.setImageResource(R.drawable.invisible)
                viewPassword = false
            }else{
                edtPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                btnView.setImageResource(R.drawable.visible)
                viewPassword = true
            }
        }
    }

    private fun anhXa() {
        edtUserName = findViewById(R.id.edtUserName)
        edtPassword = findViewById(R.id.edtPassword)
        btnView = findViewById(R.id.btnView)
        ckbLogin = findViewById(R.id.ckbLogin)
        btnLogin = findViewById(R.id.btnLogin)
        txtQuenMK = findViewById(R.id.txtQuenMK)
    }
}