package com.daaw;

import com.daaw.p51;
import java.io.Serializable;
/* renamed from: com.daaw.na */
/* loaded from: classes2.dex */
public abstract class AbstractC2271na implements InterfaceC1438gl<Object>, InterfaceC3343vl, Serializable {

    /* renamed from: p */
    public final InterfaceC1438gl<Object> f19748p;

    @Override // com.daaw.InterfaceC3343vl
    /* renamed from: a */
    public InterfaceC3343vl mo7066a() {
        InterfaceC1438gl<Object> interfaceC1438gl = this.f19748p;
        if (interfaceC1438gl instanceof InterfaceC3343vl) {
            return (InterfaceC3343vl) interfaceC1438gl;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.InterfaceC1438gl
    /* renamed from: b */
    public final void mo7267b(Object obj) {
        Object m15372d;
        InterfaceC1438gl interfaceC1438gl = this;
        while (true) {
            C3887zp.m2020a(interfaceC1438gl);
            AbstractC2271na abstractC2271na = (AbstractC2271na) interfaceC1438gl;
            InterfaceC1438gl interfaceC1438gl2 = abstractC2271na.f19748p;
            ug0.m8271c(interfaceC1438gl2);
            try {
                m15372d = abstractC2271na.m15372d(obj);
            } catch (Throwable th) {
                p51.C2516a c2516a = p51.f22616p;
                obj = p51.m13631a(s51.m10708a(th));
            }
            if (m15372d == wg0.m6076b()) {
                return;
            }
            p51.C2516a c2516a2 = p51.f22616p;
            obj = p51.m13631a(m15372d);
            abstractC2271na.mo15371e();
            if (!(interfaceC1438gl2 instanceof AbstractC2271na)) {
                interfaceC1438gl2.mo7267b(obj);
                return;
            }
            interfaceC1438gl = interfaceC1438gl2;
        }
    }

    /* renamed from: c */
    public StackTraceElement m15373c() {
        return C3734yp.m3467d(this);
    }

    /* renamed from: d */
    public abstract Object m15372d(Object obj);

    /* renamed from: e */
    public void mo15371e() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object m15373c = m15373c();
        if (m15373c == null) {
            m15373c = getClass().getName();
        }
        sb.append(m15373c);
        return sb.toString();
    }
}
