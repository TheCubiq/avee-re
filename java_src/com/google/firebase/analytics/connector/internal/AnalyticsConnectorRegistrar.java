package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.daaw.C3330vh;
import com.daaw.C3740ys;
import com.daaw.InterfaceC1421gi;
import com.daaw.InterfaceC2505p2;
import com.daaw.kj0;
import com.daaw.s10;
import com.daaw.sh1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C3330vh<?>> getComponents() {
        return Arrays.asList(C3330vh.m7173e(InterfaceC2505p2.class).m7156b(C3740ys.m3349j(s10.class)).m7156b(C3740ys.m3349j(Context.class)).m7156b(C3740ys.m3349j(sh1.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.dy2
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                InterfaceC2505p2 m12799c;
                m12799c = C2680q2.m12799c((s10) interfaceC0842bi.mo12506a(s10.class), (Context) interfaceC0842bi.mo12506a(Context.class), (sh1) interfaceC0842bi.mo12506a(sh1.class));
                return m12799c;
            }
        }).m7154d().m7155c(), kj0.m17708b("fire-analytics", "21.2.0"));
    }
}
