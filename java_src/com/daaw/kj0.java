package com.daaw;

import android.content.Context;
/* loaded from: classes2.dex */
public class kj0 {

    /* loaded from: classes2.dex */
    public interface a<T> {
        String a(T t);
    }

    public static vh<?> b(String str, String str2) {
        return vh.l(ij0.a(str, str2), ij0.class);
    }

    public static vh<?> c(final String str, final a<Context> aVar) {
        return vh.m(ij0.class).b(ys.j(Context.class)).e(new gi() { // from class: com.daaw.jj0
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                ij0 d;
                d = kj0.d(str, aVar, biVar);
                return d;
            }
        }).c();
    }

    public static /* synthetic */ ij0 d(String str, a aVar, bi biVar) {
        return ij0.a(str, aVar.a((Context) biVar.a(Context.class)));
    }
}
