package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzaqg implements Iterable<zzaqe> {
    private final List<zzaqe> zzday = new ArrayList();

    public static boolean zzb(zzapw zzapwVar) {
        zzaqe zzc = zzc(zzapwVar);
        if (zzc != null) {
            zzc.zzdav.abort();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaqe zzc(zzapw zzapwVar) {
        Iterator<zzaqe> it = com.google.android.gms.ads.internal.zzbv.zzff().iterator();
        while (it.hasNext()) {
            zzaqe next = it.next();
            if (next.zzcyg == zzapwVar) {
                return next;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaqe> iterator() {
        return this.zzday.iterator();
    }

    public final void zza(zzaqe zzaqeVar) {
        this.zzday.add(zzaqeVar);
    }

    public final void zzb(zzaqe zzaqeVar) {
        this.zzday.remove(zzaqeVar);
    }

    public final int zztx() {
        return this.zzday.size();
    }
}
