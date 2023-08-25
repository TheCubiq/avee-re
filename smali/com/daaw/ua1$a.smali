.class public Lcom/daaw/ua1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ua1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public c:[Lcom/daaw/bs1;

.field public d:[Lcom/daaw/bs1;

.field public e:Lcom/daaw/bs1;

.field public f:Lcom/daaw/bs1;

.field public g:F

.field public final synthetic h:Lcom/daaw/ua1;


# direct methods
.method public constructor <init>(Lcom/daaw/ua1;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ua1$a;->h:Lcom/daaw/ua1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/ua1$a;->b:Ljava/util/List;

    new-array p1, p2, [Lcom/daaw/bs1;

    iput-object p1, p0, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    new-array p1, p2, [Lcom/daaw/bs1;

    iput-object p1, p0, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    new-instance p1, Lcom/daaw/bs1;

    const p2, 0x461c4000    # 10000.0f

    invoke-direct {p1, p2, p2}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object p1, p0, Lcom/daaw/ua1$a;->e:Lcom/daaw/bs1;

    new-instance p1, Lcom/daaw/bs1;

    const p2, -0x39e3c000    # -10000.0f

    invoke-direct {p1, p2, p2}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object p1, p0, Lcom/daaw/ua1$a;->f:Lcom/daaw/bs1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ua1$a;->b:Ljava/util/List;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/ua1$a;->b:Ljava/util/List;

    iget-object v3, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/ua1$a;->c(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    array-length v2, v1

    if-lez v2, :cond_2

    aget-object v1, v1, v0

    iget v1, v1, Lcom/daaw/bs1;->a:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/daaw/bs1;->k()F

    move-result v1

    const v2, 0x3727c5ac    # 1.0E-5f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/ua1$a;->b(I)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    aget-object v3, v2, v0

    aget-object v4, v2, v1

    iget v4, v4, Lcom/daaw/bs1;->a:F

    iput v4, v3, Lcom/daaw/bs1;->a:F

    aget-object v0, v2, v0

    aget-object v1, v2, v1

    iget v1, v1, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/bs1;->b:F

    :cond_2
    return-void
.end method

.method public b(I)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ua1$a;->b:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    array-length v1, v0

    add-int/2addr p1, v1

    add-int/lit8 p1, p1, -0x1

    array-length v0, v0

    rem-int/2addr p1, v0

    return p1
.end method

.method public c(I)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_1
    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    array-length p1, p1

    goto :goto_1
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lcom/daaw/ua1$a;->g:F

    return v0
.end method
