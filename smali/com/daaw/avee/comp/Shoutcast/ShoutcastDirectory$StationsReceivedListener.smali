.class public interface abstract Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$StationsReceivedListener;
.super Ljava/lang/Object;
.source "ShoutcastDirectory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "StationsReceivedListener"
.end annotation


# virtual methods
.method public abstract onStationsReceived(Ljava/util/List;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/StationDesc;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation
.end method
