.class public final Lcom/daaw/rq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mp;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/bn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/mp;

.field public d:Lcom/daaw/mp;

.field public e:Lcom/daaw/mp;

.field public f:Lcom/daaw/mp;

.field public g:Lcom/daaw/mp;

.field public h:Lcom/daaw/mp;

.field public i:Lcom/daaw/mp;

.field public j:Lcom/daaw/mp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/bn1;Lcom/daaw/mp;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;",
            "Lcom/daaw/mp;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rq;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/rq;->b:Lcom/daaw/bn1;

    invoke-static {p3}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mp;

    iput-object p1, p0, Lcom/daaw/rq;->c:Lcom/daaw/mp;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/mp;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rq;->e:Lcom/daaw/mp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/t6;

    iget-object v1, p0, Lcom/daaw/rq;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/rq;->b:Lcom/daaw/bn1;

    invoke-direct {v0, v1, v2}, Lcom/daaw/t6;-><init>(Landroid/content/Context;Lcom/daaw/bn1;)V

    iput-object v0, p0, Lcom/daaw/rq;->e:Lcom/daaw/mp;

    :cond_0
    iget-object v0, p0, Lcom/daaw/rq;->e:Lcom/daaw/mp;

    return-object v0
.end method

.method public b([BII)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/mp;->b([BII)I

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/pp;)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p1, Lcom/daaw/pp;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/pp;->a:Landroid/net/Uri;

    invoke-static {v1}, Lcom/daaw/sq1;->K(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p1, Lcom/daaw/pp;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/android_asset/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/rq;->g()Lcom/daaw/mp;

    move-result-object v0

    goto :goto_2

    :cond_2
    const-string v1, "asset"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/rq;->a()Lcom/daaw/mp;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    goto :goto_3

    :cond_3
    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/daaw/rq;->e()Lcom/daaw/mp;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v1, "rtmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/rq;->i()Lcom/daaw/mp;

    move-result-object v0

    goto :goto_2

    :cond_5
    const-string v1, "data"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/daaw/rq;->f()Lcom/daaw/mp;

    move-result-object v0

    goto :goto_2

    :cond_6
    const-string v1, "rawresource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/daaw/rq;->h()Lcom/daaw/mp;

    move-result-object v0

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lcom/daaw/rq;->c:Lcom/daaw/mp;

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    invoke-interface {v0, p1}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    move-result-wide v0

    return-wide v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Lcom/daaw/mp;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rq;->j:Lcom/daaw/mp;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/daaw/mp;->d()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final e()Lcom/daaw/mp;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rq;->f:Lcom/daaw/mp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/sk;

    iget-object v1, p0, Lcom/daaw/rq;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/rq;->b:Lcom/daaw/bn1;

    invoke-direct {v0, v1, v2}, Lcom/daaw/sk;-><init>(Landroid/content/Context;Lcom/daaw/bn1;)V

    iput-object v0, p0, Lcom/daaw/rq;->f:Lcom/daaw/mp;

    :cond_0
    iget-object v0, p0, Lcom/daaw/rq;->f:Lcom/daaw/mp;

    return-object v0
.end method

.method public final f()Lcom/daaw/mp;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rq;->h:Lcom/daaw/mp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/lp;

    invoke-direct {v0}, Lcom/daaw/lp;-><init>()V

    iput-object v0, p0, Lcom/daaw/rq;->h:Lcom/daaw/mp;

    :cond_0
    iget-object v0, p0, Lcom/daaw/rq;->h:Lcom/daaw/mp;

    return-object v0
.end method

.method public final g()Lcom/daaw/mp;
    .locals 2

    iget-object v0, p0, Lcom/daaw/rq;->d:Lcom/daaw/mp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/t00;

    iget-object v1, p0, Lcom/daaw/rq;->b:Lcom/daaw/bn1;

    invoke-direct {v0, v1}, Lcom/daaw/t00;-><init>(Lcom/daaw/bn1;)V

    iput-object v0, p0, Lcom/daaw/rq;->d:Lcom/daaw/mp;

    :cond_0
    iget-object v0, p0, Lcom/daaw/rq;->d:Lcom/daaw/mp;

    return-object v0
.end method

.method public final h()Lcom/daaw/mp;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rq;->i:Lcom/daaw/mp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/i31;

    iget-object v1, p0, Lcom/daaw/rq;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/rq;->b:Lcom/daaw/bn1;

    invoke-direct {v0, v1, v2}, Lcom/daaw/i31;-><init>(Landroid/content/Context;Lcom/daaw/bn1;)V

    iput-object v0, p0, Lcom/daaw/rq;->i:Lcom/daaw/mp;

    :cond_0
    iget-object v0, p0, Lcom/daaw/rq;->i:Lcom/daaw/mp;

    return-object v0
.end method

.method public final i()Lcom/daaw/mp;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rq;->g:Lcom/daaw/mp;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/mp;

    iput-object v0, p0, Lcom/daaw/rq;->g:Lcom/daaw/mp;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating RTMP extension"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    nop

    :goto_0
    iget-object v0, p0, Lcom/daaw/rq;->g:Lcom/daaw/mp;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rq;->c:Lcom/daaw/mp;

    iput-object v0, p0, Lcom/daaw/rq;->g:Lcom/daaw/mp;

    :cond_0
    iget-object v0, p0, Lcom/daaw/rq;->g:Lcom/daaw/mp;

    return-object v0
.end method
