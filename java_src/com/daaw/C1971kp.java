package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.daaw.kp */
/* loaded from: classes.dex */
public class C1971kp {

    /* renamed from: b */
    public static final br0 f16607b = new br0();

    /* renamed from: a */
    public final Map<br0, InterfaceC1849jp<?, ?>> f16608a = new HashMap();

    /* renamed from: a */
    public <T, Z> InterfaceC1849jp<T, Z> m17567a(Class<T> cls, Class<Z> cls2) {
        InterfaceC1849jp<T, Z> interfaceC1849jp;
        br0 br0Var = f16607b;
        synchronized (br0Var) {
            br0Var.m25917a(cls, cls2);
            interfaceC1849jp = (InterfaceC1849jp<T, Z>) this.f16608a.get(br0Var);
        }
        return interfaceC1849jp == null ? C2371nw.m14772g() : interfaceC1849jp;
    }

    /* renamed from: b */
    public <T, Z> void m17566b(Class<T> cls, Class<Z> cls2, InterfaceC1849jp<T, Z> interfaceC1849jp) {
        this.f16608a.put(new br0(cls, cls2), interfaceC1849jp);
    }
}
