package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@zzadh
/* loaded from: classes2.dex */
public final class zzxh implements zzww {
    private final Context mContext;
    private final long mStartTime;
    private final boolean zzael;
    private final zzwy zzbtj;
    private final boolean zzbtn;
    private final boolean zzbto;
    private final zzaef zzbuc;
    private final long zzbud;
    private final String zzbuh;
    private final zzxn zzwh;
    private final Object mLock = new Object();
    private boolean zzbuf = false;
    private final Map<zzanz<zzxe>, zzxb> zzbug = new HashMap();
    private List<zzxe> zzbui = new ArrayList();
    private final int zzbue = 2;

    public zzxh(Context context, zzaef zzaefVar, zzxn zzxnVar, zzwy zzwyVar, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.mContext = context;
        this.zzbuc = zzaefVar;
        this.zzwh = zzxnVar;
        this.zzbtj = zzwyVar;
        this.zzael = z;
        this.zzbtn = z2;
        this.zzbuh = str;
        this.mStartTime = j;
        this.zzbud = j2;
        this.zzbto = z3;
    }

    private final void zza(zzanz<zzxe> zzanzVar) {
        zzakk.zzcrm.post(new zzxj(this, zzanzVar));
    }

    private final zzxe zzi(List<zzanz<zzxe>> list) {
        synchronized (this.mLock) {
            if (this.zzbuf) {
                return new zzxe(-1);
            }
            for (zzanz<zzxe> zzanzVar : list) {
                try {
                    zzxe zzxeVar = zzanzVar.get();
                    this.zzbui.add(zzxeVar);
                    if (zzxeVar != null && zzxeVar.zzbtv == 0) {
                        zza(zzanzVar);
                        return zzxeVar;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    zzakb.zzc("Exception while processing an adapter; continuing with other adapters", e);
                }
            }
            zza((zzanz<zzxe>) null);
            return new zzxe(1);
        }
    }

    private final zzxe zzj(List<zzanz<zzxe>> list) {
        zzxe zzxeVar;
        zzxe zzxeVar2;
        zzxw zzxwVar;
        synchronized (this.mLock) {
            int i = -1;
            if (this.zzbuf) {
                return new zzxe(-1);
            }
            long j = this.zzbtj.zzbsy != -1 ? this.zzbtj.zzbsy : 10000L;
            zzanz<zzxe> zzanzVar = null;
            zzxe zzxeVar3 = null;
            for (zzanz<zzxe> zzanzVar2 : list) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
                if (j == 0) {
                    try {
                        try {
                        } finally {
                            Math.max(j - (com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis() - currentTimeMillis), 0L);
                        }
                    } catch (RemoteException | InterruptedException | ExecutionException | TimeoutException e) {
                        zzakb.zzc("Exception while processing an adapter; continuing with other adapters", e);
                    }
                    if (zzanzVar2.isDone()) {
                        zzxeVar = zzanzVar2.get();
                        zzxeVar2 = zzxeVar;
                        this.zzbui.add(zzxeVar2);
                        if (zzxeVar2 != null && zzxeVar2.zzbtv == 0 && (zzxwVar = zzxeVar2.zzbua) != null && zzxwVar.zzmm() > i) {
                            i = zzxwVar.zzmm();
                            zzanzVar = zzanzVar2;
                            zzxeVar3 = zzxeVar2;
                        }
                    }
                }
                zzxeVar = zzanzVar2.get(j, TimeUnit.MILLISECONDS);
                zzxeVar2 = zzxeVar;
                this.zzbui.add(zzxeVar2);
                if (zzxeVar2 != null) {
                    i = zzxwVar.zzmm();
                    zzanzVar = zzanzVar2;
                    zzxeVar3 = zzxeVar2;
                }
            }
            zza(zzanzVar);
            return zzxeVar3 == null ? new zzxe(1) : zzxeVar3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzbuf = true;
            for (zzxb zzxbVar : this.zzbug.values()) {
                zzxbVar.cancel();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final zzxe zzh(List<zzwx> list) {
        zzakb.zzck("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzjn zzjnVar = this.zzbuc.zzacv;
        int[] iArr = new int[2];
        if (zzjnVar.zzard != null) {
            com.google.android.gms.ads.internal.zzbv.zzfd();
            if (zzxg.zza(this.zzbuh, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnVarArr = zzjnVar.zzard;
                int length = zzjnVarArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzjn zzjnVar2 = zzjnVarArr[i];
                    if (i2 == zzjnVar2.width && i3 == zzjnVar2.height) {
                        zzjnVar = zzjnVar2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator<zzwx> it = list.iterator();
        while (it.hasNext()) {
            zzwx next = it.next();
            String valueOf = String.valueOf(next.zzbrs);
            zzakb.zzdj(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            for (Iterator<String> it2 = next.zzbrt.iterator(); it2.hasNext(); it2 = it2) {
                ArrayList arrayList2 = arrayList;
                zzxb zzxbVar = new zzxb(this.mContext, it2.next(), this.zzwh, this.zzbtj, next, this.zzbuc.zzccv, zzjnVar, this.zzbuc.zzacr, this.zzael, this.zzbtn, this.zzbuc.zzadj, this.zzbuc.zzads, this.zzbuc.zzcdk, this.zzbuc.zzcef, this.zzbto);
                zzanz<zzxe> zza = zzaki.zza(new zzxi(this, zzxbVar));
                this.zzbug.put(zza, zzxbVar);
                arrayList2.add(zza);
                it = it;
                arrayList = arrayList2;
            }
        }
        ArrayList arrayList3 = arrayList;
        return this.zzbue != 2 ? zzi(arrayList3) : zzj(arrayList3);
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final List<zzxe> zzme() {
        return this.zzbui;
    }
}
