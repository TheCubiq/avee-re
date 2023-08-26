package com.google.firebase.crashlytics.internal.ndk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BinaryImagesConverter {
    private static final String DATA_DIR = "/data";
    private final Context context;
    private final FileIdStrategy fileIdStrategy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface FileIdStrategy {
        String createId(File file) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinaryImagesConverter(Context context, FileIdStrategy fileIdStrategy) {
        this.context = context;
        this.fileIdStrategy = fileIdStrategy;
    }

    byte[] convert(String str) throws IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromString(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] convert(BufferedReader bufferedReader) throws IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(bufferedReader));
    }

    private JSONArray parseProcMapsJsonFromStream(BufferedReader bufferedReader) throws IOException {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject jsonFromMapEntryString = jsonFromMapEntryString(readLine);
            if (jsonFromMapEntryString != null) {
                jSONArray.put(jsonFromMapEntryString);
            }
        }
    }

    private JSONArray parseProcMapsJsonFromString(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str2 : joinMapsEntries(new JSONObject(str).getJSONArray("maps")).split("\\|")) {
                JSONObject jsonFromMapEntryString = jsonFromMapEntryString(str2);
                if (jsonFromMapEntryString != null) {
                    jSONArray.put(jsonFromMapEntryString);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            Logger.getLogger().w("Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    private JSONObject jsonFromMapEntryString(String str) {
        ProcMapEntry parse = ProcMapEntryParser.parse(str);
        if (parse != null && isRelevant(parse)) {
            try {
                try {
                    return createBinaryImageJson(this.fileIdStrategy.createId(getLibraryFile(parse.path)), parse);
                } catch (JSONException e) {
                    Logger.getLogger().d("Could not create a binary image json string", e);
                    return null;
                }
            } catch (IOException e2) {
                Logger logger = Logger.getLogger();
                logger.d("Could not generate ID for file " + parse.path, e2);
            }
        }
        return null;
    }

    private File getLibraryFile(String str) {
        File file = new File(str);
        return !file.exists() ? correctDataPath(file) : file;
    }

    private File correctDataPath(File file) {
        if (Build.VERSION.SDK_INT >= 9 && file.getAbsolutePath().startsWith(DATA_DIR)) {
            try {
                return new File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (PackageManager.NameNotFoundException e) {
                Logger.getLogger().e("Error getting ApplicationInfo", e);
                return file;
            }
        }
        return file;
    }

    private static byte[] generateBinaryImagesJsonString(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        } catch (JSONException e) {
            Logger.getLogger().w("Binary images string is null", e);
            return new byte[0];
        }
    }

    private static JSONObject createBinaryImageJson(String str, ProcMapEntry procMapEntry) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", procMapEntry.address);
        jSONObject.put("size", procMapEntry.size);
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, procMapEntry.path);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static String joinMapsEntries(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    private static boolean isRelevant(ProcMapEntry procMapEntry) {
        return (procMapEntry.perms.indexOf(120) == -1 || procMapEntry.path.indexOf(47) == -1) ? false : true;
    }
}
