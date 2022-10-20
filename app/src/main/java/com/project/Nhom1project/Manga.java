package com.project.Nhom1project;

import java.util.ArrayList;

public class Manga {
    private String name; private int pic,rank;
    public Manga(String name, int pic, int rank)
    {
            this.name = name;
            this.pic = pic;
            this.rank = rank;
    }
    public Manga(String name){ this.name = name;
    }
    public String getName() { return name;
    }
    public void setName(String name) { this.name = name;
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
            Manga manga = new Manga(names[i],  pics[i],i+1);
            arrayList.add(manga);
        }
        return arrayList;
}}
