.class Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$1;
.super Ljava/lang/Object;
.source "BaseEqualizerEffect.java"

# interfaces
.implements Landroid/media/audiofx/AudioEffect$OnControlStatusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;->initializeEqualizer(ZI)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$1;->this$0:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onControlStatusChange(Landroid/media/audiofx/AudioEffect;Z)V
    .locals 0

    .line 124
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$1;->this$0:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;->access$002(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect;Z)Z

    return-void
.end method
