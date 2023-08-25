.class public Lcom/daaw/n60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/n60$b;,
        Lcom/daaw/n60$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Lcom/daaw/jf0;",
        "Lcom/daaw/k60;",
        ">;"
    }
.end annotation


# static fields
.field public static final g:Lcom/daaw/n60$b;

.field public static final h:Lcom/daaw/n60$a;


# instance fields
.field public final a:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/bc;

.field public final d:Lcom/daaw/n60$b;

.field public final e:Lcom/daaw/n60$a;

.field public f:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/n60$b;

    invoke-direct {v0}, Lcom/daaw/n60$b;-><init>()V

    sput-object v0, Lcom/daaw/n60;->g:Lcom/daaw/n60$b;

    new-instance v0, Lcom/daaw/n60$a;

    invoke-direct {v0}, Lcom/daaw/n60$a;-><init>()V

    sput-object v0, Lcom/daaw/n60;->h:Lcom/daaw/n60$a;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/d51;Lcom/daaw/d51;Lcom/daaw/bc;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Lcom/daaw/s60;",
            ">;",
            "Lcom/daaw/bc;",
            ")V"
        }
    .end annotation

    sget-object v4, Lcom/daaw/n60;->g:Lcom/daaw/n60$b;

    sget-object v5, Lcom/daaw/n60;->h:Lcom/daaw/n60$a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/n60;-><init>(Lcom/daaw/d51;Lcom/daaw/d51;Lcom/daaw/bc;Lcom/daaw/n60$b;Lcom/daaw/n60$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/d51;Lcom/daaw/d51;Lcom/daaw/bc;Lcom/daaw/n60$b;Lcom/daaw/n60$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Lcom/daaw/s60;",
            ">;",
            "Lcom/daaw/bc;",
            "Lcom/daaw/n60$b;",
            "Lcom/daaw/n60$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n60;->a:Lcom/daaw/d51;

    iput-object p2, p0, Lcom/daaw/n60;->b:Lcom/daaw/d51;

    iput-object p3, p0, Lcom/daaw/n60;->c:Lcom/daaw/bc;

    iput-object p4, p0, Lcom/daaw/n60;->d:Lcom/daaw/n60$b;

    iput-object p5, p0, Lcom/daaw/n60;->e:Lcom/daaw/n60$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/jf0;II[B)Lcom/daaw/k60;
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/jf0;->b()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/n60;->f(Lcom/daaw/jf0;II[B)Lcom/daaw/k60;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/n60;->d(Lcom/daaw/jf0;II)Lcom/daaw/k60;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b(Lcom/daaw/jf0;II)Lcom/daaw/z41;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jf0;",
            "II)",
            "Lcom/daaw/z41<",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/bd;->a()Lcom/daaw/bd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/bd;->b()[B

    move-result-object v1

    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/daaw/n60;->a(Lcom/daaw/jf0;II[B)Lcom/daaw/k60;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1}, Lcom/daaw/bd;->c([B)Z

    if-eqz p1, :cond_0

    new-instance p2, Lcom/daaw/m60;

    invoke-direct {p2, p1}, Lcom/daaw/m60;-><init>(Lcom/daaw/k60;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v1}, Lcom/daaw/bd;->c([B)Z

    throw p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Lcom/daaw/jf0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/n60;->b(Lcom/daaw/jf0;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/jf0;II)Lcom/daaw/k60;
    .locals 1

    iget-object v0, p0, Lcom/daaw/n60;->a:Lcom/daaw/d51;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    new-instance p3, Lcom/daaw/k60;

    invoke-direct {p3, p1, p2}, Lcom/daaw/k60;-><init>(Lcom/daaw/z41;Lcom/daaw/z41;)V

    move-object p2, p3

    :cond_0
    return-object p2
.end method

.method public final e(Ljava/io/InputStream;II)Lcom/daaw/k60;
    .locals 2

    iget-object v0, p0, Lcom/daaw/n60;->b:Lcom/daaw/d51;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/s60;

    invoke-virtual {p3}, Lcom/daaw/s60;->g()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    new-instance p3, Lcom/daaw/k60;

    invoke-direct {p3, p2, p1}, Lcom/daaw/k60;-><init>(Lcom/daaw/z41;Lcom/daaw/z41;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/dc;

    invoke-virtual {p3}, Lcom/daaw/s60;->f()Landroid/graphics/Bitmap;

    move-result-object p3

    iget-object v0, p0, Lcom/daaw/n60;->c:Lcom/daaw/bc;

    invoke-direct {p1, p3, v0}, Lcom/daaw/dc;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/bc;)V

    new-instance p3, Lcom/daaw/k60;

    invoke-direct {p3, p1, p2}, Lcom/daaw/k60;-><init>(Lcom/daaw/z41;Lcom/daaw/z41;)V

    :goto_0
    move-object p2, p3

    :cond_1
    return-object p2
.end method

.method public final f(Lcom/daaw/jf0;II[B)Lcom/daaw/k60;
    .locals 2

    iget-object v0, p0, Lcom/daaw/n60;->e:Lcom/daaw/n60$a;

    invoke-virtual {p1}, Lcom/daaw/jf0;->b()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Lcom/daaw/n60$a;->a(Ljava/io/InputStream;[B)Ljava/io/InputStream;

    move-result-object p4

    const/16 v0, 0x800

    invoke-virtual {p4, v0}, Ljava/io/InputStream;->mark(I)V

    iget-object v0, p0, Lcom/daaw/n60;->d:Lcom/daaw/n60$b;

    invoke-virtual {v0, p4}, Lcom/daaw/n60$b;->a(Ljava/io/InputStream;)Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    move-result-object v0

    invoke-virtual {p4}, Ljava/io/InputStream;->reset()V

    sget-object v1, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p4, p2, p3}, Lcom/daaw/n60;->e(Ljava/io/InputStream;II)Lcom/daaw/k60;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/jf0;

    invoke-virtual {p1}, Lcom/daaw/jf0;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    invoke-direct {v0, p4, p1}, Lcom/daaw/jf0;-><init>(Ljava/io/InputStream;Landroid/os/ParcelFileDescriptor;)V

    invoke-virtual {p0, v0, p2, p3}, Lcom/daaw/n60;->d(Lcom/daaw/jf0;II)Lcom/daaw/k60;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/n60;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/n60;->b:Lcom/daaw/d51;

    invoke-interface {v1}, Lcom/daaw/d51;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/n60;->a:Lcom/daaw/d51;

    invoke-interface {v1}, Lcom/daaw/d51;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/n60;->f:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/daaw/n60;->f:Ljava/lang/String;

    return-object v0
.end method
