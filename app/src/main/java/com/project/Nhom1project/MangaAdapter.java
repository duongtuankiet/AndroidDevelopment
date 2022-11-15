package com.project.Nhom1project;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.ViewHolder>{

    Context context; int layout;
    ArrayList<Manga> arrayList;
    UserCallback userCallback;
    public MangaAdapter(Context context, int layout, ArrayList<Manga> arrayList,UserCallback userCallback) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
        this.userCallback = userCallback;
    }
    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(v);

    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        Manga manga = arrayList.get(position);
        holder.tvName.setText(manga.getName());
        holder.ivManga.setImageResource(manga.getPic());
        holder.itemView.setOnClickListener(view -> userCallback.onItemClick(manga.getId(),manga.getPic(),manga.getName()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{ public
        TextView tvName;
        public ImageView ivManga;
        public ViewHolder(@NonNull View v) {
            super(v);
            tvName = v.findViewById(R.id.tvName);
            ivManga = v.findViewById(R.id.ivManga);
        }
    }
    public interface UserCallback{
        void onItemClick(int id,int pic,String name);
    }



}
