package guatuneed.klaser.com.guatuneed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import klaser.com.guatuneed.home.home;
import klaser.com.guatuneed.login.Login;
import klaser.com.guatuneed.single.tabs.single;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
//import com.mixpanel.android.mpmetrics.MixpanelAPI;
//import com.mixpanel.android.surveys.SurveyActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Welcome extends AppCompatActivity {

    public static final String MIXPANEL_TOKEN = "667c09ee366e784730f1f13e20b19d55";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/****MIXPANEL***/
    /*    final MixpanelAPI mixpanel = MixpanelAPI.getInstance(this, MIXPANEL_TOKEN);
        try {
            JSONObject props = new JSONObject();
            props.put("Gender", "Female");
            props.put("Logged in", false);
            mixpanel.track("MainActivity - onCreate called", props);
            mixpanel.flush();
        } catch (JSONException e) {
            Log.e("MYAPP", "Unable to add properties to JSONObject", e);
        }*/
 /*******/
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);

            final Button entrar = (Button) findViewById(R.id.button);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent= new Intent().setClass(
                        Welcome.this,Login.class);
                startActivity(mainIntent);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task,3000);

         /*   entrar.setOnClickListener(new Button.OnClickListener()

                                      {
                                          public void onClick(View arg0) {
                                              Intent ListSong = new Intent(getApplicationContext(), single.class);
                                              startActivity(ListSong);
                                              //mixpanel.track("Login2");

                                          }
                                      }

            );*/
        }
    }
