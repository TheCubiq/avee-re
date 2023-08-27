package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class ID3v2PictureFrameData extends AbstractID3v2FrameData {
    protected EncodedText description;
    protected byte[] imageData;
    protected String mimeType;
    protected byte pictureType;

    public ID3v2PictureFrameData(boolean z) {
        super(z);
    }

    public ID3v2PictureFrameData(boolean z, String str, byte b, EncodedText encodedText, byte[] bArr) {
        super(z);
        this.mimeType = str;
        this.pictureType = b;
        this.description = encodedText;
        this.imageData = bArr;
    }

    public ID3v2PictureFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        synchroniseAndUnpackFrameData(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        int indexOfTerminator = BufferTools.indexOfTerminator(bArr, 1, 1);
        if (indexOfTerminator >= 0) {
            try {
                this.mimeType = BufferTools.byteBufferToString(bArr, 1, indexOfTerminator - 1);
            } catch (UnsupportedEncodingException unused) {
                this.mimeType = "image/unknown";
            }
        } else {
            this.mimeType = "image/unknown";
        }
        this.pictureType = bArr[indexOfTerminator + 1];
        int i = indexOfTerminator + 2;
        int indexOfTerminatorForEncoding = BufferTools.indexOfTerminatorForEncoding(bArr, i, bArr[0]);
        if (indexOfTerminatorForEncoding >= 0) {
            EncodedText encodedText = new EncodedText(bArr[0], BufferTools.copyBuffer(bArr, i, indexOfTerminatorForEncoding - i));
            this.description = encodedText;
            i = indexOfTerminatorForEncoding + encodedText.getTerminator().length;
        } else {
            this.description = new EncodedText(bArr[0], "");
        }
        this.imageData = BufferTools.copyBuffer(bArr, i, bArr.length - i);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected byte[] packFrameData() {
        int i;
        int i2;
        byte[] bArr = new byte[getLength()];
        EncodedText encodedText = this.description;
        if (encodedText != null) {
            bArr[0] = encodedText.getTextEncoding();
        } else {
            bArr[0] = 0;
        }
        String str = this.mimeType;
        if (str == null || str.length() <= 0) {
            i = 0;
        } else {
            i = this.mimeType.length();
            try {
                BufferTools.stringIntoByteBuffer(this.mimeType, 0, i, bArr, 1);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        int i3 = i + 1;
        int i4 = i3 + 1;
        bArr[i3] = 0;
        int i5 = i4 + 1;
        bArr[i4] = this.pictureType;
        EncodedText encodedText2 = this.description;
        if (encodedText2 != null && encodedText2.toBytes().length > 0) {
            byte[] bytes = this.description.toBytes(true, true);
            BufferTools.copyIntoByteBuffer(bytes, 0, bytes.length, bArr, i5);
            i2 = i5 + bytes.length;
        } else {
            bArr[i5] = 0;
            i2 = i5 + 1;
        }
        byte[] bArr2 = this.imageData;
        if (bArr2 != null && bArr2.length > 0) {
            BufferTools.copyIntoByteBuffer(bArr2, 0, bArr2.length, bArr, i2);
        }
        return bArr;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected int getLength() {
        String str = this.mimeType;
        int length = str != null ? 3 + str.length() : 3;
        EncodedText encodedText = this.description;
        int length2 = encodedText != null ? length + encodedText.toBytes(true, true).length : length + 1;
        byte[] bArr = this.imageData;
        return bArr != null ? length2 + bArr.length : length2;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public byte getPictureType() {
        return this.pictureType;
    }

    public void setPictureType(byte b) {
        this.pictureType = b;
    }

    public EncodedText getDescription() {
        return this.description;
    }

    public void setDescription(EncodedText encodedText) {
        this.description = encodedText;
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public void setImageData(byte[] bArr) {
        this.imageData = bArr;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        EncodedText encodedText = this.description;
        int hashCode2 = (((hashCode + (encodedText == null ? 0 : encodedText.hashCode())) * 31) + Arrays.hashCode(this.imageData)) * 31;
        String str = this.mimeType;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.pictureType;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            ID3v2PictureFrameData iD3v2PictureFrameData = (ID3v2PictureFrameData) obj;
            EncodedText encodedText = this.description;
            if (encodedText == null) {
                if (iD3v2PictureFrameData.description != null) {
                    return false;
                }
            } else if (!encodedText.equals(iD3v2PictureFrameData.description)) {
                return false;
            }
            if (Arrays.equals(this.imageData, iD3v2PictureFrameData.imageData)) {
                String str = this.mimeType;
                if (str == null) {
                    if (iD3v2PictureFrameData.mimeType != null) {
                        return false;
                    }
                } else if (!str.equals(iD3v2PictureFrameData.mimeType)) {
                    return false;
                }
                return this.pictureType == iD3v2PictureFrameData.pictureType;
            }
            return false;
        }
        return false;
    }
}
