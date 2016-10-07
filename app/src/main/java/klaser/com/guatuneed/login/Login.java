package klaser.com.guatuneed.login;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.mixpanel.android.mpmetrics.MixpanelAPI;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

import guatuneed.klaser.com.guatuneed.R;
import guatuneed.klaser.com.guatuneed.Welcome;
import klaser.com.guatuneed.home.home;

public class Login extends AppCompatActivity {


    CallbackManager callbackManager;
    @Override
    protected void onActivityResult(int requestCode, int responseCode, Intent data)
    {
        super.onActivityResult(requestCode, responseCode, data);
        callbackManager.onActivityResult(requestCode, responseCode, data);
    }

    @Override
    protected  void onResume(){
        super.onResume();
        AppEventsLogger.activateApp(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MixpanelAPI mixpanel = MixpanelAPI.getInstance(this, Welcome.MIXPANEL_TOKEN);
        mixpanel.track("Login",null);
        mixpanel.flush();
        FacebookSdk.sdkInitialize(this.getApplicationContext());
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_login);
        callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton =(LoginButton) findViewById(R.id.login_button);
        List<String> permissionNeeds = Arrays.asList("user_photos", "email", "user_birthday", "public_profile");
        loginButton.setReadPermissions(permissionNeeds);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {

                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        System.out.println("OnSuccess ********************");
                        Intent ListSong = new Intent(getApplicationContext(), home.class);
                        startActivity(ListSong);
                        System.out.println(home.nameCO +">>>>>>>>>>>>>>>>");


                    }

                    @Override
                    public void onCancel() {
                        System.out.println("onCancel <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        System.out.println("onError <---------------------");
                    }
                }

        );

        final Button entrar = (Button) findViewById(R.id.button4);
        final Button EnterCorreo= (Button) findViewById(R.id.button3);
        final Button CrearCuenta= (Button) findViewById(R.id.button5);

        CrearCuenta.setOnClickListener(new Button.OnClickListener(){
            public  void  onClick(View arg0){
                Intent Cuenta = new Intent(getApplicationContext(),SignUp.class);
                startActivity(Cuenta);
            }
        });
        entrar.setOnClickListener(new Button.OnClickListener()

                                  {
                                      public void onClick(View arg0) {
                                          Intent ListSong = new Intent(getApplicationContext(), home.class);
                                          startActivity(ListSong);



                                      }
                                  }

        );

       EnterCorreo.setOnClickListener(new Button.OnClickListener(){
            public void  onClick(View args0){
                Intent Correo = new Intent(getApplicationContext(),SignIn.class);
                startActivity(Correo);
            }
        });



    }
}
