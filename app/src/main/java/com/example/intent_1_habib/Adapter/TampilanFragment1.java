package com.example.intent_1_habib.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.intent_1_habib.R;

class TampilanFragment1 extends RecyclerView.ViewHolder {
    ImageView imgtampilan1;
    TextView tvtampilan1;

    public TampilanFragment1(@NonNull View itemView, Context context) {
        super(itemView);

        imgtampilan1  = itemView.findViewById(R.id.img_tampilan_frangment1);
        tvtampilan1 = itemView.findViewById(R.id.tv_tampilan_fragment1);
    }
}
