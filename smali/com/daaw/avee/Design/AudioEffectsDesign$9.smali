.class Lcom/daaw/avee/Design/AudioEffectsDesign$9;
.super Ljava/lang/Object;
.source "AudioEffectsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AudioEffectsDesign;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$9;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
    .locals 2

    .line 183
    iget-object v0, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$9;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/AudioEffectsDesign;->access$300(Lcom/daaw/avee/Design/AudioEffectsDesign;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/Design/AudioEffectsDesign$9$1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/Design/AudioEffectsDesign$9$1;-><init>(Lcom/daaw/avee/Design/AudioEffectsDesign$9;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 180
    check-cast p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AudioEffectsDesign$9;->invoke(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V

    return-void
.end method
