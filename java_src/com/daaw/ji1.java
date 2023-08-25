package com.daaw;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* loaded from: classes.dex */
public interface ji1 extends Closeable {
    Cursor B(String str);

    void C();

    String G();

    boolean H();

    Cursor I(mi1 mi1Var);

    void a();

    boolean f();

    List<Pair<String, String>> g();

    void h(String str);

    ni1 k(String str);

    void s();

    void t(String str, Object[] objArr);

    Cursor z(mi1 mi1Var, CancellationSignal cancellationSignal);
}
