package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();
    public final String q;
    public final String r;
    public final int s;
    public final byte[] t;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        this.t = parcel.createByteArray();
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.q = str;
        this.r = str2;
        this.s = i;
        this.t = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.s == apicFrame.s && sq1.b(this.q, apicFrame.q) && sq1.b(this.r, apicFrame.r) && Arrays.equals(this.t, apicFrame.t);
    }

    public int hashCode() {
        int i = (527 + this.s) * 31;
        String str = this.q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.r;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.t);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.p + ": mimeType=" + this.q + ", description=" + this.r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeByteArray(this.t);
    }
}
