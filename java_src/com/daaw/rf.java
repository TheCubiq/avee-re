package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class rf implements di0<Object>, qf {
    public static final a b = new a(null);
    public static final Map<Class<Object>, Integer> c;
    public static final HashMap<String, String> d;
    public static final HashMap<String, String> e;
    public static final HashMap<String, String> f;
    public static final Map<String, String> g;
    public final Class<?> a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List e2 = kg.e(x40.class, z40.class, n50.class, o50.class, p50.class, q50.class, r50.class, s50.class, t50.class, u50.class, y40.class, a50.class, b50.class, c50.class, d50.class, e50.class, f50.class, g50.class, h50.class, i50.class, k50.class, l50.class, m50.class);
        ArrayList arrayList = new ArrayList(lg.h(e2, 10));
        for (Object obj : e2) {
            int i2 = i + 1;
            if (i < 0) {
                kg.g();
            }
            arrayList.add(no1.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = bn0.g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        ug0.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            ug0.e(str, "kotlinName");
            sb.append(oh1.w(str, '.', null, 2, null));
            sb.append("CompanionObject");
            nv0 a2 = no1.a(sb.toString(), str + ".Companion");
            hashMap3.put(a2.c(), a2.d());
        }
        for (Map.Entry<Class<Object>, Integer> entry : c.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(an0.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), oh1.w((String) entry2.getValue(), '.', null, 2, null));
        }
        g = linkedHashMap;
    }

    public rf(Class<?> cls) {
        ug0.f(cls, "jClass");
        this.a = cls;
    }

    @Override // com.daaw.qf
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof rf) && ug0.a(bi0.b(this), bi0.b((di0) obj));
    }

    public int hashCode() {
        return bi0.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
