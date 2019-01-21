package com.example.sagar.loginsinupdesigns;

import android.app.FragmentTransaction;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import fragments.LoginFragment;
import fragments.SignupFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btLogin, btSignup;

    StateListDrawable stateListDrawable;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btLogin =findViewById(R.id.btLogin);
        btSignup =findViewById(R.id.btSignup);
        btLogin.setBackground(getDrawable(R.drawable.bt_right_corners_bg));
        btSignup.setBackground(getDrawable(R.drawable.bt_transperant_bg));

        btLogin.setTextSize(18);
        btLogin.setTextColor(getResources().getColor(R.color.white));
        btSignup.setTextSize(16);
        btSignup.setTextColor(getResources().getColor(R.color.light_white));


        stateListDrawable=new StateListDrawable();
        stateListDrawable.addState(new int[] {android.R.attr.state_pressed},
                getResources().getDrawable(R.drawable.bt_right_corners_bg));



        fragmentTransaction=getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragmenntContainer,new LoginFragment());
        fragmentTransaction.commit();


        btLogin.setOnClickListener(this);
        btSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btLogin:

                //change txt
                btLogin.setTextSize(18);
                btLogin.setTextColor(getResources().getColor(R.color.white));
                btSignup.setTextSize(16);
                btSignup.setTextColor(getResources().getColor(R.color.light_white));

                //change bg
                btSignup.setBackground(getDrawable(R.drawable.bt_transperant_bg));
                btLogin.setBackground(getDrawable(R.drawable.bt_right_corners_bg));
                fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmenntContainer,new LoginFragment());
                fragmentTransaction.commit();

                break;
            case R.id.btSignup:
                //change txt
                btSignup.setTextSize(18);
                btSignup.setTextColor(getResources().getColor(R.color.white));
                btLogin.setTextSize(16);
                btLogin.setTextColor(getResources().getColor(R.color.light_white));

                btSignup.setBackground(getDrawable(R.drawable.bt_right_corners_bg));
                btLogin.setBackground(getDrawable(R.drawable.bt_transperant_bg));

                fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmenntContainer,new SignupFragment());
                fragmentTransaction.commit();
        }

    }
}
