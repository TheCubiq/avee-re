package com.daaw;

import android.content.Context;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class rp {
    public static final tm c = new tm();
    public static final String d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final hn1<lm, byte[]> f = new hn1() { // from class: com.daaw.qp
        @Override // com.daaw.hn1
        public final Object apply(Object obj) {
            byte[] d2;
            d2 = rp.d((lm) obj);
            return d2;
        }
    };
    public final i41 a;
    public final hn1<lm, byte[]> b;

    public rp(i41 i41Var, hn1<lm, byte[]> hn1Var) {
        this.a = i41Var;
        this.b = hn1Var;
    }

    public static rp b(Context context, zb1 zb1Var, fu0 fu0Var) {
        xn1.f(context);
        tn1 g = xn1.c().g(new ed(d, e));
        bx b = bx.b("json");
        hn1<lm, byte[]> hn1Var = f;
        return new rp(new i41(g.a("FIREBASE_CRASHLYTICS_REPORT", lm.class, b, hn1Var), zb1Var.b(), fu0Var), hn1Var);
    }

    public static /* synthetic */ byte[] d(lm lmVar) {
        return c.E(lmVar).getBytes(Charset.forName("UTF-8"));
    }

    public static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public rj1<zm> c(zm zmVar, boolean z) {
        return this.a.i(zmVar, z).a();
    }
}
