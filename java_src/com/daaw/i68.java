package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public final class i68 {

    /* renamed from: a */
    public static final ClassLoader f13321a = i68.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m20047a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m20046b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
