package com.example.intent_1_habib.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intent_1_habib.R;

class TampilanFragment2 extends RecyclerView.ViewHolder {
    ImageView imgtampilan2;
    TextView tvtampilan2;
    public TampilanFragment2(@NonNull View itemView, Context context1) {
        super(itemView);
        imgtampilan2  = itemView.findViewById(R.id.img_tampilan_frangment2);
        tvtampilan2 = itemView.findViewById(R.id.tv_tampilan_fragment2);
    }
}
