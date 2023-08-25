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
    public final String p;
    public final boolean q;
    public final boolean r;
    public final Context s;
    public final boolean t;

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.p = str;
        this.q = z;
        this.r = z2;
        this.s = (Context) nt0.M(yd0.a.I(iBinder));
        this.t = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.daaw.yd0, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        z71.c(parcel, 2, this.q);
        z71.c(parcel, 3, this.r);
        z71.j(parcel, 4, nt0.g3(this.s), false);
        z71.c(parcel, 5, this.t);
        z71.b(parcel, a);
    }
}
