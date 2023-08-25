package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.daaw.g51;
/* renamed from: com.daaw.d4 */
/* loaded from: classes.dex */
public final class C1046d4 {

    /* renamed from: b */
    public static final PorterDuff.Mode f6461b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C1046d4 f6462c;

    /* renamed from: a */
    public g51 f6463a;

    /* renamed from: com.daaw.d4$a */
    /* loaded from: classes.dex */
    public class C1047a implements g51.InterfaceC1368f {

        /* renamed from: a */
        public final int[] f6464a = {l11.abc_textfield_search_default_mtrl_alpha, l11.abc_textfield_default_mtrl_alpha, l11.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f6465b = {l11.abc_ic_commit_search_api_mtrl_alpha, l11.abc_seekbar_tick_mark_material, l11.abc_ic_menu_share_mtrl_alpha, l11.abc_ic_menu_copy_mtrl_am_alpha, l11.abc_ic_menu_cut_mtrl_alpha, l11.abc_ic_menu_selectall_mtrl_alpha, l11.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f6466c = {l11.abc_textfield_activated_mtrl_alpha, l11.abc_textfield_search_activated_mtrl_alpha, l11.abc_cab_background_top_mtrl_alpha, l11.abc_text_cursor_material, l11.abc_text_select_handle_left_mtrl, l11.abc_text_select_handle_middle_mtrl, l11.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f6467d = {l11.abc_popup_background_mtrl_mult, l11.abc_cab_background_internal_bg, l11.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f6468e = {l11.abc_tab_indicator_material, l11.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f6469f = {l11.abc_btn_check_material, l11.abc_btn_radio_material, l11.abc_btn_check_material_anim, l11.abc_btn_radio_material_anim};

        @Override // com.daaw.g51.InterfaceC1368f
        /* renamed from: a */
        public Drawable mo21916a(g51 g51Var, Context context, int i) {
            int i2;
            if (i == l11.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{g51Var.m21934j(context, l11.abc_cab_background_internal_bg), g51Var.m21934j(context, l11.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == l11.abc_ratingbar_material) {
                i2 = g11.abc_star_big;
            } else if (i == l11.abc_ratingbar_indicator_material) {
                i2 = g11.abc_star_medium;
            } else if (i != l11.abc_ratingbar_small_material) {
                return null;
            } else {
                i2 = g11.abc_star_small;
            }
            return m24699l(g51Var, context, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // com.daaw.g51.InterfaceC1368f
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo21915b(Context context, int i, Drawable drawable) {
            int i2;
            boolean z;
            PorterDuff.Mode mode = C1046d4.f6461b;
            int i3 = 16842801;
            if (m24705f(this.f6464a, i)) {
                i3 = x01.colorControlNormal;
            } else if (m24705f(this.f6466c, i)) {
                i3 = x01.f31708v;
            } else if (m24705f(this.f6467d, i)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i == l11.abc_list_divider_mtrl_alpha) {
                i3 = 16842800;
                i2 = Math.round(40.8f);
                z = true;
                if (z) {
                    if (C3373vu.m6789a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(C1046d4.m24710e(yk1.m3615c(context, i3), mode));
                    if (i2 != -1) {
                        drawable.setAlpha(i2);
                    }
                    return true;
                }
                return false;
            } else if (i != l11.abc_dialog_material_background) {
                i2 = -1;
                z = false;
                i3 = 0;
                if (z) {
                }
            }
            i2 = -1;
            z = true;
            if (z) {
            }
        }

        @Override // com.daaw.g51.InterfaceC1368f
        /* renamed from: c */
        public PorterDuff.Mode mo21914c(int i) {
            if (i == l11.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // com.daaw.g51.InterfaceC1368f
        /* renamed from: d */
        public ColorStateList mo21913d(Context context, int i) {
            if (i == l11.abc_edit_text_material) {
                return C2818r4.m11784a(context, b11.abc_tint_edittext);
            }
            if (i == l11.abc_switch_track_mtrl_alpha) {
                return C2818r4.m11784a(context, b11.abc_tint_switch_track);
            }
            if (i == l11.abc_switch_thumb_material) {
                return m24700k(context);
            }
            if (i == l11.abc_btn_default_mtrl_shape) {
                return m24701j(context);
            }
            if (i == l11.abc_btn_borderless_material) {
                return m24704g(context);
            }
            if (i == l11.abc_btn_colored_material) {
                return m24702i(context);
            }
            if (i == l11.abc_spinner_mtrl_am_alpha || i == l11.abc_spinner_textfield_background_material) {
                return C2818r4.m11784a(context, b11.abc_tint_spinner);
            }
            if (m24705f(this.f6465b, i)) {
                return yk1.m3613e(context, x01.colorControlNormal);
            }
            if (m24705f(this.f6468e, i)) {
                return C2818r4.m11784a(context, b11.abc_tint_default);
            }
            if (m24705f(this.f6469f, i)) {
                return C2818r4.m11784a(context, b11.abc_tint_btn_checkable);
            }
            if (i == l11.abc_seekbar_thumb_material) {
                return C2818r4.m11784a(context, b11.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // com.daaw.g51.InterfaceC1368f
        /* renamed from: e */
        public boolean mo21912e(Context context, int i, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int m3615c;
            if (i == l11.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = x01.colorControlNormal;
                m24698m(findDrawableByLayerId2, yk1.m3615c(context, i2), C1046d4.f6461b);
                m24698m(layerDrawable.findDrawableByLayerId(16908303), yk1.m3615c(context, i2), C1046d4.f6461b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                m3615c = yk1.m3615c(context, x01.f31708v);
            } else if (i != l11.abc_ratingbar_material && i != l11.abc_ratingbar_indicator_material && i != l11.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m24698m(layerDrawable2.findDrawableByLayerId(16908288), yk1.m3616b(context, x01.colorControlNormal), C1046d4.f6461b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = x01.f31708v;
                m24698m(findDrawableByLayerId3, yk1.m3615c(context, i3), C1046d4.f6461b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                m3615c = yk1.m3615c(context, i3);
            }
            m24698m(findDrawableByLayerId, m3615c, C1046d4.f6461b);
            return true;
        }

        /* renamed from: f */
        public final boolean m24705f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList m24704g(Context context) {
            return m24703h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList m24703h(Context context, int i) {
            int m3615c = yk1.m3615c(context, x01.f31709w);
            return new ColorStateList(new int[][]{yk1.f33748b, yk1.f33751e, yk1.f33749c, yk1.f33755i}, new int[]{yk1.m3616b(context, x01.colorButtonNormal), C3838zg.m2348f(m3615c, i), C3838zg.m2348f(m3615c, i), i});
        }

        /* renamed from: i */
        public final ColorStateList m24702i(Context context) {
            return m24703h(context, yk1.m3615c(context, x01.colorAccent));
        }

        /* renamed from: j */
        public final ColorStateList m24701j(Context context) {
            return m24703h(context, yk1.m3615c(context, x01.colorButtonNormal));
        }

        /* renamed from: k */
        public final ColorStateList m24700k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = x01.colorSwitchThumbNormal;
            ColorStateList m3613e = yk1.m3613e(context, i);
            if (m3613e == null || !m3613e.isStateful()) {
                iArr[0] = yk1.f33748b;
                iArr2[0] = yk1.m3616b(context, i);
                iArr[1] = yk1.f33752f;
                iArr2[1] = yk1.m3615c(context, x01.f31708v);
                iArr[2] = yk1.f33755i;
                iArr2[2] = yk1.m3615c(context, i);
            } else {
                iArr[0] = yk1.f33748b;
                iArr2[0] = m3613e.getColorForState(iArr[0], 0);
                iArr[1] = yk1.f33752f;
                iArr2[1] = yk1.m3615c(context, x01.f31708v);
                iArr[2] = yk1.f33755i;
                iArr2[2] = m3613e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final LayerDrawable m24699l(g51 g51Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable m21934j = g51Var.m21934j(context, l11.abc_star_black_48dp);
            Drawable m21934j2 = g51Var.m21934j(context, l11.abc_star_half_black_48dp);
            if ((m21934j instanceof BitmapDrawable) && m21934j.getIntrinsicWidth() == dimensionPixelSize && m21934j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m21934j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m21934j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m21934j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m21934j2 instanceof BitmapDrawable) && m21934j2.getIntrinsicWidth() == dimensionPixelSize && m21934j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m21934j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m21934j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m21934j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void m24698m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C3373vu.m6789a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1046d4.f6461b;
            }
            drawable.setColorFilter(C1046d4.m24710e(i, mode));
        }
    }

    /* renamed from: b */
    public static synchronized C1046d4 m24713b() {
        C1046d4 c1046d4;
        synchronized (C1046d4.class) {
            if (f6462c == null) {
                m24707h();
            }
            c1046d4 = f6462c;
        }
        return c1046d4;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m24710e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m21932l;
        synchronized (C1046d4.class) {
            m21932l = g51.m21932l(i, mode);
        }
        return m21932l;
    }

    /* renamed from: h */
    public static synchronized void m24707h() {
        synchronized (C1046d4.class) {
            if (f6462c == null) {
                C1046d4 c1046d4 = new C1046d4();
                f6462c = c1046d4;
                c1046d4.f6463a = g51.m21936h();
                f6462c.f6463a.m21923u(new C1047a());
            }
        }
    }

    /* renamed from: i */
    public static void m24706i(Drawable drawable, sl1 sl1Var, int[] iArr) {
        g51.m21921w(drawable, sl1Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m24712c(Context context, int i) {
        return this.f6463a.m21934j(context, i);
    }

    /* renamed from: d */
    public synchronized Drawable m24711d(Context context, int i, boolean z) {
        return this.f6463a.m21933k(context, i, z);
    }

    /* renamed from: f */
    public synchronized ColorStateList m24709f(Context context, int i) {
        return this.f6463a.m21931m(context, i);
    }

    /* renamed from: g */
    public synchronized void m24708g(Context context) {
        this.f6463a.m21925s(context);
    }
}
