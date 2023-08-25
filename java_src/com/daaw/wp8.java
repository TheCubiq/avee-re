package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class wp8 extends z22 {
    public wp8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: M */
    public final yd0 m5868M(yd0 yd0Var, String str, int i, yd0 yd0Var2) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        m2965I.writeInt(i);
        sr3.m9939e(m2965I, yd0Var2);
        Parcel m2966D = m2966D(2, m2965I);
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m2966D.readStrongBinder());
        m2966D.recycle();
        return m3857I;
    }

    /* renamed from: g3 */
    public final yd0 m5867g3(yd0 yd0Var, String str, int i, yd0 yd0Var2) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        m2965I.writeInt(i);
        sr3.m9939e(m2965I, yd0Var2);
        Parcel m2966D = m2966D(3, m2965I);
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m2966D.readStrongBinder());
        m2966D.recycle();
        return m3857I;
    }
}
