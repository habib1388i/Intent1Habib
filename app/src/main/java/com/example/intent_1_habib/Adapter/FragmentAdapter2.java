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
public class FragmentAdapter2 extends RecyclerView.Adapter<TampilanFragment2> {
    Context context1;
    String[] namastarup = {"gojek","traveloka","tiket.com","tokopedia","ruangguru","shoppee"};
    String[] gmail = {"gojek@gmial.com","traveloka@gmial.com","tiket@gmial.com","tokopediaa@gmial.com","ruangguru@gmial.com","shopee@gmial.com"};
    String[] web = {"http://www.gojek.com","http://www.traveloka.com","http://www.tiket.com","http://www.tokopedia.com","http://www.ruangguru.com","http://www.shopee.com"};
    int[] gambarstarup = {R.drawable.gojek,R.drawable.traveloka,R.drawable.traveloka,R.drawable.tokopedia,R.drawable.ruangguru,R.drawable.shopee};
    int[] notelpon = {1111111,22222222,333333333,44444444,555555555,66666666};


    public FragmentAdapter2(Context context) {
        this.context1 = context;
        // Required empty public constructor
    }

    @NonNull
    @Override
    public TampilanFragment2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context1).inflate(R.layout.fragment_fragment_adapter2, null);
        return new TampilanFragment2(v,context1);
    }

    @Override
    public void onBindViewHolder(@NonNull TampilanFragment2 tampilanFragment2, final int i) {
        tampilanFragment2.imgtampilan2.setImageResource(gambarstarup[i]);
        tampilanFragment2.tvtampilan2.setText(namastarup[i]);
        tampilanFragment2.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pp = new Intent(context1, DetailActivity.class);
                pp.putExtra( "position",i );
                pp.putExtra( "name",namastarup[i] );
                pp.putExtra( "image",gambarstarup[i] );
                pp.putExtra( "services",gmail[i] );
                pp.putExtra( "phone",notelpon[i] );
                pp.putExtra( "web",web[i] );
                context1.startActivity( pp );
            }
        });

    }

    @Override
    public int getItemCount() {
        return namastarup.length;
    }


}
