package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class wp8 extends z22 {
    public wp8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final yd0 M(yd0 yd0Var, String str, int i, yd0 yd0Var2) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        I.writeInt(i);
        sr3.e(I, yd0Var2);
        Parcel D = D(2, I);
        yd0 I2 = yd0.a.I(D.readStrongBinder());
        D.recycle();
        return I2;
    }

    public final yd0 g3(yd0 yd0Var, String str, int i, yd0 yd0Var2) {
        Parcel I = I();
        sr3.e(I, yd0Var);
        I.writeString(str);
        I.writeInt(i);
        sr3.e(I, yd0Var2);
        Parcel D = D(3, I);
        yd0 I2 = yd0.a.I(D.readStrongBinder());
        D.recycle();
        return I2;
    }
}
