package com.daaw;

import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import java.util.Objects;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class a62 implements j09 {

    /* renamed from: b */
    public m09 f2921b;

    /* renamed from: c */
    public int f2922c;

    /* renamed from: d */
    public int f2923d;

    /* renamed from: e */
    public int f2924e;

    /* renamed from: g */
    public zzadu f2926g;

    /* renamed from: h */
    public k09 f2927h;

    /* renamed from: i */
    public k62 f2928i;

    /* renamed from: j */
    public ca2 f2929j;

    /* renamed from: a */
    public final ik5 f2920a = new ik5(6);

    /* renamed from: f */
    public long f2925f = -1;

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        if (m27596b(k09Var) != 65496) {
            return false;
        }
        int m27596b = m27596b(k09Var);
        this.f2923d = m27596b;
        if (m27596b == 65504) {
            this.f2920a.m19719c(2);
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.mo5661h(this.f2920a.m19714h(), 0, 2, false);
            rz8Var.m10812k(this.f2920a.m19699w() - 2, false);
            m27596b = m27596b(k09Var);
            this.f2923d = m27596b;
        }
        if (m27596b == 65505) {
            rz8 rz8Var2 = (rz8) k09Var;
            rz8Var2.m10812k(2, false);
            this.f2920a.m19719c(6);
            rz8Var2.mo5661h(this.f2920a.m19714h(), 0, 6, false);
            if (this.f2920a.m19729A() == 1165519206 && this.f2920a.m19699w() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int m27596b(k09 k09Var) {
        this.f2920a.m19719c(2);
        ((rz8) k09Var).mo5661h(this.f2920a.m19714h(), 0, 2, false);
        return this.f2920a.m19699w();
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f2921b = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        int i;
        String m19726D;
        c62 m15502a;
        zzadu zzaduVar;
        long j;
        int i2 = this.f2922c;
        if (i2 == 0) {
            this.f2920a.m19719c(2);
            ((rz8) k09Var).mo5663e(this.f2920a.m19714h(), 0, 2, false);
            int m19699w = this.f2920a.m19699w();
            this.f2923d = m19699w;
            if (m19699w == 65498) {
                if (this.f2925f != -1) {
                    this.f2922c = 4;
                    return 0;
                }
                m27595e();
                return 0;
            } else if ((m19699w < 65488 || m19699w > 65497) && m19699w != 65281) {
                this.f2922c = 1;
                return 0;
            } else {
                return 0;
            }
        } else if (i2 == 1) {
            this.f2920a.m19719c(2);
            ((rz8) k09Var).mo5663e(this.f2920a.m19714h(), 0, 2, false);
            this.f2924e = this.f2920a.m19699w() - 2;
            this.f2922c = 2;
            return 0;
        } else if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f2928i == null || k09Var != this.f2927h) {
                    this.f2927h = k09Var;
                    this.f2928i = new k62(k09Var, this.f2925f);
                }
                ca2 ca2Var = this.f2929j;
                Objects.requireNonNull(ca2Var);
                int mo3954d = ca2Var.mo3954d(this.f2928i, f42Var);
                if (mo3954d == 1) {
                    f42Var.f9093a += this.f2925f;
                }
                return mo3954d;
            }
            long zzf = k09Var.zzf();
            long j2 = this.f2925f;
            if (zzf != j2) {
                f42Var.f9093a = j2;
                return 1;
            }
            if (k09Var.mo5661h(this.f2920a.m19714h(), 0, 1, true)) {
                k09Var.zzj();
                if (this.f2929j == null) {
                    this.f2929j = new ca2(0);
                }
                k62 k62Var = new k62(k09Var, this.f2925f);
                this.f2928i = k62Var;
                if (this.f2929j.mo3957a(k62Var)) {
                    ca2 ca2Var2 = this.f2929j;
                    long j3 = this.f2925f;
                    m09 m09Var = this.f2921b;
                    Objects.requireNonNull(m09Var);
                    ca2Var2.mo3955c(new m62(j3, m09Var));
                    zzadu zzaduVar2 = this.f2926g;
                    Objects.requireNonNull(zzaduVar2);
                    m27594g(zzaduVar2);
                    this.f2922c = 5;
                    return 0;
                }
            }
            m27595e();
            return 0;
        } else {
            if (this.f2923d == 65505) {
                ik5 ik5Var = new ik5(this.f2924e);
                ((rz8) k09Var).mo5663e(ik5Var.m19714h(), 0, this.f2924e, false);
                if (this.f2926g == null && "http://ns.adobe.com/xap/1.0/".equals(ik5Var.m19726D((char) 0)) && (m19726D = ik5Var.m19726D((char) 0)) != null) {
                    long zzd = k09Var.zzd();
                    if (zzd != -1 && (m15502a = n62.m15502a(m19726D)) != null && m15502a.f5547b.size() >= 2) {
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        boolean z = false;
                        for (int size = m15502a.f5547b.size() - 1; size >= 0; size--) {
                            b62 b62Var = (b62) m15502a.f5547b.get(size);
                            boolean equals = "video/mp4".equals(b62Var.f4357a) | z;
                            if (size == 0) {
                                zzd -= b62Var.f4360d;
                                j = 0;
                            } else {
                                j = zzd - b62Var.f4359c;
                            }
                            long j8 = zzd;
                            zzd = j;
                            if (!equals || zzd == j8) {
                                z = equals;
                            } else {
                                j7 = j8 - zzd;
                                j6 = zzd;
                                z = false;
                            }
                            if (size == 0) {
                                j5 = j8;
                            }
                            if (size == 0) {
                                j4 = zzd;
                            }
                        }
                        if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                            zzaduVar = new zzadu(j4, j5, m15502a.f5546a, j6, j7);
                            this.f2926g = zzaduVar;
                            if (zzaduVar != null) {
                                this.f2925f = zzaduVar.f36769s;
                            }
                        }
                    }
                    zzaduVar = null;
                    this.f2926g = zzaduVar;
                    if (zzaduVar != null) {
                    }
                }
                i = 0;
            } else {
                i = 0;
                ((rz8) k09Var).m10811l(this.f2924e, false);
            }
            this.f2922c = i;
            return i;
        }
    }

    /* renamed from: e */
    public final void m27595e() {
        m27594g(new zzbp[0]);
        m09 m09Var = this.f2921b;
        Objects.requireNonNull(m09Var);
        m09Var.zzC();
        this.f2921b.mo3297i(new h42(-9223372036854775807L, 0L));
        this.f2922c = 6;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        if (j == 0) {
            this.f2922c = 0;
            this.f2929j = null;
        } else if (this.f2922c == 5) {
            ca2 ca2Var = this.f2929j;
            Objects.requireNonNull(ca2Var);
            ca2Var.mo3953f(j, j2);
        }
    }

    /* renamed from: g */
    public final void m27594g(zzbp... zzbpVarArr) {
        m09 m09Var = this.f2921b;
        Objects.requireNonNull(m09Var);
        m42 mo3292n = m09Var.mo3292n(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, 4);
        b72 b72Var = new b72();
        b72Var.m26383h0("image/jpeg");
        b72Var.m26378m(new zzbq(-9223372036854775807L, zzbpVarArr));
        mo3292n.mo16218f(b72Var.m26366y());
    }
}
