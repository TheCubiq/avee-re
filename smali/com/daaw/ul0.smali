.class public Lcom/daaw/ul0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bc;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ul0$c;,
        Lcom/daaw/ul0$b;
    }
.end annotation


# static fields
.field public static final k:Landroid/graphics/Bitmap$Config;


# instance fields
.field public final a:Lcom/daaw/xl0;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/graphics/Bitmap$Config;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:Lcom/daaw/ul0$b;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lcom/daaw/ul0;->k:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-static {}, Lcom/daaw/ul0;->j()Lcom/daaw/xl0;

    move-result-object v0

    invoke-static {}, Lcom/daaw/ul0;->i()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/ul0;-><init>(ILcom/daaw/xl0;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/xl0;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/xl0;",
            "Ljava/util/Set<",
            "Landroid/graphics/Bitmap$Config;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/ul0;->c:I

    iput p1, p0, Lcom/daaw/ul0;->e:I

    iput-object p2, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    iput-object p3, p0, Lcom/daaw/ul0;->b:Ljava/util/Set;

    new-instance p1, Lcom/daaw/ul0$c;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/daaw/ul0$c;-><init>(Lcom/daaw/ul0$a;)V

    iput-object p1, p0, Lcom/daaw/ul0;->d:Lcom/daaw/ul0$b;

    return-void
.end method

.method public static i()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroid/graphics/Bitmap$Config;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {}, Landroid/graphics/Bitmap$Config;->values()[Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static j()Lcom/daaw/xl0;
    .locals 1

    new-instance v0, Lcom/daaw/rd1;

    invoke-direct {v0}, Lcom/daaw/rd1;-><init>()V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Landroid/graphics/Bitmap;)Z
    .locals 4

    monitor-enter p0

    if-eqz p1, :cond_4

    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v0, p1}, Lcom/daaw/xl0;->e(Landroid/graphics/Bitmap;)I

    move-result v0

    iget v2, p0, Lcom/daaw/ul0;->e:I

    if-gt v0, v2, :cond_2

    iget-object v0, p0, Lcom/daaw/ul0;->b:Ljava/util/Set;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v0, p1}, Lcom/daaw/xl0;->e(Landroid/graphics/Bitmap;)I

    move-result v0

    iget-object v2, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v2, p1}, Lcom/daaw/xl0;->a(Landroid/graphics/Bitmap;)V

    iget-object v2, p0, Lcom/daaw/ul0;->d:Lcom/daaw/ul0$b;

    invoke-interface {v2, p1}, Lcom/daaw/ul0$b;->b(Landroid/graphics/Bitmap;)V

    iget v2, p0, Lcom/daaw/ul0;->i:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p0, Lcom/daaw/ul0;->i:I

    iget v2, p0, Lcom/daaw/ul0;->f:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/daaw/ul0;->f:I

    const-string v0, "LruBitmapPool"

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Put bitmap in pool="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v1, p1}, Lcom/daaw/xl0;->f(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ul0;->f()V

    invoke-virtual {p0}, Lcom/daaw/ul0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v3

    :cond_2
    :goto_0
    :try_start_1
    const-string v0, "LruBitmapPool"

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reject bitmap from pool, bitmap: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v1, p1}, Lcom/daaw/xl0;->f(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", is mutable: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", is allowed config: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ul0;->b:Ljava/util/Set;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    const/4 p1, 0x0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Bitmap must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ul0;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/graphics/Bitmap;->eraseColor(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c(I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const-string v0, "LruBitmapPool"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "trimMemory, level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v0, 0x3c

    if-lt p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ul0;->d()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    iget p1, p0, Lcom/daaw/ul0;->e:I

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/daaw/ul0;->k(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/ul0;->k(I)V

    return-void
.end method

.method public declared-synchronized e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xc
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    if-eqz p3, :cond_0

    move-object v1, p3

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/ul0;->k:Landroid/graphics/Bitmap$Config;

    :goto_0
    invoke-interface {v0, p1, p2, v1}, Lcom/daaw/xl0;->b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    const-string v2, "LruBitmapPool"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing bitmap="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v3, p1, p2, p3}, Lcom/daaw/xl0;->d(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget v2, p0, Lcom/daaw/ul0;->h:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/daaw/ul0;->h:I

    goto :goto_1

    :cond_2
    iget v2, p0, Lcom/daaw/ul0;->g:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/daaw/ul0;->g:I

    iget v2, p0, Lcom/daaw/ul0;->f:I

    iget-object v3, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v3, v0}, Lcom/daaw/xl0;->e(Landroid/graphics/Bitmap;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/daaw/ul0;->f:I

    iget-object v2, p0, Lcom/daaw/ul0;->d:Lcom/daaw/ul0$b;

    invoke-interface {v2, v0}, Lcom/daaw/ul0$b;->a(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    :goto_1
    const-string v1, "LruBitmapPool"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get bitmap="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v2, p1, p2, p3}, Lcom/daaw/xl0;->d(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/ul0;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final f()V
    .locals 2

    const-string v0, "LruBitmapPool"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ul0;->g()V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Hits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ul0;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", misses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ul0;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", puts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ul0;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", evictions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ul0;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ul0;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ul0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nStrategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final h()V
    .locals 1

    iget v0, p0, Lcom/daaw/ul0;->e:I

    invoke-virtual {p0, v0}, Lcom/daaw/ul0;->k(I)V

    return-void
.end method

.method public final declared-synchronized k(I)V
    .locals 3

    monitor-enter p0

    :goto_0
    :try_start_0
    iget v0, p0, Lcom/daaw/ul0;->f:I

    if-le v0, p1, :cond_3

    iget-object v0, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v0}, Lcom/daaw/xl0;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p1, "LruBitmapPool"

    const/4 v0, 0x5

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ul0;->g()V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/ul0;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/daaw/ul0;->d:Lcom/daaw/ul0$b;

    invoke-interface {v1, v0}, Lcom/daaw/ul0$b;->a(Landroid/graphics/Bitmap;)V

    iget v1, p0, Lcom/daaw/ul0;->f:I

    iget-object v2, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v2, v0}, Lcom/daaw/xl0;->e(Landroid/graphics/Bitmap;)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/ul0;->f:I

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    iget v1, p0, Lcom/daaw/ul0;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/ul0;->j:I

    const-string v1, "LruBitmapPool"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Evicting bitmap="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/ul0;->a:Lcom/daaw/xl0;

    invoke-interface {v2, v0}, Lcom/daaw/xl0;->f(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/ul0;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
