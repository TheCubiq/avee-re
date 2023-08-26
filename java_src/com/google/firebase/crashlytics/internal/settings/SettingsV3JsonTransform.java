package com.google.firebase.crashlytics.internal.settings;

import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.FeaturesSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SessionSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import com.google.firebase.crashlytics.internal.settings.network.AbstractAppSpiCall;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class SettingsV3JsonTransform implements SettingsJsonTransform {
    private static final String CRASHLYTICS_APP_URL = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
    private static final String CRASHLYTICS_APP_URL_FORMAT = "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s";
    private static final String NDK_REPORTS_URL_FORMAT = "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps";
    private static final String REPORTS_URL_FORMAT = "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports";

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public SettingsData buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new SettingsData(getExpiresAtFrom(currentTimeProvider, optInt2, jSONObject), buildAppDataFrom(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), defaultSessionData(), buildFeaturesSessionDataFrom(jSONObject.getJSONObject("features")), optInt, optInt2);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public JSONObject toJson(SettingsData settingsData) throws JSONException {
        return new JSONObject().put("expires_at", settingsData.expiresAtMillis).put("cache_duration", settingsData.cacheDuration).put("settings_version", settingsData.settingsVersion).put("features", toFeaturesJson(settingsData.featuresData)).put("app", toAppJson(settingsData.appData)).put("fabric", toFabricJson(settingsData.appData));
    }

    private static AppSettingsData buildAppDataFrom(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string = jSONObject2.getString(NotificationCompat.CATEGORY_STATUS);
        boolean equals = AppSettingsData.STATUS_NEW.equals(string);
        String string2 = jSONObject.getString("bundle_id");
        return new AppSettingsData(string, equals ? CRASHLYTICS_APP_URL : String.format(Locale.US, CRASHLYTICS_APP_URL_FORMAT, string2), String.format(Locale.US, REPORTS_URL_FORMAT, string2), String.format(Locale.US, NDK_REPORTS_URL_FORMAT, string2), string2, jSONObject.getString(AbstractAppSpiCall.ORGANIZATION_ID_PARAM), jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static FeaturesSettingsData buildFeaturesSessionDataFrom(JSONObject jSONObject) {
        return new FeaturesSettingsData(jSONObject.optBoolean("collect_reports", true));
    }

    private static SessionSettingsData defaultSessionData() {
        return new SessionSettingsData(8, 4);
    }

    private JSONObject toFabricJson(AppSettingsData appSettingsData) throws JSONException {
        return new JSONObject().put("bundle_id", appSettingsData.bundleId).put(AbstractAppSpiCall.ORGANIZATION_ID_PARAM, appSettingsData.organizationId);
    }

    private JSONObject toAppJson(AppSettingsData appSettingsData) throws JSONException {
        return new JSONObject().put(NotificationCompat.CATEGORY_STATUS, appSettingsData.status).put("update_required", appSettingsData.updateRequired).put("report_upload_variant", appSettingsData.reportUploadVariant).put("native_report_upload_variant", appSettingsData.nativeReportUploadVariant);
    }

    private JSONObject toFeaturesJson(FeaturesSettingsData featuresSettingsData) throws JSONException {
        return new JSONObject().put("collect_reports", featuresSettingsData.collectReports);
    }

    private static long getExpiresAtFrom(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + currentTimeProvider.getCurrentTimeMillis();
    }
}
