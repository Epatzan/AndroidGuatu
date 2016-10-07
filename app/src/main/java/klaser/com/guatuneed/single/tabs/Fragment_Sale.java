package klaser.com.guatuneed.single.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import guatuneed.klaser.com.guatuneed.R;

/**
 * Created by enrique on 3/05/16.
 */
public class Fragment_Sale extends Fragment {
    View rootView;
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView =  inflater.inflate(R.layout.single_frag_sale,container,false);
        TextView texto2 = (TextView) rootView.findViewById(R.id.textView8);
        return rootView;
    }
}
