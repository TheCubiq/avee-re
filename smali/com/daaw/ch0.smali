.class public abstract Lcom/daaw/ch0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(IZII)V
    .locals 6

    const/4 v3, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ch0;-><init>(IZZII)V

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/ch0;-><init>(IZZIIZ)V

    return-void
.end method

.method public constructor <init>(IZZIIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/daaw/ch0;->d:Z

    iput-boolean p3, p0, Lcom/daaw/ch0;->e:Z

    iput p1, p0, Lcom/daaw/ch0;->a:I

    iput p4, p0, Lcom/daaw/ch0;->b:I

    iput p5, p0, Lcom/daaw/ch0;->c:I

    iput-boolean p6, p0, Lcom/daaw/ch0;->f:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;Ljava/lang/Object;Lcom/daaw/l0;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/ch0;->b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public abstract b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/l0;",
            ">;)V"
        }
    .end annotation
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/ch0;->a:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/daaw/ch0;->c:I

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ch0;->d:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ch0;->e:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ch0;->f:Z

    return v0
.end method
