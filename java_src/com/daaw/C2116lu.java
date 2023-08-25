package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.daaw.lu */
/* loaded from: classes.dex */
public class C2116lu extends RecyclerView.AbstractC0390n implements RecyclerView.InterfaceC0399s {

    /* renamed from: e */
    public int f17780e;

    /* renamed from: f */
    public int f17781f;

    /* renamed from: g */
    public int f17782g;

    /* renamed from: j */
    public BitmapDrawable f17785j;

    /* renamed from: k */
    public Rect f17786k;

    /* renamed from: l */
    public Rect f17787l;

    /* renamed from: p */
    public InterfaceC2119c f17791p;

    /* renamed from: q */
    public boolean f17792q;

    /* renamed from: r */
    public InterfaceC2118b f17793r;

    /* renamed from: a */
    public final String f17776a = "DragSortRecycler";

    /* renamed from: b */
    public final boolean f17777b = false;

    /* renamed from: c */
    public int f17778c = 0;

    /* renamed from: d */
    public int f17779d = -1;

    /* renamed from: h */
    public float f17783h = 0.1f;

    /* renamed from: i */
    public float f17784i = 0.5f;

    /* renamed from: m */
    public float f17788m = 0.5f;

    /* renamed from: n */
    public int f17789n = 0;

    /* renamed from: o */
    public int f17790o = -1;

    /* renamed from: s */
    public View f17794s = null;

    /* renamed from: t */
    public Paint f17795t = new Paint();

    /* renamed from: u */
    public RecyclerView.AbstractC0400t f17796u = new C2117a();

    /* renamed from: com.daaw.lu$a */
    /* loaded from: classes.dex */
    public class C2117a extends RecyclerView.AbstractC0400t {
        public C2117a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0400t
        /* renamed from: a */
        public void mo552a(RecyclerView recyclerView, int i) {
            super.mo552a(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0400t
        /* renamed from: b */
        public void mo551b(RecyclerView recyclerView, int i, int i2) {
            super.mo551b(recyclerView, i, i2);
            C2116lu c2116lu = C2116lu.this;
            c2116lu.m16514o("Scrolled: " + i + " " + i2);
            C2116lu.m16517l(C2116lu.this, i2);
        }
    }

    /* renamed from: com.daaw.lu$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2118b {
        /* renamed from: a */
        void m16504a();

        /* renamed from: b */
        void m16503b();
    }

    /* renamed from: com.daaw.lu$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2119c {
        /* renamed from: a */
        void mo15549a(int i, int i2);
    }

