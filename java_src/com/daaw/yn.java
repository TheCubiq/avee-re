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
import com.daaw.avee.R;
import com.daaw.tn;
import com.daaw.wn;
import java.util.List;
/* loaded from: classes.dex */
public class yn extends RecyclerView.c0 {
    public boolean t;
    public final TextView u;
    public final TextView v;
    public final ImageButton w;
    public final ViewGroup x;
    public int y;
    public static vw1<Boolean> z = new vw1<>();
    public static final l0[] A = {new a()};
    public static final l0[] B = {new b(), new c()};
    public static final l0[] C = {new d()};

    /* loaded from: classes.dex */
    public class a extends tn.b.a {
        @Override // com.daaw.tn.b.a
        public void c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends tn.a.AbstractC0089a {
        @Override // com.daaw.tn.a.AbstractC0089a
        public void c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* loaded from: classes.dex */
    public class c extends tn.b.a {
        @Override // com.daaw.tn.b.a
        public void c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* loaded from: classes.dex */
    public class d extends tn.c.a {
        @Override // com.daaw.tn.c.a
        public void c(Context context, Object obj, List<Integer> list) {
            list.add((Integer) obj);
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLongClickListener {
        public final /* synthetic */ wn.c p;
        public final /* synthetic */ View q;

        public e(wn.c cVar, View view) {
            this.p = cVar;
            this.q = view;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.p.a(this.q);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public final /* synthetic */ ViewGroup p;

        public f(ViewGroup viewGroup) {
            this.p = viewGroup;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.p.requestDisallowInterceptTouchEvent(true);
            return view.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnLongClickListener {
        public final /* synthetic */ l0[] p;

        public g(l0[] l0VarArr) {
            this.p = l0VarArr;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            yn.this.O(view, this.p);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements PopupMenu.OnMenuItemClickListener {
        public final /* synthetic */ l0[] a;
        public final /* synthetic */ View b;

        public h(l0[] l0VarArr, View view) {
            this.a = l0VarArr;
            this.b = view;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            this.a[menuItem.getItemId()].a(new al(this.b), Integer.valueOf(yn.this.y));
            return true;
        }
    }

    public yn(View view) {
        super(view);
        this.t = true;
        this.u = (TextView) view.findViewById(R.id.txtItemLine1);
        this.v = (TextView) view.findViewById(R.id.txtItemLine2);
        this.x = (ViewGroup) view.findViewById(R.id.collapsible);
        this.w = (ImageButton) view.findViewById(R.id.btnItemMore);
    }

    public yn(View view, wn.c cVar, ViewGroup viewGroup) {
        super(view);
        this.t = false;
        this.u = (TextView) view.findViewById(R.id.txtItemLine1);
        this.v = (TextView) view.findViewById(R.id.txtItemLine2);
        this.x = (ViewGroup) view.findViewById(R.id.collapsible);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnItemMore);
        this.w = imageButton;
        imageButton.setOnLongClickListener(new e(cVar, view));
        imageButton.setOnTouchListener(new f(viewGroup));
    }

    public void O(View view, l0[] l0VarArr) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.setOnMenuItemClickListener(new h(l0VarArr, view));
        for (int i = 0; i < l0VarArr.length; i++) {
            if (l0VarArr[i].b().e() && l0VarArr[i].b().g()) {
                popupMenu.getMenu().add(0, i, l0VarArr[i].b().c(), l0VarArr[i].b().d());
            }
        }
        popupMenu.show();
    }

    public void P() {
        int l = l();
        this.y = l;
        if (this.t) {
            if (l == 0) {
                Q(null);
            } else {
                Q(C);
            }
        } else if (z.a(Boolean.FALSE).booleanValue()) {
            Q(B);
        } else {
            Q(A);
        }
    }

    public void Q(l0[] l0VarArr) {
        if (l0VarArr == null || l0VarArr.length <= 0) {
            this.a.setOnLongClickListener(null);
        } else {
            this.a.setOnLongClickListener(new g(l0VarArr));
        }
    }

    public void R(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence == null || charSequence.length() <= 0) {
            this.v.setText("");
            textView = this.v;
            i = 8;
        } else {
            this.v.setText(charSequence);
            textView = this.v;
            i = 0;
        }
        textView.setVisibility(i);
    }
}
