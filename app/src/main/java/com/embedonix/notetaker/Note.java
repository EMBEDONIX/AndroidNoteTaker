package com.embedonix.notetaker;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by saeid on 5/8/2016.
 */
public class Note implements Serializable {

    private long mDateTime;
    private String mTitle;
    private String mContent;

    public Note(long dateTime, String title, String content) {
        mDateTime = dateTime;
        mTitle = title;
        mContent = content;
    }

    public void setDateTime(long dateTime) {
        mDateTime = dateTime;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public long getDateTime() {
        return mDateTime;
    }

    public String getDateTimeFormatted() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(new Date(mDateTime));
    }

    public String getTitle() {
        return mTitle;
    }

    public String getContent() {
        return mContent;
    }

}
