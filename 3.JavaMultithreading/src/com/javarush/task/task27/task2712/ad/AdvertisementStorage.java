package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {
    private static AdvertisementStorage instance;
    private final List<Advertisement> videos = new ArrayList();

    private AdvertisementStorage() {
        Object someContent = new Object();
        videos.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min
        videos.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60)); //15 min
        videos.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60));   //10 min*/
        /*
        videos.add(new Advertisement(someContent, "1", 152, 3, 3 * 60));
        videos.add(new Advertisement(someContent, "2", 5, 2, 5 * 60));
        videos.add(new Advertisement(someContent, "3", 3, 2, 3 * 60));
        videos.add(new Advertisement(someContent, "4", 99, 10, 2 * 60));
        videos.add(new Advertisement(someContent, "X", 2000, 3, 6 * 60));
        videos.add(new Advertisement(someContent, "5", 150, 3, 3 * 60));
        videos.add(new Advertisement(someContent, "1First Video", 5000, 1, 3 * 60));
        videos.add(new Advertisement(someContent, "2Second Video", 100, 1, 15 * 60));
        videos.add(new Advertisement(someContent, "3Third Video", 400, 2, 10 * 60));
        videos.add(new Advertisement(someContent, "First Video", 5000, 2, 3 * 60)); // 3 min
        videos.add(new Advertisement(someContent, "Second Video", 100, 1, 15 * 60)); //15 min
        videos.add(new Advertisement(someContent, "четвертое видео", 400, 2, 10 * 60));   //10 min*/

/*        for (int i = 0; i < 10; i++) {
            String name = i+" Video"; // - имя/название
            long initialAmount = 1 +(long) (Math.random()*10000); // - начальная сумма, стоимость рекламы в копейках. Используем long, чтобы избежать проблем с округлением
            int hits = 2; // - количество оплаченных показов
            int duration = 1 + (int)(Math.random()*10)*60; // - продолжительность в секундах
            videos.add(new Advertisement(someContent, name, initialAmount, hits, duration));
        }*/
    }

    public static AdvertisementStorage getInstance() {
        if (instance == null)
            instance = new AdvertisementStorage();
        return instance;
    }

    public List<Advertisement> list(){
        return videos;
    }

    public void add(Advertisement advertisement){
        videos.add(advertisement);
    }
}