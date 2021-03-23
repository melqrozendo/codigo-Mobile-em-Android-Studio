package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = findViewById(R.id.btLogin);

        btLogin.setOnClickstenner (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                TextView tLogin = (TextView) findViewById(R.id. tLogin);
                TextView tSenha = (TextView) findViewById(R.id. tSenha);}}
                //String Login = tLogin.getText ().toString();
                //String Senha = tSenha.getText ().toString();}}};

                //if(login.equals("uninassau")&&senha.equals("123")){
                  //  alert("login realizado com sucesso.");
                //}else{
                  //  alert("login ou senha incorreta.");






            //private void alert(String s){
              //  Toast.makeText(this,s, Toast.LENGTH_LONG.show());}
