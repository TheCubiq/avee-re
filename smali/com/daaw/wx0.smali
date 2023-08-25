.class public Lcom/daaw/wx0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/daaw/wx0;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/tx0;[Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/e0;)Lcom/daaw/tx0$b;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/wx0;->f(Lcom/daaw/tx0;[Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/e0;)Lcom/daaw/tx0$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/e0;Lcom/daaw/tx0$b;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/wx0;->e(Lcom/daaw/e0;Lcom/daaw/tx0$b;)V

    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/daaw/tx0;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Handler;Lcom/daaw/e0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/tx0;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            "Lcom/daaw/e0<",
            "Lcom/daaw/tx0$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p2, v0, p0

    const/4 p0, 0x2

    aput-object p3, v0, p0

    sget-object p0, Lcom/daaw/wx0;->a:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lcom/daaw/vx0;

    invoke-direct {p2, p1, v0, p4, p5}, Lcom/daaw/vx0;-><init>(Lcom/daaw/tx0;[Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/e0;)V

    invoke-interface {p0, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public static d(Landroid/content/Context;Landroid/net/Uri;Lcom/daaw/tx0$b;)Lcom/daaw/tx0$c;
    .locals 8

    new-instance v0, Lcom/daaw/tx0$c;

    invoke-direct {v0, p2}, Lcom/daaw/tx0$c;-><init>(Lcom/daaw/tx0$b;)V

    if-eqz p1, :cond_f

    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    if-ne p1, p2, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance p2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {p2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "content"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    :cond_1
    :try_start_0
    invoke-virtual {p2, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v6, "http"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v6, "https"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :catch_0
    :goto_0
    const/4 p0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const-string v1, "."

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_4

    add-int/lit8 v1, p1, -0x1

    :cond_4
    const/16 v6, 0x2f

    invoke-virtual {p0, v6, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v7

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {p0, v6, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    if-gez v1, :cond_5

    sub-int/2addr p1, v5

    add-int/lit8 v1, p1, 0x1

    :cond_5
    :try_start_1
    invoke-virtual {p0, v7, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ge p1, v2, :cond_6

    goto :goto_0

    :cond_6
    move-object v3, p0

    goto :goto_0

    :goto_2
    const-string p1, ""

    if-eqz p0, :cond_7

    iput-boolean v4, v0, Lcom/daaw/tx0$c;->b:Z

    const/16 p0, 0xc

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/tx0$c;->c:Ljava/lang/String;

    const/4 p0, 0x7

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/tx0$c;->e:Ljava/lang/String;

    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/tx0$c;->g:Ljava/lang/String;

    invoke-virtual {p2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/tx0$c;->f:Ljava/lang/String;

    const/16 p0, 0x9

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/tx0$c;->i:I

    invoke-virtual {p2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/tx0$c;->l:I

    const/16 p0, 0xe

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/tx0$c;->m:I

    const/16 p0, 0x8

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/tx0$c;->n:I

    const/16 p0, 0xd

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/tx0$c;->h:Ljava/lang/String;

    const/4 p0, 0x4

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/tx0$c;->p:Ljava/lang/String;

    const/16 p0, 0x14

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/tx0$c;->o:I

    const/16 p0, 0x12

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/tx0$c;->j:I

    const/16 p0, 0x13

    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/br1;->w(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/tx0$c;->k:I

    goto :goto_3

    :cond_7
    iput-boolean v5, v0, Lcom/daaw/tx0$c;->b:Z

    if-nez v3, :cond_8

    iput-object p1, v0, Lcom/daaw/tx0$c;->d:Ljava/lang/String;

    goto :goto_3

    :cond_8
    iput-object v3, v0, Lcom/daaw/tx0$c;->d:Ljava/lang/String;

    :goto_3
    iget-object p0, v0, Lcom/daaw/tx0$c;->c:Ljava/lang/String;

    if-nez p0, :cond_9

    iput-object p1, v0, Lcom/daaw/tx0$c;->c:Ljava/lang/String;

    :cond_9
    iget-object p0, v0, Lcom/daaw/tx0$c;->e:Ljava/lang/String;

    if-nez p0, :cond_a

    iput-object p1, v0, Lcom/daaw/tx0$c;->e:Ljava/lang/String;

    :cond_a
    iget-object p0, v0, Lcom/daaw/tx0$c;->f:Ljava/lang/String;

    if-nez p0, :cond_b

    iput-object p1, v0, Lcom/daaw/tx0$c;->f:Ljava/lang/String;

    :cond_b
    iget-object p0, v0, Lcom/daaw/tx0$c;->g:Ljava/lang/String;

    if-nez p0, :cond_c

    iput-object p1, v0, Lcom/daaw/tx0$c;->g:Ljava/lang/String;

    :cond_c
    iget-object p0, v0, Lcom/daaw/tx0$c;->h:Ljava/lang/String;

    if-nez p0, :cond_d

    iput-object p1, v0, Lcom/daaw/tx0$c;->h:Ljava/lang/String;

    :cond_d
    iget-object p0, v0, Lcom/daaw/tx0$c;->p:Ljava/lang/String;

    if-nez p0, :cond_e

    iput-object p1, v0, Lcom/daaw/tx0$c;->p:Ljava/lang/String;

    :cond_e
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    :cond_f
    :goto_4
    return-object v0
.end method

.method public static synthetic e(Lcom/daaw/e0;Lcom/daaw/tx0$b;)V
    .locals 0

    invoke-interface {p0, p1}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lcom/daaw/tx0;[Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/e0;)Lcom/daaw/tx0$b;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/tx0;->e([Ljava/lang/Object;)Lcom/daaw/tx0$b;

    move-result-object p0

    if-eqz p2, :cond_0

    new-instance p1, Lcom/daaw/ux0;

    invoke-direct {p1, p3, p0}, Lcom/daaw/ux0;-><init>(Lcom/daaw/e0;Lcom/daaw/tx0$b;)V

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p3, p0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method
