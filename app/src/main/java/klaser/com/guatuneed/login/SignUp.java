package klaser.com.guatuneed.login;



import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import guatuneed.klaser.com.guatuneed.R;


public class SignUp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);
        final Button sesion = (Button) findViewById(R.id.button11);
        sesion.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View args0) {
                Intent open_sesion= new Intent(getApplicationContext(),SignIn.class);
                startActivity(open_sesion);
            }
        });

        /*final TextInputLayout Correo =(TextInputLayout) findViewById(R.id.input_layout_name2);
        Correo.setHint("Contraseña");*/

    }





}
