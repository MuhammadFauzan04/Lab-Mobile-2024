package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryDetail extends AppCompatActivity {

    private ImageView iv_profile ;

    private ImageView iv_story;
    private TextView tv_user_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);

        Log.d("data: ", "onCreate: test1");

        Intent intent = getIntent();
        Post posts = intent.getParcelableExtra("Post");
        Story story = intent.getParcelableExtra("story");

        Log.d("data: ", String.valueOf(story));

        iv_profile = findViewById(R.id.iv_profilestory);
        iv_story = findViewById(R.id.iv_storydetail);
        tv_user_profile = findViewById(R.id.tv_unamestory);

        int image = story.getImage();
        int imageStory = story.getImageStory();
        String name = story.getName();

        iv_profile.setImageResource(image);
        iv_story.setImageResource(imageStory);
        tv_user_profile.setText(name);

        tv_user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Data : tv_user", String.valueOf(story));
                Intent intent = new Intent(StoryDetail.this, ProfileDetail.class);
                intent.putExtra("story", story);
                intent.putExtra("Post", posts);

                startActivity(intent);
            }
        });
    }
}