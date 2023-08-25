package com.daaw;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class j38 {
    @Nullable

    /* renamed from: h */
    public static volatile u28 f14221h;

    /* renamed from: l */
    public static final /* synthetic */ int f14225l = 0;

    /* renamed from: a */
    public final r28 f14226a;

    /* renamed from: b */
    public final String f14227b;

    /* renamed from: c */
    public final Object f14228c;

    /* renamed from: d */
    public volatile int f14229d = -1;

    /* renamed from: e */
    public volatile Object f14230e;

    /* renamed from: f */
    public final boolean f14231f;

    /* renamed from: g */
    public static final Object f14220g = new Object();

    /* renamed from: i */
    public static final AtomicReference f14222i = new AtomicReference();

    /* renamed from: j */
    public static final p38 f14223j = new p38(new Object() { // from class: com.daaw.c28
    }, null);

    /* renamed from: k */
    public static final AtomicInteger f14224k = new AtomicInteger();

    public /* synthetic */ j38(r28 r28Var, String str, Object obj, boolean z, g38 g38Var) {
        if (r28Var.f24790b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f14226a = r28Var;
        this.f14227b = str;
        this.f14228c = obj;
        this.f14231f = true;
    }

    /* renamed from: d */
    public static void m19093d() {
        f14224k.incrementAndGet();
    }

    /* renamed from: e */
    public static void m19092e(final Context context) {
        if (f14221h == null) {
            Object obj = f14220g;
            synchronized (obj) {
                if (f14221h == null) {
                    synchronized (obj) {
                        u28 u28Var = f14221h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (u28Var == null || u28Var.mo1819a() != context) {
                            h08.m21113d();
                            m38.m16236b();
                            k18.m18074d();
                            f14221h = new zw7(context, q48.m12772a(new e48() { // from class: com.daaw.z18
                                @Override // com.daaw.e48
                                public final Object zza() {
                                    Context context2 = context;
                                    int i = j38.f14225l;
                                    return n18.m15585a(context2);
                                }
                            }));
                            f14224k.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo14601a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0029, B:16:0x0037, B:20:0x0060, B:22:0x006a, B:38:0x009b, B:40:0x00ab, B:42:0x00bf, B:43:0x00c2, B:44:0x00c6, B:26:0x0073, B:28:0x0079, B:32:0x008b, B:34:0x0091, B:37:0x0099, B:31:0x0089, B:18:0x0050, B:45:0x00cb, B:46:0x00d0, B:47:0x00d1), top: B:54:0x0016 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19095b() {
        b18 m16237a;
        Object zzb;
        if (!this.f14231f) {
            Objects.requireNonNull(this.f14227b, "flagName must not be null");
        }
        int i = f14224k.get();
        if (this.f14229d < i) {
            synchronized (this) {
                if (this.f14229d < i) {
                    u28 u28Var = f14221h;
                    if (u28Var == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    r28 r28Var = this.f14226a;
                    boolean z = r28Var.f24794f;
                    if (r28Var.f24790b == null) {
                        Context mo1819a = u28Var.mo1819a();
                        String str = this.f14226a.f24789a;
                        m16237a = m38.m16237a(mo1819a, null, new Runnable() { // from class: com.daaw.w18
                            @Override // java.lang.Runnable
                            public final void run() {
                                j38.m19093d();
                            }
                        });
                    } else if (q18.m12802a(u28Var.mo1819a(), this.f14226a.f24790b)) {
                        boolean z2 = this.f14226a.f24796h;
                        m16237a = h08.m21116a(u28Var.mo1819a().getContentResolver(), this.f14226a.f24790b, new Runnable() { // from class: com.daaw.w18
                            @Override // java.lang.Runnable
                            public final void run() {
                                j38.m19093d();
                            }
                        });
                    } else {
                        m16237a = null;
                    }
                    Object mo14601a = (m16237a == null || (zzb = m16237a.zzb(m19094c())) == null) ? null : mo14601a(zzb);
                    if (mo14601a == null) {
                        if (!this.f14226a.f24793e) {
                            String zzb2 = k18.m18077a(u28Var.mo1819a()).zzb(this.f14226a.f24793e ? null : this.f14227b);
                            if (zzb2 != null) {
                                mo14601a = mo14601a(zzb2);
                                if (mo14601a == null) {
                                    mo14601a = this.f14228c;
                                }
                            }
                        }
                        mo14601a = null;
                        if (mo14601a == null) {
                        }
                    }
                    y38 y38Var = (y38) u28Var.mo1818b().zza();
                    if (y38Var.mo4138b()) {
                        r28 r28Var2 = this.f14226a;
                        String m10800a = ((s08) y38Var.mo4139a()).m10800a(r28Var2.f24790b, null, r28Var2.f24792d, this.f14227b);
                        mo14601a = m10800a == null ? this.f14228c : mo14601a(m10800a);
                    }
                    this.f14230e = mo14601a;
                    this.f14229d = i;
                }
            }
        }
        return this.f14230e;
    }

    /* renamed from: c */
    public final String m19094c() {
        String str = this.f14226a.f24792d;
        return this.f14227b;
    }
}
