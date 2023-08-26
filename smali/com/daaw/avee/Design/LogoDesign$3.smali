.class Lcom/daaw/avee/Design/LogoDesign$3;
.super Ljava/lang/Object;
.source "LogoDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LogoDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LogoDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LogoDesign;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 12

    .line 66
    sget-boolean v0, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/LogoDesign;->access$100(Lcom/daaw/avee/Design/LogoDesign;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/LogoDesign;->access$200(Lcom/daaw/avee/Design/LogoDesign;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/LogoDesign;->access$300(Lcom/daaw/avee/Design/LogoDesign;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/LogoDesign;->access$400(Lcom/daaw/avee/Design/LogoDesign;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 78
    :cond_2
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackPositionForRendering()J

    move-result-wide v0

    .line 79
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackDurationForRendering()J

    move-result-wide v2

    const/4 v4, 0x0

    const-wide/16 v5, 0x1388

    const/4 v7, 0x1

    cmp-long v8, v2, v5

    if-lez v8, :cond_3

    const/4 v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    :goto_0
    const-wide/32 v9, 0xea60

    cmp-long v11, v2, v9

    if-lez v11, :cond_4

    const/4 v4, 0x1

    :cond_4
    const/4 v9, -0x1

    if-eqz v8, :cond_5

    const-wide/16 v10, 0x2710

    cmp-long v8, v0, v10

    if-lez v8, :cond_5

    const-wide/16 v10, 0x4e20

    cmp-long v8, v0, v10

    if-gez v8, :cond_5

    .line 85
    iget-object v8, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v8}, Lcom/daaw/avee/Design/LogoDesign;->access$300(Lcom/daaw/avee/Design/LogoDesign;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 86
    iget-object v8, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v8, v7}, Lcom/daaw/avee/Design/LogoDesign;->access$302(Lcom/daaw/avee/Design/LogoDesign;Z)Z

    .line 88
    iget-object v8, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v8}, Lcom/daaw/avee/Design/LogoDesign;->access$000(Lcom/daaw/avee/Design/LogoDesign;)Ljava/lang/ref/WeakReference;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v8, :cond_5

    .line 89
    invoke-virtual {v8, v7, v9}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setTriggerLogoTh(II)V

    :cond_5
    if-eqz v4, :cond_6

    const-wide/16 v10, 0x3a98

    sub-long v10, v2, v10

    cmp-long v4, v0, v10

    if-lez v4, :cond_6

    sub-long/2addr v2, v5

    cmp-long v4, v0, v2

    if-gez v4, :cond_6

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/LogoDesign;->access$400(Lcom/daaw/avee/Design/LogoDesign;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 95
    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v0, v7}, Lcom/daaw/avee/Design/LogoDesign;->access$402(Lcom/daaw/avee/Design/LogoDesign;Z)Z

    .line 97
    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$3;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/LogoDesign;->access$000(Lcom/daaw/avee/Design/LogoDesign;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_6

    .line 98
    invoke-virtual {v0, v7, v9}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setTriggerLogoTh(II)V

    :cond_6
    return-void
.end method
