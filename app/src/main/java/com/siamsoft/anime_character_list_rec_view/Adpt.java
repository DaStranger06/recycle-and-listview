package com.siamsoft.anime_character_list_rec_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adpt extends  RecyclerView.Adapter<Adpt.Viewholder>{

    public Adpt(Context ctx, List<CharList> clist) {
        this.ctx = ctx;
        this.clist = clist;
    }

    private Context ctx;
private List<CharList> clist;

    @NonNull


    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.characters,null);

        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        CharList cl = clist.get(position);

        holder.tvn.setText(cl.getC_name());
        holder.tvan.setText(cl.getAnime_name());
        holder.tvrat.setText(String.valueOf(cl.getRating()));
        holder.img.setImageDrawable(ctx.getResources().getDrawable(cl.getImage()));



    }

    @Override
    public int getItemCount() {
        return clist.size();
    }


    class Viewholder extends RecyclerView.ViewHolder {


TextView tvn, tvan, tvrat;
ImageView img;


    public Viewholder(@NonNull View itemView) {
        super(itemView);

        tvn = itemView.findViewById(R.id.textViewTitle);
        tvan = itemView.findViewById(R.id.textViewShortDesc);
        tvrat =itemView.findViewById(R.id.textViewRating);
        img = itemView.findViewById(R.id.imageView);



    }
}



}
