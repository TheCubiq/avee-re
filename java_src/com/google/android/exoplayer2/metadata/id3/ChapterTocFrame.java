package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();
    public final String q;
    public final boolean r;
    public final boolean s;
    public final String[] t;
    public final Id3Frame[] u;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.q = parcel.readString();
        this.r = parcel.readByte() != 0;
        this.s = parcel.readByte() != 0;
        this.t = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.u = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.u[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.q = str;
        this.r = z;
        this.s = z2;
        this.t = strArr;
        this.u = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.r == chapterTocFrame.r && this.s == chapterTocFrame.s && sq1.b(this.q, chapterTocFrame.q) && Arrays.equals(this.t, chapterTocFrame.t) && Arrays.equals(this.u, chapterTocFrame.u);
    }

    public int hashCode() {
        int i = (((527 + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31;
        String str = this.q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.t);
        parcel.writeInt(this.u.length);
        for (Id3Frame id3Frame : this.u) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
