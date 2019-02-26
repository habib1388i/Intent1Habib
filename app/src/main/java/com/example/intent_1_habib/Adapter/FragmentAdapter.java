package com.example.intent_1_habib.Adapter;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intent_1_habib.R;
import com.example.intent_1_habib.ScrollingActivity.DetailActivity;

/**
 * A simple {@link Fragment} subclass.
 */
 public  class FragmentAdapter extends RecyclerView.Adapter<TampilanFragment1> {

    Context context;
    String[] nama = {"Bali","Jawa Timur","Papua","Bandung","Malang","Yogyakarta","Kalimantan Timur","Wonosobo"};
    String[] web = {"https://www.bali.com/","https://jatimprov.go.id/","https://www.papua.go.id/","https://bandung.go.id/","malang.merdeka.com/","https://www.jogjakota.go.id/","www.kaltimprov.go.id/","https://wikitravel.org/en/Wonosobo"};
    String[] gmail = {"bali@gmail.com","jatim@gmail.com","papua@gmail.com","bandung@gmail.com","malang@gmail.com","jogja@gmail.com","kaltim@gamil.com","wonosobo@gmail.com"};
    int[] gambar = {R.drawable.bali,R.drawable.jatim,R.drawable.papua,R.drawable.bandung,R.drawable.malang,R.drawable.jogja,R.drawable.kaltim,R.drawable.wonosobo};
    int[] notelpon = {99999999,888888888,7777777,66666666,5555555,44444,33333333,222222};



    public FragmentAdapter(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public TampilanFragment1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragment_fragment_adapter, null);
        return new TampilanFragment1(v, context);
    }

    @Override
    public void onBindViewHolder(@NonNull TampilanFragment1 tampilanFragment1, final  int i) {
        tampilanFragment1.imgtampilan1.setImageResource(gambar[i]);
        tampilanFragment1.tvtampilan1.setText(nama[i]);
        tampilanFragment1.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(context, DetailActivity.class);
                p.putExtra( "position",i );
                p.putExtra( "name",nama[i] );
                p.putExtra( "image",gambar[i] );
                p.putExtra( "services",gmail[i] );
                p.putExtra( "phone",notelpon[i] );
                p.putExtra( "web",web[i] );
                context.startActivity( p );
            }
        });


    }

    @Override
    public int getItemCount() {
        return nama.length;
    }


}

