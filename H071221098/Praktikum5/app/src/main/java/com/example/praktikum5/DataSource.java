package com.example.praktikum5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Saldan Rama", "Rama", "muachh"
                , R.drawable.rama, R.drawable.ares));

        instagrams1.add(new Instagram("Alif Rezky", "Alif", "Lahir kembali menjadi supir"
                , R.drawable.ares, R.drawable.trisman));

        instagrams1.add(new Instagram("Shaff Shalihin", "Shaff", "Tidak Ada yang lebih kuat dariku"
                , R.drawable.shaff, R.drawable.rama));

        instagrams1.add(new Instagram("Saldan Rama", "Rama", "Perjalanan Mnejadi bajak laut"
                , R.drawable.rama, R.drawable.trisman));

        instagrams1.add(new Instagram("Alif Rezky", "Alif", "Pukulan sekali membuatmu KO"
                , R.drawable.ares, R.drawable.shaff));

        return instagrams1;

    }

}
