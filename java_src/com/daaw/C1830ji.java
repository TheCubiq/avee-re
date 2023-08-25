package com.daaw;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.ji */
/* loaded from: classes2.dex */
public class C1830ji implements InterfaceC2040li {
    /* renamed from: c */
    public static /* synthetic */ Object m18505c(String str, C3330vh c3330vh, InterfaceC0842bi interfaceC0842bi) {
        try {
            i20.m20171b(str);
            return c3330vh.m7170h().mo3451a(interfaceC0842bi);
        } finally {
            i20.m20172a();
        }
    }

    @Override // com.daaw.InterfaceC2040li
    /* renamed from: a */
    public List<C3330vh<?>> mo16944a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C3330vh<?> c3330vh : componentRegistrar.getComponents()) {
            final String m7169i = c3330vh.m7169i();
            if (m7169i != null) {
                c3330vh = c3330vh.m7158t(new InterfaceC1421gi() { // from class: com.daaw.ii
                    @Override // com.daaw.InterfaceC1421gi
                    /* renamed from: a */
                    public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                        Object m18505c;
                        m18505c = C1830ji.m18505c(m7169i, c3330vh, interfaceC0842bi);
                        return m18505c;
                    }
                });
            }
            arrayList.add(c3330vh);
        }
        return arrayList;
    }
}
