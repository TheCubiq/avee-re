package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.sj0;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0348d {

    /* renamed from: b */
    public static int f102b;

    /* renamed from: c */
    public static Field f103c;

    /* renamed from: d */
    public static Field f104d;

    /* renamed from: e */
    public static Field f105e;

    /* renamed from: a */
    public Activity f106a;

    public ImmLeaksCleaner(Activity activity) {
        this.f106a = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: h */
    public static void m30375h() {
        try {
            f102b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f104d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f105e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f103c = declaredField3;
            declaredField3.setAccessible(true);
            f102b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        if (enumC0346b != AbstractC0344c.EnumC0346b.ON_DESTROY) {
            return;
        }
        if (f102b == 0) {
            m30375h();
        }
        if (f102b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f106a.getSystemService("input_method");
            try {
                Object obj = f103c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f104d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f105e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
