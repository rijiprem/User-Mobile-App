package com.riji.userapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerform(view: View) {
        intent= Intent(this,RegisterActivity::class.java);
        startActivity(intent);
    }

    fun login(view: View) {
        var getEmailId=findViewById<EditText>(R.id.email);
        var getPassword=findViewById<EditText>(R.id.password);
        Toast.makeText(this,getEmailId.text.toString()+ "  "+getPassword.text.toString(),Toast.LENGTH_LONG).show();
    }
}