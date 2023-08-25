.class public Lcom/daaw/avee/MainActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;-><init>()V
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

    iput-object p1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/daaw/ty;->a:Lcom/daaw/pw1;

    invoke-virtual {p1}, Lcom/daaw/pw1;->a()V

    iget-object p1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->g0(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->g0(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {v1}, Lcom/daaw/avee/MainActivity;->g0(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/daaw/ty;->b:Lcom/daaw/pw1;

    invoke-virtual {p1}, Lcom/daaw/pw1;->a()V

    iget-object p1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->g0(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {p1}, Lcom/daaw/avee/MainActivity;->g0(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    invoke-static {v1}, Lcom/daaw/avee/MainActivity;->g0(Lcom/daaw/avee/MainActivity;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x2710

    :goto_0
    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    iget p1, p1, Lcom/daaw/avee/MainActivity;->N:I

    if-ne p1, v1, :cond_3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v1, Lcom/daaw/j5;->n:I

    invoke-virtual {p1, v1}, Lcom/daaw/j5;->h(I)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/avee/MainActivity$a;->p:Lcom/daaw/avee/MainActivity;

    iget v1, p1, Lcom/daaw/avee/MainActivity;->N:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/MainActivity;->N0(ZI)V

    :cond_3
    :goto_1
    return v0
.end method
