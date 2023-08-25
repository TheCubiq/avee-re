package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rv0;
/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();
    public final long p;
    public final long q;
    public final byte[] r;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<PrivateCommand> {
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
        this.p = j2;
        this.q = j;
        this.r = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.p = parcel.readLong();
        this.q = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.r = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static PrivateCommand a(rv0 rv0Var, int i, long j) {
        long z = rv0Var.z();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        rv0Var.g(bArr, 0, i2);
        return new PrivateCommand(z, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r.length);
        parcel.writeByteArray(this.r);
    }
}
