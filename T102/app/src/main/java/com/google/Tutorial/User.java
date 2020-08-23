package com.google.Tutorial;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String Name;
    private String Password;

    public User(String name, String password) {
        Name = name;
        Password = password;
    }

    protected User(Parcel in) {
        Name = in.readString();
        Password = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Name);
        parcel.writeString(Password);
    }
}
