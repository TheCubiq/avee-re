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

    /* renamed from: p */
    public final String f36674p;
    @Nullable

    /* renamed from: q */
    public final l68 f36675q;

    /* renamed from: r */
    public final boolean f36676r;

    /* renamed from: s */
    public final boolean f36677s;

    public zzs(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f36674p = str;
        m98 m98Var = null;
        if (iBinder != null) {
            try {
                yd0 zzd = my8.m15656I(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) nt0.m14831M(zzd);
                if (bArr != null) {
                    m98Var = new m98(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f36675q = m98Var;
        this.f36676r = z;
        this.f36677s = z2;
    }

    public zzs(String str, @Nullable l68 l68Var, boolean z, boolean z2) {
        this.f36674p = str;
        this.f36675q = l68Var;
        this.f36676r = z;
        this.f36677s = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.f36674p, false);
        l68 l68Var = this.f36675q;
        if (l68Var == null) {
            l68Var = null;
        }
        z71.m2724j(parcel, 2, l68Var, false);
        z71.m2731c(parcel, 3, this.f36676r);
        z71.m2731c(parcel, 4, this.f36677s);
        z71.m2732b(parcel, m2733a);
    }
}
