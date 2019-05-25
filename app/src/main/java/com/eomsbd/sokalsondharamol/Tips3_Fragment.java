package com.eomsbd.sokalsondharamol;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tips3_Fragment extends Fragment implements OnBackPressed {

    LinearLayout button;

    public Tips3_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tips3_, container, false);

        button=view.findViewById(R.id.backButton3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });
        return view;
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getActivity(),MainActivity.class);
        startActivity(intent);
    }

}
