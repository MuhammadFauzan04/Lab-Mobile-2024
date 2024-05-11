package com.example.praktikum4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("faauuuzan","ojan"
                ,"1년이 또 차곡 쌓였네 2주년 너무 축하해 우리 멤버들 고맙고 사랑해 @viviz_official 두. 살 . ♡"
                ,R.drawable.ojannn,R.drawable.ojannn));

        instagrams1.add(new Instagram("trismanttw", "trisman"
                ,"\uD83E\uDD0D #CHANEL #J12 #CHANELWatches #Ad"
                ,R.drawable.trisman,R.drawable.rahmat));

        instagrams1.add(new Instagram("adriansenawir", "adr"
                ,"지금부터 마지막 피라미드게임을 시작할게"
                ,R.drawable.adr, R.drawable.al));

        instagrams1.add((new Instagram("evanpandu","rahmat"
                ,"장희수의 하루☂️\uD83C\uDFC3\u200D♀️\uD83D\uDC4A\uD83D\uDE34"
                ,R.drawable.rahmat,R.drawable.trisman)));

        instagrams1.add(new Instagram("ocangg.g", "ocang"
                ,"タイムレスな魅力で愛されるフェンディのアイコンバッグ「ピーカブー」を持って撮影しました"
                ,R.drawable.ocang,R.drawable.ocang));

        instagrams1.add(new Instagram("alifrez","alif"
                ,"설이와 수안이의 겨울"
                ,R.drawable.ares, R.drawable.ammar));

        instagrams1.add(new Instagram("ammartyo","ammar"
                , "Kcon Hong Kong❤️"
                ,R.drawable.ammar,R.drawable.ares));

        instagrams1.add(new Instagram("alqadri1972","alqadri"
                ,"회\uD83C\uDF0A #무인도의디바 하는 날~\uD83E\uDE75\uD83D\uDC99 밤 9시 20분을 기다려 주세요!!!"
                ,R.drawable.al, R.drawable.adr));

        instagrams1.add(new Instagram("shaffs.", "shaff"
                ,"with Roger Vivier "
                ,R.drawable.shaff, R.drawable.rama));

        instagrams1.add(new Instagram("ramasttk", "rama"
                ,"연습은 실전처럼 실전은 연습처럼"
                ,R.drawable.rama, R.drawable.shaff));
        return instagrams1;
    }
}
