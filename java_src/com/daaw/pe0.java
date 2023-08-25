package com.daaw;

import com.daaw.er0;
import com.daaw.gz1;
/* loaded from: classes.dex */
public class pe0 {

    /* renamed from: com.daaw.pe0$a */
    /* loaded from: classes.dex */
    public class C2543a implements gz1.InterfaceC1490a<lo1<tx0, pf1>> {
        @Override // com.daaw.gz1.InterfaceC1490a
        /* renamed from: b */
        public lo1<tx0, pf1> mo13429a(String str, String str2, int i, String str3) {
            return new lo1<>(new tx0(-1L, str2, str, null), new pf1(str, str2, i, str3));
        }
    }

    /* renamed from: a */
    public static oe0<lo1<tx0, pf1>, er0<tx0, pf1>> m13430a() {
        return new oe0<>("https://dir.xiph.org/yp.xml", "xiph_org_yp", new C2543a(), new er0.C1213a());
    }
}
