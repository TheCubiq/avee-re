package com.mpatric.mp3agic;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class ID3v2ChapterFrameData extends AbstractID3v2FrameData {
    protected int endOffset;
    protected int endTime;
    protected String id;
    protected int startOffset;
    protected int startTime;
    protected ArrayList<ID3v2Frame> subframes;

    public ID3v2ChapterFrameData(boolean z) {
        super(z);
        this.subframes = new ArrayList<>();
    }

    public ID3v2ChapterFrameData(boolean z, String str, int i, int i2, int i3, int i4) {
        super(z);
        this.subframes = new ArrayList<>();
        this.id = str;
        this.startTime = i;
        this.endTime = i2;
        this.startOffset = i3;
        this.endOffset = i4;
    }

    public ID3v2ChapterFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        this.subframes = new ArrayList<>();
        synchroniseAndUnpackFrameData(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        String extractNullTerminatedString = ByteBufferUtils.extractNullTerminatedString(wrap);
        this.id = extractNullTerminatedString;
        wrap.position(extractNullTerminatedString.length() + 1);
        this.startTime = wrap.getInt();
        this.endTime = wrap.getInt();
        this.startOffset = wrap.getInt();
        this.endOffset = wrap.getInt();
        int position = wrap.position();
        while (position < bArr.length) {
            ID3v2Frame iD3v2Frame = new ID3v2Frame(bArr, position);
            position += iD3v2Frame.getLength();
            this.subframes.add(iD3v2Frame);
        }
    }

    public void addSubframe(String str, AbstractID3v2FrameData abstractID3v2FrameData) {
        this.subframes.add(new ID3v2Frame(str, abstractID3v2FrameData.toBytes()));
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected byte[] packFrameData() {
        ByteBuffer allocate = ByteBuffer.allocate(getLength());
        allocate.put(this.id.getBytes());
        allocate.put((byte) 0);
        allocate.putInt(this.startTime);
        allocate.putInt(this.endTime);
        allocate.putInt(this.startOffset);
        allocate.putInt(this.endOffset);
        Iterator<ID3v2Frame> it = this.subframes.iterator();
        while (it.hasNext()) {
            try {
                allocate.put(it.next().toBytes());
            } catch (NotSupportedException e) {
                e.printStackTrace();
            }
        }
        return allocate.array();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public int getStartOffset() {
        return this.startOffset;
    }

    public void setStartOffset(int i) {
        this.startOffset = i;
    }

    public int getEndOffset() {
        return this.endOffset;
    }

    public void setEndOffset(int i) {
        this.endOffset = i;
    }

    public ArrayList<ID3v2Frame> getSubframes() {
        return this.subframes;
    }

    public void setSubframes(ArrayList<ID3v2Frame> arrayList) {
        this.subframes = arrayList;
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected int getLength() {
        String str = this.id;
        int length = str != null ? 17 + str.length() : 17;
        ArrayList<ID3v2Frame> arrayList = this.subframes;
        if (arrayList != null) {
            Iterator<ID3v2Frame> it = arrayList.iterator();
            while (it.hasNext()) {
                length += it.next().getLength();
            }
        }
        return length;
    }

    public String toString() {
        return "ID3v2ChapterFrameData [id=" + this.id + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", subframes=" + this.subframes + "]";
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public int hashCode() {
        int i = (((this.endOffset + 31) * 31) + this.endTime) * 31;
        String str = this.id;
        int hashCode = (((((i + (str == null ? 0 : str.hashCode())) * 31) + this.startOffset) * 31) + this.startTime) * 31;
        ArrayList<ID3v2Frame> arrayList = this.subframes;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            ID3v2ChapterFrameData iD3v2ChapterFrameData = (ID3v2ChapterFrameData) obj;
            if (this.endOffset == iD3v2ChapterFrameData.endOffset && this.endTime == iD3v2ChapterFrameData.endTime) {
                String str = this.id;
                if (str == null) {
                    if (iD3v2ChapterFrameData.id != null) {
                        return false;
                    }
                } else if (!str.equals(iD3v2ChapterFrameData.id)) {
                    return false;
                }
                if (this.startOffset == iD3v2ChapterFrameData.startOffset && this.startTime == iD3v2ChapterFrameData.startTime) {
                    ArrayList<ID3v2Frame> arrayList = this.subframes;
                    if (arrayList == null) {
                        if (iD3v2ChapterFrameData.subframes != null) {
                            return false;
                        }
                    } else if (!arrayList.equals(iD3v2ChapterFrameData.subframes)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
