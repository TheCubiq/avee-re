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
import com.daaw.C2116lu;
import com.daaw.C3450wn;
import com.daaw.C3556xn;
import com.daaw.DialogFragmentC1593ho;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.io */
/* loaded from: classes.dex */
public class C1730io {

    /* renamed from: a */
    public ScrollView f13852a;

    /* renamed from: b */
    public RecyclerView f13853b;

    /* renamed from: c */
    public View f13854c;

    /* renamed from: d */
    public View f13855d;

    /* renamed from: e */
    public View f13856e;

    /* renamed from: f */
    public ImageButton f13857f;

    /* renamed from: g */
    public ImageButton f13858g;

    /* renamed from: h */
    public GridLayout f13859h;

    /* renamed from: i */
    public C3450wn f13860i;

    /* renamed from: j */
    public C3556xn f13861j;

    /* renamed from: k */
    public final List<DialogFragmentC1593ho.C1602i> f13862k = new ArrayList();

    /* renamed from: l */
    public int f13863l = -1;

    /* renamed from: com.daaw.io$a */
    /* loaded from: classes.dex */
    public class RunnableC1731a implements Runnable {
        public RunnableC1731a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1730io.this.f13856e.setVisibility(8);
        }
    }

    /* renamed from: com.daaw.io$b */
    /* loaded from: classes.dex */
    public class RunnableC1732b implements Runnable {
        public RunnableC1732b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1730io.this.f13852a.fullScroll(130);
        }
    }

    /* renamed from: com.daaw.io$c */
    /* loaded from: classes.dex */
    public class RunnableC1733c implements Runnable {
        public RunnableC1733c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1730io.this.f13855d.setVisibility(8);
        }
    }

    /* renamed from: com.daaw.io$d */
    /* loaded from: classes.dex */
    public class RunnableC1734d implements Runnable {
        public RunnableC1734d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1730io.this.f13852a.fullScroll(130);
        }
    }

    /* renamed from: com.daaw.io$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1735e implements View.OnClickListener {
        public View$OnClickListenerC1735e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1730io.this.m19575h();
            C1730io.this.m19587A();
        }
    }

    /* renamed from: com.daaw.io$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1736f implements View.OnClickListener {
        public View$OnClickListenerC1736f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1730io.this.m19576g();
            C1730io.this.m19586B();
        }
    }

    /* renamed from: com.daaw.io$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1737g implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ Activity f13870p;

        public View$OnClickListenerC1737g(Activity activity) {
            this.f13870p = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            DialogFragmentC1593ho.f12697E.m9795a(new C0645al(this.f13870p), Integer.valueOf(m20595k.f12728z), m20595k.f12727y);
        }
    }

    /* renamed from: com.daaw.io$h */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1738h implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ String[] f13872p;

        public View$OnClickListenerC1738h(String[] strArr) {
            this.f13872p = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            int intValue = ((Integer) view.getTag()).intValue();
            String[] strArr = this.f13872p;
            if (intValue < strArr.length) {
                DialogFragmentC1593ho.f12698F.m7667a(new C0645al(view), Integer.valueOf(m20595k.f12728z), Integer.valueOf(C1730io.this.f13863l), m20595k.f12727y, strArr[intValue]);
            }
        }
    }

    /* renamed from: com.daaw.io$i */
    /* loaded from: classes.dex */
    public class C1739i implements w40<Boolean> {
        public C1739i() {
        }

        @Override // com.daaw.w40
        /* renamed from: b */
        public Boolean mo3478a() {
            return Boolean.valueOf(C1730io.this.f13860i.m5949y());
        }
    }

    /* renamed from: com.daaw.io$j */
    /* loaded from: classes.dex */
    public class C1740j implements C2116lu.InterfaceC2119c {
        public C1740j() {
        }

        @Override // com.daaw.C2116lu.InterfaceC2119c
        /* renamed from: a */
        public void mo15549a(int i, int i2) {
            int min = Math.min(C1730io.this.f13862k.size() - 1, Math.max(i2, 1));
            if (i == min) {
                return;
            }
            DialogFragmentC1593ho.C1602i c1602i = null;
            C1730io c1730io = C1730io.this;
            int i3 = c1730io.f13863l;
            if (i3 >= 0 && i3 < c1730io.f13862k.size()) {
                c1602i = (DialogFragmentC1593ho.C1602i) C1730io.this.f13862k.get(C1730io.this.f13863l);
            }
            C1730io.this.f13862k.remove(i);
            C1730io.this.f13862k.add(min, (DialogFragmentC1593ho.C1602i) C1730io.this.f13862k.get(i));
            C1730io c1730io2 = C1730io.this;
            c1730io2.f13863l = c1602i != null ? c1730io2.f13862k.indexOf(c1602i) : -1;
            C1730io c1730io3 = C1730io.this;
            c1730io3.m19584D(c1730io3.f13862k, true);
        }
    }

    /* renamed from: com.daaw.io$k */
    /* loaded from: classes.dex */
    public class C1741k implements C3450wn.InterfaceC3453c {

        /* renamed from: a */
        public final /* synthetic */ C2116lu f13876a;

        public C1741k(C2116lu c2116lu) {
            this.f13876a = c2116lu;
        }

        @Override // com.daaw.C3450wn.InterfaceC3453c
        /* renamed from: a */
        public void mo5947a(View view) {
            this.f13876a.m16519j(view);
        }
    }

    /* renamed from: com.daaw.io$l */
    /* loaded from: classes.dex */
    public class C1742l implements C3450wn.InterfaceC3454d {
        public C1742l() {
        }

        @Override // com.daaw.C3450wn.InterfaceC3454d
        /* renamed from: a */
        public boolean mo5946a(int i, View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return false;
            }
            m20595k.m20593m(1);
            C1730io.this.m19564s(i, true);
            C1730io.this.f13861j.m4979H(i, view);
            return true;
        }
    }

    /* renamed from: com.daaw.io$m */
    /* loaded from: classes.dex */
    public class C1743m implements C3450wn.InterfaceC3454d {
        public C1743m() {
        }

        @Override // com.daaw.C3450wn.InterfaceC3454d
        /* renamed from: a */
        public boolean mo5946a(int i, View view) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return false;
            }
            m20595k.m20593m(1);
            C1730io.this.m19564s(i, true);
            C1730io.this.f13861j.m4979H(i, view);
            return true;
        }
    }

    /* renamed from: C */
    public static String m19585C(String str, Context context) {
        int m19574i;
        return (context != null && (m19574i = m19574i(str)) > 0) ? context.getString(m19574i) : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: i */
    public static int m19574i(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2120941625:
                if (str.equals("AudioProvider")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2063072:
                if (str.equals("Bars")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2603341:
                if (str.equals("Text")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 69447262:
                if (str.equals("RgbSplitEffect")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 70760763:
                if (str.equals("Image")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 197757176:
                if (str.equals("BlurEffect")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 203653773:
                if (str.equals("Particles")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 828944778:
                if (str.equals("Composition")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 870470476:
                if (str.equals("AppLogo")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1176394320:
                if (str.equals("MirrorEffect")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1465180494:
                if (str.equals("MotionBlurEffect")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
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

    /* renamed from: p */
    public static void m19567p(C2872rn c2872rn, List<DialogFragmentC1593ho.C1602i> list) {
        int mo7017c = c2872rn.mo7017c();
        for (int i = 0; i < mo7017c; i++) {
            C3239un mo7019a = c2872rn.mo7019a(i);
            if (mo7019a == null) {
                lz1.m16363c("CustomPropertiesList is null");
            } else {
                list.add(new DialogFragmentC1593ho.C1602i(m19585C(mo7019a.m8003B(), dx0.m23839c()), mo7019a, mo7019a.m7947r("_id", -1)));
            }
        }
    }

    /* renamed from: A */
    public final void m19587A() {
        if (this.f13856e.getVisibility() == 0) {
            m19576g();
        } else {
            m19569n();
        }
    }

    /* renamed from: B */
    public final void m19586B() {
        if (this.f13855d.getVisibility() == 0) {
            m19575h();
        } else {
            m19568o();
        }
    }

    /* renamed from: D */
    public final void m19584D(List<DialogFragmentC1593ho.C1602i> list, boolean z) {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k == null) {
            return;
        }
        m19563t(m20595k.f12727y, list);
        m19558y(this.f13863l);
        m20595k.m20588r(z);
    }

    /* renamed from: E */
    public void m19583E(int i) {
        if (i < 0 || i >= this.f13862k.size()) {
            return;
        }
        DialogFragmentC1593ho.C1602i c1602i = this.f13862k.get(i);
        this.f13861j.m4985B(i, new lo1<>(c1602i.f12737a, c1602i.m20571c()));
    }

    /* renamed from: g */
    public final void m19576g() {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k == null) {
            return;
        }
        this.f13858g.animate().rotation(0.0f).setDuration(m20595k.f12718p);
        this.f13856e.animate().alpha(0.0f).setDuration(m20595k.f12718p).withEndAction(new RunnableC1731a());
    }

    /* renamed from: h */
    public final void m19575h() {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k == null) {
            return;
        }
        this.f13857f.animate().rotation(0.0f).setDuration(m20595k.f12718p);
        this.f13855d.animate().alpha(0.0f).setDuration(m20595k.f12718p).withEndAction(new RunnableC1733c());
    }

    /* renamed from: j */
    public DialogFragmentC1593ho.C1602i m19573j(int i) {
        if (i < 0 || i >= this.f13862k.size()) {
            return null;
        }
        return this.f13862k.get(i);
    }

    /* renamed from: k */
    public boolean m19572k() {
        C3450wn c3450wn = this.f13860i;
        boolean z = c3450wn == null || c3450wn.m5949y();
        View view = this.f13854c;
        return (view == null || view.getVisibility() == 8) && z;
    }

    /* renamed from: l */
    public boolean m19571l() {
        return this.f13858g != null;
    }

    /* renamed from: m */
    public void m19570m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Activity activity, String[] strArr) {
        this.f13854c = viewGroup.findViewById(R.id.actionsElements);
        this.f13856e = viewGroup.findViewById(R.id.expandAddElements);
        this.f13855d = viewGroup.findViewById(R.id.expandReset);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.btnExpandAdd);
        this.f13858g = imageButton;
        imageButton.setOnClickListener(new View$OnClickListenerC1735e());
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.btnExpandReset);
        this.f13857f = imageButton2;
        imageButton2.setOnClickListener(new View$OnClickListenerC1736f());
        ((Button) viewGroup.findViewById(R.id.btnReset)).setOnClickListener(new View$OnClickListenerC1737g(activity));
        GridLayout gridLayout = (GridLayout) this.f13856e;
        this.f13859h = gridLayout;
        gridLayout.removeAllViews();
        View$OnClickListenerC1738h view$OnClickListenerC1738h = new View$OnClickListenerC1738h(strArr);
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k == null) {
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            try {
                View inflate = m20595k.m20592n(strArr[i]) ? View.inflate(activity, R.layout.dialog_custom_vis_add_element_pr, null) : View.inflate(activity, R.layout.dialog_custom_vis_add_element, null);
                Button button = (Button) inflate.findViewById(R.id.btnElement);
                button.setOnClickListener(view$OnClickListenerC1738h);
                button.setText(m19585C(strArr[i], inflate.getContext()));
                button.setTag(Integer.valueOf(i));
                this.f13859h.addView(inflate);
            } catch (Exception e) {
                lz1.m16364b(e, "error inflating");
            }
        }
        this.f13852a = (ScrollView) viewGroup.findViewById(R.id.scrollView1);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recyclerViewItems);
        this.f13853b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        C3450wn c3450wn = new C3450wn(activity, null, this.f13852a);
        this.f13860i = c3450wn;
        C3556xn c3556xn = new C3556xn(activity, R.layout.custom_section, 0, c3450wn, new C1739i());
        this.f13861j = c3556xn;
        this.f13853b.setAdapter(c3556xn);
        C2116lu c2116lu = new C2116lu();
        c2116lu.m16505x(R.id.btnItemMore);
        c2116lu.m16509t(0.4f);
        c2116lu.m16508u(activity.getResources().getColor(R.color.white_alpha_1));
        c2116lu.m16511r(0.3f);
        c2116lu.m16510s(0.1f);
        c2116lu.m16506w(new C1740j());
        this.f13853b.m28824h(c2116lu);
        this.f13853b.m28818j(c2116lu);
        this.f13853b.m28815k(c2116lu.m16512q());
        this.f13860i.m5953E(new C1741k(c2116lu));
        this.f13860i.m5952F(new C1742l());
        this.f13861j.m4982E(new C1743m());
    }

    /* renamed from: n */
    public final void m19569n() {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k == null) {
            return;
        }
        this.f13858g.animate().rotation(-45.0f).setDuration(m20595k.f12718p);
        this.f13856e.setVisibility(0);
        this.f13856e.animate().alpha(1.0f).setDuration(m20595k.f12718p);
        this.f13852a.post(new RunnableC1732b());
    }

    /* renamed from: o */
    public final void m19568o() {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k == null) {
            return;
        }
        this.f13857f.animate().rotation(-45.0f).setDuration(m20595k.f12718p);
        this.f13855d.setVisibility(0);
        this.f13855d.animate().alpha(1.0f).setDuration(m20595k.f12718p);
        this.f13852a.post(new RunnableC1734d());
    }

    /* renamed from: q */
    public void m19566q(C3355vn c3355vn) {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k != null && m20595k.m20590p() && m19571l()) {
            int mo7017c = c3355vn.mo7017c();
            this.f13862k.clear();
            int i = 0;
            while (i < mo7017c) {
                C2872rn mo7019a = c3355vn.mo7019a(i);
                if (mo7019a == null) {
                    lz1.m16363c("CustomPropertiesList is null");
                } else {
                    this.f13862k.add(new DialogFragmentC1593ho.C1602i(i == 0 ? m20595k.getString(R.string.vis_customization_composition_final) : m20595k.getResources().getQuantityString(R.plurals.vis_customization_composition_x, i, Integer.valueOf(i)), mo7019a, mo7019a.m7947r("_id", -1), true));
                    m19567p(mo7019a, this.f13862k);
                }
                i++;
            }
            m19558y(this.f13863l);
        }
    }

    /* renamed from: r */
    public void m19565r(int i) {
        m19564s(i, false);
    }

    /* renamed from: s */
    public void m19564s(int i, boolean z) {
        C2872rn c2872rn;
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k == null) {
            return;
        }
        this.f13863l = i;
        m20595k.m20583w(i, z);
        C3556xn c3556xn = this.f13861j;
        if (c3556xn != null) {
            c3556xn.m4980G(i);
        }
        if (i < 0 || i >= this.f13862k.size()) {
            c2872rn = null;
        } else {
            DialogFragmentC1593ho.C1602i c1602i = this.f13862k.get(i);
            C3239un m20572b = c1602i.m20572b();
            c2872rn = c1602i.m20573a();
            if (m20572b != null) {
                m20595k.m20581y(m20572b);
                return;
            }
        }
        m20595k.m20581y(c2872rn);
    }

    /* renamed from: t */
    public void m19563t(C3355vn c3355vn, List<DialogFragmentC1593ho.C1602i> list) {
        c3355vn.m7007m();
        C2872rn c2872rn = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            DialogFragmentC1593ho.C1602i c1602i = list.get(i3);
            C2872rn m20573a = c1602i.m20573a();
            C3239un m20572b = c1602i.m20572b();
            if (m20573a != null) {
                m20573a.m11170D0();
                c3355vn.m7002r(i, m20573a);
                i++;
                c2872rn = m20573a;
                i2 = 0;
            } else if (m20572b != null && c2872rn != null) {
                c2872rn.m11168F0(i2, m20572b);
                i2++;
            }
        }
    }

    /* renamed from: u */
    public void m19562u(int i) {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k != null && m20595k.m20590p() && m19571l()) {
            if (i < this.f13862k.size()) {
                this.f13862k.remove(i);
                m19584D(this.f13862k, false);
            }
            int i2 = this.f13863l;
            if (i == i2) {
                m19565r(-1);
            } else {
                m19565r(i2);
            }
        }
    }

    /* renamed from: v */
    public void m19561v() {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k != null && m20595k.m20590p() && m19571l() && this.f13862k.size() > 0) {
            this.f13853b.m28816j1(this.f13862k.size() - 1);
            m19565r(this.f13862k.size() - 1);
        }
    }

    /* renamed from: w */
    public void m19560w(int i) {
        DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k != null && m20595k.m20590p() && m19571l()) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < this.f13862k.size(); i4++) {
                if (this.f13862k.get(i4).m20573a() != null) {
                    i2++;
                }
                if (i2 > i) {
                    break;
                }
                i3 = i4;
            }
            if (i3 <= 0 || this.f13862k.size() <= i3) {
                return;
            }
            this.f13853b.m28816j1(i3);
            m19565r(i3);
        }
    }

    /* renamed from: x */
    public void m19559x(boolean z) {
        View view = this.f13854c;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        C3450wn c3450wn = this.f13860i;
        if (c3450wn != null) {
            c3450wn.m5955C(z);
        }
        if (z) {
            m19575h();
            m19576g();
        }
    }

    /* renamed from: y */
    public void m19558y(int i) {
        m19557z(this.f13862k, i);
    }

    /* renamed from: z */
    public void m19557z(List<DialogFragmentC1593ho.C1602i> list, int i) {
        DialogFragmentC1593ho m20595k;
        if (this.f13860i == null || (m20595k = DialogFragmentC1593ho.m20595k()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            DialogFragmentC1593ho.C1602i c1602i = list.get(i2);
            if (c1602i.m20570d()) {
                arrayList2.add(new C3556xn.C3560d(arrayList.size(), c1602i.f12737a));
            } else {
                arrayList.add(new lo1(c1602i.f12737a, c1602i.m20571c()));
            }
        }
        this.f13860i.m5956B(arrayList);
        this.f13861j.m4981F(arrayList2);
        this.f13861j.m4980G(i);
        m20595k.m20583w(this.f13863l, false);
    }
}
