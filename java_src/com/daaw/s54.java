package com.daaw;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
/* loaded from: classes.dex */
public final class s54 extends j54 implements o24 {
    public p24 s;
    public String t;
    public boolean u;
    public boolean v;
    public y44 w;
    public long x;
    public long y;

    public s54(y24 y24Var, x24 x24Var) {
        super(y24Var);
        Context context = y24Var.getContext();
        p24 n64Var = x24Var.m ? new n64(context, x24Var, (y24) this.r.get()) : new l44(context, x24Var, (y24) this.r.get());
        this.s = n64Var;
        n64Var.M(this);
    }

    public static final String y(String str) {
        return "cache:".concat(String.valueOf(d04.j(str)));
    }

    public static String z(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    public final void A(long j) {
        zzs.zza.postDelayed(new Runnable() { // from class: com.daaw.q54
            @Override // java.lang.Runnable
            public final void run() {
                s54.this.x();
            }
        }, j);
    }

    @Override // com.daaw.j54, com.daaw.p31
    public final void a() {
        p24 p24Var = this.s;
        if (p24Var != null) {
            p24Var.M(null);
            this.s.I();
        }
    }

    @Override // com.daaw.o24
    public final void c(int i) {
    }

    @Override // com.daaw.o24
    public final void d(String str, Exception exc) {
        k04.zzk("Precache exception", exc);
        zzt.zzo().t(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.daaw.o24
    public final void e(final boolean z, final long j) {
        final y24 y24Var = (y24) this.r.get();
        if (y24Var != null) {
            z04.e.execute(new Runnable() { // from class: com.daaw.r54
                @Override // java.lang.Runnable
                public final void run() {
                    y24.this.m0(z, j);
                }
            });
        }
    }

    @Override // com.daaw.o24
    public final void f(String str, Exception exc) {
        k04.zzk("Precache error", exc);
        zzt.zzo().t(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.daaw.o24
    public final void g(int i, int i2) {
    }

    @Override // com.daaw.j54
    public final void h() {
        synchronized (this) {
            this.u = true;
            notify();
            a();
        }
        String str = this.t;
        if (str != null) {
            j(this.t, y(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.daaw.j54
    public final void o(int i) {
        this.s.K(i);
    }

    @Override // com.daaw.j54
    public final void p(int i) {
        this.s.L(i);
    }

    @Override // com.daaw.j54
    public final void q(int i) {
        this.s.N(i);
    }

    @Override // com.daaw.j54
    public final void r(int i) {
        this.s.O(i);
    }

    @Override // com.daaw.j54
    public final boolean s(String str) {
        return t(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.daaw.j54] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.daaw.j54
    public final boolean t(String str, String[] strArr) {
        String str2;
        String str3;
        s54 s54Var;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str4;
        long j5;
        long j6;
        long j7;
        s54 s54Var2 = this;
        String str5 = str;
        s54Var2.t = str5;
        String y = y(str);
        String str6 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            s54Var2.s.G(uriArr, s54Var2.q);
            y24 y24Var = (y24) s54Var2.r.get();
            if (y24Var != null) {
                y24Var.t(y, s54Var2);
            }
            ag zzB = zzt.zzB();
            long a = zzB.a();
            long longValue = ((Long) zzba.zzc().b(g93.w)).longValue();
            long longValue2 = ((Long) zzba.zzc().b(g93.v)).longValue() * 1000;
            long intValue = ((Integer) zzba.zzc().b(g93.u)).intValue();
            boolean booleanValue = ((Boolean) zzba.zzc().b(g93.F1)).booleanValue();
            long j8 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.a() - a > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        } else if (s54Var2.u) {
                            throw new IOException("Abort requested before buffering finished. ");
                        } else {
                            if (s54Var2.v) {
                                break;
                            } else if (!s54Var2.s.V()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            } else {
                                long e0 = s54Var2.s.e0();
                                if (e0 > 0) {
                                    long a0 = s54Var2.s.a0();
                                    if (a0 != j8) {
                                        try {
                                            j = intValue;
                                            j7 = e0;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = y;
                                        } catch (Throwable th) {
                                            th = th;
                                            s54Var = this;
                                            str2 = str;
                                            str3 = y;
                                        }
                                        try {
                                            n(str, y, a0, j7, a0 > 0, booleanValue ? s54Var2.s.E() : -1L, booleanValue ? s54Var2.s.c0() : -1L, booleanValue ? s54Var2.s.F() : -1L, p24.X(), p24.Z());
                                            j6 = a0;
                                            j5 = e0;
                                            str2 = j7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            s54Var = this;
                                            str2 = str;
                                            str3 = str4;
                                            try {
                                                throw th;
                                            } catch (Exception e) {
                                                e = e;
                                                String str7 = str6;
                                                k04.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                zzt.zzo().t(e, "VideoStreamExoPlayerCache.preload");
                                                a();
                                                s54Var.j(str2, str3, str7, z(str7, e));
                                                return false;
                                            }
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j4 = longValue;
                                        str4 = y;
                                        j5 = e0;
                                        j6 = j8;
                                        str2 = intValue;
                                    }
                                    s54Var = (a0 > j5 ? 1 : (a0 == j5 ? 0 : -1));
                                    if (s54Var >= 0) {
                                        l(str, str4, j5);
                                        break;
                                    }
                                    try {
                                        s54 s54Var3 = this;
                                        str2 = str;
                                        str3 = str4;
                                        if (s54Var3.s.b0() >= j && a0 > 0) {
                                            break;
                                        }
                                        j3 = j4;
                                        r1 = j6;
                                        s54Var = s54Var3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } else {
                                    j = intValue;
                                    j2 = longValue2;
                                    str2 = str5;
                                    str3 = y;
                                    s54Var = s54Var2;
                                    j3 = longValue;
                                    r1 = j8;
                                }
                                try {
                                    try {
                                        s54Var.wait(j3);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str6 = r1;
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = y;
                        s54Var = s54Var2;
                    }
                }
                longValue = j3;
                s54Var2 = s54Var;
                str5 = str2;
                y = str3;
                intValue = j;
                longValue2 = j2;
                j8 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = y;
            s54Var = s54Var2;
        }
    }

    @Override // com.daaw.j54
    public final boolean u(String str, String[] strArr, y44 y44Var) {
        this.t = str;
        this.w = y44Var;
        String y = y(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.s.G(uriArr, this.q);
            y24 y24Var = (y24) this.r.get();
            if (y24Var != null) {
                y24Var.t(y, this);
            }
            this.x = zzt.zzB().a();
            this.y = -1L;
            A(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            k04.zzj("Failed to preload url " + str + " Exception: " + message);
            zzt.zzo().t(e, "VideoStreamExoPlayerCache.preload");
            a();
            j(str, y, "error", z("error", e));
            return false;
        }
    }

    public final p24 v() {
        synchronized (this) {
            this.v = true;
            notify();
        }
        this.s.M(null);
        p24 p24Var = this.s;
        this.s = null;
        return p24Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.daaw.j54, com.daaw.s54] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.daaw.s54] */
    /* JADX WARN: Type inference failed for: r2v30 */
    public final /* synthetic */ void x() {
        String str;
        s54 s54Var;
        s54 s54Var2;
        e93 zzc;
        long longValue;
        long intValue;
        s54 s54Var3;
        long j;
        long j2;
        String str2;
        long j3;
        String y = y(this.t);
        String str3 = "error";
        try {
            y83 y83Var = g93.v;
            zzc = zzba.zzc();
            longValue = ((Long) zzc.b(y83Var)).longValue() * 1000;
            intValue = ((Integer) zzba.zzc().b(g93.u)).intValue();
            s54Var = ((Boolean) zzba.zzc().b(g93.F1)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = y;
            s54Var = this;
        }
        synchronized (this) {
            try {
                int i = ((zzt.zzB().a() - this.x) > longValue ? 1 : ((zzt.zzB().a() - this.x) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (this.u) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.v) {
                            if (!this.s.V()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long e0 = this.s.e0();
                            if (e0 > 0) {
                                long a0 = this.s.a0();
                                if (a0 != this.y) {
                                    try {
                                        j2 = intValue;
                                        str2 = y;
                                        try {
                                            n(this.t, y, a0, e0, a0 > 0, s54Var != 0 ? this.s.E() : -1L, s54Var != 0 ? this.s.c0() : -1L, s54Var != 0 ? this.s.F() : -1L, p24.X(), p24.Z());
                                            s54Var = this;
                                            j = a0;
                                            try {
                                                s54Var.y = j;
                                                j3 = e0;
                                                s54Var = s54Var;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            s54Var = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        s54Var = this;
                                        str = y;
                                    }
                                } else {
                                    j = a0;
                                    j2 = intValue;
                                    str2 = y;
                                    s54Var = this;
                                    j3 = e0;
                                }
                                if (j >= j3) {
                                    s54Var.l(s54Var.t, str2, j3);
                                } else {
                                    int i2 = (s54Var.s.b0() > j2 ? 1 : (s54Var.s.b0() == j2 ? 0 : -1));
                                    s54Var3 = s54Var;
                                    if (i2 >= 0) {
                                        s54Var3 = s54Var;
                                        if (j > 0) {
                                        }
                                    }
                                }
                                s54Var2 = s54Var;
                            } else {
                                s54Var3 = this;
                            }
                            s54Var3.A(((Long) zzba.zzc().b(g93.w)).longValue());
                            return;
                        }
                        s54Var2 = this;
                        zzt.zzy().f(s54Var2.w);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = i;
                    }
                } else {
                    str = y;
                    s54Var = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = y;
                s54Var = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                k04.zzj("Failed to preload url " + s54Var.t + " Exception: " + e.getMessage());
                zzt.zzo().t(e, "VideoStreamExoPlayerCache.preload");
                a();
                s54Var.j(s54Var.t, str, str4, z(str4, e));
                s54Var2 = s54Var;
                zzt.zzy().f(s54Var2.w);
            }
        }
    }

    @Override // com.daaw.o24
    public final void zzv() {
        k04.zzj("Precache onRenderedFirstFrame");
    }
}
