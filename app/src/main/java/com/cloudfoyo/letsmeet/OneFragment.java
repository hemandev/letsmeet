package com.cloudfoyo.letsmeet;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class OneFragment extends Fragment {

Button b1;
    public OneFragment() {
        // Required empty public constructor
    }
    public void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        b1=(Button)getView().findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("Clicked");
            }
        });
        return inflater.inflate(R.layout.fragment_one, container, false);

    }


}
