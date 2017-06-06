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
public class FragmentFirst extends Fragment {

    Button btnAdd;
    TextView tv;

    public FragmentFirst() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_first, container, false);

        btnAdd = (Button) view.findViewById(R.id.btnAdd);
        tv = (TextView) view.findViewById(R.id.textView);

btnAdd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String data = tv.getText().toString()+"\n"+"New Data";
        tv.setText(data);
    }
});

        return view;
    }

}
