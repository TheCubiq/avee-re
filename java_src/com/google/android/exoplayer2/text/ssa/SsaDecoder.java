package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue: ";
    private static final String FORMAT_LINE_PREFIX = "Format: ";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private static final String TAG = "SsaDecoder";
    private int formatEndIndex;
    private int formatKeyCount;
    private int formatStartIndex;
    private int formatTextIndex;
    private final boolean haveInitializationData;

    public SsaDecoder() {
        this(null);
    }

    public SsaDecoder(List<byte[]> list) {
        super(TAG);
        if (list != null && !list.isEmpty()) {
            this.haveInitializationData = true;
            String fromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
            Assertions.checkArgument(fromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
            parseFormatLine(fromUtf8Bytes);
            parseHeader(new ParsableByteArray(list.get(1)));
            return;
        }
        this.haveInitializationData = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public SsaSubtitle decode(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray);
        }
        parseEventBody(parsableByteArray, arrayList, longArray);
        Cue[] cueArr = new Cue[arrayList.size()];
        arrayList.toArray(cueArr);
        return new SsaSubtitle(cueArr, longArray.toArray());
    }

    private void parseHeader(ParsableByteArray parsableByteArray) {
        String readLine;
        do {
            readLine = parsableByteArray.readLine();
            if (readLine == null) {
                return;
            }
        } while (!readLine.startsWith("[Events]"));
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<Cue> list, LongArray longArray) {
        while (true) {
            String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                return;
            }
            if (!this.haveInitializationData && readLine.startsWith(FORMAT_LINE_PREFIX)) {
                parseFormatLine(readLine);
            } else if (readLine.startsWith(DIALOGUE_LINE_PREFIX)) {
                parseDialogueLine(readLine, list, longArray);
            }
        }
    }

    private void parseFormatLine(String str) {
        char c;
        String[] split = TextUtils.split(str.substring(8), ",");
        this.formatKeyCount = split.length;
        this.formatStartIndex = -1;
        this.formatEndIndex = -1;
        this.formatTextIndex = -1;
        for (int i = 0; i < this.formatKeyCount; i++) {
            String lowerInvariant = Util.toLowerInvariant(split[i].trim());
            int hashCode = lowerInvariant.hashCode();
            if (hashCode == 100571) {
                if (lowerInvariant.equals("end")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 3556653) {
                if (hashCode == 109757538 && lowerInvariant.equals("start")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (lowerInvariant.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0) {
                this.formatStartIndex = i;
            } else if (c == 1) {
                this.formatEndIndex = i;
            } else if (c == 2) {
                this.formatTextIndex = i;
            }
        }
        if (this.formatStartIndex == -1 || this.formatEndIndex == -1 || this.formatTextIndex == -1) {
            this.formatKeyCount = 0;
        }
    }

    private void parseDialogueLine(String str, List<Cue> list, LongArray longArray) {
        long j;
        if (this.formatKeyCount == 0) {
            Log.w(TAG, "Skipping dialogue line before complete format: " + str);
            return;
        }
        String[] split = str.substring(10).split(",", this.formatKeyCount);
        if (split.length != this.formatKeyCount) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long parseTimecodeUs = parseTimecodeUs(split[this.formatStartIndex]);
        if (parseTimecodeUs == C.TIME_UNSET) {
            Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        String str2 = split[this.formatEndIndex];
        if (str2.trim().isEmpty()) {
            j = -9223372036854775807L;
        } else {
            j = parseTimecodeUs(str2);
            if (j == C.TIME_UNSET) {
                Log.w(TAG, "Skipping invalid timing: " + str);
                return;
            }
        }
        list.add(new Cue(split[this.formatTextIndex].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        longArray.add(parseTimecodeUs);
        if (j != C.TIME_UNSET) {
            list.add(null);
            longArray.add(j);
        }
    }

    public static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str);
        return !matcher.matches() ? C.TIME_UNSET : (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }
}
