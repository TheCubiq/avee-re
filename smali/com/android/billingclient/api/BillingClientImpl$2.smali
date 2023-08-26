.class Lcom/android/billingclient/api/BillingClientImpl$2;
.super Ljava/lang/Object;
.source "BillingClientImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/BillingClientImpl;->querySkuDetailsAsync(Lcom/android/billingclient/api/SkuDetailsParams;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/billingclient/api/BillingClientImpl;

.field final synthetic val$listener:Lcom/android/billingclient/api/SkuDetailsResponseListener;

.field final synthetic val$skuType:Ljava/lang/String;

.field final synthetic val$skusList:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Ljava/util/List;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    iput-object p2, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->val$skuType:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->val$skusList:Ljava/util/List;

    iput-object p4, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->val$listener:Lcom/android/billingclient/api/SkuDetailsResponseListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 435
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    iget-object v1, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->val$skuType:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->val$skusList:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/BillingClientImpl;->querySkuDetailsInternal(Ljava/lang/String;Ljava/util/List;)Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;

    move-result-object v0

    .line 437
    iget-object v1, p0, Lcom/android/billingclient/api/BillingClientImpl$2;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    new-instance v2, Lcom/android/billingclient/api/BillingClientImpl$2$1;

    invoke-direct {v2, p0, v0}, Lcom/android/billingclient/api/BillingClientImpl$2$1;-><init>(Lcom/android/billingclient/api/BillingClientImpl$2;Lcom/android/billingclient/api/SkuDetails$SkuDetailsResult;)V

    invoke-static {v1, v2}, Lcom/android/billingclient/api/BillingClientImpl;->access$200(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/Runnable;)V

    return-void
.end method
