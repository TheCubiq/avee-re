package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;
/* loaded from: classes.dex */
public final class fd2 implements j09 {

    /* renamed from: l */
    public static final q09 f9470l = new q09() { // from class: com.daaw.wc2
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = fd2.f9470l;
            return new j09[]{new fd2()};
        }
    };

    /* renamed from: e */
    public boolean f9475e;

    /* renamed from: f */
    public boolean f9476f;

    /* renamed from: g */
    public boolean f9477g;

    /* renamed from: h */
    public long f9478h;

    /* renamed from: i */
    public uc2 f9479i;

    /* renamed from: j */
    public m09 f9480j;

    /* renamed from: k */
    public boolean f9481k;

    /* renamed from: a */
    public final cr5 f9471a = new cr5(0);

    /* renamed from: c */
    public final ik5 f9473c = new ik5(4096);

    /* renamed from: b */
    public final SparseArray f9472b = new SparseArray();

    /* renamed from: d */
    public final vc2 f9474d = new vc2();

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        byte[] bArr = new byte[14];
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.mo5661h(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            rz8Var.m10812k(bArr[13] & 7, false);
            rz8Var.mo5661h(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f9480j = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        ac2 cc2Var;
        uo4.m7876b(this.f9480j);
        long zzd = k09Var.zzd();
        if (zzd != -1) {
            vc2 vc2Var = this.f9474d;
            if (!vc2Var.m7279e()) {
                return vc2Var.m7283a(k09Var, f42Var);
            }
        }
        if (!this.f9481k) {
            this.f9481k = true;
            vc2 vc2Var2 = this.f9474d;
            if (vc2Var2.m7282b() != -9223372036854775807L) {
                uc2 uc2Var = new uc2(vc2Var2.m7280d(), vc2Var2.m7282b(), zzd);
                this.f9479i = uc2Var;
                this.f9480j.mo3297i(uc2Var.m14702b());
            } else {
                this.f9480j.mo3297i(new h42(vc2Var2.m7282b(), 0L));
            }
        }
        uc2 uc2Var2 = this.f9479i;
        if (uc2Var2 == null || !uc2Var2.m14699e()) {
            k09Var.zzj();
            long zze = zzd != -1 ? zzd - k09Var.zze() : -1L;
            if ((zze == -1 || zze >= 4) && k09Var.mo5661h(this.f9473c.m19714h(), 0, 4, true)) {
                this.f9473c.m19716f(0);
                int m19709m = this.f9473c.m19709m();
                if (m19709m == 441) {
                    return -1;
                }
                if (m19709m == 442) {
                    rz8 rz8Var = (rz8) k09Var;
                    rz8Var.mo5661h(this.f9473c.m19714h(), 0, 10, false);
                    this.f9473c.m19716f(9);
                    rz8Var.m10811l((this.f9473c.m19703s() & 7) + 14, false);
                    return 0;
                } else if (m19709m == 443) {
                    rz8 rz8Var2 = (rz8) k09Var;
                    rz8Var2.mo5661h(this.f9473c.m19714h(), 0, 2, false);
                    this.f9473c.m19716f(0);
                    rz8Var2.m10811l(this.f9473c.m19699w() + 6, false);
                    return 0;
                } else if ((m19709m >> 8) != 1) {
                    ((rz8) k09Var).m10811l(1, false);
                    return 0;
                } else {
                    int i = m19709m & 255;
                    ed2 ed2Var = (ed2) this.f9472b.get(i);
                    if (!this.f9475e) {
                        if (ed2Var == null) {
                            ac2 ac2Var = null;
                            if (i == 189) {
                                cc2Var = new lb2(null);
                            } else if ((i & 224) == 192) {
                                cc2Var = new oc2(null);
                            } else {
                                if ((i & 240) == 224) {
                                    cc2Var = new cc2(null);
                                    this.f9477g = true;
                                    this.f9478h = k09Var.zzf();
                                    ac2Var = cc2Var;
                                }
                                if (ac2Var != null) {
                                    ac2Var.mo2552b(this.f9480j, new td2(Integer.MIN_VALUE, i, 256));
                                    ed2Var = new ed2(ac2Var, this.f9471a);
                                    this.f9472b.put(i, ed2Var);
                                }
                            }
                            this.f9476f = true;
                            this.f9478h = k09Var.zzf();
                            ac2Var = cc2Var;
                            if (ac2Var != null) {
                            }
                        }
                        long j = 1048576;
                        if (this.f9476f && this.f9477g) {
                            j = this.f9478h + 8192;
                        }
                        if (k09Var.zzf() > j) {
                            this.f9475e = true;
                            this.f9480j.zzC();
                        }
                    }
                    rz8 rz8Var3 = (rz8) k09Var;
                    rz8Var3.mo5661h(this.f9473c.m19714h(), 0, 2, false);
                    this.f9473c.m19716f(0);
                    int m19699w = this.f9473c.m19699w() + 6;
                    if (ed2Var == null) {
                        rz8Var3.m10811l(m19699w, false);
                    } else {
                        this.f9473c.m19719c(m19699w);
                        rz8Var3.mo5663e(this.f9473c.m19714h(), 0, m19699w, false);
                        this.f9473c.m19716f(6);
                        ed2Var.m23556a(this.f9473c);
                        ik5 ik5Var = this.f9473c;
                        ik5Var.m19717e(ik5Var.m19712j());
                    }
                    return 0;
                }
            }
            return -1;
        }
        return uc2Var2.m14703a(k09Var, f42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[LOOP:0: B:14:0x002c->B:16:0x0034, LOOP_END] */
    @Override // com.daaw.j09
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3953f(long j, long j2) {
        uc2 uc2Var;
        int i;
        cr5 cr5Var = this.f9471a;
        if (cr5Var.m25053e() != -9223372036854775807L) {
            long m25055c = cr5Var.m25055c();
            if (m25055c != -9223372036854775807L) {
                if (m25055c != 0) {
                }
            }
            uc2Var = this.f9479i;
            if (uc2Var != null) {
                uc2Var.m14700d(j2);
            }
            for (i = 0; i < this.f9472b.size(); i++) {
                ((ed2) this.f9472b.valueAt(i)).m23555b();
            }
        }
        cr5Var.m25052f(j2);
        uc2Var = this.f9479i;
        if (uc2Var != null) {
        }
        while (i < this.f9472b.size()) {
        }
    }
}
