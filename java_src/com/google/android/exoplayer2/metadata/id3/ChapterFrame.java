package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();
    public final String q;
    public final int r;
    public final int s;
    public final long t;
    public final long u;
    public final Id3Frame[] v;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readLong();
        this.u = parcel.readLong();
        int readInt = parcel.readInt();
        this.v = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.v[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.q = str;
        this.r = i;
        this.s = i2;
        this.t = j;
        this.u = j2;
        this.v = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.r == chapterFrame.r && this.s == chapterFrame.s && this.t == chapterFrame.t && this.u == chapterFrame.u && sq1.b(this.q, chapterFrame.q) && Arrays.equals(this.v, chapterFrame.v);
    }

    public int hashCode() {
        int i = (((((((527 + this.r) * 31) + this.s) * 31) + ((int) this.t)) * 31) + ((int) this.u)) * 31;
        String str = this.q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeLong(this.t);
        parcel.writeLong(this.u);
        parcel.writeInt(this.v.length);
        for (Id3Frame id3Frame : this.v) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
