package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C3943a();

    /* renamed from: q */
    public final String f35779q;

    /* renamed from: r */
    public final String f35780r;

    /* renamed from: s */
    public final int f35781s;

    /* renamed from: t */
    public final byte[] f35782t;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$a */
    /* loaded from: classes.dex */
    public static class C3943a implements Parcelable.Creator<ApicFrame> {
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
        this.f35779q = parcel.readString();
        this.f35780r = parcel.readString();
        this.f35781s = parcel.readInt();
        this.f35782t = parcel.createByteArray();
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f35779q = str;
        this.f35780r = str2;
        this.f35781s = i;
        this.f35782t = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f35781s == apicFrame.f35781s && sq1.m10016b(this.f35779q, apicFrame.f35779q) && sq1.m10016b(this.f35780r, apicFrame.f35780r) && Arrays.equals(this.f35782t, apicFrame.f35782t);
    }

    public int hashCode() {
        int i = (527 + this.f35781s) * 31;
        String str = this.f35779q;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35780r;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f35782t);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f35802p + ": mimeType=" + this.f35779q + ", description=" + this.f35780r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35779q);
        parcel.writeString(this.f35780r);
        parcel.writeInt(this.f35781s);
        parcel.writeByteArray(this.f35782t);
    }
}
