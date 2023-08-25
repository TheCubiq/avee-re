package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.daaw.so */
/* loaded from: classes2.dex */
public class C2959so {

    /* renamed from: com.daaw.so$b */
    /* loaded from: classes2.dex */
    public static class C2961b {

        /* renamed from: a */
        public final C3330vh<?> f26436a;

        /* renamed from: b */
        public final Set<C2961b> f26437b = new HashSet();

        /* renamed from: c */
        public final Set<C2961b> f26438c = new HashSet();

        public C2961b(C3330vh<?> c3330vh) {
            this.f26436a = c3330vh;
        }

        /* renamed from: a */
        public void m10137a(C2961b c2961b) {
            this.f26437b.add(c2961b);
        }

        /* renamed from: b */
        public void m10136b(C2961b c2961b) {
            this.f26438c.add(c2961b);
        }

        /* renamed from: c */
        public C3330vh<?> m10135c() {
            return this.f26436a;
        }

        /* renamed from: d */
        public Set<C2961b> m10134d() {
            return this.f26437b;
        }

        /* renamed from: e */
        public boolean m10133e() {
            return this.f26437b.isEmpty();
        }

        /* renamed from: f */
        public boolean m10132f() {
            return this.f26438c.isEmpty();
        }

        /* renamed from: g */
        public void m10131g(C2961b c2961b) {
            this.f26438c.remove(c2961b);
        }
    }

    /* renamed from: com.daaw.so$c */
    /* loaded from: classes2.dex */
    public static class C2962c {

        /* renamed from: a */
        public final i01<?> f26439a;

        /* renamed from: b */
        public final boolean f26440b;

        public C2962c(i01<?> i01Var, boolean z) {
            this.f26439a = i01Var;
            this.f26440b = z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2962c) {
                C2962c c2962c = (C2962c) obj;
                return c2962c.f26439a.equals(this.f26439a) && c2962c.f26440b == this.f26440b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f26439a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f26440b).hashCode();
        }
    }

    /* renamed from: a */
    public static void m10140a(List<C3330vh<?>> list) {
        Set<C2961b> m10138c = m10138c(list);
        Set<C2961b> m10139b = m10139b(m10138c);
        int i = 0;
        while (!m10139b.isEmpty()) {
            C2961b next = m10139b.iterator().next();
            m10139b.remove(next);
            i++;
            for (C2961b c2961b : next.m10134d()) {
                c2961b.m10131g(next);
                if (c2961b.m10132f()) {
                    m10139b.add(c2961b);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C2961b c2961b2 : m10138c) {
            if (!c2961b2.m10132f() && !c2961b2.m10133e()) {
                arrayList.add(c2961b2.m10135c());
            }
        }
        throw new C0670at(arrayList);
    }

    /* renamed from: b */
    public static Set<C2961b> m10139b(Set<C2961b> set) {
        HashSet hashSet = new HashSet();
        for (C2961b c2961b : set) {
            if (c2961b.m10132f()) {
                hashSet.add(c2961b);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<C2961b> m10138c(List<C3330vh<?>> list) {
        Set<C2961b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C3330vh<?> c3330vh : list) {
            C2961b c2961b = new C2961b(c3330vh);
            for (i01<? super Object> i01Var : c3330vh.m7168j()) {
                C2962c c2962c = new C2962c(i01Var, !c3330vh.m7162p());
                if (!hashMap.containsKey(c2962c)) {
                    hashMap.put(c2962c, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c2962c);
                if (!set2.isEmpty() && !c2962c.f26440b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", i01Var));
                }
                set2.add(c2961b);
            }
        }
        for (Set<C2961b> set3 : hashMap.values()) {
            for (C2961b c2961b2 : set3) {
                for (C3740ys c3740ys : c2961b2.m10135c().m7171g()) {
                    if (c3740ys.m3354e() && (set = (Set) hashMap.get(new C2962c(c3740ys.m3356c(), c3740ys.m3352g()))) != null) {
                        for (C2961b c2961b3 : set) {
                            c2961b2.m10137a(c2961b3);
                            c2961b3.m10136b(c2961b2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
