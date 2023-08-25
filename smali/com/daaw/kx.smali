.class public Lcom/daaw/kx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/z41;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/kx$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/z41<",
        "TZ;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/z41;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z41<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public final b:Z

.field public c:Lcom/daaw/kx$a;

.field public d:Lcom/daaw/hi0;

.field public e:I

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/daaw/z41;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TZ;>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Wrapped resource must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/kx;->a:Lcom/daaw/z41;

    iput-boolean p2, p0, Lcom/daaw/kx;->b:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/kx;->a:Lcom/daaw/z41;

    invoke-interface {v0}, Lcom/daaw/z41;->a()I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/kx;->f:Z

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/kx;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/kx;->e:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalThreadStateException;

    const-string v1, "Must call acquire on the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalThreadStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot acquire a recycled resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()V
    .locals 2

    iget v0, p0, Lcom/daaw/kx;->e:I

    if-gtz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/kx;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/kx;->f:Z

    iget-object v0, p0, Lcom/daaw/kx;->a:Lcom/daaw/z41;

    invoke-interface {v0}, Lcom/daaw/z41;->c()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot recycle a resource that has already been recycled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot recycle a resource while it is still acquired"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/kx;->b:Z

    return v0
.end method

.method public e()V
    .locals 2

    iget v0, p0, Lcom/daaw/kx;->e:I

    if-lez v0, :cond_2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/kx;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/kx;->e:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kx;->c:Lcom/daaw/kx$a;

    iget-object v1, p0, Lcom/daaw/kx;->d:Lcom/daaw/hi0;

    invoke-interface {v0, v1, p0}, Lcom/daaw/kx$a;->c(Lcom/daaw/hi0;Lcom/daaw/kx;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalThreadStateException;

    const-string v1, "Must call release on the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalThreadStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot release a recycled or not yet acquired resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Lcom/daaw/hi0;Lcom/daaw/kx$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kx;->d:Lcom/daaw/hi0;

    iput-object p2, p0, Lcom/daaw/kx;->c:Lcom/daaw/kx$a;

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TZ;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/kx;->a:Lcom/daaw/z41;

    invoke-interface {v0}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
