package com.daaw;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class kv0 {

    /* renamed from: a */
    public final DataSetObservable f16763a = new DataSetObservable();

    /* renamed from: b */
    public DataSetObserver f16764b;

    /* renamed from: a */
    public abstract void mo5602a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: b */
    public abstract void mo5601b(ViewGroup viewGroup);

    /* renamed from: c */
    public abstract int mo17418c();

    /* renamed from: d */
    public int m17417d(Object obj) {
        return -1;
    }

    /* renamed from: e */
    public abstract CharSequence mo17416e(int i);

    /* renamed from: f */
    public float m17415f(int i) {
        return 1.0f;
    }

    /* renamed from: g */
    public abstract Object mo5600g(ViewGroup viewGroup, int i);

    /* renamed from: h */
    public abstract boolean mo5599h(View view, Object obj);

    /* renamed from: i */
    public void m17414i(DataSetObserver dataSetObserver) {
        this.f16763a.registerObserver(dataSetObserver);
    }

    /* renamed from: j */
    public abstract void mo5598j(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: k */
    public abstract Parcelable mo5597k();

    /* renamed from: l */
    public abstract void mo5596l(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: m */
    public void m17413m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f16764b = dataSetObserver;
        }
    }

    /* renamed from: n */
    public abstract void mo5595n(ViewGroup viewGroup);

    /* renamed from: o */
    public void m17412o(DataSetObserver dataSetObserver) {
        this.f16763a.unregisterObserver(dataSetObserver);
    }
}
