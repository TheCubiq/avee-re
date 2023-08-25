package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
import java.util.List;
/* renamed from: com.daaw.on */
/* loaded from: classes.dex */
public abstract class AbstractC2454on extends AbstractC3711yj implements ts1.InterfaceC3115a {

    /* renamed from: C */
    public WeakReference<oc0> f21673C;

    /* renamed from: D */
    public Cursor f21674D;

    public AbstractC2454on(Context context, String str, String str2, int i, int i2) {
        super(context, str, new tr1(str2), i, i2);
        this.f21673C = new WeakReference<>(null);
    }

    public AbstractC2454on(Context context, String str, String str2, int i, int i2, WeakReference<wc0.InterfaceC3421b> weakReference) {
        super(context, str, new tr1(str2), i, i2, weakReference);
        this.f21673C = new WeakReference<>(null);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: A */
    public boolean mo2264A() {
        oc0 m14149T = m14149T();
        if (m14149T != null) {
            m14149T.mo8846a();
            return false;
        }
        return false;
    }

    /* renamed from: P */
    public abstract lo1<Cursor, String> mo5056P(Context context);

    /* renamed from: Q */
    public lo1<Cursor, String> mo5055Q(Context context, String str) {
        return mo5056P(context);
    }

    /* renamed from: R */
    public int m14151R(int i, String str) {
        this.f21674D.moveToFirst();
        while (!this.f21674D.isAfterLast()) {
            if (this.f21674D.getString(i).equals(str)) {
                return this.f21674D.getPosition();
            }
            this.f21674D.moveToNext();
        }
        return -1;
    }

    /* renamed from: S */
    public int m14150S(String str, String str2) {
        return m14151R(this.f21674D.getColumnIndex(str), str2);
    }

    /* renamed from: T */
    public oc0 m14149T() {
        return this.f21673C.get();
    }

    /* renamed from: U */
    public Cursor m14148U(int i) {
        this.f21674D.moveToPosition(i);
        return this.f21674D;
    }

    /* renamed from: V */
    public void m14147V(Context context) {
        lo1<Cursor, String> mo5056P = mo5056P(context);
        m14146W(mo5056P.f17576a, mo5056P.f17577b);
    }

    /* renamed from: W */
    public void m14146W(Cursor cursor, String str) {
        if (m3684B(str, true)) {
            return;
        }
        dp0.m24112b(this.f21674D);
        C2691q6.m12752f(cursor);
        this.f21674D = cursor;
        oc0 m14149T = m14149T();
        if (m14149T != null) {
            m14149T.mo8846a();
        }
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0, com.daaw.ts1.InterfaceC3115a
    /* renamed from: a */
    public int mo2250a() {
        return this.f21674D.getCount();
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: f */
    public void mo2243f(oc0 oc0Var) {
        this.f21673C = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: j */
    public void mo2237j(int i, int i2, List<Integer> list) {
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: k */
    public void mo2235k() {
    }

    @Override // com.daaw.wc0
    /* renamed from: o */
    public void mo2234o(Context context, String str) {
        lo1<Cursor, String> mo5055Q = mo5055Q(context, str);
        if (mo5055Q != null) {
            m14146W(mo5055Q.f17576a, mo5055Q.f17577b);
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: r */
    public RecyclerView.AbstractC0376c0 mo2233r(ViewGroup viewGroup, int i) {
        return gt1.m21239a(viewGroup.getContext(), viewGroup, i, this);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: t */
    public int mo2232t(int i) {
        return i;
    }
}
