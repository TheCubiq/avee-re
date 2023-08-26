package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Locale;
/* loaded from: classes.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    @Override // com.google.android.exoplayer2.ui.TrackNameProvider
    public String getTrackName(Format format) {
        String buildLanguageString;
        int inferPrimaryTrackType = inferPrimaryTrackType(format);
        if (inferPrimaryTrackType == 2) {
            buildLanguageString = joinWithSeparator(buildResolutionString(format), buildBitrateString(format));
        } else if (inferPrimaryTrackType == 1) {
            buildLanguageString = joinWithSeparator(buildLanguageString(format), buildAudioChannelString(format), buildBitrateString(format));
        } else {
            buildLanguageString = buildLanguageString(format);
        }
        return buildLanguageString.length() == 0 ? this.resources.getString(R.string.exo_track_unknown) : buildLanguageString;
    }

    private String buildResolutionString(Format format) {
        int i = format.width;
        int i2 = format.height;
        return (i == -1 || i2 == -1) ? "" : this.resources.getString(R.string.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String buildBitrateString(Format format) {
        int i = format.bitrate;
        return i == -1 ? "" : this.resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    private String buildAudioChannelString(Format format) {
        int i = format.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 6 || i == 7) {
                    return this.resources.getString(R.string.exo_track_surround_5_point_1);
                }
                if (i == 8) {
                    return this.resources.getString(R.string.exo_track_surround_7_point_1);
                }
                return this.resources.getString(R.string.exo_track_surround);
            }
            return this.resources.getString(R.string.exo_track_stereo);
        }
        return this.resources.getString(R.string.exo_track_mono);
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        return (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) ? "" : buildLanguageString(str);
    }

    private String buildLanguageString(String str) {
        return (Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }

    private String joinWithSeparator(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.resources.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }
}
