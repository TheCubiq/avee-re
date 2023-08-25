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
/* loaded from: classes.dex */
public final class d4 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static d4 c;
    public g51 a;

    /* loaded from: classes.dex */
    public class a implements g51.f {
        public final int[] a = {l11.abc_textfield_search_default_mtrl_alpha, l11.abc_textfield_default_mtrl_alpha, l11.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {l11.abc_ic_commit_search_api_mtrl_alpha, l11.abc_seekbar_tick_mark_material, l11.abc_ic_menu_share_mtrl_alpha, l11.abc_ic_menu_copy_mtrl_am_alpha, l11.abc_ic_menu_cut_mtrl_alpha, l11.abc_ic_menu_selectall_mtrl_alpha, l11.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {l11.abc_textfield_activated_mtrl_alpha, l11.abc_textfield_search_activated_mtrl_alpha, l11.abc_cab_background_top_mtrl_alpha, l11.abc_text_cursor_material, l11.abc_text_select_handle_left_mtrl, l11.abc_text_select_handle_middle_mtrl, l11.abc_text_select_handle_right_mtrl};
        public final int[] d = {l11.abc_popup_background_mtrl_mult, l11.abc_cab_background_internal_bg, l11.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {l11.abc_tab_indicator_material, l11.abc_textfield_search_material};
        public final int[] f = {l11.abc_btn_check_material, l11.abc_btn_radio_material, l11.abc_btn_check_material_anim, l11.abc_btn_radio_material_anim};

        @Override // com.daaw.g51.f
        public Drawable a(g51 g51Var, Context context, int i) {
            int i2;
            if (i == l11.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{g51Var.j(context, l11.abc_cab_background_internal_bg), g51Var.j(context, l11.abc_cab_background_top_mtrl_alpha)});
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
            return l(g51Var, context, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // com.daaw.g51.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = com.daaw.d4.a()
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = com.daaw.x01.colorControlNormal
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = com.daaw.x01.v
                goto L14
            L22:
                int[] r1 = r6.d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = com.daaw.l11.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = com.daaw.l11.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = com.daaw.vu.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = com.daaw.yk1.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = com.daaw.d4.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.d4.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // com.daaw.g51.f
        public PorterDuff.Mode c(int i) {
            if (i == l11.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // com.daaw.g51.f
        public ColorStateList d(Context context, int i) {
            if (i == l11.abc_edit_text_material) {
                return r4.a(context, b11.abc_tint_edittext);
            }
            if (i == l11.abc_switch_track_mtrl_alpha) {
                return r4.a(context, b11.abc_tint_switch_track);
            }
            if (i == l11.abc_switch_thumb_material) {
                return k(context);
            }
            if (i == l11.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i == l11.abc_btn_borderless_material) {
                return g(context);
            }
            if (i == l11.abc_btn_colored_material) {
                return i(context);
            }
            if (i == l11.abc_spinner_mtrl_am_alpha || i == l11.abc_spinner_textfield_background_material) {
                return r4.a(context, b11.abc_tint_spinner);
            }
            if (f(this.b, i)) {
                return yk1.e(context, x01.colorControlNormal);
            }
            if (f(this.e, i)) {
                return r4.a(context, b11.abc_tint_default);
            }
            if (f(this.f, i)) {
                return r4.a(context, b11.abc_tint_btn_checkable);
            }
            if (i == l11.abc_seekbar_thumb_material) {
                return r4.a(context, b11.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // com.daaw.g51.f
        public boolean e(Context context, int i, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c;
            if (i == l11.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = x01.colorControlNormal;
                m(findDrawableByLayerId2, yk1.c(context, i2), d4.b);
                m(layerDrawable.findDrawableByLayerId(16908303), yk1.c(context, i2), d4.b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c = yk1.c(context, x01.v);
            } else if (i != l11.abc_ratingbar_material && i != l11.abc_ratingbar_indicator_material && i != l11.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), yk1.b(context, x01.colorControlNormal), d4.b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = x01.v;
                m(findDrawableByLayerId3, yk1.c(context, i3), d4.b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c = yk1.c(context, i3);
            }
            m(findDrawableByLayerId, c, d4.b);
            return true;
        }

        public final boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i) {
            int c = yk1.c(context, x01.w);
            return new ColorStateList(new int[][]{yk1.b, yk1.e, yk1.c, yk1.i}, new int[]{yk1.b(context, x01.colorButtonNormal), zg.f(c, i), zg.f(c, i), i});
        }

        public final ColorStateList i(Context context) {
            return h(context, yk1.c(context, x01.colorAccent));
        }

        public final ColorStateList j(Context context) {
            return h(context, yk1.c(context, x01.colorButtonNormal));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = x01.colorSwitchThumbNormal;
            ColorStateList e = yk1.e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = yk1.b;
                iArr2[0] = yk1.b(context, i);
                iArr[1] = yk1.f;
                iArr2[1] = yk1.c(context, x01.v);
                iArr[2] = yk1.i;
                iArr2[2] = yk1.c(context, i);
            } else {
                iArr[0] = yk1.b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = yk1.f;
                iArr2[1] = yk1.c(context, x01.v);
                iArr[2] = yk1.i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(g51 g51Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = g51Var.j(context, l11.abc_star_black_48dp);
            Drawable j2 = g51Var.j(context, l11.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (vu.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = d4.b;
            }
            drawable.setColorFilter(d4.e(i, mode));
        }
    }

    public static synchronized d4 b() {
        d4 d4Var;
        synchronized (d4.class) {
            if (c == null) {
                h();
            }
            d4Var = c;
        }
        return d4Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (d4.class) {
            l = g51.l(i, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (d4.class) {
            if (c == null) {
                d4 d4Var = new d4();
                c = d4Var;
                d4Var.a = g51.h();
                c.a.u(new a());
            }
        }
    }

    public static void i(Drawable drawable, sl1 sl1Var, int[] iArr) {
        g51.w(drawable, sl1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.j(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
