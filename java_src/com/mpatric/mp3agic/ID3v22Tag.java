package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class ID3v22Tag extends AbstractID3v2Tag {
    public static final String VERSION = "2.0";

    public ID3v22Tag() {
        this.version = "2.0";
    }

    public ID3v22Tag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        super(bArr);
    }

    public ID3v22Tag(byte[] bArr, boolean z) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        super(bArr, z);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected void unpackFlags(byte[] bArr) {
        this.unsynchronisation = BufferTools.checkBit(bArr[5], 7);
        this.compression = BufferTools.checkBit(bArr[5], 6);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected void packFlags(byte[] bArr, int i) {
        int i2 = i + 5;
        bArr[i2] = BufferTools.setBit(bArr[i2], 7, this.unsynchronisation);
        bArr[i2] = BufferTools.setBit(bArr[i2], 6, this.compression);
    }
}
