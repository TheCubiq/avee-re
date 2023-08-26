.class Lcom/daaw/avee/Design/VisualizerDesign$7;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR2$Handler<",
        "Lcom/daaw/avee/comp/playback/AudioFrameData;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/playback/AudioFrameData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$7;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/AudioFrameData;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$7;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p2, p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$700(Lcom/daaw/avee/Design/VisualizerDesign;ILcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 198
    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign$7;->invoke(Lcom/daaw/avee/comp/playback/AudioFrameData;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method
