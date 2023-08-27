package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes2.dex */
public class ID3v2PopmFrameData extends AbstractID3v2FrameData {
    protected static final String WMP9_ADDRESS = "Windows Media Player 9 Series";
    private static final Map<Byte, Integer> byteToRating = new HashMap(5);
    private static final byte[] wmp9encodedRatings = {0, 1, 64, ByteCompanionObject.MIN_VALUE, -60, -1};
    protected String address;
    protected int rating;

    static {
        for (int i = 0; i < 6; i++) {
            byteToRating.put(Byte.valueOf(wmp9encodedRatings[i]), Integer.valueOf(i));
        }
    }

    public ID3v2PopmFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        this.address = "";
        this.rating = -1;
        synchroniseAndUnpackFrameData(bArr);
    }

    public ID3v2PopmFrameData(boolean z, int i) {
        super(z);
        this.address = "";
        this.rating = -1;
        this.address = WMP9_ADDRESS;
        this.rating = i;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        try {
            this.address = BufferTools.byteBufferToString(bArr, 0, bArr.length - 2);
        } catch (UnsupportedEncodingException unused) {
            this.address = "";
        }
        byte b = bArr[bArr.length - 1];
        if (byteToRating.containsKey(Byte.valueOf(b))) {
            this.rating = byteToRating.get(Byte.valueOf(b)).intValue();
        } else {
            this.rating = -1;
        }
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected byte[] packFrameData() {
        byte[] copyOf = Arrays.copyOf(this.address.getBytes(), this.address.length() + 2);
        copyOf[copyOf.length - 2] = 0;
        copyOf[copyOf.length - 1] = wmp9encodedRatings[this.rating];
        return copyOf;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int i) {
        this.rating = i;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected int getLength() {
        return this.address.length() + 2;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.address;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.rating;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            ID3v2PopmFrameData iD3v2PopmFrameData = (ID3v2PopmFrameData) obj;
            String str = this.address;
            if (str == null) {
                if (iD3v2PopmFrameData.address != null) {
                    return false;
                }
            } else if (!str.equals(iD3v2PopmFrameData.address)) {
                return false;
            }
            return this.rating == iD3v2PopmFrameData.rating;
        }
        return false;
    }
}
