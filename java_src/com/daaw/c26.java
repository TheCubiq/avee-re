package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class c26 implements i76 {
    public static final Object h = new Object();
    public final String a;
    public final String b;
    public final wn4 c;
    public final zj6 d;
    public final ri6 e;
    public final zzg f = zzt.zzo().h();
    public final fd5 g;

    public c26(String str, String str2, wn4 wn4Var, zj6 zj6Var, ri6 ri6Var, fd5 fd5Var) {
        this.a = str;
        this.b = str2;
        this.c = wn4Var;
        this.d = zj6Var;
        this.e = ri6Var;
        this.g = fd5Var;
    }

    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzba.zzc().b(g93.Z4)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzba.zzc().b(g93.Y4)).booleanValue()) {
                synchronized (h) {
                    this.c.f(this.e.d);
                    bundle2.putBundle("quality_signals", this.d.a());
                }
            } else {
                this.c.f(this.e.d);
                bundle2.putBundle("quality_signals", this.d.a());
            }
        }
        bundle2.putString("seq_num", this.a);
        if (this.f.zzP()) {
            return;
        }
        bundle2.putString("session_id", this.b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 12;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().b(g93.T6)).booleanValue()) {
            this.g.a().put("seq_num", this.a);
        }
        if (((Boolean) zzba.zzc().b(g93.Z4)).booleanValue()) {
            this.c.f(this.e.d);
            bundle.putAll(this.d.a());
        }
        return s67.i(new h76() { // from class: com.daaw.b26
            @Override // com.daaw.h76
            public final void b(Object obj) {
                c26.this.a(bundle, (Bundle) obj);
            }
        });
    }
}
