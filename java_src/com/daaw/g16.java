package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbye;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g16 implements i76 {

    /* renamed from: a */
    public final g77 f10149a;

    /* renamed from: b */
    public final ya5 f10150b;

    /* renamed from: c */
    public final fg5 f10151c;

    /* renamed from: d */
    public final j16 f10152d;

    public g16(g77 g77Var, ya5 ya5Var, fg5 fg5Var, j16 j16Var) {
        this.f10149a = g77Var;
        this.f10150b = ya5Var;
        this.f10151c = fg5Var;
        this.f10152d = j16Var;
    }

    /* renamed from: a */
    public final /* synthetic */ i16 m22093a() {
        List<String> asList = Arrays.asList(((String) zzba.zzc().m23658b(g93.f10733k1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                oj6 m3950c = this.f10150b.m3950c(str, new JSONObject());
                m3950c.m14243c();
                Bundle bundle2 = new Bundle();
                try {
                    zzbye m14235k = m3950c.m14235k();
                    if (m14235k != null) {
                        bundle2.putString("sdk_version", m14235k.toString());
                    }
                } catch (wi6 unused) {
                }
                try {
                    zzbye m14236j = m3950c.m14236j();
                    if (m14236j != null) {
                        bundle2.putString("adapter_version", m14236j.toString());
                    }
                } catch (wi6 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (wi6 unused3) {
            }
        }
        return new i16(bundle, null);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 1;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (hz6.m20315d((String) zzba.zzc().m23658b(g93.f10733k1)) || this.f10152d.m19168b() || !this.f10151c.m22670t()) {
            return s67.m10634i(new i16(new Bundle(), null));
        }
        this.f10152d.m19169a(true);
        return this.f10149a.mo20112M(new Callable() { // from class: com.daaw.c16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g16.this.m22093a();
            }
        });
    }
}
