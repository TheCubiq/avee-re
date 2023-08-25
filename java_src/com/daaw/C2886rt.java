package com.daaw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* renamed from: com.daaw.rt */
/* loaded from: classes.dex */
public final class C2886rt<T> {

    /* renamed from: a */
    public final by0<ArrayList<T>> f25578a = new dy0(10);

    /* renamed from: b */
    public final cd1<T, ArrayList<T>> f25579b = new cd1<>();

    /* renamed from: c */
    public final ArrayList<T> f25580c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f25581d = new HashSet<>();

    /* renamed from: a */
    public void m10972a(T t, T t2) {
        if (!this.f25579b.containsKey(t) || !this.f25579b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f25579b.get(t);
        if (arrayList == null) {
            arrayList = m10967f();
            this.f25579b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void m10971b(T t) {
        if (this.f25579b.containsKey(t)) {
            return;
        }
        this.f25579b.put(t, null);
    }

    /* renamed from: c */
    public void m10970c() {
        int size = this.f25579b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m25432m = this.f25579b.m25432m(i);
            if (m25432m != null) {
                m10962k(m25432m);
            }
        }
        this.f25579b.clear();
    }

    /* renamed from: d */
    public boolean m10969d(T t) {
        return this.f25579b.containsKey(t);
    }

    /* renamed from: e */
    public final void m10968e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f25579b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m10968e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    /* renamed from: f */
    public final ArrayList<T> m10967f() {
        ArrayList<T> mo22136b = this.f25578a.mo22136b();
        return mo22136b == null ? new ArrayList<>() : mo22136b;
    }

    /* renamed from: g */
    public List m10966g(T t) {
        return this.f25579b.get(t);
    }

    /* renamed from: h */
    public List<T> m10965h(T t) {
        int size = this.f25579b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m25432m = this.f25579b.m25432m(i);
            if (m25432m != null && m25432m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f25579b.m25436i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m10964i() {
        this.f25580c.clear();
        this.f25581d.clear();
        int size = this.f25579b.size();
        for (int i = 0; i < size; i++) {
            m10968e(this.f25579b.m25436i(i), this.f25580c, this.f25581d);
        }
        return this.f25580c;
    }

    /* renamed from: j */
    public boolean m10963j(T t) {
        int size = this.f25579b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m25432m = this.f25579b.m25432m(i);
            if (m25432m != null && m25432m.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void m10962k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f25578a.mo22137a(arrayList);
    }
}
