package com.example.praktikum3;

import static com.example.praktikum3.StoryAdapter.ADD_STORY_TYPE;
import static com.example.praktikum3.StoryAdapter.ALL_STORY_TYPE;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Post> posts = generateDummyPosts();
    public static ArrayList<Story> stories = generateDummyStory();

    private static ArrayList<Post> generateDummyPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(R.drawable.ojan, "faauuuzan", R.drawable.ojann, "ojan", "a.........." , "66" , "78" , "tidak ada"));
        posts.add(new Post(R.drawable.rahmat, "evancinaa", R.drawable.adr, "evan", "b..............." , "170" , "0" , "pandu dump"));
        posts.add(new Post(R.drawable.adr, "adr", R.drawable.trisman, "adrian", "c............", "609" , "95" , "rowr"));
        posts.add(new Post(R.drawable.alqa, "alqaa", R.drawable.ammar, "alqadri", "d............" , "1.715" , "469" , "rowr"));
        posts.add(new Post(R.drawable.ammar, "ammartyo", R.drawable.ares, "ammar", "e............." , "1.541" , "90" , "rowr"));
        posts.add(new Post(R.drawable.ares, "alifr", R.drawable.rahmat, "alif", "f............." , "2,891" , "430" , "rowr"));
        posts.add(new Post(R.drawable.ocang, "ocangg.g", R.drawable.shaff, "ocang", "g.............." , "5.5JT" , "281" , "rowr"));
        posts.add(new Post(R.drawable.rama, "saldanr", R.drawable.alqa, "rama", "h............................................................" , "3,6JT" , "181" , "rawrt\n" + "rowr"));
        posts.add(new Post(R.drawable.trisman, "trismanttw", R.drawable.ojan, "trisman", "i............" , "116" , "1" , "rawr"));
        posts.add(new Post(R.drawable.shaff, "shaffs", R.drawable.shaff, "Shaff.", "Jika @pandoracybercafe buka cabang baru, dimana kira kira lokasi cabang baru kami? \uD83D\uDE33\uD83E\uDD14 Komen dibawah gengz!\uD83D\uDC47\n" +
                "\n" +
                "\uD83D\uDFE5 Youtube : Pandora Gaming TV\n" +
                "\uD83D\uDFE5 IG Fanpage : Pandora. Corp\n" +
                "\uD83D\uDFE6 FB Fanpage : Pandora. Corp\n" +
                "⚫ Tiktok : pandora.corp\n" +
                "\n" +
                "#BeProBePandora\uD83D\uDD35⚫ #ggpandora #esport #esporteam #esportnews #gamingpage #gamingchannel #gamingpost #gaming #warnet" , "15,6RB" , "209" , "Esports Professional Consultant\n" +
                "Pandora Esports\n" +
                "Pandora Gaming TV\n" +
                "@pandoracybercafe\n" +
                "@pandora.organizer.id\n" +
                "@pandora.communityroom\n" +
                "lynk.id/pandoracorp"));
        return posts;
    }

    private static ArrayList<Story> generateDummyStory() {
        ArrayList<Story> stories = new ArrayList<>();

        stories.add(new Story(ADD_STORY_TYPE, "0" , R.drawable.ojan , R.drawable.ojannn));
        stories.add(new Story(ALL_STORY_TYPE, "1" ,"11","evancinaa", R.drawable.rahmat, R.drawable.ammar));
        stories.add(new Story(ALL_STORY_TYPE, "5" ,"14","adr", R.drawable.adr, R.drawable.ocang));
        stories.add(new Story(ALL_STORY_TYPE, "3" ,"12","alqa", R.drawable.alqa, R.drawable.adr));
        stories.add(new Story(ALL_STORY_TYPE, "6" ,"15","ammartyo", R.drawable.ammar, R.drawable.ares));
        stories.add(new Story(ALL_STORY_TYPE, "8" ,"17","alifr", R.drawable.ares, R.drawable.alqa));
        stories.add(new Story(ALL_STORY_TYPE, "10" ,"19","ocangg.g", R.drawable.ocang, R.drawable.ammar));
        stories.add(new Story(ALL_STORY_TYPE, "9" ,"18","saldanr", R.drawable.rama, R.drawable.shaff));
        stories.add(new Story(ALL_STORY_TYPE, "4" ,"13","trismanttw", R.drawable.trisman, R.drawable.rahmat));
        stories.add(new Story(ALL_STORY_TYPE, "11" ,"20","shaffs", R.drawable.shaff, R.drawable.trisman));

        return stories;
    }
}