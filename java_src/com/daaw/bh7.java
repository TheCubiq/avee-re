package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class bh7 {

    /* renamed from: a */
    public static final dq7 f4806a;

    /* renamed from: b */
    public static final bf7 f4807b;

    /* renamed from: c */
    public static final ue7 f4808c;

    /* renamed from: d */
    public static final be7 f4809d;

    /* renamed from: e */
    public static final xd7 f4810e;

    /* renamed from: f */
    public static final /* synthetic */ int f4811f = 0;

    static {
        dq7 m13405a = pf7.m13405a("type.googleapis.com/google.crypto.tink.HmacKey");
        f4806a = m13405a;
        f4807b = bf7.m26188a(new ze7() { // from class: com.daaw.xg7
        }, wg7.class, ff7.class);
        f4808c = ue7.m8288a(new se7() { // from class: com.daaw.yg7
        }, m13405a, ff7.class);
        f4809d = be7.m26193a(new zd7() { // from class: com.daaw.zg7
        }, ng7.class, ef7.class);
        f4810e = xd7.m5202b(new sd7() { // from class: com.daaw.ah7
            @Override // com.daaw.sd7
            /* renamed from: a */
            public final m87 mo10452a(gf7 gf7Var, x97 x97Var) {
                tg7 tg7Var;
                ug7 ug7Var;
                int i = bh7.f4811f;
                if (((ef7) gf7Var).m23495f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        ll7 m16854P = ll7.m16854P(((ef7) gf7Var).m23497d(), vr7.m6834a());
                        if (m16854P.m16858L() == 0) {
                            sg7 sg7Var = new sg7(null);
                            sg7Var.m10368b(m16854P.m16852R().mo3411o());
                            sg7Var.m10367c(m16854P.m16853Q().m8031L());
                            int m8026Q = m16854P.m16853Q().m8026Q();
                            zn7 zn7Var = zn7.UNKNOWN_PREFIX;
                            int i2 = m8026Q - 2;
                            if (i2 == 1) {
                                tg7Var = tg7.f27630b;
                            } else if (i2 == 2) {
                                tg7Var = tg7.f27633e;
                            } else if (i2 == 3) {
                                tg7Var = tg7.f27632d;
                            } else if (i2 == 4) {
                                tg7Var = tg7.f27634f;
                            } else if (i2 != 5) {
                                throw new GeneralSecurityException("Unable to parse HashType: " + il7.m19657a(m8026Q));
                            } else {
                                tg7Var = tg7.f27631c;
                            }
                            sg7Var.m10369a(tg7Var);
                            zn7 m23498c = ((ef7) gf7Var).m23498c();
                            int ordinal = m23498c.ordinal();
                            if (ordinal == 1) {
                                ug7Var = ug7.f29051b;
                            } else if (ordinal == 2) {
                                ug7Var = ug7.f29053d;
                            } else if (ordinal == 3) {
                                ug7Var = ug7.f29054e;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + m23498c.zza());
                            } else {
                                ug7Var = ug7.f29052c;
                            }
                            sg7Var.m10366d(ug7Var);
                            wg7 m10365e = sg7Var.m10365e();
                            lg7 lg7Var = new lg7(null);
                            lg7Var.m16961c(m10365e);
                            lg7Var.m16962b(eq7.m23277b(m16854P.m16852R().m3415j(), x97Var));
                            lg7Var.m16963a(((ef7) gf7Var).m23496e());
                            return lg7Var.m16960d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (xs7 | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
            }
        }, m13405a, ef7.class);
    }

    /* renamed from: a */
    public static void m26167a() {
        qe7 m12574b = qe7.m12574b();
        m12574b.m12570f(f4807b);
        m12574b.m12571e(f4808c);
        m12574b.m12572d(f4809d);
        m12574b.m12573c(f4810e);
    }
}
