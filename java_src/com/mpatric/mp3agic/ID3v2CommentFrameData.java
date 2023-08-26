package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
/* loaded from: classes2.dex */
public class ID3v2CommentFrameData extends AbstractID3v2FrameData {
    private static final String DEFAULT_LANGUAGE = "eng";
    private EncodedText comment;
    private EncodedText description;
    private String language;

    public ID3v2CommentFrameData(boolean z) {
        super(z);
    }

    public ID3v2CommentFrameData(boolean z, String str, EncodedText encodedText, EncodedText encodedText2) {
        super(z);
        this.language = str;
        this.description = encodedText;
        this.comment = encodedText2;
    }

    public ID3v2CommentFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        synchroniseAndUnpackFrameData(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        try {
            this.language = BufferTools.byteBufferToString(bArr, 1, 3);
        } catch (UnsupportedEncodingException unused) {
            this.language = "";
        }
        int i = 4;
        int indexOfTerminatorForEncoding = BufferTools.indexOfTerminatorForEncoding(bArr, 4, bArr[0]);
        if (indexOfTerminatorForEncoding >= 4) {
            EncodedText encodedText = new EncodedText(bArr[0], BufferTools.copyBuffer(bArr, 4, indexOfTerminatorForEncoding - 4));
            this.description = encodedText;
            i = indexOfTerminatorForEncoding + encodedText.getTerminator().length;
        } else {
            this.description = new EncodedText(bArr[0], "");
        }
        this.comment = new EncodedText(bArr[0], BufferTools.copyBuffer(bArr, i, bArr.length - i));
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected byte[] packFrameData() {
        String padStringRight;
        int i;
        byte[] bArr = new byte[getLength()];
        EncodedText encodedText = this.comment;
        if (encodedText != null) {
            bArr[0] = encodedText.getTextEncoding();
        } else {
            bArr[0] = 0;
        }
        String str = this.language;
        if (str == null) {
            padStringRight = DEFAULT_LANGUAGE;
        } else if (str.length() > 3) {
            padStringRight = this.language.substring(0, 3);
        } else {
            padStringRight = BufferTools.padStringRight(this.language, 3, (char) 0);
        }
        try {
            BufferTools.stringIntoByteBuffer(padStringRight, 0, 3, bArr, 1);
        } catch (UnsupportedEncodingException unused) {
        }
        EncodedText encodedText2 = this.description;
        if (encodedText2 != null) {
            byte[] bytes = encodedText2.toBytes(true, true);
            BufferTools.copyIntoByteBuffer(bytes, 0, bytes.length, bArr, 4);
            i = bytes.length + 4;
        } else {
            i = 5;
            bArr[4] = 0;
        }
        EncodedText encodedText3 = this.comment;
        if (encodedText3 != null) {
            byte[] bytes2 = encodedText3.toBytes(true, false);
            BufferTools.copyIntoByteBuffer(bytes2, 0, bytes2.length, bArr, i);
        }
        return bArr;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected int getLength() {
        EncodedText encodedText = this.description;
        int length = encodedText != null ? encodedText.toBytes(true, true).length + 4 : 5;
        EncodedText encodedText2 = this.comment;
        return encodedText2 != null ? length + encodedText2.toBytes(true, false).length : length;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public EncodedText getComment() {
        return this.comment;
    }

    public void setComment(EncodedText encodedText) {
        this.comment = encodedText;
    }

    public EncodedText getDescription() {
        return this.description;
    }

    public void setDescription(EncodedText encodedText) {
        this.description = encodedText;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        EncodedText encodedText = this.comment;
        int hashCode2 = (hashCode + (encodedText == null ? 0 : encodedText.hashCode())) * 31;
        EncodedText encodedText2 = this.description;
        int hashCode3 = (hashCode2 + (encodedText2 == null ? 0 : encodedText2.hashCode())) * 31;
        String str = this.language;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            ID3v2CommentFrameData iD3v2CommentFrameData = (ID3v2CommentFrameData) obj;
            EncodedText encodedText = this.comment;
            if (encodedText == null) {
                if (iD3v2CommentFrameData.comment != null) {
                    return false;
                }
            } else if (!encodedText.equals(iD3v2CommentFrameData.comment)) {
                return false;
            }
            EncodedText encodedText2 = this.description;
            if (encodedText2 == null) {
                if (iD3v2CommentFrameData.description != null) {
                    return false;
                }
            } else if (!encodedText2.equals(iD3v2CommentFrameData.description)) {
                return false;
            }
            String str = this.language;
            if (str == null) {
                if (iD3v2CommentFrameData.language != null) {
                    return false;
                }
            } else if (!str.equals(iD3v2CommentFrameData.language)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
