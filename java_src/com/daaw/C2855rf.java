package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.daaw.rf */
/* loaded from: classes2.dex */
public final class C2855rf implements di0<Object>, InterfaceC2710qf {

    /* renamed from: b */
    public static final C2856a f25226b = new C2856a(null);

    /* renamed from: c */
    public static final Map<Class<Object>, Integer> f25227c;

    /* renamed from: d */
    public static final HashMap<String, String> f25228d;

    /* renamed from: e */
    public static final HashMap<String, String> f25229e;

    /* renamed from: f */
    public static final HashMap<String, String> f25230f;

    /* renamed from: g */
    public static final Map<String, String> f25231g;

    /* renamed from: a */
    public final Class<?> f25232a;

    /* renamed from: com.daaw.rf$a */
    /* loaded from: classes2.dex */
    public static final class C2856a {
        public C2856a() {
        }

        public /* synthetic */ C2856a(C2575pq c2575pq) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List m17760e = C1946kg.m17760e(x40.class, z40.class, n50.class, o50.class, p50.class, q50.class, r50.class, s50.class, t50.class, u50.class, y40.class, a50.class, b50.class, c50.class, d50.class, e50.class, f50.class, g50.class, h50.class, i50.class, k50.class, l50.class, m50.class);
        ArrayList arrayList = new ArrayList(C2037lg.m16966h(m17760e, 10));
        for (Object obj : m17760e) {
            int i2 = i + 1;
            if (i < 0) {
                C1946kg.m17758g();
            }
            arrayList.add(no1.m14903a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f25227c = bn0.m25979g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f25228d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f25229e = hashMap2;
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
        ug0.m8269e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            ug0.m8269e(str, "kotlinName");
            sb.append(oh1.m14282w(str, '.', null, 2, null));
            sb.append("CompanionObject");
            nv0 m14903a = no1.m14903a(sb.toString(), str + ".Companion");
            hashMap3.put(m14903a.m14777c(), m14903a.m14776d());
        }
        for (Map.Entry<Class<Object>, Integer> entry : f25227c.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f25230f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(an0.m27335a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), oh1.m14282w((String) entry2.getValue(), '.', null, 2, null));
        }
        f25231g = linkedHashMap;
    }

    public C2855rf(Class<?> cls) {
        ug0.m8268f(cls, "jClass");
        this.f25232a = cls;
    }

    @Override // com.daaw.InterfaceC2710qf
    /* renamed from: a */
    public Class<?> mo11353a() {
        return this.f25232a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2855rf) && ug0.m8273a(bi0.m26165b(this), bi0.m26165b((di0) obj));
    }

    public int hashCode() {
        return bi0.m26165b(this).hashCode();
    }

    public String toString() {
        return mo11353a().toString() + " (Kotlin reflection is not available)";
    }
}
