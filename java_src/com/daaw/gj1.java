package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public abstract class gj1 {
    public static b d = new a();
    public View a;
    public int b;
    public b c = d;

    /* loaded from: classes.dex */
    public class a implements b {
        @Override // com.daaw.gj1.b
        public void a(boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    public gj1(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public abstract void a();

    public void b(b bVar) {
        if (bVar == null) {
            bVar = d;
        }
        this.c = bVar;
    }

    public abstract void c();

    public abstract void d();
}
