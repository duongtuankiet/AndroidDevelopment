package com.project.Nhom1project;

import android.content.Context;

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

}
