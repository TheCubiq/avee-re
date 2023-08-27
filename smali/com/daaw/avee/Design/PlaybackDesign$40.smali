.class Lcom/daaw/avee/Design/PlaybackDesign$40;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Ljava/lang/Integer;",
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

    .line 472
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$40;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 1

    .line 475
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_playbackEngine:I

    if-ne p3, v0, :cond_0

    .line 476
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$40;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Design/PlaybackDesign;->selectMediaPlayerCoreIndex(Ljava/lang/Integer;)V

    goto :goto_0

    .line 477
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_volumeStereoBalance:I

    if-ne p3, v0, :cond_2

    .line 479
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 481
    iget-object p3, p0, Lcom/daaw/avee/Design/PlaybackDesign$40;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/PlaybackDesign;->access$300(Lcom/daaw/avee/Design/PlaybackDesign;)Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onAudioEffectsActiveChanged(Z)V

    .line 483
    :cond_1
    sget-object p1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVolumeStereoBalance:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    const p3, 0x3c23d70a    # 0.01f

    mul-float p2, p2, p3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    .line 485
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget p3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_crossFadeValue:I

    if-ne p1, p3, :cond_3

    .line 486
    sget-object p1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setCrossfadeValue:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    const p3, 0x3a83126f    # 0.001f

    mul-float p2, p2, p3

    iget-object p3, p0, Lcom/daaw/avee/Design/PlaybackDesign$40;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/PlaybackDesign;->access$200(Lcom/daaw/avee/Design/PlaybackDesign;)F

    move-result p3

    mul-float p2, p2, p3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 472
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/PlaybackDesign$40;->invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
