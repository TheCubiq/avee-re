package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {
    private final List<Component<?>> componentsInCycle;

    public DependencyCycleException(List<Component<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public List<Component<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