    /* renamed from: l */
    public static /* synthetic */ int m16517l(C2116lu c2116lu, int i) {
        int i2 = c2116lu.f17780e - i;
        c2116lu.f17780e = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0399s
    /* renamed from: a */
    public void mo16524a(RecyclerView recyclerView, MotionEvent motionEvent) {
        float f;
        float height;
        m16514o("onTouchEvent");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.f17779d != -1) {
                int m16513p = m16513p(recyclerView);
                InterfaceC2119c interfaceC2119c = this.f17791p;
                if (interfaceC2119c != null) {
                    interfaceC2119c.mo15549a(this.f17779d, m16513p);
                }
            }
            this.f17794s = null;
            m16507v(false);
            this.f17779d = -1;
            this.f17785j = null;
        } else {
            int y = (int) motionEvent.getY();
            this.f17781f = y;
            if (this.f17785j != null) {
                Rect rect = this.f17787l;
                int i = y - this.f17782g;
                rect.top = i;
                if (i < (-this.f17786k.height()) / 2) {
                    this.f17787l.top = (-this.f17786k.height()) / 2;
                }
                Rect rect2 = this.f17787l;
                rect2.bottom = rect2.top + this.f17786k.height();
                this.f17785j.setBounds(this.f17787l);
            }
            float f2 = 0.0f;
            if (this.f17781f > recyclerView.getHeight() * (1.0f - this.f17783h)) {
                f = this.f17781f;
                height = recyclerView.getHeight() * (1.0f - this.f17783h);
            } else {
                if (this.f17781f < recyclerView.getHeight() * this.f17783h) {
                    f = this.f17781f;
                    height = recyclerView.getHeight() * this.f17783h;
                }
                m16514o("Scroll: " + f2);
                recyclerView.scrollBy(0, (int) (f2 * this.f17784i));
            }
            f2 = f - height;
            m16514o("Scroll: " + f2);
            recyclerView.scrollBy(0, (int) (f2 * this.f17784i));
        }
        recyclerView.m28784u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0399s
    /* renamed from: b */
    public boolean mo16523b(RecyclerView recyclerView, MotionEvent motionEvent) {
        m16514o("onInterceptTouchEvent");
        View view = this.f17794s;
        if (view == null) {
            return false;
        }
        m16514o("Started Drag");
        m16507v(true);
        this.f17785j = m16515n(view);
        int y = (int) motionEvent.getY();
        this.f17780e = y;
        this.f17782g = y - view.getTop();
        this.f17781f = this.f17780e;
        this.f17779d = recyclerView.m28829f0(view);
        m16514o("selectedDragItemPos = " + this.f17779d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0399s
    /* renamed from: c */
    public void mo16522c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0390n
    /* renamed from: e */
    public void mo16521e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0409z c0409z) {
        super.mo16521e(rect, view, recyclerView, c0409z);
        m16514o("getItemOffsets");
        m16514o("View top = " + view.getTop());
        if (this.f17779d == -1) {
            rect.top = 0;
            rect.bottom = 0;
            view.setVisibility(0);
            return;
        }
        int m28829f0 = recyclerView.m28829f0(view);
        m16514o("itemPos =" + m28829f0);
        if (m16516m(m28829f0)) {
            if (m28829f0 == this.f17779d) {
                view.setVisibility(4);
                return;
            }
            view.setVisibility(0);
            Rect rect2 = this.f17787l;
            float height = rect2.top + (rect2.height() / 2);
            if (m28829f0 > this.f17779d && view.getTop() < height) {
                float top = (height - view.getTop()) / view.getHeight();
                if (top > 1.0f) {
                    top = 1.0f;
                }
                rect.top = -((int) (this.f17787l.height() * top));
                rect.bottom = (int) (this.f17787l.height() * top);
            }
            if (m28829f0 >= this.f17779d || view.getBottom() <= height) {
                return;
            }
            float bottom = (view.getBottom() - height) / view.getHeight();
            float f = bottom <= 1.0f ? bottom : 1.0f;
            rect.top = (int) (this.f17787l.height() * f);
            rect.bottom = -((int) (this.f17787l.height() * f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0390n
    /* renamed from: i */
    public void mo16520i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0409z c0409z) {
        BitmapDrawable bitmapDrawable = this.f17785j;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f17788m * 255.0f));
            this.f17795t.setColor(this.f17789n);
            canvas.drawRect(this.f17787l, this.f17795t);
            this.f17785j.draw(canvas);
        }
    }

    /* renamed from: j */
    public void m16519j(View view) {
        this.f17794s = view;
    }

    /* renamed from: m */
    public boolean m16516m(int i) {
        return true;
    }

    /* renamed from: n */
    public final BitmapDrawable m16515n(View view) {
        this.f17786k = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        this.f17787l = new Rect(this.f17786k);
        Bitmap createBitmap = Bitmap.createBitmap(this.f17786k.width(), this.f17786k.height(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), createBitmap);
        bitmapDrawable.setBounds(this.f17787l);
        return bitmapDrawable;
    }

    /* renamed from: o */
    public final void m16514o(String str) {
    }

    /* renamed from: p */
    public final int m16513p(RecyclerView recyclerView) {
        int m28829f0;
        int m28658J = recyclerView.getLayoutManager().m28658J();
        Rect rect = this.f17787l;
        float height = rect.top + (rect.height() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < m28658J; i3++) {
            View m28659I = recyclerView.getLayoutManager().m28659I(i3);
            if (m28659I.getVisibility() == 0 && (m28829f0 = recyclerView.m28829f0(m28659I)) != this.f17779d) {
                float top = m28659I.getTop() + (m28659I.getHeight() / 2);
                if (height > top) {
                    if (m28829f0 > i) {
                        i = m28829f0;
                    }
                } else if (height <= top && m28829f0 < i2) {
                    i2 = m28829f0;
                }
            }
        }
        m16514o("above = " + i + " below = " + i2);
        int i4 = this.f17779d;
        if (i2 == Integer.MAX_VALUE) {
            return i < i4 ? i + 1 : i;
        }
        if (i2 < i4) {
            i2++;
        }
        return i2 - 1;
    }

    /* renamed from: q */
    public RecyclerView.AbstractC0400t m16512q() {
        return this.f17796u;
    }

    /* renamed from: r */
    public void m16511r(float f) {
        this.f17784i = f;
    }

    /* renamed from: s */
    public void m16510s(float f) {
        this.f17783h = f;
    }

    /* renamed from: t */
    public void m16509t(float f) {
        this.f17788m = f;
    }

    /* renamed from: u */
    public void m16508u(int i) {
        this.f17789n = i;
    }

    /* renamed from: v */
    public final void m16507v(boolean z) {
        if (z != this.f17792q) {
            this.f17792q = z;
            InterfaceC2118b interfaceC2118b = this.f17793r;
            if (interfaceC2118b != null) {
                if (z) {
                    interfaceC2118b.m16503b();
                } else {
                    interfaceC2118b.m16504a();
                }
            }
        }
    }

    /* renamed from: w */
    public void m16506w(InterfaceC2119c interfaceC2119c) {
        this.f17791p = interfaceC2119c;
    }

    /* renamed from: x */
    public void m16505x(int i) {
        this.f17790o = i;
    }
}
