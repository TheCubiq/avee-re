.class Lcom/daaw/avee/Design/AudioEffectsDesign$2;
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
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AudioEffectsDesign;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/daaw/avee/Design/AudioEffectsDesign$2;->this$0:Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 72
    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->createAndShowEqualizerDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 69
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AudioEffectsDesign$2;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
