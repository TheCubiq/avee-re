package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
/* loaded from: classes2.dex */
public class ID3v2WWWFrameData extends AbstractID3v2FrameData {
    protected String url;

    public ID3v2WWWFrameData(boolean z) {
        super(z);
    }

    public ID3v2WWWFrameData(boolean z, String str) {
        super(z);
        this.url = str;
    }

    public ID3v2WWWFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        synchroniseAndUnpackFrameData(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        try {
            this.url = BufferTools.byteBufferToString(bArr, 0, bArr.length);
        } catch (UnsupportedEncodingException unused) {
            this.url = "";
        }
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected byte[] packFrameData() {
        byte[] bArr = new byte[getLength()];
        String str = this.url;
        if (str != null && str.length() > 0) {
            try {
                BufferTools.stringIntoByteBuffer(this.url, 0, this.url.length(), bArr, 0);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return bArr;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected int getLength() {
        String str = this.url;
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
