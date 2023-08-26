.class Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;
.super Ljava/lang/Object;
.source "MediaControlsUI.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    if-nez p3, :cond_0

    return-void

    .line 133
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$400(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J

    move-result-wide v0

    int-to-long p2, p2

    mul-long v0, v0, p2

    const-wide/16 p2, 0x3e8

    div-long/2addr v0, p2

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$302(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)J

    .line 135
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    .line 136
    iget-object p3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {p3}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$200(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J

    move-result-wide v0

    sub-long v0, p1, v0

    const-wide/16 v2, 0xfa

    cmp-long p3, v0, v2

    if-lez p3, :cond_1

    .line 137
    iget-object p3, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {p3, p1, p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$202(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)J

    .line 138
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetTrackPosition:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {p2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$300(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 127
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$202(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)J

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 143
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetTrackPosition:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {v0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$300(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 144
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    const-wide/16 v0, -0x1

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$302(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;J)J

    return-void
.end method
