package com.example.praktikum3;

import static com.example.praktikum3.Adapter.StoryAdapter.ADD_STORY_TYPE;
import static com.example.praktikum3.Adapter.StoryAdapter.ALL_STORY_TYPE;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Post> posts = generateDummyPosts();
    public static ArrayList<StoryModel> storyModeles = generateDummyStory();

    private static ArrayList<Post> generateDummyPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(R.drawable.ojan, "faauuuzan", R.drawable.ojanpost, "ojan", "a.........." , "66" , "78" , "tidak ada"));
        posts.add(new Post(R.drawable.rahmat, "evancinaa", R.drawable.evanpostingan, "evan", "b..............." , "170" , "0" , "pandu dump"));
        posts.add(new Post(R.drawable.geniusstand, "adr", R.drawable.post_1, "adrian", "c............", "609" , "95" , "rowr"));
        posts.add(new Post(R.drawable.himatika, "alqaa", R.drawable.inau, "alqadri", "d............" , "1.715" , "469" , "rowr"));
        posts.add(new Post(R.drawable.uhesport, "ammartyo", R.drawable.unhasesport, "ammar", "e............." , "1.541" , "90" , "rowr"));
        posts.add(new Post(R.drawable.mathevent, "alifr", R.drawable.post_math, "alif", "f............." , "2,891" , "430" , "rowr"));
        posts.add(new Post(R.drawable.buckslogo, "ocangg.g", R.drawable.post_bucks, "ocang", "g.............." , "5.5JT" , "281" , "rowr"));
        posts.add(new Post(R.drawable.sunslogo, "saldanr", R.drawable.post_suns, "rama", "h............................................................" , "3,6JT" , "181" , "rawrt\n" + "rowr"));
        posts.add(new Post(R.drawable.sisfo22, "trismanttw", R.drawable.post_sisfo, "trisman", "i............" , "116" , "1" , "rawr"));
        posts.add(new Post(R.drawable.pandora, "pandora.corp", R.drawable.post_pandora, "Pandora Corp.", "Jika @pandoracybercafe buka cabang baru, dimana kira kira lokasi cabang baru kami? \uD83D\uDE33\uD83E\uDD14 Komen dibawah gengz!\uD83D\uDC47\n" +
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

    private static ArrayList<StoryModel> generateDummyStory() {
        ArrayList<StoryModel> storyModeles = new ArrayList<>();

        storyModeles.add(new StoryModel(ADD_STORY_TYPE, "0" , R.drawable.evanganteng , R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "1" ,"11","evancinaa", R.drawable.brighterwithds, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "5" ,"14","adr", R.drawable.geniusstand, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "3" ,"12","alqa", R.drawable.himatika, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "6" ,"15","ammartyo", R.drawable.uhesport, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "8" ,"17","alifr", R.drawable.mathevent, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "10" ,"19","oacangg.g", R.drawable.buckslogo, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "9" ,"18","saldanr", R.drawable.sunslogo, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "4" ,"13","trismanttw", R.drawable.sisfo22, R.drawable.story_bwds));
        storyModeles.add(new StoryModel(ALL_STORY_TYPE, "11" ,"20","pandora.corp", R.drawable.pandora, R.drawable.story_bwds));

        return storyModeles;
    }
}