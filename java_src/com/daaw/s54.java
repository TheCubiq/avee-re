package com.daaw;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
/* loaded from: classes.dex */
public final class s54 extends j54 implements o24 {

    /* renamed from: s */
    public p24 f25880s;

    /* renamed from: t */
    public String f25881t;

    /* renamed from: u */
    public boolean f25882u;

    /* renamed from: v */
    public boolean f25883v;

    /* renamed from: w */
    public y44 f25884w;

    /* renamed from: x */
    public long f25885x;

    /* renamed from: y */
    public long f25886y;

    public s54(y24 y24Var, x24 x24Var) {
        super(y24Var);
        Context context = y24Var.getContext();
        p24 n64Var = x24Var.f32034m ? new n64(context, x24Var, (y24) this.f14367r.get()) : new l44(context, x24Var, (y24) this.f14367r.get());
        this.f25880s = n64Var;
        n64Var.mo13743M(this);
    }

    /* renamed from: y */
    public static final String m10693y(String str) {
        return "cache:".concat(String.valueOf(d04.m24822j(str)));
    }

    /* renamed from: z */
    public static String m10692z(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    /* renamed from: A */
    public final void m10705A(long j) {
        zzs.zza.postDelayed(new Runnable() { // from class: com.daaw.q54
            @Override // java.lang.Runnable
            public final void run() {
                s54.this.m10694x();
            }
        }, j);
    }

    @Override // com.daaw.j54, com.daaw.p31
    /* renamed from: a */
    public final void mo10704a() {
        p24 p24Var = this.f25880s;
        if (p24Var != null) {
            p24Var.mo13743M(null);
            this.f25880s.mo13747I();
        }
    }

    @Override // com.daaw.o24
    /* renamed from: c */
    public final void mo9570c(int i) {
    }

    @Override // com.daaw.o24
    /* renamed from: d */
    public final void mo9569d(String str, Exception exc) {
        k04.zzk("Precache exception", exc);
        zzt.zzo().m11903t(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.daaw.o24
    /* renamed from: e */
    public final void mo9568e(final boolean z, final long j) {
        final y24 y24Var = (y24) this.f14367r.get();
        if (y24Var != null) {
            z04.f34309e.execute(new Runnable() { // from class: com.daaw.r54
                @Override // java.lang.Runnable
                public final void run() {
                    y24.this.mo4237m0(z, j);
                }
            });
        }
    }

    @Override // com.daaw.o24
    /* renamed from: f */
    public final void mo9567f(String str, Exception exc) {
        k04.zzk("Precache error", exc);
        zzt.zzo().m11903t(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.daaw.o24
    /* renamed from: g */
    public final void mo9566g(int i, int i2) {
    }

    @Override // com.daaw.j54
    /* renamed from: h */
    public final void mo10703h() {
        synchronized (this) {
            this.f25882u = true;
            notify();
            mo10704a();
        }
        String str = this.f25881t;
        if (str != null) {
            m18856j(this.f25881t, m10693y(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.daaw.j54
    /* renamed from: o */
    public final void mo10702o(int i) {
        this.f25880s.mo13745K(i);
    }

    @Override // com.daaw.j54
    /* renamed from: p */
    public final void mo10701p(int i) {
        this.f25880s.mo13744L(i);
    }

    @Override // com.daaw.j54
    /* renamed from: q */
    public final void mo10700q(int i) {
        this.f25880s.mo13742N(i);
    }

    @Override // com.daaw.j54
    /* renamed from: r */
    public final void mo10699r(int i) {
        this.f25880s.mo13741O(i);
    }

    @Override // com.daaw.j54
    /* renamed from: s */
    public final boolean mo10698s(String str) {
        return mo10697t(str, new String[]{str});
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
    /* renamed from: t */
    public final boolean mo10697t(String str, String[] strArr) {
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
        s54Var2.f25881t = str5;
        String m10693y = m10693y(str);
        String str6 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            s54Var2.f25880s.mo13749G(uriArr, s54Var2.f14366q);
            y24 y24Var = (y24) s54Var2.f14367r.get();
            if (y24Var != null) {
                y24Var.mo4236t(m10693y, s54Var2);
            }
            InterfaceC0623ag zzB = zzt.zzB();
            long mo15860a = zzB.mo15860a();
            long longValue = ((Long) zzba.zzc().m23658b(g93.f10863w)).longValue();
            long longValue2 = ((Long) zzba.zzc().m23658b(g93.f10852v)).longValue() * 1000;
            long intValue = ((Integer) zzba.zzc().m23658b(g93.f10841u)).intValue();
            boolean booleanValue = ((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue();
            long j8 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.mo15860a() - mo15860a > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        } else if (s54Var2.f25882u) {
                            throw new IOException("Abort requested before buffering finished. ");
                        } else {
                            if (s54Var2.f25883v) {
                                break;
                            } else if (!s54Var2.f25880s.mo13734V()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            } else {
                                long mo13725e0 = s54Var2.f25880s.mo13725e0();
                                if (mo13725e0 > 0) {
                                    long mo13729a0 = s54Var2.f25880s.mo13729a0();
                                    if (mo13729a0 != j8) {
                                        try {
                                            j = intValue;
                                            j7 = mo13725e0;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = m10693y;
                                        } catch (Throwable th) {
                                            th = th;
                                            s54Var = this;
                                            str2 = str;
                                            str3 = m10693y;
                                        }
                                        try {
                                            m18852n(str, m10693y, mo13729a0, j7, mo13729a0 > 0, booleanValue ? s54Var2.f25880s.mo13751E() : -1L, booleanValue ? s54Var2.f25880s.mo13727c0() : -1L, booleanValue ? s54Var2.f25880s.mo13750F() : -1L, p24.m13732X(), p24.m13730Z());
                                            j6 = mo13729a0;
                                            j5 = mo13725e0;
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
                                                zzt.zzo().m11903t(e, "VideoStreamExoPlayerCache.preload");
                                                mo10704a();
                                                s54Var.m18856j(str2, str3, str7, m10692z(str7, e));
                                                return false;
                                            }
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j4 = longValue;
                                        str4 = m10693y;
                                        j5 = mo13725e0;
                                        j6 = j8;
                                        str2 = intValue;
                                    }
                                    s54Var = (mo13729a0 > j5 ? 1 : (mo13729a0 == j5 ? 0 : -1));
                                    if (s54Var >= 0) {
                                        m18854l(str, str4, j5);
                                        break;
                                    }
                                    try {
                                        s54 s54Var3 = this;
                                        str2 = str;
                                        str3 = str4;
                                        if (s54Var3.f25880s.mo13728b0() >= j && mo13729a0 > 0) {
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
                                    str3 = m10693y;
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
                        str3 = m10693y;
                        s54Var = s54Var2;
                    }
                }
                longValue = j3;
                s54Var2 = s54Var;
                str5 = str2;
                m10693y = str3;
                intValue = j;
                longValue2 = j2;
                j8 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = m10693y;
            s54Var = s54Var2;
        }
    }

    @Override // com.daaw.j54
    /* renamed from: u */
    public final boolean mo10696u(String str, String[] strArr, y44 y44Var) {
        this.f25881t = str;
        this.f25884w = y44Var;
        String m10693y = m10693y(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f25880s.mo13749G(uriArr, this.f14366q);
            y24 y24Var = (y24) this.f14367r.get();
            if (y24Var != null) {
                y24Var.mo4236t(m10693y, this);
            }
            this.f25885x = zzt.zzB().mo15860a();
            this.f25886y = -1L;
            m10705A(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            k04.zzj("Failed to preload url " + str + " Exception: " + message);
            zzt.zzo().m11903t(e, "VideoStreamExoPlayerCache.preload");
            mo10704a();
            m18856j(str, m10693y, "error", m10692z("error", e));
            return false;
        }
    }

    /* renamed from: v */
    public final p24 m10695v() {
        synchronized (this) {
            this.f25883v = true;
            notify();
        }
        this.f25880s.mo13743M(null);
        p24 p24Var = this.f25880s;
        this.f25880s = null;
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
    /* renamed from: x */
    public final /* synthetic */ void m10694x() {
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
        String m10693y = m10693y(this.f25881t);
        String str3 = "error";
        try {
            y83 y83Var = g93.f10852v;
            zzc = zzba.zzc();
            longValue = ((Long) zzc.m23658b(y83Var)).longValue() * 1000;
            intValue = ((Integer) zzba.zzc().m23658b(g93.f10841u)).intValue();
            s54Var = ((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = m10693y;
            s54Var = this;
        }
        synchronized (this) {
            try {
                int i = ((zzt.zzB().mo15860a() - this.f25885x) > longValue ? 1 : ((zzt.zzB().mo15860a() - this.f25885x) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (this.f25882u) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.f25883v) {
                            if (!this.f25880s.mo13734V()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long mo13725e0 = this.f25880s.mo13725e0();
                            if (mo13725e0 > 0) {
                                long mo13729a0 = this.f25880s.mo13729a0();
                                if (mo13729a0 != this.f25886y) {
                                    try {
                                        j2 = intValue;
                                        str2 = m10693y;
                                        try {
                                            m18852n(this.f25881t, m10693y, mo13729a0, mo13725e0, mo13729a0 > 0, s54Var != 0 ? this.f25880s.mo13751E() : -1L, s54Var != 0 ? this.f25880s.mo13727c0() : -1L, s54Var != 0 ? this.f25880s.mo13750F() : -1L, p24.m13732X(), p24.m13730Z());
                                            s54Var = this;
                                            j = mo13729a0;
                                            try {
                                                s54Var.f25886y = j;
                                                j3 = mo13725e0;
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
                                        str = m10693y;
                                    }
                                } else {
                                    j = mo13729a0;
                                    j2 = intValue;
                                    str2 = m10693y;
                                    s54Var = this;
                                    j3 = mo13725e0;
                                }
                                if (j >= j3) {
                                    s54Var.m18854l(s54Var.f25881t, str2, j3);
                                } else {
                                    int i2 = (s54Var.f25880s.mo13728b0() > j2 ? 1 : (s54Var.f25880s.mo13728b0() == j2 ? 0 : -1));
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
                            s54Var3.m10705A(((Long) zzba.zzc().m23658b(g93.f10863w)).longValue());
                            return;
                        }
                        s54Var2 = this;
                        zzt.zzy().m2818f(s54Var2.f25884w);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = i;
                    }
                } else {
                    str = m10693y;
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
                str = m10693y;
                s54Var = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                k04.zzj("Failed to preload url " + s54Var.f25881t + " Exception: " + e.getMessage());
                zzt.zzo().m11903t(e, "VideoStreamExoPlayerCache.preload");
                mo10704a();
                s54Var.m18856j(s54Var.f25881t, str, str4, m10692z(str4, e));
                s54Var2 = s54Var;
                zzt.zzy().m2818f(s54Var2.f25884w);
            }
        }
    }

    @Override // com.daaw.o24
    public final void zzv() {
        k04.zzj("Precache onRenderedFirstFrame");
    }
}
