package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C3947a();

    /* renamed from: q */
    public final String f35795q;

    /* renamed from: r */
    public final String f35796r;

    /* renamed from: s */
    public final String f35797s;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$a */
    /* loaded from: classes.dex */
    public static class C3947a implements Parcelable.Creator<CommentFrame> {
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
        this.f35795q = parcel.readString();
        this.f35796r = parcel.readString();
        this.f35797s = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f35795q = str;
        this.f35796r = str2;
        this.f35797s = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return sq1.m10016b(this.f35796r, commentFrame.f35796r) && sq1.m10016b(this.f35795q, commentFrame.f35795q) && sq1.m10016b(this.f35797s, commentFrame.f35797s);
    }

    public int hashCode() {
        String str = this.f35795q;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35796r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35797s;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f35802p + ": language=" + this.f35795q + ", description=" + this.f35796r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35802p);
        parcel.writeString(this.f35795q);
        parcel.writeString(this.f35797s);
    }
}
