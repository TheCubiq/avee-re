.class Lcom/daaw/avee/Design/PcmDesign$2;
.super Ljava/lang/Object;
.source "PcmDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PcmDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PcmDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PcmDesign;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$2;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/daaw/avee/Design/PcmDesign$2;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PcmDesign;->access$100(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->onNewSourceTh()V

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/PcmDesign$2;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PcmDesign;->access$200(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {v0}, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->onNewSourceTh()V

    :cond_1
    return-void
.end method
