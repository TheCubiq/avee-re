package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class ID3v24Frame extends ID3v2Frame {
    public ID3v24Frame(byte[] bArr, int i) throws InvalidDataException {
        super(bArr, i);
    }

    public ID3v24Frame(String str, byte[] bArr) {
        super(str, bArr);
    }

    @Override // com.mpatric.mp3agic.ID3v2Frame
    protected void unpackDataLength(byte[] bArr, int i) {
        int i2 = i + 4;
        this.dataLength = BufferTools.unpackSynchsafeInteger(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
    }

    @Override // com.mpatric.mp3agic.ID3v2Frame
    protected byte[] packDataLength() {
        return BufferTools.packSynchsafeInteger(this.dataLength);
    }

    @Override // com.mpatric.mp3agic.ID3v2Frame
    public boolean equals(Object obj) {
        if (obj instanceof ID3v24Frame) {
            return super.equals(obj);
        }
        return false;
    }
}
