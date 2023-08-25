.class public Lcom/daaw/c70;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/c70$b;,
        Lcom/daaw/c70$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Ljava/io/InputStream;",
        "Lcom/daaw/s60;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Lcom/daaw/c70$b;

.field public static final g:Lcom/daaw/c70$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/c70$b;

.field public final c:Lcom/daaw/bc;

.field public final d:Lcom/daaw/c70$a;

.field public final e:Lcom/daaw/j60;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/c70$b;

    invoke-direct {v0}, Lcom/daaw/c70$b;-><init>()V

    sput-object v0, Lcom/daaw/c70;->f:Lcom/daaw/c70$b;

    new-instance v0, Lcom/daaw/c70$a;

    invoke-direct {v0}, Lcom/daaw/c70$a;-><init>()V

    sput-object v0, Lcom/daaw/c70;->g:Lcom/daaw/c70$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/bc;)V
    .locals 2

    sget-object v0, Lcom/daaw/c70;->f:Lcom/daaw/c70$b;

    sget-object v1, Lcom/daaw/c70;->g:Lcom/daaw/c70$a;

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/daaw/c70;-><init>(Landroid/content/Context;Lcom/daaw/bc;Lcom/daaw/c70$b;Lcom/daaw/c70$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/bc;Lcom/daaw/c70$b;Lcom/daaw/c70$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/c70;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/c70;->c:Lcom/daaw/bc;

    iput-object p4, p0, Lcom/daaw/c70;->d:Lcom/daaw/c70$a;

    new-instance p1, Lcom/daaw/j60;

    invoke-direct {p1, p2}, Lcom/daaw/j60;-><init>(Lcom/daaw/bc;)V

    iput-object p1, p0, Lcom/daaw/c70;->e:Lcom/daaw/j60;

    iput-object p3, p0, Lcom/daaw/c70;->b:Lcom/daaw/c70$b;

    return-void
.end method

.method public static e(Ljava/io/InputStream;)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :try_start_0
    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/io/InputStream;II)Lcom/daaw/u60;
    .locals 7

    invoke-static {p1}, Lcom/daaw/c70;->e(Ljava/io/InputStream;)[B

    move-result-object v1

    iget-object p1, p0, Lcom/daaw/c70;->b:Lcom/daaw/c70$b;

    invoke-virtual {p1, v1}, Lcom/daaw/c70$b;->a([B)Lcom/daaw/b70;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/c70;->d:Lcom/daaw/c70$a;

    iget-object v2, p0, Lcom/daaw/c70;->e:Lcom/daaw/j60;

    invoke-virtual {v0, v2}, Lcom/daaw/c70$a;->a(Lcom/daaw/r60$a;)Lcom/daaw/r60;

    move-result-object v6

    move-object v0, p0

    move v2, p2

    move v3, p3

    move-object v4, p1

    move-object v5, v6

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/c70;->b([BIILcom/daaw/b70;Lcom/daaw/r60;)Lcom/daaw/u60;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p3, p0, Lcom/daaw/c70;->b:Lcom/daaw/c70$b;

    invoke-virtual {p3, p1}, Lcom/daaw/c70$b;->b(Lcom/daaw/b70;)V

    iget-object p1, p0, Lcom/daaw/c70;->d:Lcom/daaw/c70$a;

    invoke-virtual {p1, v6}, Lcom/daaw/c70$a;->b(Lcom/daaw/r60;)V

    return-object p2

    :catchall_0
    move-exception p2

    iget-object p3, p0, Lcom/daaw/c70;->b:Lcom/daaw/c70$b;

    invoke-virtual {p3, p1}, Lcom/daaw/c70$b;->b(Lcom/daaw/b70;)V

    iget-object p1, p0, Lcom/daaw/c70;->d:Lcom/daaw/c70$a;

    invoke-virtual {p1, v6}, Lcom/daaw/c70$a;->b(Lcom/daaw/r60;)V

    throw p2
.end method

.method public final b([BIILcom/daaw/b70;Lcom/daaw/r60;)Lcom/daaw/u60;
    .locals 10

    invoke-virtual {p4}, Lcom/daaw/b70;->c()Lcom/daaw/a70;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/a70;->a()I

    move-result p4

    const/4 v0, 0x0

    if-lez p4, :cond_2

    invoke-virtual {v7}, Lcom/daaw/a70;->b()I

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p5, v7, p1}, Lcom/daaw/c70;->d(Lcom/daaw/r60;Lcom/daaw/a70;[B)Landroid/graphics/Bitmap;

    move-result-object v9

    if-nez v9, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lcom/daaw/np1;->b()Lcom/daaw/np1;

    move-result-object v4

    new-instance p4, Lcom/daaw/s60;

    iget-object v1, p0, Lcom/daaw/c70;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/c70;->e:Lcom/daaw/j60;

    iget-object v3, p0, Lcom/daaw/c70;->c:Lcom/daaw/bc;

    move-object v0, p4

    move v5, p2

    move v6, p3

    move-object v8, p1

    invoke-direct/range {v0 .. v9}, Lcom/daaw/s60;-><init>(Landroid/content/Context;Lcom/daaw/r60$a;Lcom/daaw/bc;Lcom/daaw/cn1;IILcom/daaw/a70;[BLandroid/graphics/Bitmap;)V

    new-instance p1, Lcom/daaw/u60;

    invoke-direct {p1, p4}, Lcom/daaw/u60;-><init>(Lcom/daaw/s60;)V

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/c70;->a(Ljava/io/InputStream;II)Lcom/daaw/u60;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/r60;Lcom/daaw/a70;[B)Landroid/graphics/Bitmap;
    .locals 0

    invoke-virtual {p1, p2, p3}, Lcom/daaw/r60;->o(Lcom/daaw/a70;[B)V

    invoke-virtual {p1}, Lcom/daaw/r60;->a()V

    invoke-virtual {p1}, Lcom/daaw/r60;->i()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
