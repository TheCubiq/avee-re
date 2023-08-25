.class public Lcom/daaw/d70;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e51;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/d70$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/e51<",
        "Lcom/daaw/s60;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lcom/daaw/d70$a;


# instance fields
.field public final a:Lcom/daaw/r60$a;

.field public final b:Lcom/daaw/bc;

.field public final c:Lcom/daaw/d70$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/d70$a;

    invoke-direct {v0}, Lcom/daaw/d70$a;-><init>()V

    sput-object v0, Lcom/daaw/d70;->d:Lcom/daaw/d70$a;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/bc;)V
    .locals 1

    sget-object v0, Lcom/daaw/d70;->d:Lcom/daaw/d70$a;

    invoke-direct {p0, p1, v0}, Lcom/daaw/d70;-><init>(Lcom/daaw/bc;Lcom/daaw/d70$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/bc;Lcom/daaw/d70$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d70;->b:Lcom/daaw/bc;

    new-instance v0, Lcom/daaw/j60;

    invoke-direct {v0, p1}, Lcom/daaw/j60;-><init>(Lcom/daaw/bc;)V

    iput-object v0, p0, Lcom/daaw/d70;->a:Lcom/daaw/r60$a;

    iput-object p2, p0, Lcom/daaw/d70;->c:Lcom/daaw/d70$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    .locals 0

    check-cast p1, Lcom/daaw/z41;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/d70;->c(Lcom/daaw/z41;Ljava/io/OutputStream;)Z

    move-result p1

    return p1
.end method

.method public final b([B)Lcom/daaw/r60;
    .locals 3

    iget-object v0, p0, Lcom/daaw/d70;->c:Lcom/daaw/d70$a;

    invoke-virtual {v0}, Lcom/daaw/d70$a;->d()Lcom/daaw/b70;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/b70;->o([B)Lcom/daaw/b70;

    invoke-virtual {v0}, Lcom/daaw/b70;->c()Lcom/daaw/a70;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d70;->c:Lcom/daaw/d70$a;

    iget-object v2, p0, Lcom/daaw/d70;->a:Lcom/daaw/r60$a;

    invoke-virtual {v1, v2}, Lcom/daaw/d70$a;->a(Lcom/daaw/r60$a;)Lcom/daaw/r60;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/daaw/r60;->o(Lcom/daaw/a70;[B)V

    invoke-virtual {v1}, Lcom/daaw/r60;->a()V

    return-object v1
.end method

.method public c(Lcom/daaw/z41;Ljava/io/OutputStream;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "Lcom/daaw/s60;",
            ">;",
            "Ljava/io/OutputStream;",
            ")Z"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/s60;

    invoke-virtual {p1}, Lcom/daaw/s60;->h()Lcom/daaw/cn1;

    move-result-object v2

    instance-of v3, v2, Lcom/daaw/np1;

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lcom/daaw/s60;->d()[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/d70;->e([BLjava/io/OutputStream;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/s60;->d()[B

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/daaw/d70;->b([B)Lcom/daaw/r60;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/d70;->c:Lcom/daaw/d70$a;

    invoke-virtual {v4}, Lcom/daaw/d70$a;->b()Lcom/daaw/c3;

    move-result-object v4

    invoke-virtual {v4, p2}, Lcom/daaw/c3;->h(Ljava/io/OutputStream;)Z

    move-result p2

    const/4 v5, 0x0

    if-nez p2, :cond_1

    return v5

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v3}, Lcom/daaw/r60;->f()I

    move-result v6

    if-ge p2, v6, :cond_3

    invoke-virtual {v3}, Lcom/daaw/r60;->i()Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-virtual {p0, v6, v2, p1}, Lcom/daaw/d70;->d(Landroid/graphics/Bitmap;Lcom/daaw/cn1;Lcom/daaw/s60;)Lcom/daaw/z41;

    move-result-object v6

    :try_start_0
    invoke-interface {v6}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/Bitmap;

    invoke-virtual {v4, v7}, Lcom/daaw/c3;->a(Landroid/graphics/Bitmap;)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v7, :cond_2

    invoke-interface {v6}, Lcom/daaw/z41;->c()V

    return v5

    :cond_2
    :try_start_1
    invoke-virtual {v3}, Lcom/daaw/r60;->d()I

    move-result v7

    invoke-virtual {v3, v7}, Lcom/daaw/r60;->e(I)I

    move-result v7

    invoke-virtual {v4, v7}, Lcom/daaw/c3;->f(I)V

    invoke-virtual {v3}, Lcom/daaw/r60;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v6}, Lcom/daaw/z41;->c()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v6}, Lcom/daaw/z41;->c()V

    throw p1

    :cond_3
    invoke-virtual {v4}, Lcom/daaw/c3;->d()Z

    move-result p2

    const/4 v2, 0x2

    const-string v4, "GifEncoder"

    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encoded gif with "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/daaw/r60;->f()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " frames and "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/s60;->d()[B

    move-result-object p1

    array-length p1, p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes in "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Lcom/daaw/jl0;->a(J)D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, " ms"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    return p2
.end method

.method public final d(Landroid/graphics/Bitmap;Lcom/daaw/cn1;Lcom/daaw/s60;)Lcom/daaw/z41;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/s60;",
            ")",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/d70;->c:Lcom/daaw/d70$a;

    iget-object v1, p0, Lcom/daaw/d70;->b:Lcom/daaw/bc;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/d70$a;->c(Landroid/graphics/Bitmap;Lcom/daaw/bc;)Lcom/daaw/z41;

    move-result-object p1

    invoke-virtual {p3}, Lcom/daaw/s60;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p3}, Lcom/daaw/s60;->getIntrinsicHeight()I

    move-result p3

    invoke-interface {p2, p1, v0, p3}, Lcom/daaw/cn1;->a(Lcom/daaw/z41;II)Lcom/daaw/z41;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-interface {p1}, Lcom/daaw/z41;->c()V

    :cond_0
    return-object p2
.end method

.method public final e([BLjava/io/OutputStream;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
