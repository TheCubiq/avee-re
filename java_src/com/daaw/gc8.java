package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class gc8 extends zc8 {

    /* renamed from: c */
    public static final Class f11075c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ gc8(dc8 dc8Var) {
        super(null);
    }

    @Override // com.daaw.zc8
    /* renamed from: a */
    public final void mo2483a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) ih8.m19802k(obj, j);
        if (list instanceof ac8) {
            unmodifiableList = ((ac8) list).zze();
        } else if (f11075c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof ne8) && (list instanceof db8)) {
                db8 db8Var = (db8) list;
                if (db8Var.zzc()) {
                    db8Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        ih8.m19789x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.daaw.zc8
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2482b(Object obj, Object obj2, long j) {
        xb8 xb8Var;
        int size;
        List list = (List) ih8.m19802k(obj2, j);
        int size2 = list.size();
        List list2 = (List) ih8.m19802k(obj, j);
        if (!list2.isEmpty()) {
            if (f11075c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size2);
                arrayList.addAll(list2);
                xb8Var = arrayList;
            } else if (!(list2 instanceof yg8)) {
                if ((list2 instanceof ne8) && (list2 instanceof db8)) {
                    db8 db8Var = (db8) list2;
                    if (!db8Var.zzc()) {
                        list2 = db8Var.mo5295b(list2.size() + size2);
                    }
                }
                size = list2.size();
                int size3 = list.size();
                if (size > 0 && size3 > 0) {
                    list2.addAll(list);
                }
                if (size > 0) {
                    list = list2;
                }
                ih8.m19789x(obj, j, list);
            } else {
                xb8 xb8Var2 = new xb8(list2.size() + size2);
                xb8Var2.addAll(xb8Var2.size(), (yg8) list2);
                xb8Var = xb8Var2;
            }
            ih8.m19789x(obj, j, xb8Var);
            list2 = xb8Var;
            size = list2.size();
            int size32 = list.size();
            if (size > 0) {
                list2.addAll(list);
            }
            if (size > 0) {
            }
            ih8.m19789x(obj, j, list);
        }
        list2 = list2 instanceof ac8 ? new xb8(size2) : ((list2 instanceof ne8) && (list2 instanceof db8)) ? ((db8) list2).mo5295b(size2) : new ArrayList(size2);
        ih8.m19789x(obj, j, list2);
        size = list2.size();
        int size322 = list.size();
        if (size > 0) {
        }
        if (size > 0) {
        }
        ih8.m19789x(obj, j, list);
    }
}
