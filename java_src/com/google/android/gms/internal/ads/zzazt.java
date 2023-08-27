package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
final class zzazt {
    private final ConcurrentHashMap<zzazu, List<Throwable>> zzdoy = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzdoz = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.zzdoz.poll();
            if (poll == null) {
                return this.zzdoy.get(new zzazu(th, null));
            }
            this.zzdoy.remove(poll);
        }
    }
}
