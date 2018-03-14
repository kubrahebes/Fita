package com.example.user.fita.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.fita.R;
import com.example.user.fita.model.NormalInsan;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class HomeFragment extends Fragment {
    FirebaseDatabase database;
    DatabaseReference myRef;
    SharedPreferences preferences;
    Unbinder unbinder;
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        textView=rootView.findViewById(R.id.index_edit_text);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("database");
        preferences = PreferenceManager.getDefaultSharedPreferences(getContext());

        int length = preferences.getInt("Length", -1);
        int weight = preferences.getInt("Weight", -1);

        int index=(weight/length);
        textView.setText(index+"");
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;

     

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
