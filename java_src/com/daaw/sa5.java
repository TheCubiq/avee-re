package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbye;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class sa5 {
    @GuardedBy("this")

    /* renamed from: a */
    public final Map f26052a = new HashMap();

    @Nullable
    /* renamed from: a */
    public final synchronized ra5 m10480a(String str) {
        return (ra5) this.f26052a.get(str);
    }

    @Nullable
    /* renamed from: b */
    public final ra5 m10479b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ra5 m10480a = m10480a((String) it.next());
            if (m10480a != null) {
                return m10480a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String m10478c(String str) {
        zzbye zzbyeVar;
        ra5 m10480a = m10480a(str);
        return (m10480a == null || (zzbyeVar = m10480a.f25007b) == null) ? "" : zzbyeVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m10477d(String str, @Nullable oj6 oj6Var) {
        zzbye m14236j;
        if (this.f26052a.containsKey(str)) {
            return;
        }
        zzbye zzbyeVar = null;
        if (oj6Var != null) {
            try {
                m14236j = oj6Var.m14236j();
            } catch (wi6 unused) {
            }
            if (oj6Var != null) {
                try {
                    zzbyeVar = oj6Var.m14235k();
                } catch (wi6 unused2) {
                }
            }
            boolean z = false;
            if (((Boolean) zzba.zzc().m23658b(g93.f10828s8)).booleanValue()) {
                if (oj6Var != null) {
                    try {
                        oj6Var.m14243c();
                    } catch (wi6 unused3) {
                    }
                }
                this.f26052a.put(str, new ra5(str, m14236j, zzbyeVar, z));
            }
            z = true;
            this.f26052a.put(str, new ra5(str, m14236j, zzbyeVar, z));
        }
        m14236j = null;
        if (oj6Var != null) {
        }
        boolean z2 = false;
        if (((Boolean) zzba.zzc().m23658b(g93.f10828s8)).booleanValue()) {
        }
        z2 = true;
        this.f26052a.put(str, new ra5(str, m14236j, zzbyeVar, z2));
    }

    /* renamed from: e */
    public final synchronized void m10476e(String str, dp3 dp3Var) {
        if (this.f26052a.containsKey(str)) {
            return;
        }
        try {
            this.f26052a.put(str, new ra5(str, dp3Var.zzf(), dp3Var.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
