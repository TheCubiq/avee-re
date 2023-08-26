package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class ID3v2ObseleteFrame extends ID3v2Frame {
    protected static final int DATA_LENGTH_OFFSET = 3;
    private static final int HEADER_LENGTH = 6;
    private static final int ID_LENGTH = 3;
    private static final int ID_OFFSET = 0;

    public ID3v2ObseleteFrame(byte[] bArr, int i) throws InvalidDataException {
        super(bArr, i);
    }

    public ID3v2ObseleteFrame(String str, byte[] bArr) {
        super(str, bArr);
    }

    @Override // com.mpatric.mp3agic.ID3v2Frame
    protected int unpackHeader(byte[] bArr, int i) {
        this.id = BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i + 0, 3);
        unpackDataLength(bArr, i);
        return i + 6;
    }

    @Override // com.mpatric.mp3agic.ID3v2Frame
    protected void unpackDataLength(byte[] bArr, int i) {
        int i2 = i + 3;
        this.dataLength = BufferTools.unpackInteger((byte) 0, bArr[i2], bArr[i2 + 1], bArr[i2 + 2]);
    }

    @Override // com.mpatric.mp3agic.ID3v2Frame
    public void packFrame(byte[] bArr, int i) throws NotSupportedException {
        throw new NotSupportedException("Packing Obselete frames is not supported");
    }

    @Override // com.mpatric.mp3agic.ID3v2Frame
    public int getLength() {
        return this.dataLength + 6;
    }
}
