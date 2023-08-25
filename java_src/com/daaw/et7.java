package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class et7 extends lt7 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ et7(dt7 dt7Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List f(Object obj, long j, int i) {
        bt7 bt7Var;
        List list = (List) gw7.p(obj, j);
        if (list.isEmpty()) {
            List bt7Var2 = list instanceof ct7 ? new bt7(i) : ((list instanceof eu7) && (list instanceof us7)) ? ((us7) list).b(i) : new ArrayList(i);
            gw7.D(obj, j, bt7Var2);
            return bt7Var2;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            bt7Var = arrayList;
        } else if (!(list instanceof bw7)) {
            if ((list instanceof eu7) && (list instanceof us7)) {
                us7 us7Var = (us7) list;
                if (us7Var.zzc()) {
                    return list;
                }
                us7 b = us7Var.b(list.size() + i);
                gw7.D(obj, j, b);
                return b;
            }
            return list;
        } else {
            bt7 bt7Var3 = new bt7(list.size() + i);
            bt7Var3.addAll(bt7Var3.size(), (bw7) list);
            bt7Var = bt7Var3;
        }
        gw7.D(obj, j, bt7Var);
        return bt7Var;
    }

    @Override // com.daaw.lt7
    public final List a(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // com.daaw.lt7
    public final void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) gw7.p(obj, j);
        if (list instanceof ct7) {
            unmodifiableList = ((ct7) list).zze();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof eu7) && (list instanceof us7)) {
                us7 us7Var = (us7) list;
                if (us7Var.zzc()) {
                    us7Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        gw7.D(obj, j, unmodifiableList);
    }

    @Override // com.daaw.lt7
    public final void c(Object obj, Object obj2, long j) {
        List list = (List) gw7.p(obj2, j);
        List f = f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        gw7.D(obj, j, list);
    }
}
