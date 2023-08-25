package com.daaw;

import android.net.Uri;
import android.util.Pair;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class be2 implements j09 {

    /* renamed from: h */
    public static final q09 f4754h = new q09() { // from class: com.daaw.xd2
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = be2.f4754h;
            return new j09[]{new be2()};
        }
    };

    /* renamed from: a */
    public m09 f4755a;

    /* renamed from: b */
    public m42 f4756b;

    /* renamed from: e */
    public zd2 f4759e;

    /* renamed from: c */
    public int f4757c = 0;

    /* renamed from: d */
    public long f4758d = -1;

    /* renamed from: f */
    public int f4760f = -1;

    /* renamed from: g */
    public long f4761g = -1;

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        return ie2.m19883c(k09Var);
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f4755a = m09Var;
        this.f4756b = m09Var.mo3292n(0, 1);
        m09Var.zzC();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
        if (r1 != 65534) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        int m19408X;
        zd2 ae2Var;
        uo4.m7876b(this.f4756b);
        int i = it5.f13991a;
        int i2 = this.f4757c;
        if (i2 == 0) {
            uo4.m7872f(k09Var.zzf() == 0);
            int i3 = this.f4760f;
            if (i3 != -1) {
                ((rz8) k09Var).m10811l(i3, false);
                this.f4757c = 4;
            } else if (!ie2.m19883c(k09Var)) {
                throw dl3.m24267a("Unsupported or unrecognized wav file type.", null);
            } else {
                ((rz8) k09Var).m10811l((int) (k09Var.zze() - k09Var.zzf()), false);
                this.f4757c = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            ik5 ik5Var = new ik5(8);
            de2 m24444a = de2.m24444a(k09Var, ik5Var);
            if (m24444a.f6991a != 1685272116) {
                k09Var.zzj();
            } else {
                rz8 rz8Var = (rz8) k09Var;
                rz8Var.m10812k(8, false);
                ik5Var.m19716f(0);
                rz8Var.mo5661h(ik5Var.m19714h(), 0, 8, false);
                j = ik5Var.m19698x();
                rz8Var.m10811l(((int) m24444a.f6992b) + 8, false);
            }
            this.f4758d = j;
            this.f4757c = 2;
            return 0;
        } else if (i2 == 2) {
            ce2 m19884b = ie2.m19884b(k09Var);
            int i4 = m19884b.f5753a;
            if (i4 == 17) {
                ae2Var = new yd2(this.f4755a, this.f4756b, m19884b);
            } else if (i4 == 6) {
                ae2Var = new ae2(this.f4755a, this.f4756b, m19884b, "audio/g711-alaw", -1);
            } else if (i4 == 7) {
                ae2Var = new ae2(this.f4755a, this.f4756b, m19884b, "audio/g711-mlaw", -1);
            } else {
                int i5 = m19884b.f5757e;
                if (i4 != 1) {
                    if (i4 == 3) {
                        if (i5 == 32) {
                            m19408X = 4;
                            if (m19408X == 0) {
                                throw dl3.m24265c("Unsupported WAV format type: " + i4);
                            }
                            ae2Var = new ae2(this.f4755a, this.f4756b, m19884b, "audio/raw", m19408X);
                        }
                    }
                    m19408X = 0;
                    if (m19408X == 0) {
                    }
                }
                m19408X = it5.m19408X(i5);
                if (m19408X == 0) {
                }
            }
            this.f4759e = ae2Var;
            this.f4757c = 3;
            return 0;
        } else if (i2 != 3) {
            uo4.m7872f(this.f4761g != -1);
            zd2 zd2Var = this.f4759e;
            Objects.requireNonNull(zd2Var);
            return zd2Var.mo2465c(k09Var, this.f4761g - k09Var.zzf()) ? -1 : 0;
        } else {
            Pair m19885a = ie2.m19885a(k09Var);
            this.f4760f = ((Long) m19885a.first).intValue();
            long longValue = ((Long) m19885a.second).longValue();
            long j2 = this.f4758d;
            if (j2 != -1 && longValue == 4294967295L) {
                longValue = j2;
            }
            long j3 = this.f4760f + longValue;
            this.f4761g = j3;
            long zzd = k09Var.zzd();
            if (zzd != -1 && j3 > zzd) {
                s95.m10493e("WavExtractor", "Data exceeds input length: " + j3 + ", " + zzd);
                this.f4761g = zzd;
                j3 = zzd;
            }
            zd2 zd2Var2 = this.f4759e;
            Objects.requireNonNull(zd2Var2);
            zd2Var2.mo2466b(this.f4760f, j3);
            this.f4757c = 4;
            return 0;
        }
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        this.f4757c = j == 0 ? 0 : 4;
        zd2 zd2Var = this.f4759e;
        if (zd2Var != null) {
            zd2Var.mo2467a(j2);
        }
    }
}
