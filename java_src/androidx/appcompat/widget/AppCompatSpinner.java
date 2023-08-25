package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import com.daaw.ck0;
import com.daaw.l30;
import com.daaw.pt0;
import com.daaw.r3;
import com.daaw.r4;
import com.daaw.vc1;
import com.daaw.vl1;
import com.daaw.x01;
import com.daaw.xs1;
import com.daaw.zk1;
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements vl1 {
    @SuppressLint({"ResourceType"})
    public static final int[] x = {16843505};
    public final r3 p;
    public final Context q;
    public l30 r;
    public SpinnerAdapter s;
    public final boolean t;
    public i u;
    public int v;
    public final Rect w;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean p;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.p = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public class a extends l30 {
        public final /* synthetic */ h y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, h hVar) {
            super(view);
            this.y = hVar;
        }

        @Override // com.daaw.l30
        public vc1 b() {
            return this.y;
        }

        @Override // com.daaw.l30
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().a()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i) {
            view.setTextAlignment(i);
        }

        public static void d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (pt0.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* loaded from: classes.dex */
    public class f implements i, DialogInterface.OnClickListener {
        public androidx.appcompat.app.a p;
        public ListAdapter q;
        public CharSequence r;

        public f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public boolean a() {
            androidx.appcompat.app.a aVar = this.p;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void b(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.p;
            if (aVar != null) {
                aVar.dismiss();
                this.p = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void e(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence f() {
            return this.r;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void j(CharSequence charSequence) {
            this.r = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void l(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void m(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void n(int i, int i2) {
            if (this.q == null) {
                return;
            }
            a.C0007a c0007a = new a.C0007a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.r;
            if (charSequence != null) {
                c0007a.h(charSequence);
            }
            androidx.appcompat.app.a a = c0007a.g(this.q, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.p = a;
            ListView n = a.n();
            d.d(n, i);
            d.c(n, i2);
            this.p.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.q.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void p(ListAdapter listAdapter) {
            this.q = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class g implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter p;
        public ListAdapter q;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.p = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.q = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof zk1) {
                    zk1 zk1Var = (zk1) spinnerAdapter;
                    if (zk1Var.getDropDownViewTheme() == null) {
                        zk1Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.q;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.p;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.p;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.p;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.p;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.p;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.q;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.p;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.p;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h extends ck0 implements i {
        public CharSequence Y;
        public ListAdapter Z;
        public final Rect a0;
        public int b0;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AppCompatSpinner p;

            public a(AppCompatSpinner appCompatSpinner) {
                this.p = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i, hVar.Z.getItemId(i));
                }
                h.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.U(AppCompatSpinner.this)) {
                    h.this.dismiss();
                    return;
                }
                h.this.S();
                h.super.h();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener p;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.p = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.p);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.a0 = new Rect();
            D(AppCompatSpinner.this);
            J(true);
            O(0);
            L(new a(AppCompatSpinner.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void S() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.i()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.w
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = com.daaw.hu1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.w
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.w
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.w
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.v
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.Z
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.i()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.w
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.F(r4)
                goto L85
            L82:
                r8.F(r5)
            L85:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = com.daaw.hu1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.z()
                int r3 = r3 - r0
                int r0 = r8.T()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.T()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.e(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.h.S():void");
        }

        public int T() {
            return this.b0;
        }

        public boolean U(View view) {
            return xs1.U(view) && view.getGlobalVisibleRect(this.a0);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence f() {
            return this.Y;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void j(CharSequence charSequence) {
            this.Y = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void m(int i) {
            this.b0 = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            S();
            I(2);
            super.h();
            ListView k = k();
            k.setChoiceMode(1);
            d.d(k, i);
            d.c(k, i2);
            P(AppCompatSpinner.this.getSelectedItemPosition());
            if (a2 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // com.daaw.ck0, androidx.appcompat.widget.AppCompatSpinner.i
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.Z = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a();

        void b(Drawable drawable);

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        Drawable i();

        void j(CharSequence charSequence);

        void l(int i);

        void m(int i);

        void n(int i, int i2);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r10 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.w = r0
            android.content.Context r0 = r5.getContext()
            com.daaw.yk1.a(r5, r0)
            int[] r0 = com.daaw.x21.x2
            r1 = 0
            com.daaw.ul1 r0 = com.daaw.ul1.v(r6, r7, r0, r8, r1)
            com.daaw.r3 r2 = new com.daaw.r3
            r2.<init>(r5)
            r5.p = r2
            if (r10 == 0) goto L29
            com.daaw.bl r2 = new com.daaw.bl
            r2.<init>(r6, r10)
        L26:
            r5.q = r2
            goto L39
        L29:
            int r10 = com.daaw.x21.C2
            int r10 = r0.n(r10, r1)
            if (r10 == 0) goto L37
            com.daaw.bl r2 = new com.daaw.bl
            r2.<init>(r6, r10)
            goto L26
        L37:
            r5.q = r6
        L39:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L5f
            int[] r10 = androidx.appcompat.widget.AppCompatSpinner.x     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            boolean r3 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L5c
            if (r3 == 0) goto L4d
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L5c
        L4d:
            r10.recycle()
            goto L5f
        L51:
            r6 = move-exception
            r2 = r10
            goto L55
        L54:
            r6 = move-exception
        L55:
            if (r2 == 0) goto L5a
            r2.recycle()
        L5a:
            throw r6
        L5b:
            r10 = r2
        L5c:
            if (r10 == 0) goto L5f
            goto L4d
        L5f:
            r10 = 1
            if (r9 == 0) goto L9c
            if (r9 == r10) goto L65
            goto Lac
        L65:
            androidx.appcompat.widget.AppCompatSpinner$h r9 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r5.q
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.q
            int[] r4 = com.daaw.x21.x2
            com.daaw.ul1 r1 = com.daaw.ul1.v(r3, r7, r4, r8, r1)
            int r3 = com.daaw.x21.B2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r5.v = r3
            int r3 = com.daaw.x21.z2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r9.b(r3)
            int r3 = com.daaw.x21.A2
            java.lang.String r3 = r0.o(r3)
            r9.j(r3)
            r1.w()
            r5.u = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.r = r1
            goto Lac
        L9c:
            androidx.appcompat.widget.AppCompatSpinner$f r9 = new androidx.appcompat.widget.AppCompatSpinner$f
            r9.<init>()
            r5.u = r9
            int r1 = com.daaw.x21.A2
            java.lang.String r1 = r0.o(r1)
            r9.j(r1)
        Lac:
            int r9 = com.daaw.x21.y2
            java.lang.CharSequence[] r9 = r0.q(r9)
            if (r9 == 0) goto Lc4
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = com.daaw.c21.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter(r1)
        Lc4:
            r0.w()
            r5.t = r10
            android.widget.SpinnerAdapter r6 = r5.s
            if (r6 == 0) goto Ld2
            r5.setAdapter(r6)
            r5.s = r2
        Ld2:
            com.daaw.r3 r6 = r5.p
            r6.e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.w);
            Rect rect = this.w;
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    public void b() {
        this.u.n(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.u;
        return iVar != null ? iVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.u;
        return iVar != null ? iVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.u != null ? this.v : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.u;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.u;
        return iVar != null ? iVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.q;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.u;
        return iVar != null ? iVar.f() : super.getPrompt();
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.u;
        if (iVar == null || !iVar.a()) {
            return;
        }
        this.u.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.u == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.p || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        i iVar = this.u;
        savedState.p = iVar != null && iVar.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l30 l30Var = this.r;
        if (l30Var == null || !l30Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        i iVar = this.u;
        if (iVar != null) {
            if (iVar.a()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.t) {
            this.s = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.u != null) {
            Context context = this.q;
            if (context == null) {
                context = getContext();
            }
            this.u.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        i iVar = this.u;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i2);
            return;
        }
        iVar.m(i2);
        this.u.e(i2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        i iVar = this.u;
        if (iVar != null) {
            iVar.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.u != null) {
            this.v = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.u;
        if (iVar != null) {
            iVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(r4.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.u;
        if (iVar != null) {
            iVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.j(mode);
        }
    }
}
