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
    public final fg5 a;
    public final sa5 b;
    public final Object c = new Object();
    public final List d = new ArrayList();
    public boolean e;

    public vg5(fg5 fg5Var, sa5 sa5Var) {
        this.a = fg5Var;
        this.b = sa5Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            if (!this.e) {
                if (!this.a.t()) {
                    c();
                    return jSONArray;
                }
                d(this.a.g());
            }
            for (ug5 ug5Var : this.d) {
                jSONArray.put(ug5Var.a());
            }
            return jSONArray;
        }
    }

    public final void c() {
        this.a.s(new tg5(this));
    }

    public final void d(List list) {
        String str;
        boolean z;
        ra5 a;
        ra5 a2;
        zzbye zzbyeVar;
        synchronized (this.c) {
            if (this.e) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrz zzbrzVar = (zzbrz) it.next();
                if (((Boolean) zzba.zzc().b(g93.r8)).booleanValue() && (a2 = this.b.a(zzbrzVar.p)) != null && (zzbyeVar = a2.c) != null) {
                    str = zzbyeVar.toString();
                    String str2 = str;
                    if (((Boolean) zzba.zzc().b(g93.s8)).booleanValue() && (a = this.b.a(zzbrzVar.p)) != null && a.d) {
                        z = true;
                        List list2 = this.d;
                        String str3 = zzbrzVar.p;
                        list2.add(new ug5(str3, str2, this.b.c(str3), zzbrzVar.q ? 1 : 0, zzbrzVar.s, zzbrzVar.r, z));
                    }
                    z = false;
                    List list22 = this.d;
                    String str32 = zzbrzVar.p;
                    list22.add(new ug5(str32, str2, this.b.c(str32), zzbrzVar.q ? 1 : 0, zzbrzVar.s, zzbrzVar.r, z));
                }
                str = "";
                String str22 = str;
                if (((Boolean) zzba.zzc().b(g93.s8)).booleanValue()) {
                    z = true;
                    List list222 = this.d;
                    String str322 = zzbrzVar.p;
                    list222.add(new ug5(str322, str22, this.b.c(str322), zzbrzVar.q ? 1 : 0, zzbrzVar.s, zzbrzVar.r, z));
                }
                z = false;
                List list2222 = this.d;
                String str3222 = zzbrzVar.p;
                list2222.add(new ug5(str3222, str22, this.b.c(str3222), zzbrzVar.q ? 1 : 0, zzbrzVar.s, zzbrzVar.r, z));
            }
            this.e = true;
        }
    }
}
