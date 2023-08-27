package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzxk implements zzww {
    private final Context mContext;
    private final long mStartTime;
    private final boolean zzael;
    private final zzwy zzbtj;
    private final boolean zzbtn;
    private final boolean zzbto;
    private final zzaef zzbuc;
    private final long zzbud;
    private final String zzbuh;
    private zzxb zzbum;
    private final zznx zzvr;
    private final zzxn zzwh;
    private final Object mLock = new Object();
    private boolean zzbuf = false;
    private List<zzxe> zzbui = new ArrayList();

    public zzxk(Context context, zzaef zzaefVar, zzxn zzxnVar, zzwy zzwyVar, boolean z, boolean z2, String str, long j, long j2, zznx zznxVar, boolean z3) {
        this.mContext = context;
        this.zzbuc = zzaefVar;
        this.zzwh = zzxnVar;
        this.zzbtj = zzwyVar;
        this.zzael = z;
        this.zzbtn = z2;
        this.zzbuh = str;
        this.mStartTime = j;
        this.zzbud = j2;
        this.zzvr = zznxVar;
        this.zzbto = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzbuf = true;
            if (this.zzbum != null) {
                this.zzbum.cancel();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x016f -> B:48:0x016d). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzww
    public final zzxe zzh(List<zzwx> list) {
        Object obj;
        zzxe zzxeVar;
        zzakb.zzck("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zznv zzjj = this.zzvr.zzjj();
        zzjn zzjnVar = this.zzbuc.zzacv;
        int[] iArr = new int[2];
        if (zzjnVar.zzard != null) {
            com.google.android.gms.ads.internal.zzbv.zzfd();
            if (zzxg.zza(this.zzbuh, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                zzjn[] zzjnVarArr = zzjnVar.zzard;
                int length = zzjnVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    zzjn zzjnVar2 = zzjnVarArr[i3];
                    if (i == zzjnVar2.width && i2 == zzjnVar2.height) {
                        zzjnVar = zzjnVar2;
                        break;
                    }
                    i3++;
                }
            }
        }
        Iterator<zzwx> it = list.iterator();
        while (it.hasNext()) {
            zzwx next = it.next();
            String valueOf = String.valueOf(next.zzbrs);
            zzakb.zzdj(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            Iterator<String> it2 = next.zzbrt.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                zznv zzjj2 = this.zzvr.zzjj();
                Object obj2 = this.mLock;
                synchronized (obj2) {
                    try {
                        if (this.zzbuf) {
                            zzxeVar = new zzxe(-1);
                        } else {
                            Iterator<zzwx> it3 = it;
                            Iterator<String> it4 = it2;
                            zznv zznvVar = zzjj;
                            obj = obj2;
                            try {
                                zzxb zzxbVar = new zzxb(this.mContext, next2, this.zzwh, this.zzbtj, next, this.zzbuc.zzccv, zzjnVar, this.zzbuc.zzacr, this.zzael, this.zzbtn, this.zzbuc.zzadj, this.zzbuc.zzads, this.zzbuc.zzcdk, this.zzbuc.zzcef, this.zzbto);
                                this.zzbum = zzxbVar;
                                zzxe zza = zzxbVar.zza(this.mStartTime, this.zzbud);
                                this.zzbui.add(zza);
                                if (zza.zzbtv == 0) {
                                    zzakb.zzck("Adapter succeeded.");
                                    this.zzvr.zze("mediation_network_succeed", next2);
                                    if (!arrayList.isEmpty()) {
                                        this.zzvr.zze("mediation_networks_fail", TextUtils.join(",", arrayList));
                                    }
                                    this.zzvr.zza(zzjj2, "mls");
                                    this.zzvr.zza(zznvVar, "ttm");
                                    return zza;
                                }
                                arrayList.add(next2);
                                this.zzvr.zza(zzjj2, "mlf");
                                if (zza.zzbtx != null) {
                                    zzakk.zzcrm.post(new zzxl(this, zza));
                                }
                                it = it3;
                                zzjj = zznvVar;
                                it2 = it4;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                }
                return zzxeVar;
            }
        }
        if (!arrayList.isEmpty()) {
            this.zzvr.zze("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new zzxe(1);
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final List<zzxe> zzme() {
        return this.zzbui;
    }
}
