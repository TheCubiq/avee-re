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

    /* renamed from: a */
    public final ConcurrentHashMap f11398a;

    /* renamed from: b */
    public final zzfkz f11399b;

    /* renamed from: c */
    public final ik6 f11400c = new ik6();

    public gk6(zzfkz zzfkzVar) {
        this.f11398a = new ConcurrentHashMap(zzfkzVar.f37005u);
        this.f11399b = zzfkzVar;
    }

    @Override // com.daaw.fk6
    /* renamed from: a */
    public final synchronized boolean mo21509a(rk6 rk6Var) {
        ek6 ek6Var = (ek6) this.f11398a.get(rk6Var);
        if (ek6Var != null) {
            return ek6Var.m23427b() < this.f11399b.f37005u;
        }
        return true;
    }

    @Override // com.daaw.fk6
    /* renamed from: b */
    public final synchronized qk6 mo21508b(rk6 rk6Var) {
        qk6 qk6Var;
        ek6 ek6Var = (ek6) this.f11398a.get(rk6Var);
        if (ek6Var != null) {
            qk6Var = ek6Var.m23424e();
            if (qk6Var == null) {
                this.f11400c.m19691e();
            }
            el6 m23423f = ek6Var.m23423f();
            if (qk6Var != null) {
                p43 m7458L = v43.m7458L();
                n43 m14559L = o43.m14559L();
                m14559L.m15525v(2);
                r43 m10715L = s43.m10715L();
                m10715L.m11757s(m23423f.f8566p);
                m10715L.m11756t(m23423f.f8567q);
                m14559L.m15528s(m10715L);
                m7458L.m13640s(m14559L);
                qk6Var.f24123a.zzb().m18389c().mo5939H((v43) m7458L.m22315n());
            }
            m21505e();
        } else {
            this.f11400c.m19690f();
            m21505e();
            qk6Var = null;
        }
        return qk6Var;
    }

    @Override // com.daaw.fk6
    @Deprecated
    /* renamed from: c */
    public final rk6 mo21507c(zzl zzlVar, String str, zzw zzwVar) {
        return new sk6(zzlVar, str, new qu3(this.f11399b.f37001q).m12207a().f25621k, this.f11399b.f37007w, zzwVar);
    }

    @Override // com.daaw.fk6
    /* renamed from: d */
    public final synchronized boolean mo21506d(rk6 rk6Var, qk6 qk6Var) {
        boolean m23421h;
        ConcurrentHashMap concurrentHashMap;
        ek6 ek6Var = (ek6) this.f11398a.get(rk6Var);
        qk6Var.f24126d = zzt.zzB().mo15860a();
        if (ek6Var == null) {
            zzfkz zzfkzVar = this.f11399b;
            ek6Var = new ek6(zzfkzVar.f37005u, zzfkzVar.f37006v * 1000);
            int size = this.f11398a.size();
            zzfkz zzfkzVar2 = this.f11399b;
            if (size == zzfkzVar2.f37004t) {
                int i = zzfkzVar2.f36999B;
                int i2 = i - 1;
                rk6 rk6Var2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.f11398a.entrySet()) {
                        if (((ek6) entry.getValue()).m23426c() < j) {
                            j = ((ek6) entry.getValue()).m23426c();
                            rk6Var2 = (rk6) entry.getKey();
                        }
                    }
                    if (rk6Var2 != null) {
                        concurrentHashMap = this.f11398a;
                        concurrentHashMap.remove(rk6Var2);
                    }
                    this.f11400c.m19689g();
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry2 : this.f11398a.entrySet()) {
                            if (((ek6) entry2.getValue()).m23428a() < i3) {
                                i3 = ((ek6) entry2.getValue()).m23428a();
                                rk6Var2 = (rk6) entry2.getKey();
                            }
                        }
                        if (rk6Var2 != null) {
                            concurrentHashMap = this.f11398a;
                            concurrentHashMap.remove(rk6Var2);
                        }
                    }
                    this.f11400c.m19689g();
                } else {
                    for (Map.Entry entry3 : this.f11398a.entrySet()) {
                        if (((ek6) entry3.getValue()).m23425d() < j) {
                            j = ((ek6) entry3.getValue()).m23425d();
                            rk6Var2 = (rk6) entry3.getKey();
                        }
                    }
                    if (rk6Var2 != null) {
                        concurrentHashMap = this.f11398a;
                        concurrentHashMap.remove(rk6Var2);
                    }
                    this.f11400c.m19689g();
                }
            }
            this.f11398a.put(rk6Var, ek6Var);
            this.f11400c.m19692d();
        }
        m23421h = ek6Var.m23421h(qk6Var);
        this.f11400c.m19693c();
        hk6 m19695a = this.f11400c.m19695a();
        el6 m23423f = ek6Var.m23423f();
        p43 m7458L = v43.m7458L();
        n43 m14559L = o43.m14559L();
        m14559L.m15525v(2);
        t43 m8586L = u43.m8586L();
        m8586L.m9530s(m19695a.f12634p);
        m8586L.m9529t(m19695a.f12635q);
        m8586L.m9528u(m23423f.f8567q);
        m14559L.m15526u(m8586L);
        m7458L.m13640s(m14559L);
        qk6Var.f24123a.zzb().m18389c().mo5940A((v43) m7458L.m22315n());
        m21505e();
        return m23421h;
    }

    /* renamed from: e */
    public final void m21505e() {
        Parcelable.Creator<zzfkz> creator = zzfkz.CREATOR;
        if (((Boolean) zzba.zzc().m23658b(g93.f10497N5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f11399b.f37003s);
            sb.append(" PoolCollection");
            sb.append(this.f11400c.m19694b());
            int i = 0;
            for (Map.Entry entry : this.f11398a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((rk6) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((ek6) entry.getValue()).m23427b(); i2++) {
                    sb.append("[O]");
                }
                for (int m23427b = ((ek6) entry.getValue()).m23427b(); m23427b < this.f11399b.f37005u; m23427b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((ek6) entry.getValue()).m23422g());
                sb.append("\n");
            }
            while (i < this.f11399b.f37004t) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            k04.zze(sb.toString());
        }
    }

    @Override // com.daaw.fk6
    public final zzfkz zza() {
        return this.f11399b;
    }
}
