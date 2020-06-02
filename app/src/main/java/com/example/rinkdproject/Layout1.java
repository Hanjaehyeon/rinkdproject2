package com.example.rinkdproject;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Layout1 extends LinearLayout {

    ImageView imageView;
    TextView textView;

    public Layout1(Context context){
        super(context);
        init(context);
    }

    public Layout1(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout1,this,true);

        //xml 레이아웃에서 정의했던 뷰를 참조한다.
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
    }
    //뷰에 데이터를 설정한다
    public void setImage(int resId){
        imageView.setImageResource(resId);
    }

    public void setName(String name){
        textView.setText(name);
    }
}
