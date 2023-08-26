package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.internal.MethodSorter;
/* loaded from: classes2.dex */
public class TestClass implements Annotatable {
    private static final FieldComparator FIELD_COMPARATOR = new FieldComparator();
    private static final MethodComparator METHOD_COMPARATOR = new MethodComparator();
    private final Class<?> clazz;
    private final Map<Class<? extends Annotation>, List<FrameworkField>> fieldsForAnnotations;
    private final Map<Class<? extends Annotation>, List<FrameworkMethod>> methodsForAnnotations;

    public TestClass(Class<?> cls) {
        this.clazz = cls;
        if (cls != null && cls.getConstructors().length > 1) {
            throw new IllegalArgumentException("Test class can only have one constructor");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        scanAnnotatedMembers(linkedHashMap, linkedHashMap2);
        this.methodsForAnnotations = makeDeeplyUnmodifiable(linkedHashMap);
        this.fieldsForAnnotations = makeDeeplyUnmodifiable(linkedHashMap2);
    }

    protected void scanAnnotatedMembers(Map<Class<? extends Annotation>, List<FrameworkMethod>> map, Map<Class<? extends Annotation>, List<FrameworkField>> map2) {
        for (Class<?> cls : getSuperClasses(this.clazz)) {
            for (Method method : MethodSorter.getDeclaredMethods(cls)) {
                addToAnnotationLists(new FrameworkMethod(method), map);
            }
            for (Field field : getSortedDeclaredFields(cls)) {
                addToAnnotationLists(new FrameworkField(field), map2);
            }
        }
    }

    private static Field[] getSortedDeclaredFields(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, FIELD_COMPARATOR);
        return declaredFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T extends FrameworkMember<T>> void addToAnnotationLists(T t, Map<Class<? extends Annotation>, List<T>> map) {
        for (Annotation annotation : t.getAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            List annotatedMembers = getAnnotatedMembers(map, annotationType, true);
            FrameworkMember handlePossibleBridgeMethod = t.handlePossibleBridgeMethod(annotatedMembers);
            if (handlePossibleBridgeMethod == null) {
                return;
            }
            if (runsTopToBottom(annotationType)) {
                annotatedMembers.add(0, handlePossibleBridgeMethod);
            } else {
                annotatedMembers.add(handlePossibleBridgeMethod);
            }
        }
    }

    private static <T extends FrameworkMember<T>> Map<Class<? extends Annotation>, List<T>> makeDeeplyUnmodifiable(Map<Class<? extends Annotation>, List<T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Class<? extends Annotation>, List<T>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public List<FrameworkMethod> getAnnotatedMethods() {
        List<FrameworkMethod> collectValues = collectValues(this.methodsForAnnotations);
        Collections.sort(collectValues, METHOD_COMPARATOR);
        return collectValues;
    }

    public List<FrameworkMethod> getAnnotatedMethods(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(getAnnotatedMembers(this.methodsForAnnotations, cls, false));
    }

    public List<FrameworkField> getAnnotatedFields() {
        return collectValues(this.fieldsForAnnotations);
    }

    public List<FrameworkField> getAnnotatedFields(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(getAnnotatedMembers(this.fieldsForAnnotations, cls, false));
    }

    private <T> List<T> collectValues(Map<?, List<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (List<T> list : map.values()) {
            linkedHashSet.addAll(list);
        }
        return new ArrayList(linkedHashSet);
    }

    private static <T> List<T> getAnnotatedMembers(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z) {
        if (!map.containsKey(cls) && z) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    private static boolean runsTopToBottom(Class<? extends Annotation> cls) {
        return cls.equals(Before.class) || cls.equals(BeforeClass.class);
    }

    private static List<Class<?>> getSuperClasses(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public Class<?> getJavaClass() {
        return this.clazz;
    }

    public String getName() {
        Class<?> cls = this.clazz;
        return cls == null ? "null" : cls.getName();
    }

    public Constructor<?> getOnlyConstructor() {
        Constructor<?>[] constructors = this.clazz.getConstructors();
        Assert.assertEquals(1L, constructors.length);
        return constructors[0];
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        Class<?> cls = this.clazz;
        return cls == null ? new Annotation[0] : cls.getAnnotations();
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Class<?> cls2 = this.clazz;
        if (cls2 == null) {
            return null;
        }
        return (T) cls2.getAnnotation(cls);
    }

    public <T> List<T> getAnnotatedFieldValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        final ArrayList arrayList = new ArrayList();
        collectAnnotatedFieldValues(obj, cls, cls2, new MemberValueConsumer<T>() { // from class: org.junit.runners.model.TestClass.1
            @Override // org.junit.runners.model.MemberValueConsumer
            public void accept(FrameworkMember<?> frameworkMember, T t) {
                arrayList.add(t);
            }
        });
        return arrayList;
    }

    public <T> void collectAnnotatedFieldValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2, MemberValueConsumer<T> memberValueConsumer) {
        for (FrameworkField frameworkField : getAnnotatedFields(cls)) {
            try {
                Object obj2 = frameworkField.get(obj);
                if (cls2.isInstance(obj2)) {
                    memberValueConsumer.accept(frameworkField, cls2.cast(obj2));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e);
            }
        }
    }

    public <T> List<T> getAnnotatedMethodValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        final ArrayList arrayList = new ArrayList();
        collectAnnotatedMethodValues(obj, cls, cls2, new MemberValueConsumer<T>() { // from class: org.junit.runners.model.TestClass.2
            @Override // org.junit.runners.model.MemberValueConsumer
            public void accept(FrameworkMember<?> frameworkMember, T t) {
                arrayList.add(t);
            }
        });
        return arrayList;
    }

    public <T> void collectAnnotatedMethodValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2, MemberValueConsumer<T> memberValueConsumer) {
        for (FrameworkMethod frameworkMethod : getAnnotatedMethods(cls)) {
            try {
                if (cls2.isAssignableFrom(frameworkMethod.getReturnType())) {
                    memberValueConsumer.accept(frameworkMethod, cls2.cast(frameworkMethod.invokeExplosively(obj, new Object[0])));
                }
            } catch (Throwable th) {
                throw new RuntimeException("Exception in " + frameworkMethod.getName(), th);
            }
        }
    }

    public boolean isPublic() {
        return Modifier.isPublic(this.clazz.getModifiers());
    }

    public boolean isANonStaticInnerClass() {
        return this.clazz.isMemberClass() && !Modifier.isStatic(this.clazz.getModifiers());
    }

    public int hashCode() {
        Class<?> cls = this.clazz;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.clazz == ((TestClass) obj).clazz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class FieldComparator implements Comparator<Field> {
        private FieldComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    }

    /* loaded from: classes2.dex */
    private static class MethodComparator implements Comparator<FrameworkMethod> {
        private MethodComparator() {
        }

        @Override // java.util.Comparator
        public int compare(FrameworkMethod frameworkMethod, FrameworkMethod frameworkMethod2) {
            return MethodSorter.NAME_ASCENDING.compare(frameworkMethod.getMethod(), frameworkMethod2.getMethod());
        }
    }
}
