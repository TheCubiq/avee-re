package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.avee.comp.InAppBilling.StoreItem;
import com.daaw.ww1;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class hg1 extends DialogFragment {

    /* renamed from: A */
    public static qw1<String> f12513A = new qw1<>();

    /* renamed from: B */
    public static vw1<Boolean> f12514B = new vw1<>();

    /* renamed from: q */
    public Button f12516q;

    /* renamed from: r */
    public LinearLayout f12517r;

    /* renamed from: s */
    public View f12518s;

    /* renamed from: t */
    public StoreItem f12519t;

    /* renamed from: u */
    public StoreItem f12520u;

    /* renamed from: v */
    public StoreItem f12521v;

    /* renamed from: w */
    public StoreItem f12522w;

    /* renamed from: x */
    public TextView f12523x;

    /* renamed from: p */
    public final List<Object> f12515p = new LinkedList();

    /* renamed from: y */
    public boolean f12524y = false;

    /* renamed from: z */
    public int f12525z = 0;

    /* renamed from: f */
    public static void m20813f(C0645al c0645al) {
        gr1.m21311x(new hg1(), "StoreDialog", c0645al);
    }

    /* renamed from: j */
    public static /* synthetic */ int m20809j(kz0 kz0Var, kz0 kz0Var2) {
        return (int) (C3412wb.m6241m(kz0Var).m17303c() - C3412wb.m6241m(kz0Var2).m17303c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m20808k(View view) {
        StoreItem storeItem = this.f12522w;
        String sku = storeItem == null ? null : storeItem.getSku();
        if (!nc0.f19997o.m5753a(sku, Boolean.FALSE).booleanValue()) {
            gr1.m21325j(this);
            f12513A.m12018a(sku);
            return;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + sku + "&package=com.daaw.avee")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m20807l(Boolean bool) {
        if (bool.booleanValue()) {
            m20811h();
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Boolean m20806m(Boolean bool) {
        if (bool.booleanValue()) {
            m20810i();
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m20805n(View view) {
        StoreItem storeItem = this.f12522w;
        if (view != storeItem) {
            if (storeItem != null) {
                storeItem.setChecked(false);
            }
            StoreItem storeItem2 = (StoreItem) view;
            this.f12522w = storeItem2;
            storeItem2.setChecked(true);
            m20804o(this.f12522w);
        }
    }

    /* renamed from: g */
    public final StoreItem m20812g(int i) {
        return i != 0 ? i != 1 ? this.f12521v : this.f12520u : this.f12519t;
    }

    /* renamed from: h */
    public final void m20811h() {
        List<kz0> m6692a = nc0.f20000r.m6692a(null);
        if (m6692a == null || this.f12517r == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                m6692a.sort(new Comparator() { // from class: com.daaw.gg1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m20809j;
                        m20809j = hg1.m20809j((kz0) obj, (kz0) obj2);
                        return m20809j;
                    }
                });
            } catch (NullPointerException unused) {
            }
        }
        int i = 0;
        for (kz0 kz0Var : m6692a) {
            m20812g(i).setDetails(kz0Var);
            i++;
        }
        while (i < 3) {
            m20812g(i).setDetails(null);
            i++;
        }
        this.f12517r.setVisibility(0);
        this.f12518s.setVisibility(0);
        this.f12516q.setVisibility(0);
    }

    /* renamed from: i */
    public final void m20810i() {
        StoreItem storeItem = this.f12519t;
        if (storeItem != null) {
            storeItem.m26857b();
        }
        StoreItem storeItem2 = this.f12520u;
        if (storeItem2 != null) {
            storeItem2.m26857b();
        }
        StoreItem storeItem3 = this.f12521v;
        if (storeItem3 != null) {
            storeItem3.m26857b();
        }
        StoreItem storeItem4 = this.f12522w;
        if (storeItem4 != null) {
            m20804o(storeItem4);
        }
        if (this.f12523x == null) {
            return;
        }
        vw1<Boolean> vw1Var = nc0.f19989g;
        Boolean bool = Boolean.FALSE;
        this.f12523x.setVisibility(vw1Var.m6692a(bool).booleanValue() && !nc0.f19998p.m6692a(bool).booleanValue() ? 0 : 8);
    }

    /* renamed from: o */
    public final void m20804o(StoreItem storeItem) {
        if (this.f12516q == null) {
            return;
        }
        boolean booleanValue = nc0.f19997o.m5753a(storeItem.getSku(), Boolean.FALSE).booleanValue();
        this.f12516q.setText(booleanValue ? R.string.store_cancel : R.string.store_1_buy);
        this.f12516q.setActivated(booleanValue);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_store, null);
        this.f12516q = (Button) inflate.findViewById(R.id.btnBuy);
        this.f12517r = (LinearLayout) inflate.findViewById(R.id.option_container_ll);
        this.f12518s = inflate.findViewById(R.id.bottom_border);
        this.f12519t = (StoreItem) inflate.findViewById(R.id.item_0_ll);
        this.f12520u = (StoreItem) inflate.findViewById(R.id.item_1_ll);
        this.f12521v = (StoreItem) inflate.findViewById(R.id.item_2_ll);
        this.f12523x = (TextView) inflate.findViewById(R.id.legacy_warning_tv);
        this.f12516q.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.cg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hg1.this.m20808k(view);
            }
        });
        m20803p(this.f12519t);
        m20803p(this.f12520u);
        m20803p(this.f12521v);
        this.f12520u.m26854e();
        this.f12520u.setChecked(true);
        this.f12522w = this.f12520u;
        nc0.f19999q.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.eg1
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m20807l;
                m20807l = hg1.this.m20807l((Boolean) obj);
                return m20807l;
            }
        }, this.f12515p);
        m20811h();
        nc0.f19996n.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.fg1
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m20806m;
                m20806m = hg1.this.m20806m((Boolean) obj);
                return m20806m;
            }
        }, this.f12515p);
        m20810i();
        return builder.setView(inflate).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        this.f12515p.clear();
        this.f12517r = null;
        this.f12518s = null;
        this.f12519t = null;
        this.f12520u = null;
        this.f12521v = null;
        this.f12522w = null;
        this.f12523x = null;
        super.onDestroyView();
    }

    /* renamed from: p */
    public final void m20803p(StoreItem storeItem) {
        storeItem.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.dg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hg1.this.m20805n(view);
            }
        });
    }
}
