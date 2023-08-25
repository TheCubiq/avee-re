package com.daaw;

import android.net.Uri;
import com.daaw.o10;
import com.daaw.vv0;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public final class p10<T extends o10<T, K>, K> implements vv0.InterfaceC3379a<T> {

    /* renamed from: a */
    public final vv0.InterfaceC3379a<T> f22194a;

    /* renamed from: b */
    public final List<K> f22195b;

    public p10(vv0.InterfaceC3379a<T> interfaceC3379a, List<K> list) {
        this.f22194a = interfaceC3379a;
        this.f22195b = list;
    }

    @Override // com.daaw.vv0.InterfaceC3379a
    /* renamed from: b */
    public T mo3834a(Uri uri, InputStream inputStream) {
        T mo3834a = this.f22194a.mo3834a(uri, inputStream);
        List<K> list = this.f22195b;
        return (list == null || list.isEmpty()) ? mo3834a : (T) mo3834a.mo5189a(this.f22195b);
    }
}
