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
    public static qw1<String> A = new qw1<>();
    public static vw1<Boolean> B = new vw1<>();
    public Button q;
    public LinearLayout r;
    public View s;
    public StoreItem t;
    public StoreItem u;
    public StoreItem v;
    public StoreItem w;
    public TextView x;
    public final List<Object> p = new LinkedList();
    public boolean y = false;
    public int z = 0;

    public static void f(al alVar) {
        gr1.x(new hg1(), "StoreDialog", alVar);
    }

    public static /* synthetic */ int j(kz0 kz0Var, kz0 kz0Var2) {
        return (int) (wb.m(kz0Var).c() - wb.m(kz0Var2).c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        StoreItem storeItem = this.w;
        String sku = storeItem == null ? null : storeItem.getSku();
        if (!nc0.o.a(sku, Boolean.FALSE).booleanValue()) {
            gr1.j(this);
            A.a(sku);
            return;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + sku + "&package=com.daaw.avee")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(Boolean bool) {
        if (bool.booleanValue()) {
            h();
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean m(Boolean bool) {
        if (bool.booleanValue()) {
            i();
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        StoreItem storeItem = this.w;
        if (view != storeItem) {
            if (storeItem != null) {
                storeItem.setChecked(false);
            }
            StoreItem storeItem2 = (StoreItem) view;
            this.w = storeItem2;
            storeItem2.setChecked(true);
            o(this.w);
        }
    }

    public final StoreItem g(int i) {
        return i != 0 ? i != 1 ? this.v : this.u : this.t;
    }

    public final void h() {
        List<kz0> a = nc0.r.a(null);
        if (a == null || this.r == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                a.sort(new Comparator() { // from class: com.daaw.gg1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int j;
                        j = hg1.j((kz0) obj, (kz0) obj2);
                        return j;
                    }
                });
            } catch (NullPointerException unused) {
            }
        }
        int i = 0;
        for (kz0 kz0Var : a) {
            g(i).setDetails(kz0Var);
            i++;
        }
        while (i < 3) {
            g(i).setDetails(null);
            i++;
        }
        this.r.setVisibility(0);
        this.s.setVisibility(0);
        this.q.setVisibility(0);
    }

    public final void i() {
        StoreItem storeItem = this.t;
        if (storeItem != null) {
            storeItem.b();
        }
        StoreItem storeItem2 = this.u;
        if (storeItem2 != null) {
            storeItem2.b();
        }
        StoreItem storeItem3 = this.v;
        if (storeItem3 != null) {
            storeItem3.b();
        }
        StoreItem storeItem4 = this.w;
        if (storeItem4 != null) {
            o(storeItem4);
        }
        if (this.x == null) {
            return;
        }
        vw1<Boolean> vw1Var = nc0.g;
        Boolean bool = Boolean.FALSE;
        this.x.setVisibility(vw1Var.a(bool).booleanValue() && !nc0.p.a(bool).booleanValue() ? 0 : 8);
    }

    public final void o(StoreItem storeItem) {
        if (this.q == null) {
            return;
        }
        boolean booleanValue = nc0.o.a(storeItem.getSku(), Boolean.FALSE).booleanValue();
        this.q.setText(booleanValue ? R.string.store_cancel : R.string.store_1_buy);
        this.q.setActivated(booleanValue);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = View.inflate(getActivity(), R.layout.dialog_store, null);
        this.q = (Button) inflate.findViewById(R.id.btnBuy);
        this.r = (LinearLayout) inflate.findViewById(R.id.option_container_ll);
        this.s = inflate.findViewById(R.id.bottom_border);
        this.t = (StoreItem) inflate.findViewById(R.id.item_0_ll);
        this.u = (StoreItem) inflate.findViewById(R.id.item_1_ll);
        this.v = (StoreItem) inflate.findViewById(R.id.item_2_ll);
        this.x = (TextView) inflate.findViewById(R.id.legacy_warning_tv);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.cg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hg1.this.k(view);
            }
        });
        p(this.t);
        p(this.u);
        p(this.v);
        this.u.e();
        this.u.setChecked(true);
        this.w = this.u;
        nc0.q.b(new ww1.a() { // from class: com.daaw.eg1
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean l;
                l = hg1.this.l((Boolean) obj);
                return l;
            }
        }, this.p);
        h();
        nc0.n.b(new ww1.a() { // from class: com.daaw.fg1
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean m;
                m = hg1.this.m((Boolean) obj);
                return m;
            }
        }, this.p);
        i();
        return builder.setView(inflate).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        this.p.clear();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        super.onDestroyView();
    }

    public final void p(StoreItem storeItem) {
        storeItem.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.dg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hg1.this.n(view);
            }
        });
    }
}
