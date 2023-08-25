package com.daaw;

import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes.dex */
public final class g52 implements j09 {

    /* renamed from: c */
    public int f10277c;

    /* renamed from: e */
    public h52 f10279e;

    /* renamed from: h */
    public long f10282h;

    /* renamed from: i */
    public j52 f10283i;

    /* renamed from: m */
    public int f10287m;

    /* renamed from: n */
    public boolean f10288n;

    /* renamed from: a */
    public final ik5 f10275a = new ik5(12);

    /* renamed from: b */
    public final f52 f10276b = new f52(null);

    /* renamed from: d */
    public m09 f10278d = new h09();

    /* renamed from: g */
    public j52[] f10281g = new j52[0];

    /* renamed from: k */
    public long f10285k = -1;

    /* renamed from: l */
    public long f10286l = -1;

    /* renamed from: j */
    public int f10284j = -1;

    /* renamed from: f */
    public long f10280f = -9223372036854775807L;

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        ((rz8) k09Var).mo5661h(this.f10275a.m19714h(), 0, 12, false);
        this.f10275a.m19716f(0);
        if (this.f10275a.m19707o() != 1179011410) {
            return false;
        }
        this.f10275a.m19715g(4);
        return this.f10275a.m19707o() == 541677121;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f10277c = 0;
        this.f10278d = m09Var;
        this.f10282h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        boolean z;
        int i;
        int i2;
        String str;
        f52 f52Var;
        long j;
        long zzf;
        long j2 = this.f10282h;
        if (j2 != -1) {
            long zzf2 = k09Var.zzf();
            if (j2 < zzf2 || j2 > 262144 + zzf2) {
                f42Var.f9093a = j2;
                z = true;
                this.f10282h = -1L;
                if (z) {
                    int i3 = this.f10277c;
                    j52 j52Var = null;
                    if (i3 == 0) {
                        if (mo3957a(k09Var)) {
                            ((rz8) k09Var).m10811l(12, false);
                            this.f10277c = 1;
                            return 0;
                        }
                        throw dl3.m24267a("AVI Header List not found", null);
                    } else if (i3 == 1) {
                        ((rz8) k09Var).mo5663e(this.f10275a.m19714h(), 0, 12, false);
                        this.f10275a.m19716f(0);
                        f52 f52Var2 = this.f10276b;
                        ik5 ik5Var = this.f10275a;
                        f52Var2.m22916a(ik5Var);
                        int i4 = f52Var2.f9113a;
                        if (i4 != 1414744396) {
                            throw dl3.m24267a("LIST expected, found: " + i4, null);
                        }
                        f52Var2.f9115c = ik5Var.m19707o();
                        f52 f52Var3 = this.f10276b;
                        int i5 = f52Var3.f9115c;
                        if (i5 == 1819436136) {
                            this.f10284j = f52Var3.f9114b;
                            this.f10277c = 2;
                            return 0;
                        }
                        throw dl3.m24267a("hdrl expected, found: " + i5, null);
                    } else if (i3 == 2) {
                        int i6 = this.f10284j - 4;
                        ik5 ik5Var2 = new ik5(i6);
                        ((rz8) k09Var).mo5663e(ik5Var2.m19714h(), 0, i6, false);
                        k52 m18045b = k52.m18045b(1819436136, ik5Var2);
                        if (m18045b.zza() != 1819436136) {
                            throw dl3.m24267a("Unexpected header list type " + m18045b.zza(), null);
                        }
                        h52 h52Var = (h52) m18045b.m18046a(h52.class);
                        if (h52Var != null) {
                            this.f10279e = h52Var;
                            this.f10280f = h52Var.f12066c * h52Var.f12064a;
                            ArrayList arrayList = new ArrayList();
                            y17 y17Var = m18045b.f15687a;
                            int size = y17Var.size();
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < size) {
                                v42 v42Var = (v42) y17Var.get(i7);
                                if (v42Var.zza() == 1819440243) {
                                    k52 k52Var = (k52) v42Var;
                                    int i9 = i8 + 1;
                                    i52 i52Var = (i52) k52Var.m18046a(i52.class);
                                    l52 l52Var = (l52) k52Var.m18046a(l52.class);
                                    if (i52Var == null) {
                                        str = "Missing Stream Header";
                                    } else if (l52Var == null) {
                                        str = "Missing Stream Format";
                                    } else {
                                        i = i9;
                                        long m19392g0 = it5.m19392g0(i52Var.f13261d, i52Var.f13259b * 1000000, i52Var.f13260c);
                                        f92 f92Var = l52Var.f17068a;
                                        b72 m22830b = f92Var.m22830b();
                                        m22830b.m26386g(i8);
                                        int i10 = i52Var.f13262e;
                                        if (i10 != 0) {
                                            m22830b.m26379l(i10);
                                        }
                                        m52 m52Var = (m52) k52Var.m18046a(m52.class);
                                        if (m52Var != null) {
                                            m22830b.m26381j(m52Var.f18459a);
                                        }
                                        int m27388b = ak3.m27388b(f92Var.f9275l);
                                        if (m27388b == 1) {
                                            i2 = m27388b;
                                        } else if (m27388b == 2) {
                                            i2 = 2;
                                        } else {
                                            j52Var = null;
                                            if (j52Var != null) {
                                                arrayList.add(j52Var);
                                            }
                                            i8 = i;
                                        }
                                        m42 mo3292n = this.f10278d.mo3292n(i8, i2);
                                        mo3292n.mo16218f(m22830b.m26366y());
                                        j52 j52Var2 = new j52(i8, i2, m19392g0, i52Var.f13261d, mo3292n);
                                        this.f10280f = m19392g0;
                                        j52Var = j52Var2;
                                        if (j52Var != null) {
                                        }
                                        i8 = i;
                                    }
                                    s95.m10493e("AviExtractor", str);
                                    i = i9;
                                    if (j52Var != null) {
                                    }
                                    i8 = i;
                                }
                                i7++;
                                j52Var = null;
                            }
                            this.f10281g = (j52[]) arrayList.toArray(new j52[0]);
                            this.f10278d.zzC();
                            this.f10277c = 3;
                            return 0;
                        }
                        throw dl3.m24267a("AviHeader not found", null);
                    } else if (i3 == 3) {
                        long j3 = this.f10285k;
                        if (j3 != -1 && k09Var.zzf() != j3) {
                            this.f10282h = j3;
                            return 0;
                        }
                        ((rz8) k09Var).mo5661h(this.f10275a.m19714h(), 0, 12, false);
                        k09Var.zzj();
                        this.f10275a.m19716f(0);
                        this.f10276b.m22916a(this.f10275a);
                        int m19707o = this.f10275a.m19707o();
                        int i11 = this.f10276b.f9113a;
                        if (i11 == 1179011410) {
                            ((rz8) k09Var).m10811l(12, false);
                            return 0;
                        } else if (i11 != 1414744396 || m19707o != 1769369453) {
                            this.f10282h = k09Var.zzf() + f52Var.f9114b + 8;
                            return 0;
                        } else {
                            long zzf3 = k09Var.zzf();
                            this.f10285k = zzf3;
                            long j4 = zzf3 + f52Var.f9114b + 8;
                            this.f10286l = j4;
                            if (!this.f10288n) {
                                h52 h52Var2 = this.f10279e;
                                Objects.requireNonNull(h52Var2);
                                if ((h52Var2.f12065b & 16) == 16) {
                                    this.f10277c = 4;
                                    this.f10282h = j4;
                                    return 0;
                                }
                                this.f10278d.mo3297i(new h42(this.f10280f, 0L));
                                this.f10288n = true;
                            }
                            this.f10282h = k09Var.zzf() + 12;
                            this.f10277c = 6;
                            return 0;
                        }
                    } else if (i3 == 4) {
                        ((rz8) k09Var).mo5663e(this.f10275a.m19714h(), 0, 8, false);
                        this.f10275a.m19716f(0);
                        int m19707o2 = this.f10275a.m19707o();
                        int m19707o3 = this.f10275a.m19707o();
                        if (m19707o2 == 829973609) {
                            this.f10277c = 5;
                            this.f10287m = m19707o3;
                        } else {
                            this.f10282h = k09Var.zzf() + m19707o3;
                        }
                        return 0;
                    } else if (i3 == 5) {
                        ik5 ik5Var3 = new ik5(this.f10287m);
                        ((rz8) k09Var).mo5663e(ik5Var3.m19714h(), 0, this.f10287m, false);
                        if (ik5Var3.m19713i() < 16) {
                            j = 0;
                        } else {
                            int m19711k = ik5Var3.m19711k();
                            ik5Var3.m19715g(8);
                            int m19707o4 = ik5Var3.m19707o();
                            long j5 = this.f10285k;
                            j = ((long) m19707o4) > j5 ? 0L : j5 + 8;
                            ik5Var3.m19716f(m19711k);
                        }
                        while (ik5Var3.m19713i() >= 16) {
                            int m19707o5 = ik5Var3.m19707o();
                            int m19707o6 = ik5Var3.m19707o();
                            long m19707o7 = ik5Var3.m19707o() + j;
                            ik5Var3.m19707o();
                            j52 m21909e = m21909e(m19707o5);
                            if (m21909e != null) {
                                if ((m19707o6 & 16) == 16) {
                                    m21909e.m18870b(m19707o7);
                                }
                                m21909e.m18868d();
                            }
                        }
                        for (j52 j52Var3 : this.f10281g) {
                            j52Var3.m18869c();
                        }
                        this.f10288n = true;
                        this.f10278d.mo3297i(new d52(this, this.f10280f));
                        this.f10277c = 6;
                        this.f10282h = this.f10285k;
                        return 0;
                    } else if (k09Var.zzf() >= this.f10286l) {
                        return -1;
                    } else {
                        j52 j52Var4 = this.f10283i;
                        if (j52Var4 != null) {
                            if (j52Var4.m18864h(k09Var)) {
                                this.f10283i = null;
                                return 0;
                            }
                            return 0;
                        }
                        if ((k09Var.zzf() & 1) == 1) {
                            ((rz8) k09Var).m10811l(1, false);
                        }
                        rz8 rz8Var = (rz8) k09Var;
                        rz8Var.mo5661h(this.f10275a.m19714h(), 0, 12, false);
                        this.f10275a.m19716f(0);
                        int m19707o8 = this.f10275a.m19707o();
                        if (m19707o8 == 1414744396) {
                            this.f10275a.m19716f(8);
                            rz8Var.m10811l(this.f10275a.m19707o() != 1769369453 ? 8 : 12, false);
                            k09Var.zzj();
                            return 0;
                        }
                        int m19707o9 = this.f10275a.m19707o();
                        if (m19707o8 == 1263424842) {
                            zzf = k09Var.zzf() + m19707o9 + 8;
                        } else {
                            rz8Var.m10811l(8, false);
                            k09Var.zzj();
                            j52 m21909e2 = m21909e(m19707o8);
                            if (m21909e2 != null) {
                                m21909e2.m18867e(m19707o9);
                                this.f10283i = m21909e2;
                                return 0;
                            }
                            zzf = k09Var.zzf() + m19707o9;
                        }
                        this.f10282h = zzf;
                        return 0;
                    }
                }
                return 1;
            }
            ((rz8) k09Var).m10811l((int) (j2 - zzf2), false);
        }
        z = false;
        this.f10282h = -1L;
        if (z) {
        }
    }

    /* renamed from: e */
    public final j52 m21909e(int i) {
        j52[] j52VarArr;
        for (j52 j52Var : this.f10281g) {
            if (j52Var.m18865g(i)) {
                return j52Var;
            }
        }
        return null;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        int i;
        this.f10282h = -1L;
        this.f10283i = null;
        for (j52 j52Var : this.f10281g) {
            j52Var.m18866f(j);
        }
        if (j != 0) {
            i = 6;
        } else if (this.f10281g.length == 0) {
            this.f10277c = 0;
            return;
        } else {
            i = 3;
        }
        this.f10277c = i;
    }
}
