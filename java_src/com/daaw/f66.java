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
    public final g77 a;
    public final ScheduledExecutorService b;
    public final px5 c;
    public final Context d;
    public final ri6 e;
    public final lx5 f;
    public final ya5 g;
    public final hg5 h;
    public final String i;

    public f66(g77 g77Var, ScheduledExecutorService scheduledExecutorService, String str, px5 px5Var, Context context, ri6 ri6Var, lx5 lx5Var, ya5 ya5Var, hg5 hg5Var) {
        this.a = g77Var;
        this.b = scheduledExecutorService;
        this.i = str;
        this.c = px5Var;
        this.d = context;
        this.e = ri6Var;
        this.f = lx5Var;
        this.g = ya5Var;
        this.h = hg5Var;
    }

    public static /* synthetic */ f77 a(f66 f66Var) {
        Map a = f66Var.c.a(f66Var.i, ((Boolean) zzba.zzc().b(g93.Z8)).booleanValue() ? f66Var.e.f.toLowerCase(Locale.ROOT) : f66Var.e.f);
        final Bundle a2 = ((Boolean) zzba.zzc().b(g93.w1)).booleanValue() ? f66Var.h.a() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((b27) a).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = f66Var.e.d.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(f66Var.c(str, list, bundle, true, true));
        }
        for (Map.Entry entry2 : ((b27) f66Var.c.b()).entrySet()) {
            xx5 xx5Var = (xx5) entry2.getValue();
            String str2 = xx5Var.a;
            Bundle bundle3 = f66Var.e.d.zzm;
            arrayList.add(f66Var.c(str2, Collections.singletonList(xx5Var.d), bundle3 != null ? bundle3.getBundle(str2) : null, xx5Var.b, xx5Var.c));
        }
        return s67.c(arrayList).a(new Callable() { // from class: com.daaw.c66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<f77> list2 = arrayList;
                Bundle bundle4 = a2;
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
        }, f66Var.a);
    }

    public final /* synthetic */ f77 b(String str, List list, Bundle bundle, boolean z, boolean z2) {
        dp3 dp3Var;
        dp3 b;
        e14 e14Var = new e14();
        if (z2) {
            this.f.b(str);
            b = this.f.a(str);
        } else {
            try {
                b = this.g.b(str);
            } catch (RemoteException e) {
                k04.zzh("Couldn't create RTB adapter : ", e);
                dp3Var = null;
            }
        }
        dp3Var = b;
        if (dp3Var == null) {
            if (!((Boolean) zzba.zzc().b(g93.n1)).booleanValue()) {
                throw null;
            }
            wx5.g3(str, e14Var);
        } else {
            final wx5 wx5Var = new wx5(str, dp3Var, e14Var, zzt.zzB().b());
            if (((Boolean) zzba.zzc().b(g93.s1)).booleanValue()) {
                this.b.schedule(new Runnable() { // from class: com.daaw.b66
                    @Override // java.lang.Runnable
                    public final void run() {
                        wx5.this.zzc();
                    }
                }, ((Long) zzba.zzc().b(g93.l1)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                dp3Var.U(nt0.g3(this.d), this.i, bundle, (Bundle) list.get(0), this.e.e, wx5Var);
            } else {
                wx5Var.zzd();
            }
        }
        return e14Var;
    }

    public final j67 c(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        j67 D = j67.D(s67.l(new v57() { // from class: com.daaw.d66
            @Override // com.daaw.v57
            public final f77 zza() {
                return f66.this.b(str, list, bundle, z, z2);
            }
        }, this.a));
        if (!((Boolean) zzba.zzc().b(g93.s1)).booleanValue()) {
            D = (j67) s67.o(D, ((Long) zzba.zzc().b(g93.l1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return (j67) s67.f(D, Throwable.class, new ey6() { // from class: com.daaw.e66
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                k04.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.a);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 32;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.l(new v57() { // from class: com.daaw.a66
            @Override // com.daaw.v57
            public final f77 zza() {
                return f66.a(f66.this);
            }
        }, this.a);
    }
}
