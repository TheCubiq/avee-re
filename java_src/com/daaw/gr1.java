package com.daaw;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
/* loaded from: classes.dex */
public class gr1 {

    /* renamed from: com.daaw.gr1$a */
    /* loaded from: classes.dex */
    public class C1456a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1153e0 f11612a;

        public C1456a(InterfaceC1153e0 interfaceC1153e0) {
            this.f11612a = interfaceC1153e0;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11612a.mo7884a((Integer) valueAnimator.getAnimatedValue());
        }
    }

    /* renamed from: com.daaw.gr1$b */
    /* loaded from: classes.dex */
    public class C1457b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1153e0 f11613a;

        public C1457b(InterfaceC1153e0 interfaceC1153e0) {
            this.f11613a = interfaceC1153e0;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11613a.mo7884a((Integer) valueAnimator.getAnimatedValue());
        }
    }

    /* renamed from: com.daaw.gr1$c */
    /* loaded from: classes.dex */
    public class C1458c implements Animator.AnimatorListener {

        /* renamed from: a */
        public boolean f11614a = false;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC1492h0 f11615b;

        public C1458c(InterfaceC1492h0 interfaceC1492h0) {
            this.f11615b = interfaceC1492h0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11614a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11614a) {
                return;
            }
            this.f11615b.mo3002a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: b */
    public static void m21333b() {
        C2691q6.m12749i(Looper.myLooper() != Looper.getMainLooper());
    }

    /* renamed from: c */
    public static void m21332c() {
        C2691q6.m12749i(Looper.myLooper() == Looper.getMainLooper());
    }

    /* renamed from: d */
    public static boolean m21331d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: e */
    public static ValueAnimator m21330e(ValueAnimator valueAnimator, InterfaceC1153e0<Integer> interfaceC1153e0, int i, long j, InterfaceC1492h0 interfaceC1492h0) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 0);
        ofInt.addUpdateListener(new C1457b(interfaceC1153e0));
        ofInt.setDuration(j);
        ofInt.addListener(new C1458c(interfaceC1492h0));
        ofInt.start();
        return ofInt;
    }

    /* renamed from: f */
    public static ValueAnimator m21329f(ValueAnimator valueAnimator, InterfaceC1153e0<Integer> interfaceC1153e0, int i, long j) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 255);
        ofInt.addUpdateListener(new C1456a(interfaceC1153e0));
        ofInt.setDuration(j);
        ofInt.start();
        return ofInt;
    }

    /* renamed from: g */
    public static void m21328g(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        dialog.cancel();
    }

    /* renamed from: h */
    public static Bitmap m21327h(Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                try {
                    config = Bitmap.Config.RGB_565;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                } catch (OutOfMemoryError e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            return bitmap.copy(config, false);
        }
        return bitmap;
    }

    /* renamed from: i */
    public static void m21326i(View view, ViewParent viewParent) {
        view.setOnTouchListener(new lu0(viewParent));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m21326i(viewGroup.getChildAt(childCount), viewParent);
            }
        }
    }

    /* renamed from: j */
    public static void m21325j(DialogFragment dialogFragment) {
        if (dialogFragment == null) {
            return;
        }
        try {
            dialogFragment.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public static void m21324k(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            try {
                popupWindow.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: l */
    public static void m21323l(C0645al c0645al, DialogFragment dialogFragment, String str) {
        FragmentManager m27376c = c0645al.m27376c();
        FragmentTransaction beginTransaction = m27376c.beginTransaction();
        Fragment findFragmentByTag = m27376c.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        Activity m27378a = c0645al.m27378a();
        if (m27378a == null || m27378a.isFinishing() || c0645al.m27376c() == null) {
            return;
        }
        try {
            dialogFragment.show(beginTransaction, str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    public static int m21322m(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* renamed from: n */
    public static int m21321n(View view, int i) {
        TypedArray obtainStyledAttributes = view.getContext().getTheme().obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* renamed from: o */
    public static int m21320o(Resources.Theme theme, Context context, int i, int i2) {
        return (m21322m(theme, i) & 16777215) | (C3866zk.m2180c(context, i2) & (-16777216));
    }

    /* renamed from: p */
    public static LayoutInflater m21319p(Context context) {
        return LayoutInflater.from(context);
    }

    /* renamed from: q */
    public static int m21318q(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: r */
    public static void m21317r(final View view) {
        if (view == null) {
            return;
        }
        int integer = view.getResources().getInteger(17694720);
        view.animate().cancel();
        view.animate().withEndAction(new Runnable() { // from class: com.daaw.fr1
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(4);
            }
        }).alpha(0.0f).setDuration(integer);
    }

    /* renamed from: t */
    public static void m21315t(View[] viewArr, View view) {
        if (viewArr[0] != null) {
            viewArr[0].setSelected(false);
        }
        viewArr[0] = view;
        view.setSelected(true);
    }

    /* renamed from: u */
    public static void m21314u(View view) {
        if (view == null) {
            return;
        }
        view.getLayoutParams().height = m21318q(view.getContext());
    }

    /* renamed from: v */
    public static void m21313v(View view, int i, int i2) {
        if (view instanceof ViewGroup) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                m21313v(viewGroup.getChildAt(i3), i, i2);
                i3++;
            }
        }
        if (!(view instanceof TextView)) {
            if (view instanceof ImageView) {
                ((ImageView) view).setColorFilter(i);
                return;
            }
            return;
        }
        TextView textView = (TextView) view;
        textView.setTextColor(i);
        textView.setHintTextColor(i2);
        textView.setLinkTextColor(i2);
    }

    /* renamed from: w */
    public static void m21312w(View view) {
        if (view == null) {
            return;
        }
        int integer = view.getResources().getInteger(17694720);
        view.animate().cancel();
        view.animate().withEndAction(null);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(integer);
    }

    /* renamed from: x */
    public static void m21311x(DialogFragment dialogFragment, String str, C0645al c0645al) {
        Activity m27378a;
        FragmentManager m27376c;
        if (c0645al == null || (m27378a = c0645al.m27378a()) == null || m27378a.isFinishing() || (m27376c = c0645al.m27376c()) == null) {
            return;
        }
        try {
            dialogFragment.show(m27376c, str);
        } catch (Exception unused) {
        }
    }
}
