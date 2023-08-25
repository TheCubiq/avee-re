package com.daaw;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.daaw.C3081tk;
/* renamed from: com.daaw.q4 */
/* loaded from: classes.dex */
public final class C2688q4 {

    /* renamed from: com.daaw.q4$a */
    /* loaded from: classes.dex */
    public static final class C2689a {
        /* renamed from: a */
        public static boolean m12785a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                xs1.m4722h0(textView, new C3081tk.C3082a(dragEvent.getClipData(), 3).m9060a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        public static boolean m12784b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            xs1.m4722h0(view, new C3081tk.C3082a(dragEvent.getClipData(), 3).m9060a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m12788a(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && xs1.m4762H(view) != null) {
            Activity m12786c = m12786c(view);
            if (m12786c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? C2689a.m12785a(dragEvent, (TextView) view, m12786c) : C2689a.m12784b(dragEvent, view, m12786c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m12787b(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || xs1.m4762H(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            xs1.m4722h0(textView, new C3081tk.C3082a(primaryClip, 1).m9058c(i != 16908322 ? 1 : 0).m9060a());
        }
        return true;
    }

    /* renamed from: c */
    public static Activity m12786c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
