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
    public la p;
    public GridLayout q;
    public Group r;
    public TextView s;
    public ImageView t;
    public sv1 u = null;
    public List<Integer> v = null;
    public final View[] w = {null};
    public static sw1<iv1, Integer, Intent> x = new sw1<>();
    public static ww1<List<sv1>, lo1<Integer, List<Integer>>> y = new ww1<>();
    public static qw1<sv1> z = new qw1<>();
    public static qw1<sv1> A = new qw1<>();
    public static qw1<sv1> B = new qw1<>();
    public static rw1<sv1, List<Integer>> C = new rw1<>();
    public static rw1<iv1, sv1> D = new rw1<>();
    public static rw1<iv1, List<Integer>> E = new rw1<>();
    public static ww1<List<sv1>, ir1<List<Bitmap>>> F = new ww1<>();
    public static WeakReference<iv1> G = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.C.a(iv1.this.u, iv1.this.v);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.A.a(iv1.this.u);
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            iv1.B.a(iv1.this.u);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.D.a(iv1.e(), iv1.this.u);
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iv1.E.a(iv1.e(), iv1.this.v);
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ List p;

        public f(List list) {
            this.p = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue < this.p.size()) {
                sv1 sv1Var = (sv1) this.p.get(intValue);
                iv1 iv1Var = iv1.this;
                iv1Var.h(iv1Var.w, view, sv1Var);
                iv1.z.a(sv1Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ir1.b<List<Bitmap>> {
        public final /* synthetic */ List a;

        public g(List list) {
            this.a = list;
        }

        @Override // com.daaw.ir1.b
        /* renamed from: b */
        public void a(List<Bitmap> list, boolean z) {
            int min = Math.min(this.a.size(), list.size());
            for (int i = 0; i < min; i++) {
                ((ImageButton) this.a.get(i)).setImageBitmap(list.get(i));
            }
        }
    }

    public iv1() {
        setStyle(2, 0);
        G = new WeakReference<>(this);
    }

    public static iv1 d(Activity activity) {
        iv1 f2 = f();
        gr1.x(f2, "VisualizerChooseDialog", new al(activity));
        return f2;
    }

    public static iv1 e() {
        return G.get();
    }

    public static iv1 f() {
        iv1 iv1Var = new iv1();
        iv1Var.setArguments(new Bundle());
        return iv1Var;
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        lo1<Integer, List<Integer>> a2 = y.a(arrayList, new lo1<>(-1, new ArrayList()));
        i(a2.a.intValue(), a2.b, arrayList);
    }

    public final void h(View[] viewArr, View view, sv1 sv1Var) {
        TextView textView;
        float f2;
        this.u = sv1Var;
        gr1.t(viewArr, view);
        if (sv1Var.b) {
            this.r.setEnabled(false);
            textView = this.s;
            f2 = 0.5f;
        } else {
            this.r.setEnabled(true);
            textView = this.s;
            f2 = 1.0f;
        }
        textView.setAlpha(f2);
        this.t.setAlpha(f2);
    }

    public void i(int i, List<Integer> list, List<sv1> list2) {
        GridLayout gridLayout;
        Activity activity = getActivity();
        if (activity == null || (gridLayout = this.q) == null) {
            return;
        }
        gridLayout.removeAllViews();
        this.v = list;
        if (list == null) {
            this.v = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list2.size());
        if (list2.size() > 0) {
            f fVar = new f(list2);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sv1 sv1Var = list2.get(i2);
                View inflate = View.inflate(activity, R.layout.dialog_choose_vizstyle_element, null);
                ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btnElement);
                imageButton.setOnClickListener(fVar);
                imageButton.setTag(Integer.valueOf(i2));
                if (i == sv1Var.a) {
                    h(this.w, imageButton, sv1Var);
                }
                this.q.addView(inflate);
                arrayList.add(imageButton);
            }
        }
        F.a(list2, null).a(new g(arrayList));
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            x.a(this, Integer.valueOf(i), intent);
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
        this.q = (GridLayout) inflate.findViewById(R.id.gridLayoutElements);
        ((Group) inflate.findViewById(R.id.btnDuplicate)).setOnClickListener(new a());
        Group group = (Group) inflate.findViewById(R.id.btnRemove);
        this.r = group;
        group.setOnClickListener(new b());
        this.r.setOnLongClickListener(new c());
        this.s = (TextView) inflate.findViewById(R.id.btnRemoveTxt);
        this.t = (ImageView) inflate.findViewById(R.id.btnRemoveIcon);
        ((Group) inflate.findViewById(R.id.btnSaveToFile)).setOnClickListener(new d());
        ((Group) inflate.findViewById(R.id.btnLoadFromFile)).setOnClickListener(new e());
        la laVar = new la(2, inflate.findViewById(R.id.adView));
        this.p = laVar;
        laVar.d(25);
        getDialog().setCanceledOnTouchOutside(true);
        g();
        return inflate;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
