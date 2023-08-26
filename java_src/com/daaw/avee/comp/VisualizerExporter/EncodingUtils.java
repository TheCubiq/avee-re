package com.daaw.avee.comp.VisualizerExporter;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import com.daaw.avee.Common.Tuple2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class EncodingUtils {
    private static final String CODEC_PROFILE_NAME_0 = "Baseline";
    private static final String CODEC_PROFILE_NAME_1 = "Main";
    private static final String CODEC_PROFILE_NAME_2 = "High";
    public static final String DEFAULT_CODEC_NAME = "default";
    private static final String MIME_TYPE0 = "video/avc";
    private static final String MIME_TYPE1 = "video/mp4v-es";
    private static final String MIME_TYPE2 = "video/3gpp";
    private static final String TAG = "EncodingUtils";

    public static List<Tuple2<String, String>> getListAvailableCodecsNames(int[] iArr) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("video/avc");
        arrayList.add("video/3gpp");
        arrayList.add("video/mp4v-es");
        return getListAvailableCodecs(arrayList, null, iArr);
    }

    public static List<Tuple2<String, String>> getListAvailableCodecs(List<String> list, String str, int[] iArr) {
        iArr[0] = 0;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new Tuple2(str, ""));
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                    Log.d(TAG, "    supported type: " + supportedTypes[i2]);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        String str2 = list.get(i3);
                        String name = codecInfoAt.getName();
                        if (str2.equals(supportedTypes[i2])) {
                            if (!name.contains("OMX.google.") && str2.equals("video/avc")) {
                                iArr[0] = arrayList.size();
                            }
                            arrayList.add(new Tuple2(codecInfoAt.getName(), str2));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String[] getListAvailableCodecsProfileNames(int[] iArr) {
        String[] strArr = {CODEC_PROFILE_NAME_0, CODEC_PROFILE_NAME_1};
        if (iArr != null) {
            iArr[0] = 0;
        }
        return strArr;
    }
}
