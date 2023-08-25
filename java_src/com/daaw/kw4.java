package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public class kw4 {
    @GuardedBy("this")
    public final Map p = new HashMap();

    public kw4(Set set) {
        A0(set);
    }

    public final synchronized void A0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m0((ly4) it.next());
        }
    }

    public final synchronized void B0(final jw4 jw4Var) {
        for (Map.Entry entry : this.p.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.daaw.iw4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        jw4.this.zza(key);
                    } catch (Throwable th) {
                        zzt.zzo().t(th, "EventEmitter.notify");
                        zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void m0(ly4 ly4Var) {
        n0(ly4Var.a, ly4Var.b);
    }

    public final synchronized void n0(Object obj, Executor executor) {
        this.p.put(obj, executor);
    }
}
