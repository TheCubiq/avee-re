package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public class C0453l {
    /* renamed from: a */
    public static int m28167a(RecyclerView.C0409z c0409z, AbstractC0446i abstractC0446i, View view, View view2, RecyclerView.AbstractC0391o abstractC0391o, boolean z) {
        if (abstractC0391o.m28658J() == 0 || c0409z.m28495b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(abstractC0446i.mo28184n(), abstractC0446i.mo28194d(view2) - abstractC0446i.mo28191g(view));
        }
        return Math.abs(abstractC0391o.m28616h0(view) - abstractC0391o.m28616h0(view2)) + 1;
    }

    /* renamed from: b */
    public static int m28166b(RecyclerView.C0409z c0409z, AbstractC0446i abstractC0446i, View view, View view2, RecyclerView.AbstractC0391o abstractC0391o, boolean z, boolean z2) {
        if (abstractC0391o.m28658J() == 0 || c0409z.m28495b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0409z.m28495b() - Math.max(abstractC0391o.m28616h0(view), abstractC0391o.m28616h0(view2))) - 1) : Math.max(0, Math.min(abstractC0391o.m28616h0(view), abstractC0391o.m28616h0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC0446i.mo28194d(view2) - abstractC0446i.mo28191g(view)) / (Math.abs(abstractC0391o.m28616h0(view) - abstractC0391o.m28616h0(view2)) + 1))) + (abstractC0446i.mo28185m() - abstractC0446i.mo28191g(view)));
        }
        return max;
    }

    /* renamed from: c */
    public static int m28165c(RecyclerView.C0409z c0409z, AbstractC0446i abstractC0446i, View view, View view2, RecyclerView.AbstractC0391o abstractC0391o, boolean z) {
        if (abstractC0391o.m28658J() == 0 || c0409z.m28495b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((abstractC0446i.mo28194d(view2) - abstractC0446i.mo28191g(view)) / (Math.abs(abstractC0391o.m28616h0(view) - abstractC0391o.m28616h0(view2)) + 1)) * c0409z.m28495b());
        }
        return c0409z.m28495b();
    }
}
