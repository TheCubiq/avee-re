package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class ID3v2TagFactory {
    public static AbstractID3v2Tag createTag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        sanityCheckTag(bArr);
        byte b = bArr[3];
        if (b != 2) {
            if (b != 3) {
                if (b == 4) {
                    return new ID3v24Tag(bArr);
                }
                throw new UnsupportedTagException("Tag version not supported");
            }
            return new ID3v23Tag(bArr);
        }
        return createID3v22Tag(bArr);
    }

    private static AbstractID3v2Tag createID3v22Tag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        ID3v22Tag iD3v22Tag = new ID3v22Tag(bArr);
        return iD3v22Tag.getFrameSets().isEmpty() ? new ID3v22Tag(bArr, true) : iD3v22Tag;
    }

    public static void sanityCheckTag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException {
        if (bArr.length < 10) {
            throw new NoSuchTagException("Buffer too short");
        }
        if (!"ID3".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, 0, 3))) {
            throw new NoSuchTagException();
        }
        byte b = bArr[3];
        if (b == 2 || b == 3 || b == 4) {
            return;
        }
        byte b2 = bArr[4];
        throw new UnsupportedTagException("Unsupported version 2." + ((int) b) + "." + ((int) b2));
    }
}
