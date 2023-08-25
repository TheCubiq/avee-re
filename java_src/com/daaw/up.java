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
/* loaded from: classes2.dex */
public class up extends BaseAdapter {
    public static final int s;
    public final Calendar p;
    public final int q;
    public final int r;

    static {
        s = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public up() {
        Calendar k = oq1.k();
        this.p = k;
        this.q = k.getMaximum(7);
        this.r = k.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.q) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    public final int b(int i) {
        int i2 = i + this.r;
        int i3 = this.q;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.q;
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
        this.p.set(7, b(i));
        textView.setText(this.p.getDisplayName(7, s, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(h21.mtrl_picker_day_of_week_column_header), this.p.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
