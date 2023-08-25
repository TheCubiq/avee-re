package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C3945a();

    /* renamed from: q */
    public final String f35784q;

    /* renamed from: r */
    public final int f35785r;

    /* renamed from: s */
    public final int f35786s;

    /* renamed from: t */
    public final long f35787t;

    /* renamed from: u */
    public final long f35788u;

    /* renamed from: v */
    public final Id3Frame[] f35789v;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame$a */
    /* loaded from: classes.dex */
    public static class C3945a implements Parcelable.Creator<ChapterFrame> {
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
        this.f35784q = parcel.readString();
        this.f35785r = parcel.readInt();
        this.f35786s = parcel.readInt();
        this.f35787t = parcel.readLong();
        this.f35788u = parcel.readLong();
        int readInt = parcel.readInt();
        this.f35789v = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f35789v[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f35784q = str;
        this.f35785r = i;
        this.f35786s = i2;
        this.f35787t = j;
        this.f35788u = j2;
        this.f35789v = id3FrameArr;
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
        return this.f35785r == chapterFrame.f35785r && this.f35786s == chapterFrame.f35786s && this.f35787t == chapterFrame.f35787t && this.f35788u == chapterFrame.f35788u && sq1.m10016b(this.f35784q, chapterFrame.f35784q) && Arrays.equals(this.f35789v, chapterFrame.f35789v);
    }

    public int hashCode() {
        int i = (((((((527 + this.f35785r) * 31) + this.f35786s) * 31) + ((int) this.f35787t)) * 31) + ((int) this.f35788u)) * 31;
        String str = this.f35784q;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35784q);
        parcel.writeInt(this.f35785r);
        parcel.writeInt(this.f35786s);
        parcel.writeLong(this.f35787t);
        parcel.writeLong(this.f35788u);
        parcel.writeInt(this.f35789v.length);
        for (Id3Frame id3Frame : this.f35789v) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
