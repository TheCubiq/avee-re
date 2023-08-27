.class Lcom/daaw/avee/Design/AudioEffectsDesign$9$1;
.super Ljava/lang/Object;
.source "AudioEffectsDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AudioEffectsDesign$9;->invoke(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/AudioEffectsDesign$9;

.field final synthetic val$equalizerDesc:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AudioEffectsDesign$9;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$9$1;->this$1:Lcom/daaw/avee/Design/AudioEffectsDesign$9;

    iput-object p2, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$9$1;->val$equalizerDesc:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 186
    sget-object v0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onReceiveEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$9$1;->this$1:Lcom/daaw/avee/Design/AudioEffectsDesign$9;

    iget-object v1, v1, Lcom/daaw/avee/Design/AudioEffectsDesign$9;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    iget-object v2, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$9$1;->val$equalizerDesc:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    invoke-static {v1, v2}, Lcom/daaw/avee/Design/AudioEffectsDesign;->access$000(Lcom/daaw/avee/Design/AudioEffectsDesign;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
