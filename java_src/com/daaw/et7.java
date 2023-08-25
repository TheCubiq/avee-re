package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class et7 extends lt7 {

    /* renamed from: c */
    public static final Class f8826c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ et7(dt7 dt7Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static List m23184f(Object obj, long j, int i) {
        bt7 bt7Var;
        List list = (List) gw7.m21170p(obj, j);
        if (list.isEmpty()) {
            List bt7Var2 = list instanceof ct7 ? new bt7(i) : ((list instanceof eu7) && (list instanceof us7)) ? ((us7) list).mo7741b(i) : new ArrayList(i);
            gw7.m21190D(obj, j, bt7Var2);
            return bt7Var2;
        }
        if (f8826c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            bt7Var = arrayList;
        } else if (!(list instanceof bw7)) {
            if ((list instanceof eu7) && (list instanceof us7)) {
                us7 us7Var = (us7) list;
                if (us7Var.zzc()) {
                    return list;
                }
                us7 mo7741b = us7Var.mo7741b(list.size() + i);
                gw7.m21190D(obj, j, mo7741b);
                return mo7741b;
            }
            return list;
        } else {
            bt7 bt7Var3 = new bt7(list.size() + i);
            bt7Var3.addAll(bt7Var3.size(), (bw7) list);
            bt7Var = bt7Var3;
        }
        gw7.m21190D(obj, j, bt7Var);
        return bt7Var;
    }

    @Override // com.daaw.lt7
    /* renamed from: a */
    public final List mo16561a(Object obj, long j) {
        return m23184f(obj, j, 10);
    }

    @Override // com.daaw.lt7
    /* renamed from: b */
    public final void mo16560b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) gw7.m21170p(obj, j);
        if (list instanceof ct7) {
            unmodifiableList = ((ct7) list).zze();
        } else if (f8826c.isAssignableFrom(list.getClass())) {
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
        gw7.m21190D(obj, j, unmodifiableList);
    }

    @Override // com.daaw.lt7
    /* renamed from: c */
    public final void mo16559c(Object obj, Object obj2, long j) {
        List list = (List) gw7.m21170p(obj2, j);
        List m23184f = m23184f(obj, j, list.size());
        int size = m23184f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            m23184f.addAll(list);
        }
        if (size > 0) {
            list = m23184f;
        }
        gw7.m21190D(obj, j, list);
    }
}
