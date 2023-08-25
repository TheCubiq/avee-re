package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.daaw.C3330vh;
import com.daaw.C3740ys;
import com.daaw.InterfaceC0842bi;
import com.daaw.InterfaceC1421gi;
import com.daaw.d20;
import com.daaw.e20;
import com.daaw.kj0;
import com.daaw.s10;
import com.daaw.ua0;
import com.daaw.va0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e20 lambda$getComponents$0(InterfaceC0842bi interfaceC0842bi) {
        return new d20((s10) interfaceC0842bi.mo12506a(s10.class), interfaceC0842bi.mo12503d(va0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3330vh<?>> getComponents() {
        return Arrays.asList(C3330vh.m7173e(e20.class).m7151g(LIBRARY_NAME).m7156b(C3740ys.m3349j(s10.class)).m7156b(C3740ys.m3351h(va0.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.g20
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                e20 lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC0842bi);
                return lambda$getComponents$0;
            }
        }).m7155c(), ua0.m8395a(), kj0.m17708b(LIBRARY_NAME, "17.1.0"));
    }
}
