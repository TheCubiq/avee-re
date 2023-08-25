package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class jg7 {
    public static final dq7 a;
    public static final bf7 b;
    public static final ue7 c;
    public static final be7 d;
    public static final xd7 e;
    public static final /* synthetic */ int f = 0;

    static {
        dq7 a2 = pf7.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = a2;
        b = bf7.a(new ze7() { // from class: com.daaw.fg7
        }, eg7.class, ff7.class);
        c = ue7.a(new se7() { // from class: com.daaw.gg7
        }, a2, ff7.class);
        d = be7.a(new zd7() { // from class: com.daaw.hg7
        }, tf7.class, ef7.class);
        e = xd7.b(new sd7() { // from class: com.daaw.ig7
            @Override // com.daaw.sd7
            public final m87 a(gf7 gf7Var, x97 x97Var) {
                cg7 cg7Var;
                int i = jg7.f;
                if (((ef7) gf7Var).f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        zh7 O = zh7.O(((ef7) gf7Var).d(), vr7.a());
                        if (O.L() == 0) {
                            yf7 yf7Var = new yf7(null);
                            yf7Var.a(O.Q().o());
                            yf7Var.b(O.P().L());
                            zn7 c2 = ((ef7) gf7Var).c();
                            zn7 zn7Var = zn7.UNKNOWN_PREFIX;
                            int ordinal = c2.ordinal();
                            if (ordinal == 1) {
                                cg7Var = cg7.b;
                            } else if (ordinal == 2) {
                                cg7Var = cg7.d;
                            } else if (ordinal == 3) {
                                cg7Var = cg7.e;
                            } else if (ordinal != 4) {
                                int zza = c2.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                            } else {
                                cg7Var = cg7.c;
                            }
                            yf7Var.c(cg7Var);
                            eg7 d2 = yf7Var.d();
                            rf7 rf7Var = new rf7(null);
                            rf7Var.c(d2);
                            rf7Var.a(eq7.b(O.Q().j(), x97Var));
                            rf7Var.b(((ef7) gf7Var).e());
                            return rf7Var.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (xs7 | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
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
