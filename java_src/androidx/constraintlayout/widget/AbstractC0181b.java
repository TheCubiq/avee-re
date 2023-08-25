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
import com.daaw.C2716qj;
import com.daaw.p11;
import com.daaw.p21;
import com.daaw.za0;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0181b extends View {

    /* renamed from: p */
    public int[] f982p;

    /* renamed from: q */
    public int f983q;

    /* renamed from: r */
    public Context f984r;

    /* renamed from: s */
    public za0 f985s;

    /* renamed from: t */
    public boolean f986t;

    /* renamed from: u */
    public String f987u;

    /* renamed from: v */
    public View[] f988v;

    /* renamed from: w */
    public HashMap<Integer, String> f989w;

    public AbstractC0181b(Context context) {
        super(context);
        this.f982p = new int[32];
        this.f986t = false;
        this.f988v = null;
        this.f989w = new HashMap<>();
        this.f984r = context;
        mo12220g(null);
    }

    public AbstractC0181b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f982p = new int[32];
        this.f986t = false;
        this.f988v = null;
        this.f989w = new HashMap<>();
        this.f984r = context;
        mo12220g(attributeSet);
    }

    /* renamed from: a */
    public final void m29872a(String str) {
        if (str == null || str.length() == 0 || this.f984r == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int m29867f = m29867f(trim);
        if (m29867f != 0) {
            this.f989w.put(Integer.valueOf(m29867f), trim);
            m29871b(m29867f);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find id of \"");
        sb.append(trim);
        sb.append("\"");
    }

    /* renamed from: b */
    public final void m29871b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f983q + 1;
        int[] iArr = this.f982p;
        if (i2 > iArr.length) {
            this.f982p = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f982p;
        int i3 = this.f983q;
        iArr2[i3] = i;
        this.f983q = i3 + 1;
    }

    /* renamed from: c */
    public void m29870c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m29869d((ConstraintLayout) parent);
    }

    /* renamed from: d */
    public void m29869d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f983q; i++) {
            View m29890h = constraintLayout.m29890h(this.f982p[i]);
            if (m29890h != null) {
                m29890h.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    m29890h.setTranslationZ(m29890h.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: e */
    public final int m29868e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f984r.getResources()) == null) {
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

    /* renamed from: f */
    public final int m29867f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m29892f = constraintLayout.m29892f(0, str);
            if (m29892f instanceof Integer) {
                i = ((Integer) m29892f).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m29868e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = p11.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f984r.getResources().getIdentifier(str, "id", this.f984r.getPackageName()) : i;
    }

    /* renamed from: g */
    public void mo12220g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p21.f22371a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.f22452m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f987u = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f982p, this.f983q);
    }

    /* renamed from: h */
    public void mo29866h(C2716qj c2716qj, boolean z) {
    }

    /* renamed from: i */
    public void mo29865i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: j */
    public void m29864j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m29863k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m29862l(ConstraintLayout constraintLayout) {
        String str;
        int m29868e;
        if (isInEditMode()) {
            setIds(this.f987u);
        }
        za0 za0Var = this.f985s;
        if (za0Var == null) {
            return;
        }
        za0Var.mo2579a();
        for (int i = 0; i < this.f983q; i++) {
            int i2 = this.f982p[i];
            View m29890h = constraintLayout.m29890h(i2);
            if (m29890h == null && (m29868e = m29868e(constraintLayout, (str = this.f989w.get(Integer.valueOf(i2))))) != 0) {
                this.f982p[i] = m29868e;
                this.f989w.put(Integer.valueOf(m29868e), str);
                m29890h = constraintLayout.m29890h(m29868e);
            }
            if (m29890h != null) {
                this.f985s.mo2577c(constraintLayout.m29889i(m29890h));
            }
        }
        this.f985s.mo2578b(constraintLayout.f880r);
    }

    /* renamed from: m */
    public void m29861m() {
        if (this.f985s == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0175b) {
            ((ConstraintLayout.C0175b) layoutParams).f943n0 = (C2716qj) this.f985s;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f987u;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f986t) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f987u = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f983q = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m29872a(str.substring(i));
                return;
            } else {
                m29872a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f987u = null;
        this.f983q = 0;
        for (int i : iArr) {
            m29871b(i);
        }
    }
}
