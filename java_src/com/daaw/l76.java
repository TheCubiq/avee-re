package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class l76 {

    /* renamed from: a */
    public final Context f17107a;

    /* renamed from: b */
    public final Set f17108b;

    /* renamed from: c */
    public final Executor f17109c;

    /* renamed from: d */
    public final to6 f17110d;

    /* renamed from: e */
    public final kd5 f17111e;

    public l76(Context context, Executor executor, Set set, to6 to6Var, kd5 kd5Var) {
        this.f17107a = context;
        this.f17109c = executor;
        this.f17108b = set;
        this.f17110d = to6Var;
        this.f17111e = kd5Var;
    }

    /* renamed from: a */
    public final f77 m17110a(final Object obj) {
        io6 m20568a = ho6.m20568a(this.f17107a, 8);
        m20568a.zzh();
        final ArrayList arrayList = new ArrayList(this.f17108b.size());
        for (final i76 i76Var : this.f17108b) {
            f77 zzb = i76Var.zzb();
            final long mo15859b = zzt.zzB().mo15859b();
            zzb.mo6515f(new Runnable() { // from class: com.daaw.j76
                @Override // java.lang.Runnable
                public final void run() {
                    l76.this.m17109b(mo15859b, i76Var);
                }
            }, z04.f34310f);
            arrayList.add(zzb);
        }
        f77 m11710a = s67.m10640c(arrayList).m11710a(new Callable() { // from class: com.daaw.k76
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<f77> list = arrayList;
                Object obj2 = obj;
                for (f77 f77Var : list) {
                    h76 h76Var = (h76) f77Var.get();
                    if (h76Var != null) {
                        h76Var.mo2851b(obj2);
                    }
                }
                return obj2;
            }
        }, this.f17109c);
        if (vo6.m6970a()) {
            so6.m10114a(m11710a, this.f17110d, m20568a);
        }
        return m11710a;
    }

    /* renamed from: b */
    public final void m17109b(long j, i76 i76Var) {
        long mo15859b = zzt.zzB().mo15859b() - j;
        if (((Boolean) ib3.f13436a.m16137e()).booleanValue()) {
            String m20316c = hz6.m20316c(i76Var.getClass().getCanonicalName());
            zze.zza("Signal runtime (ms) : " + m20316c + " = " + mo15859b);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10523Q1)).booleanValue()) {
            jd5 m17776a = this.f17111e.m17776a();
            m17776a.m18590b("action", "lat_ms");
            m17776a.m18590b("lat_grp", "sig_lat_grp");
            m17776a.m18590b("lat_id", String.valueOf(i76Var.zza()));
            m17776a.m18590b("clat_ms", String.valueOf(mo15859b));
            m17776a.m18584h();
        }
    }
}
