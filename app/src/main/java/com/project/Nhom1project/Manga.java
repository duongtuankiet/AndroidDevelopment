package com.project.Nhom1project;

import java.util.ArrayList;

public class Manga {
    private String name; private int id,pic,rank;
    public Manga(int id, String name, int pic, int rank)
    {
            this.id = id;
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
    public int getId() { return id;
    }
    public void setId(int id ) { this.id = id;
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
        int[] rank = {
                3,       //1: action, 2: adventure, 3: comedy, 4: romance, 5: 18+
                1,
                1,
                2,
                2,
                1,
                2,
                4,
                4,
                3,
                5,
                1,
                2,
                1,
                2};
        ArrayList<Manga> arrayList = new ArrayList<>(); for (int i = 0; i < names.length; i++) {
            Manga manga = new Manga(i+1,names[i],  pics[i],rank[i]);
            arrayList.add(manga);
        }
        return arrayList;
}}
