package com.daaw;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class p54 extends j54 implements zy2 {

    /* renamed from: A */
    public final String f22622A;

    /* renamed from: B */
    public final int f22623B;

    /* renamed from: C */
    public boolean f22624C;

    /* renamed from: s */
    public String f22625s;

    /* renamed from: t */
    public final x24 f22626t;

    /* renamed from: u */
    public boolean f22627u;

    /* renamed from: v */
    public final o54 f22628v;

    /* renamed from: w */
    public final r44 f22629w;

    /* renamed from: x */
    public ByteBuffer f22630x;

    /* renamed from: y */
    public boolean f22631y;

    /* renamed from: z */
    public final Object f22632z;

    public p54(y24 y24Var, x24 x24Var) {
        super(y24Var);
        this.f22626t = x24Var;
        this.f22628v = new o54();
        this.f22629w = new r44();
        this.f22632z = new Object();
        this.f22622A = y24Var != null ? y24Var.zzt() : "";
        this.f22623B = y24Var != null ? y24Var.zzh() : 0;
    }

    /* renamed from: z */
    public static final String m13622z(String str) {
        return "cache:".concat(String.valueOf(d04.m24822j(str)));
    }

    /* renamed from: A */
    public final void m13626A() {
        int m14553a = (int) this.f22628v.m14553a();
        int m11755a = (int) this.f22629w.m11755a(this.f22630x);
        int position = this.f22630x.position();
        int round = Math.round(m11755a * (position / m14553a));
        boolean z = round > 0;
        int m13732X = p24.m13732X();
        int m13730Z = p24.m13730Z();
        String str = this.f22625s;
        m18853m(str, m13622z(str), position, m14553a, round, m11755a, z, m13732X, m13730Z);
    }

    @Override // com.daaw.j54
    /* renamed from: h */
    public final void mo10703h() {
        this.f22627u = true;
    }

    @Override // com.daaw.zy2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo1772i(Object obj, int i) {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:? -> B:44:0x0140). Please submit an issue!!! */
    @Override // com.daaw.j54
    /* renamed from: s */
    public final boolean mo10698s(String str) {
        String str2;
        this.f22625s = str;
        String m13622z = m13622z(str);
        String str3 = "error";
        try {
            String str4 = this.f14366q;
            x24 x24Var = this.f22626t;
            kx2 ox2Var = new ox2(str4, null, this, x24Var.f32025d, x24Var.f32027f, true, null);
            if (this.f22626t.f32031j) {
                ox2Var = new x34(this.f14365p, ox2Var, this.f22622A, this.f22623B, null, null, null);
            }
            ox2Var.mo5584b(new mx2(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            y24 y24Var = (y24) this.f14367r.get();
            if (y24Var != null) {
                y24Var.mo4236t(m13622z, this);
            }
            InterfaceC0623ag zzB = zzt.zzB();
            long mo15860a = zzB.mo15860a();
            long longValue = ((Long) zzba.zzc().m23658b(g93.f10863w)).longValue();
            long longValue2 = ((Long) zzba.zzc().m23658b(g93.f10852v)).longValue();
            this.f22630x = ByteBuffer.allocate(this.f22626t.f32024c);
            int i = 8192;
            byte[] bArr = new byte[8192];
            long j = mo15860a;
            while (true) {
                int mo5585a = ox2Var.mo5585a(bArr, 0, Math.min(this.f22630x.remaining(), i));
                kx2 kx2Var = ox2Var;
                if (mo5585a == -1) {
                    this.f22624C = true;
                    m18854l(str, m13622z, (int) this.f22629w.m11755a(this.f22630x));
                    return true;
                }
                synchronized (this.f22632z) {
                    try {
                        if (this.f22627u) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            str3 = null;
                            try {
                                this.f22630x.put(bArr, 0, mo5585a);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.f22630x.remaining() <= 0) {
                                m13626A();
                                return true;
                            }
                            try {
                                if (this.f22627u) {
                                    throw new IOException("Precache abort at " + this.f22630x.limit() + " bytes");
                                }
                                long mo15860a2 = zzB.mo15860a();
                                if (mo15860a2 - j >= longValue) {
                                    m13626A();
                                    j = mo15860a2;
                                }
                                if (mo15860a2 - mo15860a > 1000 * longValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                }
                                ox2Var = kx2Var;
                                str3 = str2;
                                i = 8192;
                            } catch (Exception e) {
                                e = e;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                k04.zzj("Failed to preload url " + str + " Exception: " + str5);
                                m18856j(str, m13622z, str3, str5);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            k04.zzj("Failed to preload url " + str + " Exception: " + str52);
                            m18856j(str, m13622z, str3, str52);
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

    /* renamed from: v */
    public final String m13625v() {
        return this.f22625s;
    }

    @Override // com.daaw.zy2
    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo1771w(Object obj, mx2 mx2Var) {
        this.f22628v.m14552b((ox2) obj);
    }

    /* renamed from: x */
    public final ByteBuffer m13624x() {
        synchronized (this.f22632z) {
            ByteBuffer byteBuffer = this.f22630x;
            if (byteBuffer != null && !this.f22631y) {
                byteBuffer.flip();
                this.f22631y = true;
            }
            this.f22627u = true;
        }
        return this.f22630x;
    }

    /* renamed from: y */
    public final boolean m13623y() {
        return this.f22624C;
    }
}
