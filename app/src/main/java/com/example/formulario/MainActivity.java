package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, control, carrera, semestre, edad, domicilio;
    private TextView nom, nc, car, sem, ed, dom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.nombre);
        control=findViewById(R.id.control);
        carrera=findViewById(R.id.carrera);
        semestre=findViewById(R.id.semestre);
        edad=findViewById(R.id.edad);
        domicilio=findViewById(R.id.domicilio);
        nom=findViewById(R.id.nom);
        nc=findViewById(R.id.nc);
        car=findViewById(R.id.car);
        sem=findViewById(R.id.sem);
        ed=findViewById(R.id.ed);
        dom=findViewById(R.id.dom);
    }
    public void alta(View view){
        String a=nombre.getText().toString();
        String b=control.getText().toString();
        String c=carrera.getText().toString();
        String d=semestre.getText().toString();
        String e=edad.getText().toString();
        String f=domicilio.getText().toString();

        nom.setText(""+a);
        nc.setText(""+b);
        car.setText(""+c);
        sem.setText(""+d);
        ed.setText(""+e);
        dom.setText(""+f);

    }
    public void limpiar(View view) {
        nombre.setText("");
        control.setText("");
        carrera.setText("");
        semestre.setText("");
        edad.setText("");
        domicilio.setText("");
        nom.setText("");
        nc.setText("");
        car.setText("");
        sem.setText("");
        ed.setText("");
        dom.setText("");

    }
}