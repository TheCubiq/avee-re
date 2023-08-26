.class Lcom/daaw/avee/Design/PlaybackDesign$41;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 491
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$41;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 1

    .line 494
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_audioMuteState:I

    if-ne p1, v0, :cond_1

    .line 496
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 498
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onVolumeMuteChanged(Z)V

    .line 500
    :cond_0
    sget-object p1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVolumeMute:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 491
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/PlaybackDesign$41;->invoke(Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
