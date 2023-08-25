package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C3949a();

    /* renamed from: q */
    public final String f35803q;

    /* renamed from: r */
    public final byte[] f35804r;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$a */
    /* loaded from: classes.dex */
    public static class C3949a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f35803q = parcel.readString();
        this.f35804r = parcel.createByteArray();
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f35803q = str;
        this.f35804r = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return sq1.m10016b(this.f35803q, privFrame.f35803q) && Arrays.equals(this.f35804r, privFrame.f35804r);
    }

    public int hashCode() {
        String str = this.f35803q;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f35804r);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f35802p + ": owner=" + this.f35803q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35803q);
        parcel.writeByteArray(this.f35804r);
    }
}
