.class public Lcom/daaw/ie1$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ie1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public a:Lcom/daaw/er0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/er0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/er0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/er0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs a([I)Lcom/daaw/ie1$i;
    .locals 4

    new-instance v0, Lcom/daaw/ie1$i;

    invoke-direct {v0}, Lcom/daaw/ie1$i;-><init>()V

    new-instance v1, Lcom/daaw/er0;

    invoke-direct {v1}, Lcom/daaw/er0;-><init>()V

    iput-object v1, v0, Lcom/daaw/ie1$i;->a:Lcom/daaw/er0;

    iget-object v1, p0, Lcom/daaw/ie1$i;->a:Lcom/daaw/er0;

    invoke-virtual {v1}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/lo1;

    iget-object v3, v2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {p1, v3}, Lcom/daaw/ie1;->b([II)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/daaw/ie1$i;->a:Lcom/daaw/er0;

    invoke-virtual {v3, v2}, Lcom/daaw/er0;->e(Lcom/daaw/lo1;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/ie1$i;->b:Lcom/daaw/er0;

    iput-object p1, v0, Lcom/daaw/ie1$i;->b:Lcom/daaw/er0;

    iget p1, p0, Lcom/daaw/ie1$i;->c:I

    iput p1, v0, Lcom/daaw/ie1$i;->c:I

    iget p1, p0, Lcom/daaw/ie1$i;->d:I

    iput p1, v0, Lcom/daaw/ie1$i;->d:I

    return-object v0
.end method

.method public varargs b([Lcom/daaw/lo1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/lo1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0;

    invoke-direct {v0}, Lcom/daaw/er0;-><init>()V

    iput-object v0, p0, Lcom/daaw/ie1$i;->a:Lcom/daaw/er0;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, Lcom/daaw/ie1$i;->a:Lcom/daaw/er0;

    invoke-virtual {v3, v2}, Lcom/daaw/er0;->e(Lcom/daaw/lo1;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
