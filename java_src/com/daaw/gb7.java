package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class gb7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ hb7 f11015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb7(hb7 hb7Var, Class cls) {
        super(cls);
        this.f11015b = hb7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        io7 io7Var = (io7) xt7Var;
        eo7 m22442M = fo7.m22442M();
        m22442M.m23329t(0);
        m22442M.m23330s(yq7.m3424F(vp7.m6942a(32)));
        return (fo7) m22442M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return io7.m19546N(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new ce7(io7.m19547M(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new ce7(io7.m19547M(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        io7 io7Var = (io7) xt7Var;
    }
}
