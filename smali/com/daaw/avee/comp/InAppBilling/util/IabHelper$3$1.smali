.class Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3$1;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;

.field final synthetic val$results:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;Ljava/util/List;)V
    .locals 0

    .line 999
    iput-object p1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3$1;->this$1:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;

    iput-object p2, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3$1;->val$results:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1001
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3$1;->this$1:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;

    iget-object v0, v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;->val$singleListener:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;

    iget-object v1, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3$1;->this$1:Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;

    iget-object v1, v1, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3;->val$purchases:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/InAppBilling/util/Purchase;

    iget-object v3, p0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$3$1;->val$results:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/InAppBilling/util/IabResult;

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeFinishedListener;->onConsumeFinished(Lcom/daaw/avee/comp/InAppBilling/util/Purchase;Lcom/daaw/avee/comp/InAppBilling/util/IabResult;)V

    return-void
.end method
