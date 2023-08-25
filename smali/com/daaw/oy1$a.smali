.class public abstract Lcom/daaw/oy1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/oy1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:",
        "Lcom/daaw/oy1$a<",
        "**>;W:",
        "Lcom/daaw/oy1;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/util/UUID;

.field public c:Lcom/daaw/qy1;

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/oy1$a;->a:Z

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/oy1$a;->d:Ljava/util/Set;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/oy1$a;->b:Ljava/util/UUID;

    iput-object p1, p0, Lcom/daaw/oy1$a;->e:Ljava/lang/Class;

    new-instance v0, Lcom/daaw/qy1;

    iget-object v1, p0, Lcom/daaw/oy1$a;->b:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/qy1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/oy1$a;->a(Ljava/lang/String;)Lcom/daaw/oy1$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/daaw/oy1$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TB;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/oy1$a;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/daaw/oy1$a;->d()Lcom/daaw/oy1$a;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/daaw/oy1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TW;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/oy1$a;->c()Lcom/daaw/oy1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    iget-object v1, v1, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/daaw/sj;->e()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/sj;->f()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1}, Lcom/daaw/sj;->g()Z

    move-result v3

    if-nez v3, :cond_2

    const/16 v3, 0x17

    if-lt v2, v3, :cond_1

    invoke-virtual {v1}, Lcom/daaw/sj;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iget-object v2, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    iget-boolean v2, v2, Lcom/daaw/qy1;->q:Z

    if-eqz v2, :cond_4

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expedited jobs only support network and storage constraints"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/oy1$a;->b:Ljava/util/UUID;

    new-instance v1, Lcom/daaw/qy1;

    iget-object v2, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    invoke-direct {v1, v2}, Lcom/daaw/qy1;-><init>(Lcom/daaw/qy1;)V

    iput-object v1, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    iget-object v2, p0, Lcom/daaw/oy1$a;->b:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/daaw/qy1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public abstract c()Lcom/daaw/oy1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TW;"
        }
    .end annotation
.end method

.method public abstract d()Lcom/daaw/oy1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation
.end method

.method public final e(Lcom/daaw/sj;)Lcom/daaw/oy1$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/sj;",
            ")TB;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    iput-object p1, v0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {p0}, Lcom/daaw/oy1$a;->d()Lcom/daaw/oy1$a;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroidx/work/b;)Lcom/daaw/oy1$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/b;",
            ")TB;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/oy1$a;->c:Lcom/daaw/qy1;

    iput-object p1, v0, Lcom/daaw/qy1;->e:Landroidx/work/b;

    invoke-virtual {p0}, Lcom/daaw/oy1$a;->d()Lcom/daaw/oy1$a;

    move-result-object p1

    return-object p1
.end method
