package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0082e;
import com.daaw.ul1;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0082e.InterfaceC0084b, InterfaceC0093j, AdapterView.OnItemClickListener {

    /* renamed from: r */
    public static final int[] f279r = {16842964, 16843049};

    /* renamed from: p */
    public C0082e f280p;

    /* renamed from: q */
    public int f281q;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ul1 m8037v = ul1.m8037v(context, attributeSet, f279r, i, 0);
        if (m8037v.m8040s(0)) {
            setBackgroundDrawable(m8037v.m8052g(0));
        }
        if (m8037v.m8040s(1)) {
            setDivider(m8037v.m8052g(1));
        }
        m8037v.m8036w();
    }

    @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0084b
    /* renamed from: a */
    public boolean mo30097a(C0086g c0086g) {
        return this.f280p.m30259N(c0086g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j
    /* renamed from: b */
    public void mo347b(C0082e c0082e) {
        this.f280p = c0082e;
    }

    public int getWindowAnimations() {
        return this.f281q;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo30097a((C0086g) getAdapter().getItem(i));
    }
}
