.class final Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$12;
.super Ljava/lang/Object;
.source "EventsPlaybackService.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Float;)V
    .locals 1

    .line 151
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const-string v0, "VOLUME_PERCENTAGE_ACTION"

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startService(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 148
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$12;->invoke(Ljava/lang/Float;)V

    return-void
.end method
