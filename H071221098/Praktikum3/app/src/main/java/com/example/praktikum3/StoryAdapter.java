package com.example.praktikum3;

import static com.example.praktikum3.DataSource.posts;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.praktikum3.StoryDetail;
import com.example.praktikum3.ProfileDetail;
import com.example.praktikum3.Post;
import com.example.praktikum3.ProfileDetail;
import com.example.praktikum3.Story;
import com.example.praktikum3.StoryDetail;
import com.example.praktikum3.Story;
import com.example.praktikum3.R;

import java.util.ArrayList;
import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    public static final int ADD_STORY_TYPE = 0;
    public static final int ALL_STORY_TYPE = 1;
    private ArrayList<Story> stories;



    public StoryAdapter(ArrayList<Story> stories) {
        this.stories = stories;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
//        if (viewType == ADD_STORY_TYPE) {
//            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_item_add, parent, false);
//        } else {
//            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
//        }

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Story story = stories.get(position);
        Post post = posts.get(position);


        int viewType = getItemViewType(position);
            int image = story.getImage();

        if (viewType == ADD_STORY_TYPE) {
            String uid = story.getUid().toString();
            holder.title.setText(uid);
//            holder.setAddStory(uid, image);
        } else {
            String name = story.getName().toString();
//            int image = story.getImage();
//            holder.setStory(name, image);
            holder.title.setText(name);
        }

        holder.profile_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(holder.context, StoryDetail.class);
                intent.putExtra("story", story);
                intent.putExtra("Post", post);
                holder.context.startActivity(intent);
            }
        });

        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(holder.context, ProfileDetail.class);
                intent.putExtra("Post", post);
                holder.context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    @Override
    public int getItemViewType(int position) {
        return (position == 0) ? ADD_STORY_TYPE : ALL_STORY_TYPE;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView profile_img;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_user);
            profile_img = itemView.findViewById(R.id.iv_user);
            context = itemView.getContext();
        }

//        public void setAddStory(String uid, int image) {
////            title.setText(uid);
//            profile_img.setImageResource(image);
//        }
//
//        public void setStory(String name, int image) {
////            title.setText(name);
//            profile_img.setImageResource(image);
//        }
    }
}