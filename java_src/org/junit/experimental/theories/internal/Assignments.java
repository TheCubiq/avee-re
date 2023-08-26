package org.junit.experimental.theories.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.TestClass;
/* loaded from: classes2.dex */
public class Assignments {
    private final List<PotentialAssignment> assigned;
    private final TestClass clazz;
    private final List<ParameterSignature> unassigned;

    private Assignments(List<PotentialAssignment> list, List<ParameterSignature> list2, TestClass testClass) {
        this.unassigned = list2;
        this.assigned = list;
        this.clazz = testClass;
    }

    public static Assignments allUnassigned(Method method, TestClass testClass) {
        List<ParameterSignature> signatures = ParameterSignature.signatures(testClass.getOnlyConstructor());
        signatures.addAll(ParameterSignature.signatures(method));
        return new Assignments(new ArrayList(), signatures, testClass);
    }

    public boolean isComplete() {
        return this.unassigned.isEmpty();
    }

    public ParameterSignature nextUnassigned() {
        return this.unassigned.get(0);
    }

    public Assignments assignNext(PotentialAssignment potentialAssignment) {
        ArrayList arrayList = new ArrayList(this.assigned);
        arrayList.add(potentialAssignment);
        List<ParameterSignature> list = this.unassigned;
        return new Assignments(arrayList, list.subList(1, list.size()), this.clazz);
    }

    public Object[] getActualValues(int i, int i2) throws PotentialAssignment.CouldNotGenerateValueException {
        Object[] objArr = new Object[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = this.assigned.get(i3).getValue();
        }
        return objArr;
    }

    public List<PotentialAssignment> potentialsForNextUnassigned() throws Throwable {
        ParameterSignature nextUnassigned = nextUnassigned();
        List<PotentialAssignment> valueSources = getSupplier(nextUnassigned).getValueSources(nextUnassigned);
        return valueSources.isEmpty() ? generateAssignmentsFromTypeAlone(nextUnassigned) : valueSources;
    }

    private List<PotentialAssignment> generateAssignmentsFromTypeAlone(ParameterSignature parameterSignature) {
        Class<?> type = parameterSignature.getType();
        if (type.isEnum()) {
            return new EnumSupplier(type).getValueSources(parameterSignature);
        }
        if (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) {
            return new BooleanSupplier().getValueSources(parameterSignature);
        }
        return Collections.emptyList();
    }

    private ParameterSupplier getSupplier(ParameterSignature parameterSignature) throws Exception {
        ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) parameterSignature.findDeepAnnotation(ParametersSuppliedBy.class);
        if (parametersSuppliedBy != null) {
            return buildParameterSupplierFromClass(parametersSuppliedBy.value());
        }
        return new AllMembersSupplier(this.clazz);
    }

    private ParameterSupplier buildParameterSupplierFromClass(Class<? extends ParameterSupplier> cls) throws Exception {
        Constructor<?>[] constructors;
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(TestClass.class)) {
                return (ParameterSupplier) constructor.newInstance(this.clazz);
            }
        }
        return cls.newInstance();
    }

    public Object[] getConstructorArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, getConstructorParameterCount());
    }

    public Object[] getMethodArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(getConstructorParameterCount(), this.assigned.size());
    }

    public Object[] getAllArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, this.assigned.size());
    }

    private int getConstructorParameterCount() {
        return ParameterSignature.signatures(this.clazz.getOnlyConstructor()).size();
    }

    public Object[] getArgumentStrings(boolean z) throws PotentialAssignment.CouldNotGenerateValueException {
        int size = this.assigned.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.assigned.get(i).getDescription();
        }
        return objArr;
    }
}
