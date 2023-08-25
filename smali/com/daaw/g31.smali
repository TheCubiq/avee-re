.class public Lcom/daaw/g31;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/os/Handler;

.field public b:J

.field public c:Lcom/daaw/h0;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/g31;->c:Lcom/daaw/h0;

    iput-wide p1, p0, Lcom/daaw/g31;->b:J

    new-instance p1, Landroid/os/Handler;

    new-instance p2, Lcom/daaw/g31$a;

    invoke-direct {p2, p0}, Lcom/daaw/g31$a;-><init>(Lcom/daaw/g31;)V

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/daaw/g31;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/h0;)V
    .locals 3

    invoke-static {}, Lcom/daaw/gr1;->c()V

    iput-object p1, p0, Lcom/daaw/g31;->c:Lcom/daaw/h0;

    iget-object v0, p0, Lcom/daaw/g31;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/g31;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/g31;->a:Landroid/os/Handler;

    iget-wide v1, p0, Lcom/daaw/g31;->b:J

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method
