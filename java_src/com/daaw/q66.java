package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class q66 implements i76 {

    /* renamed from: a */
    public final ky3 f23710a;

    /* renamed from: b */
    public final g77 f23711b;

    /* renamed from: c */
    public final Context f23712c;

    public q66(ky3 ky3Var, g77 g77Var, Context context) {
        this.f23710a = ky3Var;
        this.f23711b = g77Var;
        this.f23712c = context;
    }

    /* renamed from: a */
    public final /* synthetic */ r66 m12739a() {
        if (this.f23710a.m17317z(this.f23712c)) {
            String m17333j = this.f23710a.m17333j(this.f23712c);
            String str = m17333j == null ? "" : m17333j;
            String m17335h = this.f23710a.m17335h(this.f23712c);
            String str2 = m17335h == null ? "" : m17335h;
            String m17337f = this.f23710a.m17337f(this.f23712c);
            String str3 = m17337f == null ? "" : m17337f;
            String m17336g = this.f23710a.m17336g(this.f23712c);
            return new r66(str, str2, str3, m17336g == null ? "" : m17336g, "TIME_OUT".equals(str2) ? (Long) zzba.zzc().m23658b(g93.f10655d0) : null);
        }
        return new r66(null, null, null, null, null);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 34;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f23711b.mo20112M(new Callable() { // from class: com.daaw.p66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q66.this.m12739a();
            }
        });
    }
}
