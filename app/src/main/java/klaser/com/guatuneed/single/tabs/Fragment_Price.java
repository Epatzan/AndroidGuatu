package klaser.com.guatuneed.single.tabs;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import guatuneed.klaser.com.guatuneed.R;

/**
 * Created by enrique on 3/05/16.
 */
public class Fragment_Price extends Fragment {
    View rootView;
    private ListView lista;
    private String[] title ={
            "Pizza",
            "Pasta",
            "Hamburguesas",
            "Pollo Asado",
            "Carne Asada"
    };
    private  String[] precio ={
      "Q.20.00",
      "Q.30.00",
      "Q.500.00",
      "Q.1,000.00",
      "Q.1,500.00"
    };

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.single_frag_price, container, false);
        TextView texto = (TextView) rootView.findViewById(R.id.textView9);
        LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.layoutprice);
        LinearLayout.LayoutParams ll = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout.LayoutParams ll2 = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout.LayoutParams ll3 = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));





        float density = getResources().getDisplayMetrics().density;
        ll.setMargins((int)(density*290),0,0,0);
        ll2.setMargins(0,0,0,60);
        ll3.setMargins(0,-40,0,0);
        //ll.setMargins(left, top, right, bottom);
        System.out.println(density);
        for(int k =0;k<title.length;k++){
            TextView texto2 = new TextView(container.getContext());
            texto2.setText(title[k]);
            texto2.setTextSize(22);
            texto2.setPadding(0,25, 0,0);
            //texto2.setLayoutParams(ll2);

            linearLayout.addView(texto2);


            TextView texto3 = new TextView(container.getContext());
            texto3.setText(precio[k]);
            texto3.setLayoutParams(ll);
            //texto3.setPadding(0,0,0,-5);
            texto3.setWidth(300);
            texto3.setHeight(45);
            linearLayout.addView(texto3);

            TextView texto4 = new TextView((container.getContext()));

            texto4.setText("Descripcion" + k + "!!");
            //texto4.setPadding((int)(density*290),10,0,0);
            texto4.setPadding(0,0,0,50);

            //(int)(density*290)
            texto4.setLayoutParams(ll3);
            linearLayout.addView(texto4);
        }
        return  rootView;
    }
}
