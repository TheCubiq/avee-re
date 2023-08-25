package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogC0068a;
import com.daaw.C0855bl;
import com.daaw.C2816r3;
import com.daaw.C2818r4;
import com.daaw.c21;
import com.daaw.ck0;
import com.daaw.hu1;
import com.daaw.l30;
import com.daaw.pt0;
import com.daaw.ul1;
import com.daaw.vc1;
import com.daaw.vl1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import com.daaw.yk1;
import com.daaw.zk1;
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements vl1 {
    @SuppressLint({"ResourceType"})

    /* renamed from: x */
    public static final int[] f583x = {16843505};

    /* renamed from: p */
    public final C2816r3 f584p;

    /* renamed from: q */
    public final Context f585q;

    /* renamed from: r */
    public l30 f586r;

    /* renamed from: s */
    public SpinnerAdapter f587s;

    /* renamed from: t */
    public final boolean f588t;

    /* renamed from: u */
    public InterfaceC0131i f589u;

    /* renamed from: v */
    public int f590v;

    /* renamed from: w */
    public final Rect f591w;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0119a();

        /* renamed from: p */
        public boolean f592p;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        /* loaded from: classes.dex */
        public class C0119a implements Parcelable.Creator<SavedState> {
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
            this.f592p = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f592p ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    /* loaded from: classes.dex */
    public class C0120a extends l30 {

        /* renamed from: y */
        public final /* synthetic */ C0127h f593y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0120a(View view, C0127h c0127h) {
            super(view);
            this.f593y = c0127h;
        }

        @Override // com.daaw.l30
        /* renamed from: b */
        public vc1 mo17188b() {
            return this.f593y;
        }

        @Override // com.daaw.l30
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo17187c() {
            if (AppCompatSpinner.this.getInternalPopup().mo30075a()) {
                return true;
            }
            AppCompatSpinner.this.m30088b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0121b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0121b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo30075a()) {
                AppCompatSpinner.this.m30088b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0122c.m30085a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    /* loaded from: classes.dex */
    public static final class C0122c {
        /* renamed from: a */
        public static void m30085a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    /* loaded from: classes.dex */
    public static final class C0123d {
        /* renamed from: a */
        public static int m30084a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        public static int m30083b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        public static void m30082c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        public static void m30081d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    /* loaded from: classes.dex */
    public static final class C0124e {
        /* renamed from: a */
        public static void m30080a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (pt0.m13160a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC0125f implements InterfaceC0131i, DialogInterface.OnClickListener {

        /* renamed from: p */
        public DialogC0068a f596p;

        /* renamed from: q */
        public ListAdapter f597q;

        /* renamed from: r */
        public CharSequence f598r;

        public DialogInterface$OnClickListenerC0125f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: a */
        public boolean mo30075a() {
            DialogC0068a dialogC0068a = this.f596p;
            if (dialogC0068a != null) {
                return dialogC0068a.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: b */
        public void mo30074b(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: c */
        public int mo30073c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        public void dismiss() {
            DialogC0068a dialogC0068a = this.f596p;
            if (dialogC0068a != null) {
                dialogC0068a.dismiss();
                this.f596p = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: e */
        public void mo30072e(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: f */
        public CharSequence mo30071f() {
            return this.f598r;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: i */
        public Drawable mo30070i() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: j */
        public void mo30069j(CharSequence charSequence) {
            this.f598r = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: l */
        public void mo30068l(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: m */
        public void mo30067m(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: n */
        public void mo30066n(int i, int i2) {
            if (this.f597q == null) {
                return;
            }
            DialogC0068a.C0069a c0069a = new DialogC0068a.C0069a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f598r;
            if (charSequence != null) {
                c0069a.m30299h(charSequence);
            }
            DialogC0068a m30306a = c0069a.m30300g(this.f597q, AppCompatSpinner.this.getSelectedItemPosition(), this).m30306a();
            this.f596p = m30306a;
            ListView m30308n = m30306a.m30308n();
            C0123d.m30081d(m30308n, i);
            C0123d.m30082c(m30308n, i2);
            this.f596p.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: o */
        public int mo30065o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f597q.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: p */
        public void mo25271p(ListAdapter listAdapter) {
            this.f597q = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    /* loaded from: classes.dex */
    public static class C0126g implements ListAdapter, SpinnerAdapter {

        /* renamed from: p */
        public SpinnerAdapter f600p;

        /* renamed from: q */
        public ListAdapter f601q;

        public C0126g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f600p = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f601q = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    C0124e.m30080a((ThemedSpinnerAdapter) spinnerAdapter, theme);
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
            ListAdapter listAdapter = this.f601q;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f600p;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f600p;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f600p;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f600p;
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
            SpinnerAdapter spinnerAdapter = this.f600p;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f601q;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f600p;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f600p;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    /* loaded from: classes.dex */
    public class C0127h extends ck0 implements InterfaceC0131i {

        /* renamed from: Y */
        public CharSequence f602Y;

        /* renamed from: Z */
        public ListAdapter f603Z;

        /* renamed from: a0 */
        public final Rect f604a0;

        /* renamed from: b0 */
        public int f605b0;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        /* loaded from: classes.dex */
        public class C0128a implements AdapterView.OnItemClickListener {

            /* renamed from: p */
            public final /* synthetic */ AppCompatSpinner f607p;

            public C0128a(AppCompatSpinner appCompatSpinner) {
                this.f607p = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0127h c0127h = C0127h.this;
                    AppCompatSpinner.this.performItemClick(view, i, c0127h.f603Z.getItemId(i));
                }
                C0127h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnGlobalLayoutListenerC0129b implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserver$OnGlobalLayoutListenerC0129b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0127h c0127h = C0127h.this;
                if (!c0127h.m30076U(AppCompatSpinner.this)) {
                    C0127h.this.dismiss();
                    return;
                }
                C0127h.this.m30078S();
                C0127h.super.mo7285h();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        /* loaded from: classes.dex */
        public class C0130c implements PopupWindow.OnDismissListener {

            /* renamed from: p */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f610p;

            public C0130c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f610p = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f610p);
                }
            }
        }

        public C0127h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f604a0 = new Rect();
            m25291D(AppCompatSpinner.this);
            m25285J(true);
            m25280O(0);
            m25283L(new C0128a(AppCompatSpinner.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /* renamed from: S */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m30078S() {
            int i;
            Drawable m25274i = m25274i();
            int i2 = 0;
            if (m25274i != null) {
                m25274i.getPadding(AppCompatSpinner.this.f591w);
                i2 = hu1.m20417b(AppCompatSpinner.this) ? AppCompatSpinner.this.f591w.right : -AppCompatSpinner.this.f591w.left;
            } else {
                Rect rect = AppCompatSpinner.this.f591w;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f590v;
            if (i3 == -2) {
                int m30089a = appCompatSpinner.m30089a((SpinnerAdapter) this.f603Z, m25274i());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f591w;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (m30089a > i5) {
                    m30089a = i5;
                }
                i = Math.max(m30089a, (width - paddingLeft) - paddingRight);
            } else if (i3 != -1) {
                m25289F(i3);
                m25275e(!hu1.m20417b(AppCompatSpinner.this) ? i2 + (((width - paddingRight) - m25262z()) - m30077T()) : i2 + paddingLeft + m30077T());
            } else {
                i = (width - paddingLeft) - paddingRight;
            }
            m25289F(i);
            m25275e(!hu1.m20417b(AppCompatSpinner.this) ? i2 + (((width - paddingRight) - m25262z()) - m30077T()) : i2 + paddingLeft + m30077T());
        }

        /* renamed from: T */
        public int m30077T() {
            return this.f605b0;
        }

        /* renamed from: U */
        public boolean m30076U(View view) {
            return xs1.m4743U(view) && view.getGlobalVisibleRect(this.f604a0);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: f */
        public CharSequence mo30071f() {
            return this.f602Y;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: j */
        public void mo30069j(CharSequence charSequence) {
            this.f602Y = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: m */
        public void mo30067m(int i) {
            this.f605b0 = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: n */
        public void mo30066n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean mo7286a = mo7286a();
            m30078S();
            m25286I(2);
            super.mo7285h();
            ListView mo7284k = mo7284k();
            mo7284k.setChoiceMode(1);
            C0123d.m30081d(mo7284k, i);
            C0123d.m30082c(mo7284k, i2);
            m25279P(AppCompatSpinner.this.getSelectedItemPosition());
            if (mo7286a || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserver$OnGlobalLayoutListenerC0129b viewTreeObserver$OnGlobalLayoutListenerC0129b = new ViewTreeObserver$OnGlobalLayoutListenerC0129b();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0129b);
            m25284K(new C0130c(viewTreeObserver$OnGlobalLayoutListenerC0129b));
        }

        @Override // com.daaw.ck0, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0131i
        /* renamed from: p */
        public void mo25271p(ListAdapter listAdapter) {
            super.mo25271p(listAdapter);
            this.f603Z = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    /* loaded from: classes.dex */
    public interface InterfaceC0131i {
        /* renamed from: a */
        boolean mo30075a();

        /* renamed from: b */
        void mo30074b(Drawable drawable);

        /* renamed from: c */
        int mo30073c();

        void dismiss();

        /* renamed from: e */
        void mo30072e(int i);

        /* renamed from: f */
        CharSequence mo30071f();

        /* renamed from: i */
        Drawable mo30070i();

        /* renamed from: j */
        void mo30069j(CharSequence charSequence);

        /* renamed from: l */
        void mo30068l(int i);

        /* renamed from: m */
        void mo30067m(int i);

        /* renamed from: n */
        void mo30066n(int i, int i2);

        /* renamed from: o */
        int mo30065o();

        /* renamed from: p */
        void mo25271p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
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
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i);
        C0855bl c0855bl;
        TypedArray typedArray;
        CharSequence[] m8042q;
        SpinnerAdapter spinnerAdapter;
        this.f591w = new Rect();
        yk1.m3617a(this, getContext());
        ul1 m8037v = ul1.m8037v(context, attributeSet, x21.f32000x2, i, 0);
        this.f584p = new C2816r3(this);
        if (theme != null) {
            c0855bl = new C0855bl(context, theme);
        } else {
            int m8045n = m8037v.m8045n(x21.f31771C2, 0);
            if (m8045n == 0) {
                this.f585q = context;
                TypedArray typedArray2 = null;
                if (i2 == -1) {
                    try {
                        typedArray = context.obtainStyledAttributes(attributeSet, f583x, i, 0);
                        try {
                            if (typedArray.hasValue(0)) {
                                i2 = typedArray.getInt(0, 0);
                            }
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            th = th;
                            typedArray2 = typedArray;
                            if (typedArray2 != null) {
                                typedArray2.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception unused2) {
                        typedArray = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    typedArray.recycle();
                }
                if (i2 != 0) {
                    DialogInterface$OnClickListenerC0125f dialogInterface$OnClickListenerC0125f = new DialogInterface$OnClickListenerC0125f();
                    this.f589u = dialogInterface$OnClickListenerC0125f;
                    dialogInterface$OnClickListenerC0125f.mo30069j(m8037v.m8044o(x21.f31761A2));
                } else if (i2 == 1) {
                    C0127h c0127h = new C0127h(this.f585q, attributeSet, i);
                    ul1 m8037v2 = ul1.m8037v(this.f585q, attributeSet, x21.f32000x2, i, 0);
                    this.f590v = m8037v2.m8046m(x21.f31766B2, -2);
                    c0127h.m25277b(m8037v2.m8052g(x21.f32010z2));
                    c0127h.mo30069j(m8037v.m8044o(x21.f31761A2));
                    m8037v2.m8036w();
                    this.f589u = c0127h;
                    this.f586r = new C0120a(this, c0127h);
                }
                m8042q = m8037v.m8042q(x21.f32005y2);
                if (m8042q != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, m8042q);
                    arrayAdapter.setDropDownViewResource(c21.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                m8037v.m8036w();
                this.f588t = true;
                spinnerAdapter = this.f587s;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f587s = null;
                }
                this.f584p.m11818e(attributeSet, i);
            }
            c0855bl = new C0855bl(context, m8045n);
        }
        this.f585q = c0855bl;
        TypedArray typedArray22 = null;
        if (i2 == -1) {
        }
        if (i2 != 0) {
        }
        m8042q = m8037v.m8042q(x21.f32005y2);
        if (m8042q != null) {
        }
        m8037v.m8036w();
        this.f588t = true;
        spinnerAdapter = this.f587s;
        if (spinnerAdapter != null) {
        }
        this.f584p.m11818e(attributeSet, i);
    }

    /* renamed from: a */
    public int m30089a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f591w);
            Rect rect = this.f591w;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    public void m30088b() {
        this.f589u.mo30066n(C0123d.m30083b(this), C0123d.m30084a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2816r3 c2816r3 = this.f584p;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0131i interfaceC0131i = this.f589u;
        return interfaceC0131i != null ? interfaceC0131i.mo30073c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0131i interfaceC0131i = this.f589u;
        return interfaceC0131i != null ? interfaceC0131i.mo30065o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f589u != null ? this.f590v : super.getDropDownWidth();
    }

    public final InterfaceC0131i getInternalPopup() {
        return this.f589u;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0131i interfaceC0131i = this.f589u;
        return interfaceC0131i != null ? interfaceC0131i.mo30070i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f585q;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0131i interfaceC0131i = this.f589u;
        return interfaceC0131i != null ? interfaceC0131i.mo30071f() : super.getPrompt();
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f584p;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f584p;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0131i interfaceC0131i = this.f589u;
        if (interfaceC0131i == null || !interfaceC0131i.mo30075a()) {
            return;
        }
        this.f589u.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f589u == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m30089a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f592p || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0121b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0131i interfaceC0131i = this.f589u;
        savedState.f592p = interfaceC0131i != null && interfaceC0131i.mo30075a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l30 l30Var = this.f586r;
        if (l30Var == null || !l30Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0131i interfaceC0131i = this.f589u;
        if (interfaceC0131i != null) {
            if (interfaceC0131i.mo30075a()) {
                return true;
            }
            m30088b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f588t) {
            this.f587s = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f589u != null) {
            Context context = this.f585q;
            if (context == null) {
                context = getContext();
            }
            this.f589u.mo25271p(new C0126g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f584p;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f584p;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0131i interfaceC0131i = this.f589u;
        if (interfaceC0131i == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        interfaceC0131i.mo30067m(i);
        this.f589u.mo30072e(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0131i interfaceC0131i = this.f589u;
        if (interfaceC0131i != null) {
            interfaceC0131i.mo30068l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f589u != null) {
            this.f590v = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0131i interfaceC0131i = this.f589u;
        if (interfaceC0131i != null) {
            interfaceC0131i.mo30074b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C2818r4.m11783b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0131i interfaceC0131i = this.f589u;
        if (interfaceC0131i != null) {
            interfaceC0131i.mo30069j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f584p;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f584p;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }
}
