.class public final Lcom/daaw/t6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/t6$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/res/AssetManager;

.field public final b:Lcom/daaw/bn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/t6;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroid/net/Uri;

.field public d:Ljava/io/InputStream;

.field public e:J

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/bn1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/t6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/t6;->a:Landroid/content/res/AssetManager;

    iput-object p2, p0, Lcom/daaw/t6;->b:Lcom/daaw/bn1;

    return-void
.end method


# virtual methods
.method public b([BII)I
    .locals 7

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v0, p0, Lcom/daaw/t6;->e:J

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_1

    return v4

    :cond_1
    const-wide/16 v2, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v5, p3

    :try_start_0
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    :goto_0
    iget-object v0, p0, Lcom/daaw/t6;->d:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v4, :cond_4

    iget-wide p1, p0, Lcom/daaw/t6;->e:J

    cmp-long p3, p1, v2

    if-nez p3, :cond_3

    return v4

    :cond_3
    new-instance p1, Lcom/daaw/t6$a;

    new-instance p2, Ljava/io/EOFException;

    invoke-direct {p2}, Ljava/io/EOFException;-><init>()V

    invoke-direct {p1, p2}, Lcom/daaw/t6$a;-><init>(Ljava/io/IOException;)V

    throw p1

    :cond_4
    iget-wide p2, p0, Lcom/daaw/t6;->e:J

    cmp-long v0, p2, v2

    if-eqz v0, :cond_5

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lcom/daaw/t6;->e:J

    :cond_5
    iget-object p2, p0, Lcom/daaw/t6;->b:Lcom/daaw/bn1;

    if-eqz p2, :cond_6

    invoke-interface {p2, p0, p1}, Lcom/daaw/bn1;->a(Ljava/lang/Object;I)V

    :cond_6
    return p1

    :catch_0
    move-exception p1

    new-instance p2, Lcom/daaw/t6$a;

    invoke-direct {p2, p1}, Lcom/daaw/t6$a;-><init>(Ljava/io/IOException;)V

    throw p2
.end method

.method public c(Lcom/daaw/pp;)J
    .locals 8

    :try_start_0
    iget-object v0, p1, Lcom/daaw/pp;->a:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/t6;->c:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/android_asset/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/daaw/t6;->a:Landroid/content/res/AssetManager;

    invoke-virtual {v1, v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/t6;->d:Ljava/io/InputStream;

    iget-wide v3, p1, Lcom/daaw/pp;->d:J

    invoke-virtual {v0, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    iget-wide v3, p1, Lcom/daaw/pp;->d:J

    cmp-long v5, v0, v3

    if-ltz v5, :cond_5

    iget-wide v0, p1, Lcom/daaw/pp;->e:J

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    iput-wide v0, p0, Lcom/daaw/t6;->e:J

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/t6;->d:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/daaw/t6;->e:J

    const-wide/32 v5, 0x7fffffff

    cmp-long v7, v0, v5

    if-nez v7, :cond_3

    iput-wide v3, p0, Lcom/daaw/t6;->e:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_1
    iput-boolean v2, p0, Lcom/daaw/t6;->f:Z

    iget-object v0, p0, Lcom/daaw/t6;->b:Lcom/daaw/bn1;

    if-eqz v0, :cond_4

    invoke-interface {v0, p0, p1}, Lcom/daaw/bn1;->c(Ljava/lang/Object;Lcom/daaw/pp;)V

    :cond_4
    iget-wide v0, p0, Lcom/daaw/t6;->e:J

    return-wide v0

    :cond_5
    :try_start_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/daaw/t6$a;

    invoke-direct {v0, p1}, Lcom/daaw/t6$a;-><init>(Ljava/io/IOException;)V

    throw v0
.end method

.method public close()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/t6;->c:Landroid/net/Uri;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/t6;->d:Ljava/io/InputStream;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iput-object v0, p0, Lcom/daaw/t6;->d:Ljava/io/InputStream;

    iget-boolean v0, p0, Lcom/daaw/t6;->f:Z

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/daaw/t6;->f:Z

    iget-object v0, p0, Lcom/daaw/t6;->b:Lcom/daaw/bn1;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/daaw/bn1;->b(Ljava/lang/Object;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_1
    new-instance v3, Lcom/daaw/t6$a;

    invoke-direct {v3, v2}, Lcom/daaw/t6$a;-><init>(Ljava/io/IOException;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-object v0, p0, Lcom/daaw/t6;->d:Ljava/io/InputStream;

    iget-boolean v0, p0, Lcom/daaw/t6;->f:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lcom/daaw/t6;->f:Z

    iget-object v0, p0, Lcom/daaw/t6;->b:Lcom/daaw/bn1;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Lcom/daaw/bn1;->b(Ljava/lang/Object;)V

    :cond_2
    throw v2
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/t6;->c:Landroid/net/Uri;

    return-object v0
.end method
