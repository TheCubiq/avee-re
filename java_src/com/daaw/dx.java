package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class dx {
    public static final dx a = new dx();

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;

        public a(String str, String str2, boolean z) {
            ug0.f(str, "name");
            ug0.f(str2, "mimeType");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return ug0.a(this.a, aVar.a) && ug0.a(this.b, aVar.b) && this.c == aVar.c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            boolean z = this.c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "Codec(name=" + this.a + ", mimeType=" + this.b + ", supportsHighProfile=" + this.c + ')';
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.daaw.dx.a> a(int[] r16) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dx.a(int[]):java.util.List");
    }

    public static final ArrayList<String> b() {
        return kg.c("Baseline", "Main");
    }

    public static final String[] c(List<a> list) {
        ug0.f(list, "codecs");
        ArrayList arrayList = new ArrayList(lg.h(list, 10));
        for (a aVar : list) {
            arrayList.add(aVar.b());
        }
        Object[] array = arrayList.toArray(new String[0]);
        ug0.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }
}
