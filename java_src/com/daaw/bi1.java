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
    public final SearchView A;
    public final SearchableInfo B;
    public final Context C;
    public final WeakHashMap<String, Drawable.ConstantState> D;
    public final int E;
    public boolean F;
    public int G;
    public ColorStateList H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;

    /* loaded from: classes.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(o11.edit_query);
        }
    }

    public bi1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.F = false;
        this.G = 1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.A = searchView;
        this.B = searchableInfo;
        this.E = searchView.getSuggestionCommitIconResId();
        this.C = context;
        this.D = weakHashMap;
    }

    public static String o(Cursor cursor, String str) {
        return x(cursor, cursor.getColumnIndex(str));
    }

    public static String x(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void B(String str, Drawable drawable) {
        if (drawable != null) {
            this.D.put(str, drawable.getConstantState());
        }
    }

    public final void C(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // com.daaw.nn, com.daaw.pn.a
    public void a(Cursor cursor) {
        if (this.F) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.I = cursor.getColumnIndex("suggest_text_1");
                this.J = cursor.getColumnIndex("suggest_text_2");
                this.K = cursor.getColumnIndex("suggest_text_2_url");
                this.L = cursor.getColumnIndex("suggest_icon_1");
                this.M = cursor.getColumnIndex("suggest_icon_2");
                this.N = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.daaw.nn, com.daaw.pn.a
    public CharSequence c(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (!this.B.shouldRewriteQueryFromData() || (o2 = o(cursor, "suggest_intent_data")) == null) {
            if (!this.B.shouldRewriteQueryFromText() || (o = o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return o;
        }
        return o2;
    }

    @Override // com.daaw.pn.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.A.getVisibility() == 0 && this.A.getWindowVisibility() == 0) {
            try {
                Cursor w = w(this.B, charSequence2, 50);
                if (w != null) {
                    w.getCount();
                    return w;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // com.daaw.nn
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i = this.N;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.a != null) {
            A(aVar.a, x(cursor, this.I));
        }
        if (aVar.b != null) {
            String x = x(cursor, this.K);
            CharSequence l = x != null ? l(x) : x(cursor, this.J);
            if (TextUtils.isEmpty(l)) {
                TextView textView = aVar.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.a.setMaxLines(1);
                }
            }
            A(aVar.b, l);
        }
        ImageView imageView = aVar.c;
        if (imageView != null) {
            z(imageView, u(cursor), 4);
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 != null) {
            z(imageView2, v(cursor), 8);
        }
        int i3 = this.G;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            aVar.e.setVisibility(8);
            return;
        }
        aVar.e.setVisibility(0);
        aVar.e.setTag(aVar.a.getText());
        aVar.e.setOnClickListener(this);
    }

    @Override // com.daaw.nn, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View g = g(this.C, b(), viewGroup);
            if (g != null) {
                ((a) g.getTag()).a.setText(e.toString());
            }
            return g;
        }
    }

    @Override // com.daaw.nn, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View h = h(this.C, b(), viewGroup);
            if (h != null) {
                ((a) h.getTag()).a.setText(e.toString());
            }
            return h;
        }
    }

    @Override // com.daaw.c51, com.daaw.nn
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.h(context, cursor, viewGroup);
        h.setTag(new a(h));
        ((ImageView) h.findViewById(o11.edit_query)).setImageResource(this.E);
        return h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String str) {
        Drawable.ConstantState constantState = this.D.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        if (this.H == null) {
            TypedValue typedValue = new TypedValue();
            this.C.getTheme().resolveAttribute(x01.textColorSearchUrl, typedValue, true);
            this.H = this.C.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.H, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.C.getPackageManager();
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

    public final Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.D.containsKey(flattenToShortString)) {
            Drawable m = m(componentName);
            this.D.put(flattenToShortString, m != null ? m.getConstantState() : null);
            return m;
        }
        Drawable.ConstantState constantState = this.D.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.C.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        C(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        C(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A.U((CharSequence) tag);
        }
    }

    public final Drawable p() {
        Drawable n = n(this.B.getSearchActivity());
        return n != null ? n : this.C.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.C.getContentResolver().openInputStream(uri);
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

    public Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.C.getPackageManager().getResourcesForApplication(authority);
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

    public final Drawable t(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.C.getPackageName() + "/" + parseInt;
            Drawable k = k(str2);
            if (k != null) {
                return k;
            }
            Drawable e = zk.e(this.C, parseInt);
            B(str2, e);
            return e;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource not found: ");
            sb.append(str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k2 = k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = q(Uri.parse(str));
            B(str, q);
            return q;
        }
    }

    public final Drawable u(Cursor cursor) {
        int i = this.L;
        if (i == -1) {
            return null;
        }
        Drawable t = t(cursor.getString(i));
        return t != null ? t : p();
    }

    public final Drawable v(Cursor cursor) {
        int i = this.M;
        if (i == -1) {
            return null;
        }
        return t(cursor.getString(i));
    }

    public Cursor w(SearchableInfo searchableInfo, String str, int i) {
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
        return this.C.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void y(int i) {
        this.G = i;
    }

    public final void z(ImageView imageView, Drawable drawable, int i) {
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
