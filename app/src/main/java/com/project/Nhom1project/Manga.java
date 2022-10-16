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
        String[] names = {
                "Isekai Ojisan",
                "Slime Datta Ken",
                "Jujutsu Kaisen",
                "OnePiece",
                "Naruto",
                "Dragon Ball ",
                "Conan",
                "Elite Classroom",
                "Horimiya",
                "Uzaki-chan wa asobitai",
                "Overflow",
                "Fairy Tail",
                "Kimetsu no Yaiba",
                "Attack on Titan",
                "Inuyasha"};

        int[] pics = {
                R.drawable.isekaiojisan,
                R.drawable.slimedattaken,
                R.drawable.jujutsukaisen,
                R.drawable.op,
                R.drawable.naruto,
                R.drawable.dragonball,
                R.drawable.conan,
                R.drawable.eliteclassroom,
                R.drawable.horimiya,
                R.drawable.uzakichan,
                R.drawable.overflow,
                R.drawable.fairytail,
                R.drawable.kimetsunoyaiba,
                R.drawable.attackontitan,
                R.drawable.inuyasha};
        ArrayList<Manga> arrayList = new ArrayList<>(); for (int i = 0; i <
                names.length; i++) {
            Manga manga = new Manga(names[i], null, i + 1, pics[i]);
            arrayList.add(manga);
        }
        return arrayList;
}}
