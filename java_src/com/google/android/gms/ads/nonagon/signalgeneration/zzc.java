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

    /* renamed from: h */
    public final pd5 f36534h;

    /* renamed from: i */
    public Map f36535i;
    @GuardedBy("this")

    /* renamed from: f */
    public final ArrayDeque f36532f = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: g */
    public final ArrayDeque f36533g = new ArrayDeque();

    /* renamed from: a */
    public final int f36527a = ((Integer) zzba.zzc().m23658b(g93.f10837t6)).intValue();

    /* renamed from: b */
    public final long f36528b = ((Long) zzba.zzc().m23658b(g93.f10848u6)).longValue();

    /* renamed from: c */
    public final boolean f36529c = ((Boolean) zzba.zzc().m23658b(g93.f10903z6)).booleanValue();

    /* renamed from: d */
    public final boolean f36530d = ((Boolean) zzba.zzc().m23658b(g93.f10881x6)).booleanValue();
    @GuardedBy("this")

    /* renamed from: e */
    public final Map f36531e = Collections.synchronizedMap(new gy2(this));

    public zzc(pd5 pd5Var) {
        this.f36534h = pd5Var;
    }

    /* renamed from: g */
    public static final void m1233g(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: c */
    public final /* synthetic */ void m1237c(fd5 fd5Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        m1235e(fd5Var, arrayDeque, "to");
        m1235e(fd5Var, arrayDeque2, "of");
    }

    /* renamed from: d */
    public final synchronized void m1236d(final fd5 fd5Var) {
        if (this.f36529c) {
            final ArrayDeque clone = this.f36533g.clone();
            this.f36533g.clear();
            final ArrayDeque clone2 = this.f36532f.clone();
            this.f36532f.clear();
            z04.f34305a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    zzc.this.m1237c(fd5Var, clone, clone2);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m1235e(fd5 fd5Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fd5Var.m22773a());
            this.f36535i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f36535i.put("e_r", str);
            this.f36535i.put("e_id", (String) pair2.first);
            if (this.f36530d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                m1233g(this.f36535i, "e_type", (String) pair.first);
                m1233g(this.f36535i, "e_agent", (String) pair.second);
            }
            this.f36534h.m11390e(this.f36535i);
        }
    }

    /* renamed from: f */
    public final synchronized void m1234f() {
        long mo15860a = com.google.android.gms.ads.internal.zzt.zzB().mo15860a();
        try {
            Iterator it = this.f36531e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (mo15860a - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f36528b) {
                    break;
                }
                this.f36533g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzo().m11902u(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String zzb(String str, fd5 fd5Var) {
        Pair pair = (Pair) this.f36531e.get(str);
        fd5Var.m22773a().put("rid", str);
        if (pair == null) {
            fd5Var.m22773a().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.f36531e.remove(str);
        fd5Var.m22773a().put("mhit", "true");
        return str2;
    }

    public final synchronized void zzd(String str, String str2, fd5 fd5Var) {
        this.f36531e.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().mo15860a()), str2));
        m1234f();
        m1236d(fd5Var);
    }

    public final synchronized void zzf(String str) {
        this.f36531e.remove(str);
    }
}
