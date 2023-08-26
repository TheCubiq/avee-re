package org.junit.experimental.theories.internal;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;
/* loaded from: classes2.dex */
public class EnumSupplier extends ParameterSupplier {
    private Class<?> enumType;

    public EnumSupplier(Class<?> cls) {
        this.enumType = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) {
        Object[] enumConstants = this.enumType.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr : enumConstants) {
            arrayList.add(PotentialAssignment.forValue(objArr.toString(), objArr));
        }
        return arrayList;
    }
}
