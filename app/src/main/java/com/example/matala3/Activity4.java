package com.example.matala3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    private ImageView prodact1TakesImega, prodact2TakesImega, prodact3TakesImega, prodact4TakesImega;
    private String nameProdact1, nameProdact2, nameProdact3, nameProdact4;
    private Button buttonPhone, buttonMessaging, buttonEmeil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        showDataProdct();

    }


    private void showDataProdct() {

        switch (getIntent().getExtras().getInt("whichProdactHesBeenPreesd")) {
            case 1:
                nameProdact1 = getIntent().getExtras().getString("nameProdact1", "no value");
                TextView nameProdct1 = findViewById(R.id.tv_name_prodact);
                nameProdct1.setText("שם מוצר :" + nameProdact1);
                prodact1TakesImega = findViewById(R.id.show_the_Image_prodact);
                prodact1TakesImega.setImageDrawable(getDrawable(getIntent().getExtras().getInt("prodact1ImagesendToAcyivity4")));


                final Prodact prodact1 = new Prodact("שי", "אשדוד", 11111, 11, "מוצר אשר הופך חייך קלים 'ג'פרי תן' ", 350);
                TextView adreesProdact1 = findViewById(R.id.tv_adress);
                adreesProdact1.setText("כתובת :" + prodact1.getAddress());
                TextView nameSelerProdact1 = findViewById(R.id.tv_name_seler);
                nameSelerProdact1.setText("שם מוכר :" + prodact1.getName());
                TextView phoneSelerProdact1 = findViewById(R.id.tv_number);
                phoneSelerProdact1.setText("מספר טלפון :" + prodact1.getPhone());
                TextView descriptionProdact1 = findViewById(R.id.tv_description);
                descriptionProdact1.setText("תיאור :" + prodact1.getDescription());
                TextView priceProdact1 = findViewById(R.id.tv_price);
                priceProdact1.setText("מחיר :" + prodact1.getPrice());
                TextView codPrice1 = findViewById(R.id.tv_cod_prodact);
                codPrice1.setText("קוד מוצר :" + prodact1.getCood());
                buttonPhone = findViewById(R.id.button_phone);
                buttonPhone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(Intent.ACTION_DIAL);
                        intent1.setData(Uri.parse("tel:-" + prodact1.getPhone()));
                        startActivity(intent1);
                    }
                });
                buttonMessaging = findViewById(R.id.button_messaging);
                buttonMessaging.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + prodact1.getPhone()));
                        startActivity(intent1);
                    }
                });
                buttonEmeilSwitch(1);

                break;
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 2:
                nameProdact2 = getIntent().getExtras().getString("nameProdact2", "no value");
                TextView nameProdct2 = findViewById(R.id.tv_name_prodact);
                nameProdct2.setText("שם מוצר :" + nameProdact2);
                prodact2TakesImega = findViewById(R.id.show_the_Image_prodact);
                prodact2TakesImega.setImageDrawable(getDrawable(getIntent().getExtras().getInt("prodact2ImagesendToAcyivity4")));


                final Prodact prodact2 = new Prodact("אוריאל", "אשקלון", 22222, 12, "  אוזניות אלחוטיות מצויינות 'לי'", 400);
                TextView adreesProdact2 = findViewById(R.id.tv_adress);
                adreesProdact2.setText("כתובת :" + prodact2.getAddress());
                TextView nameSelerProdact2 = findViewById(R.id.tv_name_seler);
                nameSelerProdact2.setText("שם מוכר :" + prodact2.getName());
                TextView phoneSelerProdact2 = findViewById(R.id.tv_number);
                phoneSelerProdact2.setText("מספר טלפון :" + prodact2.getPhone());
                TextView descriptionProdact2 = findViewById(R.id.tv_description);
                descriptionProdact2.setText("תיאור :" + prodact2.getDescription());
                TextView priceProdact2 = findViewById(R.id.tv_price);
                priceProdact2.setText("מחיר :" + prodact2.getPrice());
                TextView codPrice2 = findViewById(R.id.tv_cod_prodact);
                codPrice2.setText("קוד מוצר :" + prodact2.getCood());
                buttonPhone = findViewById(R.id.button_phone);
                buttonPhone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(Intent.ACTION_DIAL);
                        intent1.setData(Uri.parse("tel:-" + prodact2.getPhone()));
                        startActivity(intent1);
                    }
                });
                buttonMessaging = findViewById(R.id.button_messaging);
                buttonMessaging.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + prodact2.getPhone()));
                        startActivity(intent1);
                    }
                });
                buttonEmeilSwitch(2);
                break;
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 3:

                nameProdact3 = getIntent().getExtras().getString("nameProdact3", "no value");
                prodact3TakesImega = findViewById(R.id.show_the_Image_prodact);
                prodact3TakesImega.setImageDrawable(getDrawable(getIntent().getExtras().getInt("prodact3ImagesendToAcyivity4")));

                TextView nameProdct3 = findViewById(R.id.tv_name_prodact);
                nameProdct3.setText("שם מוצר :" + nameProdact3);

                final Prodact prodact3 = new Prodact("יעל", " תל אביב", 33333, 13, "שעון חכם הופך החיים קלים '100'", 235);
                TextView adreesProdact3 = findViewById(R.id.tv_adress);
                adreesProdact3.setText("כתובת :" + prodact3.getAddress());
                TextView nameSelerProdact3 = findViewById(R.id.tv_name_seler);
                nameSelerProdact3.setText("שם מוכרת :" + prodact3.getName());
                TextView phoneSelerProdact3 = findViewById(R.id.tv_number);
                phoneSelerProdact3.setText("מספר טלפון :" + prodact3.getPhone());
                TextView descriptionProdact3 = findViewById(R.id.tv_description);
                descriptionProdact3.setText("תיאור :" + prodact3.getDescription());
                TextView priceProdact3 = findViewById(R.id.tv_price);
                priceProdact3.setText("מחיר :" + prodact3.getPrice());
                TextView codPrice3 = findViewById(R.id.tv_cod_prodact);
                codPrice3.setText("קוד מוצר :" + prodact3.getCood());
                buttonPhone = findViewById(R.id.button_phone);
                buttonPhone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(Intent.ACTION_DIAL);
                        intent1.setData(Uri.parse("tel:-" + prodact3.getPhone()));
                        startActivity(intent1);
                    }
                });
                buttonMessaging = findViewById(R.id.button_messaging);
                buttonMessaging.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + prodact3.getPhone()));
                        startActivity(intent1);
                    }
                });
                buttonEmeilSwitch(3);
                break;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 4:

                prodact4TakesImega = findViewById(R.id.show_the_Image_prodact);
                prodact4TakesImega.setImageDrawable(getDrawable(getIntent().getExtras().getInt("prodact4ImagesendToAcyivity4")));

                nameProdact4 = getIntent().getExtras().getString("nameProdact4", "no value");
                TextView nameProdct4 = findViewById(R.id.tv_name_prodact);
                nameProdct4.setText("שם מוצר :" + nameProdact4);

                final Prodact prodact4 = new Prodact("שלום", "קרית גת ", 44444, 14, "אוזניות אלחוטיות נגד מים 'נקודות'", 500);
                TextView adreesProdact4, nameSelerProdact4, phoneSelerProdact4, descriptionProdact4, priceProdact, codPrice4;
                adreesProdact4 = findViewById(R.id.tv_adress);
                adreesProdact4.setText("כתובת :" + prodact4.getAddress());
                nameSelerProdact4 = findViewById(R.id.tv_name_seler);
                nameSelerProdact4.setText("שם מוכר :" + prodact4.getName());
                phoneSelerProdact4 = findViewById(R.id.tv_number);
                phoneSelerProdact4.setText("מספר טלפון :" + prodact4.getPhone());
                descriptionProdact4 = findViewById(R.id.tv_description);
                descriptionProdact4.setText("תיאור :" + prodact4.getDescription());
                priceProdact = findViewById(R.id.tv_price);
                priceProdact.setText("מחיר :" + prodact4.getPrice());
                codPrice4 = findViewById(R.id.tv_cod_prodact);
                codPrice4.setText("קוד מוצר :" + prodact4.getCood());

                buttonPhone = findViewById(R.id.button_phone);
                buttonPhone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(Intent.ACTION_DIAL);
                        intent1.setData(Uri.parse("tel:-" + prodact4.getPhone()));
                        startActivity(intent1);
                    }
                });

                buttonMessaging = findViewById(R.id.button_messaging);
                buttonMessaging.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + prodact4.getPhone()));
                        startActivity(intent1);
                    }
                });
                buttonEmeilSwitch(4);

                break;
        }
    }


        private void buttonEmeilSwitch(final int whichButtonEmeilHesBeenPreesd){

            buttonEmeil = findViewById(R.id.button_emeil);
            buttonEmeil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (whichButtonEmeilHesBeenPreesd) {
                        case 1:
                            Intent intent1 = new Intent(Intent.ACTION_SEND);
                            intent1.setType("plain/text");
                            intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"shay120levi@gmail.com"});
                            intent1.putExtra(Intent.EXTRA_SUBJECT, "קוד מוצר 11 ");
                            startActivity(intent1);

                            break;
                        case 2:
                            Intent intent2 = new Intent(Intent.ACTION_SEND);
                            intent2.setType("plain/text");
                            intent2.putExtra(Intent.EXTRA_EMAIL, new String[]{"or120shay@gmail.com"});
                            intent2.putExtra(Intent.EXTRA_SUBJECT, "קוד מוצר 12 ");
                            startActivity(intent2);

                            break;
                        case 3:
                            Intent intent3 = new Intent(Intent.ACTION_SEND);
                            intent3.setType("plain/text");
                            intent3.putExtra(Intent.EXTRA_EMAIL, new String[]{"yael456cohen@gmail.com"});
                            intent3.putExtra(Intent.EXTRA_SUBJECT, "קוד מוצר 13 ");
                            startActivity(intent3);

                            break;

                        case 4:
                            Intent intent4 = new Intent(Intent.ACTION_SEND);
                            intent4.setType("plain/text");
                            intent4.putExtra(Intent.EXTRA_EMAIL, new String[]{"shalom123trabelsi@gmail.com"});
                            intent4.putExtra(Intent.EXTRA_SUBJECT, "קוד מוצר 14 ");
                            startActivity(intent4);

                            break;
                    }
                }
            });

        }
}