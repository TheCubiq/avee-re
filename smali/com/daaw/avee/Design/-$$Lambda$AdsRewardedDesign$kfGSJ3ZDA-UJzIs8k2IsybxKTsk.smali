.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$kfGSJ3ZDA-UJzIs8k2IsybxKTsk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/Design/AdsRewardedDesign;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/Design/AdsRewardedDesign;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$kfGSJ3ZDA-UJzIs8k2IsybxKTsk;->f$0:Lcom/daaw/avee/Design/AdsRewardedDesign;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/Design/-$$Lambda$AdsRewardedDesign$kfGSJ3ZDA-UJzIs8k2IsybxKTsk;->f$0:Lcom/daaw/avee/Design/AdsRewardedDesign;

    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Design/AdsRewardedDesign;->lambda$new$5$AdsRewardedDesign(Lcom/daaw/avee/ContextData;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
