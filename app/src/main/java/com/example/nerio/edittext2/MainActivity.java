package com.example.nerio.edittext2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EditText_Nombre, EditText_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText_Nombre = findViewById(R.id.editText_Nombre);
        EditText_Password = findViewById(R.id.editText_Password);
    }

    //Metodo para el boton
    public void Registrar (View Vista) {
        String Nombre = EditText_Nombre.getText().toString();
        String Password = EditText_Password.getText().toString();

        if (Nombre.length()== 0)
            Toast.makeText(this, "Debes ingresar un Usuario", Toast.LENGTH_LONG).show();
        if (Password.length()==0)
            Toast.makeText(this, "Debes ingresar una Contraseña", Toast.LENGTH_LONG).show();
        if (Nombre.length()!= 0 && Password.length() !=0)
            Toast.makeText(this, "Verificando datos", Toast.LENGTH_LONG).show();
        //if (Nombre.isEmpty() || Password.isEmpty()) {
        //    Toast.makeText(this, "Nombre y Password debe tener información", Toast.LENGTH_SHORT).show();
        //}
    }
}
