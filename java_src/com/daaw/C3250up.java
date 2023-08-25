package com.daaw;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* renamed from: com.daaw.up */
/* loaded from: classes2.dex */
public class C3250up extends BaseAdapter {

    /* renamed from: s */
    public static final int f29402s;

    /* renamed from: p */
    public final Calendar f29403p;

    /* renamed from: q */
    public final int f29404q;

    /* renamed from: r */
    public final int f29405r;

    static {
        f29402s = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C3250up() {
        Calendar m14076k = oq1.m14076k();
        this.f29403p = m14076k;
        this.f29404q = m14076k.getMaximum(7);
        this.f29405r = m14076k.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f29404q) {
            return null;
        }
        return Integer.valueOf(m7853b(i));
    }

    /* renamed from: b */
    public final int m7853b(int i) {
        int i2 = i + this.f29405r;
        int i3 = this.f29404q;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f29404q;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a21.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f29403p.set(7, m7853b(i));
        textView.setText(this.f29403p.getDisplayName(7, f29402s, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(h21.mtrl_picker_day_of_week_column_header), this.f29403p.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
