package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class gt1 {
    public static eb a(Context context, ViewGroup viewGroup, int i, wc0 wc0Var) {
        switch (i) {
            case 0:
                return new uk(viewGroup);
            case 1:
                return new c30(context, viewGroup, 0);
            case 2:
                return new g90(context, viewGroup);
            case 3:
                return new f90(context, viewGroup);
            case 4:
                return new w90(context, viewGroup);
            case 5:
                return new c90(context, viewGroup);
            case 6:
                return new k90(context, viewGroup);
            case 7:
                return new x80(context, viewGroup, wc0Var);
            case 8:
                return new y80(context, viewGroup, wc0Var);
            case 9:
                return new e90(context, viewGroup);
            case 10:
                return new qa0(context, viewGroup);
            case 11:
                return new ea0(context, viewGroup);
            case 12:
                return new ba1(context, viewGroup);
            case 13:
                return new d30(context, viewGroup);
            case 14:
                return new ja0(context, viewGroup);
            case 15:
                return new c30(context, viewGroup, 1);
            case 16:
                return new c30(context, viewGroup, 2);
            default:
                q6.k("viewType: " + i);
                return null;
        }
    }
}
