package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class nk1 {
    public float c;
    public ik1 f;
    public final TextPaint a = new TextPaint(1);
    public final kk1 b = new a();
    public boolean d = true;
    public WeakReference<b> e = new WeakReference<>(null);

    /* loaded from: classes2.dex */
    public class a extends kk1 {
        public a() {
        }

        @Override // com.daaw.kk1
        public void a(int i) {
            nk1.this.d = true;
            b bVar = (b) nk1.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.daaw.kk1
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            nk1.this.d = true;
            b bVar = (b) nk1.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public nk1(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    public ik1 d() {
        return this.f;
    }

    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (this.d) {
            float c = c(str);
            this.c = c;
            this.d = false;
            return c;
        }
        return this.c;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(ik1 ik1Var, Context context) {
        if (this.f != ik1Var) {
            this.f = ik1Var;
            if (ik1Var != null) {
                ik1Var.k(context, this.a, this.b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                ik1Var.j(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.j(context, this.a, this.b);
    }
}
