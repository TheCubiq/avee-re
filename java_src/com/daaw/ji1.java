package com.daaw;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* loaded from: classes.dex */
public interface ji1 extends Closeable {
    /* renamed from: B */
    Cursor mo18504B(String str);

    /* renamed from: C */
    void mo18503C();

    /* renamed from: G */
    String mo18502G();

    /* renamed from: H */
    boolean mo18501H();

    /* renamed from: I */
    Cursor mo18500I(mi1 mi1Var);

    /* renamed from: a */
    void mo18499a();

    /* renamed from: f */
    boolean mo18498f();

    /* renamed from: g */
    List<Pair<String, String>> mo18497g();

    /* renamed from: h */
    void mo18496h(String str);

    /* renamed from: k */
    ni1 mo18495k(String str);

    /* renamed from: s */
    void mo18494s();

    /* renamed from: t */
    void mo18493t(String str, Object[] objArr);

    /* renamed from: z */
    Cursor mo18492z(mi1 mi1Var, CancellationSignal cancellationSignal);
}
