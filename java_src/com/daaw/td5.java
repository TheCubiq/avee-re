package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class td5 {

    /* renamed from: e */
    public final String f27516e;

    /* renamed from: f */
    public final pd5 f27517f;

    /* renamed from: b */
    public final List f27513b = new ArrayList();

    /* renamed from: c */
    public boolean f27514c = false;

    /* renamed from: d */
    public boolean f27515d = false;

    /* renamed from: a */
    public final zzg f27512a = zzt.zzo().m11915h();

    public td5(String str, pd5 pd5Var) {
        this.f27516e = str;
        this.f27517f = pd5Var;
    }

    /* renamed from: a */
    public final synchronized void m9279a(String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10513P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
                Map m9273g = m9273g();
                m9273g.put("action", "aaia");
                m9273g.put("aair", "MalformedJson");
                this.f27513b.add(m9273g);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m9278b(String str, String str2) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10513P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
                Map m9273g = m9273g();
                m9273g.put("action", "adapter_init_finished");
                m9273g.put("ancn", str);
                m9273g.put("rqe", str2);
                this.f27513b.add(m9273g);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m9277c(String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10513P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
                Map m9273g = m9273g();
                m9273g.put("action", "adapter_init_started");
                m9273g.put("ancn", str);
                this.f27513b.add(m9273g);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void m9276d(String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10513P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
                Map m9273g = m9273g();
                m9273g.put("action", "adapter_init_finished");
                m9273g.put("ancn", str);
                this.f27513b.add(m9273g);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void m9275e() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10513P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
                if (this.f27515d) {
                    return;
                }
                Map m9273g = m9273g();
                m9273g.put("action", "init_finished");
                this.f27513b.add(m9273g);
                for (Map map : this.f27513b) {
                    this.f27517f.m11390e(map);
                }
                this.f27515d = true;
            }
        }
    }

    /* renamed from: f */
    public final synchronized void m9274f() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10513P1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
                if (this.f27514c) {
                    return;
                }
                Map m9273g = m9273g();
                m9273g.put("action", "init_started");
                this.f27513b.add(m9273g);
                this.f27514c = true;
            }
        }
    }

    /* renamed from: g */
    public final Map m9273g() {
        Map m13435f = this.f27517f.m13435f();
        m13435f.put("tms", Long.toString(zzt.zzB().mo15859b(), 10));
        m13435f.put("tid", this.f27512a.zzP() ? "" : this.f27516e);
        return m13435f;
    }
}
