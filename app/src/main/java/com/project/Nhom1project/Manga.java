package com.project.Nhom1project;
public class Manga {
    private String name; private int id;
    private int pic;
    private String author, progress, description; private int favourite, like;
    public Manga(int id, String name, int pic, String author, String progress, String description, int favourite, int like)
    {
            this.id = id;
            this.name = name;
            this.pic = pic;
            this.author=author;
            this.progress=progress;
            this.description=description;
            this.favourite=favourite;
            this.like=like;
    }
    public Manga(){}
    public String getName() { return name;
    }
    public void setName(String name) { this.name = name;
    }
    public int getPic() { return pic;
    }
    public int getId() { return id;
    }
    public void setId(int id ) { this.id = id;
    }
    public String getAuthor() { return author;
    }
    public void setAuthor(String author) { this.author = author;
    }
    public int getLike() { return like;
    }
    public void setLike(int like){this.like=like;}

    public String getProgress(){return  progress;}

    public String getDescription(){return  description;}

    public void setDescription(String description) { this.description = description;
    }
    public void setProgress(String progress) { this.progress = progress;
    }
    public int getFavourite() { return favourite;
    }
    public void setFavourite(int favourite ) { this.favourite = favourite;
    }

}
