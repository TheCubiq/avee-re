package com.google.firebase.installations.local;

import com.daaw.avee.Design.VisualizerSharingDesign;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PersistedInstallation {
    private static final String AUTH_TOKEN_KEY = "AuthToken";
    private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final String FIS_ERROR_KEY = "FisError";
    private static final String PERSISTED_STATUS_KEY = "Status";
    private static final String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private final File dataFile;
    private final FirebaseApp firebaseApp;

    /* loaded from: classes2.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        File filesDir = firebaseApp.getApplicationContext().getFilesDir();
        this.dataFile = new File(filesDir, "PersistedInstallation." + firebaseApp.getPersistenceKey() + VisualizerSharingDesign.StringContent_FileExtWithDotAlt);
        this.firebaseApp = firebaseApp;
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject readJSONFromFile = readJSONFromFile();
        String optString = readJSONFromFile.optString(FIREBASE_INSTALLATION_ID_KEY, null);
        int optInt = readJSONFromFile.optInt(PERSISTED_STATUS_KEY, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = readJSONFromFile.optString(AUTH_TOKEN_KEY, null);
        String optString3 = readJSONFromFile.optString(REFRESH_TOKEN_KEY, null);
        long optLong = readJSONFromFile.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0L);
        long optLong2 = readJSONFromFile.optLong(EXPIRES_IN_SECONDS_KEY, 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(optString).setRegistrationStatus(RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(readJSONFromFile.optString(FIS_ERROR_KEY, null)).build();
    }

    private JSONObject readJSONFromFile() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.dataFile);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FIREBASE_INSTALLATION_ID_KEY, persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put(PERSISTED_STATUS_KEY, persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put(AUTH_TOKEN_KEY, persistedInstallationEntry.getAuthToken());
            jSONObject.put(REFRESH_TOKEN_KEY, persistedInstallationEntry.getRefreshToken());
            jSONObject.put(TOKEN_CREATION_TIME_IN_SECONDS_KEY, persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put(EXPIRES_IN_SECONDS_KEY, persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put(FIS_ERROR_KEY, persistedInstallationEntry.getFisError());
            createTempFile = File.createTempFile(SETTINGS_FILE_NAME_PREFIX, "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.dataFile)) {
            return persistedInstallationEntry;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public void clearForTesting() {
        this.dataFile.delete();
    }
}
