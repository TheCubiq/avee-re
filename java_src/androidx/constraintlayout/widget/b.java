package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.p11;
import com.daaw.p21;
import com.daaw.qj;
import com.daaw.za0;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class b extends View {
    public int[] p;
    public int q;
    public Context r;
    public za0 s;
    public boolean t;
    public String u;
    public View[] v;
    public HashMap<Integer, String> w;

    public b(Context context) {
        super(context);
        this.p = new int[32];
        this.t = false;
        this.v = null;
        this.w = new HashMap<>();
        this.r = context;
        g(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new int[32];
        this.t = false;
        this.v = null;
        this.w = new HashMap<>();
        this.r = context;
        g(attributeSet);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.r == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int f = f(trim);
        if (f != 0) {
            this.w.put(Integer.valueOf(f), trim);
            b(f);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find id of \"");
        sb.append(trim);
        sb.append("\"");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.q + 1;
        int[] iArr = this.p;
        if (i2 > iArr.length) {
            this.p = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.p;
        int i3 = this.q;
        iArr2[i3] = i;
        this.q = i3 + 1;
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    public void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.q; i++) {
            View h = constraintLayout.h(this.p[i]);
            if (h != null) {
                h.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    h.setTranslationZ(h.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.r.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f = constraintLayout.f(0, str);
            if (f instanceof Integer) {
                i = ((Integer) f).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = p11.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.r.getResources().getIdentifier(str, "id", this.r.getPackageName()) : i;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p21.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.u = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.p, this.q);
    }

    public void h(qj qjVar, boolean z) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int e;
        if (isInEditMode()) {
            setIds(this.u);
        }
        za0 za0Var = this.s;
        if (za0Var == null) {
            return;
        }
        za0Var.a();
        for (int i = 0; i < this.q; i++) {
            int i2 = this.p[i];
            View h = constraintLayout.h(i2);
            if (h == null && (e = e(constraintLayout, (str = this.w.get(Integer.valueOf(i2))))) != 0) {
                this.p[i] = e;
                this.w.put(Integer.valueOf(e), str);
                h = constraintLayout.h(e);
            }
            if (h != null) {
                this.s.c(constraintLayout.i(h));
            }
        }
        this.s.b(constraintLayout.r);
    }

    public void m() {
        if (this.s == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).n0 = (qj) this.s;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.u;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.t) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.u = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.q = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.u = null;
        this.q = 0;
        for (int i : iArr) {
            b(i);
        }
    }
}
