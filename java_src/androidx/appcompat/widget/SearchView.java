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
import com.daaw.bi1;
import com.daaw.c21;
import com.daaw.em1;
import com.daaw.fg;
import com.daaw.g11;
import com.daaw.hu1;
import com.daaw.i21;
import com.daaw.nn;
import com.daaw.o11;
import com.daaw.q3;
import com.daaw.ul1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements fg {
    public static final o F0;
    public View.OnKeyListener A0;
    public final TextView.OnEditorActionListener B0;
    public final AdapterView.OnItemClickListener C0;
    public final AdapterView.OnItemSelectedListener D0;
    public final SearchAutoComplete E;
    public TextWatcher E0;
    public final View F;
    public final View G;
    public final View H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final ImageView L;
    public final View M;
    public p N;
    public Rect O;
    public Rect P;
    public int[] Q;
    public int[] R;
    public final ImageView S;
    public final Drawable T;
    public final int U;
    public final int V;
    public final Intent W;
    public final Intent a0;
    public final CharSequence b0;
    public m c0;
    public l d0;
    public View.OnFocusChangeListener e0;
    public n f0;
    public View.OnClickListener g0;
    public boolean h0;
    public boolean i0;
    public nn j0;
    public boolean k0;
    public CharSequence l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public boolean p0;
    public CharSequence q0;
    public CharSequence r0;
    public boolean s0;
    public int t0;
    public SearchableInfo u0;
    public Bundle v0;
    public final Runnable w0;
    public Runnable x0;
    public final WeakHashMap<String, Drawable.ConstantState> y0;
    public final View.OnClickListener z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean r;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.r = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.r + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.r));
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends q3 {
        public int t;
        public SearchView u;
        public boolean v;
        public final Runnable w;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, x01.p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.w = new a();
            this.t = getThreshold();
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

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.F0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.v) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.v = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.t <= 0 || super.enoughToFilter();
        }

        @Override // com.daaw.q3, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.v) {
                removeCallbacks(this.w);
                post(this.w);
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
            this.u.Z();
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
                        this.u.clearFocus();
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
            if (z && this.u.hasFocus() && getVisibility() == 0) {
                this.v = true;
                if (SearchView.M(getContext())) {
                    b();
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
                this.v = false;
                removeCallbacks(this.w);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.v = true;
            } else {
                this.v = false;
                removeCallbacks(this.w);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.u = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.t = i;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.Y(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nn nnVar = SearchView.this.j0;
            if (nnVar instanceof bi1) {
                nnVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.e0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.I) {
                searchView.V();
            } else if (view == searchView.K) {
                searchView.R();
            } else if (view == searchView.J) {
                searchView.W();
            } else if (view == searchView.L) {
                searchView.a0();
            } else if (view == searchView.E) {
                searchView.H();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.u0 == null) {
                return false;
            }
            if (!searchView.E.isPopupShowing() || SearchView.this.E.getListSelection() == -1) {
                if (!SearchView.this.E.c() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.P(0, null, searchView2.E.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.X(view, i, keyEvent);
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.S(i, 0, null);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean onClose();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    /* loaded from: classes.dex */
    public static class o {
        public Method a;
        public Method b;
        public Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.a = null;
            this.b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
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
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.c.contains(x, y)) {
                    Rect rect = this.c;
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = this.a.getWidth() / 2;
                    i = this.a.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return this.a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        F0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new int[2];
        this.R = new int[2];
        this.w0 = new b();
        this.x0 = new c();
        this.y0 = new WeakHashMap<>();
        f fVar = new f();
        this.z0 = fVar;
        this.A0 = new g();
        h hVar = new h();
        this.B0 = hVar;
        i iVar = new i();
        this.C0 = iVar;
        j jVar = new j();
        this.D0 = jVar;
        this.E0 = new a();
        int[] iArr = x21.f2;
        ul1 v = ul1.v(context, attributeSet, iArr, i2, 0);
        xs1.p0(this, context, iArr, attributeSet, v.r(), i2, 0);
        LayoutInflater.from(context).inflate(v.n(x21.p2, c21.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(o11.search_src_text);
        this.E = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.F = findViewById(o11.search_edit_frame);
        View findViewById = findViewById(o11.search_plate);
        this.G = findViewById;
        View findViewById2 = findViewById(o11.submit_area);
        this.H = findViewById2;
        ImageView imageView = (ImageView) findViewById(o11.search_button);
        this.I = imageView;
        ImageView imageView2 = (ImageView) findViewById(o11.search_go_btn);
        this.J = imageView2;
        ImageView imageView3 = (ImageView) findViewById(o11.search_close_btn);
        this.K = imageView3;
        ImageView imageView4 = (ImageView) findViewById(o11.search_voice_btn);
        this.L = imageView4;
        ImageView imageView5 = (ImageView) findViewById(o11.search_mag_icon);
        this.S = imageView5;
        xs1.v0(findViewById, v.g(x21.q2));
        xs1.v0(findViewById2, v.g(x21.u2));
        int i3 = x21.t2;
        imageView.setImageDrawable(v.g(i3));
        imageView2.setImageDrawable(v.g(x21.n2));
        imageView3.setImageDrawable(v.g(x21.k2));
        imageView4.setImageDrawable(v.g(x21.w2));
        imageView5.setImageDrawable(v.g(i3));
        this.T = v.g(x21.s2);
        em1.a(imageView, getResources().getString(i21.abc_searchview_description_search));
        this.U = v.n(x21.v2, c21.abc_search_dropdown_item_icons_2line);
        this.V = v.n(x21.l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.E0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.A0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v.a(x21.o2, true));
        int f2 = v.f(x21.h2, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.b0 = v.p(x21.m2);
        this.l0 = v.p(x21.r2);
        int k2 = v.k(x21.j2, -1);
        if (k2 != -1) {
            setImeOptions(k2);
        }
        int k3 = v.k(x21.i2, -1);
        if (k3 != -1) {
            setInputType(k3);
        }
        setFocusable(v.a(x21.g2, true));
        v.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.W = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.a0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.M = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.h0);
        g0();
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(g11.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(g11.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.E.setText(charSequence);
        this.E.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void B() {
        if (this.M.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.G.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = hu1.b(this);
            int dimensionPixelSize = this.h0 ? resources.getDimensionPixelSize(g11.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(g11.abc_dropdownitem_text_padding_left) : 0;
            this.E.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.E.setDropDownHorizontalOffset(b2 ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.E.setDropDownWidth((((this.M.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.r0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.u0.getSearchActivity());
        return intent;
    }

    public final Intent D(Cursor cursor, int i2, String str) {
        int i3;
        String o2;
        try {
            try {
                String o3 = bi1.o(cursor, "suggest_intent_action");
                if (o3 == null) {
                    o3 = this.u0.getSuggestIntentAction();
                }
                if (o3 == null) {
                    o3 = "android.intent.action.SEARCH";
                }
                String str2 = o3;
                String o4 = bi1.o(cursor, "suggest_intent_data");
                if (o4 == null) {
                    o4 = this.u0.getSuggestIntentData();
                }
                if (o4 != null && (o2 = bi1.o(cursor, "suggest_intent_data_id")) != null) {
                    o4 = o4 + "/" + Uri.encode(o2);
                }
                return C(str2, o4 == null ? null : Uri.parse(o4), bi1.o(cursor, "suggest_intent_extra_data"), bi1.o(cursor, "suggest_intent_query"), i2, str);
            } catch (RuntimeException unused) {
                i3 = -1;
                StringBuilder sb = new StringBuilder();
                sb.append("Search suggestions cursor at row ");
                sb.append(i3);
                sb.append(" returned exception.");
                return null;
            }
        } catch (RuntimeException unused2) {
            i3 = cursor.getPosition();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i3);
            sb2.append(" returned exception.");
            return null;
        }
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.v0;
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

    public final Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void G() {
        this.E.dismissDropDown();
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.E);
            return;
        }
        o oVar = F0;
        oVar.b(this.E);
        oVar.a(this.E);
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.Q);
        getLocationInWindow(this.R);
        int[] iArr = this.Q;
        int i2 = iArr[1];
        int[] iArr2 = this.R;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    public final CharSequence J(CharSequence charSequence) {
        if (!this.h0 || this.T == null) {
            return charSequence;
        }
        double textSize = this.E.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.T.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.T), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.u0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.u0.getVoiceSearchLaunchWebSearch()) {
            intent = this.W;
        } else if (this.u0.getVoiceSearchLaunchRecognizer()) {
            intent = this.a0;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean L() {
        return this.i0;
    }

    public final boolean N() {
        return (this.k0 || this.p0) && !L();
    }

    public final void O(Intent intent) {
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

    public void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    public final boolean Q(int i2, int i3, String str) {
        Cursor b2 = this.j0.b();
        if (b2 == null || !b2.moveToPosition(i2)) {
            return false;
        }
        O(D(b2, i3, str));
        return true;
    }

    public void R() {
        if (!TextUtils.isEmpty(this.E.getText())) {
            this.E.setText("");
            this.E.requestFocus();
            this.E.setImeVisibility(true);
        } else if (this.h0) {
            l lVar = this.d0;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                k0(true);
            }
        }
    }

    public boolean S(int i2, int i3, String str) {
        n nVar = this.f0;
        if (nVar == null || !nVar.b(i2)) {
            Q(i2, 0, null);
            this.E.setImeVisibility(false);
            G();
            return true;
        }
        return false;
    }

    public boolean T(int i2) {
        n nVar = this.f0;
        if (nVar == null || !nVar.a(i2)) {
            c0(i2);
            return true;
        }
        return false;
    }

    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void V() {
        k0(false);
        this.E.requestFocus();
        this.E.setImeVisibility(true);
        View.OnClickListener onClickListener = this.g0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void W() {
        Editable text = this.E.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.c0;
        if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
            if (this.u0 != null) {
                P(0, null, text.toString());
            }
            this.E.setImeVisibility(false);
            G();
        }
    }

    public boolean X(View view, int i2, KeyEvent keyEvent) {
        if (this.u0 != null && this.j0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.E.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.E.setSelection(i2 == 21 ? 0 : this.E.length());
                this.E.setListSelection(0);
                this.E.clearListSelection();
                this.E.b();
                return true;
            } else if (i2 == 19) {
                this.E.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void Y(CharSequence charSequence) {
        Editable text = this.E.getText();
        this.r0 = text;
        boolean z = !TextUtils.isEmpty(text);
        j0(z);
        l0(!z);
        e0();
        i0();
        if (this.c0 != null && !TextUtils.equals(charSequence, this.q0)) {
            this.c0.onQueryTextChange(charSequence.toString());
        }
        this.q0 = charSequence.toString();
    }

    public void Z() {
        k0(L());
        b0();
        if (this.E.hasFocus()) {
            H();
        }
    }

    public void a0() {
        Intent E;
        SearchableInfo searchableInfo = this.u0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                E = F(this.W, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                E = E(this.a0, searchableInfo);
            }
            getContext().startActivity(E);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void b0() {
        post(this.w0);
    }

    @Override // com.daaw.fg
    public void c() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        int imeOptions = this.E.getImeOptions();
        this.t0 = imeOptions;
        this.E.setImeOptions(imeOptions | 33554432);
        this.E.setText("");
        setIconified(false);
    }

    public final void c0(int i2) {
        CharSequence c2;
        Editable text = this.E.getText();
        Cursor b2 = this.j0.b();
        if (b2 == null) {
            return;
        }
        if (!b2.moveToPosition(i2) || (c2 = this.j0.c(b2)) == null) {
            setQuery(text);
        } else {
            setQuery(c2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.n0 = true;
        super.clearFocus();
        this.E.clearFocus();
        this.E.setImeVisibility(false);
        this.n0 = false;
    }

    public void d0(CharSequence charSequence, boolean z) {
        this.E.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.E;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.r0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    public final void e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.E.getText());
        if (!z2 && (!this.h0 || this.s0)) {
            z = false;
        }
        this.K.setVisibility(z ? 0 : 8);
        Drawable drawable = this.K.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // com.daaw.fg
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.E.setImeOptions(this.t0);
        this.s0 = false;
    }

    public void f0() {
        int[] iArr = this.E.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.H.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.E;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    public int getImeOptions() {
        return this.E.getImeOptions();
    }

    public int getInputType() {
        return this.E.getInputType();
    }

    public int getMaxWidth() {
        return this.o0;
    }

    public CharSequence getQuery() {
        return this.E.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.l0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.u0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.b0 : getContext().getText(this.u0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.V;
    }

    public int getSuggestionRowLayout() {
        return this.U;
    }

    public nn getSuggestionsAdapter() {
        return this.j0;
    }

    public final void h0() {
        this.E.setThreshold(this.u0.getSuggestThreshold());
        this.E.setImeOptions(this.u0.getImeOptions());
        int inputType = this.u0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.u0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.E.setInputType(inputType);
        nn nnVar = this.j0;
        if (nnVar != null) {
            nnVar.a(null);
        }
        if (this.u0.getSuggestAuthority() != null) {
            bi1 bi1Var = new bi1(getContext(), this, this.u0, this.y0);
            this.j0 = bi1Var;
            this.E.setAdapter(bi1Var);
            ((bi1) this.j0).y(this.m0 ? 2 : 1);
        }
    }

    public final void i0() {
        this.H.setVisibility((N() && (this.J.getVisibility() == 0 || this.L.getVisibility() == 0)) ? 0 : 8);
    }

    public final void j0(boolean z) {
        this.J.setVisibility((this.k0 && N() && hasFocus() && (z || !this.p0)) ? 0 : 8);
    }

    public final void k0(boolean z) {
        this.i0 = z;
        int i2 = 0;
        int i3 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.E.getText());
        this.I.setVisibility(i3);
        j0(z2);
        this.F.setVisibility(z ? 8 : 0);
        this.S.setVisibility((this.S.getDrawable() == null || this.h0) ? 8 : 8);
        e0();
        l0(!z2);
        i0();
    }

    public final void l0(boolean z) {
        int i2 = 8;
        if (this.p0 && !L() && z) {
            this.J.setVisibility(8);
            i2 = 0;
        }
        this.L.setVisibility(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.w0);
        post(this.x0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            I(this.E, this.O);
            Rect rect = this.P;
            Rect rect2 = this.O;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.N;
            if (pVar != null) {
                pVar.a(this.P, this.O);
                return;
            }
            p pVar2 = new p(this.P, this.O, this.E);
            this.N = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.b, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.o0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.o0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.o0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        k0(savedState.r);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.r = L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (!this.n0 && isFocusable()) {
            if (L()) {
                return super.requestFocus(i2, rect);
            }
            boolean requestFocus = this.E.requestFocus(i2, rect);
            if (requestFocus) {
                k0(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.v0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.h0 == z) {
            return;
        }
        this.h0 = z;
        k0(z);
        g0();
    }

    public void setImeOptions(int i2) {
        this.E.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.E.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.o0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.d0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.e0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.c0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.g0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.f0 = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.l0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.m0 = z;
        nn nnVar = this.j0;
        if (nnVar instanceof bi1) {
            ((bi1) nnVar).y(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.u0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.p0 = K;
        if (K) {
            this.E.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.k0 = z;
        k0(L());
    }

    public void setSuggestionsAdapter(nn nnVar) {
        this.j0 = nnVar;
        this.E.setAdapter(nnVar);
    }
}
