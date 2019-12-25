package com.example.matala3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    private Intent nextAcyvity4;
private TextView textViewHello;
private ImageButton prodact1,prodact2,prodact3,prodact4;
private TextView nameProdact1,nameProdact2,nameProdact3,nameProdact4;

    private String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        takeValues();
        goToNextActivity();
    }


    private void takeValues() {
         user=getIntent().getExtras().getString("userName","no value");
        textViewHello=findViewById(R.id.t_v_name);
        textViewHello.setText("  שלום- "+user);
        textViewHello.setTextSize(20);
        Toast.makeText(this, " פרטיך התקבלו בהצלחה!  "+user.toString() ,Toast.LENGTH_LONG).show();
    }

    private void goToNextActivity() {

        prodact1=findViewById(R.id.product_1);
        prodact1.setImageDrawable(getDrawable(R.drawable.m1));
        prodact2=findViewById(R.id.product_2);
        prodact2.setImageDrawable(getDrawable(R.drawable.m2));
        prodact3=findViewById(R.id.product_3);
        prodact3.setImageDrawable(getDrawable(R.drawable.m3));
        prodact4=findViewById(R.id.product_4);
        prodact4.setImageDrawable(getDrawable(R.drawable.m4));

        nameProdact1=findViewById(R.id.text_product_1);
        nameProdact1.setText("מתאם USB");
        nameProdact2=findViewById(R.id.text_product_2);
        nameProdact2.setText(" אוזניות");
        nameProdact3=findViewById(R.id.text_product_3);
        nameProdact3.setText(" שעון חכם");
        nameProdact4=findViewById(R.id.text_product_4);
        nameProdact4.setText(" אוניות נגד מים");



prodact1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        nextAcyvity4 = new Intent(Activity3.this, Activity4.class);
        nextAcyvity4.putExtra("nameProdact1","מתאם USB");
        nextAcyvity4.putExtra("prodact1ImagesendToAcyivity4",R.drawable.m1);
        nextAcyvity4.putExtra("whichProdactHesBeenPreesd",1);
        startActivity(nextAcyvity4);
    }
});

        prodact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextAcyvity4 = new Intent(Activity3.this, Activity4.class);
                nextAcyvity4.putExtra("nameProdact2"," אוזניות");
                nextAcyvity4.putExtra("prodact2ImagesendToAcyivity4",R.drawable.m2);
                nextAcyvity4.putExtra("whichProdactHesBeenPreesd",2);
                startActivity(nextAcyvity4);
            }
        });

        prodact3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextAcyvity4 = new Intent(Activity3.this, Activity4.class);
                nextAcyvity4.putExtra("nameProdact3"," שעון חכם");
                nextAcyvity4.putExtra("prodact3ImagesendToAcyivity4",R.drawable.m3);
                nextAcyvity4.putExtra("whichProdactHesBeenPreesd",3);
                startActivity(nextAcyvity4);
            }
        });

        prodact4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextAcyvity4 = new Intent(Activity3.this, Activity4.class);
                nextAcyvity4.putExtra("nameProdact4"," אוניות נגד מים");
                nextAcyvity4.putExtra("prodact4",R.id.product_4);
                nextAcyvity4.putExtra("prodact4ImagesendToAcyivity4",R.drawable.m4);
                nextAcyvity4.putExtra("whichProdactHesBeenPreesd",4);
                startActivity(nextAcyvity4);
            }
        });
    }
}
