package com.daaw;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class p54 extends j54 implements zy2 {
    public final String A;
    public final int B;
    public boolean C;
    public String s;
    public final x24 t;
    public boolean u;
    public final o54 v;
    public final r44 w;
    public ByteBuffer x;
    public boolean y;
    public final Object z;

    public p54(y24 y24Var, x24 x24Var) {
        super(y24Var);
        this.t = x24Var;
        this.v = new o54();
        this.w = new r44();
        this.z = new Object();
        this.A = y24Var != null ? y24Var.zzt() : "";
        this.B = y24Var != null ? y24Var.zzh() : 0;
    }

    public static final String z(String str) {
        return "cache:".concat(String.valueOf(d04.j(str)));
    }

    public final void A() {
        int a = (int) this.v.a();
        int a2 = (int) this.w.a(this.x);
        int position = this.x.position();
        int round = Math.round(a2 * (position / a));
        boolean z = round > 0;
        int X = p24.X();
        int Z = p24.Z();
        String str = this.s;
        m(str, z(str), position, a, round, a2, z, X, Z);
    }

    @Override // com.daaw.j54
    public final void h() {
        this.u = true;
    }

    @Override // com.daaw.zy2
    public final /* bridge */ /* synthetic */ void i(Object obj, int i) {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:? -> B:44:0x0140). Please submit an issue!!! */
    @Override // com.daaw.j54
    public final boolean s(String str) {
        String str2;
        this.s = str;
        String z = z(str);
        String str3 = "error";
        try {
            String str4 = this.q;
            x24 x24Var = this.t;
            kx2 ox2Var = new ox2(str4, null, this, x24Var.d, x24Var.f, true, null);
            if (this.t.j) {
                ox2Var = new x34(this.p, ox2Var, this.A, this.B, null, null, null);
            }
            ox2Var.b(new mx2(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            y24 y24Var = (y24) this.r.get();
            if (y24Var != null) {
                y24Var.t(z, this);
            }
            ag zzB = zzt.zzB();
            long a = zzB.a();
            long longValue = ((Long) zzba.zzc().b(g93.w)).longValue();
            long longValue2 = ((Long) zzba.zzc().b(g93.v)).longValue();
            this.x = ByteBuffer.allocate(this.t.c);
            int i = 8192;
            byte[] bArr = new byte[8192];
            long j = a;
            while (true) {
                int a2 = ox2Var.a(bArr, 0, Math.min(this.x.remaining(), i));
                kx2 kx2Var = ox2Var;
                if (a2 == -1) {
                    this.C = true;
                    l(str, z, (int) this.w.a(this.x));
                    return true;
                }
                synchronized (this.z) {
                    try {
                        if (this.u) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            str3 = null;
                            try {
                                this.x.put(bArr, 0, a2);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.x.remaining() <= 0) {
                                A();
                                return true;
                            }
                            try {
                                if (this.u) {
                                    throw new IOException("Precache abort at " + this.x.limit() + " bytes");
                                }
                                long a3 = zzB.a();
                                if (a3 - j >= longValue) {
                                    A();
                                    j = a3;
                                }
                                if (a3 - a > 1000 * longValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                }
                                ox2Var = kx2Var;
                                str3 = str2;
                                i = 8192;
                            } catch (Exception e) {
                                e = e;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                k04.zzj("Failed to preload url " + str + " Exception: " + str5);
                                j(str, z, str3, str5);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            k04.zzj("Failed to preload url " + str + " Exception: " + str52);
                            j(str, z, str3, str52);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str3;
        }
    }

    public final String v() {
        return this.s;
    }

    @Override // com.daaw.zy2
    public final /* bridge */ /* synthetic */ void w(Object obj, mx2 mx2Var) {
        this.v.b((ox2) obj);
    }

    public final ByteBuffer x() {
        synchronized (this.z) {
            ByteBuffer byteBuffer = this.x;
            if (byteBuffer != null && !this.y) {
                byteBuffer.flip();
                this.y = true;
            }
            this.u = true;
        }
        return this.x;
    }

    public final boolean y() {
        return this.C;
    }
}
