package com.example.android.warsawtourguide;

public class Info {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mName;
    private int mInfo;
    private int mPrice;
    private int mAddress;
    private int mPhone;
    private int mWebsite;

    public Info (int imageResourceId, int name, int info, int price, int address, int phone, int website) {
        mImageResourceId = imageResourceId;
        mName = name;
        mInfo = info;
        mPrice = price;
        mAddress = address;
        mPhone = phone;
        mWebsite = website;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getInfo() {
        return mInfo;
    }

    public int getPrice() {
        return mPrice;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getPhone() {
        return mPhone;
    }

    public int getWebsite() {
        return mWebsite;
    }

}
