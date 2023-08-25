package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class lo8 extends z22 {
    public lo8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: M */
    public final int m16702M(yd0 yd0Var, String str, boolean z) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        sr3.m9941c(m2965I, z);
        Parcel m2966D = m2966D(3, m2965I);
        int readInt = m2966D.readInt();
        m2966D.recycle();
        return readInt;
    }

    /* renamed from: g3 */
    public final int m16701g3(yd0 yd0Var, String str, boolean z) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        sr3.m9941c(m2965I, z);
        Parcel m2966D = m2966D(5, m2965I);
        int readInt = m2966D.readInt();
        m2966D.recycle();
        return readInt;
    }

    /* renamed from: h3 */
    public final yd0 m16700h3(yd0 yd0Var, String str, int i) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        m2965I.writeInt(i);
        Parcel m2966D = m2966D(2, m2965I);
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m2966D.readStrongBinder());
        m2966D.recycle();
        return m3857I;
    }

    /* renamed from: i3 */
    public final yd0 m16699i3(yd0 yd0Var, String str, int i, yd0 yd0Var2) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        m2965I.writeInt(i);
        sr3.m9939e(m2965I, yd0Var2);
        Parcel m2966D = m2966D(8, m2965I);
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m2966D.readStrongBinder());
        m2966D.recycle();
        return m3857I;
    }

    /* renamed from: j3 */
    public final yd0 m16698j3(yd0 yd0Var, String str, int i) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        m2965I.writeInt(i);
        Parcel m2966D = m2966D(4, m2965I);
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m2966D.readStrongBinder());
        m2966D.recycle();
        return m3857I;
    }

    /* renamed from: k3 */
    public final yd0 m16697k3(yd0 yd0Var, String str, boolean z, long j) {
        Parcel m2965I = m2965I();
        sr3.m9939e(m2965I, yd0Var);
        m2965I.writeString(str);
        sr3.m9941c(m2965I, z);
        m2965I.writeLong(j);
        Parcel m2966D = m2966D(7, m2965I);
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m2966D.readStrongBinder());
        m2966D.recycle();
        return m3857I;
    }

    public final int zze() {
        Parcel m2966D = m2966D(6, m2965I());
        int readInt = m2966D.readInt();
        m2966D.recycle();
        return readInt;
    }
}
