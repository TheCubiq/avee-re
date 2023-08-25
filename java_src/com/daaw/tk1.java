package com.daaw;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class tk1 implements hu0 {

    /* renamed from: com.daaw.tk1$a */
    /* loaded from: classes.dex */
    public static final class C3089a {
        /* renamed from: a */
        public static CharSequence m9046a(Context context, ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* renamed from: b */
    public static CharSequence m9048b(Context context, ClipData.Item item, int i) {
        return C3089a.m9046a(context, item, i);
    }

    /* renamed from: c */
    public static void m9047c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // com.daaw.hu0
    /* renamed from: a */
    public C3081tk mo9049a(View view, C3081tk c3081tk) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(c3081tk);
        }
        if (c3081tk.m9064d() == 2) {
            return c3081tk;
        }
        ClipData m9066b = c3081tk.m9066b();
        int m9065c = c3081tk.m9065c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < m9066b.getItemCount(); i++) {
            CharSequence m9048b = m9048b(context, m9066b.getItemAt(i), m9065c);
            if (m9048b != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m9048b);
                } else {
                    m9047c(editable, m9048b);
                    z = true;
                }
            }
        }
        return null;
    }
}
