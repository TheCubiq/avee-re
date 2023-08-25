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

    /* renamed from: I */
    public static volatile wm2 f23021I;

    /* renamed from: A */
    public double f23022A;

    /* renamed from: B */
    public float f23023B;

    /* renamed from: C */
    public float f23024C;

    /* renamed from: D */
    public float f23025D;

    /* renamed from: E */
    public float f23026E;

    /* renamed from: H */
    public DisplayMetrics f23029H;

    /* renamed from: p */
    public MotionEvent f23030p;

    /* renamed from: y */
    public double f23039y;

    /* renamed from: z */
    public double f23040z;

    /* renamed from: q */
    public final LinkedList f23031q = new LinkedList();

    /* renamed from: r */
    public long f23032r = 0;

    /* renamed from: s */
    public long f23033s = 0;

    /* renamed from: t */
    public long f23034t = 0;

    /* renamed from: u */
    public long f23035u = 0;

    /* renamed from: v */
    public long f23036v = 0;

    /* renamed from: w */
    public long f23037w = 0;

    /* renamed from: x */
    public long f23038x = 0;

    /* renamed from: F */
    public boolean f23027F = false;

    /* renamed from: G */
    public boolean f23028G = false;

    public pl2(Context context) {
        try {
            if (((Boolean) zzba.zzc().m23658b(g93.f10494N2)).booleanValue()) {
                yj2.m3653d();
            } else {
                ym2.m3510a(f23021I);
            }
            this.f23029H = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public abstract long mo12356a(StackTraceElement[] stackTraceElementArr);

    /* renamed from: b */
    public abstract hi2 mo12355b(Context context, View view, Activity activity);

    /* renamed from: c */
    public abstract hi2 mo12354c(Context context, ai2 ai2Var);

    /* renamed from: d */
    public abstract hi2 mo12353d(Context context, View view, Activity activity);

    /* renamed from: e */
    public abstract zm2 mo12352e(MotionEvent motionEvent);

    /* renamed from: f */
    public final void m13299f() {
        this.f23036v = 0L;
        this.f23032r = 0L;
        this.f23033s = 0L;
        this.f23034t = 0L;
        this.f23035u = 0L;
        this.f23037w = 0L;
        this.f23038x = 0L;
        if (this.f23031q.size() > 0) {
            Iterator it = this.f23031q.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f23031q.clear();
        } else {
            MotionEvent motionEvent = this.f23030p;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f23030p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m13298g(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        nl2 nl2Var;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        String m3656a;
        int i5;
        int i6 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zzba.zzc().m23658b(g93.f10679f2)).booleanValue();
        hi2 hi2Var = null;
        if (booleanValue) {
            nl2Var = f23021I != null ? f23021I.m6002d() : null;
            str2 = true != ((Boolean) zzba.zzc().m23658b(g93.f10494N2)).booleanValue() ? "te" : "be";
        } else {
            nl2Var = null;
            str2 = null;
        }
        try {
            if (i6 == 3) {
                hi2Var = mo12355b(context, view, activity);
                try {
                    this.f23027F = true;
                    i5 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (booleanValue) {
                        if (i6 != i2) {
                        }
                        nl2Var.m15048c(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (hi2Var != null) {
                        }
                        m3656a = Integer.toString(5);
                        return m3656a;
                    }
                    i3 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (hi2Var != null) {
                    }
                    m3656a = Integer.toString(5);
                    return m3656a;
                }
            } else if (i6 == 2) {
                hi2Var = mo12353d(context, view, activity);
                i5 = 1008;
            } else {
                hi2Var = mo12354c(context, null);
                i5 = 1000;
            }
            if (!booleanValue || nl2Var == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    nl2Var.m15048c(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue && nl2Var != null) {
                        if (i6 != i2) {
                            i3 = 2;
                            i4 = 1003;
                        } else {
                            i3 = 2;
                            if (i6 == 2) {
                                i4 = 1009;
                            } else {
                                i6 = 1;
                                i4 = 1001;
                            }
                        }
                        nl2Var.m15048c(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (hi2Var != null) {
                        }
                        m3656a = Integer.toString(5);
                        return m3656a;
                    }
                    i3 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (hi2Var != null) {
                    }
                    m3656a = Integer.toString(5);
                    return m3656a;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        i3 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (hi2Var != null) {
            try {
            } catch (Exception e4) {
                m3656a = Integer.toString(7);
                if (booleanValue && nl2Var != null) {
                    nl2Var.m15048c(i6 == i2 ? 1007 : i6 == i3 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e4);
                }
            }
            if (((fj2) hi2Var.m22315n()).mo4512i() != 0) {
                m3656a = yj2.m3656a((fj2) hi2Var.m22315n(), str);
                if (booleanValue && nl2Var != null) {
                    nl2Var.m15048c(i6 == i2 ? 1006 : i6 == i3 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return m3656a;
            }
        }
        m3656a = Integer.toString(5);
        return m3656a;
    }

    @Override // com.daaw.ol2
    public final String zze(Context context, String str, View view) {
        return m13298g(context, str, 3, view, null, null);
    }

    @Override // com.daaw.ol2
    public final String zzf(Context context, String str, View view, Activity activity) {
        return m13298g(context, str, 3, view, activity, null);
    }

    @Override // com.daaw.ol2
    public final String zzg(Context context) {
        if (an2.m27325f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return m13298g(context, null, 1, null, null, null);
    }

    @Override // com.daaw.ol2
    public final String zzh(Context context, View view, Activity activity) {
        return m13298g(context, null, 2, view, activity, null);
    }

    @Override // com.daaw.ol2
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.f23027F) {
            m13299f();
            this.f23027F = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23039y = 0.0d;
            this.f23040z = motionEvent.getRawX();
            this.f23022A = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.f23040z;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.f23022A;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.f23039y += Math.sqrt((d2 * d2) + (d4 * d4));
            this.f23040z = rawX;
            this.f23022A = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.f23030p = obtain;
                    this.f23031q.add(obtain);
                    if (this.f23031q.size() > 6) {
                        ((MotionEvent) this.f23031q.remove()).recycle();
                    }
                    this.f23034t++;
                    this.f23036v = mo12356a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f23033s += motionEvent.getHistorySize() + 1;
                    zm2 mo12352e = mo12352e(motionEvent);
                    Long l2 = mo12352e.f35224d;
                    if (l2 != null && mo12352e.f35227g != null) {
                        this.f23037w += l2.longValue() + mo12352e.f35227g.longValue();
                    }
                    if (this.f23029H != null && (l = mo12352e.f35225e) != null && mo12352e.f35228h != null) {
                        this.f23038x += l.longValue() + mo12352e.f35228h.longValue();
                    }
                } else if (action2 == 3) {
                    this.f23035u++;
                }
            } catch (nm2 unused) {
            }
        } else {
            this.f23023B = motionEvent.getX();
            this.f23024C = motionEvent.getY();
            this.f23025D = motionEvent.getRawX();
            this.f23026E = motionEvent.getRawY();
            this.f23032r++;
        }
        this.f23028G = true;
    }

    @Override // com.daaw.ol2
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.f23030p != null) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10657d2)).booleanValue()) {
                m13299f();
            } else {
                this.f23030p.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.f23029H;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.f23030p = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f23030p = null;
        }
        this.f23028G = false;
    }
}
