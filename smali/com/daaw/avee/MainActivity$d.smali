.class public Lcom/daaw/avee/MainActivity$d;
.super Ljava/util/TimerTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;->onKeyLongPress(ILandroid/view/KeyEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/avee/MainActivity;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/MainActivity$d;->p:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/MainActivity$d;->p:Lcom/daaw/avee/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/avee/MainActivity;->h0(Lcom/daaw/avee/MainActivity;Z)Z

    iget-object v0, p0, Lcom/daaw/avee/MainActivity$d;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {v0}, Lcom/daaw/avee/MainActivity;->i0(Lcom/daaw/avee/MainActivity;)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    iget-object v0, p0, Lcom/daaw/avee/MainActivity$d;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {v0}, Lcom/daaw/avee/MainActivity;->j0(Lcom/daaw/avee/MainActivity;)Ljava/util/Timer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/MainActivity$d;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {v0}, Lcom/daaw/avee/MainActivity;->j0(Lcom/daaw/avee/MainActivity;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/MainActivity$d;->p:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->l0()V

    return-void
.end method
