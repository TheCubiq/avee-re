package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public final class i68 {
    public static final ClassLoader a = i68.class.getClassLoader();

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
