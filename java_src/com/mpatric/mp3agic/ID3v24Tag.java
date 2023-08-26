package com.mpatric.mp3agic;

import java.util.Map;
/* loaded from: classes2.dex */
public class ID3v24Tag extends AbstractID3v2Tag {
    public static final String ID_RECTIME = "TDRC";
    public static final String VERSION = "4.0";

    public ID3v24Tag() {
        this.version = VERSION;
    }

    public ID3v24Tag(byte[] bArr) throws NoSuchTagException, UnsupportedTagException, InvalidDataException {
        super(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected void unpackFlags(byte[] bArr) {
        this.unsynchronisation = BufferTools.checkBit(bArr[5], 7);
        this.extendedHeader = BufferTools.checkBit(bArr[5], 6);
        this.experimental = BufferTools.checkBit(bArr[5], 5);
        this.footer = BufferTools.checkBit(bArr[5], 4);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected void packFlags(byte[] bArr, int i) {
        int i2 = i + 5;
        bArr[i2] = BufferTools.setBit(bArr[i2], 7, this.unsynchronisation);
        bArr[i2] = BufferTools.setBit(bArr[i2], 6, this.extendedHeader);
        bArr[i2] = BufferTools.setBit(bArr[i2], 5, this.experimental);
        bArr[i2] = BufferTools.setBit(bArr[i2], 4, this.footer);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected boolean useFrameUnsynchronisation() {
        return this.unsynchronisation;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected ID3v2Frame createFrame(byte[] bArr, int i) throws InvalidDataException {
        return new ID3v24Frame(bArr, i);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag
    protected ID3v2Frame createFrame(String str, byte[] bArr) {
        return new ID3v24Frame(str, bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2Tag, com.mpatric.mp3agic.ID3v2
    public void setGenreDescription(String str) {
        ID3v2TextFrameData iD3v2TextFrameData = new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str));
        ID3v2FrameSet iD3v2FrameSet = getFrameSets().get(AbstractID3v2Tag.ID_GENRE);
        if (iD3v2FrameSet == null) {
            Map<String, ID3v2FrameSet> frameSets = getFrameSets();
            ID3v2FrameSet iD3v2FrameSet2 = new ID3v2FrameSet(AbstractID3v2Tag.ID_GENRE);
            frameSets.put(AbstractID3v2Tag.ID_GENRE, iD3v2FrameSet2);
            iD3v2FrameSet = iD3v2FrameSet2;
        }
        iD3v2FrameSet.clear();
        iD3v2FrameSet.addFrame(createFrame(AbstractID3v2Tag.ID_GENRE, iD3v2TextFrameData.toBytes()));
    }

    public String getRecordingTime() {
        ID3v2TextFrameData extractTextFrameData = extractTextFrameData(ID_RECTIME);
        if (extractTextFrameData == null || extractTextFrameData.getText() == null) {
            return null;
        }
        return extractTextFrameData.getText().toString();
    }

    public void setRecordingTime(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        invalidateDataLength();
        addFrame(createFrame(ID_RECTIME, new ID3v2TextFrameData(useFrameUnsynchronisation(), new EncodedText(str)).toBytes()), true);
    }
}
