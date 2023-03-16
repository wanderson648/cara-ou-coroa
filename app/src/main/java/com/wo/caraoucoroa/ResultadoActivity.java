package com.wo.caraoucoroa;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

   private Button btnVoltar;
   private ImageView imageResultado;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_resultado);

      btnVoltar = findViewById(R.id.btn_voltar);
      imageResultado = findViewById(R.id.img_resultado);

      Bundle dados = getIntent().getExtras();
      int numero = dados.getInt("numero");

      if(numero == 0) {
         imageResultado.setImageResource(R.drawable.moeda_cara);
      } else {
         imageResultado.setImageResource(R.drawable.moeda_coroa);
      }


      btnVoltar.setOnClickListener(view -> {
         finish();
      });
   }
}