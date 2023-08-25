package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();
    public final String q;
    public final String r;
    public final String s;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.q = str;
        this.r = str2;
        this.s = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return sq1.b(this.r, commentFrame.r) && sq1.b(this.q, commentFrame.q) && sq1.b(this.s, commentFrame.s);
    }

    public int hashCode() {
        String str = this.q;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.s;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.p + ": language=" + this.q + ", description=" + this.r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.s);
    }
}
