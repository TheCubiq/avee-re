package com.daaw.avee.comp.Visualizer;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DependencyResourceCounter implements IDependencyResourceCounter {
    List<String> dependencyResourceNamesList = new ArrayList();

    public List<String> GetDependencyResourceNamesList() {
        return this.dependencyResourceNamesList;
    }

    @Override // com.daaw.avee.comp.Visualizer.IDependencyResourceCounter
    public void PutDependencyResourceName(String str) {
        this.dependencyResourceNamesList.add(str);
    }
}
