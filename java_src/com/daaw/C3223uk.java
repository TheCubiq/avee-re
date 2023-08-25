package com.daaw;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.daaw.avee.R;
import com.daaw.gy0;
import com.daaw.jh0;
/* renamed from: com.daaw.uk */
/* loaded from: classes.dex */
public class C3223uk extends AbstractC1172eb {

    /* renamed from: H */
    public static sw1<AbstractC2004l0[], Boolean, jh0.C1829a<Object>> f29108H = new sw1<>();

    /* renamed from: I */
    public static vw1<Boolean> f29109I = new vw1<>();

    /* renamed from: J */
    public static qw1<Object> f29110J = new qw1<>();

    /* renamed from: A */
    public TextView f29111A;

    /* renamed from: B */
    public TextView f29112B;

    /* renamed from: C */
    public ImageButton f29113C;

    /* renamed from: D */
    public Drawable f29114D;

    /* renamed from: E */
    public AbstractC2004l0[] f29115E;

    /* renamed from: F */
    public boolean f29116F;

    /* renamed from: G */
    public InterfaceC1153e0<C3223uk> f29117G;

    /* renamed from: t */
    public jh0.C1829a<Object> f29118t;

    /* renamed from: u */
    public Object f29119u;

    /* renamed from: v */
    public int f29120v;

    /* renamed from: w */
    public View f29121w;

    /* renamed from: x */
    public ImageView f29122x;

    /* renamed from: y */
    public TextView f29123y;

    /* renamed from: z */
    public TextView f29124z;

