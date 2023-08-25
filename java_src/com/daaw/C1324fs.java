package com.daaw;

import com.daaw.avee.R;
import java.util.HashMap;
/* renamed from: com.daaw.fs */
/* loaded from: classes.dex */
public class C1324fs {

    /* renamed from: b */
    public static final C1324fs f9841b = new C1324fs();

    /* renamed from: a */
    public HashMap<String, Integer> f9842a;

    public C1324fs() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        this.f9842a = hashMap;
        hashMap.put("anim128_g_m10_15", Integer.valueOf((int) R.drawable.anim128_g_m10_15));
        this.f9842a.put("particle_blur01", Integer.valueOf((int) R.drawable.particle_blur01));
        this.f9842a.put("particle_circle_blur4", Integer.valueOf((int) R.drawable.particle_circle_blur4));
        this.f9842a.put("particle_circle_w_a_64", Integer.valueOf((int) R.drawable.particle_circle_w_a_64));
        this.f9842a.put("placeholderart5", Integer.valueOf((int) R.drawable.placeholderart5));
        this.f9842a.put("vignette80", Integer.valueOf((int) R.drawable.vignette80));
        this.f9842a.put("transparent", Integer.valueOf((int) R.drawable.transparent));
        this.f9842a.put("white", Integer.valueOf((int) R.drawable.white));
        this.f9842a.put("black", Integer.valueOf((int) R.drawable.black));
        this.f9842a.put("rainbow128", Integer.valueOf((int) R.drawable.rainbow128));
        this.f9842a.put("particle_blur01_more", Integer.valueOf((int) R.drawable.particle_blur01_more));
        this.f9842a.put("lens_flare", Integer.valueOf((int) R.drawable.lens_flare_a_512));
        this.f9842a.put("lens_flare_2", Integer.valueOf((int) R.drawable.lens_flare_2_a_512));
        this.f9842a.put("particle_sharp", Integer.valueOf((int) R.drawable.particle_sharp_128));
        this.f9842a.put("particle_blur_inv", Integer.valueOf((int) R.drawable.particle_blur01_inv));
        this.f9842a.put("year2017", Integer.valueOf((int) R.drawable.year2017));
        this.f9842a.put("year2018", Integer.valueOf((int) R.drawable.year2018));
        this.f9842a.put("snowflake", Integer.valueOf((int) R.drawable.snowflake));
    }

    /* renamed from: b */
    public static C1324fs m22355b() {
        return f9841b;
    }

    /* renamed from: a */
    public int m22356a(String str, int i) {
        Integer num = this.f9842a.get(str);
        return num == null ? i : num.intValue();
    }
}
