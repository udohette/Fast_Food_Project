package com.example.android.fastfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox Rice,Beans, Plantain,AfangSoup,Egusi,Salad, WhiteSoup,Vegetable;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        //Getting instance of checkBoxes and  Button from Activity_main_xml file
        Rice=(CheckBox)findViewById(R.id.CheckBox1);
        Beans=(CheckBox)findViewById(R.id.checkbox2);
        Plantain=(CheckBox)findViewById(R.id.checkbox3);
        AfangSoup=(CheckBox)findViewById(R.id.checkbox4);
        Egusi=(CheckBox)findViewById(R.id.checkbox5);
        WhiteSoup=(CheckBox)findViewById(R.id.checkbox6);
        Salad=(CheckBox)findViewById(R.id.checkbox7);
        Vegetable=(CheckBox)findViewById(R.id.checkbox8);
        buttonOrder=(Button)findViewById(R.id.Button1);
        //Applying the LISTENER ON THE BUTTON CLICK
        buttonOrder.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
               int totalAmount = 0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if (Rice.isChecked()){
                    result.append("\nRice #350");
                    totalAmount+=350;
                }
                if (Beans.isChecked()) {
                    result.append("\nBeans #200");
                    totalAmount += 200;
                }
                if (Plantain.isChecked()) {
                    result.append("\nPlantain #100");
                    totalAmount += 100;
                }
                if (WhiteSoup.isChecked()) {
                    result.append("\nWhite Soup #400");
                    totalAmount += 400;
                }
                if (Vegetable.isChecked()) {
                    result.append("\nVegetable #450");
                    totalAmount += 450;
                }
                if (Egusi.isChecked()) {
                    result.append("\nEgusi #250");
                    totalAmount += 250;
                }
                if (AfangSoup.isChecked()) {
                    result.append("\nAfang Soup #450");
                    totalAmount += 450;
                }
                if (Salad.isChecked()) {
                    result.append("\nSalad #100");
                    totalAmount += 100;
                }
                result.append("\nTotal: "+"#"+totalAmount);
                //Display the Message on the Toast
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
