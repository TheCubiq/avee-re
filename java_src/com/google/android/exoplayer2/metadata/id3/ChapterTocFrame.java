package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C3946a();

    /* renamed from: q */
    public final String f35790q;

    /* renamed from: r */
    public final boolean f35791r;

    /* renamed from: s */
    public final boolean f35792s;

    /* renamed from: t */
    public final String[] f35793t;

    /* renamed from: u */
    public final Id3Frame[] f35794u;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$a */
    /* loaded from: classes.dex */
    public static class C3946a implements Parcelable.Creator<ChapterTocFrame> {
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
        this.f35790q = parcel.readString();
        this.f35791r = parcel.readByte() != 0;
        this.f35792s = parcel.readByte() != 0;
        this.f35793t = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f35794u = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f35794u[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f35790q = str;
        this.f35791r = z;
        this.f35792s = z2;
        this.f35793t = strArr;
        this.f35794u = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f35791r == chapterTocFrame.f35791r && this.f35792s == chapterTocFrame.f35792s && sq1.m10016b(this.f35790q, chapterTocFrame.f35790q) && Arrays.equals(this.f35793t, chapterTocFrame.f35793t) && Arrays.equals(this.f35794u, chapterTocFrame.f35794u);
    }

    public int hashCode() {
        int i = (((527 + (this.f35791r ? 1 : 0)) * 31) + (this.f35792s ? 1 : 0)) * 31;
        String str = this.f35790q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35790q);
        parcel.writeByte(this.f35791r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35792s ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f35793t);
        parcel.writeInt(this.f35794u.length);
        for (Id3Frame id3Frame : this.f35794u) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
