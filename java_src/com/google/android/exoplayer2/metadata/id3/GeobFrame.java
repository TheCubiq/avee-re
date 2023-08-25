package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C3948a();

    /* renamed from: q */
    public final String f35798q;

    /* renamed from: r */
    public final String f35799r;

    /* renamed from: s */
    public final String f35800s;

    /* renamed from: t */
    public final byte[] f35801t;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$a */
    /* loaded from: classes.dex */
    public static class C3948a implements Parcelable.Creator<GeobFrame> {
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
        this.f35798q = parcel.readString();
        this.f35799r = parcel.readString();
        this.f35800s = parcel.readString();
        this.f35801t = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f35798q = str;
        this.f35799r = str2;
        this.f35800s = str3;
        this.f35801t = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return sq1.m10016b(this.f35798q, geobFrame.f35798q) && sq1.m10016b(this.f35799r, geobFrame.f35799r) && sq1.m10016b(this.f35800s, geobFrame.f35800s) && Arrays.equals(this.f35801t, geobFrame.f35801t);
    }

    public int hashCode() {
        String str = this.f35798q;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35799r;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35800s;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f35801t);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f35802p + ": mimeType=" + this.f35798q + ", filename=" + this.f35799r + ", description=" + this.f35800s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35798q);
        parcel.writeString(this.f35799r);
        parcel.writeString(this.f35800s);
        parcel.writeByteArray(this.f35801t);
    }
}
