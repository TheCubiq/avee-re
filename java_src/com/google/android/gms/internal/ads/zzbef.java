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

    /* renamed from: p */
    public ParcelFileDescriptor f36828p;
    @GuardedBy("this")

    /* renamed from: q */
    public final boolean f36829q;
    @GuardedBy("this")

    /* renamed from: r */
    public final boolean f36830r;
    @GuardedBy("this")

    /* renamed from: s */
    public final long f36831s;
    @GuardedBy("this")

    /* renamed from: t */
    public final boolean f36832t;

    public zzbef() {
        this(null, false, false, 0L, false);
    }

    public zzbef(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f36828p = parcelFileDescriptor;
        this.f36829q = z;
        this.f36830r = z2;
        this.f36831s = j;
        this.f36832t = z3;
    }

    /* renamed from: h */
    public final synchronized long m1113h() {
        return this.f36831s;
    }

    /* renamed from: q */
    public final synchronized ParcelFileDescriptor m1112q() {
        return this.f36828p;
    }

    /* renamed from: s */
    public final synchronized InputStream m1111s() {
        if (this.f36828p == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f36828p);
        this.f36828p = null;
        return autoCloseInputStream;
    }

    /* renamed from: t */
    public final synchronized boolean m1110t() {
        return this.f36829q;
    }

    /* renamed from: u */
    public final synchronized boolean m1109u() {
        return this.f36828p != null;
    }

    /* renamed from: v */
    public final synchronized boolean m1108v() {
        return this.f36830r;
    }

    /* renamed from: w */
    public final synchronized boolean m1107w() {
        return this.f36832t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2718p(parcel, 2, m1112q(), i, false);
        z71.m2731c(parcel, 3, m1110t());
        z71.m2731c(parcel, 4, m1108v());
        z71.m2720n(parcel, 5, m1113h());
        z71.m2731c(parcel, 6, m1107w());
        z71.m2732b(parcel, m2733a);
    }
}
