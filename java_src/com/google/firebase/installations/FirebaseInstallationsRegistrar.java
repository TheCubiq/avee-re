package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.daaw.bi;
import com.daaw.d20;
import com.daaw.e20;
import com.daaw.gi;
import com.daaw.kj0;
import com.daaw.s10;
import com.daaw.ua0;
import com.daaw.va0;
import com.daaw.vh;
import com.daaw.ys;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e20 lambda$getComponents$0(bi biVar) {
        return new d20((s10) biVar.a(s10.class), biVar.d(va0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vh<?>> getComponents() {
        return Arrays.asList(vh.e(e20.class).g(LIBRARY_NAME).b(ys.j(s10.class)).b(ys.h(va0.class)).e(new gi() { // from class: com.daaw.g20
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                e20 lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(biVar);
                return lambda$getComponents$0;
            }
        }).c(), ua0.a(), kj0.b(LIBRARY_NAME, "17.1.0"));
    }
}
