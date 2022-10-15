package com.project.Nhom1project;

import java.util.ArrayList;

public class Manga {
    private String name, author,year; private int pic,rank;
    public Manga(String name, String singer, String year, int pic, int
            rank) { this.name = name;
        this.author = singer;
        this.year = year; this.pic = pic; this.rank = rank;
    }
    public Manga(String name, String singer, int rank, int pic){ this.name
            = name;
        this.author = singer; this.rank = rank; this.pic = pic;
    }
    public String getName() { return name;
    }
    public void setName(String name) { this.name = name;
    }
    public String getAuthor() { return author;
    }
    public void setAuthor(String author) { this.author = author;
    }
    public String getYear() { return year;
    }
    public void setYear(String year) { this.year = year;
    }
    public int getPic() { return pic;
    }
    public void setPic(int pic) { this.pic = pic;
    }
    public int getRank() { return rank;
    }
    public void setRank(int rank) { this.rank = rank;
    }
    public static ArrayList<Manga> init(){
        String[] names = {"I Took A Pill In Ibiza", "7 Years", "Pillow Talk", "Work From Home", "Never Forget You", "Don't Let Me Down",
                "Love Yourself", "Me, Myself &amp; I", "Cake By The Ocean",
                "Dangerous Woman",
                "My House", "Stressed Out", "One Dance", "Middle", "No"};
        String[] singers = {"Mike Posner", "Lukas Graham", "Zayn", "Fifth Harmony", "Zara Larsson &amp; MNEK", "The Chainsmokers",
        "Justin Bieber", "G-Eazy x Bebe Rexha", "DNCE", "Ariana Grande", "Flo Rida", "Twenty one Pilots", "Drake", "DJ Snake", "Meghan Trainer"};
        int[] pics = {
                R.drawable.rem, R.drawable.rem,
                R.drawable.rem,
                R.drawable.rem, R.drawable.rem, R.drawable.rem,
                R.drawable.rem, R.drawable.rem, R.drawable.rem,
                R.drawable.rem, R.drawable.rem, R.drawable.rem,
                R.drawable.rem,
                R.drawable.rem, R.drawable.rem};
        ArrayList<Manga> arrayList = new ArrayList<>(); for (int i = 0; i <
                names.length; i++) {
            Manga manga = new Manga(names[i], singers[i], i + 1, pics[i]);
            arrayList.add(manga);
        }
        return arrayList;
}}
