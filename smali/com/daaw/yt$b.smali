.class public final Lcom/daaw/yt$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/yt$c;

.field public final b:[Z

.field public c:Z

.field public final synthetic d:Lcom/daaw/yt;


# direct methods
.method public constructor <init>(Lcom/daaw/yt;Lcom/daaw/yt$c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yt$b;->d:Lcom/daaw/yt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/yt$b;->a:Lcom/daaw/yt$c;

    invoke-static {p2}, Lcom/daaw/yt$c;->e(Lcom/daaw/yt$c;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/yt;->q(Lcom/daaw/yt;)I

    move-result p1

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lcom/daaw/yt$b;->b:[Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/yt;Lcom/daaw/yt$c;Lcom/daaw/yt$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/yt$b;-><init>(Lcom/daaw/yt;Lcom/daaw/yt$c;)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/yt$b;)Lcom/daaw/yt$c;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yt$b;->a:Lcom/daaw/yt$c;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/yt$b;)[Z
    .locals 0

    iget-object p0, p0, Lcom/daaw/yt$b;->b:[Z

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yt$b;->d:Lcom/daaw/yt;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/daaw/yt;->D(Lcom/daaw/yt;Lcom/daaw/yt$b;Z)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/yt$b;->c:Z

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/yt$b;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yt$b;->d:Lcom/daaw/yt;

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lcom/daaw/yt;->D(Lcom/daaw/yt;Lcom/daaw/yt$b;Z)V

    iput-boolean v1, p0, Lcom/daaw/yt$b;->c:Z

    return-void
.end method

.method public f(I)Ljava/io/File;
    .locals 3

    iget-object v0, p0, Lcom/daaw/yt$b;->d:Lcom/daaw/yt;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/yt$b;->a:Lcom/daaw/yt$c;

    invoke-static {v1}, Lcom/daaw/yt$c;->g(Lcom/daaw/yt$c;)Lcom/daaw/yt$b;

    move-result-object v1

    if-ne v1, p0, :cond_2

    iget-object v1, p0, Lcom/daaw/yt$b;->a:Lcom/daaw/yt$c;

    invoke-static {v1}, Lcom/daaw/yt$c;->e(Lcom/daaw/yt$c;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/yt$b;->b:[Z

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    :cond_0
    iget-object v1, p0, Lcom/daaw/yt$b;->a:Lcom/daaw/yt$c;

    invoke-virtual {v1, p1}, Lcom/daaw/yt$c;->k(I)Ljava/io/File;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/yt$b;->d:Lcom/daaw/yt;

    invoke-static {v1}, Lcom/daaw/yt;->u(Lcom/daaw/yt;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/yt$b;->d:Lcom/daaw/yt;

    invoke-static {v1}, Lcom/daaw/yt;->u(Lcom/daaw/yt;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    monitor-exit v0

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
