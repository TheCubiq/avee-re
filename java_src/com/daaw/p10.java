package com.daaw;

import android.net.Uri;
import com.daaw.o10;
import com.daaw.vv0;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public final class p10<T extends o10<T, K>, K> implements vv0.a<T> {
    public final vv0.a<T> a;
    public final List<K> b;

    public p10(vv0.a<T> aVar, List<K> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // com.daaw.vv0.a
    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) {
        T a = this.a.a(uri, inputStream);
        List<K> list = this.b;
        return (list == null || list.isEmpty()) ? a : (T) a.a(this.b);
    }
}
