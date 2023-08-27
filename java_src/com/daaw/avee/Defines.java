package com.daaw.avee;

import java.util.HashMap;
/* loaded from: classes.dex */
public class Defines {
    public static final int EXPORT_VIS_NOTIFICATION_ID = 3;
    public static final float HandheldMotionMultiplier = 0.06f;
    private static final Defines Instance = new Defines();
    public static final int MEDIA_PLAYBACK_NOTIFICATION_ID = 1;
    public static final int PICK_DEST_PROPERTY_REQUEST_CODE = 53;
    public static final int PICK_DEST_PROPERTY_REQUEST_CODE_KITKAT = 54;
    public static final int SAVE_VIS_NOTIFICATION_ID = 2;
    public static final int VIS_CUSTOM_PICK_IMAGE_PROPERTY_REQUEST_CODE = 43;
    public static final int VIS_CUSTOM_PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT = 44;
    public static final int VIS_LOAD_PICK_REQUEST_CODE = 64;
    public static final int VIS_LOAD_PICK_REQUEST_CODE_KITKAT = 65;
    public static final int VIS_SAVE_PICK_DEST_PROPERTY_REQUEST_CODE = 63;
    HashMap<String, Integer> internalDrawables;

    public static Defines getInstance() {
        return Instance;
    }

    protected Defines() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        this.internalDrawables = hashMap;
        hashMap.put("anim128_g_m10_15", Integer.valueOf((int) R.drawable.anim128_g_m10_15));
        this.internalDrawables.put("particle_blur01", Integer.valueOf((int) R.drawable.particle_blur01));
        this.internalDrawables.put("particle_circle_blur4", Integer.valueOf((int) R.drawable.particle_circle_blur4));
        this.internalDrawables.put("particle_circle_w_a_64", Integer.valueOf((int) R.drawable.particle_circle_w_a_64));
        this.internalDrawables.put("placeholderart5", Integer.valueOf((int) R.drawable.placeholderart5));
        this.internalDrawables.put("vignette80", Integer.valueOf((int) R.drawable.vignette80));
        this.internalDrawables.put("transparent", Integer.valueOf((int) R.drawable.transparent));
        this.internalDrawables.put("white", Integer.valueOf((int) R.drawable.white));
        this.internalDrawables.put("black", Integer.valueOf((int) R.drawable.black));
        this.internalDrawables.put("rainbow128", Integer.valueOf((int) R.drawable.rainbow128));
        this.internalDrawables.put("particle_blur01_more", Integer.valueOf((int) R.drawable.particle_blur01_more));
        this.internalDrawables.put("lens_flare", Integer.valueOf((int) R.drawable.lens_flare_a_512));
        this.internalDrawables.put("lens_flare_2", Integer.valueOf((int) R.drawable.lens_flare_2_a_512));
        this.internalDrawables.put("particle_sharp", Integer.valueOf((int) R.drawable.particle_sharp_128));
        this.internalDrawables.put("particle_blur_inv", Integer.valueOf((int) R.drawable.particle_blur01_inv));
        this.internalDrawables.put("year2017", Integer.valueOf((int) R.drawable.year2017));
        this.internalDrawables.put("year2018", Integer.valueOf((int) R.drawable.year2018));
        this.internalDrawables.put("snowflake", Integer.valueOf((int) R.drawable.snowflake));
    }

    public int getDrawableResid(String str, int i) {
        Integer num = this.internalDrawables.get(str);
        return num == null ? i : num.intValue();
    }
}
