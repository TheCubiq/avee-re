.class public Lcom/daaw/t91;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Landroid/os/AsyncTask;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/t91;->c:Lcom/daaw/rw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/t91;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/t91;->b:Landroid/os/AsyncTask;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/t91;->b:Landroid/os/AsyncTask;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lcom/daaw/t91;->a:I

    invoke-static {v0}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/t91;->b:Landroid/os/AsyncTask;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/t91;->b:Landroid/os/AsyncTask;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/t91;->a:I

    if-nez p1, :cond_1

    sget-object p1, Lcom/daaw/t91;->c:Lcom/daaw/rw1;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/t91;->a:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/t91;->a(Z)V

    :cond_0
    return-void
.end method

.method public c(Landroid/os/AsyncTask;I)Z
    .locals 1

    iget v0, p0, Lcom/daaw/t91;->a:I

    if-ne v0, p2, :cond_0

    iget-object p2, p0, Lcom/daaw/t91;->b:Landroid/os/AsyncTask;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/t91;->b:Landroid/os/AsyncTask;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Landroid/os/AsyncTask;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/t91;->a:I

    if-ne v0, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/t91;->a(Z)V

    iput p2, p0, Lcom/daaw/t91;->a:I

    iput-object p1, p0, Lcom/daaw/t91;->b:Landroid/os/AsyncTask;

    return-void
.end method
