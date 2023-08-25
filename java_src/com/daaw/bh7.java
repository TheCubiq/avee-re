package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class bh7 {
    public static final dq7 a;
    public static final bf7 b;
    public static final ue7 c;
    public static final be7 d;
    public static final xd7 e;
    public static final /* synthetic */ int f = 0;

    static {
        dq7 a2 = pf7.a("type.googleapis.com/google.crypto.tink.HmacKey");
        a = a2;
        b = bf7.a(new ze7() { // from class: com.daaw.xg7
        }, wg7.class, ff7.class);
        c = ue7.a(new se7() { // from class: com.daaw.yg7
        }, a2, ff7.class);
        d = be7.a(new zd7() { // from class: com.daaw.zg7
        }, ng7.class, ef7.class);
        e = xd7.b(new sd7() { // from class: com.daaw.ah7
            @Override // com.daaw.sd7
            public final m87 a(gf7 gf7Var, x97 x97Var) {
                tg7 tg7Var;
                ug7 ug7Var;
                int i = bh7.f;
                if (((ef7) gf7Var).f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        ll7 P = ll7.P(((ef7) gf7Var).d(), vr7.a());
                        if (P.L() == 0) {
                            sg7 sg7Var = new sg7(null);
                            sg7Var.b(P.R().o());
                            sg7Var.c(P.Q().L());
                            int Q = P.Q().Q();
                            zn7 zn7Var = zn7.UNKNOWN_PREFIX;
                            int i2 = Q - 2;
                            if (i2 == 1) {
                                tg7Var = tg7.b;
                            } else if (i2 == 2) {
                                tg7Var = tg7.e;
                            } else if (i2 == 3) {
                                tg7Var = tg7.d;
                            } else if (i2 == 4) {
                                tg7Var = tg7.f;
                            } else if (i2 != 5) {
                                throw new GeneralSecurityException("Unable to parse HashType: " + il7.a(Q));
                            } else {
                                tg7Var = tg7.c;
                            }
                            sg7Var.a(tg7Var);
                            zn7 c2 = ((ef7) gf7Var).c();
                            int ordinal = c2.ordinal();
                            if (ordinal == 1) {
                                ug7Var = ug7.b;
                            } else if (ordinal == 2) {
                                ug7Var = ug7.d;
                            } else if (ordinal == 3) {
                                ug7Var = ug7.e;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + c2.zza());
                            } else {
                                ug7Var = ug7.c;
                            }
                            sg7Var.d(ug7Var);
                            wg7 e2 = sg7Var.e();
                            lg7 lg7Var = new lg7(null);
                            lg7Var.c(e2);
                            lg7Var.b(eq7.b(P.R().j(), x97Var));
                            lg7Var.a(((ef7) gf7Var).e());
                            return lg7Var.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (xs7 | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
            }
        }, a2, ef7.class);
    }

    public static void a() {
        qe7 b2 = qe7.b();
        b2.f(b);
        b2.e(c);
        b2.d(d);
        b2.c(e);
    }
}
