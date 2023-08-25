package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.daaw.fd5;
import com.daaw.g93;
import com.daaw.gy2;
import com.daaw.pd5;
import com.daaw.z04;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzc {
    public final pd5 h;
    public Map i;
    @GuardedBy("this")
    public final ArrayDeque f = new ArrayDeque();
    @GuardedBy("this")
    public final ArrayDeque g = new ArrayDeque();
    public final int a = ((Integer) zzba.zzc().b(g93.t6)).intValue();
    public final long b = ((Long) zzba.zzc().b(g93.u6)).longValue();
    public final boolean c = ((Boolean) zzba.zzc().b(g93.z6)).booleanValue();
    public final boolean d = ((Boolean) zzba.zzc().b(g93.x6)).booleanValue();
    @GuardedBy("this")
    public final Map e = Collections.synchronizedMap(new gy2(this));

    public zzc(pd5 pd5Var) {
        this.h = pd5Var;
    }

    public static final void g(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final /* synthetic */ void c(fd5 fd5Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        e(fd5Var, arrayDeque, "to");
        e(fd5Var, arrayDeque2, "of");
    }

    public final synchronized void d(final fd5 fd5Var) {
        if (this.c) {
            final ArrayDeque clone = this.g.clone();
            this.g.clear();
            final ArrayDeque clone2 = this.f.clone();
            this.f.clear();
            z04.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    zzc.this.c(fd5Var, clone, clone2);
                }
            });
        }
    }

    public final void e(fd5 fd5Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fd5Var.a());
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                g(this.i, "e_type", (String) pair.first);
                g(this.i, "e_agent", (String) pair.second);
            }
            this.h.e(this.i);
        }
    }

    public final synchronized void f() {
        long a = com.google.android.gms.ads.internal.zzt.zzB().a();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String zzb(String str, fd5 fd5Var) {
        Pair pair = (Pair) this.e.get(str);
        fd5Var.a().put("rid", str);
        if (pair == null) {
            fd5Var.a().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.e.remove(str);
        fd5Var.a().put("mhit", "true");
        return str2;
    }

    public final synchronized void zzd(String str, String str2, fd5 fd5Var) {
        this.e.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().a()), str2));
        f();
        d(fd5Var);
    }

    public final synchronized void zzf(String str) {
        this.e.remove(str);
    }
}
