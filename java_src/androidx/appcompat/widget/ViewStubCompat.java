package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.daaw.x21;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: p */
    public int f799p;

    /* renamed from: q */
    public int f800q;

    /* renamed from: r */
    public WeakReference<View> f801r;

    /* renamed from: s */
    public LayoutInflater f802s;

    /* renamed from: t */
    public InterfaceC0161a f803t;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0161a {
        /* renamed from: a */
        void m29940a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f799p = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.f31842Q3, i, 0);
        this.f800q = obtainStyledAttributes.getResourceId(x21.f31857T3, -1);
        this.f799p = obtainStyledAttributes.getResourceId(x21.f31852S3, 0);
        setId(obtainStyledAttributes.getResourceId(x21.f31847R3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m29941a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f799p != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f802s;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f799p, viewGroup, false);
                int i = this.f800q;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f801r = new WeakReference<>(inflate);
                InterfaceC0161a interfaceC0161a = this.f803t;
                if (interfaceC0161a != null) {
                    interfaceC0161a.m29940a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f800q;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f802s;
    }

    public int getLayoutResource() {
        return this.f799p;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f800q = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f802s = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f799p = i;
    }

    public void setOnInflateListener(InterfaceC0161a interfaceC0161a) {
        this.f803t = interfaceC0161a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f801r;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m29941a();
        }
    }
}
