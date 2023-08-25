package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.daaw.i33;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzbef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbef> CREATOR = new i33();
    @GuardedBy("this")
    public ParcelFileDescriptor p;
    @GuardedBy("this")
    public final boolean q;
    @GuardedBy("this")
    public final boolean r;
    @GuardedBy("this")
    public final long s;
    @GuardedBy("this")
    public final boolean t;

    public zzbef() {
        this(null, false, false, 0L, false);
    }

    public zzbef(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.p = parcelFileDescriptor;
        this.q = z;
        this.r = z2;
        this.s = j;
        this.t = z3;
    }

    public final synchronized long h() {
        return this.s;
    }

    public final synchronized ParcelFileDescriptor q() {
        return this.p;
    }

    public final synchronized InputStream s() {
        if (this.p == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.p);
        this.p = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean t() {
        return this.q;
    }

    public final synchronized boolean u() {
        return this.p != null;
    }

    public final synchronized boolean v() {
        return this.r;
    }

    public final synchronized boolean w() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.p(parcel, 2, q(), i, false);
        z71.c(parcel, 3, t());
        z71.c(parcel, 4, v());
        z71.n(parcel, 5, h());
        z71.c(parcel, 6, w());
        z71.b(parcel, a);
    }
}
