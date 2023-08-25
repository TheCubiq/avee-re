package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class y37 {
    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set b(Set set, ty6 ty6Var) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof v37) {
                v37 v37Var = (v37) set;
                return new v37(v37Var.p, wy6.a(v37Var.q, ty6Var));
            }
            Objects.requireNonNull(set);
            Objects.requireNonNull(ty6Var);
            return new v37(set, ty6Var);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof v37) {
            v37 v37Var2 = (v37) sortedSet;
            return new w37((SortedSet) v37Var2.p, wy6.a(v37Var2.q, ty6Var));
        }
        Objects.requireNonNull(sortedSet);
        Objects.requireNonNull(ty6Var);
        return new w37(sortedSet, ty6Var);
    }

    public static boolean c(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean d(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof f37) {
            collection = ((f37) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return e(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean e(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
