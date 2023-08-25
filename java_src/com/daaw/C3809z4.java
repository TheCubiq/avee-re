package com.daaw;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.daaw.z4 */
/* loaded from: classes.dex */
public class C3809z4 {

    /* renamed from: b */
    public static final Class<?>[] f34434b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f34435c = {16843375};

    /* renamed from: d */
    public static final int[] f34436d = {16844160};

    /* renamed from: e */
    public static final int[] f34437e = {16844156};

    /* renamed from: f */
    public static final int[] f34438f = {16844148};

    /* renamed from: g */
    public static final String[] f34439g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final cd1<String, Constructor<? extends View>> f34440h = new cd1<>();

    /* renamed from: a */
    public final Object[] f34441a = new Object[2];

    /* renamed from: com.daaw.z4$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC3810a implements View.OnClickListener {

        /* renamed from: p */
        public final View f34442p;

        /* renamed from: q */
        public final String f34443q;

        /* renamed from: r */
        public Method f34444r;

        /* renamed from: s */
        public Context f34445s;

        public View$OnClickListenerC3810a(View view, String str) {
            this.f34442p = view;
            this.f34443q = str;
        }

        /* renamed from: a */
        public final void m2830a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f34443q, View.class)) != null) {
                        this.f34444r = method;
                        this.f34445s = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f34442p.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f34442p.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f34443q + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f34442p.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f34444r == null) {
                m2830a(this.f34442p.getContext());
            }
            try {
                this.f34444r.invoke(this.f34445s, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: u */
    public static Context m2832u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.f31807J3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(x21.f31812K3, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(x21.f31817L3, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0855bl) && ((C0855bl) context).m26077c() == resourceId) ? context : new C0855bl(context, resourceId) : context;
    }

    /* renamed from: a */
    public final void m2847a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f34436d);
        if (obtainStyledAttributes.hasValue(0)) {
            xs1.m4700s0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f34437e);
        if (obtainStyledAttributes2.hasValue(0)) {
            xs1.m4696u0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f34438f);
        if (obtainStyledAttributes3.hasValue(0)) {
            xs1.m4765F0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    /* renamed from: b */
    public final void m2846b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && xs1.m4747Q(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f34435c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC3810a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public C2682q3 mo178c(Context context, AttributeSet attributeSet) {
        return new C2682q3(context, attributeSet);
    }

    /* renamed from: d */
    public C2908s3 mo177d(Context context, AttributeSet attributeSet) {
        return new C2908s3(context, attributeSet);
    }

    /* renamed from: e */
    public AppCompatCheckBox mo176e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: f */
    public C3159u3 m2845f(Context context, AttributeSet attributeSet) {
        return new C3159u3(context, attributeSet);
    }

    /* renamed from: g */
    public AppCompatEditText m2844g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: h */
    public C1499h4 m2843h(Context context, AttributeSet attributeSet) {
        return new C1499h4(context, attributeSet);
    }

    /* renamed from: i */
    public C1782j4 m2842i(Context context, AttributeSet attributeSet) {
        return new C1782j4(context, attributeSet);
    }

    /* renamed from: j */
    public C1909k4 m2841j(Context context, AttributeSet attributeSet) {
        return new C1909k4(context, attributeSet);
    }

    /* renamed from: k */
    public C2405o4 mo175k(Context context, AttributeSet attributeSet) {
        return new C2405o4(context, attributeSet);
    }

    /* renamed from: l */
    public C2514p4 m2840l(Context context, AttributeSet attributeSet) {
        return new C2514p4(context, attributeSet);
    }

    /* renamed from: m */
    public C2910s4 m2839m(Context context, AttributeSet attributeSet) {
        return new C2910s4(context, attributeSet);
    }

    /* renamed from: n */
    public AppCompatSpinner m2838n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: o */
    public C3397w4 mo174o(Context context, AttributeSet attributeSet) {
        return new C3397w4(context, attributeSet);
    }

    /* renamed from: p */
    public C3667y4 m2837p(Context context, AttributeSet attributeSet) {
        return new C3667y4(context, attributeSet);
    }

    /* renamed from: q */
    public View m2836q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View m2835r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View m2840l;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m2832u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = rl1.m11199b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m2840l = m2840l(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 1:
                m2840l = m2845f(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 2:
                m2840l = m2841j(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 3:
                m2840l = mo174o(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 4:
                m2840l = m2843h(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 5:
                m2840l = m2839m(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 6:
                m2840l = m2838n(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 7:
                m2840l = mo175k(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case '\b':
                m2840l = m2837p(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case '\t':
                m2840l = m2842i(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case '\n':
                m2840l = mo178c(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case 11:
                m2840l = mo176e(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case '\f':
                m2840l = m2844g(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            case '\r':
                m2840l = mo177d(context2, attributeSet);
                m2831v(m2840l, str);
                break;
            default:
                m2840l = m2836q(context2, str, attributeSet);
                break;
        }
        if (m2840l == null && context != context2) {
            m2840l = m2833t(context2, str, attributeSet);
        }
        if (m2840l != null) {
            m2846b(m2840l, attributeSet);
            m2847a(context2, m2840l, attributeSet);
        }
        return m2840l;
    }

    /* renamed from: s */
    public final View m2834s(Context context, String str, String str2) {
        String str3;
        cd1<String, Constructor<? extends View>> cd1Var = f34440h;
        Constructor<? extends View> constructor = cd1Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f34434b);
            cd1Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f34441a);
    }

    /* renamed from: t */
    public final View m2833t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f34441a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m2834s(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f34439g;
                if (i >= strArr.length) {
                    return null;
                }
                View m2834s = m2834s(context, str, strArr[i]);
                if (m2834s != null) {
                    return m2834s;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f34441a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: v */
    public final void m2831v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
