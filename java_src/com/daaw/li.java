package com.daaw;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
/* loaded from: classes2.dex */
public interface li {
    public static final li a = new li() { // from class: com.daaw.ki
        @Override // com.daaw.li
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<vh<?>> a(ComponentRegistrar componentRegistrar);
}
