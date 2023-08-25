package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class c51 extends AbstractC2317nn {

    /* renamed from: x */
    public int f5485x;

    /* renamed from: y */
    public int f5486y;

    /* renamed from: z */
    public LayoutInflater f5487z;

    @Deprecated
    public c51(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f5486y = i;
        this.f5485x = i;
        this.f5487z = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.daaw.AbstractC2317nn
    /* renamed from: g */
    public View mo15023g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f5487z.inflate(this.f5486y, viewGroup, false);
    }

    @Override // com.daaw.AbstractC2317nn
    /* renamed from: h */
    public View mo15022h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f5487z.inflate(this.f5485x, viewGroup, false);
    }
}
