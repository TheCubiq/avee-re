package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C3944a();

    /* renamed from: q */
    public final byte[] f35783q;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$a */
    /* loaded from: classes.dex */
    public static class C3944a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.f35783q = parcel.createByteArray();
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f35783q = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f35802p.equals(binaryFrame.f35802p) && Arrays.equals(this.f35783q, binaryFrame.f35783q);
    }

    public int hashCode() {
        return ((527 + this.f35802p.hashCode()) * 31) + Arrays.hashCode(this.f35783q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35802p);
        parcel.writeByteArray(this.f35783q);
    }
}
