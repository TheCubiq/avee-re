package com.daaw;

import android.content.Context;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C3097tn;
import com.daaw.C3450wn;
import com.daaw.avee.R;
import java.util.List;
/* renamed from: com.daaw.yn */
/* loaded from: classes.dex */
public class C3723yn extends RecyclerView.AbstractC0376c0 {

    /* renamed from: t */
    public boolean f33868t;

    /* renamed from: u */
    public final TextView f33869u;

    /* renamed from: v */
    public final TextView f33870v;

    /* renamed from: w */
    public final ImageButton f33871w;

    /* renamed from: x */
    public final ViewGroup f33872x;

    /* renamed from: y */
    public int f33873y;

    /* renamed from: z */
    public static vw1<Boolean> f33867z = new vw1<>();

    /* renamed from: A */
    public static final AbstractC2004l0[] f33864A = {new C3724a()};

    /* renamed from: B */
    public static final AbstractC2004l0[] f33865B = {new C3725b(), new C3726c()};

    /* renamed from: C */
    public static final AbstractC2004l0[] f33866C = {new C3727d()};

    /* renamed from: com.daaw.yn$a */
    /* loaded from: classes.dex */
    public class C3724a extends C3097tn.C3100b.AbstractC3101a {
        @Override // com.daaw.C3097tn.C3100b.AbstractC3101a
        /* renamed from: c */
        public void mo3489c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* renamed from: com.daaw.yn$b */
    /* loaded from: classes.dex */
    public class C3725b extends C3097tn.C3098a.AbstractC3099a {
        @Override // com.daaw.C3097tn.C3098a.AbstractC3099a
        /* renamed from: c */
        public void mo3490c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* renamed from: com.daaw.yn$c */
    /* loaded from: classes.dex */
    public class C3726c extends C3097tn.C3100b.AbstractC3101a {
        @Override // com.daaw.C3097tn.C3100b.AbstractC3101a
        /* renamed from: c */
        public void mo3489c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* renamed from: com.daaw.yn$d */
    /* loaded from: classes.dex */
    public class C3727d extends C3097tn.C3102c.AbstractC3103a {
        @Override // com.daaw.C3097tn.C3102c.AbstractC3103a
        /* renamed from: c */
        public void mo3488c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* renamed from: com.daaw.yn$e */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC3728e implements View.OnLongClickListener {

        /* renamed from: p */
        public final /* synthetic */ C3450wn.InterfaceC3453c f33874p;

        /* renamed from: q */
        public final /* synthetic */ View f33875q;

        public View$OnLongClickListenerC3728e(C3450wn.InterfaceC3453c interfaceC3453c, View view) {
            this.f33874p = interfaceC3453c;
            this.f33875q = view;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f33874p.mo5947a(this.f33875q);
            return true;
        }
    }

    /* renamed from: com.daaw.yn$f */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC3729f implements View.OnTouchListener {

        /* renamed from: p */
        public final /* synthetic */ ViewGroup f33877p;

        public View$OnTouchListenerC3729f(ViewGroup viewGroup) {
            this.f33877p = viewGroup;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f33877p.requestDisallowInterceptTouchEvent(true);
            return view.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: com.daaw.yn$g */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC3730g implements View.OnLongClickListener {

        /* renamed from: p */
        public final /* synthetic */ AbstractC2004l0[] f33879p;

        public View$OnLongClickListenerC3730g(AbstractC2004l0[] abstractC2004l0Arr) {
            this.f33879p = abstractC2004l0Arr;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C3723yn.this.m3494O(view, this.f33879p);
            return true;
        }
    }

    /* renamed from: com.daaw.yn$h */
    /* loaded from: classes.dex */
    public class C3731h implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2004l0[] f33881a;

        /* renamed from: b */
        public final /* synthetic */ View f33882b;

        public C3731h(AbstractC2004l0[] abstractC2004l0Arr, View view) {
            this.f33881a = abstractC2004l0Arr;
            this.f33882b = view;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            this.f33881a[menuItem.getItemId()].m17274a(new C0645al(this.f33882b), Integer.valueOf(C3723yn.this.f33873y));
            return true;
        }
    }

    public C3723yn(View view) {
        super(view);
        this.f33868t = true;
        this.f33869u = (TextView) view.findViewById(R.id.txtItemLine1);
        this.f33870v = (TextView) view.findViewById(R.id.txtItemLine2);
        this.f33872x = (ViewGroup) view.findViewById(R.id.collapsible);
        this.f33871w = (ImageButton) view.findViewById(R.id.btnItemMore);
    }

    public C3723yn(View view, C3450wn.InterfaceC3453c interfaceC3453c, ViewGroup viewGroup) {
        super(view);
        this.f33868t = false;
        this.f33869u = (TextView) view.findViewById(R.id.txtItemLine1);
        this.f33870v = (TextView) view.findViewById(R.id.txtItemLine2);
        this.f33872x = (ViewGroup) view.findViewById(R.id.collapsible);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnItemMore);
        this.f33871w = imageButton;
        imageButton.setOnLongClickListener(new View$OnLongClickListenerC3728e(interfaceC3453c, view));
        imageButton.setOnTouchListener(new View$OnTouchListenerC3729f(viewGroup));
    }

    /* renamed from: O */
    public void m3494O(View view, AbstractC2004l0[] abstractC2004l0Arr) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.setOnMenuItemClickListener(new C3731h(abstractC2004l0Arr, view));
        for (int i = 0; i < abstractC2004l0Arr.length; i++) {
            if (abstractC2004l0Arr[i].m17273b().mo22639e() && abstractC2004l0Arr[i].m17273b().m25381g()) {
                popupMenu.getMenu().add(0, i, abstractC2004l0Arr[i].m17273b().m25384c(), abstractC2004l0Arr[i].m17273b().m25383d());
            }
        }
        popupMenu.show();
    }

    /* renamed from: P */
    public void m3493P() {
        int m28734l = m28734l();
        this.f33873y = m28734l;
        if (this.f33868t) {
            if (m28734l == 0) {
                m3492Q(null);
            } else {
                m3492Q(f33866C);
            }
        } else if (f33867z.m6692a(Boolean.FALSE).booleanValue()) {
            m3492Q(f33865B);
        } else {
            m3492Q(f33864A);
        }
    }

    /* renamed from: Q */
    public void m3492Q(AbstractC2004l0[] abstractC2004l0Arr) {
        if (abstractC2004l0Arr == null || abstractC2004l0Arr.length <= 0) {
            this.f1947a.setOnLongClickListener(null);
        } else {
            this.f1947a.setOnLongClickListener(new View$OnLongClickListenerC3730g(abstractC2004l0Arr));
        }
    }

    /* renamed from: R */
    public void m3491R(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence == null || charSequence.length() <= 0) {
            this.f33870v.setText("");
            textView = this.f33870v;
            i = 8;
        } else {
            this.f33870v.setText(charSequence);
            textView = this.f33870v;
            i = 0;
        }
        textView.setVisibility(i);
    }
}
