package com.example.rinkdproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


import com.example.rinkdproject.R;
import com.example.rinkdproject.RandomActivity;
import com.example.rinkdproject.SpotActivity;

public class HomeFragment extends Fragment {
    RandomActivity activity;

    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstaceState) {
   // View view = inflater.inflate(R.layout.fragment_home, null); // Fragment로 불러올 xml파일을 view로 가져옵니다.
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.fragment_home,container,false);
      //  Button button1 = (Button)rootview.findViewById(R.id.movebotton);// click시 Fragment를 전환할 event를 발생시킬 버튼을 정의합니다.

        Button btn_go =(Button)rootview.findViewById(R.id.movebotton);
        btn_go.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), SpotActivity.class);

                        startActivity(intent);
                    }
                }
        );
        return rootview;
    }
}
