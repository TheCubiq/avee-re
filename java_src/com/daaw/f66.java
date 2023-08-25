package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f66 implements i76 {

    /* renamed from: a */
    public final g77 f9192a;

    /* renamed from: b */
    public final ScheduledExecutorService f9193b;

    /* renamed from: c */
    public final px5 f9194c;

    /* renamed from: d */
    public final Context f9195d;

    /* renamed from: e */
    public final ri6 f9196e;

    /* renamed from: f */
    public final lx5 f9197f;

    /* renamed from: g */
    public final ya5 f9198g;

    /* renamed from: h */
    public final hg5 f9199h;

    /* renamed from: i */
    public final String f9200i;

    public f66(g77 g77Var, ScheduledExecutorService scheduledExecutorService, String str, px5 px5Var, Context context, ri6 ri6Var, lx5 lx5Var, ya5 ya5Var, hg5 hg5Var) {
        this.f9192a = g77Var;
        this.f9193b = scheduledExecutorService;
        this.f9200i = str;
        this.f9194c = px5Var;
        this.f9195d = context;
        this.f9196e = ri6Var;
        this.f9197f = lx5Var;
        this.f9198g = ya5Var;
        this.f9199h = hg5Var;
    }

    /* renamed from: a */
    public static /* synthetic */ f77 m22884a(f66 f66Var) {
        Map m12898a = f66Var.f9194c.m12898a(f66Var.f9200i, ((Boolean) zzba.zzc().m23658b(g93.f10620Z8)).booleanValue() ? f66Var.f9196e.f25346f.toLowerCase(Locale.ROOT) : f66Var.f9196e.f25346f);
        final Bundle m20799a = ((Boolean) zzba.zzc().m23658b(g93.f10865w1)).booleanValue() ? f66Var.f9199h.m20799a() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((b27) m12898a).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = f66Var.f9196e.f25344d.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(f66Var.m22882c(str, list, bundle, true, true));
        }
        for (Map.Entry entry2 : ((b27) f66Var.f9194c.m12897b()).entrySet()) {
            xx5 xx5Var = (xx5) entry2.getValue();
            String str2 = xx5Var.f33109a;
            Bundle bundle3 = f66Var.f9196e.f25344d.zzm;
            arrayList.add(f66Var.m22882c(str2, Collections.singletonList(xx5Var.f33112d), bundle3 != null ? bundle3.getBundle(str2) : null, xx5Var.f33110b, xx5Var.f33111c));
        }
        return s67.m10640c(arrayList).m11710a(new Callable() { // from class: com.daaw.c66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<f77> list2 = arrayList;
                Bundle bundle4 = m20799a;
                JSONArray jSONArray = new JSONArray();
                for (f77 f77Var : list2) {
                    if (((JSONObject) f77Var.get()) != null) {
                        jSONArray.put(f77Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new g66(jSONArray.toString(), bundle4);
            }
        }, f66Var.f9192a);
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m22883b(String str, List list, Bundle bundle, boolean z, boolean z2) {
        dp3 dp3Var;
        dp3 m3951b;
        e14 e14Var = new e14();
        if (z2) {
            this.f9197f.m16379b(str);
            m3951b = this.f9197f.m16380a(str);
        } else {
            try {
                m3951b = this.f9198g.m3951b(str);
            } catch (RemoteException e) {
                k04.zzh("Couldn't create RTB adapter : ", e);
                dp3Var = null;
            }
        }
        dp3Var = m3951b;
        if (dp3Var == null) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10766n1)).booleanValue()) {
                throw null;
            }
            wx5.m5728g3(str, e14Var);
        } else {
            final wx5 wx5Var = new wx5(str, dp3Var, e14Var, zzt.zzB().mo15859b());
            if (((Boolean) zzba.zzc().m23658b(g93.f10821s1)).booleanValue()) {
                this.f9193b.schedule(new Runnable() { // from class: com.daaw.b66
                    @Override // java.lang.Runnable
                    public final void run() {
                        wx5.this.zzc();
                    }
                }, ((Long) zzba.zzc().m23658b(g93.f10744l1)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                dp3Var.mo10084U(nt0.m14830g3(this.f9195d), this.f9200i, bundle, (Bundle) list.get(0), this.f9196e.f25345e, wx5Var);
            } else {
                wx5Var.zzd();
            }
        }
        return e14Var;
    }

    /* renamed from: c */
    public final j67 m22882c(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        j67 m18784D = j67.m18784D(s67.m10631l(new v57() { // from class: com.daaw.d66
            @Override // com.daaw.v57
            public final f77 zza() {
                return f66.this.m22883b(str, list, bundle, z, z2);
            }
        }, this.f9192a));
        if (!((Boolean) zzba.zzc().m23658b(g93.f10821s1)).booleanValue()) {
            m18784D = (j67) s67.m10628o(m18784D, ((Long) zzba.zzc().m23658b(g93.f10744l1)).longValue(), TimeUnit.MILLISECONDS, this.f9193b);
        }
        return (j67) s67.m10637f(m18784D, Throwable.class, new ey6() { // from class: com.daaw.e66
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                k04.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.f9192a);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 32;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10631l(new v57() { // from class: com.daaw.a66
            @Override // com.daaw.v57
            public final f77 zza() {
                return f66.m22884a(f66.this);
            }
        }, this.f9192a);
    }
}
