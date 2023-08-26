package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzgf {
    private int zzahm;
    private final Object mLock = new Object();
    private List<zzge> zzahn = new LinkedList();

    public final boolean zza(zzge zzgeVar) {
        synchronized (this.mLock) {
            return this.zzahn.contains(zzgeVar);
        }
    }

    public final boolean zzb(zzge zzgeVar) {
        synchronized (this.mLock) {
            Iterator<zzge> it = this.zzahn.iterator();
            while (it.hasNext()) {
                zzge next = it.next();
                if (!((Boolean) zzkb.zzik().zzd(zznk.zzawq)).booleanValue() || com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzqu()) {
                    if (((Boolean) zzkb.zzik().zzd(zznk.zzaws)).booleanValue() && !com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzqw() && zzgeVar != next && next.zzgp().equals(zzgeVar.zzgp())) {
                        it.remove();
                        return true;
                    }
                } else if (zzgeVar != next && next.getSignature().equals(zzgeVar.getSignature())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzge zzgeVar) {
        synchronized (this.mLock) {
            if (this.zzahn.size() >= 10) {
                int size = this.zzahn.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzakb.zzck(sb.toString());
                this.zzahn.remove(0);
            }
            int i = this.zzahm;
            this.zzahm = i + 1;
            zzgeVar.zzo(i);
            this.zzahn.add(zzgeVar);
        }
    }

    public final zzge zzgv() {
        synchronized (this.mLock) {
            zzge zzgeVar = null;
            if (this.zzahn.size() == 0) {
                zzakb.zzck("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzahn.size() < 2) {
                zzge zzgeVar2 = this.zzahn.get(0);
                zzgeVar2.zzgq();
                return zzgeVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzge zzgeVar3 : this.zzahn) {
                int score = zzgeVar3.getScore();
                if (score > i2) {
                    i = i3;
                    zzgeVar = zzgeVar3;
                    i2 = score;
                }
                i3++;
            }
            this.zzahn.remove(i);
            return zzgeVar;
        }
    }
}
