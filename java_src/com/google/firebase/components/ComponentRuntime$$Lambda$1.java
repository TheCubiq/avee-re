package com.google.firebase.components;

import com.google.firebase.inject.Provider;
/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ComponentRuntime$$Lambda$1 implements Provider {
    private final ComponentRuntime arg$1;
    private final Component arg$2;

    private ComponentRuntime$$Lambda$1(ComponentRuntime componentRuntime, Component component) {
        this.arg$1 = componentRuntime;
        this.arg$2 = component;
    }

    public static Provider lambdaFactory$(ComponentRuntime componentRuntime, Component component) {
        return new ComponentRuntime$$Lambda$1(componentRuntime, component);
    }

    @Override // com.google.firebase.inject.Provider
    public Object get() {
        Object create;
        create = r1.getFactory().create(new RestrictedComponentContainer(this.arg$2, this.arg$1));
        return create;
    }
}
