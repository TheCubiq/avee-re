package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();
    public final String q;
    public final String r;
    public final String s;
    public final byte[] t;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return sq1.b(this.q, geobFrame.q) && sq1.b(this.r, geobFrame.r) && sq1.b(this.s, geobFrame.s) && Arrays.equals(this.t, geobFrame.t);
    }

    public int hashCode() {
        String str = this.q;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.s;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.t);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.p + ": mimeType=" + this.q + ", filename=" + this.r + ", description=" + this.s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeByteArray(this.t);
    }
}