    /* renamed from: com.daaw.uk$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3224a implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ wc0 f29125p;

        public View$OnClickListenerC3224a(wc0 wc0Var) {
            this.f29125p = wc0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f29125p.mo3666m(C3223uk.this.f29120v, view.getContext());
        }
    }

    /* renamed from: com.daaw.uk$b */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC3225b implements View.OnLongClickListener {
        public View$OnLongClickListenerC3225b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return false;
        }
    }

    /* renamed from: com.daaw.uk$c */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC3226c implements View.OnTouchListener {
        public View$OnTouchListenerC3226c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: com.daaw.uk$d */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC3227d implements View.OnLongClickListener {

        /* renamed from: p */
        public final /* synthetic */ wc0 f29129p;

        public View$OnLongClickListenerC3227d(wc0 wc0Var) {
            this.f29129p = wc0Var;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f29129p.mo3661u() == null) {
                return false;
            }
            this.f29129p.mo3661u().mo6181a(C3223uk.this.f1947a);
            return true;
        }
    }

    /* renamed from: com.daaw.uk$e */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC3228e implements View.OnTouchListener {

        /* renamed from: p */
        public final /* synthetic */ boolean f29131p;

        /* renamed from: q */
        public final /* synthetic */ wc0 f29132q;

        public View$OnTouchListenerC3228e(boolean z, wc0 wc0Var) {
            this.f29131p = z;
            this.f29132q = wc0Var;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f29131p && C3223uk.f29109I.m6692a(Boolean.FALSE).booleanValue() && motionEvent.getAction() == 0 && this.f29132q.mo3661u() != null) {
                this.f29132q.mo3661u().mo6181a(C3223uk.this.f1947a);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.daaw.uk$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3229f implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ boolean f29134p;

        /* renamed from: com.daaw.uk$f$a */
        /* loaded from: classes.dex */
        public class C3230a implements gy0.InterfaceC1488d {

            /* renamed from: a */
            public final /* synthetic */ View f29136a;

            public C3230a(View view) {
                this.f29136a = view;
            }

            @Override // com.daaw.gy0.InterfaceC1488d
            public boolean onMenuItemClick(MenuItem menuItem) {
                C3223uk.this.f29115E[menuItem.getItemId()].m17274a(new C0645al(this.f29136a), C3223uk.this.f29118t.m18517d());
                return true;
            }
        }

        public View$OnClickListenerC3229f(boolean z) {
            this.f29134p = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f29134p && C3223uk.f29109I.m6692a(Boolean.FALSE).booleanValue()) {
                return;
            }
            C3223uk.f29110J.m12018a(C3223uk.this.f29118t.m18517d());
            gy0 gy0Var = new gy0(view.getContext(), view);
            gy0Var.m21138b(new C3230a(view));
            for (int i = 0; i < C3223uk.this.f29115E.length; i++) {
                if (C3223uk.this.f29115E[i].m17273b().mo22639e() && C3223uk.this.f29115E[i].m17273b().m25381g()) {
                    gy0Var.m21139a().add(0, i, C3223uk.this.f29115E[i].m17273b().m25384c(), C3223uk.this.f29115E[i].m17273b().m25383d());
                }
            }
            gy0Var.m21137c();
        }
    }

    /* renamed from: com.daaw.uk$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3231g implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ AbstractC2004l0 f29138p;

        public View$OnClickListenerC3231g(AbstractC2004l0 abstractC2004l0) {
            this.f29138p = abstractC2004l0;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3223uk.f29110J.m12018a(C3223uk.this.f29118t.m18517d());
            if (!C3223uk.f29109I.m6692a(Boolean.FALSE).booleanValue()) {
                if (this.f29138p.m17273b().m25380h()) {
                    C3223uk.this.m8088Z(true);
                }
                this.f29138p.m17274a(new C0645al(view), C3223uk.this.f29118t.m18517d());
                return;
            }
            C3223uk c3223uk = C3223uk.this;
            if (c3223uk.f29118t != null) {
                C3223uk.f29108H.m9795a(c3223uk.f29115E, Boolean.valueOf(true ^ C3223uk.this.f29121w.isSelected()), C3223uk.this.f29118t);
            }
        }
    }

    /* renamed from: com.daaw.uk$h */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3232h implements View.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ wc0 f29140p;

        public View$OnClickListenerC3232h(wc0 wc0Var) {
            this.f29140p = wc0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!C3223uk.f29109I.m6692a(Boolean.FALSE).booleanValue()) {
                this.f29140p.mo3666m(C3223uk.this.f29120v, view.getContext());
                return;
            }
            C3223uk c3223uk = C3223uk.this;
            if (c3223uk.f29118t != null) {
                C3223uk.f29108H.m9795a(c3223uk.f29115E, Boolean.valueOf(!C3223uk.this.f29121w.isSelected()), C3223uk.this.f29118t);
            }
        }
    }

    /* renamed from: com.daaw.uk$i */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC3233i implements View.OnLongClickListener {
        public View$OnLongClickListenerC3233i() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C3223uk.f29108H.m9795a(C3223uk.this.f29115E, Boolean.valueOf(!C3223uk.this.f29121w.isSelected()), C3223uk.this.f29118t);
            return true;
        }
    }

    public C3223uk(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false));
        this.f29118t = null;
        this.f29119u = null;
        this.f29115E = null;
        this.f29116F = false;
        this.f29117G = null;
        View view = this.f1947a;
        this.f29121w = view.findViewById(R.id.viewItemBg);
        this.f29122x = (ImageView) view.findViewById(R.id.imgArt);
        this.f29123y = (TextView) view.findViewById(R.id.txtNum);
        this.f29124z = (TextView) view.findViewById(R.id.txtItemLine1);
        this.f29111A = (TextView) view.findViewById(R.id.txtItemLine2);
        this.f29112B = (TextView) view.findViewById(R.id.txtItemDuration);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnItemMore);
        this.f29113C = imageButton;
        this.f29114D = imageButton.getBackground();
        this.f1947a.setLongClickable(true);
    }

    @Override // com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
    }

    /* renamed from: R */
    public void m8096R() {
        InterfaceC1153e0<C3223uk> interfaceC1153e0 = this.f29117G;
        if (interfaceC1153e0 != null) {
            interfaceC1153e0.mo7884a(this);
        }
        if (f29109I.m6692a(Boolean.FALSE).booleanValue()) {
            return;
        }
        m8088Z(false);
    }

    /* renamed from: S */
    public final void m8095S(int i) {
        this.f29113C.setColorFilter((16777215 & i) - 16777216);
        this.f29113C.setImageAlpha(Color.alpha(i));
    }

    /* renamed from: T */
    public void m8094T(int i) {
        this.f29113C.setImageResource(i);
    }

    /* renamed from: U */
    public void m8093U(Drawable drawable) {
        new C1354g2().m22079j(this.f29122x);
        this.f29122x.setImageDrawable(drawable);
    }

    /* renamed from: V */
    public void m8092V(int i) {
        if (i == -1) {
            this.f29122x.setColorFilter(i & 16777215);
            this.f29122x.setImageAlpha(255);
            return;
        }
        this.f29122x.setColorFilter((16777215 & i) - 16777216);
        this.f29122x.setImageAlpha(Color.alpha(i));
    }

    /* renamed from: W */
    public void m8091W(int i) {
        new C1354g2().m22079j(this.f29122x);
        this.f29122x.setImageResource(i);
    }

    /* renamed from: X */
    public void m8090X(AbstractC2004l0[] abstractC2004l0Arr, int i, wc0 wc0Var) {
        m8089Y(abstractC2004l0Arr, i, wc0Var, false, false, null);
    }

    /* renamed from: Y */
    public void m8089Y(AbstractC2004l0[] abstractC2004l0Arr, int i, wc0 wc0Var, boolean z, boolean z2, InterfaceC1153e0<C3223uk> interfaceC1153e0) {
        AbstractC2004l0[] abstractC2004l0Arr2;
        this.f29117G = interfaceC1153e0;
        this.f29115E = abstractC2004l0Arr;
        if (abstractC2004l0Arr == null) {
            i = -1;
        }
        ImageButton imageButton = this.f29113C;
        if (z) {
            imageButton.setBackgroundResource(R.drawable.reorder_button_bg);
            this.f29113C.setOnLongClickListener(new View$OnLongClickListenerC3227d(wc0Var));
        } else {
            imageButton.setBackground(this.f29114D);
            this.f29113C.setOnLongClickListener(null);
        }
        AbstractC2004l0[] abstractC2004l0Arr3 = this.f29115E;
        if (abstractC2004l0Arr3 == null || abstractC2004l0Arr3.length <= 0) {
            this.f29113C.setVisibility(8);
            this.f29113C.setOnTouchListener(null);
            this.f29113C.setOnClickListener(null);
        } else {
            this.f29113C.setVisibility(0);
            this.f29113C.setImageResource(R.drawable.ic_overflowv_2_s);
            this.f29113C.setOnTouchListener(new View$OnTouchListenerC3228e(z, wc0Var));
            this.f29113C.setOnClickListener(new View$OnClickListenerC3229f(z));
        }
        if (i >= 0) {
            AbstractC2004l0[] abstractC2004l0Arr4 = this.f29115E;
            if (abstractC2004l0Arr4.length > 0) {
                this.f1947a.setOnClickListener(new View$OnClickListenerC3231g(abstractC2004l0Arr4[i]));
                abstractC2004l0Arr2 = this.f29115E;
                if (abstractC2004l0Arr2 != null || abstractC2004l0Arr2.length <= 0 || this.f29118t == null) {
                    return;
                }
                this.f1947a.setOnLongClickListener(new View$OnLongClickListenerC3233i());
                return;
            }
        }
        this.f1947a.setOnClickListener(new View$OnClickListenerC3232h(wc0Var));
        abstractC2004l0Arr2 = this.f29115E;
        if (abstractC2004l0Arr2 != null) {
        }
    }

    /* renamed from: Z */
    public final void m8088Z(boolean z) {
        this.f1947a.setSelected(z);
    }

    /* renamed from: a0 */
    public void m8087a0(wc0 wc0Var, sd0 sd0Var) {
        m8086b0(wc0Var, null, sd0Var);
    }

    /* renamed from: b0 */
    public void m8086b0(wc0 wc0Var, Object obj, sd0 sd0Var) {
        lo1<Integer, Boolean> mo3662s = wc0Var.mo3662s();
        this.f29116F = !mo3662s.f17577b.booleanValue();
        ViewGroup.LayoutParams layoutParams = this.f29121w.getLayoutParams();
        layoutParams.height = mo3662s.f17576a.intValue();
        this.f29121w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f29122x.getLayoutParams();
        layoutParams2.width = mo3662s.f17576a.intValue();
        this.f29122x.setLayoutParams(layoutParams2);
        this.f29119u = null;
        if (obj != null) {
            this.f29118t = new jh0.C1829a<>(sd0Var, obj);
        } else {
            this.f29118t = null;
        }
        this.f1947a.setOnClickListener(new View$OnClickListenerC3224a(wc0Var));
        this.f1947a.setOnLongClickListener(new View$OnLongClickListenerC3225b());
        this.f29113C.setVisibility(8);
        this.f29113C.setImageResource(R.drawable.ic_overflowv_2_s);
        m8095S(gr1.m21321n(this.f29113C, R.attr.moreDotsTint));
        this.f29121w.setActivated(false);
        m8090X(null, -1, wc0Var);
        this.f1947a.setOnTouchListener(new View$OnTouchListenerC3226c());
    }

    /* renamed from: c0 */
    public void m8085c0(String str) {
        this.f29111A.setText(str);
    }

    /* renamed from: d0 */
    public void m8084d0(int i) {
        if (this.f29116F) {
            this.f29111A.setVisibility(8);
        } else {
            this.f29111A.setVisibility(i);
        }
    }
}
