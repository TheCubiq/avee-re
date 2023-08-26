.class Lcom/android/billingclient/api/BillingClientImpl$5;
.super Ljava/lang/Object;
.source "BillingClientImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/BillingClientImpl;->consumeInternal(Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/billingclient/api/BillingClientImpl;

.field final synthetic val$listener:Lcom/android/billingclient/api/ConsumeResponseListener;

.field final synthetic val$purchaseToken:Ljava/lang/String;

.field final synthetic val$responseCode:I


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/BillingClientImpl;Lcom/android/billingclient/api/ConsumeResponseListener;ILjava/lang/String;)V
    .locals 0

    .line 767
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$5;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    iput-object p2, p0, Lcom/android/billingclient/api/BillingClientImpl$5;->val$listener:Lcom/android/billingclient/api/ConsumeResponseListener;

    iput p3, p0, Lcom/android/billingclient/api/BillingClientImpl$5;->val$responseCode:I

    iput-object p4, p0, Lcom/android/billingclient/api/BillingClientImpl$5;->val$purchaseToken:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 770
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl$5;->val$listener:Lcom/android/billingclient/api/ConsumeResponseListener;

    iget v1, p0, Lcom/android/billingclient/api/BillingClientImpl$5;->val$responseCode:I

    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$5;->val$purchaseToken:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/android/billingclient/api/ConsumeResponseListener;->onConsumeResponse(ILjava/lang/String;)V

    return-void
.end method
