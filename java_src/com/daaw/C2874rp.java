package com.daaw;

import android.content.Context;
import java.nio.charset.Charset;
/* renamed from: com.daaw.rp */
/* loaded from: classes2.dex */
public class C2874rp {

    /* renamed from: c */
    public static final C3095tm f25459c = new C3095tm();

    /* renamed from: d */
    public static final String f25460d = m11099e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    public static final String f25461e = m11099e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    public static final hn1<AbstractC2057lm, byte[]> f25462f = new hn1() { // from class: com.daaw.qp
        @Override // com.daaw.hn1
        public final Object apply(Object obj) {
            byte[] m11100d;
            m11100d = C2874rp.m11100d((AbstractC2057lm) obj);
            return m11100d;
        }
    };

    /* renamed from: a */
    public final i41 f25463a;

    /* renamed from: b */
    public final hn1<AbstractC2057lm, byte[]> f25464b;

    public C2874rp(i41 i41Var, hn1<AbstractC2057lm, byte[]> hn1Var) {
        this.f25463a = i41Var;
        this.f25464b = hn1Var;
    }

    /* renamed from: b */
    public static C2874rp m11102b(Context context, zb1 zb1Var, fu0 fu0Var) {
        xn1.m4946f(context);
        tn1 m4945g = xn1.m4949c().m4945g(new C1177ed(f25460d, f25461e));
        C0892bx m25779b = C0892bx.m25779b("json");
        hn1<AbstractC2057lm, byte[]> hn1Var = f25462f;
        return new C2874rp(new i41(m4945g.mo7891a("FIREBASE_CRASHLYTICS_REPORT", AbstractC2057lm.class, m25779b, hn1Var), zb1Var.mo2554b(), fu0Var), hn1Var);
    }

    /* renamed from: d */
    public static /* synthetic */ byte[] m11100d(AbstractC2057lm abstractC2057lm) {
        return f25459c.m8997E(abstractC2057lm).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public static String m11099e(String str, String str2) {
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

    /* renamed from: c */
    public rj1<AbstractC3878zm> m11101c(AbstractC3878zm abstractC3878zm, boolean z) {
        return this.f25463a.m20135i(abstractC3878zm, z).m9082a();
    }
}
