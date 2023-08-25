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
/* loaded from: classes.dex */
public class z4 {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final cd1<String, Constructor<? extends View>> h = new cd1<>();
    public final Object[] a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {
        public final View p;
        public final String q;
        public Method r;
        public Context s;

        public a(View view, String str) {
            this.p = view;
            this.q = str;
        }

        public final void a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.q, View.class)) != null) {
                        this.r = method;
                        this.s = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.p.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.p.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.q + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.p.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.r == null) {
                a(this.p.getContext());
            }
            try {
                this.r.invoke(this.s, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.J3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(x21.K3, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(x21.L3, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof bl) && ((bl) context).c() == resourceId) ? context : new bl(context, resourceId) : context;
    }

    public final void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
        if (obtainStyledAttributes.hasValue(0)) {
            xs1.s0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e);
        if (obtainStyledAttributes2.hasValue(0)) {
            xs1.u0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f);
        if (obtainStyledAttributes3.hasValue(0)) {
            xs1.F0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && xs1.Q(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public q3 c(Context context, AttributeSet attributeSet) {
        return new q3(context, attributeSet);
    }

    public s3 d(Context context, AttributeSet attributeSet) {
        return new s3(context, attributeSet);
    }

    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public u3 f(Context context, AttributeSet attributeSet) {
        return new u3(context, attributeSet);
    }

    public AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    public h4 h(Context context, AttributeSet attributeSet) {
        return new h4(context, attributeSet);
    }

    public j4 i(Context context, AttributeSet attributeSet) {
        return new j4(context, attributeSet);
    }

    public k4 j(Context context, AttributeSet attributeSet) {
        return new k4(context, attributeSet);
    }

    public o4 k(Context context, AttributeSet attributeSet) {
        return new o4(context, attributeSet);
    }

    public p4 l(Context context, AttributeSet attributeSet) {
        return new p4(context, attributeSet);
    }

    public s4 m(Context context, AttributeSet attributeSet) {
        return new s4(context, attributeSet);
    }

    public AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public w4 o(Context context, AttributeSet attributeSet) {
        return new w4(context, attributeSet);
    }

    public y4 p(Context context, AttributeSet attributeSet) {
        return new y4(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View l;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = rl1.b(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                l = l(context2, attributeSet);
                v(l, str);
                break;
            case 1:
                l = f(context2, attributeSet);
                v(l, str);
                break;
            case 2:
                l = j(context2, attributeSet);
                v(l, str);
                break;
            case 3:
                l = o(context2, attributeSet);
                v(l, str);
                break;
            case 4:
                l = h(context2, attributeSet);
                v(l, str);
                break;
            case 5:
                l = m(context2, attributeSet);
                v(l, str);
                break;
            case 6:
                l = n(context2, attributeSet);
                v(l, str);
                break;
            case 7:
                l = k(context2, attributeSet);
                v(l, str);
                break;
            case '\b':
                l = p(context2, attributeSet);
                v(l, str);
                break;
            case '\t':
                l = i(context2, attributeSet);
                v(l, str);
                break;
            case '\n':
                l = c(context2, attributeSet);
                v(l, str);
                break;
            case 11:
                l = e(context2, attributeSet);
                v(l, str);
                break;
            case '\f':
                l = g(context2, attributeSet);
                v(l, str);
                break;
            case '\r':
                l = d(context2, attributeSet);
                v(l, str);
                break;
            default:
                l = q(context2, str, attributeSet);
                break;
        }
        if (l == null && context != context2) {
            l = t(context2, str, attributeSet);
        }
        if (l != null) {
            b(l, attributeSet);
            a(context2, l, attributeSet);
        }
        return l;
    }

    public final View s(Context context, String str, String str2) {
        String str3;
        cd1<String, Constructor<? extends View>> cd1Var = h;
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
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            cd1Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = g;
                if (i >= strArr.length) {
                    return null;
                }
                View s = s(context, str, strArr[i]);
                if (s != null) {
                    return s;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
