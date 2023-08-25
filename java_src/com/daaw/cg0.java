package com.daaw;

import androidx.work.C0511b;
import java.util.List;
/* loaded from: classes.dex */
public abstract class cg0 {

    /* renamed from: a */
    public static final String f5790a = ll0.m16883f("InputMerger");

    /* renamed from: a */
    public static cg0 m25394a(String str) {
        try {
            return (cg0) Class.forName(str).newInstance();
        } catch (Exception e) {
            ll0 m16885c = ll0.m16885c();
            String str2 = f5790a;
            m16885c.mo16881b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C0511b mo25393b(List<C0511b> list);
}
