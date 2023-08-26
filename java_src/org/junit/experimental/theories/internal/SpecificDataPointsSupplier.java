package org.junit.experimental.theories.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;
/* loaded from: classes.dex */
public class SpecificDataPointsSupplier extends AllMembersSupplier {
    public SpecificDataPointsSupplier(TestClass testClass) {
        super(testClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.AllMembersSupplier
    public Collection<Field> getSingleDataPointFields(ParameterSignature parameterSignature) {
        Collection<Field> singleDataPointFields = super.getSingleDataPointFields(parameterSignature);
        String value = ((FromDataPoints) parameterSignature.getAnnotation(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : singleDataPointFields) {
            if (Arrays.asList(((DataPoint) field.getAnnotation(DataPoint.class)).value()).contains(value)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.AllMembersSupplier
    public Collection<Field> getDataPointsFields(ParameterSignature parameterSignature) {
        Collection<Field> dataPointsFields = super.getDataPointsFields(parameterSignature);
        String value = ((FromDataPoints) parameterSignature.getAnnotation(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : dataPointsFields) {
            if (Arrays.asList(((DataPoints) field.getAnnotation(DataPoints.class)).value()).contains(value)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.AllMembersSupplier
    public Collection<FrameworkMethod> getSingleDataPointMethods(ParameterSignature parameterSignature) {
        Collection<FrameworkMethod> singleDataPointMethods = super.getSingleDataPointMethods(parameterSignature);
        String value = ((FromDataPoints) parameterSignature.getAnnotation(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (FrameworkMethod frameworkMethod : singleDataPointMethods) {
            if (Arrays.asList(((DataPoint) frameworkMethod.getAnnotation(DataPoint.class)).value()).contains(value)) {
                arrayList.add(frameworkMethod);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.AllMembersSupplier
    public Collection<FrameworkMethod> getDataPointsMethods(ParameterSignature parameterSignature) {
        Collection<FrameworkMethod> dataPointsMethods = super.getDataPointsMethods(parameterSignature);
        String value = ((FromDataPoints) parameterSignature.getAnnotation(FromDataPoints.class)).value();
        ArrayList arrayList = new ArrayList();
        for (FrameworkMethod frameworkMethod : dataPointsMethods) {
            if (Arrays.asList(((DataPoints) frameworkMethod.getAnnotation(DataPoints.class)).value()).contains(value)) {
                arrayList.add(frameworkMethod);
            }
        }
        return arrayList;
    }
}
