package com.google.firebase.crashlytics;

import com.daaw.C3330vh;
import com.daaw.C3740ys;
import com.daaw.InterfaceC0842bi;
import com.daaw.InterfaceC1306fm;
import com.daaw.InterfaceC1421gi;
import com.daaw.InterfaceC2505p2;
import com.daaw.e20;
import com.daaw.kj0;
import com.daaw.s10;
import com.daaw.x10;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public final x10 m64b(InterfaceC0842bi interfaceC0842bi) {
        return x10.m5652b((s10) interfaceC0842bi.mo12506a(s10.class), (e20) interfaceC0842bi.mo12506a(e20.class), interfaceC0842bi.mo12498i(InterfaceC1306fm.class), interfaceC0842bi.mo12498i(InterfaceC2505p2.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3330vh<?>> getComponents() {
        return Arrays.asList(C3330vh.m7173e(x10.class).m7151g("fire-cls").m7156b(C3740ys.m3349j(s10.class)).m7156b(C3740ys.m3349j(e20.class)).m7156b(C3740ys.m3358a(InterfaceC1306fm.class)).m7156b(C3740ys.m3358a(InterfaceC2505p2.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.km
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                x10 m64b;
                m64b = CrashlyticsRegistrar.this.m64b(interfaceC0842bi);
                return m64b;
            }
        }).m7154d().m7155c(), kj0.m17708b("fire-cls", "18.3.3"));
    }
}
