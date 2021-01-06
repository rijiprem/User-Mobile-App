package com.riji.userapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun registration(view: View) {
        var getName=findViewById<EditText>(R.id.name);
        var getPlace=findViewById<EditText>(R.id.place);
        var getPhoneNumber=findViewById<EditText>(R.id.phone);
        var getPassword=findViewById<EditText>(R.id.pass);
        var getConfirmPassword=findViewById<EditText>(R.id.confirm);
        Toast.makeText(this,getName.text.toString()+" "
                +getPlace.text.toString()+"  "+getPhoneNumber.text.toString()+"  "+
                getPassword.text.toString()+"  "+getConfirmPassword.text.toString(),Toast.LENGTH_LONG).show();
    }
    fun backtologin(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}