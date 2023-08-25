package com.daaw;

import android.database.Cursor;
import android.widget.Filter;
/* renamed from: com.daaw.pn */
/* loaded from: classes.dex */
public class C2563pn extends Filter {

    /* renamed from: a */
    public InterfaceC2564a f23066a;

    /* renamed from: com.daaw.pn$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2564a {
        /* renamed from: a */
        void mo13286a(Cursor cursor);

        /* renamed from: b */
        Cursor mo13285b();

        /* renamed from: c */
        CharSequence mo13284c(Cursor cursor);

        /* renamed from: d */
        Cursor mo13283d(CharSequence charSequence);
    }

    public C2563pn(InterfaceC2564a interfaceC2564a) {
        this.f23066a = interfaceC2564a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f23066a.mo13284c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo13283d = this.f23066a.mo13283d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo13283d != null) {
            filterResults.count = mo13283d.getCount();
        } else {
            filterResults.count = 0;
            mo13283d = null;
        }
        filterResults.values = mo13283d;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo13285b = this.f23066a.mo13285b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo13285b) {
            return;
        }
        this.f23066a.mo13286a((Cursor) obj);
    }
}
