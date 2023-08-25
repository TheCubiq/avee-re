package com.daaw;

import android.content.Context;
/* loaded from: classes2.dex */
public class kj0 {

    /* renamed from: com.daaw.kj0$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1954a<T> {
        /* renamed from: a */
        String mo6592a(T t);
    }

    /* renamed from: b */
    public static C3330vh<?> m17708b(String str, String str2) {
        return C3330vh.m7166l(ij0.m19758a(str, str2), ij0.class);
    }

    /* renamed from: c */
    public static C3330vh<?> m17707c(final String str, final InterfaceC1954a<Context> interfaceC1954a) {
        return C3330vh.m7165m(ij0.class).m7156b(C3740ys.m3349j(Context.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.jj0
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                ij0 m17706d;
                m17706d = kj0.m17706d(str, interfaceC1954a, interfaceC0842bi);
                return m17706d;
            }
        }).m7155c();
    }

    /* renamed from: d */
    public static /* synthetic */ ij0 m17706d(String str, InterfaceC1954a interfaceC1954a, InterfaceC0842bi interfaceC0842bi) {
        return ij0.m19758a(str, interfaceC1954a.mo6592a((Context) interfaceC0842bi.mo12506a(Context.class)));
    }
}
