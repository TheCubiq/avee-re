package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class c51 extends nn {
    public int x;
    public int y;
    public LayoutInflater z;

    @Deprecated
    public c51(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.y = i;
        this.x = i;
        this.z = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.daaw.nn
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.z.inflate(this.y, viewGroup, false);
    }

    @Override // com.daaw.nn
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.z.inflate(this.x, viewGroup, false);
    }
}
