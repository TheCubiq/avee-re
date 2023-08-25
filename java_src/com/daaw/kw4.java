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

    /* renamed from: p */
    public final Map f16787p = new HashMap();

    public kw4(Set set) {
        m17379A0(set);
    }

    /* renamed from: A0 */
    public final synchronized void m17379A0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m17377m0((ly4) it.next());
        }
    }

    /* renamed from: B0 */
    public final synchronized void m17378B0(final jw4 jw4Var) {
        for (Map.Entry entry : this.f16787p.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.daaw.iw4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        jw4.this.zza(key);
                    } catch (Throwable th) {
                        zzt.zzo().m11903t(th, "EventEmitter.notify");
                        zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    /* renamed from: m0 */
    public final synchronized void m17377m0(ly4 ly4Var) {
        m17376n0(ly4Var.f17910a, ly4Var.f17911b);
    }

    /* renamed from: n0 */
    public final synchronized void m17376n0(Object obj, Executor executor) {
        this.f16787p.put(obj, executor);
    }
}
