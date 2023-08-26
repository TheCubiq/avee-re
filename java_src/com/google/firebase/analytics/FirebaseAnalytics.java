package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzag zzb;
    private String zzc;
    private long zzd;
    private final Object zze;
    private ExecutorService zzf;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
    /* loaded from: classes2.dex */
    public static class Event {
        public static final String ADD_PAYMENT_INFO = "add_payment_info";
        public static final String ADD_SHIPPING_INFO = "add_shipping_info";
        public static final String ADD_TO_CART = "add_to_cart";
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";
        public static final String APP_OPEN = "app_open";
        public static final String BEGIN_CHECKOUT = "begin_checkout";
        public static final String CAMPAIGN_DETAILS = "campaign_details";
        @Deprecated
        public static final String CHECKOUT_PROGRESS = "checkout_progress";
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        @Deprecated
        public static final String ECOMMERCE_PURCHASE = "ecommerce_purchase";
        public static final String GENERATE_LEAD = "generate_lead";
        public static final String JOIN_GROUP = "join_group";
        public static final String LEVEL_END = "level_end";
        public static final String LEVEL_START = "level_start";
        public static final String LEVEL_UP = "level_up";
        public static final String LOGIN = "login";
        public static final String POST_SCORE = "post_score";
        @Deprecated
        public static final String PRESENT_OFFER = "present_offer";
        public static final String PURCHASE = "purchase";
        @Deprecated
        public static final String PURCHASE_REFUND = "purchase_refund";
        public static final String REFUND = "refund";
        public static final String REMOVE_FROM_CART = "remove_from_cart";
        public static final String SCREEN_VIEW = "screen_view";
        public static final String SEARCH = "search";
        public static final String SELECT_CONTENT = "select_content";
        public static final String SELECT_ITEM = "select_item";
        public static final String SELECT_PROMOTION = "select_promotion";
        @Deprecated
        public static final String SET_CHECKOUT_OPTION = "set_checkout_option";
        public static final String SHARE = "share";
        public static final String SIGN_UP = "sign_up";
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        public static final String TUTORIAL_BEGIN = "tutorial_begin";
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        public static final String VIEW_CART = "view_cart";
        public static final String VIEW_ITEM = "view_item";
        public static final String VIEW_ITEM_LIST = "view_item_list";
        public static final String VIEW_PROMOTION = "view_promotion";
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";

        protected Event() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
    /* loaded from: classes2.dex */
    public static class Param {
        public static final String ACHIEVEMENT_ID = "achievement_id";
        public static final String ACLID = "aclid";
        public static final String AFFILIATION = "affiliation";
        public static final String CAMPAIGN = "campaign";
        public static final String CHARACTER = "character";
        @Deprecated
        public static final String CHECKOUT_OPTION = "checkout_option";
        @Deprecated
        public static final String CHECKOUT_STEP = "checkout_step";
        public static final String CONTENT = "content";
        public static final String CONTENT_TYPE = "content_type";
        public static final String COUPON = "coupon";
        public static final String CP1 = "cp1";
        public static final String CREATIVE_NAME = "creative_name";
        public static final String CREATIVE_SLOT = "creative_slot";
        public static final String CURRENCY = "currency";
        public static final String DESTINATION = "destination";
        public static final String DISCOUNT = "discount";
        public static final String END_DATE = "end_date";
        public static final String EXTEND_SESSION = "extend_session";
        public static final String FLIGHT_NUMBER = "flight_number";
        public static final String GROUP_ID = "group_id";
        public static final String INDEX = "index";
        public static final String ITEMS = "items";
        public static final String ITEM_BRAND = "item_brand";
        public static final String ITEM_CATEGORY = "item_category";
        public static final String ITEM_CATEGORY2 = "item_category2";
        public static final String ITEM_CATEGORY3 = "item_category3";
        public static final String ITEM_CATEGORY4 = "item_category4";
        public static final String ITEM_CATEGORY5 = "item_category5";
        public static final String ITEM_ID = "item_id";
        @Deprecated
        public static final String ITEM_LIST = "item_list";
        public static final String ITEM_LIST_ID = "item_list_id";
        public static final String ITEM_LIST_NAME = "item_list_name";
        @Deprecated
        public static final String ITEM_LOCATION_ID = "item_location_id";
        public static final String ITEM_NAME = "item_name";
        public static final String ITEM_VARIANT = "item_variant";
        public static final String LEVEL = "level";
        public static final String LEVEL_NAME = "level_name";
        public static final String LOCATION = "location";
        public static final String LOCATION_ID = "location_id";
        public static final String MEDIUM = "medium";
        public static final String METHOD = "method";
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";
        public static final String ORIGIN = "origin";
        public static final String PAYMENT_TYPE = "payment_type";
        public static final String PRICE = "price";
        public static final String PROMOTION_ID = "promotion_id";
        public static final String PROMOTION_NAME = "promotion_name";
        public static final String QUANTITY = "quantity";
        public static final String SCORE = "score";
        public static final String SCREEN_CLASS = "screen_class";
        public static final String SCREEN_NAME = "screen_name";
        public static final String SEARCH_TERM = "search_term";
        public static final String SHIPPING = "shipping";
        public static final String SHIPPING_TIER = "shipping_tier";
        @Deprecated
        public static final String SIGN_UP_METHOD = "sign_up_method";
        public static final String SOURCE = "source";
        public static final String START_DATE = "start_date";
        public static final String SUCCESS = "success";
        public static final String TAX = "tax";
        public static final String TERM = "term";
        public static final String TRANSACTION_ID = "transaction_id";
        public static final String TRAVEL_CLASS = "travel_class";
        public static final String VALUE = "value";
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";

        protected Param() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
    /* loaded from: classes2.dex */
    public static class UserProperty {
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
        public static final String SIGN_UP_METHOD = "sign_up_method";

        protected UserProperty() {
        }
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzag.zza(context));
                }
            }
        }
        return zza;
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzb.zza(str, bundle);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        this.zzb.zzc(bundle);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzb.zza(str, str2);
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzb.zza(activity, str, str2);
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.zza(Boolean.valueOf(z));
    }

    public final void setUserId(String str) {
        this.zzb.zza(str);
    }

    @Deprecated
    public final void setMinimumSessionDuration(long j) {
        this.zzb.zza(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzb.zzb(j);
    }

    private final ExecutorService zza() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.zzf == null) {
                this.zzf = new zza(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzf;
        }
        return executorService;
    }

    public final Task<String> getAppInstanceId() {
        try {
            String zzb = zzb();
            if (zzb != null) {
                return Tasks.forResult(zzb);
            }
            return Tasks.call(zza(), new zzc(this));
        } catch (Exception e) {
            this.zzb.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e);
        }
    }

    private FirebaseAnalytics(zzag zzagVar) {
        Preconditions.checkNotNull(zzagVar);
        this.zzb = zzagVar;
        this.zze = new Object();
    }

    public final void resetAnalyticsData() {
        zza((String) null);
        this.zzb.zzb();
    }

    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        synchronized (this.zze) {
            this.zzc = str;
            this.zzd = DefaultClock.getInstance().elapsedRealtime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzb() {
        synchronized (this.zze) {
            if (Math.abs(DefaultClock.getInstance().elapsedRealtime() - this.zzd) < 1000) {
                return this.zzc;
            }
            return null;
        }
    }

    public static zzie getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzag zza2 = zzag.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza2 == null) {
            return null;
        }
        return new zzb(zza2);
    }
}
