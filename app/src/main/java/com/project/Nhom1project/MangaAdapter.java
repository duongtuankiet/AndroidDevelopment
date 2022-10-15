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
    public void onBindViewHolder(ViewHolder holder, int position) { Manga
            song = arrayList.get(position);
        holder.tvRank.setText(String.valueOf(song.getRank()));
        holder.tvSongName.setText(song.getName());
        holder.tvSinger.setText(song.getAuthor());
        holder.tvYear.setText(song.getYear());
        holder.ivAlbumCover.setImageResource(song.getPic());
        holder.tvYear.setText("2016");
    }
    @Override
    public int getItemCount() { return arrayList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{ public
    TextView tvRank,tvSongName,tvSinger,tvYear;
        public ImageView ivAlbumCover;
        public ViewHolder(View v) { super(v);
            tvRank = v.findViewById(R.id.tv_rank);
            tvSongName = v.findViewById(R.id.tv_song_name); tvSinger =
                    v.findViewById(R.id.tv_singer);
            tvYear = v.findViewById(R.id.tv_year);
            ivAlbumCover = v.findViewById(R.id.iv_album_cover);
        }
    }

}
