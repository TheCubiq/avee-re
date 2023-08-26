package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzes implements zzfa {
    private final Object mLock = new Object();
    private final WeakHashMap<zzajh, zzet> zzaem = new WeakHashMap<>();
    private final ArrayList<zzet> zzaen = new ArrayList<>();
    private final Context zzaeo;
    private final zzvf zzaep;
    private final zzang zzyf;

    public zzes(Context context, zzang zzangVar) {
        this.zzaeo = context.getApplicationContext();
        this.zzyf = zzangVar;
        this.zzaep = new zzvf(context.getApplicationContext(), zzangVar, (String) zzkb.zzik().zzd(zznk.zzaub));
    }

    private final boolean zzg(zzajh zzajhVar) {
        boolean z;
        synchronized (this.mLock) {
            zzet zzetVar = this.zzaem.get(zzajhVar);
            z = zzetVar != null && zzetVar.zzge();
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzfa
    public final void zza(zzet zzetVar) {
        synchronized (this.mLock) {
            if (!zzetVar.zzge()) {
                this.zzaen.remove(zzetVar);
                Iterator<Map.Entry<zzajh, zzet>> it = this.zzaem.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == zzetVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void zza(zzjn zzjnVar, zzajh zzajhVar) {
        zza(zzjnVar, zzajhVar, zzajhVar.zzbyo.getView());
    }

    public final void zza(zzjn zzjnVar, zzajh zzajhVar, View view) {
        zza(zzjnVar, zzajhVar, new zzez(view, zzajhVar), (zzaqw) null);
    }

    public final void zza(zzjn zzjnVar, zzajh zzajhVar, View view, zzaqw zzaqwVar) {
        zza(zzjnVar, zzajhVar, new zzez(view, zzajhVar), zzaqwVar);
    }

    public final void zza(zzjn zzjnVar, zzajh zzajhVar, zzgd zzgdVar, zzaqw zzaqwVar) {
        zzet zzetVar;
        synchronized (this.mLock) {
            if (zzg(zzajhVar)) {
                zzetVar = this.zzaem.get(zzajhVar);
            } else {
                zzet zzetVar2 = new zzet(this.zzaeo, zzjnVar, zzajhVar, this.zzyf, zzgdVar);
                zzetVar2.zza(this);
                this.zzaem.put(zzajhVar, zzetVar2);
                this.zzaen.add(zzetVar2);
                zzetVar = zzetVar2;
            }
            zzetVar.zza(zzaqwVar != null ? new zzfb(zzetVar, zzaqwVar) : new zzff(zzetVar, this.zzaep, this.zzaeo));
        }
    }

    public final void zzh(zzajh zzajhVar) {
        synchronized (this.mLock) {
            zzet zzetVar = this.zzaem.get(zzajhVar);
            if (zzetVar != null) {
                zzetVar.zzgc();
            }
        }
    }

    public final void zzi(zzajh zzajhVar) {
        synchronized (this.mLock) {
            zzet zzetVar = this.zzaem.get(zzajhVar);
            if (zzetVar != null) {
                zzetVar.stop();
            }
        }
    }

    public final void zzj(zzajh zzajhVar) {
        synchronized (this.mLock) {
            zzet zzetVar = this.zzaem.get(zzajhVar);
            if (zzetVar != null) {
                zzetVar.pause();
            }
        }
    }

    public final void zzk(zzajh zzajhVar) {
        synchronized (this.mLock) {
            zzet zzetVar = this.zzaem.get(zzajhVar);
            if (zzetVar != null) {
                zzetVar.resume();
            }
        }
    }
}
