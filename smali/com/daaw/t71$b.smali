.class public Lcom/daaw/t71$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t71$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/t71;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/la1;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/es1;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/t71$b;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/t71$b;->b:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/t71$b;->c:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t71$b;->d:F

    iput v0, p0, Lcom/daaw/t71$b;->e:F

    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 1

    iget v0, p0, Lcom/daaw/t71$b;->d:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/t71$b;->d:F

    iget p1, p0, Lcom/daaw/t71$b;->e:F

    add-float/2addr p1, p2

    iput p1, p0, Lcom/daaw/t71$b;->e:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/t71$b;->c:Z

    return-void
.end method

.method public b(FF)V
    .locals 0

    iput p1, p0, Lcom/daaw/t71$b;->d:F

    iput p2, p0, Lcom/daaw/t71$b;->e:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/t71$b;->c:Z

    return-void
.end method

.method public c(FFFFFF)V
    .locals 0

    return-void
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/t71$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/t71$b;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/la1;

    iget-object v2, p0, Lcom/daaw/t71$b;->b:Ljava/util/List;

    invoke-direct {v1, v2}, Lcom/daaw/la1;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/t71$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/t71$b;->c:Z

    return-void
.end method

.method public d(FF)V
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/t71$b;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t71$b;->d:F

    iput v0, p0, Lcom/daaw/t71$b;->e:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/t71$b;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/t71$b;->b:Ljava/util/List;

    new-instance v1, Lcom/daaw/es1;

    iget v2, p0, Lcom/daaw/t71$b;->d:F

    iget v3, p0, Lcom/daaw/t71$b;->e:F

    add-float v4, v2, p1

    add-float v5, v3, p2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/daaw/es1;-><init>(FFFF)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v0, p0, Lcom/daaw/t71$b;->d:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/t71$b;->d:F

    iget p1, p0, Lcom/daaw/t71$b;->e:F

    add-float/2addr p1, p2

    iput p1, p0, Lcom/daaw/t71$b;->e:F

    return-void
.end method

.method public e(FF)V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/t71$b;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t71$b;->d:F

    iput v0, p0, Lcom/daaw/t71$b;->e:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/t71$b;->c:Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/t71$b;->b:Ljava/util/List;

    new-instance v1, Lcom/daaw/es1;

    iget v2, p0, Lcom/daaw/t71$b;->d:F

    iget v3, p0, Lcom/daaw/t71$b;->e:F

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/daaw/es1;-><init>(FFFF)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p1, p0, Lcom/daaw/t71$b;->d:F

    iput p2, p0, Lcom/daaw/t71$b;->e:F

    return-void
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/la1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/t71$b;->a:Ljava/util/List;

    return-object v0
.end method
