package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.s21;
import com.daaw.s30;
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0306f implements LayoutInflater.Factory2 {

    /* renamed from: p */
    public final FragmentManager f1594p;

    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0307a implements View.OnAttachStateChangeListener {

        /* renamed from: p */
        public final /* synthetic */ C0310h f1595p;

        public View$OnAttachStateChangeListenerC0307a(C0310h c0310h) {
            this.f1595p = c0310h;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m29187k = this.f1595p.m29187k();
            this.f1595p.m29185m();
            AbstractC0325l.m29094n((ViewGroup) m29187k.f1376W.getParent(), LayoutInflater$Factory2C0306f.this.f1594p).m29098j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflater$Factory2C0306f(FragmentManager fragmentManager) {
        this.f1594p = fragmentManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0310h m29283v;
        StringBuilder sb;
        String str2;
        View view2;
        if (s30.class.getName().equals(str)) {
            return new s30(context, attributeSet, this.f1594p);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s21.f25804d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(s21.f25805e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(s21.f25806f, -1);
        String string = obtainStyledAttributes.getString(s21.f25807g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0304d.m29218b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment m29319g0 = resourceId != -1 ? this.f1594p.m29319g0(resourceId) : null;
        if (m29319g0 == null && string != null) {
            m29319g0 = this.f1594p.m29316h0(string);
        }
        if (m29319g0 == null && id != -1) {
            m29319g0 = this.f1594p.m29319g0(id);
        }
        if (m29319g0 == null) {
            m29319g0 = this.f1594p.m29294p0().mo29219a(context.getClassLoader(), attributeValue);
            m29319g0.f1356C = true;
            m29319g0.f1365L = resourceId != 0 ? resourceId : id;
            m29319g0.f1366M = id;
            m29319g0.f1367N = string;
            m29319g0.f1357D = true;
            FragmentManager fragmentManager = this.f1594p;
            m29319g0.f1361H = fragmentManager;
            m29319g0.f1362I = fragmentManager.m29288s0();
            m29319g0.m29500A0(this.f1594p.m29288s0().m29214k(), attributeSet, m29319g0.f1396q);
            m29283v = this.f1594p.m29320g(m29319g0);
            if (FragmentManager.m29381E0(2)) {
                sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(m29319g0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
            }
            m29319g0.f1375V = (ViewGroup) view;
            m29283v.m29185m();
            m29283v.m29188j();
            view2 = m29319g0.f1376W;
            if (view2 != null) {
                throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
            }
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (m29319g0.f1376W.getTag() == null) {
                m29319g0.f1376W.setTag(string);
            }
            m29319g0.f1376W.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0307a(m29283v));
            return m29319g0.f1376W;
        } else if (m29319g0.f1357D) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        } else {
            m29319g0.f1357D = true;
            FragmentManager fragmentManager2 = this.f1594p;
            m29319g0.f1361H = fragmentManager2;
            m29319g0.f1362I = fragmentManager2.m29288s0();
            m29319g0.m29500A0(this.f1594p.m29288s0().m29214k(), attributeSet, m29319g0.f1396q);
            m29283v = this.f1594p.m29283v(m29319g0);
            if (FragmentManager.m29381E0(2)) {
                sb = new StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(m29319g0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
            }
            m29319g0.f1375V = (ViewGroup) view;
            m29283v.m29185m();
            m29283v.m29188j();
            view2 = m29319g0.f1376W;
            if (view2 != null) {
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
