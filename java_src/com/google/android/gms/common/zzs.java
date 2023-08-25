package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.daaw.gs8;
import com.daaw.l68;
import com.daaw.m98;
import com.daaw.my8;
import com.daaw.nt0;
import com.daaw.yd0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new gs8();
    public final String p;
    @Nullable
    public final l68 q;
    public final boolean r;
    public final boolean s;

    public zzs(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.p = str;
        m98 m98Var = null;
        if (iBinder != null) {
            try {
                yd0 zzd = my8.I(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) nt0.M(zzd);
                if (bArr != null) {
                    m98Var = new m98(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.q = m98Var;
        this.r = z;
        this.s = z2;
    }

    public zzs(String str, @Nullable l68 l68Var, boolean z, boolean z2) {
        this.p = str;
        this.q = l68Var;
        this.r = z;
        this.s = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.q(parcel, 1, this.p, false);
        l68 l68Var = this.q;
        if (l68Var == null) {
            l68Var = null;
        }
        z71.j(parcel, 2, l68Var, false);
        z71.c(parcel, 3, this.r);
        z71.c(parcel, 4, this.s);
        z71.b(parcel, a);
    }
}
