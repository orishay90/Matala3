package com.example.matala3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    private SharedPreferences mayShare;
    private SharedPreferences.Editor meditor;

    private Intent nextAcyvity3;
    private EditText userName;
    private EditText password;
    private EditText name;
    private Button button;
    private CheckBox mcheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
      mayShare=PreferenceManager.getDefaultSharedPreferences(this);
      meditor=mayShare.edit();

      goToNextPage();
      checkSharedPreferences();
    }



    private void goToNextPage() {

        button = findViewById(R.id.button_next_page);
        userName = findViewById(R.id.edit_Text_userName);
        password = findViewById(R.id.edit_Text_passWord);
        name = findViewById(R.id.edit_Text_name);
        mcheckBox=findViewById(R.id.check_Box);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckIntegrity();
                //finish();
                if(mcheckBox.isChecked())
                {
                    meditor.putString(getString(R.string.checkboxx),"true");
                    meditor.commit();

                    String userNamee=userName.getText().toString();
                    meditor.putString(getString(R.string.userNamee),userNamee);
                    meditor.commit();

                    String pass=password.getText().toString();
                    meditor.putString(getString(R.string.pass),pass);
                    meditor.commit();

                  String namee=name.getText().toString();
                   meditor.putString(getString(R.string.namee),namee);
                   meditor.commit();

                }
                else {
                    meditor.putString(getString(R.string.checkboxx),"false");
                    meditor.commit();


                    meditor.putString(getString(R.string.userNamee),"");
                    meditor.commit();

                    meditor.putString(getString(R.string.pass),"");
                    meditor.commit();


                   meditor.putString(getString(R.string.namee),"");
                    meditor.commit();
                }
            }
        });

    }


    public void  CheckIntegrity()
    {
        boolean userNameOk = false, passwordOk = false, nameOk = false;
        if (userName.getText().toString().length() > 0) {
            userNameOk = true;
        } else
            userName.setError("הכנס שם משתמש");

        if (password.getText().toString().length() >8) {
            passwordOk = true;
        } else
            password.setError("הכנס סיסמא מעל 8 תווים");

        if (name.getText().toString().length() > 0) {
            nameOk = true;
        } else {
            name.setError("הכנס את שמך");
        }

        if (userNameOk && passwordOk && nameOk) {

            nextAcyvity3 = new Intent(Activity2.this, Activity3.class);
            nextAcyvity3.putExtra("userName",userName.getText().toString());
            startActivity(nextAcyvity3);
           finish();
        }
    }
public void checkSharedPreferences(){
     String checkBox=mayShare.getString(getString(R.string.checkboxx),"false");
     String userName1=mayShare.getString(getString(R.string.userNamee),"");
    String password1=mayShare.getString(getString(R.string.pass),"");
    String name1=mayShare.getString(getString(R.string.namee),"");
        userName.setText(userName1);
        password.setText(password1);
        name.setText(name1);
        if(checkBox.equals("true"))
        {
         mcheckBox.setChecked(true);
        }
        else
        {
            mcheckBox.setChecked(false);
        }
   }

}
