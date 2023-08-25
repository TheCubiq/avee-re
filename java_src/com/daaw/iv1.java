package com.daaw;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class iv1 extends DialogFragment {

    /* renamed from: p */
    public C2022la f14034p;

    /* renamed from: q */
    public GridLayout f14035q;

    /* renamed from: r */
    public Group f14036r;

    /* renamed from: s */
    public TextView f14037s;

    /* renamed from: t */
    public ImageView f14038t;

    /* renamed from: u */
    public sv1 f14039u = null;

    /* renamed from: v */
    public List<Integer> f14040v = null;

    /* renamed from: w */
    public final View[] f14041w = {null};

    /* renamed from: x */
    public static sw1<iv1, Integer, Intent> f14031x = new sw1<>();

    /* renamed from: y */
    public static ww1<List<sv1>, lo1<Integer, List<Integer>>> f14032y = new ww1<>();

    /* renamed from: z */
    public static qw1<sv1> f14033z = new qw1<>();

    /* renamed from: A */
    public static qw1<sv1> f14024A = new qw1<>();

    /* renamed from: B */
    public static qw1<sv1> f14025B = new qw1<>();

    /* renamed from: C */
    public static rw1<sv1, List<Integer>> f14026C = new rw1<>();

    /* renamed from: D */
    public static rw1<iv1, sv1> f14027D = new rw1<>();

    /* renamed from: E */
    public static rw1<iv1, List<Integer>> f14028E = new rw1<>();

    /* renamed from: F */
    public static ww1<List<sv1>, ir1<List<Bitmap>>> f14029F = new ww1<>();

    /* renamed from: G */
    public static WeakReference<iv1> f14030G = new WeakReference<>(null);

    /* renamed from: com.daaw.iv1$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1756a implements View.OnClickListener {
        public View$OnClickListenerC1756a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.f14026C.m10862a(iv1.this.f14039u, iv1.this.f14040v);
        }
    }

    /* renamed from: com.daaw.iv1$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1757b implements View.OnClickListener {
        public View$OnClickListenerC1757b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.f14024A.m12018a(iv1.this.f14039u);
        }
    }

    /* renamed from: com.daaw.iv1$c */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC1758c implements View.OnLongClickListener {
        public View$OnLongClickListenerC1758c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            iv1.f14025B.m12018a(iv1.this.f14039u);
            return true;
        }
    }

    /* renamed from: com.daaw.iv1$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1759d implements View.OnClickListener {
        public View$OnClickListenerC1759d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.f14027D.m10862a(iv1.m19334e(), iv1.this.f14039u);
        }
    }

    /* renamed from: com.daaw.iv1$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1760e implements View.OnClickListener {
        public View$OnClickListenerC1760e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.f14028E.m10862a(iv1.m19334e(), iv1.this.f14040v);
        }
    }

    /* renamed from: com.daaw.iv1$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1761f implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ List f14047p;

        public View$OnClickListenerC1761f(List list) {
            this.f14047p = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue < this.f14047p.size()) {
                sv1 sv1Var = (sv1) this.f14047p.get(intValue);
                iv1 iv1Var = iv1.this;
                iv1Var.m19331h(iv1Var.f14041w, view, sv1Var);
                iv1.f14033z.m12018a(sv1Var);
            }
        }
    }

    /* renamed from: com.daaw.iv1$g */
    /* loaded from: classes.dex */
    public class C1762g implements ir1.InterfaceC1750b<List<Bitmap>> {

        /* renamed from: a */
        public final /* synthetic */ List f14049a;

        public C1762g(List list) {
            this.f14049a = list;
        }

        @Override // com.daaw.ir1.InterfaceC1750b
        /* renamed from: b */
        public void mo15140a(List<Bitmap> list, boolean z) {
            int min = Math.min(this.f14049a.size(), list.size());
            for (int i = 0; i < min; i++) {
                ((ImageButton) this.f14049a.get(i)).setImageBitmap(list.get(i));
            }
        }
    }

    public iv1() {
        setStyle(2, 0);
        f14030G = new WeakReference<>(this);
    }

    /* renamed from: d */
    public static iv1 m19335d(Activity activity) {
        iv1 m19333f = m19333f();
        gr1.m21311x(m19333f, "VisualizerChooseDialog", new C0645al(activity));
        return m19333f;
    }

    /* renamed from: e */
    public static iv1 m19334e() {
        return f14030G.get();
    }

    /* renamed from: f */
    public static iv1 m19333f() {
        iv1 iv1Var = new iv1();
        iv1Var.setArguments(new Bundle());
        return iv1Var;
    }

    /* renamed from: g */
    public void m19332g() {
        ArrayList arrayList = new ArrayList();
        lo1<Integer, List<Integer>> m5753a = f14032y.m5753a(arrayList, new lo1<>(-1, new ArrayList()));
        m19330i(m5753a.f17576a.intValue(), m5753a.f17577b, arrayList);
    }

    /* renamed from: h */
    public final void m19331h(View[] viewArr, View view, sv1 sv1Var) {
        TextView textView;
        float f;
        this.f14039u = sv1Var;
        gr1.m21315t(viewArr, view);
        if (sv1Var.f26666b) {
            this.f14036r.setEnabled(false);
            textView = this.f14037s;
            f = 0.5f;
        } else {
            this.f14036r.setEnabled(true);
            textView = this.f14037s;
            f = 1.0f;
        }
        textView.setAlpha(f);
        this.f14038t.setAlpha(f);
    }

    /* renamed from: i */
    public void m19330i(int i, List<Integer> list, List<sv1> list2) {
        GridLayout gridLayout;
        Activity activity = getActivity();
        if (activity == null || (gridLayout = this.f14035q) == null) {
            return;
        }
        gridLayout.removeAllViews();
        this.f14040v = list;
        if (list == null) {
            this.f14040v = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list2.size());
        if (list2.size() > 0) {
            View$OnClickListenerC1761f view$OnClickListenerC1761f = new View$OnClickListenerC1761f(list2);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sv1 sv1Var = list2.get(i2);
                View inflate = View.inflate(activity, R.layout.dialog_choose_vizstyle_element, null);
                ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btnElement);
                imageButton.setOnClickListener(view$OnClickListenerC1761f);
                imageButton.setTag(Integer.valueOf(i2));
                if (i == sv1Var.f26665a) {
                    m19331h(this.f14041w, imageButton, sv1Var);
                }
                this.f14035q.addView(inflate);
                arrayList.add(imageButton);
            }
        }
        f14029F.m5753a(list2, null).mo8856a(new C1762g(arrayList));
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            f14031x.m9795a(this, Integer.valueOf(i), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_choose_vizstyle, viewGroup, false);
        this.f14035q = (GridLayout) inflate.findViewById(R.id.gridLayoutElements);
        ((Group) inflate.findViewById(R.id.btnDuplicate)).setOnClickListener(new View$OnClickListenerC1756a());
        Group group = (Group) inflate.findViewById(R.id.btnRemove);
        this.f14036r = group;
        group.setOnClickListener(new View$OnClickListenerC1757b());
        this.f14036r.setOnLongClickListener(new View$OnLongClickListenerC1758c());
        this.f14037s = (TextView) inflate.findViewById(R.id.btnRemoveTxt);
        this.f14038t = (ImageView) inflate.findViewById(R.id.btnRemoveIcon);
        ((Group) inflate.findViewById(R.id.btnSaveToFile)).setOnClickListener(new View$OnClickListenerC1759d());
        ((Group) inflate.findViewById(R.id.btnLoadFromFile)).setOnClickListener(new View$OnClickListenerC1760e());
        C2022la c2022la = new C2022la(2, inflate.findViewById(R.id.adView));
        this.f14034p = c2022la;
        c2022la.m17075d(25);
        getDialog().setCanceledOnTouchOutside(true);
        m19332g();
        return inflate;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
