package com.daaw;

import com.daaw.avee.R;
import java.util.HashMap;
/* loaded from: classes.dex */
public class fs {
    public static final fs b = new fs();
    public HashMap<String, Integer> a;

    public fs() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        this.a = hashMap;
        hashMap.put("anim128_g_m10_15", Integer.valueOf((int) R.drawable.anim128_g_m10_15));
        this.a.put("particle_blur01", Integer.valueOf((int) R.drawable.particle_blur01));
        this.a.put("particle_circle_blur4", Integer.valueOf((int) R.drawable.particle_circle_blur4));
        this.a.put("particle_circle_w_a_64", Integer.valueOf((int) R.drawable.particle_circle_w_a_64));
        this.a.put("placeholderart5", Integer.valueOf((int) R.drawable.placeholderart5));
        this.a.put("vignette80", Integer.valueOf((int) R.drawable.vignette80));
        this.a.put("transparent", Integer.valueOf((int) R.drawable.transparent));
        this.a.put("white", Integer.valueOf((int) R.drawable.white));
        this.a.put("black", Integer.valueOf((int) R.drawable.black));
        this.a.put("rainbow128", Integer.valueOf((int) R.drawable.rainbow128));
        this.a.put("particle_blur01_more", Integer.valueOf((int) R.drawable.particle_blur01_more));
        this.a.put("lens_flare", Integer.valueOf((int) R.drawable.lens_flare_a_512));
        this.a.put("lens_flare_2", Integer.valueOf((int) R.drawable.lens_flare_2_a_512));
        this.a.put("particle_sharp", Integer.valueOf((int) R.drawable.particle_sharp_128));
        this.a.put("particle_blur_inv", Integer.valueOf((int) R.drawable.particle_blur01_inv));
        this.a.put("year2017", Integer.valueOf((int) R.drawable.year2017));
        this.a.put("year2018", Integer.valueOf((int) R.drawable.year2018));
        this.a.put("snowflake", Integer.valueOf((int) R.drawable.snowflake));
    }

    public static fs b() {
        return b;
    }

    public int a(String str, int i) {
        Integer num = this.a.get(str);
        return num == null ? i : num.intValue();
    }
}
