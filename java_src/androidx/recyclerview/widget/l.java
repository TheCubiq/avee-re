package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class l {
    public static int a(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
        }
        return Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1;
    }

    public static int b(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (zVar.b() - Math.max(oVar.h0(view), oVar.h0(view2))) - 1) : Math.max(0, Math.min(oVar.h0(view), oVar.h0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1))) + (iVar.m() - iVar.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1)) * zVar.b());
        }
        return zVar.b();
    }
}
