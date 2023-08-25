package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class c26 implements i76 {

    /* renamed from: h */
    public static final Object f5399h = new Object();

    /* renamed from: a */
    public final String f5400a;

    /* renamed from: b */
    public final String f5401b;

    /* renamed from: c */
    public final wn4 f5402c;

    /* renamed from: d */
    public final zj6 f5403d;

    /* renamed from: e */
    public final ri6 f5404e;

    /* renamed from: f */
    public final zzg f5405f = zzt.zzo().m11915h();

    /* renamed from: g */
    public final fd5 f5406g;

    public c26(String str, String str2, wn4 wn4Var, zj6 zj6Var, ri6 ri6Var, fd5 fd5Var) {
        this.f5400a = str;
        this.f5401b = str2;
        this.f5402c = wn4Var;
        this.f5403d = zj6Var;
        this.f5404e = ri6Var;
        this.f5406g = fd5Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void m25673a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10616Z4)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzba.zzc().m23658b(g93.f10606Y4)).booleanValue()) {
                synchronized (f5399h) {
                    this.f5402c.m5936f(this.f5404e.f25344d);
                    bundle2.putBundle("quality_signals", this.f5403d.m2195a());
                }
            } else {
                this.f5402c.m5936f(this.f5404e.f25344d);
                bundle2.putBundle("quality_signals", this.f5403d.m2195a());
            }
        }
        bundle2.putString("seq_num", this.f5400a);
        if (this.f5405f.zzP()) {
            return;
        }
        bundle2.putString("session_id", this.f5401b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 12;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().m23658b(g93.f10558T6)).booleanValue()) {
            this.f5406g.m22773a().put("seq_num", this.f5400a);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10616Z4)).booleanValue()) {
            this.f5402c.m5936f(this.f5404e.f25344d);
            bundle.putAll(this.f5403d.m2195a());
        }
        return s67.m10634i(new h76() { // from class: com.daaw.b26
            @Override // com.daaw.h76
            /* renamed from: b */
            public final void mo2851b(Object obj) {
                c26.this.m25673a(bundle, (Bundle) obj);
            }
        });
    }
}
