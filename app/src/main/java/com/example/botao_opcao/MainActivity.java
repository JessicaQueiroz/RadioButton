package com.example.botao_opcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton masculino, feminino;
    private TextView tv_resultado;
    private RadioGroup opcao_sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masculino = findViewById(R.id.rb_homem);
        feminino = findViewById(R.id.rb_mulher);
        tv_resultado = findViewById(R.id.tv_resultado);
        opcao_sexo = findViewById(R.id.rg_sexo);

        escolha();
    }
    public void escolha(){
        opcao_sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                if (checkId == R.id.rb_homem){
                    tv_resultado.setText("Sexo masculino");
                }

                else if(checkId == R.id.rb_mulher){
                    tv_resultado.setText("Sexo Feminino");
                }
            }
        });
    }
}
