package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.lm8;
import com.daaw.nt0;
import com.daaw.yd0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new lm8();

    /* renamed from: p */
    public final String f36665p;

    /* renamed from: q */
    public final boolean f36666q;

    /* renamed from: r */
    public final boolean f36667r;

    /* renamed from: s */
    public final Context f36668s;

    /* renamed from: t */
    public final boolean f36669t;

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f36665p = str;
        this.f36666q = z;
        this.f36667r = z2;
        this.f36668s = (Context) nt0.m14831M(yd0.AbstractBinderC3691a.m3857I(iBinder));
        this.f36669t = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.daaw.yd0, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36665p, false);
        z71.m2731c(parcel, 2, this.f36666q);
        z71.m2731c(parcel, 3, this.f36667r);
        z71.m2724j(parcel, 4, nt0.m14830g3(this.f36668s), false);
        z71.m2731c(parcel, 5, this.f36669t);
        z71.m2732b(parcel, m2733a);
    }
}
