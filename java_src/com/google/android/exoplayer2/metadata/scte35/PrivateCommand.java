package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rv0;
/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C3952a();

    /* renamed from: p */
    public final long f35809p;

    /* renamed from: q */
    public final long f35810q;

    /* renamed from: r */
    public final byte[] f35811r;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$a */
    /* loaded from: classes.dex */
    public static class C3952a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f35809p = j2;
        this.f35810q = j;
        this.f35811r = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f35809p = parcel.readLong();
        this.f35810q = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f35811r = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C3952a c3952a) {
        this(parcel);
    }

    /* renamed from: a */
    public static PrivateCommand m1625a(rv0 rv0Var, int i, long j) {
        long m10894z = rv0Var.m10894z();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        rv0Var.m10913g(bArr, 0, i2);
        return new PrivateCommand(m10894z, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f35809p);
        parcel.writeLong(this.f35810q);
        parcel.writeInt(this.f35811r.length);
        parcel.writeByteArray(this.f35811r);
    }
}
