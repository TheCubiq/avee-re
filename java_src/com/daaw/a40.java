package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class a40 {

    /* renamed from: com.daaw.a40$a */
    /* loaded from: classes.dex */
    public class RunnableC0599a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f2862p;

        /* renamed from: q */
        public final /* synthetic */ ArrayList f2863q;

        /* renamed from: r */
        public final /* synthetic */ ArrayList f2864r;

        /* renamed from: s */
        public final /* synthetic */ ArrayList f2865s;

        /* renamed from: t */
        public final /* synthetic */ ArrayList f2866t;

        public RunnableC0599a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2862p = i;
            this.f2863q = arrayList;
            this.f2864r = arrayList2;
            this.f2865s = arrayList3;
            this.f2866t = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f2862p; i++) {
                xs1.m4759I0((View) this.f2863q.get(i), (String) this.f2864r.get(i));
                xs1.m4759I0((View) this.f2865s.get(i), (String) this.f2866t.get(i));
            }
        }
    }

    /* renamed from: com.daaw.a40$b */
    /* loaded from: classes.dex */
    public class RunnableC0600b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ArrayList f2868p;

        /* renamed from: q */
        public final /* synthetic */ Map f2869q;

        public RunnableC0600b(ArrayList arrayList, Map map) {
            this.f2868p = arrayList;
            this.f2869q = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2868p.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2868p.get(i);
                String m4750N = xs1.m4750N(view);
                if (m4750N != null) {
                    xs1.m4759I0(view, a40.m27619i(this.f2869q, m4750N));
                }
            }
        }
    }

    /* renamed from: com.daaw.a40$c */
    /* loaded from: classes.dex */
    public class RunnableC0601c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ArrayList f2871p;

        /* renamed from: q */
        public final /* synthetic */ Map f2872q;

        public RunnableC0601c(ArrayList arrayList, Map map) {
            this.f2871p = arrayList;
            this.f2872q = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2871p.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2871p.get(i);
                xs1.m4759I0(view, (String) this.f2872q.get(xs1.m4750N(view)));
            }
        }
    }

    /* renamed from: d */
    public static void m27622d(List<View> list, View view) {
        int size = list.size();
        if (m27620h(list, view, size)) {
            return;
        }
        if (xs1.m4750N(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m27620h(list, childAt, size) && xs1.m4750N(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m27620h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static String m27619i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    public static boolean m27616l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo2908A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo2907B(Object obj);

    /* renamed from: a */
    public abstract void mo2905a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2904b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo2903c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo2902e(Object obj);

    /* renamed from: f */
    public void m27621f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean m25838a = bt1.m25838a(viewGroup2);
                viewGroup = viewGroup2;
                if (!m25838a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m27621f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: g */
    public abstract Object mo2901g(Object obj);

    /* renamed from: j */
    public void m27618j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m4750N = xs1.m4750N(view);
            if (m4750N != null) {
                map.put(m4750N, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m27618j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: k */
    public void m27617k(View view, Rect rect) {
        if (xs1.m4743U(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo2900m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo2899n(Object obj, Object obj2, Object obj3);

    /* renamed from: o */
    public ArrayList<String> m27615o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(xs1.m4750N(view));
            xs1.m4759I0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo2898p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo2897q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo2896r(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: s */
    public void m27614s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        nu0.m14792a(viewGroup, new RunnableC0601c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo2895t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo2894u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo2893v(Object obj, View view);

    /* renamed from: w */
    public void mo2892w(Fragment fragment, Object obj, C3423wd c3423wd, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: x */
    public void m27613x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        nu0.m14792a(view, new RunnableC0600b(arrayList, map));
    }

    /* renamed from: y */
    public void m27612y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m4750N = xs1.m4750N(view2);
            arrayList4.add(m4750N);
            if (m4750N != null) {
                xs1.m4759I0(view2, null);
                String str = map.get(m4750N);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        xs1.m4759I0(arrayList2.get(i2), m4750N);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        nu0.m14792a(view, new RunnableC0599a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo2891z(Object obj, View view, ArrayList<View> arrayList);
}
