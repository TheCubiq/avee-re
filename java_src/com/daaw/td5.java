package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class td5 {
    public final String e;
    public final pd5 f;
    public final List b = new ArrayList();
    public boolean c = false;
    public boolean d = false;
    public final zzg a = zzt.zzo().h();

    public td5(String str, pd5 pd5Var) {
        this.e = str;
        this.f = pd5Var;
    }

    public final synchronized void a(String str) {
        if (((Boolean) zzba.zzc().b(g93.P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
                Map g = g();
                g.put("action", "aaia");
                g.put("aair", "MalformedJson");
                this.b.add(g);
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) zzba.zzc().b(g93.P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
                Map g = g();
                g.put("action", "adapter_init_finished");
                g.put("ancn", str);
                g.put("rqe", str2);
                this.b.add(g);
            }
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) zzba.zzc().b(g93.P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
                Map g = g();
                g.put("action", "adapter_init_started");
                g.put("ancn", str);
                this.b.add(g);
            }
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) zzba.zzc().b(g93.P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
                Map g = g();
                g.put("action", "adapter_init_finished");
                g.put("ancn", str);
                this.b.add(g);
            }
        }
    }

    public final synchronized void e() {
        if (((Boolean) zzba.zzc().b(g93.P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
                if (this.d) {
                    return;
                }
                Map g = g();
                g.put("action", "init_finished");
                this.b.add(g);
                for (Map map : this.b) {
                    this.f.e(map);
                }
                this.d = true;
            }
        }
    }

    public final synchronized void f() {
        if (((Boolean) zzba.zzc().b(g93.P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
                if (this.c) {
                    return;
                }
                Map g = g();
                g.put("action", "init_started");
                this.b.add(g);
                this.c = true;
            }
        }
    }

    public final Map g() {
        Map f = this.f.f();
        f.put("tms", Long.toString(zzt.zzB().b(), 10));
        f.put("tid", this.a.zzP() ? "" : this.e);
        return f;
    }
}
