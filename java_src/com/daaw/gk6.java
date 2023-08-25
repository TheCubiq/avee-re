package com.daaw;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfkz;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class gk6 implements fk6 {
    @GuardedBy("this")
    public final ConcurrentHashMap a;
    public final zzfkz b;
    public final ik6 c = new ik6();

    public gk6(zzfkz zzfkzVar) {
        this.a = new ConcurrentHashMap(zzfkzVar.u);
        this.b = zzfkzVar;
    }

    @Override // com.daaw.fk6
    public final synchronized boolean a(rk6 rk6Var) {
        ek6 ek6Var = (ek6) this.a.get(rk6Var);
        if (ek6Var != null) {
            return ek6Var.b() < this.b.u;
        }
        return true;
    }

    @Override // com.daaw.fk6
    public final synchronized qk6 b(rk6 rk6Var) {
        qk6 qk6Var;
        ek6 ek6Var = (ek6) this.a.get(rk6Var);
        if (ek6Var != null) {
            qk6Var = ek6Var.e();
            if (qk6Var == null) {
                this.c.e();
            }
            el6 f = ek6Var.f();
            if (qk6Var != null) {
                p43 L = v43.L();
                n43 L2 = o43.L();
                L2.v(2);
                r43 L3 = s43.L();
                L3.s(f.p);
                L3.t(f.q);
                L2.s(L3);
                L.s(L2);
                qk6Var.a.zzb().c().H((v43) L.n());
            }
            e();
        } else {
            this.c.f();
            e();
            qk6Var = null;
        }
        return qk6Var;
    }

    @Override // com.daaw.fk6
    @Deprecated
    public final rk6 c(zzl zzlVar, String str, zzw zzwVar) {
        return new sk6(zzlVar, str, new qu3(this.b.q).a().k, this.b.w, zzwVar);
    }

    @Override // com.daaw.fk6
    public final synchronized boolean d(rk6 rk6Var, qk6 qk6Var) {
        boolean h;
        ConcurrentHashMap concurrentHashMap;
        ek6 ek6Var = (ek6) this.a.get(rk6Var);
        qk6Var.d = zzt.zzB().a();
        if (ek6Var == null) {
            zzfkz zzfkzVar = this.b;
            ek6Var = new ek6(zzfkzVar.u, zzfkzVar.v * 1000);
            int size = this.a.size();
            zzfkz zzfkzVar2 = this.b;
            if (size == zzfkzVar2.t) {
                int i = zzfkzVar2.B;
                int i2 = i - 1;
                rk6 rk6Var2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.a.entrySet()) {
                        if (((ek6) entry.getValue()).c() < j) {
                            j = ((ek6) entry.getValue()).c();
                            rk6Var2 = (rk6) entry.getKey();
                        }
                    }
                    if (rk6Var2 != null) {
                        concurrentHashMap = this.a;
                        concurrentHashMap.remove(rk6Var2);
                    }
                    this.c.g();
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry2 : this.a.entrySet()) {
                            if (((ek6) entry2.getValue()).a() < i3) {
                                i3 = ((ek6) entry2.getValue()).a();
                                rk6Var2 = (rk6) entry2.getKey();
                            }
                        }
                        if (rk6Var2 != null) {
                            concurrentHashMap = this.a;
                            concurrentHashMap.remove(rk6Var2);
                        }
                    }
                    this.c.g();
                } else {
                    for (Map.Entry entry3 : this.a.entrySet()) {
                        if (((ek6) entry3.getValue()).d() < j) {
                            j = ((ek6) entry3.getValue()).d();
                            rk6Var2 = (rk6) entry3.getKey();
                        }
                    }
                    if (rk6Var2 != null) {
                        concurrentHashMap = this.a;
                        concurrentHashMap.remove(rk6Var2);
                    }
                    this.c.g();
                }
            }
            this.a.put(rk6Var, ek6Var);
            this.c.d();
        }
        h = ek6Var.h(qk6Var);
        this.c.c();
        hk6 a = this.c.a();
        el6 f = ek6Var.f();
        p43 L = v43.L();
        n43 L2 = o43.L();
        L2.v(2);
        t43 L3 = u43.L();
        L3.s(a.p);
        L3.t(a.q);
        L3.u(f.q);
        L2.u(L3);
        L.s(L2);
        qk6Var.a.zzb().c().A((v43) L.n());
        e();
        return h;
    }

    public final void e() {
        Parcelable.Creator<zzfkz> creator = zzfkz.CREATOR;
        if (((Boolean) zzba.zzc().b(g93.N5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.s);
            sb.append(" PoolCollection");
            sb.append(this.c.b());
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((rk6) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((ek6) entry.getValue()).b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((ek6) entry.getValue()).b(); b < this.b.u; b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((ek6) entry.getValue()).g());
                sb.append("\n");
            }
            while (i < this.b.t) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            k04.zze(sb.toString());
        }
    }

    @Override // com.daaw.fk6
    public final zzfkz zza() {
        return this.b;
    }
}
