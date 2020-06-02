package com.example.rinkdproject.cafemenu;

import android.view.View;

import com.example.rinkdproject.cafemenu.CafeAdapter;

public interface OnCafeItemClickListener {
    public void onItemClick(CafeAdapter.ViewHolder holder, View view, int position);
}
