package com.daaw;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ii0 {

    /* renamed from: a */
    public static boolean f13655a;

    /* renamed from: b */
    public static Method f13656b;

    /* renamed from: c */
    public static boolean f13657c;

    /* renamed from: d */
    public static Field f13658d;

    /* renamed from: com.daaw.ii0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1709a {
        /* renamed from: k */
        boolean mo2326k(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m19786a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f13655a) {
            try {
                f13656b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f13655a = true;
        }
        Method method = f13656b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m19785b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m19786a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (xs1.m4719j(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    public static boolean m19784c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m19781f = m19781f(dialog);
        if (m19781f == null || !m19781f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (xs1.m4719j(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m19783d(View view, KeyEvent keyEvent) {
        return xs1.m4717k(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m19782e(InterfaceC1709a interfaceC1709a, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC1709a == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? interfaceC1709a.mo2326k(keyEvent) : callback instanceof Activity ? m19785b((Activity) callback, keyEvent) : callback instanceof Dialog ? m19784c((Dialog) callback, keyEvent) : (view != null && xs1.m4719j(view, keyEvent)) || interfaceC1709a.mo2326k(keyEvent);
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m19781f(Dialog dialog) {
        if (!f13657c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f13658d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f13657c = true;
        }
        Field field = f13658d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
