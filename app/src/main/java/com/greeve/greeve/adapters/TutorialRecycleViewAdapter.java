package com.greeve.greeve.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.greeve.greeve.R;
import com.greeve.greeve.models.Tutorial;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TutorialRecycleViewAdapter extends RecyclerView.Adapter<TutorialRecycleViewAdapter.MyViewHolder> {
    private Context mContext;
    List<Tutorial> mData;
    //Ini Adapter
    public TutorialRecycleViewAdapter(Context mContext, List<Tutorial> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_card_view_tutorial,parent,false);

        return new TutorialRecycleViewAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_title.setText(mData.get(position).getTitle());
        holder.video_tutorial.setVideoPath(mData.get(position).getTitle());
        holder.video_tutorial.setMediaController(new MediaController(mContext));
        holder.video_tutorial.start();
//        holder.video_tutorial.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;
        VideoView video_tutorial;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = (TextView)itemView.findViewById(R.id.tv_title_videos);
            video_tutorial = (VideoView)itemView.findViewById(R.id.vv_videos);
        }
    }
}
