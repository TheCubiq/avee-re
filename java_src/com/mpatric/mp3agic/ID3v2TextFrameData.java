package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class ID3v2TextFrameData extends AbstractID3v2FrameData {
    protected EncodedText text;

    public ID3v2TextFrameData(boolean z) {
        super(z);
    }

    public ID3v2TextFrameData(boolean z, EncodedText encodedText) {
        super(z);
        this.text = encodedText;
    }

    public ID3v2TextFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        synchroniseAndUnpackFrameData(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        this.text = new EncodedText(bArr[0], BufferTools.copyBuffer(bArr, 1, bArr.length - 1));
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected byte[] packFrameData() {
        byte[] bArr = new byte[getLength()];
        EncodedText encodedText = this.text;
        if (encodedText != null) {
            bArr[0] = encodedText.getTextEncoding();
            byte[] bytes = this.text.toBytes(true, false);
            if (bytes.length > 0) {
                BufferTools.copyIntoByteBuffer(bytes, 0, bytes.length, bArr, 1);
            }
        }
        return bArr;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected int getLength() {
        EncodedText encodedText = this.text;
        if (encodedText != null) {
            return 1 + encodedText.toBytes(true, false).length;
        }
        return 1;
    }

    public EncodedText getText() {
        return this.text;
    }

    public void setText(EncodedText encodedText) {
        this.text = encodedText;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        EncodedText encodedText = this.text;
        return hashCode + (encodedText == null ? 0 : encodedText.hashCode());
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            ID3v2TextFrameData iD3v2TextFrameData = (ID3v2TextFrameData) obj;
            EncodedText encodedText = this.text;
            if (encodedText == null) {
                if (iD3v2TextFrameData.text != null) {
                    return false;
                }
            } else if (!encodedText.equals(iD3v2TextFrameData.text)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
