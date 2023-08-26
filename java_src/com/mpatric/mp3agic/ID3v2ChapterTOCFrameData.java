package com.mpatric.mp3agic;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class ID3v2ChapterTOCFrameData extends AbstractID3v2FrameData {
    protected String[] children;
    protected String id;
    protected boolean isOrdered;
    protected boolean isRoot;
    protected ArrayList<ID3v2Frame> subframes;

    public ID3v2ChapterTOCFrameData(boolean z) {
        super(z);
        this.subframes = new ArrayList<>();
    }

    public ID3v2ChapterTOCFrameData(boolean z, boolean z2, boolean z3, String str, String[] strArr) {
        super(z);
        this.subframes = new ArrayList<>();
        this.isRoot = z2;
        this.isOrdered = z3;
        this.id = str;
        this.children = strArr;
    }

    public ID3v2ChapterTOCFrameData(boolean z, byte[] bArr) throws InvalidDataException {
        super(z);
        this.subframes = new ArrayList<>();
        synchroniseAndUnpackFrameData(bArr);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    protected void unpackFrameData(byte[] bArr) throws InvalidDataException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.id = ByteBufferUtils.extractNullTerminatedString(wrap);
        byte b = wrap.get();
        if ((b & 1) == 1) {
            this.isRoot = true;
        }
        if ((b & 2) == 2) {
            this.isOrdered = true;
        }
        int i = wrap.get();
        this.children = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.children[i2] = ByteBufferUtils.extractNullTerminatedString(wrap);
        }
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
        allocate.put(getFlags());
        allocate.put((byte) this.children.length);
        for (String str : this.children) {
            allocate.put(str.getBytes());
            allocate.put((byte) 0);
        }
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

    private byte getFlags() {
        byte b = this.isRoot ? (byte) 1 : (byte) 0;
        return this.isOrdered ? (byte) (b | 2) : b;
    }

    public boolean isRoot() {
        return this.isRoot;
    }

    public void setRoot(boolean z) {
        this.isRoot = z;
    }

    public boolean isOrdered() {
        return this.isOrdered;
    }

    public void setOrdered(boolean z) {
        this.isOrdered = z;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String[] getChildren() {
        return this.children;
    }

    public void setChildren(String[] strArr) {
        this.children = strArr;
    }

    @Deprecated
    public String[] getChilds() {
        return this.children;
    }

    @Deprecated
    public void setChilds(String[] strArr) {
        this.children = strArr;
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
        int length = str != null ? 3 + str.length() : 3;
        String[] strArr = this.children;
        if (strArr != null) {
            length += strArr.length;
            for (String str2 : strArr) {
                length += str2.length();
            }
        }
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
        return "ID3v2ChapterTOCFrameData [isRoot=" + this.isRoot + ", isOrdered=" + this.isOrdered + ", id=" + this.id + ", children=" + Arrays.toString(this.children) + ", subframes=" + this.subframes + "]";
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + Arrays.hashCode(this.children)) * 31;
        String str = this.id;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.isOrdered ? 1231 : 1237)) * 31) + (this.isRoot ? 1231 : 1237)) * 31;
        ArrayList<ID3v2Frame> arrayList = this.subframes;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.mpatric.mp3agic.AbstractID3v2FrameData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            ID3v2ChapterTOCFrameData iD3v2ChapterTOCFrameData = (ID3v2ChapterTOCFrameData) obj;
            if (Arrays.equals(this.children, iD3v2ChapterTOCFrameData.children)) {
                String str = this.id;
                if (str == null) {
                    if (iD3v2ChapterTOCFrameData.id != null) {
                        return false;
                    }
                } else if (!str.equals(iD3v2ChapterTOCFrameData.id)) {
                    return false;
                }
                if (this.isOrdered == iD3v2ChapterTOCFrameData.isOrdered && this.isRoot == iD3v2ChapterTOCFrameData.isRoot) {
                    ArrayList<ID3v2Frame> arrayList = this.subframes;
                    if (arrayList == null) {
                        if (iD3v2ChapterTOCFrameData.subframes != null) {
                            return false;
                        }
                    } else if (!arrayList.equals(iD3v2ChapterTOCFrameData.subframes)) {
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
