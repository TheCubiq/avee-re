package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class n97 {

    /* renamed from: a */
    public final Class f19744a;

    /* renamed from: c */
    public o97 f19746c;

    /* renamed from: b */
    public ConcurrentMap f19745b = new ConcurrentHashMap();

    /* renamed from: d */
    public oh7 f19747d = oh7.f21564b;

    public /* synthetic */ n97(Class cls, m97 m97Var) {
        this.f19744a = cls;
    }

    /* renamed from: a */
    public final n97 m15378a(Object obj, cn7 cn7Var) {
        m15374e(obj, cn7Var, true);
        return this;
    }

    /* renamed from: b */
    public final n97 m15377b(Object obj, cn7 cn7Var) {
        m15374e(obj, cn7Var, false);
        return this;
    }

    /* renamed from: c */
    public final n97 m15376c(oh7 oh7Var) {
        if (this.f19745b != null) {
            this.f19747d = oh7Var;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    /* renamed from: d */
    public final s97 m15375d() {
        ConcurrentMap concurrentMap = this.f19745b;
        if (concurrentMap != null) {
            s97 s97Var = new s97(concurrentMap, this.f19746c, this.f19747d, this.f19744a, null);
            this.f19745b = null;
            return s97Var;
        }
        throw new IllegalStateException("build cannot be called twice");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n97 m15374e(Object obj, cn7 cn7Var, boolean z) {
        ByteBuffer put;
        byte[] array;
        List list;
        if (this.f19745b != null) {
            if (cn7Var.m25196U() == 3) {
                ConcurrentMap concurrentMap = this.f19745b;
                Integer valueOf = Integer.valueOf(cn7Var.m25205L());
                if (cn7Var.m25201P() == zn7.RAW) {
                    valueOf = null;
                }
                m87 m12575a = qe7.m12574b().m12575a(ef7.m23500a(cn7Var.m25204M().m15029Q(), cn7Var.m25204M().m15030P(), cn7Var.m25204M().m15033M(), cn7Var.m25201P(), valueOf), x97.m5371a());
                int ordinal = cn7Var.m25201P().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            array = i87.f13356a;
                            o97 o97Var = new o97(obj, array, cn7Var.m25196U(), cn7Var.m25201P(), cn7Var.m25205L(), m12575a);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(o97Var);
                            q97 q97Var = new q97(o97Var.m14436f(), null);
                            list = (List) concurrentMap.put(q97Var, Collections.unmodifiableList(arrayList));
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(list);
                                arrayList2.add(o97Var);
                                concurrentMap.put(q97Var, Collections.unmodifiableList(arrayList2));
                            }
                            if (z) {
                                if (this.f19746c != null) {
                                    throw new IllegalStateException("you cannot set two primary primitives");
                                }
                                this.f19746c = o97Var;
                            }
                            return this;
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    put = ByteBuffer.allocate(5).put((byte) 0);
                } else {
                    put = ByteBuffer.allocate(5).put((byte) 1);
                }
                array = put.putInt(cn7Var.m25205L()).array();
                o97 o97Var2 = new o97(obj, array, cn7Var.m25196U(), cn7Var.m25201P(), cn7Var.m25205L(), m12575a);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(o97Var2);
                q97 q97Var2 = new q97(o97Var2.m14436f(), null);
                list = (List) concurrentMap.put(q97Var2, Collections.unmodifiableList(arrayList3));
                if (list != null) {
                }
                if (z) {
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }
}
