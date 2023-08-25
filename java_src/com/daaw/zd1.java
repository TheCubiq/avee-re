package com.daaw;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0443g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class zd1 extends LinearLayoutManager {

    /* renamed from: com.daaw.zd1$a */
    /* loaded from: classes2.dex */
    public class C3829a extends C0443g {
        public C3829a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0443g
        /* renamed from: v */
        public float mo2468v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public zd1(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0391o
    /* renamed from: I1 */
    public void mo2469I1(RecyclerView recyclerView, RecyclerView.C0409z c0409z, int i) {
        C3829a c3829a = new C3829a(recyclerView.getContext());
        c3829a.m28504p(i);
        m28657J1(c3829a);
    }
}
