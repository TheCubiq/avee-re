package com.daaw;

import android.os.Parcel;
/* loaded from: classes2.dex */
public final class hs3 {
    public static final ClassLoader a = hs3.class.getClassLoader();

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
