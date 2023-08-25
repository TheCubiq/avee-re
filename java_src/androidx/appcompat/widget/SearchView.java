package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC2317nn;
import com.daaw.C2682q3;
import com.daaw.InterfaceC1278fg;
import com.daaw.bi1;
import com.daaw.c21;
import com.daaw.em1;
import com.daaw.g11;
import com.daaw.hu1;
import com.daaw.i21;
import com.daaw.o11;
import com.daaw.ul1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends C0164b implements InterfaceC1278fg {

    /* renamed from: F0 */
    public static final C0149o f625F0;

    /* renamed from: A0 */
    public View.OnKeyListener f626A0;

    /* renamed from: B0 */
    public final TextView.OnEditorActionListener f627B0;

    /* renamed from: C0 */
    public final AdapterView.OnItemClickListener f628C0;

    /* renamed from: D0 */
    public final AdapterView.OnItemSelectedListener f629D0;

    /* renamed from: E */
    public final SearchAutoComplete f630E;

    /* renamed from: E0 */
    public TextWatcher f631E0;

    /* renamed from: F */
    public final View f632F;

    /* renamed from: G */
    public final View f633G;

    /* renamed from: H */
    public final View f634H;

    /* renamed from: I */
    public final ImageView f635I;

    /* renamed from: J */
    public final ImageView f636J;

    /* renamed from: K */
    public final ImageView f637K;

    /* renamed from: L */
    public final ImageView f638L;

    /* renamed from: M */
    public final View f639M;

    /* renamed from: N */
    public C0150p f640N;

    /* renamed from: O */
    public Rect f641O;

    /* renamed from: P */
    public Rect f642P;

    /* renamed from: Q */
    public int[] f643Q;

    /* renamed from: R */
    public int[] f644R;

    /* renamed from: S */
    public final ImageView f645S;

    /* renamed from: T */
    public final Drawable f646T;

    /* renamed from: U */
    public final int f647U;

    /* renamed from: V */
    public final int f648V;

    /* renamed from: W */
    public final Intent f649W;

    /* renamed from: a0 */
    public final Intent f650a0;

    /* renamed from: b0 */
    public final CharSequence f651b0;

    /* renamed from: c0 */
    public InterfaceC0147m f652c0;

    /* renamed from: d0 */
    public InterfaceC0146l f653d0;

    /* renamed from: e0 */
    public View.OnFocusChangeListener f654e0;

    /* renamed from: f0 */
    public InterfaceC0148n f655f0;

    /* renamed from: g0 */
    public View.OnClickListener f656g0;

    /* renamed from: h0 */
    public boolean f657h0;

    /* renamed from: i0 */
    public boolean f658i0;

    /* renamed from: j0 */
    public AbstractC2317nn f659j0;

    /* renamed from: k0 */
    public boolean f660k0;

    /* renamed from: l0 */
    public CharSequence f661l0;

    /* renamed from: m0 */
    public boolean f662m0;

    /* renamed from: n0 */
    public boolean f663n0;

    /* renamed from: o0 */
    public int f664o0;

    /* renamed from: p0 */
    public boolean f665p0;

    /* renamed from: q0 */
    public CharSequence f666q0;

    /* renamed from: r0 */
    public CharSequence f667r0;

    /* renamed from: s0 */
    public boolean f668s0;

    /* renamed from: t0 */
    public int f669t0;

    /* renamed from: u0 */
    public SearchableInfo f670u0;

    /* renamed from: v0 */
    public Bundle f671v0;

    /* renamed from: w0 */
    public final Runnable f672w0;

    /* renamed from: x0 */
    public Runnable f673x0;

    /* renamed from: y0 */
    public final WeakHashMap<String, Drawable.ConstantState> f674y0;

    /* renamed from: z0 */
    public final View.OnClickListener f675z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0133a();

        /* renamed from: r */
        public boolean f676r;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        /* loaded from: classes.dex */
        public class C0133a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f676r = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f676r + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f676r));
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C2682q3 {

        /* renamed from: t */
        public int f677t;

        /* renamed from: u */
        public SearchView f678u;

        /* renamed from: v */
        public boolean f679v;

        /* renamed from: w */
        public final Runnable f680w;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        public class RunnableC0134a implements Runnable {
            public RunnableC0134a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m30018d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, x01.f31706p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f680w = new RunnableC0134a();
            this.f677t = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* renamed from: b */
        public void m30020b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f625F0.m30011c(this);
                return;
            }
            C0145k.m30016b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* renamed from: c */
        public boolean m30019c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: d */
        public void m30018d() {
            if (this.f679v) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f679v = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f677t <= 0 || super.enoughToFilter();
        }

        @Override // com.daaw.C2682q3, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f679v) {
                removeCallbacks(this.f680w);
                post(this.f680w);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f678u.m30036Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f678u.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f678u.hasFocus() && getVisibility() == 0) {
                this.f679v = true;
                if (SearchView.m30049M(getContext())) {
                    m30020b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f679v = false;
                removeCallbacks(this.f680w);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f679v = true;
            } else {
                this.f679v = false;
                removeCallbacks(this.f680w);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f678u = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f677t = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    public class C0135a implements TextWatcher {
        public C0135a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m30037Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    public class RunnableC0136b implements Runnable {
        public RunnableC0136b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m30030f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    public class RunnableC0137c implements Runnable {
        public RunnableC0137c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2317nn abstractC2317nn = SearchView.this.f659j0;
            if (abstractC2317nn instanceof bi1) {
                abstractC2317nn.mo13286a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    public class View$OnFocusChangeListenerC0138d implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC0138d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f654e0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC0139e implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0139e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m30060B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0140f implements View.OnClickListener {
        public View$OnClickListenerC0140f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f635I) {
                searchView.m30040V();
            } else if (view == searchView.f637K) {
                searchView.m30044R();
            } else if (view == searchView.f636J) {
                searchView.m30039W();
            } else if (view == searchView.f638L) {
                searchView.m30035a0();
            } else if (view == searchView.f630E) {
                searchView.m30054H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    public class View$OnKeyListenerC0141g implements View.OnKeyListener {
        public View$OnKeyListenerC0141g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f670u0 == null) {
                return false;
            }
            if (!searchView.f630E.isPopupShowing() || SearchView.this.f630E.getListSelection() == -1) {
                if (!SearchView.this.f630E.m30019c() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.m30046P(0, null, searchView2.f630E.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.m30038X(view, i, keyEvent);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    public class C0142h implements TextView.OnEditorActionListener {
        public C0142h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m30039W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    public class C0143i implements AdapterView.OnItemClickListener {
        public C0143i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m30043S(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    public class C0144j implements AdapterView.OnItemSelectedListener {
        public C0144j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m30042T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public static class C0145k {
        /* renamed from: a */
        public static void m30017a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        public static void m30016b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0146l {
        boolean onClose();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0147m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public interface InterfaceC0148n {
        /* renamed from: a */
        boolean m30015a(int i);

        /* renamed from: b */
        boolean m30014b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    public static class C0149o {

        /* renamed from: a */
        public Method f692a;

        /* renamed from: b */
        public Method f693b;

        /* renamed from: c */
        public Method f694c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0149o() {
            this.f692a = null;
            this.f693b = null;
            this.f694c = null;
            m30010d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f692a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f693b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f694c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        public static void m30010d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        public void m30013a(AutoCompleteTextView autoCompleteTextView) {
            m30010d();
            Method method = this.f693b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public void m30012b(AutoCompleteTextView autoCompleteTextView) {
            m30010d();
            Method method = this.f692a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        public void m30011c(AutoCompleteTextView autoCompleteTextView) {
            m30010d();
            Method method = this.f694c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    public static class C0150p extends TouchDelegate {

        /* renamed from: a */
        public final View f695a;

        /* renamed from: b */
        public final Rect f696b;

        /* renamed from: c */
        public final Rect f697c;

        /* renamed from: d */
        public final Rect f698d;

        /* renamed from: e */
        public final int f699e;

        /* renamed from: f */
        public boolean f700f;

        public C0150p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f699e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f696b = new Rect();
            this.f698d = new Rect();
            this.f697c = new Rect();
            m30009a(rect, rect2);
            this.f695a = view;
        }

        /* renamed from: a */
        public void m30009a(Rect rect, Rect rect2) {
            this.f696b.set(rect);
            this.f698d.set(rect);
            Rect rect3 = this.f698d;
            int i = this.f699e;
            rect3.inset(-i, -i);
            this.f697c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f700f;
                    if (z2 && !this.f698d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f700f;
                        this.f700f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f696b.contains(x, y)) {
                    this.f700f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.f697c.contains(x, y)) {
                    Rect rect = this.f697c;
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = this.f695a.getWidth() / 2;
                    i = this.f695a.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return this.f695a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f625F0 = Build.VERSION.SDK_INT < 29 ? new C0149o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f641O = new Rect();
        this.f642P = new Rect();
        this.f643Q = new int[2];
        this.f644R = new int[2];
        this.f672w0 = new RunnableC0136b();
        this.f673x0 = new RunnableC0137c();
        this.f674y0 = new WeakHashMap<>();
        View$OnClickListenerC0140f view$OnClickListenerC0140f = new View$OnClickListenerC0140f();
        this.f675z0 = view$OnClickListenerC0140f;
        this.f626A0 = new View$OnKeyListenerC0141g();
        C0142h c0142h = new C0142h();
        this.f627B0 = c0142h;
        C0143i c0143i = new C0143i();
        this.f628C0 = c0143i;
        C0144j c0144j = new C0144j();
        this.f629D0 = c0144j;
        this.f631E0 = new C0135a();
        int[] iArr = x21.f31910f2;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        xs1.m4706p0(this, context, iArr, attributeSet, m8037v.m8041r(), i, 0);
        LayoutInflater.from(context).inflate(m8037v.m8045n(x21.f31960p2, c21.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(o11.search_src_text);
        this.f630E = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f632F = findViewById(o11.search_edit_frame);
        View findViewById = findViewById(o11.search_plate);
        this.f633G = findViewById;
        View findViewById2 = findViewById(o11.submit_area);
        this.f634H = findViewById2;
        ImageView imageView = (ImageView) findViewById(o11.search_button);
        this.f635I = imageView;
        ImageView imageView2 = (ImageView) findViewById(o11.search_go_btn);
        this.f636J = imageView2;
        ImageView imageView3 = (ImageView) findViewById(o11.search_close_btn);
        this.f637K = imageView3;
        ImageView imageView4 = (ImageView) findViewById(o11.search_voice_btn);
        this.f638L = imageView4;
        ImageView imageView5 = (ImageView) findViewById(o11.search_mag_icon);
        this.f645S = imageView5;
        xs1.m4694v0(findViewById, m8037v.m8052g(x21.f31965q2));
        xs1.m4694v0(findViewById2, m8037v.m8052g(x21.f31985u2));
        int i2 = x21.f31980t2;
        imageView.setImageDrawable(m8037v.m8052g(i2));
        imageView2.setImageDrawable(m8037v.m8052g(x21.f31950n2));
        imageView3.setImageDrawable(m8037v.m8052g(x21.f31935k2));
        imageView4.setImageDrawable(m8037v.m8052g(x21.f31995w2));
        imageView5.setImageDrawable(m8037v.m8052g(i2));
        this.f646T = m8037v.m8052g(x21.f31975s2);
        em1.m23375a(imageView, getResources().getString(i21.abc_searchview_description_search));
        this.f647U = m8037v.m8045n(x21.f31990v2, c21.abc_search_dropdown_item_icons_2line);
        this.f648V = m8037v.m8045n(x21.f31940l2, 0);
        imageView.setOnClickListener(view$OnClickListenerC0140f);
        imageView3.setOnClickListener(view$OnClickListenerC0140f);
        imageView2.setOnClickListener(view$OnClickListenerC0140f);
        imageView4.setOnClickListener(view$OnClickListenerC0140f);
        searchAutoComplete.setOnClickListener(view$OnClickListenerC0140f);
        searchAutoComplete.addTextChangedListener(this.f631E0);
        searchAutoComplete.setOnEditorActionListener(c0142h);
        searchAutoComplete.setOnItemClickListener(c0143i);
        searchAutoComplete.setOnItemSelectedListener(c0144j);
        searchAutoComplete.setOnKeyListener(this.f626A0);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC0138d());
        setIconifiedByDefault(m8037v.m8058a(x21.f31955o2, true));
        int m8053f = m8037v.m8053f(x21.f31920h2, -1);
        if (m8053f != -1) {
            setMaxWidth(m8053f);
        }
        this.f651b0 = m8037v.m8043p(x21.f31945m2);
        this.f661l0 = m8037v.m8043p(x21.f31970r2);
        int m8048k = m8037v.m8048k(x21.f31930j2, -1);
        if (m8048k != -1) {
            setImeOptions(m8048k);
        }
        int m8048k2 = m8037v.m8048k(x21.f31925i2, -1);
        if (m8048k2 != -1) {
            setInputType(m8048k2);
        }
        setFocusable(m8037v.m8058a(x21.f31915g2, true));
        m8037v.m8036w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f649W = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f650a0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f639M = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0139e());
        }
        m30025k0(this.f657h0);
        m30029g0();
    }

    /* renamed from: M */
    public static boolean m30049M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(g11.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(g11.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f630E.setText(charSequence);
        this.f630E.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: B */
    public void m30060B() {
        if (this.f639M.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f633G.getPaddingLeft();
            Rect rect = new Rect();
            boolean m20417b = hu1.m20417b(this);
            int dimensionPixelSize = this.f657h0 ? resources.getDimensionPixelSize(g11.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(g11.abc_dropdownitem_text_padding_left) : 0;
            this.f630E.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f630E.setDropDownHorizontalOffset(m20417b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f630E.setDropDownWidth((((this.f639M.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: C */
    public final Intent m30059C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f667r0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f671v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f670u0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    public final Intent m30058D(Cursor cursor, int i, String str) {
        int i2;
        String m26157o;
        try {
            try {
                String m26157o2 = bi1.m26157o(cursor, "suggest_intent_action");
                if (m26157o2 == null) {
                    m26157o2 = this.f670u0.getSuggestIntentAction();
                }
                if (m26157o2 == null) {
                    m26157o2 = "android.intent.action.SEARCH";
                }
                String str2 = m26157o2;
                String m26157o3 = bi1.m26157o(cursor, "suggest_intent_data");
                if (m26157o3 == null) {
                    m26157o3 = this.f670u0.getSuggestIntentData();
                }
                if (m26157o3 != null && (m26157o = bi1.m26157o(cursor, "suggest_intent_data_id")) != null) {
                    m26157o3 = m26157o3 + "/" + Uri.encode(m26157o);
                }
                return m30059C(str2, m26157o3 == null ? null : Uri.parse(m26157o3), bi1.m26157o(cursor, "suggest_intent_extra_data"), bi1.m26157o(cursor, "suggest_intent_query"), i, str);
            } catch (RuntimeException unused) {
                i2 = -1;
                StringBuilder sb = new StringBuilder();
                sb.append("Search suggestions cursor at row ");
                sb.append(i2);
                sb.append(" returned exception.");
                return null;
            }
        } catch (RuntimeException unused2) {
            i2 = cursor.getPosition();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            return null;
        }
    }

    /* renamed from: E */
    public final Intent m30057E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f671v0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    public final Intent m30056F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    public final void m30055G() {
        this.f630E.dismissDropDown();
    }

    /* renamed from: H */
    public void m30054H() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0145k.m30017a(this.f630E);
            return;
        }
        C0149o c0149o = f625F0;
        c0149o.m30012b(this.f630E);
        c0149o.m30013a(this.f630E);
    }

    /* renamed from: I */
    public final void m30053I(View view, Rect rect) {
        view.getLocationInWindow(this.f643Q);
        getLocationInWindow(this.f644R);
        int[] iArr = this.f643Q;
        int i = iArr[1];
        int[] iArr2 = this.f644R;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    public final CharSequence m30052J(CharSequence charSequence) {
        if (!this.f657h0 || this.f646T == null) {
            return charSequence;
        }
        double textSize = this.f630E.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f646T.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f646T), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    public final boolean m30051K() {
        SearchableInfo searchableInfo = this.f670u0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f670u0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f649W;
        } else if (this.f670u0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f650a0;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: L */
    public boolean m30050L() {
        return this.f658i0;
    }

    /* renamed from: N */
    public final boolean m30048N() {
        return (this.f660k0 || this.f665p0) && !m30050L();
    }

    /* renamed from: O */
    public final void m30047O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed launch activity: ");
            sb.append(intent);
        }
    }

    /* renamed from: P */
    public void m30046P(int i, String str, String str2) {
        getContext().startActivity(m30059C("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: Q */
    public final boolean m30045Q(int i, int i2, String str) {
        Cursor mo13285b = this.f659j0.mo13285b();
        if (mo13285b == null || !mo13285b.moveToPosition(i)) {
            return false;
        }
        m30047O(m30058D(mo13285b, i2, str));
        return true;
    }

    /* renamed from: R */
    public void m30044R() {
        if (!TextUtils.isEmpty(this.f630E.getText())) {
            this.f630E.setText("");
            this.f630E.requestFocus();
            this.f630E.setImeVisibility(true);
        } else if (this.f657h0) {
            InterfaceC0146l interfaceC0146l = this.f653d0;
            if (interfaceC0146l == null || !interfaceC0146l.onClose()) {
                clearFocus();
                m30025k0(true);
            }
        }
    }

    /* renamed from: S */
    public boolean m30043S(int i, int i2, String str) {
        InterfaceC0148n interfaceC0148n = this.f655f0;
        if (interfaceC0148n == null || !interfaceC0148n.m30014b(i)) {
            m30045Q(i, 0, null);
            this.f630E.setImeVisibility(false);
            m30055G();
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public boolean m30042T(int i) {
        InterfaceC0148n interfaceC0148n = this.f655f0;
        if (interfaceC0148n == null || !interfaceC0148n.m30015a(i)) {
            m30033c0(i);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m30041U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: V */
    public void m30040V() {
        m30025k0(false);
        this.f630E.requestFocus();
        this.f630E.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f656g0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: W */
    public void m30039W() {
        Editable text = this.f630E.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0147m interfaceC0147m = this.f652c0;
        if (interfaceC0147m == null || !interfaceC0147m.onQueryTextSubmit(text.toString())) {
            if (this.f670u0 != null) {
                m30046P(0, null, text.toString());
            }
            this.f630E.setImeVisibility(false);
            m30055G();
        }
    }

    /* renamed from: X */
    public boolean m30038X(View view, int i, KeyEvent keyEvent) {
        if (this.f670u0 != null && this.f659j0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m30043S(this.f630E.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.f630E.setSelection(i == 21 ? 0 : this.f630E.length());
                this.f630E.setListSelection(0);
                this.f630E.clearListSelection();
                this.f630E.m30020b();
                return true;
            } else if (i == 19) {
                this.f630E.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public void m30037Y(CharSequence charSequence) {
        Editable text = this.f630E.getText();
        this.f667r0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m30026j0(z);
        m30024l0(!z);
        m30031e0();
        m30027i0();
        if (this.f652c0 != null && !TextUtils.equals(charSequence, this.f666q0)) {
            this.f652c0.onQueryTextChange(charSequence.toString());
        }
        this.f666q0 = charSequence.toString();
    }

    /* renamed from: Z */
    public void m30036Z() {
        m30025k0(m30050L());
        m30034b0();
        if (this.f630E.hasFocus()) {
            m30054H();
        }
    }

    /* renamed from: a0 */
    public void m30035a0() {
        Intent m30057E;
        SearchableInfo searchableInfo = this.f670u0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                m30057E = m30056F(this.f649W, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                m30057E = m30057E(this.f650a0, searchableInfo);
            }
            getContext().startActivity(m30057E);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: b0 */
    public final void m30034b0() {
        post(this.f672w0);
    }

    @Override // com.daaw.InterfaceC1278fg
    /* renamed from: c */
    public void mo18347c() {
        if (this.f668s0) {
            return;
        }
        this.f668s0 = true;
        int imeOptions = this.f630E.getImeOptions();
        this.f669t0 = imeOptions;
        this.f630E.setImeOptions(imeOptions | 33554432);
        this.f630E.setText("");
        setIconified(false);
    }

    /* renamed from: c0 */
    public final void m30033c0(int i) {
        CharSequence mo13284c;
        Editable text = this.f630E.getText();
        Cursor mo13285b = this.f659j0.mo13285b();
        if (mo13285b == null) {
            return;
        }
        if (!mo13285b.moveToPosition(i) || (mo13284c = this.f659j0.mo13284c(mo13285b)) == null) {
            setQuery(text);
        } else {
            setQuery(mo13284c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f663n0 = true;
        super.clearFocus();
        this.f630E.clearFocus();
        this.f630E.setImeVisibility(false);
        this.f663n0 = false;
    }

    /* renamed from: d0 */
    public void m30032d0(CharSequence charSequence, boolean z) {
        this.f630E.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f630E;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f667r0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m30039W();
    }

    /* renamed from: e0 */
    public final void m30031e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f630E.getText());
        if (!z2 && (!this.f657h0 || this.f668s0)) {
            z = false;
        }
        this.f637K.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f637K.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // com.daaw.InterfaceC1278fg
    /* renamed from: f */
    public void mo18346f() {
        m30032d0("", false);
        clearFocus();
        m30025k0(true);
        this.f630E.setImeOptions(this.f669t0);
        this.f668s0 = false;
    }

    /* renamed from: f0 */
    public void m30030f0() {
        int[] iArr = this.f630E.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f633G.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f634H.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: g0 */
    public final void m30029g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f630E;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m30052J(queryHint));
    }

    public int getImeOptions() {
        return this.f630E.getImeOptions();
    }

    public int getInputType() {
        return this.f630E.getInputType();
    }

    public int getMaxWidth() {
        return this.f664o0;
    }

    public CharSequence getQuery() {
        return this.f630E.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f661l0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f670u0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f651b0 : getContext().getText(this.f670u0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f648V;
    }

    public int getSuggestionRowLayout() {
        return this.f647U;
    }

    public AbstractC2317nn getSuggestionsAdapter() {
        return this.f659j0;
    }

    /* renamed from: h0 */
    public final void m30028h0() {
        this.f630E.setThreshold(this.f670u0.getSuggestThreshold());
        this.f630E.setImeOptions(this.f670u0.getImeOptions());
        int inputType = this.f670u0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f670u0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f630E.setInputType(inputType);
        AbstractC2317nn abstractC2317nn = this.f659j0;
        if (abstractC2317nn != null) {
            abstractC2317nn.mo13286a(null);
        }
        if (this.f670u0.getSuggestAuthority() != null) {
            bi1 bi1Var = new bi1(getContext(), this, this.f670u0, this.f674y0);
            this.f659j0 = bi1Var;
            this.f630E.setAdapter(bi1Var);
            ((bi1) this.f659j0).m26148y(this.f662m0 ? 2 : 1);
        }
    }

    /* renamed from: i0 */
    public final void m30027i0() {
        this.f634H.setVisibility((m30048N() && (this.f636J.getVisibility() == 0 || this.f638L.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: j0 */
    public final void m30026j0(boolean z) {
        this.f636J.setVisibility((this.f660k0 && m30048N() && hasFocus() && (z || !this.f665p0)) ? 0 : 8);
    }

    /* renamed from: k0 */
    public final void m30025k0(boolean z) {
        this.f658i0 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f630E.getText());
        this.f635I.setVisibility(i2);
        m30026j0(z2);
        this.f632F.setVisibility(z ? 8 : 0);
        this.f645S.setVisibility((this.f645S.getDrawable() == null || this.f657h0) ? 8 : 8);
        m30031e0();
        m30024l0(!z2);
        m30027i0();
    }

    /* renamed from: l0 */
    public final void m30024l0(boolean z) {
        int i = 8;
        if (this.f665p0 && !m30050L() && z) {
            this.f636J.setVisibility(8);
            i = 0;
        }
        this.f638L.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f672w0);
        post(this.f673x0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C0164b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m30053I(this.f630E, this.f641O);
            Rect rect = this.f642P;
            Rect rect2 = this.f641O;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0150p c0150p = this.f640N;
            if (c0150p != null) {
                c0150p.m30009a(this.f642P, this.f641O);
                return;
            }
            C0150p c0150p2 = new C0150p(this.f642P, this.f641O, this.f630E);
            this.f640N = c0150p2;
            setTouchDelegate(c0150p2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.C0164b, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode;
        if (m30050L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size = this.f664o0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            } else if (mode2 == 1073741824) {
                i3 = this.f664o0;
            }
            mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                size2 = Math.min(getPreferredHeight(), size2);
            } else if (mode == 0) {
                size2 = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        i3 = this.f664o0;
        if (i3 <= 0) {
            i3 = getPreferredWidth();
        }
        size = Math.min(i3, size);
        mode = View.MeasureSpec.getMode(i2);
        int size22 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size22, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        m30025k0(savedState.f676r);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f676r = m30050L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m30034b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f663n0 && isFocusable()) {
            if (m30050L()) {
                return super.requestFocus(i, rect);
            }
            boolean requestFocus = this.f630E.requestFocus(i, rect);
            if (requestFocus) {
                m30025k0(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f671v0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m30044R();
        } else {
            m30040V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f657h0 == z) {
            return;
        }
        this.f657h0 = z;
        m30025k0(z);
        m30029g0();
    }

    public void setImeOptions(int i) {
        this.f630E.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f630E.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f664o0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0146l interfaceC0146l) {
        this.f653d0 = interfaceC0146l;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f654e0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0147m interfaceC0147m) {
        this.f652c0 = interfaceC0147m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f656g0 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0148n interfaceC0148n) {
        this.f655f0 = interfaceC0148n;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f661l0 = charSequence;
        m30029g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f662m0 = z;
        AbstractC2317nn abstractC2317nn = this.f659j0;
        if (abstractC2317nn instanceof bi1) {
            ((bi1) abstractC2317nn).m26148y(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f670u0 = searchableInfo;
        if (searchableInfo != null) {
            m30028h0();
            m30029g0();
        }
        boolean m30051K = m30051K();
        this.f665p0 = m30051K;
        if (m30051K) {
            this.f630E.setPrivateImeOptions("nm");
        }
        m30025k0(m30050L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f660k0 = z;
        m30025k0(m30050L());
    }

    public void setSuggestionsAdapter(AbstractC2317nn abstractC2317nn) {
        this.f659j0 = abstractC2317nn;
        this.f630E.setAdapter(abstractC2317nn);
    }
}
