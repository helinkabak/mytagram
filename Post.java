package com.example.mytagram;

import android.graphics.Bitmap;
import android.location.Location;

public class Post {
    private Bitmap image;
    private Location location;
    private String message ;

    public Location getLocation() {
        return location;
    }

    public String getMessage() {
        return message;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
