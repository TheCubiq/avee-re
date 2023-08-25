package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class t76 implements i76 {

    /* renamed from: a */
    public final g77 f27103a;

    /* renamed from: b */
    public final Context f27104b;

    public t76(g77 g77Var, Context context) {
        this.f27103a = g77Var;
        this.f27104b = context;
    }

    /* renamed from: a */
    public final /* synthetic */ r76 m9465a() {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.f27104b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.zzp();
        int i3 = -1;
        if (zzs.zzx(this.f27104b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f27104b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i3 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new r76(networkOperator, i, zzt.zzq().zzm(this.f27104b), phoneType, z, i2);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 39;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f27103a.mo20112M(new Callable() { // from class: com.daaw.s76
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t76.this.m9465a();
            }
        });
    }
}
