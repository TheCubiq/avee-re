package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
@zzadh
/* loaded from: classes.dex */
public final class zzag implements zzce, Runnable {
    private Context zzrt;
    private final List<Object[]> zzxo;
    private final AtomicReference<zzce> zzxp;
    private zzang zzxq;
    private CountDownLatch zzxr;

    private zzag(Context context, zzang zzangVar) {
        this.zzxo = new Vector();
        this.zzxp = new AtomicReference<>();
        this.zzxr = new CountDownLatch(1);
        this.zzrt = context;
        this.zzxq = zzangVar;
        zzkb.zzif();
        if (zzamu.zzsh()) {
            zzaki.zzb(this);
        } else {
            run();
        }
    }

    public zzag(zzbw zzbwVar) {
        this(zzbwVar.zzrt, zzbwVar.zzacr);
    }

    private static Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final boolean zzdc() {
        try {
            this.zzxr.await();
            return true;
        } catch (InterruptedException e) {
            zzakb.zzc("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzdd() {
        if (this.zzxo.isEmpty()) {
            return;
        }
        for (Object[] objArr : this.zzxo) {
            if (objArr.length == 1) {
                this.zzxp.get().zza((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                this.zzxp.get().zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzxo.clear();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzang] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzxq.zzcvg;
            if (!((Boolean) zzkb.zzik().zzd(zznk.zzayl)).booleanValue() && z2) {
                z = true;
            }
            this.zzxp.set(zzch.zza(this.zzxq.zzcw, zzd(this.zzrt), z));
        } finally {
            this.zzxr.countDown();
            this.zzrt = null;
            this.zzxq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final String zza(Context context) {
        zzce zzceVar;
        if (!zzdc() || (zzceVar = this.zzxp.get()) == null) {
            return "";
        }
        zzdd();
        return zzceVar.zza(zzd(context));
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final String zza(Context context, String str, View view, Activity activity) {
        zzce zzceVar;
        if (!zzdc() || (zzceVar = this.zzxp.get()) == null) {
            return "";
        }
        zzdd();
        return zzceVar.zza(zzd(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final void zza(int i, int i2, int i3) {
        zzce zzceVar = this.zzxp.get();
        if (zzceVar == null) {
            this.zzxo.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        zzdd();
        zzceVar.zza(i, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final void zza(MotionEvent motionEvent) {
        zzce zzceVar = this.zzxp.get();
        if (zzceVar == null) {
            this.zzxo.add(new Object[]{motionEvent});
            return;
        }
        zzdd();
        zzceVar.zza(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final void zzb(View view) {
        zzce zzceVar = this.zzxp.get();
        if (zzceVar != null) {
            zzceVar.zzb(view);
        }
    }
}
