.class public final Lcom/daaw/ps1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ps1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final u:Lcom/daaw/ps1$b;


# instance fields
.field public volatile p:J

.field public final q:Landroid/os/Handler;

.field public final r:Landroid/os/HandlerThread;

.field public s:Landroid/view/Choreographer;

.field public t:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ps1$b;

    invoke-direct {v0}, Lcom/daaw/ps1$b;-><init>()V

    sput-object v0, Lcom/daaw/ps1$b;->u:Lcom/daaw/ps1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/ps1$b;->p:J

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "ChoreographerOwner:Handler"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/ps1$b;->r:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/daaw/ps1$b;->q:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public static d()Lcom/daaw/ps1$b;
    .locals 1

    sget-object v0, Lcom/daaw/ps1$b;->u:Lcom/daaw/ps1$b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ps1$b;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final b()V
    .locals 2

    iget v0, p0, Lcom/daaw/ps1$b;->t:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/ps1$b;->t:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/ps1$b;->s:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ps1$b;->s:Landroid/view/Choreographer;

    return-void
.end method

.method public doFrame(J)V
    .locals 2

    iput-wide p1, p0, Lcom/daaw/ps1$b;->p:J

    iget-object p1, p0, Lcom/daaw/ps1$b;->s:Landroid/view/Choreographer;

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, p0, v0, v1}, Landroid/view/Choreographer;->postFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ps1$b;->q:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final f()V
    .locals 2

    iget v0, p0, Lcom/daaw/ps1$b;->t:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/ps1$b;->t:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ps1$b;->s:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/ps1$b;->p:J

    :cond_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ps1$b;->f()V

    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ps1$b;->b()V

    return v0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/ps1$b;->c()V

    return v0
.end method
