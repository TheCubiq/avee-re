package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
/* loaded from: classes2.dex */
public class ID3v2UrlFrameData extends AbstractID3v2FrameData {
    protected EncodedText description;
    protected String url;

    public ID3v2UrlFrameData(boolean z) {
        super(z);
    }

    public ID3v2UrlFrameData(boolean z, EncodedText encodedText, String str) {
        super(z);
        this.description = encodedText;
        this.url = str;
    }

    public ID3v2UrlFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        synchroniseAndUnpackFrameData(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        int i = 1;
        int indexOfTerminatorForEncoding = BufferTools.indexOfTerminatorForEncoding(bArr, 1, bArr[0]);
        if (indexOfTerminatorForEncoding >= 0) {
            EncodedText encodedText = new EncodedText(bArr[0], BufferTools.copyBuffer(bArr, 1, indexOfTerminatorForEncoding - 1));
            this.description = encodedText;
            i = indexOfTerminatorForEncoding + encodedText.getTerminator().length;
        } else {
            this.description = new EncodedText(bArr[0], "");
        }
        try {
            this.url = BufferTools.byteBufferToString(bArr, i, bArr.length - i);
        } catch (UnsupportedEncodingException unused) {
            this.url = "";
        }
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected byte[] packFrameData() {
        int i;
        byte[] bArr = new byte[getLength()];
        EncodedText encodedText = this.description;
        if (encodedText != null) {
            bArr[0] = encodedText.getTextEncoding();
        } else {
            bArr[0] = 0;
        }
        EncodedText encodedText2 = this.description;
        if (encodedText2 != null) {
            byte[] bytes = encodedText2.toBytes(true, true);
            BufferTools.copyIntoByteBuffer(bytes, 0, bytes.length, bArr, 1);
            i = bytes.length + 1;
        } else {
            i = 2;
            bArr[1] = 0;
        }
        String str = this.url;
        if (str != null && str.length() > 0) {
            try {
                BufferTools.stringIntoByteBuffer(this.url, 0, this.url.length(), bArr, i);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return bArr;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected int getLength() {
        EncodedText encodedText = this.description;
        int length = encodedText != null ? encodedText.toBytes(true, true).length + 1 : 2;
        String str = this.url;
        return str != null ? length + str.length() : length;
    }

    public EncodedText getDescription() {
        return this.description;
    }

    public void setDescription(EncodedText encodedText) {
        this.description = encodedText;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        EncodedText encodedText = this.description;
        int hashCode2 = (hashCode + (encodedText == null ? 0 : encodedText.hashCode())) * 31;
        String str = this.url;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            ID3v2UrlFrameData iD3v2UrlFrameData = (ID3v2UrlFrameData) obj;
            EncodedText encodedText = this.description;
            if (encodedText == null) {
                if (iD3v2UrlFrameData.description != null) {
                    return false;
                }
            } else if (!encodedText.equals(iD3v2UrlFrameData.description)) {
                return false;
            }
            String str = this.url;
            if (str == null) {
                if (iD3v2UrlFrameData.url != null) {
                    return false;
                }
            } else if (!str.equals(iD3v2UrlFrameData.url)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
