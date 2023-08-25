package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.ho;
import com.daaw.lu;
import com.daaw.wn;
import com.daaw.xn;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class io {
    public ScrollView a;
    public RecyclerView b;
    public View c;
    public View d;
    public View e;
    public ImageButton f;
    public ImageButton g;
    public GridLayout h;
    public wn i;
    public xn j;
    public final List<ho.i> k = new ArrayList();
    public int l = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            io.this.e.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            io.this.a.fullScroll(130);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            io.this.d.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            io.this.a.fullScroll(130);
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            io.this.h();
            io.this.A();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            io.this.g();
            io.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ Activity p;

        public g(Activity activity) {
            this.p = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            ho.E.a(new al(this.p), Integer.valueOf(k.z), k.y);
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public final /* synthetic */ String[] p;

        public h(String[] strArr) {
            this.p = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ho k = ho.k();
            if (k == null) {
                return;
            }
            int intValue = ((Integer) view.getTag()).intValue();
            String[] strArr = this.p;
            if (intValue < strArr.length) {
                ho.F.a(new al(view), Integer.valueOf(k.z), Integer.valueOf(io.this.l), k.y, strArr[intValue]);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements w40<Boolean> {
        public i() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(io.this.i.y());
        }
    }

    /* loaded from: classes.dex */
    public class j implements lu.c {
        public j() {
        }

        @Override // com.daaw.lu.c
        public void a(int i, int i2) {
            int min = Math.min(io.this.k.size() - 1, Math.max(i2, 1));
            if (i == min) {
                return;
            }
            ho.i iVar = null;
            io ioVar = io.this;
            int i3 = ioVar.l;
            if (i3 >= 0 && i3 < ioVar.k.size()) {
                iVar = (ho.i) io.this.k.get(io.this.l);
            }
            io.this.k.remove(i);
            io.this.k.add(min, (ho.i) io.this.k.get(i));
            io ioVar2 = io.this;
            ioVar2.l = iVar != null ? ioVar2.k.indexOf(iVar) : -1;
            io ioVar3 = io.this;
            ioVar3.D(ioVar3.k, true);
        }
    }

    /* loaded from: classes.dex */
    public class k implements wn.c {
        public final /* synthetic */ lu a;

        public k(lu luVar) {
            this.a = luVar;
        }

        @Override // com.daaw.wn.c
        public void a(View view) {
            this.a.j(view);
        }
    }

    /* loaded from: classes.dex */
    public class l implements wn.d {
        public l() {
        }

        @Override // com.daaw.wn.d
        public boolean a(int i, View view) {
            ho k = ho.k();
            if (k == null) {
                return false;
            }
            k.m(1);
            io.this.s(i, true);
            io.this.j.H(i, view);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class m implements wn.d {
        public m() {
        }

        @Override // com.daaw.wn.d
        public boolean a(int i, View view) {
            ho k = ho.k();
            if (k == null) {
                return false;
            }
            k.m(1);
            io.this.s(i, true);
            io.this.j.H(i, view);
            return true;
        }
    }

    public static String C(String str, Context context) {
        int i2;
        return (context != null && (i2 = i(str)) > 0) ? context.getString(i2) : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int i(String str) {
        char c2;
        str.hashCode();
        switch (str.hashCode()) {
            case -2120941625:
                if (str.equals("AudioProvider")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2063072:
                if (str.equals("Bars")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 2603341:
                if (str.equals("Text")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 69447262:
                if (str.equals("RgbSplitEffect")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 70760763:
                if (str.equals("Image")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 197757176:
                if (str.equals("BlurEffect")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 203653773:
                if (str.equals("Particles")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 828944778:
                if (str.equals("Composition")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 870470476:
                if (str.equals("AppLogo")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1176394320:
                if (str.equals("MirrorEffect")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1465180494:
                if (str.equals("MotionBlurEffect")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return R.string.add_audio_data_provider;
            case 1:
                return R.string.add_segment;
            case 2:
                return R.string.add_text;
            case 3:
                return R.string.add_rgb_split_effect;
            case 4:
                return R.string.add_image;
            case 5:
                return R.string.add_blur_effect;
            case 6:
                return R.string.add_particles;
            case 7:
                return R.string.add_composition;
            case '\b':
                return R.string.title_app_logo;
            case '\t':
                return R.string.add_mirror_effect;
            case '\n':
                return R.string.add_motion_blur_effect;
            default:
                return -1;
        }
    }

    public static void p(rn rnVar, List<ho.i> list) {
        int c2 = rnVar.c();
        for (int i2 = 0; i2 < c2; i2++) {
            un a2 = rnVar.a(i2);
            if (a2 == null) {
                lz1.c("CustomPropertiesList is null");
            } else {
                list.add(new ho.i(C(a2.B(), dx0.c()), a2, a2.r("_id", -1)));
            }
        }
    }

    public final void A() {
        if (this.e.getVisibility() == 0) {
            g();
        } else {
            n();
        }
    }

    public final void B() {
        if (this.d.getVisibility() == 0) {
            h();
        } else {
            o();
        }
    }

    public final void D(List<ho.i> list, boolean z) {
        ho k2 = ho.k();
        if (k2 == null) {
            return;
        }
        t(k2.y, list);
        y(this.l);
        k2.r(z);
    }

    public void E(int i2) {
        if (i2 < 0 || i2 >= this.k.size()) {
            return;
        }
        ho.i iVar = this.k.get(i2);
        this.j.B(i2, new lo1<>(iVar.a, iVar.c()));
    }

    public final void g() {
        ho k2 = ho.k();
        if (k2 == null) {
            return;
        }
        this.g.animate().rotation(0.0f).setDuration(k2.p);
        this.e.animate().alpha(0.0f).setDuration(k2.p).withEndAction(new a());
    }

    public final void h() {
        ho k2 = ho.k();
        if (k2 == null) {
            return;
        }
        this.f.animate().rotation(0.0f).setDuration(k2.p);
        this.d.animate().alpha(0.0f).setDuration(k2.p).withEndAction(new c());
    }

    public ho.i j(int i2) {
        if (i2 < 0 || i2 >= this.k.size()) {
            return null;
        }
        return this.k.get(i2);
    }

    public boolean k() {
        wn wnVar = this.i;
        boolean z = wnVar == null || wnVar.y();
        View view = this.c;
        return (view == null || view.getVisibility() == 8) && z;
    }

    public boolean l() {
        return this.g != null;
    }

    public void m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Activity activity, String[] strArr) {
        this.c = viewGroup.findViewById(R.id.actionsElements);
        this.e = viewGroup.findViewById(R.id.expandAddElements);
        this.d = viewGroup.findViewById(R.id.expandReset);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.btnExpandAdd);
        this.g = imageButton;
        imageButton.setOnClickListener(new e());
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.btnExpandReset);
        this.f = imageButton2;
        imageButton2.setOnClickListener(new f());
        ((Button) viewGroup.findViewById(R.id.btnReset)).setOnClickListener(new g(activity));
        GridLayout gridLayout = (GridLayout) this.e;
        this.h = gridLayout;
        gridLayout.removeAllViews();
        h hVar = new h(strArr);
        ho k2 = ho.k();
        if (k2 == null) {
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            try {
                View inflate = k2.n(strArr[i2]) ? View.inflate(activity, R.layout.dialog_custom_vis_add_element_pr, null) : View.inflate(activity, R.layout.dialog_custom_vis_add_element, null);
                Button button = (Button) inflate.findViewById(R.id.btnElement);
                button.setOnClickListener(hVar);
                button.setText(C(strArr[i2], inflate.getContext()));
                button.setTag(Integer.valueOf(i2));
                this.h.addView(inflate);
            } catch (Exception e2) {
                lz1.b(e2, "error inflating");
            }
        }
        this.a = (ScrollView) viewGroup.findViewById(R.id.scrollView1);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recyclerViewItems);
        this.b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        wn wnVar = new wn(activity, null, this.a);
        this.i = wnVar;
        xn xnVar = new xn(activity, R.layout.custom_section, 0, wnVar, new i());
        this.j = xnVar;
        this.b.setAdapter(xnVar);
        lu luVar = new lu();
        luVar.x(R.id.btnItemMore);
        luVar.t(0.4f);
        luVar.u(activity.getResources().getColor(R.color.white_alpha_1));
        luVar.r(0.3f);
        luVar.s(0.1f);
        luVar.w(new j());
        this.b.h(luVar);
        this.b.j(luVar);
        this.b.k(luVar.q());
        this.i.E(new k(luVar));
        this.i.F(new l());
        this.j.E(new m());
    }

    public final void n() {
        ho k2 = ho.k();
        if (k2 == null) {
            return;
        }
        this.g.animate().rotation(-45.0f).setDuration(k2.p);
        this.e.setVisibility(0);
        this.e.animate().alpha(1.0f).setDuration(k2.p);
        this.a.post(new b());
    }

    public final void o() {
        ho k2 = ho.k();
        if (k2 == null) {
            return;
        }
        this.f.animate().rotation(-45.0f).setDuration(k2.p);
        this.d.setVisibility(0);
        this.d.animate().alpha(1.0f).setDuration(k2.p);
        this.a.post(new d());
    }

    public void q(vn vnVar) {
        ho k2 = ho.k();
        if (k2 != null && k2.p() && l()) {
            int c2 = vnVar.c();
            this.k.clear();
            int i2 = 0;
            while (i2 < c2) {
                rn a2 = vnVar.a(i2);
                if (a2 == null) {
                    lz1.c("CustomPropertiesList is null");
                } else {
                    this.k.add(new ho.i(i2 == 0 ? k2.getString(R.string.vis_customization_composition_final) : k2.getResources().getQuantityString(R.plurals.vis_customization_composition_x, i2, Integer.valueOf(i2)), a2, a2.r("_id", -1), true));
                    p(a2, this.k);
                }
                i2++;
            }
            y(this.l);
        }
    }

    public void r(int i2) {
        s(i2, false);
    }

    public void s(int i2, boolean z) {
        rn rnVar;
        ho k2 = ho.k();
        if (k2 == null) {
            return;
        }
        this.l = i2;
        k2.w(i2, z);
        xn xnVar = this.j;
        if (xnVar != null) {
            xnVar.G(i2);
        }
        if (i2 < 0 || i2 >= this.k.size()) {
            rnVar = null;
        } else {
            ho.i iVar = this.k.get(i2);
            un b2 = iVar.b();
            rnVar = iVar.a();
            if (b2 != null) {
                k2.y(b2);
                return;
            }
        }
        k2.y(rnVar);
    }

    public void t(vn vnVar, List<ho.i> list) {
        vnVar.m();
        rn rnVar = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ho.i iVar = list.get(i4);
            rn a2 = iVar.a();
            un b2 = iVar.b();
            if (a2 != null) {
                a2.D0();
                vnVar.r(i2, a2);
                i2++;
                rnVar = a2;
                i3 = 0;
            } else if (b2 != null && rnVar != null) {
                rnVar.F0(i3, b2);
                i3++;
            }
        }
    }

    public void u(int i2) {
        ho k2 = ho.k();
        if (k2 != null && k2.p() && l()) {
            if (i2 < this.k.size()) {
                this.k.remove(i2);
                D(this.k, false);
            }
            int i3 = this.l;
            if (i2 == i3) {
                r(-1);
            } else {
                r(i3);
            }
        }
    }

    public void v() {
        ho k2 = ho.k();
        if (k2 != null && k2.p() && l() && this.k.size() > 0) {
            this.b.j1(this.k.size() - 1);
            r(this.k.size() - 1);
        }
    }

    public void w(int i2) {
        ho k2 = ho.k();
        if (k2 != null && k2.p() && l()) {
            int i3 = -1;
            int i4 = -1;
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                if (this.k.get(i5).a() != null) {
                    i3++;
                }
                if (i3 > i2) {
                    break;
                }
                i4 = i5;
            }
            if (i4 <= 0 || this.k.size() <= i4) {
                return;
            }
            this.b.j1(i4);
            r(i4);
        }
    }

    public void x(boolean z) {
        View view = this.c;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        wn wnVar = this.i;
        if (wnVar != null) {
            wnVar.C(z);
        }
        if (z) {
            h();
            g();
        }
    }

    public void y(int i2) {
        z(this.k, i2);
    }

    public void z(List<ho.i> list, int i2) {
        ho k2;
        if (this.i == null || (k2 = ho.k()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            ho.i iVar = list.get(i3);
            if (iVar.d()) {
                arrayList2.add(new xn.d(arrayList.size(), iVar.a));
            } else {
                arrayList.add(new lo1(iVar.a, iVar.c()));
            }
        }
        this.i.B(arrayList);
        this.j.F(arrayList2);
        this.j.G(i2);
        k2.w(this.l, false);
    }
}
