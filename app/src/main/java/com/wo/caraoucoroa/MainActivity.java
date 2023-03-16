package com.wo.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Button btnJogar = findViewById(R.id.btn_jogar);

      btnJogar.setOnClickListener(view -> {
         int numero = new Random().nextInt(2);
         Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

         intent.putExtra("numero", numero);
         startActivity(intent);
      });

   }
}