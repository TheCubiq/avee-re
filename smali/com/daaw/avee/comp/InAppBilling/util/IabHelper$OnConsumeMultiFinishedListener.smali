.class public interface abstract Lcom/daaw/avee/comp/InAppBilling/util/IabHelper$OnConsumeMultiFinishedListener;
.super Ljava/lang/Object;
.source "IabHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnConsumeMultiFinishedListener"
.end annotation


# virtual methods
.method public abstract onConsumeMultiFinished(Ljava/util/List;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/InAppBilling/util/Purchase;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/InAppBilling/util/IabResult;",
            ">;)V"
        }
    .end annotation
.end method
