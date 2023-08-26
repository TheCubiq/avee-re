.class Lcom/daaw/avee/MainActivity$6;
.super Ljava/util/TimerTask;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;->onKeyLongPress(ILandroid/view/KeyEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    .line 534
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$6;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 537
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$6;->this$0:Lcom/daaw/avee/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/avee/MainActivity;->access$202(Lcom/daaw/avee/MainActivity;Z)Z

    .line 538
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$6;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {v0}, Lcom/daaw/avee/MainActivity;->access$300(Lcom/daaw/avee/MainActivity;)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 539
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$6;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-static {v0}, Lcom/daaw/avee/MainActivity;->access$400(Lcom/daaw/avee/MainActivity;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 541
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$6;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->doExit()V

    return-void
.end method
