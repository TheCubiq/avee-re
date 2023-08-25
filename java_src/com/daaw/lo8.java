package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class lo8 extends z22 {
    public lo8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int M(yd0 yd0Var, String str, boolean z) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        sr3.c(I, z);
        Parcel D = D(3, I);
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    public final int g3(yd0 yd0Var, String str, boolean z) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        sr3.c(I, z);
        Parcel D = D(5, I);
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    public final yd0 h3(yd0 yd0Var, String str, int i) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        I.writeInt(i);
        Parcel D = D(2, I);
        yd0 I2 = yd0.a.I(D.readStrongBinder());
        D.recycle();
        return I2;
    }

    public final yd0 i3(yd0 yd0Var, String str, int i, yd0 yd0Var2) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        I.writeInt(i);
        sr3.e(I, yd0Var2);
        Parcel D = D(8, I);
        yd0 I2 = yd0.a.I(D.readStrongBinder());
        D.recycle();
        return I2;
    }

    public final yd0 j3(yd0 yd0Var, String str, int i) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        I.writeInt(i);
        Parcel D = D(4, I);
        yd0 I2 = yd0.a.I(D.readStrongBinder());
        D.recycle();
        return I2;
    }

    public final yd0 k3(yd0 yd0Var, String str, boolean z, long j) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        sr3.c(I, z);
        I.writeLong(j);
        Parcel D = D(7, I);
        yd0 I2 = yd0.a.I(D.readStrongBinder());
        D.recycle();
        return I2;
    }

    public final int zze() {
        Parcel D = D(6, I());
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }
}
