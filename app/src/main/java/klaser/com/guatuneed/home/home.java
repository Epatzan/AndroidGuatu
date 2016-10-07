package klaser.com.guatuneed.home;


/*import android.content.Intent;
import android.os.AsyncTask;*/
import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
//import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
/*import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.github.kevinsawicki.http.HttpRequest;
import com.github.kevinsawicki.http.HttpRequest.HttpRequestException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;*/

import guatuneed.klaser.com.guatuneed.R;
import klaser.com.guatuneed.chapin.ChapinListAdapter;
import klaser.com.guatuneed.home.tabs.Fragment_Chapin;
import klaser.com.guatuneed.home.tabs.Fragment_Dir;
import klaser.com.guatuneed.home.tabs.Fragment_Perfil;
import klaser.com.guatuneed.login.Login;



/**
 * Created by enrique on 11/04/16.
 */
public class home extends AppCompatActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
   /*private ListView listView;
    private ImageView ivPoster;
    private TextView tvTitle, tvWritters, tvActors, tvPlot,tvPlot2;
    List item = new ArrayList(); */


   private ViewPager mViewPager;
    public static String nameCO;
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       this.requestWindowFeature(Window.FEATURE_NO_TITLE);
       //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_home);
        //this.getWindow().setStatusBarColor(getResources().getColor(R.color.Trasparente));


        /*codigo para el PagerAdapter*/
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager= (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(adapter);
        mViewPager.setOnPageChangeListener(this);


        /**/

        /* Codigo para agregar las tab con le ActionBar*/
         ActionBar actionBar = getSupportActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.degradado));
        actionBar.setStackedBackgroundDrawable(getResources().getDrawable(R.drawable.degradado));





        ActionBar.Tab tab = actionBar.newTab().setText("Directorio").setTabListener((ActionBar.TabListener)this);

        actionBar.addTab(tab);

        tab=actionBar.newTab().setText("Lo + Chapin").setTabListener((ActionBar.TabListener)this);
        actionBar.addTab(tab);

        tab=actionBar.newTab().setText("Perfil").setTabListener((ActionBar.TabListener)this);
        actionBar.addTab(tab);


        /**/
       /*String url = String.format("http://192.168.1.118:8381/api/v1/companies");
        new LoadData().execute(url);
        ivPoster = (ImageView) findViewById(R.id.ivPoster);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvWritters = (TextView) findViewById(R.id.tvWritters);
        tvActors = (TextView) findViewById(R.id.tvActors);
        tvPlot = (TextView) findViewById(R.id.tvPlot);
        tvPlot2 = (TextView) findViewById(R.id.tvPlot2);*/

    }


    @Override
    public void onPageScrolled(int i, float v, int i2) {

    }

    @Override
    public void onPageSelected(int i) {
        getSupportActionBar().setSelectedNavigationItem(i);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }



    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }


    public class PagerAdapter  extends FragmentPagerAdapter{
        public PagerAdapter(FragmentManager fm){super(fm);}
        @Override
        public Fragment getItem(int arg0) {
            switch (arg0){
                case 0:
                    return  new Fragment_Dir();
                case 1:
                    return new Fragment_Chapin();
                case 2:
                    return  new Fragment_Perfil();
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
