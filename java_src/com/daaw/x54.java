package com.daaw;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class x54 extends sx5 {

    /* renamed from: e */
    public final Context f32103e;

    /* renamed from: f */
    public final p46 f32104f;

    /* renamed from: g */
    public final String f32105g;

    /* renamed from: h */
    public final int f32106h;

    /* renamed from: i */
    public final boolean f32107i;

    /* renamed from: j */
    public InputStream f32108j;

    /* renamed from: k */
    public boolean f32109k;

    /* renamed from: l */
    public Uri f32110l;

    /* renamed from: m */
    public volatile zzbei f32111m;

    /* renamed from: n */
    public boolean f32112n;

    /* renamed from: o */
    public boolean f32113o;

    /* renamed from: p */
    public boolean f32114p;

    /* renamed from: q */
    public boolean f32115q;

    /* renamed from: r */
    public long f32116r;

    /* renamed from: s */
    public f77 f32117s;

    /* renamed from: t */
    public final AtomicLong f32118t;

    /* renamed from: u */
    public final a64 f32119u;

    public x54(Context context, p46 p46Var, String str, int i, qz6 qz6Var, a64 a64Var, byte[] bArr) {
        super(false);
        this.f32103e = context;
        this.f32104f = p46Var;
        this.f32119u = a64Var;
        this.f32105g = str;
        this.f32106h = i;
        this.f32112n = false;
        this.f32113o = false;
        this.f32114p = false;
        this.f32115q = false;
        this.f32116r = 0L;
        this.f32118t = new AtomicLong(-1L);
        this.f32117s = null;
        this.f32107i = ((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue();
        mo1979d(qz6Var);
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (this.f32109k) {
            InputStream inputStream = this.f32108j;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f32104f.mo1980a(bArr, i, i2);
            if (!this.f32107i || this.f32108j != null) {
                m9782c(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.daaw.p46
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1978g(pa6 pa6Var) {
        zzbef zzbefVar;
        boolean z;
        boolean z2;
        long mo15859b;
        v33 v33Var;
        String str = "ms";
        if (this.f32109k) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.f32109k = true;
        this.f32110l = pa6Var.f22769a;
        if (!this.f32107i) {
            m9779m(pa6Var);
        }
        this.f32111m = zzbei.m1106h(pa6Var.f22769a);
        ?? r4 = -1;
        if (!((Boolean) zzba.zzc().m23658b(g93.f10485M3)).booleanValue()) {
            if (this.f32111m != null) {
                this.f32111m.f36840w = pa6Var.f22774f;
                this.f32111m.f36841x = hz6.m20316c(this.f32105g);
                this.f32111m.f36842y = this.f32106h;
                zzbefVar = zzt.zzc().m21054b(this.f32111m);
            } else {
                zzbefVar = null;
            }
            if (zzbefVar != null && zzbefVar.m1109u()) {
                this.f32112n = zzbefVar.m1110t();
                this.f32114p = zzbefVar.m1107w();
                this.f32115q = zzbefVar.m1108v();
                this.f32116r = zzbefVar.m1113h();
                this.f32113o = true;
                if (!m5516v()) {
                    this.f32108j = zzbefVar.m1111s();
                    if (this.f32107i) {
                        m9779m(pa6Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f32111m != null) {
            this.f32111m.f36840w = pa6Var.f22774f;
            this.f32111m.f36841x = hz6.m20316c(this.f32105g);
            this.f32111m.f36842y = this.f32106h;
            long longValue = ((Long) zzba.zzc().m23658b(this.f32111m.f36839v ? g93.f10505O3 : g93.f10495N3)).longValue();
            long mo15859b2 = zzt.zzB().mo15859b();
            zzt.zzd();
            Future m8604a = u33.m8604a(this.f32103e, this.f32111m);
            try {
                try {
                    v33Var = (v33) m8604a.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = r4;
                }
                try {
                    this.f32112n = v33Var.m7514d();
                    this.f32114p = v33Var.m7512f();
                    this.f32115q = v33Var.m7513e();
                    this.f32116r = v33Var.m7517a();
                } catch (InterruptedException unused) {
                    z2 = true;
                    m8604a.cancel(true);
                    Thread.currentThread().interrupt();
                    mo15859b = zzt.zzB().mo15859b() - mo15859b2;
                    this.f32119u.f2930a.m15493k0(z2, mo15859b);
                    this.f32113o = z2;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(mo15859b);
                    r4.append("ms");
                    str = r4.toString();
                    zze.zza(str);
                    this.f32113o = false;
                    if (this.f32111m != null) {
                    }
                    return this.f32104f.mo1978g(pa6Var);
                } catch (ExecutionException | TimeoutException unused2) {
                    z = true;
                    m8604a.cancel(true);
                    mo15859b = zzt.zzB().mo15859b() - mo15859b2;
                    this.f32119u.f2930a.m15493k0(z, mo15859b);
                    this.f32113o = z;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(mo15859b);
                    r4.append("ms");
                    str = r4.toString();
                    zze.zza(str);
                    this.f32113o = false;
                    if (this.f32111m != null) {
                    }
                    return this.f32104f.mo1978g(pa6Var);
                } catch (Throwable th2) {
                    th = th2;
                    long mo15859b3 = zzt.zzB().mo15859b() - mo15859b2;
                    this.f32119u.f2930a.m15493k0(z3, mo15859b3);
                    this.f32113o = z3;
                    zze.zza("Cache connection took " + mo15859b3 + str);
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z = false;
            } catch (Throwable th3) {
                th = th3;
                z3 = false;
            }
            if (!m5516v()) {
                this.f32108j = v33Var.m7515c();
                if (this.f32107i) {
                    m9779m(pa6Var);
                }
                long mo15859b4 = zzt.zzB().mo15859b() - mo15859b2;
                this.f32119u.f2930a.m15493k0(true, mo15859b4);
                this.f32113o = true;
                zze.zza("Cache connection took " + mo15859b4 + "ms");
                return -1L;
            }
            long mo15859b5 = zzt.zzB().mo15859b() - mo15859b2;
            this.f32119u.f2930a.m15493k0(true, mo15859b5);
            this.f32113o = true;
            str = "Cache connection took " + mo15859b5 + "ms";
            zze.zza(str);
        }
        this.f32113o = false;
        if (this.f32111m != null) {
            pa6Var = new pa6(Uri.parse(this.f32111m.f36833p), null, pa6Var.f22773e, pa6Var.f22774f, pa6Var.f22775g, null, pa6Var.f22777i);
        }
        return this.f32104f.mo1978g(pa6Var);
    }

    /* renamed from: n */
    public final long m5523n() {
        return this.f32116r;
    }

    /* renamed from: o */
    public final long m5522o() {
        if (this.f32111m == null) {
            return -1L;
        }
        if (this.f32118t.get() == -1) {
            synchronized (this) {
                if (this.f32117s == null) {
                    this.f32117s = z04.f34305a.mo20112M(new Callable() { // from class: com.daaw.w54
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return x54.this.m5521p();
                        }
                    });
                }
            }
            if (!this.f32117s.isDone()) {
                return -1L;
            }
            try {
                this.f32118t.compareAndSet(-1L, ((Long) this.f32117s.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.f32118t.get();
    }

    /* renamed from: p */
    public final /* synthetic */ Long m5521p() {
        return Long.valueOf(zzt.zzc().m21055a(this.f32111m));
    }

    /* renamed from: q */
    public final boolean m5520q() {
        return this.f32112n;
    }

    /* renamed from: r */
    public final boolean m5519r() {
        return this.f32115q;
    }

    /* renamed from: s */
    public final boolean m5518s() {
        return this.f32114p;
    }

    /* renamed from: t */
    public final boolean m5517t() {
        return this.f32113o;
    }

    /* renamed from: v */
    public final boolean m5516v() {
        if (this.f32107i) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10515P3)).booleanValue() || this.f32114p) {
                return ((Boolean) zzba.zzc().m23658b(g93.f10525Q3)).booleanValue() && !this.f32115q;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f32110l;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        if (!this.f32109k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.f32109k = false;
        this.f32110l = null;
        z = (this.f32107i && this.f32108j == null) ? true : true;
        InputStream inputStream = this.f32108j;
        if (inputStream != null) {
            xd0.m5227a(inputStream);
            this.f32108j = null;
        } else {
            this.f32104f.zzd();
        }
        if (z) {
            m9781k();
        }
    }
}
