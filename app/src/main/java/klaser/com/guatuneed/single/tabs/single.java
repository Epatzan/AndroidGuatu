package klaser.com.guatuneed.single.tabs;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import guatuneed.klaser.com.guatuneed.R;

public class single extends AppCompatActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener{
    private ViewPager mViewPager;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.segunda);
        this.getWindow().setStatusBarColor(getResources().getColor(R.color.Guatuneed));

        PagerAdapter adapter = new PagerAdpter(getSupportFragmentManager());
        mViewPager =(ViewPager) findViewById(R.id.pager_single);
        mViewPager.setAdapter(adapter);
        mViewPager.setOnPageChangeListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setTitle(Html.fromHtml("<font color='#000047'>.</font>"));
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.nave));
        actionBar.setStackedBackgroundDrawable(getResources().getDrawable(R.color.background_material_light));

        TextView textView=(TextView) findViewById(R.id.tabText);
        textView.setText("INFO");
        textView.setTextColor(Color.parseColor("#00A7B7"));

        TextView textView2=(TextView) findViewById(R.id.tabText2);
        textView2.setText("PRECIOS");
        textView2.setTextColor(Color.parseColor("#00A7B7"));

        TextView textView3=(TextView) findViewById(R.id.tabText3);
        textView3.setText("OFERTAS");
        textView3.setTextColor(Color.parseColor("#00A7B7"));

        ActionBar.Tab tab=actionBar.newTab().setCustomView(textView).setTabListener((ActionBar.TabListener)this);
        actionBar.addTab(tab);

        tab=actionBar.newTab().setCustomView(textView2).setTabListener((ActionBar.TabListener)this);
        actionBar.addTab(tab);

        tab=actionBar.newTab().setCustomView(textView3).setTabListener((ActionBar.TabListener)this);
        actionBar.addTab(tab);



        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
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

    public class  PagerAdpter extends FragmentPagerAdapter{

        public PagerAdpter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int args0) {
            switch (args0){
                case 0:
                    return new Fragment_Info();
                case 1:
                    return  new Fragment_Price();
                case 2:
                    return new Fragment_Sale();
                    default:
            return null;}
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
