.class public Lcom/daaw/yx0$r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o81$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yx0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "r"
.end annotation


# instance fields
.field public a:Lcom/daaw/al;

.field public final synthetic b:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/yx0$r;->a:Lcom/daaw/al;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/AsyncTask;ZLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {v0}, Lcom/daaw/yx0;->b(Lcom/daaw/yx0;)Lcom/daaw/t91;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/t91;->c(Landroid/os/AsyncTask;I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    iput-boolean v1, p1, Lcom/daaw/yx0$p;->b:Z

    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    const-string v0, "Finished"

    iput-object v0, p1, Lcom/daaw/yx0$p;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/n81;->d(Lcom/daaw/yx0$p;)V

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    iget-object p1, p0, Lcom/daaw/yx0$r;->a:Lcom/daaw/al;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p2, p1, p3}, Lcom/daaw/yx0;->h(Lcom/daaw/yx0;Lcom/daaw/al;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public b(Landroid/os/AsyncTask;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {v0}, Lcom/daaw/yx0;->b(Lcom/daaw/yx0;)Lcom/daaw/t91;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/t91;->c(Landroid/os/AsyncTask;I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/daaw/yx0$p;->b:Z

    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    iput-object p2, p1, Lcom/daaw/yx0$p;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/n81;->d(Lcom/daaw/yx0$p;)V

    return-void
.end method

.method public c(Landroid/os/AsyncTask;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {v0}, Lcom/daaw/yx0;->b(Lcom/daaw/yx0;)Lcom/daaw/t91;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/t91;->c(Landroid/os/AsyncTask;I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/daaw/yx0$p;->b:Z

    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    const-string v0, "Starting"

    iput-object v0, p1, Lcom/daaw/yx0$p;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/yx0$r;->b:Lcom/daaw/yx0;

    invoke-static {p1}, Lcom/daaw/yx0;->a(Lcom/daaw/yx0;)Lcom/daaw/yx0$p;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/n81;->d(Lcom/daaw/yx0$p;)V

    return-void
.end method
