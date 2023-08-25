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
/* loaded from: classes.dex */
public class uk extends eb {
    public static sw1<l0[], Boolean, jh0.a<Object>> H = new sw1<>();
    public static vw1<Boolean> I = new vw1<>();
    public static qw1<Object> J = new qw1<>();
    public TextView A;
    public TextView B;
    public ImageButton C;
    public Drawable D;
    public l0[] E;
    public boolean F;
    public e0<uk> G;
    public jh0.a<Object> t;
    public Object u;
    public int v;
    public View w;
    public ImageView x;
    public TextView y;
    public TextView z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ wc0 p;

        public a(wc0 wc0Var) {
            this.p = wc0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.p.m(uk.this.v, view.getContext());
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnLongClickListener {
        public final /* synthetic */ wc0 p;

        public d(wc0 wc0Var) {
            this.p = wc0Var;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.p.u() == null) {
                return false;
            }
            this.p.u().a(uk.this.a);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {
        public final /* synthetic */ boolean p;
        public final /* synthetic */ wc0 q;

        public e(boolean z, wc0 wc0Var) {
            this.p = z;
            this.q = wc0Var;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.p && uk.I.a(Boolean.FALSE).booleanValue() && motionEvent.getAction() == 0 && this.q.u() != null) {
                this.q.u().a(uk.this.a);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ boolean p;

        /* loaded from: classes.dex */
        public class a implements gy0.d {
            public final /* synthetic */ View a;

            public a(View view) {
                this.a = view;
            }

            @Override // com.daaw.gy0.d
            public boolean onMenuItemClick(MenuItem menuItem) {
                uk.this.E[menuItem.getItemId()].a(new al(this.a), uk.this.t.d());
                return true;
            }
        }

        public f(boolean z) {
            this.p = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.p && uk.I.a(Boolean.FALSE).booleanValue()) {
                return;
            }
            uk.J.a(uk.this.t.d());
            gy0 gy0Var = new gy0(view.getContext(), view);
            gy0Var.b(new a(view));
            for (int i = 0; i < uk.this.E.length; i++) {
                if (uk.this.E[i].b().e() && uk.this.E[i].b().g()) {
                    gy0Var.a().add(0, i, uk.this.E[i].b().c(), uk.this.E[i].b().d());
                }
            }
            gy0Var.c();
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ l0 p;

        public g(l0 l0Var) {
            this.p = l0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            uk.J.a(uk.this.t.d());
            if (!uk.I.a(Boolean.FALSE).booleanValue()) {
                if (this.p.b().h()) {
                    uk.this.Z(true);
                }
                this.p.a(new al(view), uk.this.t.d());
                return;
            }
            uk ukVar = uk.this;
            if (ukVar.t != null) {
                uk.H.a(ukVar.E, Boolean.valueOf(true ^ uk.this.w.isSelected()), uk.this.t);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public final /* synthetic */ wc0 p;

        public h(wc0 wc0Var) {
            this.p = wc0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uk.I.a(Boolean.FALSE).booleanValue()) {
                this.p.m(uk.this.v, view.getContext());
                return;
            }
            uk ukVar = uk.this;
            if (ukVar.t != null) {
                uk.H.a(ukVar.E, Boolean.valueOf(!uk.this.w.isSelected()), uk.this.t);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements View.OnLongClickListener {
        public i() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            uk.H.a(uk.this.E, Boolean.valueOf(!uk.this.w.isSelected()), uk.this.t);
            return true;
        }
    }

    public uk(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false));
        this.t = null;
        this.u = null;
        this.E = null;
        this.F = false;
        this.G = null;
        View view = this.a;
        this.w = view.findViewById(R.id.viewItemBg);
        this.x = (ImageView) view.findViewById(R.id.imgArt);
        this.y = (TextView) view.findViewById(R.id.txtNum);
        this.z = (TextView) view.findViewById(R.id.txtItemLine1);
        this.A = (TextView) view.findViewById(R.id.txtItemLine2);
        this.B = (TextView) view.findViewById(R.id.txtItemDuration);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnItemMore);
        this.C = imageButton;
        this.D = imageButton.getBackground();
        this.a.setLongClickable(true);
    }

    @Override // com.daaw.eb
    public void O(wc0 wc0Var, int i2) {
    }

    public void R() {
        e0<uk> e0Var = this.G;
        if (e0Var != null) {
            e0Var.a(this);
        }
        if (I.a(Boolean.FALSE).booleanValue()) {
            return;
        }
        Z(false);
    }

    public final void S(int i2) {
        this.C.setColorFilter((16777215 & i2) - 16777216);
        this.C.setImageAlpha(Color.alpha(i2));
    }

    public void T(int i2) {
        this.C.setImageResource(i2);
    }

    public void U(Drawable drawable) {
        new g2().j(this.x);
        this.x.setImageDrawable(drawable);
    }

    public void V(int i2) {
        if (i2 == -1) {
            this.x.setColorFilter(i2 & 16777215);
            this.x.setImageAlpha(255);
            return;
        }
        this.x.setColorFilter((16777215 & i2) - 16777216);
        this.x.setImageAlpha(Color.alpha(i2));
    }

    public void W(int i2) {
        new g2().j(this.x);
        this.x.setImageResource(i2);
    }

    public void X(l0[] l0VarArr, int i2, wc0 wc0Var) {
        Y(l0VarArr, i2, wc0Var, false, false, null);
    }

    public void Y(l0[] l0VarArr, int i2, wc0 wc0Var, boolean z, boolean z2, e0<uk> e0Var) {
        l0[] l0VarArr2;
        this.G = e0Var;
        this.E = l0VarArr;
        if (l0VarArr == null) {
            i2 = -1;
        }
        ImageButton imageButton = this.C;
        if (z) {
            imageButton.setBackgroundResource(R.drawable.reorder_button_bg);
            this.C.setOnLongClickListener(new d(wc0Var));
        } else {
            imageButton.setBackground(this.D);
            this.C.setOnLongClickListener(null);
        }
        l0[] l0VarArr3 = this.E;
        if (l0VarArr3 == null || l0VarArr3.length <= 0) {
            this.C.setVisibility(8);
            this.C.setOnTouchListener(null);
            this.C.setOnClickListener(null);
        } else {
            this.C.setVisibility(0);
            this.C.setImageResource(R.drawable.ic_overflowv_2_s);
            this.C.setOnTouchListener(new e(z, wc0Var));
            this.C.setOnClickListener(new f(z));
        }
        if (i2 >= 0) {
            l0[] l0VarArr4 = this.E;
            if (l0VarArr4.length > 0) {
                this.a.setOnClickListener(new g(l0VarArr4[i2]));
                l0VarArr2 = this.E;
                if (l0VarArr2 != null || l0VarArr2.length <= 0 || this.t == null) {
                    return;
                }
                this.a.setOnLongClickListener(new i());
                return;
            }
        }
        this.a.setOnClickListener(new h(wc0Var));
        l0VarArr2 = this.E;
        if (l0VarArr2 != null) {
        }
    }

    public final void Z(boolean z) {
        this.a.setSelected(z);
    }

    public void a0(wc0 wc0Var, sd0 sd0Var) {
        b0(wc0Var, null, sd0Var);
    }

    public void b0(wc0 wc0Var, Object obj, sd0 sd0Var) {
        lo1<Integer, Boolean> s = wc0Var.s();
        this.F = !s.b.booleanValue();
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        layoutParams.height = s.a.intValue();
        this.w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.x.getLayoutParams();
        layoutParams2.width = s.a.intValue();
        this.x.setLayoutParams(layoutParams2);
        this.u = null;
        if (obj != null) {
            this.t = new jh0.a<>(sd0Var, obj);
        } else {
            this.t = null;
        }
        this.a.setOnClickListener(new a(wc0Var));
        this.a.setOnLongClickListener(new b());
        this.C.setVisibility(8);
        this.C.setImageResource(R.drawable.ic_overflowv_2_s);
        S(gr1.n(this.C, R.attr.moreDotsTint));
        this.w.setActivated(false);
        X(null, -1, wc0Var);
        this.a.setOnTouchListener(new c());
    }

    public void c0(String str) {
        this.A.setText(str);
    }

    public void d0(int i2) {
        if (this.F) {
            this.A.setVisibility(8);
        } else {
            this.A.setVisibility(i2);
        }
    }
}
