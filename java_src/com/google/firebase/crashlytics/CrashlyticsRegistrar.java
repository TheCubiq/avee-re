package com.google.firebase.crashlytics;

import com.daaw.bi;
import com.daaw.e20;
import com.daaw.fm;
import com.daaw.gi;
import com.daaw.kj0;
import com.daaw.p2;
import com.daaw.s10;
import com.daaw.vh;
import com.daaw.x10;
import com.daaw.ys;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public final x10 b(bi biVar) {
        return x10.b((s10) biVar.a(s10.class), (e20) biVar.a(e20.class), biVar.i(fm.class), biVar.i(p2.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vh<?>> getComponents() {
        return Arrays.asList(vh.e(x10.class).g("fire-cls").b(ys.j(s10.class)).b(ys.j(e20.class)).b(ys.a(fm.class)).b(ys.a(p2.class)).e(new gi() { // from class: com.daaw.km
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                x10 b;
                b = CrashlyticsRegistrar.this.b(biVar);
                return b;
            }
        }).d().c(), kj0.b("fire-cls", "18.3.3"));
    }
}
