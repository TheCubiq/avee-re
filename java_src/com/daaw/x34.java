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
public final class x34 implements kx2 {

    /* renamed from: a */
    public final zy2 f32056a;

    /* renamed from: b */
    public final Context f32057b;

    /* renamed from: c */
    public final kx2 f32058c;

    /* renamed from: d */
    public final String f32059d;

    /* renamed from: e */
    public final int f32060e;

    /* renamed from: g */
    public InputStream f32062g;

    /* renamed from: h */
    public boolean f32063h;

    /* renamed from: i */
    public Uri f32064i;

    /* renamed from: j */
    public volatile zzbei f32065j;

    /* renamed from: r */
    public final h44 f32073r;

    /* renamed from: k */
    public boolean f32066k = false;

    /* renamed from: l */
    public boolean f32067l = false;

    /* renamed from: m */
    public boolean f32068m = false;

    /* renamed from: n */
    public boolean f32069n = false;

    /* renamed from: o */
    public long f32070o = 0;

    /* renamed from: q */
    public final AtomicLong f32072q = new AtomicLong(-1);

    /* renamed from: p */
    public f77 f32071p = null;

    /* renamed from: f */
    public final boolean f32061f = ((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue();

    public x34(Context context, kx2 kx2Var, String str, int i, zy2 zy2Var, h44 h44Var, byte[] bArr) {
        this.f32057b = context;
        this.f32058c = kx2Var;
        this.f32056a = zy2Var;
        this.f32073r = h44Var;
        this.f32059d = str;
        this.f32060e = i;
    }

    @Override // com.daaw.kx2
    /* renamed from: a */
    public final int mo5585a(byte[] bArr, int i, int i2) {
        zy2 zy2Var;
        if (this.f32063h) {
            InputStream inputStream = this.f32062g;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f32058c.mo5585a(bArr, i, i2);
            if ((!this.f32061f || this.f32062g != null) && (zy2Var = this.f32056a) != null) {
                ((l44) zy2Var).m17148j0(this, read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.daaw.kx2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo5584b(mx2 mx2Var) {
        zzbef zzbefVar;
        boolean z;
        boolean z2;
        long mo15859b;
        v33 v33Var;
        String str = "ms";
        if (this.f32063h) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        boolean z3 = true;
        this.f32063h = true;
        this.f32064i = mx2Var.f19263a;
        if (!this.f32061f) {
            m5576j(mx2Var);
        }
        this.f32065j = zzbei.m1106h(mx2Var.f19263a);
        ?? r4 = -1;
        if (!((Boolean) zzba.zzc().m23658b(g93.f10485M3)).booleanValue()) {
            if (this.f32065j != null) {
                this.f32065j.f36840w = mx2Var.f19265c;
                this.f32065j.f36841x = hz6.m20316c(this.f32059d);
                this.f32065j.f36842y = this.f32060e;
                zzbefVar = zzt.zzc().m21054b(this.f32065j);
            } else {
                zzbefVar = null;
            }
            if (zzbefVar != null && zzbefVar.m1109u()) {
                this.f32066k = zzbefVar.m1110t();
                this.f32068m = zzbefVar.m1107w();
                this.f32069n = zzbefVar.m1108v();
                this.f32070o = zzbefVar.m1113h();
                this.f32067l = true;
                if (!m5575k()) {
                    this.f32062g = zzbefVar.m1111s();
                    if (this.f32061f) {
                        m5576j(mx2Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f32065j != null) {
            this.f32065j.f36840w = mx2Var.f19265c;
            this.f32065j.f36841x = hz6.m20316c(this.f32059d);
            this.f32065j.f36842y = this.f32060e;
            long longValue = ((Long) zzba.zzc().m23658b(this.f32065j.f36839v ? g93.f10505O3 : g93.f10495N3)).longValue();
            long mo15859b2 = zzt.zzB().mo15859b();
            zzt.zzd();
            Future m8604a = u33.m8604a(this.f32057b, this.f32065j);
            try {
                try {
                    v33Var = (v33) m8604a.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = r4;
                }
                try {
                    this.f32066k = v33Var.m7514d();
                    this.f32068m = v33Var.m7512f();
                    this.f32069n = v33Var.m7513e();
                    this.f32070o = v33Var.m7517a();
                } catch (InterruptedException unused) {
                    z2 = true;
                    m8604a.cancel(true);
                    Thread.currentThread().interrupt();
                    mo15859b = zzt.zzB().mo15859b() - mo15859b2;
                    this.f32073r.f12040a.m17149i0(z2, mo15859b);
                    this.f32067l = z2;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(mo15859b);
                    r4.append("ms");
                    str = r4.toString();
                    zze.zza(str);
                    this.f32067l = false;
                    if (this.f32065j != null) {
                    }
                    return this.f32058c.mo5584b(mx2Var);
                } catch (ExecutionException | TimeoutException unused2) {
                    z = true;
                    m8604a.cancel(true);
                    mo15859b = zzt.zzB().mo15859b() - mo15859b2;
                    this.f32073r.f12040a.m17149i0(z, mo15859b);
                    this.f32067l = z;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(mo15859b);
                    r4.append("ms");
                    str = r4.toString();
                    zze.zza(str);
                    this.f32067l = false;
                    if (this.f32065j != null) {
                    }
                    return this.f32058c.mo5584b(mx2Var);
                } catch (Throwable th2) {
                    th = th2;
                    long mo15859b3 = zzt.zzB().mo15859b() - mo15859b2;
                    this.f32073r.f12040a.m17149i0(z3, mo15859b3);
                    this.f32067l = z3;
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
            if (!m5575k()) {
                this.f32062g = v33Var.m7515c();
                if (this.f32061f) {
                    m5576j(mx2Var);
                }
                long mo15859b4 = zzt.zzB().mo15859b() - mo15859b2;
                this.f32073r.f12040a.m17149i0(true, mo15859b4);
                this.f32067l = true;
                zze.zza("Cache connection took " + mo15859b4 + "ms");
                return -1L;
            }
            long mo15859b5 = zzt.zzB().mo15859b() - mo15859b2;
            this.f32073r.f12040a.m17149i0(true, mo15859b5);
            this.f32067l = true;
            str = "Cache connection took " + mo15859b5 + "ms";
            zze.zza(str);
        }
        this.f32067l = false;
        if (this.f32065j != null) {
            mx2Var = new mx2(Uri.parse(this.f32065j.f36833p), null, mx2Var.f19264b, mx2Var.f19265c, mx2Var.f19266d, null, 0);
        }
        return this.f32058c.mo5584b(mx2Var);
    }

    /* renamed from: c */
    public final long m5583c() {
        return this.f32070o;
    }

    /* renamed from: d */
    public final long m5582d() {
        if (this.f32065j == null) {
            return -1L;
        }
        if (this.f32072q.get() == -1) {
            synchronized (this) {
                if (this.f32071p == null) {
                    this.f32071p = z04.f34305a.mo20112M(new Callable() { // from class: com.daaw.w34
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return x34.this.m5581e();
                        }
                    });
                }
            }
            if (!this.f32071p.isDone()) {
                return -1L;
            }
            try {
                this.f32072q.compareAndSet(-1L, ((Long) this.f32071p.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.f32072q.get();
    }

    /* renamed from: e */
    public final /* synthetic */ Long m5581e() {
        return Long.valueOf(zzt.zzc().m21055a(this.f32065j));
    }

    /* renamed from: f */
    public final boolean m5580f() {
        return this.f32066k;
    }

    /* renamed from: g */
    public final boolean m5579g() {
        return this.f32069n;
    }

    /* renamed from: h */
    public final boolean m5578h() {
        return this.f32068m;
    }

    /* renamed from: i */
    public final boolean m5577i() {
        return this.f32067l;
    }

    /* renamed from: j */
    public final void m5576j(mx2 mx2Var) {
        zy2 zy2Var = this.f32056a;
        if (zy2Var != null) {
            ((l44) zy2Var).mo1771w(this, mx2Var);
        }
    }

    /* renamed from: k */
    public final boolean m5575k() {
        if (this.f32061f) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10515P3)).booleanValue() || this.f32068m) {
                return ((Boolean) zzba.zzc().m23658b(g93.f10525Q3)).booleanValue() && !this.f32069n;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        return this.f32064i;
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        if (!this.f32063h) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f32063h = false;
        this.f32064i = null;
        InputStream inputStream = this.f32062g;
        if (inputStream == null) {
            this.f32058c.zzd();
            return;
        }
        xd0.m5227a(inputStream);
        this.f32062g = null;
    }
}
