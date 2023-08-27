package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes2.dex */
public abstract class zzcf implements zzce {
    protected static volatile zzcz zzps;
    protected MotionEvent zzpy;
    protected double zzqh;
    private double zzqi;
    private double zzqj;
    protected float zzqk;
    protected float zzql;
    protected float zzqm;
    protected float zzqn;
    protected DisplayMetrics zzqq;
    protected LinkedList<MotionEvent> zzpz = new LinkedList<>();
    protected long zzqa = 0;
    protected long zzqb = 0;
    protected long zzqc = 0;
    protected long zzqd = 0;
    protected long zzqe = 0;
    protected long zzqf = 0;
    protected long zzqg = 0;
    private boolean zzqo = false;
    protected boolean zzqp = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcf(Context context) {
        try {
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbay)).booleanValue()) {
                zzbk.zzv();
            } else {
                zzde.zzb(zzps);
            }
            this.zzqq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String zza(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        int i;
        zzba zza;
        try {
            if (z) {
                zza = zza(context, view, activity);
                this.zzqo = true;
            } else {
                zza = zza(context, null);
            }
            if (zza != null && zza.zzacw() != 0) {
                return zzbk.zza(zza, str);
            }
            return Integer.toString(5);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            i = 7;
            return Integer.toString(i);
        } catch (Throwable unused2) {
            i = 3;
            return Integer.toString(i);
        }
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzcw;

    protected abstract zzba zza(Context context, View view, Activity activity);

    protected abstract zzba zza(Context context, zzax zzaxVar);

    @Override // com.google.android.gms.internal.ads.zzce
    public final String zza(Context context) {
        if (zzdg.isMainThread()) {
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbba)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, null, false, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, true, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final void zza(int i, int i2, int i3) {
        MotionEvent motionEvent;
        MotionEvent motionEvent2 = this.zzpy;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        DisplayMetrics displayMetrics = this.zzqq;
        if (displayMetrics != null) {
            motionEvent = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzqq.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.zzpy = motionEvent;
        this.zzqp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzce
    public final void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.zzqo) {
            this.zzqd = 0L;
            this.zzqc = 0L;
            this.zzqb = 0L;
            this.zzqa = 0L;
            this.zzqe = 0L;
            this.zzqg = 0L;
            this.zzqf = 0L;
            Iterator<MotionEvent> it = this.zzpz.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzpz.clear();
            this.zzpy = null;
            this.zzqo = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzqh = 0.0d;
            this.zzqi = motionEvent.getRawX();
            this.zzqj = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.zzqi;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzqj;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzqh += Math.sqrt((d2 * d2) + (d4 * d4));
            this.zzqi = rawX;
            this.zzqj = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzpy = obtain;
                    this.zzpz.add(obtain);
                    if (this.zzpz.size() > 6) {
                        this.zzpz.remove().recycle();
                    }
                    this.zzqc++;
                    this.zzqe = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zzqb += motionEvent.getHistorySize() + 1;
                    zzdf zzb = zzb(motionEvent);
                    if ((zzb == null || zzb.zzfr == null || zzb.zzst == null) ? false : true) {
                        this.zzqf += zzb.zzfr.longValue() + zzb.zzst.longValue();
                    }
                    if (this.zzqq != null && zzb != null && zzb.zzfp != null && zzb.zzsu != null) {
                        z = true;
                    }
                    if (z) {
                        this.zzqg += zzb.zzfp.longValue() + zzb.zzsu.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzqd++;
                }
            } catch (zzcw unused) {
            }
        } else {
            this.zzqk = motionEvent.getX();
            this.zzql = motionEvent.getY();
            this.zzqm = motionEvent.getRawX();
            this.zzqn = motionEvent.getRawY();
            this.zzqa++;
        }
        this.zzqp = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzdf zzb(MotionEvent motionEvent) throws zzcw;

    @Override // com.google.android.gms.internal.ads.zzce
    public void zzb(View view) {
    }
}
