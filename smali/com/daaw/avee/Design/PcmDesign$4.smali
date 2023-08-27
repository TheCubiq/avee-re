.class Lcom/daaw/avee/Design/PcmDesign$4;
.super Ljava/lang/Object;
.source "PcmDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakDelegateR2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PcmDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakDelegateR2$Handler<",
        "Lcom/daaw/avee/comp/playback/AudioFrameData;",
        "Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;",
        "Lcom/daaw/avee/comp/playback/AudioFrameData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PcmDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PcmDesign;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$4;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 2

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/Design/PcmDesign$4;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/avee/Design/PcmDesign;->access$300(Lcom/daaw/avee/Design/PcmDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;Z)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 82
    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    check-cast p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/PcmDesign$4;->invoke(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method
