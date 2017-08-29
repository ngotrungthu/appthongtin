package com.ntt.atb_trungthu.appthongtin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtthongtin;
    Button btnxacnhan,btnnext;
    EditText hovaten,email,sdt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //chuyển trang kế tiếp
        btnnext=(Button)findViewById(R.id.buttonext) ;
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2 =new Intent(MainActivity.this,MENU.class);
                startActivity(mh2);
            }
        });

        //app thông tin
        anhxa();
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten=hovaten.getText().toString();
                String Email=email.getText().toString();
                String Sdt=sdt.getText().toString();
                txtthongtin.setText("chào bạn : "+ hoten   +"\nEmail:"+ Email +"\nSố điện thoại:"+ Sdt);
            }
        });
    }
    private    void anhxa() {

        txtthongtin = (TextView) findViewById(R.id.textViewthongtin);
        btnxacnhan = (Button) findViewById(R.id.buttonext);
        hovaten = (EditText) findViewById(R.id.editTexthovaten);
        email = (EditText) findViewById(R.id.editemail);
        sdt = (EditText) findViewById(R.id.editsdt);
    }


    }
