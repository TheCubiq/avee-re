package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.InterfaceC0093j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0093j {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j
    /* renamed from: b */
    public void mo347b(C0082e c0082e) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
