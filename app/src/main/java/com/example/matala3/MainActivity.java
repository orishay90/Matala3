package com.example.matala3;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ImageView imageView;
private Intent nextPage;
    private ArrayList<Drawable> images;
    private ImageView imageView2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        nextActivity();
        startThread();
       startThreadTmonot();
       addArrayListImages();

    }

    private void startThreadTmonot() {
        imageView2=findViewById(R.id.image_mov);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                {
                    for (int i = 0; i <images.size() ; i++)
                    {
                        try {
                            Thread.sleep(120);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        final int finalI = i;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                imageView2.setImageDrawable(images.get(finalI));

                            }
                        });

                    }

                }
            }
        }).start();
    }
    private void addArrayListImages() {
        images=new ArrayList<>();
        images.add(getDrawable(R.drawable.b1));
        images.add(getDrawable(R.drawable.b2));
        images.add(getDrawable(R.drawable.b3));

    }
    private void nextActivity() {
        nextPage = new Intent(this, Activity2.class);
       // finish();
    }




    private void startThread() {
        //imageView=findViewById(R.id.imageView4);
         new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3500);
                    startActivity(nextPage);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
