package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.sq1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();
    public final String q;
    public final byte[] r;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<PrivFrame> {
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
        this.q = parcel.readString();
        this.r = parcel.createByteArray();
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.q = str;
        this.r = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return sq1.b(this.q, privFrame.q) && Arrays.equals(this.r, privFrame.r);
    }

    public int hashCode() {
        String str = this.q;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.r);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.p + ": owner=" + this.q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.q);
        parcel.writeByteArray(this.r);
    }
}
