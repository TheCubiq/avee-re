.class public Lcom/android/billingclient/api/SkuDetails;
.super Ljava/lang/Object;
.source "SkuDetails.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;
    }
.end annotation


# instance fields
.field private final mOriginalJson:Ljava/lang/String;

.field private final mParsedJson:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/android/billingclient/api/SkuDetails;->mOriginalJson:Ljava/lang/String;

    .line 17
    new-instance p1, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mOriginalJson:Ljava/lang/String;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 142
    :cond_1
    check-cast p1, Lcom/android/billingclient/api/SkuDetails;

    .line 144
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mOriginalJson:Ljava/lang/String;

    iget-object p1, p1, Lcom/android/billingclient/api/SkuDetails;->mOriginalJson:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "description"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFreeTrialPeriod()Ljava/lang/String;
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "freeTrialPeriod"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIntroductoryPrice()Ljava/lang/String;
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "introductoryPrice"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIntroductoryPriceAmountMicros()Ljava/lang/String;
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "introductoryPriceAmountMicros"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIntroductoryPriceCycles()Ljava/lang/String;
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "introductoryPriceCycles"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIntroductoryPricePeriod()Ljava/lang/String;
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "introductoryPricePeriod"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "price"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPriceAmountMicros()J
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "price_amount_micros"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getPriceCurrencyCode()Ljava/lang/String;
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "price_currency_code"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSku()Ljava/lang/String;
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSubscriptionPeriod()Ljava/lang/String;
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "subscriptionPeriod"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "title"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mParsedJson:Lorg/json/JSONObject;

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/android/billingclient/api/SkuDetails;->mOriginalJson:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SkuDetails: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/android/billingclient/api/SkuDetails;->mOriginalJson:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
