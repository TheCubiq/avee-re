package com.daaw;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class bi1 extends c51 implements View.OnClickListener {

    /* renamed from: A */
    public final SearchView f4815A;

    /* renamed from: B */
    public final SearchableInfo f4816B;

    /* renamed from: C */
    public final Context f4817C;

    /* renamed from: D */
    public final WeakHashMap<String, Drawable.ConstantState> f4818D;

    /* renamed from: E */
    public final int f4819E;

    /* renamed from: F */
    public boolean f4820F;

    /* renamed from: G */
    public int f4821G;

    /* renamed from: H */
    public ColorStateList f4822H;

    /* renamed from: I */
    public int f4823I;

    /* renamed from: J */
    public int f4824J;

    /* renamed from: K */
    public int f4825K;

    /* renamed from: L */
    public int f4826L;

    /* renamed from: M */
    public int f4827M;

    /* renamed from: N */
    public int f4828N;

    /* renamed from: com.daaw.bi1$a */
    /* loaded from: classes.dex */
    public static final class C0843a {

        /* renamed from: a */
        public final TextView f4829a;

        /* renamed from: b */
        public final TextView f4830b;

        /* renamed from: c */
        public final ImageView f4831c;

        /* renamed from: d */
        public final ImageView f4832d;

        /* renamed from: e */
        public final ImageView f4833e;

        public C0843a(View view) {
            this.f4829a = (TextView) view.findViewById(16908308);
            this.f4830b = (TextView) view.findViewById(16908309);
            this.f4831c = (ImageView) view.findViewById(16908295);
            this.f4832d = (ImageView) view.findViewById(16908296);
            this.f4833e = (ImageView) view.findViewById(o11.edit_query);
        }
    }

    public bi1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f4820F = false;
        this.f4821G = 1;
        this.f4823I = -1;
        this.f4824J = -1;
        this.f4825K = -1;
        this.f4826L = -1;
        this.f4827M = -1;
        this.f4828N = -1;
        this.f4815A = searchView;
        this.f4816B = searchableInfo;
        this.f4819E = searchView.getSuggestionCommitIconResId();
        this.f4817C = context;
        this.f4818D = weakHashMap;
    }

    /* renamed from: o */
    public static String m26157o(Cursor cursor, String str) {
        return m26149x(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: x */
    public static String m26149x(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: A */
    public final void m26164A(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: B */
    public final void m26163B(String str, Drawable drawable) {
        if (drawable != null) {
            this.f4818D.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: C */
    public final void m26162C(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // com.daaw.AbstractC2317nn, com.daaw.C2563pn.InterfaceC2564a
    /* renamed from: a */
    public void mo13286a(Cursor cursor) {
        if (this.f4820F) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo13286a(cursor);
            if (cursor != null) {
                this.f4823I = cursor.getColumnIndex("suggest_text_1");
                this.f4824J = cursor.getColumnIndex("suggest_text_2");
                this.f4825K = cursor.getColumnIndex("suggest_text_2_url");
                this.f4826L = cursor.getColumnIndex("suggest_icon_1");
                this.f4827M = cursor.getColumnIndex("suggest_icon_2");
                this.f4828N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.daaw.AbstractC2317nn, com.daaw.C2563pn.InterfaceC2564a
    /* renamed from: c */
    public CharSequence mo13284c(Cursor cursor) {
        String m26157o;
        String m26157o2;
        if (cursor == null) {
            return null;
        }
        String m26157o3 = m26157o(cursor, "suggest_intent_query");
        if (m26157o3 != null) {
            return m26157o3;
        }
        if (!this.f4816B.shouldRewriteQueryFromData() || (m26157o2 = m26157o(cursor, "suggest_intent_data")) == null) {
            if (!this.f4816B.shouldRewriteQueryFromText() || (m26157o = m26157o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return m26157o;
        }
        return m26157o2;
    }

    @Override // com.daaw.C2563pn.InterfaceC2564a
    /* renamed from: d */
    public Cursor mo13283d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f4815A.getVisibility() == 0 && this.f4815A.getWindowVisibility() == 0) {
            try {
                Cursor m26150w = m26150w(this.f4816B, charSequence2, 50);
                if (m26150w != null) {
                    m26150w.getCount();
                    return m26150w;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // com.daaw.AbstractC2317nn
    /* renamed from: e */
    public void mo15025e(View view, Context context, Cursor cursor) {
        C0843a c0843a = (C0843a) view.getTag();
        int i = this.f4828N;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c0843a.f4829a != null) {
            m26164A(c0843a.f4829a, m26149x(cursor, this.f4823I));
        }
        if (c0843a.f4830b != null) {
            String m26149x = m26149x(cursor, this.f4825K);
            CharSequence m26160l = m26149x != null ? m26160l(m26149x) : m26149x(cursor, this.f4824J);
            if (TextUtils.isEmpty(m26160l)) {
                TextView textView = c0843a.f4829a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c0843a.f4829a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c0843a.f4829a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c0843a.f4829a.setMaxLines(1);
                }
            }
            m26164A(c0843a.f4830b, m26160l);
        }
        ImageView imageView = c0843a.f4831c;
        if (imageView != null) {
            m26147z(imageView, m26152u(cursor), 4);
        }
        ImageView imageView2 = c0843a.f4832d;
        if (imageView2 != null) {
            m26147z(imageView2, m26151v(cursor), 8);
        }
        int i3 = this.f4821G;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c0843a.f4833e.setVisibility(8);
            return;
        }
        c0843a.f4833e.setVisibility(0);
        c0843a.f4833e.setTag(c0843a.f4829a.getText());
        c0843a.f4833e.setOnClickListener(this);
    }

    @Override // com.daaw.AbstractC2317nn, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View mo15023g = mo15023g(this.f4817C, mo13285b(), viewGroup);
            if (mo15023g != null) {
                ((C0843a) mo15023g.getTag()).f4829a.setText(e.toString());
            }
            return mo15023g;
        }
    }

    @Override // com.daaw.AbstractC2317nn, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View mo15022h = mo15022h(this.f4817C, mo13285b(), viewGroup);
            if (mo15022h != null) {
                ((C0843a) mo15022h.getTag()).f4829a.setText(e.toString());
            }
            return mo15022h;
        }
    }

    @Override // com.daaw.c51, com.daaw.AbstractC2317nn
    /* renamed from: h */
    public View mo15022h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo15022h = super.mo15022h(context, cursor, viewGroup);
        mo15022h.setTag(new C0843a(mo15022h));
        ((ImageView) mo15022h.findViewById(o11.edit_query)).setImageResource(this.f4819E);
        return mo15022h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: k */
    public final Drawable m26161k(String str) {
        Drawable.ConstantState constantState = this.f4818D.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    public final CharSequence m26160l(CharSequence charSequence) {
        if (this.f4822H == null) {
            TypedValue typedValue = new TypedValue();
            this.f4817C.getTheme().resolveAttribute(x01.textColorSearchUrl, typedValue, true);
            this.f4822H = this.f4817C.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f4822H, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    public final Drawable m26159m(ComponentName componentName) {
        PackageManager packageManager = this.f4817C.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid icon resource ");
                sb.append(iconResource);
                sb.append(" for ");
                sb.append(componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: n */
    public final Drawable m26158n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f4818D.containsKey(flattenToShortString)) {
            Drawable m26159m = m26159m(componentName);
            this.f4818D.put(flattenToShortString, m26159m != null ? m26159m.getConstantState() : null);
            return m26159m;
        }
        Drawable.ConstantState constantState = this.f4818D.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f4817C.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m26162C(mo13285b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m26162C(mo13285b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f4815A.m30041U((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable m26156p() {
        Drawable m26158n = m26158n(this.f4816B.getSearchActivity());
        return m26158n != null ? m26158n : this.f4817C.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    public final Drawable m26155q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m26154r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f4817C.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error closing icon stream for ");
                sb.append(uri);
            }
            return createFromStream;
        } catch (FileNotFoundException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Icon not found: ");
            sb2.append(uri);
            sb2.append(", ");
            sb2.append(e.getMessage());
            return null;
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append("Icon not found: ");
        sb22.append(uri);
        sb22.append(", ");
        sb22.append(e.getMessage());
        return null;
    }

    /* renamed from: r */
    public Drawable m26154r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f4817C.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: t */
    public final Drawable m26153t(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f4817C.getPackageName() + "/" + parseInt;
            Drawable m26161k = m26161k(str2);
            if (m26161k != null) {
                return m26161k;
            }
            Drawable m2178e = C3866zk.m2178e(this.f4817C, parseInt);
            m26163B(str2, m2178e);
            return m2178e;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource not found: ");
            sb.append(str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m26161k2 = m26161k(str);
            if (m26161k2 != null) {
                return m26161k2;
            }
            Drawable m26155q = m26155q(Uri.parse(str));
            m26163B(str, m26155q);
            return m26155q;
        }
    }

    /* renamed from: u */
    public final Drawable m26152u(Cursor cursor) {
        int i = this.f4826L;
        if (i == -1) {
            return null;
        }
        Drawable m26153t = m26153t(cursor.getString(i));
        return m26153t != null ? m26153t : m26156p();
    }

    /* renamed from: v */
    public final Drawable m26151v(Cursor cursor) {
        int i = this.f4827M;
        if (i == -1) {
            return null;
        }
        return m26153t(cursor.getString(i));
    }

    /* renamed from: w */
    public Cursor m26150w(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f4817C.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: y */
    public void m26148y(int i) {
        this.f4821G = i;
    }

    /* renamed from: z */
    public final void m26147z(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }
}
