package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.daaw.gi;
import com.daaw.kj0;
import com.daaw.p2;
import com.daaw.s10;
import com.daaw.sh1;
import com.daaw.vh;
import com.daaw.ys;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<vh<?>> getComponents() {
        return Arrays.asList(vh.e(p2.class).b(ys.j(s10.class)).b(ys.j(Context.class)).b(ys.j(sh1.class)).e(new gi() { // from class: com.daaw.dy2
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                p2 c;
                c = q2.c((s10) biVar.a(s10.class), (Context) biVar.a(Context.class), (sh1) biVar.a(sh1.class));
                return c;
            }
        }).d().c(), kj0.b("fire-analytics", "21.2.0"));
    }
}
