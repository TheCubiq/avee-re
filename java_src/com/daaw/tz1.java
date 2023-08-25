package com.daaw;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class tz1 {

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f28287a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map<tj1<?>, Boolean> f28288b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final <TResult> void m8667b(tj1<TResult> tj1Var, boolean z) {
        this.f28288b.put(tj1Var, Boolean.valueOf(z));
        tj1Var.m9082a().mo11248b(new rz1(this, tj1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8666c(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i != 1) {
            str2 = i == 3 ? " due to dead object exception." : " due to dead object exception.";
            if (str != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(str);
            }
            m8663f(true, new Status(20, sb.toString()));
        }
        str2 = " due to service disconnection.";
        sb.append(str2);
        if (str != null) {
        }
        m8663f(true, new Status(20, sb.toString()));
    }

    /* renamed from: d */
    public final void m8665d() {
        m8663f(false, z70.f34530G);
    }

    /* renamed from: e */
    public final boolean m8664e() {
        return (this.f28287a.isEmpty() && this.f28288b.isEmpty()) ? false : true;
    }

    /* renamed from: f */
    public final void m8663f(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f28287a) {
            hashMap = new HashMap(this.f28287a);
        }
        synchronized (this.f28288b) {
            hashMap2 = new HashMap(this.f28288b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m1191b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((tj1) entry2.getKey()).m9079d(new C2009l3(status));
            }
        }
    }
}
