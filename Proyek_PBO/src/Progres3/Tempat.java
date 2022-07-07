package Progres3;

public class Tempat {
    private int levelSekarang = 1;
    public int level;

    public Tempat(int level){
        this.level = level;
    }

    public void naikLevel(){
        this.levelSekarang++;
    }

    public int AmbilLevel(){
        return this.levelSekarang;
    }
}
