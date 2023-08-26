package org.junit.experimental.theories;

import java.util.List;
/* loaded from: classes.dex */
public abstract class ParameterSupplier {
    public abstract List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) throws Throwable;
}
