.class Lcom/daaw/avee/Design/AudioEffectsDesign$4;
.super Ljava/lang/Object;
.source "AudioEffectsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AudioEffectsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AudioEffectsDesign;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$4;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;
    .locals 2

    .line 88
    sget-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onRequestEqualizerDesc:Lcom/daaw/avee/Common/Events/WeakDelegateR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakDelegateR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    if-nez v0, :cond_0

    return-object v1

    .line 90
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$4;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-static {v1, v0}, Lcom/daaw/avee/Design/AudioEffectsDesign;->access$000(Lcom/daaw/avee/Design/AudioEffectsDesign;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/daaw/avee/Design/AudioEffectsDesign$4;->invoke()Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    move-result-object v0

    return-object v0
.end method
