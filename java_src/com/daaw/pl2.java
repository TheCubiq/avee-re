package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes.dex */
public abstract class pl2 implements ol2 {
    public static volatile wm2 I;
    public double A;
    public float B;
    public float C;
    public float D;
    public float E;
    public DisplayMetrics H;
    public MotionEvent p;
    public double y;
    public double z;
    public final LinkedList q = new LinkedList();
    public long r = 0;
    public long s = 0;
    public long t = 0;
    public long u = 0;
    public long v = 0;
    public long w = 0;
    public long x = 0;
    public boolean F = false;
    public boolean G = false;

    public pl2(Context context) {
        try {
            if (((Boolean) zzba.zzc().b(g93.N2)).booleanValue()) {
                yj2.d();
            } else {
                ym2.a(I);
            }
            this.H = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr);

    public abstract hi2 b(Context context, View view, Activity activity);

    public abstract hi2 c(Context context, ai2 ai2Var);

    public abstract hi2 d(Context context, View view, Activity activity);

    public abstract zm2 e(MotionEvent motionEvent);

    public final void f() {
        this.v = 0L;
        this.r = 0L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.w = 0L;
        this.x = 0L;
        if (this.q.size() > 0) {
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.q.clear();
        } else {
            MotionEvent motionEvent = this.p;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.pl2.g(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.daaw.ol2
    public final String zze(Context context, String str, View view) {
        return g(context, str, 3, view, null, null);
    }

    @Override // com.daaw.ol2
    public final String zzf(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity, null);
    }

    @Override // com.daaw.ol2
    public final String zzg(Context context) {
        if (an2.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return g(context, null, 1, null, null, null);
    }

    @Override // com.daaw.ol2
    public final String zzh(Context context, View view, Activity activity) {
        return g(context, null, 2, view, activity, null);
    }

    @Override // com.daaw.ol2
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.F) {
            f();
            this.F = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.y = 0.0d;
            this.z = motionEvent.getRawX();
            this.A = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.z;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.A;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.y += Math.sqrt((d2 * d2) + (d4 * d4));
            this.z = rawX;
            this.A = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.p = obtain;
                    this.q.add(obtain);
                    if (this.q.size() > 6) {
                        ((MotionEvent) this.q.remove()).recycle();
                    }
                    this.t++;
                    this.v = a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.s += motionEvent.getHistorySize() + 1;
                    zm2 e = e(motionEvent);
                    Long l2 = e.d;
                    if (l2 != null && e.g != null) {
                        this.w += l2.longValue() + e.g.longValue();
                    }
                    if (this.H != null && (l = e.e) != null && e.h != null) {
                        this.x += l.longValue() + e.h.longValue();
                    }
                } else if (action2 == 3) {
                    this.u++;
                }
            } catch (nm2 unused) {
            }
        } else {
            this.B = motionEvent.getX();
            this.C = motionEvent.getY();
            this.D = motionEvent.getRawX();
            this.E = motionEvent.getRawY();
            this.r++;
        }
        this.G = true;
    }

    @Override // com.daaw.ol2
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.p != null) {
            if (((Boolean) zzba.zzc().b(g93.d2)).booleanValue()) {
                f();
            } else {
                this.p.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.H;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.p = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.p = null;
        }
        this.G = false;
    }
}
