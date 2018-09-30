package net.amykang.washingtontourguide;

public class Place {

    private String mName;

    private String mAddress;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public Place(String name, String address, int image) {
        mName = name;
        mAddress = address;
        mImageResourceId = image;
    }

    public String getName() { return mName; }

    public String getAddress() { return mAddress; }

    public int getImageResourceId() { return mImageResourceId; }

    /*
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
