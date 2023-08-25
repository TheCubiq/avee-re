package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class lu extends RecyclerView.n implements RecyclerView.s {
    public int e;
    public int f;
    public int g;
    public BitmapDrawable j;
    public Rect k;
    public Rect l;
    public c p;
    public boolean q;
    public b r;
    public final String a = "DragSortRecycler";
    public final boolean b = false;
    public int c = 0;
    public int d = -1;
    public float h = 0.1f;
    public float i = 0.5f;
    public float m = 0.5f;
    public int n = 0;
    public int o = -1;
    public View s = null;
    public Paint t = new Paint();
    public RecyclerView.t u = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            super.b(recyclerView, i, i2);
            lu luVar = lu.this;
            luVar.o("Scrolled: " + i + " " + i2);
            lu.l(lu.this, i2);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i, int i2);
    }

    public static /* synthetic */ int l(lu luVar, int i) {
        int i2 = luVar.e - i;
        luVar.e = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        float f;
        float height;
        o("onTouchEvent");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.d != -1) {
                int p = p(recyclerView);
                c cVar = this.p;
                if (cVar != null) {
                    cVar.a(this.d, p);
                }
            }
            this.s = null;
            v(false);
            this.d = -1;
            this.j = null;
        } else {
            int y = (int) motionEvent.getY();
            this.f = y;
            if (this.j != null) {
                Rect rect = this.l;
                int i = y - this.g;
                rect.top = i;
                if (i < (-this.k.height()) / 2) {
                    this.l.top = (-this.k.height()) / 2;
                }
                Rect rect2 = this.l;
                rect2.bottom = rect2.top + this.k.height();
                this.j.setBounds(this.l);
            }
            float f2 = 0.0f;
            if (this.f > recyclerView.getHeight() * (1.0f - this.h)) {
                f = this.f;
                height = recyclerView.getHeight() * (1.0f - this.h);
            } else {
                if (this.f < recyclerView.getHeight() * this.h) {
                    f = this.f;
                    height = recyclerView.getHeight() * this.h;
                }
                o("Scroll: " + f2);
                recyclerView.scrollBy(0, (int) (f2 * this.i));
            }
            f2 = f - height;
            o("Scroll: " + f2);
            recyclerView.scrollBy(0, (int) (f2 * this.i));
        }
        recyclerView.u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        o("onInterceptTouchEvent");
        View view = this.s;
        if (view == null) {
            return false;
        }
        o("Started Drag");
        v(true);
        this.j = n(view);
        int y = (int) motionEvent.getY();
        this.e = y;
        this.g = y - view.getTop();
        this.f = this.e;
        this.d = recyclerView.f0(view);
        o("selectedDragItemPos = " + this.d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.e(rect, view, recyclerView, zVar);
        o("getItemOffsets");
        o("View top = " + view.getTop());
        if (this.d == -1) {
            rect.top = 0;
            rect.bottom = 0;
            view.setVisibility(0);
            return;
        }
        int f0 = recyclerView.f0(view);
        o("itemPos =" + f0);
        if (m(f0)) {
            if (f0 == this.d) {
                view.setVisibility(4);
                return;
            }
            view.setVisibility(0);
            Rect rect2 = this.l;
            float height = rect2.top + (rect2.height() / 2);
            if (f0 > this.d && view.getTop() < height) {
                float top = (height - view.getTop()) / view.getHeight();
                if (top > 1.0f) {
                    top = 1.0f;
                }
                rect.top = -((int) (this.l.height() * top));
                rect.bottom = (int) (this.l.height() * top);
            }
            if (f0 >= this.d || view.getBottom() <= height) {
                return;
            }
            float bottom = (view.getBottom() - height) / view.getHeight();
            float f = bottom <= 1.0f ? bottom : 1.0f;
            rect.top = (int) (this.l.height() * f);
            rect.bottom = -((int) (this.l.height() * f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        BitmapDrawable bitmapDrawable = this.j;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.m * 255.0f));
            this.t.setColor(this.n);
            canvas.drawRect(this.l, this.t);
            this.j.draw(canvas);
        }
    }

    public void j(View view) {
        this.s = view;
    }

    public boolean m(int i) {
        return true;
    }

    public final BitmapDrawable n(View view) {
        this.k = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        this.l = new Rect(this.k);
        Bitmap createBitmap = Bitmap.createBitmap(this.k.width(), this.k.height(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), createBitmap);
        bitmapDrawable.setBounds(this.l);
        return bitmapDrawable;
    }

    public final void o(String str) {
    }

    public final int p(RecyclerView recyclerView) {
        int f0;
        int J = recyclerView.getLayoutManager().J();
        Rect rect = this.l;
        float height = rect.top + (rect.height() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < J; i3++) {
            View I = recyclerView.getLayoutManager().I(i3);
            if (I.getVisibility() == 0 && (f0 = recyclerView.f0(I)) != this.d) {
                float top = I.getTop() + (I.getHeight() / 2);
                if (height > top) {
                    if (f0 > i) {
                        i = f0;
                    }
                } else if (height <= top && f0 < i2) {
                    i2 = f0;
                }
            }
        }
        o("above = " + i + " below = " + i2);
        int i4 = this.d;
        if (i2 == Integer.MAX_VALUE) {
            return i < i4 ? i + 1 : i;
        }
        if (i2 < i4) {
            i2++;
        }
        return i2 - 1;
    }

    public RecyclerView.t q() {
        return this.u;
    }

    public void r(float f) {
        this.i = f;
    }

    public void s(float f) {
        this.h = f;
    }

    public void t(float f) {
        this.m = f;
    }

    public void u(int i) {
        this.n = i;
    }

    public final void v(boolean z) {
        if (z != this.q) {
            this.q = z;
            b bVar = this.r;
            if (bVar != null) {
                if (z) {
                    bVar.b();
                } else {
                    bVar.a();
                }
            }
        }
    }

    public void w(c cVar) {
        this.p = cVar;
    }

    public void x(int i) {
        this.o = i;
    }
}
