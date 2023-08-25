package com.daaw;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadm;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import java.io.EOFException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class v82 implements j09 {

    /* renamed from: q */
    public static final q09 f30007q = new q09() { // from class: com.daaw.t82
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = v82.f30007q;
            return new j09[]{new v82(0)};
        }
    };

    /* renamed from: r */
    public static final i72 f30008r = new i72() { // from class: com.daaw.u82
    };

    /* renamed from: a */
    public final ik5 f30009a;

    /* renamed from: b */
    public final y32 f30010b;

    /* renamed from: c */
    public final y09 f30011c;

    /* renamed from: d */
    public final w32 f30012d;

    /* renamed from: e */
    public final m42 f30013e;

    /* renamed from: f */
    public m09 f30014f;

    /* renamed from: g */
    public m42 f30015g;

    /* renamed from: h */
    public m42 f30016h;

    /* renamed from: i */
    public int f30017i;

    /* renamed from: j */
    public zzbq f30018j;

    /* renamed from: k */
    public long f30019k;

    /* renamed from: l */
    public long f30020l;

    /* renamed from: m */
    public long f30021m;

    /* renamed from: n */
    public int f30022n;

    /* renamed from: o */
    public x82 f30023o;

    /* renamed from: p */
    public boolean f30024p;

    public v82() {
        this(0);
    }

    public v82(int i) {
        this.f30009a = new ik5(10);
        this.f30010b = new y32();
        this.f30011c = new y09();
        this.f30019k = -9223372036854775807L;
        this.f30012d = new w32();
        i09 i09Var = new i09();
        this.f30013e = i09Var;
        this.f30016h = i09Var;
    }

    /* renamed from: i */
    public static boolean m7340i(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        return m7338k(k09Var, true);
    }

    /* renamed from: b */
    public final void m7344b() {
        this.f30024p = true;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f30014f = m09Var;
        m42 mo3292n = m09Var.mo3292n(0, 1);
        this.f30015g = mo3292n;
        this.f30016h = mo3292n;
        this.f30014f.zzC();
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        uo4.m7876b(this.f30015g);
        int i = it5.f13991a;
        int m7343e = m7343e(k09Var);
        if (m7343e == -1 && (this.f30023o instanceof r82)) {
            if (this.f30023o.zze() != m7342g(this.f30020l)) {
                r82 r82Var = (r82) this.f30023o;
                throw null;
            }
        }
        return m7343e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7343e(k09 k09Var) {
        y32 y32Var;
        int i;
        int i2;
        z82 m2632a;
        x82 m7341h;
        int i3;
        int i4;
        zzbq zzbqVar;
        s82 s82Var;
        long j;
        if (this.f30017i == 0) {
            try {
                m7338k(k09Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f30023o == null) {
            ik5 ik5Var = new ik5(this.f30010b.f33313c);
            ((rz8) k09Var).mo5661h(ik5Var.m19714h(), 0, this.f30010b.f33313c, false);
            y32 y32Var2 = this.f30010b;
            int i5 = y32Var2.f33311a & 1;
            int i6 = y32Var2.f33315e;
            if (i5 != 0) {
                if (i6 != 1) {
                    i = 36;
                    if (ik5Var.m19710l() >= i + 4) {
                        ik5Var.m19716f(i);
                        int m19709m = ik5Var.m19709m();
                        if (m19709m == 1483304551) {
                            i2 = m19709m;
                        } else if (m19709m == 1231971951) {
                            i2 = 1231971951;
                        }
                        if (i2 != 1483304551 || i2 == 1231971951) {
                            int i7 = i2;
                            m2632a = z82.m2632a(k09Var.zzd(), k09Var.zzf(), this.f30010b, ik5Var);
                            if (m2632a != null && !this.f30011c.m4275a()) {
                                k09Var.zzj();
                                rz8 rz8Var = (rz8) k09Var;
                                rz8Var.m10812k(i + 141, false);
                                rz8Var.mo5661h(this.f30009a.m19714h(), 0, 3, false);
                                this.f30009a.m19716f(0);
                                y09 y09Var = this.f30011c;
                                int m19701u = this.f30009a.m19701u();
                                i3 = m19701u >> 12;
                                i4 = m19701u & 4095;
                                if (i3 <= 0 || i4 > 0) {
                                    y09Var.f33208a = i3;
                                    y09Var.f33209b = i4;
                                }
                            }
                            ((rz8) k09Var).m10811l(this.f30010b.f33313c, false);
                            m7341h = (m2632a == null && !m2632a.zzh() && i7 == 1231971951) ? m7341h(k09Var, false) : m2632a;
                        } else if (i2 == 1447187017) {
                            m7341h = y82.m4016a(k09Var.zzd(), k09Var.zzf(), this.f30010b, ik5Var);
                            ((rz8) k09Var).m10811l(this.f30010b.f33313c, false);
                        } else {
                            k09Var.zzj();
                            m7341h = null;
                        }
                        zzbqVar = this.f30018j;
                        long zzf = k09Var.zzf();
                        if (zzbqVar != null) {
                            int m1103a = zzbqVar.m1103a();
                            for (int i8 = 0; i8 < m1103a; i8++) {
                                zzbp m1102b = zzbqVar.m1102b(i8);
                                if (m1102b instanceof zzadi) {
                                    zzadi zzadiVar = (zzadi) m1102b;
                                    int m1103a2 = zzbqVar.m1103a();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= m1103a2) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        zzbp m1102b2 = zzbqVar.m1102b(i9);
                                        if (m1102b2 instanceof zzadm) {
                                            zzadm zzadmVar = (zzadm) m1102b2;
                                            if (zzadmVar.f36747p.equals("TLEN")) {
                                                j = it5.m19394f0(Long.parseLong(zzadmVar.f36759r));
                                                break;
                                            }
                                        }
                                        i9++;
                                    }
                                    s82Var = s82.m10528a(zzf, zzadiVar, j);
                                    if (this.f30024p) {
                                        m7341h = new w82();
                                    } else {
                                        if (s82Var != null) {
                                            m7341h = s82Var;
                                        } else if (m7341h == null) {
                                            m7341h = null;
                                        }
                                        if (m7341h != null) {
                                            m7341h.zzh();
                                        } else {
                                            m7341h = m7341h(k09Var, false);
                                        }
                                    }
                                    this.f30023o = m7341h;
                                    this.f30014f.mo3297i(m7341h);
                                    m42 m42Var = this.f30016h;
                                    b72 b72Var = new b72();
                                    b72Var.m26372s(this.f30010b.f33312b);
                                    b72Var.m26379l(4096);
                                    b72Var.m26389e0(this.f30010b.f33315e);
                                    b72Var.m26371t(this.f30010b.f33314d);
                                    b72Var.m26394c(this.f30011c.f33208a);
                                    b72Var.m26392d(this.f30011c.f33209b);
                                    b72Var.m26378m(this.f30018j);
                                    m42Var.mo16218f(b72Var.m26366y());
                                    this.f30021m = k09Var.zzf();
                                }
                            }
                        }
                        s82Var = null;
                        if (this.f30024p) {
                        }
                        this.f30023o = m7341h;
                        this.f30014f.mo3297i(m7341h);
                        m42 m42Var2 = this.f30016h;
                        b72 b72Var2 = new b72();
                        b72Var2.m26372s(this.f30010b.f33312b);
                        b72Var2.m26379l(4096);
                        b72Var2.m26389e0(this.f30010b.f33315e);
                        b72Var2.m26371t(this.f30010b.f33314d);
                        b72Var2.m26394c(this.f30011c.f33208a);
                        b72Var2.m26392d(this.f30011c.f33209b);
                        b72Var2.m26378m(this.f30018j);
                        m42Var2.mo16218f(b72Var2.m26366y());
                        this.f30021m = k09Var.zzf();
                    }
                    if (ik5Var.m19710l() >= 40) {
                        ik5Var.m19716f(36);
                        if (ik5Var.m19709m() == 1447187017) {
                            i2 = 1447187017;
                            if (i2 != 1483304551) {
                            }
                            int i72 = i2;
                            m2632a = z82.m2632a(k09Var.zzd(), k09Var.zzf(), this.f30010b, ik5Var);
                            if (m2632a != null) {
                                k09Var.zzj();
                                rz8 rz8Var2 = (rz8) k09Var;
                                rz8Var2.m10812k(i + 141, false);
                                rz8Var2.mo5661h(this.f30009a.m19714h(), 0, 3, false);
                                this.f30009a.m19716f(0);
                                y09 y09Var2 = this.f30011c;
                                int m19701u2 = this.f30009a.m19701u();
                                i3 = m19701u2 >> 12;
                                i4 = m19701u2 & 4095;
                                if (i3 <= 0) {
                                }
                                y09Var2.f33208a = i3;
                                y09Var2.f33209b = i4;
                            }
                            ((rz8) k09Var).m10811l(this.f30010b.f33313c, false);
                            if (m2632a == null) {
                            }
                            zzbqVar = this.f30018j;
                            long zzf2 = k09Var.zzf();
                            if (zzbqVar != null) {
                            }
                            s82Var = null;
                            if (this.f30024p) {
                            }
                            this.f30023o = m7341h;
                            this.f30014f.mo3297i(m7341h);
                            m42 m42Var22 = this.f30016h;
                            b72 b72Var22 = new b72();
                            b72Var22.m26372s(this.f30010b.f33312b);
                            b72Var22.m26379l(4096);
                            b72Var22.m26389e0(this.f30010b.f33315e);
                            b72Var22.m26371t(this.f30010b.f33314d);
                            b72Var22.m26394c(this.f30011c.f33208a);
                            b72Var22.m26392d(this.f30011c.f33209b);
                            b72Var22.m26378m(this.f30018j);
                            m42Var22.mo16218f(b72Var22.m26366y());
                            this.f30021m = k09Var.zzf();
                        }
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i722 = i2;
                    m2632a = z82.m2632a(k09Var.zzd(), k09Var.zzf(), this.f30010b, ik5Var);
                    if (m2632a != null) {
                    }
                    ((rz8) k09Var).m10811l(this.f30010b.f33313c, false);
                    if (m2632a == null) {
                    }
                    zzbqVar = this.f30018j;
                    long zzf22 = k09Var.zzf();
                    if (zzbqVar != null) {
                    }
                    s82Var = null;
                    if (this.f30024p) {
                    }
                    this.f30023o = m7341h;
                    this.f30014f.mo3297i(m7341h);
                    m42 m42Var222 = this.f30016h;
                    b72 b72Var222 = new b72();
                    b72Var222.m26372s(this.f30010b.f33312b);
                    b72Var222.m26379l(4096);
                    b72Var222.m26389e0(this.f30010b.f33315e);
                    b72Var222.m26371t(this.f30010b.f33314d);
                    b72Var222.m26394c(this.f30011c.f33208a);
                    b72Var222.m26392d(this.f30011c.f33209b);
                    b72Var222.m26378m(this.f30018j);
                    m42Var222.mo16218f(b72Var222.m26366y());
                    this.f30021m = k09Var.zzf();
                }
                i = 21;
                if (ik5Var.m19710l() >= i + 4) {
                }
                if (ik5Var.m19710l() >= 40) {
                }
                i2 = 0;
                if (i2 != 1483304551) {
                }
                int i7222 = i2;
                m2632a = z82.m2632a(k09Var.zzd(), k09Var.zzf(), this.f30010b, ik5Var);
                if (m2632a != null) {
                }
                ((rz8) k09Var).m10811l(this.f30010b.f33313c, false);
                if (m2632a == null) {
                }
                zzbqVar = this.f30018j;
                long zzf222 = k09Var.zzf();
                if (zzbqVar != null) {
                }
                s82Var = null;
                if (this.f30024p) {
                }
                this.f30023o = m7341h;
                this.f30014f.mo3297i(m7341h);
                m42 m42Var2222 = this.f30016h;
                b72 b72Var2222 = new b72();
                b72Var2222.m26372s(this.f30010b.f33312b);
                b72Var2222.m26379l(4096);
                b72Var2222.m26389e0(this.f30010b.f33315e);
                b72Var2222.m26371t(this.f30010b.f33314d);
                b72Var2222.m26394c(this.f30011c.f33208a);
                b72Var2222.m26392d(this.f30011c.f33209b);
                b72Var2222.m26378m(this.f30018j);
                m42Var2222.mo16218f(b72Var2222.m26366y());
                this.f30021m = k09Var.zzf();
            } else {
                if (i6 == 1) {
                    i = 13;
                    if (ik5Var.m19710l() >= i + 4) {
                    }
                    if (ik5Var.m19710l() >= 40) {
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i72222 = i2;
                    m2632a = z82.m2632a(k09Var.zzd(), k09Var.zzf(), this.f30010b, ik5Var);
                    if (m2632a != null) {
                    }
                    ((rz8) k09Var).m10811l(this.f30010b.f33313c, false);
                    if (m2632a == null) {
                    }
                    zzbqVar = this.f30018j;
                    long zzf2222 = k09Var.zzf();
                    if (zzbqVar != null) {
                    }
                    s82Var = null;
                    if (this.f30024p) {
                    }
                    this.f30023o = m7341h;
                    this.f30014f.mo3297i(m7341h);
                    m42 m42Var22222 = this.f30016h;
                    b72 b72Var22222 = new b72();
                    b72Var22222.m26372s(this.f30010b.f33312b);
                    b72Var22222.m26379l(4096);
                    b72Var22222.m26389e0(this.f30010b.f33315e);
                    b72Var22222.m26371t(this.f30010b.f33314d);
                    b72Var22222.m26394c(this.f30011c.f33208a);
                    b72Var22222.m26392d(this.f30011c.f33209b);
                    b72Var22222.m26378m(this.f30018j);
                    m42Var22222.mo16218f(b72Var22222.m26366y());
                    this.f30021m = k09Var.zzf();
                }
                i = 21;
                if (ik5Var.m19710l() >= i + 4) {
                }
                if (ik5Var.m19710l() >= 40) {
                }
                i2 = 0;
                if (i2 != 1483304551) {
                }
                int i722222 = i2;
                m2632a = z82.m2632a(k09Var.zzd(), k09Var.zzf(), this.f30010b, ik5Var);
                if (m2632a != null) {
                }
                ((rz8) k09Var).m10811l(this.f30010b.f33313c, false);
                if (m2632a == null) {
                }
                zzbqVar = this.f30018j;
                long zzf22222 = k09Var.zzf();
                if (zzbqVar != null) {
                }
                s82Var = null;
                if (this.f30024p) {
                }
                this.f30023o = m7341h;
                this.f30014f.mo3297i(m7341h);
                m42 m42Var222222 = this.f30016h;
                b72 b72Var222222 = new b72();
                b72Var222222.m26372s(this.f30010b.f33312b);
                b72Var222222.m26379l(4096);
                b72Var222222.m26389e0(this.f30010b.f33315e);
                b72Var222222.m26371t(this.f30010b.f33314d);
                b72Var222222.m26394c(this.f30011c.f33208a);
                b72Var222222.m26392d(this.f30011c.f33209b);
                b72Var222222.m26378m(this.f30018j);
                m42Var222222.mo16218f(b72Var222222.m26366y());
                this.f30021m = k09Var.zzf();
            }
        } else {
            long j2 = this.f30021m;
            if (j2 != 0) {
                long zzf3 = k09Var.zzf();
                if (zzf3 < j2) {
                    ((rz8) k09Var).m10811l((int) (j2 - zzf3), false);
                }
            }
        }
        int i10 = this.f30022n;
        if (i10 == 0) {
            k09Var.zzj();
            if (m7339j(k09Var)) {
                return -1;
            }
            this.f30009a.m19716f(0);
            int m19709m2 = this.f30009a.m19709m();
            if (!m7340i(m19709m2, this.f30017i) || z32.m2863b(m19709m2) == -1) {
                ((rz8) k09Var).m10811l(1, false);
                this.f30017i = 0;
                return 0;
            }
            this.f30010b.m4159a(m19709m2);
            if (this.f30019k == -9223372036854775807L) {
                this.f30019k = this.f30023o.mo2629e(k09Var.zzf());
            }
            int i11 = this.f30010b.f33313c;
            this.f30022n = i11;
            x82 x82Var = this.f30023o;
            if (x82Var instanceof r82) {
                r82 r82Var = (r82) x82Var;
                m7342g(this.f30020l + y32Var.f33317g);
                throw null;
            }
            i10 = i11;
        }
        int mo16219e = this.f30016h.mo16219e(k09Var, i10, true);
        if (mo16219e == -1) {
            return -1;
        }
        int i12 = this.f30022n - mo16219e;
        this.f30022n = i12;
        if (i12 <= 0) {
            this.f30016h.mo16222b(m7342g(this.f30020l), 1, this.f30010b.f33313c, 0, null);
            this.f30020l += this.f30010b.f33317g;
            this.f30022n = 0;
            return 0;
        }
        return 0;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        this.f30017i = 0;
        this.f30019k = -9223372036854775807L;
        this.f30020l = 0L;
        this.f30022n = 0;
        x82 x82Var = this.f30023o;
        if (x82Var instanceof r82) {
            r82 r82Var = (r82) x82Var;
            throw null;
        }
    }

    /* renamed from: g */
    public final long m7342g(long j) {
        return this.f30019k + ((j * 1000000) / this.f30010b.f33314d);
    }

    /* renamed from: h */
    public final x82 m7341h(k09 k09Var, boolean z) {
        ((rz8) k09Var).mo5661h(this.f30009a.m19714h(), 0, 4, false);
        this.f30009a.m19716f(0);
        this.f30010b.m4159a(this.f30009a.m19709m());
        return new q82(k09Var.zzd(), k09Var.zzf(), this.f30010b, false);
    }

    /* renamed from: j */
    public final boolean m7339j(k09 k09Var) {
        x82 x82Var = this.f30023o;
        if (x82Var != null) {
            long zzb = x82Var.zzb();
            if (zzb != -1 && k09Var.zze() > zzb - 4) {
                return true;
            }
        }
        try {
            return !k09Var.mo5661h(this.f30009a.m19714h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    public final boolean m7338k(k09 k09Var, boolean z) {
        int i;
        int i2;
        int m2863b;
        int i3 = true != z ? 131072 : 32768;
        k09Var.zzj();
        if (k09Var.zzf() == 0) {
            zzbq m6546a = this.f30012d.m6546a(k09Var, null);
            this.f30018j = m6546a;
            if (m6546a != null) {
                this.f30011c.m4274b(m6546a);
            }
            i2 = (int) k09Var.zze();
            if (!z) {
                ((rz8) k09Var).m10811l(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m7339j(k09Var)) {
                this.f30009a.m19716f(0);
                int m19709m = this.f30009a.m19709m();
                if ((i == 0 || m7340i(m19709m, i)) && (m2863b = z32.m2863b(m19709m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f30010b.m4159a(m19709m);
                        i = m19709m;
                    }
                    ((rz8) k09Var).m10812k(m2863b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw dl3.m24267a("Searched too many bytes.", null);
                    }
                    if (z) {
                        k09Var.zzj();
                        ((rz8) k09Var).m10812k(i2 + i6, false);
                    } else {
                        ((rz8) k09Var).m10811l(1, false);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((rz8) k09Var).m10811l(i2 + i5, false);
        } else {
            k09Var.zzj();
        }
        this.f30017i = i;
        return true;
    }
}
