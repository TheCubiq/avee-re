.class public Lcom/daaw/au;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ut;


# static fields
.field public static f:Lcom/daaw/au;


# instance fields
.field public final a:Lcom/daaw/xt;

.field public final b:Lcom/daaw/w71;

.field public final c:Ljava/io/File;

.field public final d:I

.field public e:Lcom/daaw/yt;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/io/File;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/xt;

    invoke-direct {v0}, Lcom/daaw/xt;-><init>()V

    iput-object v0, p0, Lcom/daaw/au;->a:Lcom/daaw/xt;

    iput-object p1, p0, Lcom/daaw/au;->c:Ljava/io/File;

    iput p2, p0, Lcom/daaw/au;->d:I

    new-instance p1, Lcom/daaw/w71;

    invoke-direct {p1}, Lcom/daaw/w71;-><init>()V

    iput-object p1, p0, Lcom/daaw/au;->b:Lcom/daaw/w71;

    return-void
.end method

.method public static declared-synchronized d(Ljava/io/File;I)Lcom/daaw/ut;
    .locals 2

    const-class v0, Lcom/daaw/au;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/au;->f:Lcom/daaw/au;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/au;

    invoke-direct {v1, p0, p1}, Lcom/daaw/au;-><init>(Ljava/io/File;I)V

    sput-object v1, Lcom/daaw/au;->f:Lcom/daaw/au;

    :cond_0
    sget-object p0, Lcom/daaw/au;->f:Lcom/daaw/au;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a(Lcom/daaw/hi0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/au;->b:Lcom/daaw/w71;

    invoke-virtual {v0, p1}, Lcom/daaw/w71;->a(Lcom/daaw/hi0;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/au;->e()Lcom/daaw/yt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/yt;->c0(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public b(Lcom/daaw/hi0;Lcom/daaw/ut$b;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/au;->b:Lcom/daaw/w71;

    invoke-virtual {v0, p1}, Lcom/daaw/w71;->a(Lcom/daaw/hi0;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/au;->a:Lcom/daaw/xt;

    invoke-virtual {v1, p1}, Lcom/daaw/xt;->a(Lcom/daaw/hi0;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/au;->e()Lcom/daaw/yt;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/yt;->T(Ljava/lang/String;)Lcom/daaw/yt$b;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {v0, v1}, Lcom/daaw/yt$b;->f(I)Ljava/io/File;

    move-result-object v1

    invoke-interface {p2, v1}, Lcom/daaw/ut$b;->a(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Lcom/daaw/yt$b;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :try_start_2
    invoke-virtual {v0}, Lcom/daaw/yt$b;->b()V

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-virtual {v0}, Lcom/daaw/yt$b;->b()V

    throw p2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/daaw/au;->a:Lcom/daaw/xt;

    invoke-virtual {p2, p1}, Lcom/daaw/xt;->b(Lcom/daaw/hi0;)V

    goto :goto_1

    :catchall_1
    move-exception p2

    goto :goto_2

    :catch_0
    :try_start_3
    const-string p2, "DiskLruCacheWrapper"

    const/4 v0, 0x5

    invoke-static {p2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    iget-object v0, p0, Lcom/daaw/au;->a:Lcom/daaw/xt;

    invoke-virtual {v0, p1}, Lcom/daaw/xt;->b(Lcom/daaw/hi0;)V

    goto :goto_4

    :goto_3
    throw p2

    :goto_4
    goto :goto_3
.end method

.method public c(Lcom/daaw/hi0;)Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lcom/daaw/au;->b:Lcom/daaw/w71;

    invoke-virtual {v0, p1}, Lcom/daaw/w71;->a(Lcom/daaw/hi0;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/au;->e()Lcom/daaw/yt;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/yt;->V(Ljava/lang/String;)Lcom/daaw/yt$d;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/daaw/yt$d;->a(I)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized e()Lcom/daaw/yt;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/au;->e:Lcom/daaw/yt;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/au;->c:Ljava/io/File;

    iget v1, p0, Lcom/daaw/au;->d:I

    int-to-long v1, v1

    const/4 v3, 0x1

    invoke-static {v0, v3, v3, v1, v2}, Lcom/daaw/yt;->X(Ljava/io/File;IIJ)Lcom/daaw/yt;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/au;->e:Lcom/daaw/yt;

    :cond_0
    iget-object v0, p0, Lcom/daaw/au;->e:Lcom/daaw/yt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
