package com.example.togglebutton_and_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResultado;
    private CheckBox checkSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha     = findViewById(R.id.toggleSenha);
        switchSenha     = findViewById(R.id.switchSenha);
        textResultado   = findViewById(R.id.textResultado);
        checkSenha      = findViewById(R.id.checkSenha);

        //adicionarListener();


    }
    public void  adicionarListener(){

        /*switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if( isChecked ){
                    textResultado.setText("Ligado");
                }else{
                    textResultado.setText("Desligado");
                }

            }
        });

         */

    }

    public void enviar(View view){
        String text = "";
        String text2 = "";
        if( switchSenha.isChecked() ){
            text = "Switch Ligado ";
            textResultado.setText(text);
        }else{
            text = "Switch Desligado ";
            textResultado.setText(text);
        }
        if( toggleSenha.isChecked() ){
            text2 = " Toggle Ligado ";
            textResultado.setText(text + text2);
        }else{
            text2 = " Toggle Desligado ";
            textResultado.setText(text + text2);
        }
        if( checkSenha.isChecked() ){
            textResultado.setText(text + text2 + " CheckBox Ligado");
        }else{
            textResultado.setText(text + text2 + " CheckBox Desligado");
        }




    }


}