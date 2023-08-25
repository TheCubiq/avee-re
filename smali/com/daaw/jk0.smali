.class public final Lcom/daaw/jk0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lk0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jk0$e;,
        Lcom/daaw/jk0$b;,
        Lcom/daaw/jk0$d;,
        Lcom/daaw/jk0$a;,
        Lcom/daaw/jk0$c;,
        Lcom/daaw/jk0$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public b:Lcom/daaw/jk0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jk0$b<",
            "+",
            "Lcom/daaw/jk0$c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/sq1;->L(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/jk0;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/jk0;)Lcom/daaw/jk0$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jk0;->b:Lcom/daaw/jk0$b;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/jk0;Lcom/daaw/jk0$b;)Lcom/daaw/jk0$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/jk0;->b:Lcom/daaw/jk0$b;

    return-object p1
.end method

.method public static synthetic d(Lcom/daaw/jk0;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    iput-object p1, p0, Lcom/daaw/jk0;->c:Ljava/io/IOException;

    return-object p1
.end method

.method public static synthetic e(Lcom/daaw/jk0;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jk0;->a:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Lcom/daaw/jk0;->h(I)V

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk0;->b:Lcom/daaw/jk0$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/jk0$b;->a(Z)V

    return-void
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/jk0;->b:Lcom/daaw/jk0$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk0;->c:Ljava/io/IOException;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/jk0;->b:Lcom/daaw/jk0$b;

    if-eqz v0, :cond_1

    const/high16 v1, -0x80000000

    if-ne p1, v1, :cond_0

    iget p1, v0, Lcom/daaw/jk0$b;->p:I

    :cond_0
    invoke-virtual {v0, p1}, Lcom/daaw/jk0$b;->e(I)V

    :cond_1
    return-void

    :cond_2
    throw v0
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/jk0;->j(Lcom/daaw/jk0$d;)V

    return-void
.end method

.method public j(Lcom/daaw/jk0$d;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk0;->b:Lcom/daaw/jk0$b;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/jk0$b;->a(Z)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/jk0;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/daaw/jk0$e;

    invoke-direct {v1, p1}, Lcom/daaw/jk0$e;-><init>(Lcom/daaw/jk0$d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/jk0;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public k(Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;I)J
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/daaw/jk0$c;",
            ">(TT;",
            "Lcom/daaw/jk0$a<",
            "TT;>;I)J"
        }
    .end annotation

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/jk0;->c:Ljava/io/IOException;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    new-instance v10, Lcom/daaw/jk0$b;

    move-object v0, v10

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, v8

    invoke-direct/range {v0 .. v7}, Lcom/daaw/jk0$b;-><init>(Lcom/daaw/jk0;Landroid/os/Looper;Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v10, p1, p2}, Lcom/daaw/jk0$b;->f(J)V

    return-wide v8
.end method
