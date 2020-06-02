package com.example.rinkdproject.cafeacticity.Mega;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.rinkdproject.R;
import com.example.rinkdproject.cafeacticity.Ediya.EdiyaMenudrinkAdapter;
import com.example.rinkdproject.coffee.Drink;

import java.util.ArrayList;

public class MegaMenudrinkAdapter extends RecyclerView.Adapter<MegaMenudrinkAdapter.CustomViewHolder> {
    private ArrayList<Drink> arrayList;
    private Context context;

    public MegaMenudrinkAdapter(ArrayList<Drink> arrayList,Context context){
        this.arrayList = arrayList;
        this.context = context;
    }

    public MegaMenudrinkAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.megamenudrink_item,parent,false);
        MegaMenudrinkAdapter.CustomViewHolder holder = new MegaMenudrinkAdapter.CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MegaMenudrinkAdapter.CustomViewHolder holder, int position) {
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getImage())
                .into(holder.imageView);
       // holder.tv_cafename.setText(arrayList.get(position).getCafename());
        holder.tv_drinkname.setText(arrayList.get(position).getDrinkname());
        holder.tv_price.setText(String.valueOf(arrayList.get(position).getPrice()));

    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() :0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tv_drinkname;
        TextView tv_price;
        TextView tv_cafename;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.image_drink);
            this.tv_drinkname = itemView.findViewById(R.id.textView_drinkname);
            this.tv_price = itemView.findViewById(R.id.textView_price);

        }
    }

}
