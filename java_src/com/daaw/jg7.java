package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class jg7 {

    /* renamed from: a */
    public static final dq7 f15093a;

    /* renamed from: b */
    public static final bf7 f15094b;

    /* renamed from: c */
    public static final ue7 f15095c;

    /* renamed from: d */
    public static final be7 f15096d;

    /* renamed from: e */
    public static final xd7 f15097e;

    /* renamed from: f */
    public static final /* synthetic */ int f15098f = 0;

    static {
        dq7 m13405a = pf7.m13405a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f15093a = m13405a;
        f15094b = bf7.m26188a(new ze7() { // from class: com.daaw.fg7
        }, eg7.class, ff7.class);
        f15095c = ue7.m8288a(new se7() { // from class: com.daaw.gg7
        }, m13405a, ff7.class);
        f15096d = be7.m26193a(new zd7() { // from class: com.daaw.hg7
        }, tf7.class, ef7.class);
        f15097e = xd7.m5202b(new sd7() { // from class: com.daaw.ig7
            @Override // com.daaw.sd7
            /* renamed from: a */
            public final m87 mo10452a(gf7 gf7Var, x97 x97Var) {
                cg7 cg7Var;
                int i = jg7.f15098f;
                if (((ef7) gf7Var).m23495f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        zh7 m2291O = zh7.m2291O(((ef7) gf7Var).m23497d(), vr7.m6834a());
                        if (m2291O.m2294L() == 0) {
                            yf7 yf7Var = new yf7(null);
                            yf7Var.m3777a(m2291O.m2289Q().mo3411o());
                            yf7Var.m3776b(m2291O.m2290P().m19764L());
                            zn7 m23498c = ((ef7) gf7Var).m23498c();
                            zn7 zn7Var = zn7.UNKNOWN_PREFIX;
                            int ordinal = m23498c.ordinal();
                            if (ordinal == 1) {
                                cg7Var = cg7.f5797b;
                            } else if (ordinal == 2) {
                                cg7Var = cg7.f5799d;
                            } else if (ordinal == 3) {
                                cg7Var = cg7.f5800e;
                            } else if (ordinal != 4) {
                                int zza = m23498c.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                            } else {
                                cg7Var = cg7.f5798c;
                            }
                            yf7Var.m3775c(cg7Var);
                            eg7 m3774d = yf7Var.m3774d();
                            rf7 rf7Var = new rf7(null);
                            rf7Var.m11350c(m3774d);
                            rf7Var.m11352a(eq7.m23277b(m2291O.m2289Q().m3415j(), x97Var));
                            rf7Var.m11351b(((ef7) gf7Var).m23496e());
                            return rf7Var.m11349d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (xs7 | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
            }
        }, m13405a, ef7.class);
    }

    /* renamed from: a */
    public static void m18525a() {
        qe7 m12574b = qe7.m12574b();
        m12574b.m12570f(f15094b);
        m12574b.m12571e(f15095c);
        m12574b.m12572d(f15096d);
        m12574b.m12573c(f15097e);
    }
}
