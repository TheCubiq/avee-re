package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class ID3v23Tag extends AbstractID3v2Tag {
    public static final String VERSION = "3.0";

    public ID3v23Tag() {
        this.version = VERSION;
    }

    public ID3v23Tag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        super(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected void unpackFlags(byte[] bArr) {
        this.unsynchronisation = BufferTools.checkBit(bArr[5], 7);
        this.extendedHeader = BufferTools.checkBit(bArr[5], 6);
        this.experimental = BufferTools.checkBit(bArr[5], 5);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected void packFlags(byte[] bArr, int i) {
        int i2 = i + 5;
        bArr[i2] = BufferTools.setBit(bArr[i2], 7, this.unsynchronisation);
        bArr[i2] = BufferTools.setBit(bArr[i2], 6, this.extendedHeader);
        bArr[i2] = BufferTools.setBit(bArr[i2], 5, this.experimental);
    }
}
