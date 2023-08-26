.class Lcom/android/billingclient/api/BillingClientImpl$3;
.super Ljava/lang/Object;
.source "BillingClientImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/BillingClientImpl;->consumeAsync(Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/billingclient/api/BillingClientImpl;

.field final synthetic val$listener:Lcom/android/billingclient/api/ConsumeResponseListener;

.field final synthetic val$purchaseToken:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V
    .locals 0

    .line 465
    iput-object p1, p0, Lcom/android/billingclient/api/BillingClientImpl$3;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    iput-object p2, p0, Lcom/android/billingclient/api/BillingClientImpl$3;->val$purchaseToken:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/BillingClientImpl$3;->val$listener:Lcom/android/billingclient/api/ConsumeResponseListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 468
    iget-object v0, p0, Lcom/android/billingclient/api/BillingClientImpl$3;->this$0:Lcom/android/billingclient/api/BillingClientImpl;

    iget-object v1, p0, Lcom/android/billingclient/api/BillingClientImpl$3;->val$purchaseToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/billingclient/api/BillingClientImpl$3;->val$listener:Lcom/android/billingclient/api/ConsumeResponseListener;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/BillingClientImpl;->access$300(Lcom/android/billingclient/api/BillingClientImpl;Ljava/lang/String;Lcom/android/billingclient/api/ConsumeResponseListener;)V

    return-void
.end method
