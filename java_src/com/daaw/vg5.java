package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbye;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class vg5 {

    /* renamed from: a */
    public final fg5 f30203a;

    /* renamed from: b */
    public final sa5 f30204b;

    /* renamed from: c */
    public final Object f30205c = new Object();

    /* renamed from: d */
    public final List f30206d = new ArrayList();

    /* renamed from: e */
    public boolean f30207e;

    public vg5(fg5 fg5Var, sa5 sa5Var) {
        this.f30203a = fg5Var;
        this.f30204b = sa5Var;
    }

    /* renamed from: a */
    public final JSONArray m7181a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f30205c) {
            if (!this.f30207e) {
                if (!this.f30203a.m22670t()) {
                    m7179c();
                    return jSONArray;
                }
                m7178d(this.f30203a.m22683g());
            }
            for (ug5 ug5Var : this.f30206d) {
                jSONArray.put(ug5Var.m8253a());
            }
            return jSONArray;
        }
    }

    /* renamed from: c */
    public final void m7179c() {
        this.f30203a.m22671s(new tg5(this));
    }

    /* renamed from: d */
    public final void m7178d(List list) {
        String str;
        boolean z;
        ra5 m10480a;
        ra5 m10480a2;
        zzbye zzbyeVar;
        synchronized (this.f30205c) {
            if (this.f30207e) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrz zzbrzVar = (zzbrz) it.next();
                if (((Boolean) zzba.zzc().m23658b(g93.f10817r8)).booleanValue() && (m10480a2 = this.f30204b.m10480a(zzbrzVar.f36866p)) != null && (zzbyeVar = m10480a2.f25008c) != null) {
                    str = zzbyeVar.toString();
                    String str2 = str;
                    if (((Boolean) zzba.zzc().m23658b(g93.f10828s8)).booleanValue() && (m10480a = this.f30204b.m10480a(zzbrzVar.f36866p)) != null && m10480a.f25009d) {
                        z = true;
                        List list2 = this.f30206d;
                        String str3 = zzbrzVar.f36866p;
                        list2.add(new ug5(str3, str2, this.f30204b.m10478c(str3), zzbrzVar.f36867q ? 1 : 0, zzbrzVar.f36869s, zzbrzVar.f36868r, z));
                    }
                    z = false;
                    List list22 = this.f30206d;
                    String str32 = zzbrzVar.f36866p;
                    list22.add(new ug5(str32, str2, this.f30204b.m10478c(str32), zzbrzVar.f36867q ? 1 : 0, zzbrzVar.f36869s, zzbrzVar.f36868r, z));
                }
                str = "";
                String str22 = str;
                if (((Boolean) zzba.zzc().m23658b(g93.f10828s8)).booleanValue()) {
                    z = true;
                    List list222 = this.f30206d;
                    String str322 = zzbrzVar.f36866p;
                    list222.add(new ug5(str322, str22, this.f30204b.m10478c(str322), zzbrzVar.f36867q ? 1 : 0, zzbrzVar.f36869s, zzbrzVar.f36868r, z));
                }
                z = false;
                List list2222 = this.f30206d;
                String str3222 = zzbrzVar.f36866p;
                list2222.add(new ug5(str3222, str22, this.f30204b.m10478c(str3222), zzbrzVar.f36867q ? 1 : 0, zzbrzVar.f36869s, zzbrzVar.f36868r, z));
            }
            this.f30207e = true;
        }
    }
}
