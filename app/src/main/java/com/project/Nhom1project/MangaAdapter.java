package com.project.Nhom1project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.ViewHolder>{
    Context context; int layout;
    ArrayList<Manga> arrayList;
    public MangaAdapter(Context context, int layout, ArrayList<Manga>
            arrayList) { this.context = context;
        this.layout = layout; this.arrayList = arrayList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) { Manga manga = arrayList.get(position);
        holder.tvRank.setText(String.valueOf(manga.getRank()));
        holder.tvName.setText(manga.getName());
        holder.tvAuthor.setText(manga.getAuthor());
        holder.tvYear.setText(manga.getYear());
        holder.ivMangaCover.setImageResource(manga.getPic());
        holder.tvYear.setText("");
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{ public
    TextView tvRank,tvName,tvAuthor,tvYear;
        public ImageView ivMangaCover;
        public ViewHolder(View v) { super(v);
            tvRank = v.findViewById(R.id.tv_rank);
            tvName = v.findViewById(R.id.tv_song_name);
            tvAuthor = v.findViewById(R.id.tv_singer);
            tvYear = v.findViewById(R.id.tv_year);
            ivMangaCover = v.findViewById(R.id.iv_album_cover);
        }
    }


}
