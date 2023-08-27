package com.mpatric.mp3agic;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ID3v2FrameSet {
    private ArrayList<ID3v2Frame> frames = new ArrayList<>();
    private String id;

    public ID3v2FrameSet(String str) {
        this.id = str;
    }

    public String getId() {
        return this.id;
    }

    public void clear() {
        this.frames.clear();
    }

    public void addFrame(ID3v2Frame iD3v2Frame) {
        this.frames.add(iD3v2Frame);
    }

    public List<ID3v2Frame> getFrames() {
        return this.frames;
    }

    public String toString() {
        return this.id + ": " + this.frames.size();
    }

    public int hashCode() {
        ArrayList<ID3v2Frame> arrayList = this.frames;
        int hashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        String str = this.id;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ID3v2FrameSet iD3v2FrameSet = (ID3v2FrameSet) obj;
            ArrayList<ID3v2Frame> arrayList = this.frames;
            if (arrayList == null) {
                if (iD3v2FrameSet.frames != null) {
                    return false;
                }
            } else if (!arrayList.equals(iD3v2FrameSet.frames)) {
                return false;
            }
            String str = this.id;
            if (str == null) {
                if (iD3v2FrameSet.id != null) {
                    return false;
                }
            } else if (!str.equals(iD3v2FrameSet.id)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
