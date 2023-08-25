package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C3950a();

    /* renamed from: q */
    public final String f35805q;

    /* renamed from: r */
    public final String f35806r;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$a */
    /* loaded from: classes.dex */
    public static class C3950a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.f35805q = parcel.readString();
        this.f35806r = parcel.readString();
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f35805q = str2;
        this.f35806r = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return this.f35802p.equals(textInformationFrame.f35802p) && sq1.m10016b(this.f35805q, textInformationFrame.f35805q) && sq1.m10016b(this.f35806r, textInformationFrame.f35806r);
    }

    public int hashCode() {
        int hashCode = (527 + this.f35802p.hashCode()) * 31;
        String str = this.f35805q;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35806r;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f35802p + ": value=" + this.f35806r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35802p);
        parcel.writeString(this.f35805q);
        parcel.writeString(this.f35806r);
    }
}
