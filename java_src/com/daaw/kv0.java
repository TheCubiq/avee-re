package com.daaw;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class kv0 {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public abstract CharSequence e(int i);

    public float f(int i) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i);

    public abstract boolean h(View view, Object obj);

    public void i(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public abstract void j(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable k();

    public abstract void l(ViewGroup viewGroup, int i, Object obj);

    public void m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public abstract void n(ViewGroup viewGroup);

    public void o(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}
