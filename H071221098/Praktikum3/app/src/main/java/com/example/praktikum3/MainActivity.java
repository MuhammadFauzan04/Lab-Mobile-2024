package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.praktikum3.PostAdapter;
import com.example.praktikum3.StoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
    private static final int ADD_STORY_TYPE=0;
    private static final int ALL_STORY_TYPE=1;

    StoryAdapter adapter;

    List<Story> modelList = new ArrayList<>();
    RecyclerView rvStory, rvPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvStory = findViewById(R.id.rv_story);
        rvPost = findViewById(R.id.rv_post);


        rvStory = findViewById(R.id.rv_story);
        rvPost = findViewById(R.id.rv_post);

        rvStory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvPost.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvStory.setHasFixedSize(true);
        rvPost.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.stories);
        rvStory.setAdapter(storyAdapter);

        PostAdapter postAdapter = new PostAdapter(DataSource.posts);
        rvPost.setAdapter(postAdapter);




    }
}