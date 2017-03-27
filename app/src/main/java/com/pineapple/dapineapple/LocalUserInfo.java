package com.pineapple.dapineapple;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dillonchristensen on 3/23/17.
 *

class LocalUserInfo implements Parcelable {
    //Constructor
    public LocalUserInfo(String name, String email, String password) {
        this.email = em;
        this.chapter = chapter;
        this.verse = verse;
        generateScripture();
    }

    // Getters
    public String getBook() {return book;}
    public int getChapter() {return chapter;}
    public int getVerse() {return verse;}
    public String getScripture() {return scripture;}

    // Setters
    public void setBook(String book) {this.book = book;}
    public void setChapter(int chapter) {this.chapter = chapter;}
    public void setVerse(int verse) {this.verse = verse;}
    public void setScripture(String scripture) {this.scripture = scripture;}

    // Private Methods
    private void generateScripture(){
        scripture = book + ' ' + chapter + ": " + verse;
    }

    // Private Variables
    private String name;
    private String email;
    private String password;

    /***********************************************************************************************
     * Parcelable code
     **********************************************************************************************

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(book);
        dest.writeInt(chapter);
        dest.writeInt(verse);
        dest.writeString(scripture);
    }

    protected FavoriteScripture(Parcel in) {
        book = in.readString();
        chapter = in.readInt();
        verse = in.readInt();
        scripture = in.readString();
    }

    public static final Creator<FavoriteScripture> CREATOR = new Creator<FavoriteScripture>() {
        @Override
        public FavoriteScripture createFromParcel(Parcel in) {
            return new FavoriteScripture(in);
        }

        @Override
        public FavoriteScripture[] newArray(int size) {
            return new FavoriteScripture[size];
        }
    };
}
*/