package com.google.firebase.crashlytics.internal.settings.network;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.ResponseParser;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.settings.model.AppRequestData;
import java.io.IOException;
/* loaded from: classes2.dex */
abstract class AbstractAppSpiCall extends AbstractSpiCall implements AppSpiCall {
    public static final String APP_BUILD_VERSION_PARAM = "app[build_version]";
    public static final String APP_BUILT_SDK_VERSION_PARAM = "app[built_sdk_version]";
    public static final String APP_DISPLAY_VERSION_PARAM = "app[display_version]";
    public static final String APP_IDENTIFIER_PARAM = "app[identifier]";
    public static final String APP_INSTANCE_IDENTIFIER_PARAM = "app[instance_identifier]";
    public static final String APP_MIN_SDK_VERSION_PARAM = "app[minimum_sdk_version]";
    public static final String APP_NAME_PARAM = "app[name]";
    public static final String APP_SOURCE_PARAM = "app[source]";
    public static final String ORGANIZATION_ID_PARAM = "org_id";
    private final String version;

    public AbstractAppSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod, String str3) {
        super(str, str2, httpRequestFactory, httpMethod);
        this.version = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.network.AppSpiCall
    public boolean invoke(AppRequestData appRequestData, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), appRequestData), appRequestData);
        Logger logger = Logger.getLogger();
        logger.d("Sending app info to " + getUrl());
        try {
            HttpResponse execute = applyMultipartDataTo.execute();
            int code = execute.code();
            String str = ShareTarget.METHOD_POST.equalsIgnoreCase(applyMultipartDataTo.method()) ? "Create" : "Update";
            Logger logger2 = Logger.getLogger();
            logger2.d(str + " app request ID: " + execute.header(AbstractSpiCall.HEADER_REQUEST_ID));
            Logger logger3 = Logger.getLogger();
            logger3.d("Result was " + code);
            return ResponseParser.parse(code) == 0;
        } catch (IOException e) {
            Logger.getLogger().e("HTTP request failed.", e);
            throw new RuntimeException(e);
        }
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, AppRequestData appRequestData) {
        return httpRequest.header(AbstractSpiCall.HEADER_ORG_ID, appRequestData.organizationId).header(AbstractSpiCall.HEADER_GOOGLE_APP_ID, appRequestData.googleAppId).header(AbstractSpiCall.HEADER_CLIENT_TYPE, AbstractSpiCall.ANDROID_CLIENT_TYPE).header(AbstractSpiCall.HEADER_CLIENT_VERSION, this.version);
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, AppRequestData appRequestData) {
        HttpRequest part = httpRequest.part(ORGANIZATION_ID_PARAM, appRequestData.organizationId).part(APP_IDENTIFIER_PARAM, appRequestData.appId).part(APP_NAME_PARAM, appRequestData.name).part(APP_DISPLAY_VERSION_PARAM, appRequestData.displayVersion).part(APP_BUILD_VERSION_PARAM, appRequestData.buildVersion).part(APP_SOURCE_PARAM, Integer.toString(appRequestData.source)).part(APP_MIN_SDK_VERSION_PARAM, appRequestData.minSdkVersion).part(APP_BUILT_SDK_VERSION_PARAM, appRequestData.builtSdkVersion);
        if (!CommonUtils.isNullOrEmpty(appRequestData.instanceIdentifier)) {
            part.part(APP_INSTANCE_IDENTIFIER_PARAM, appRequestData.instanceIdentifier);
        }
        return part;
    }
}
