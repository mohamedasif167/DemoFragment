package com.example.a15017498.demofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {

    Button btnAdd;
    TextView tv2;

    public FragmentSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        btnAdd = (Button) view.findViewById(R.id.btnAdd2);
        tv2 = (TextView) view.findViewById(R.id.tv2);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tv2.getText().toString()+"\n"+"New Data F2";
                tv2.setText(data);
            }
        });


        return view;
    }

}
