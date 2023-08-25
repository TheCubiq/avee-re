.class public Lcom/daaw/dm0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/xn0;",
            ">;"
        }
    .end annotation
.end field

.field public b:F


# direct methods
.method public constructor <init>(Lcom/daaw/dm0;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dm0;->b:F

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    new-instance v2, Lcom/daaw/xn0;

    iget-object v3, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xn0;

    invoke-direct {v2, v3}, Lcom/daaw/xn0;-><init>(Lcom/daaw/xn0;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/daaw/dm0;II)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dm0;->b:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    if-gt p3, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    new-instance v2, Lcom/daaw/xn0;

    iget-object v3, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xn0;

    invoke-direct {v2, v3}, Lcom/daaw/xn0;-><init>(Lcom/daaw/xn0;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Lcom/daaw/dm0;Lcom/daaw/xn0;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dm0;->b:F

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    new-instance v2, Lcom/daaw/xn0;

    iget-object v3, p1, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xn0;

    invoke-direct {v2, v3}, Lcom/daaw/xn0;-><init>(Lcom/daaw/xn0;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    new-instance v0, Lcom/daaw/xn0;

    invoke-direct {v0, p2}, Lcom/daaw/xn0;-><init>(Lcom/daaw/xn0;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Lcom/daaw/xn0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dm0;->b:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/xn0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dm0;->b:F

    iput-object p1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    return-void
.end method

.method public static a(F)Lcom/daaw/dm0;
    .locals 3

    new-instance v0, Lcom/daaw/dm0;

    new-instance v1, Lcom/daaw/xn0;

    const-string v2, "Constant"

    invoke-direct {v1, v2, p0}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;F)V

    invoke-direct {v0, v1}, Lcom/daaw/dm0;-><init>(Lcom/daaw/xn0;)V

    return-object v0
.end method

.method public static b(FF)Lcom/daaw/dm0;
    .locals 3

    new-instance v0, Lcom/daaw/dm0;

    new-instance v1, Lcom/daaw/xn0;

    const-string v2, "Constant"

    invoke-direct {v1, v2, p0, p1}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    invoke-direct {v0, v1}, Lcom/daaw/dm0;-><init>(Lcom/daaw/xn0;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;
    .locals 4

    const-string v0, ";"

    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    aget-object v2, p0, v1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/daaw/xn0;->b(Ljava/lang/String;Lcom/daaw/xn0;)Lcom/daaw/xn0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    if-gtz p0, :cond_2

    return-object p1

    :cond_2
    new-instance p0, Lcom/daaw/dm0;

    invoke-direct {p0, v0}, Lcom/daaw/dm0;-><init>(Ljava/util/List;)V

    return-object p0
.end method


# virtual methods
.method public d(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v1, v3, :cond_1

    const/4 v1, 0x0

    :goto_0
    iget-object v4, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/xn0;

    invoke-virtual {v4, v0, v2, p1}, Lcom/daaw/xn0;->s(Ljava/lang/StringBuilder;ZLandroid/content/Context;)V

    add-int/2addr v1, v3

    iget-object v4, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lt v1, v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "+"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xn0;

    invoke-virtual {v1, v0, v3, p1}, Lcom/daaw/xn0;->s(Ljava/lang/StringBuilder;ZLandroid/content/Context;)V

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v1, v3, :cond_1

    const/4 v1, 0x0

    :goto_0
    iget-object v4, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/xn0;

    invoke-virtual {v4, v0, v2, p1}, Lcom/daaw/xn0;->t(Ljava/lang/StringBuilder;ZLandroid/content/Context;)V

    add-int/2addr v1, v3

    iget-object v4, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lt v1, v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "+"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xn0;

    invoke-virtual {v1, v0, v3, p1}, Lcom/daaw/xn0;->t(Ljava/lang/StringBuilder;ZLandroid/content/Context;)V

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f()F
    .locals 4

    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v0, v3, :cond_1

    :goto_0
    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/xn0;

    invoke-virtual {v0}, Lcom/daaw/xn0;->f()F

    move-result v0

    add-float/2addr v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v2, v0

    return v2

    :cond_1
    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/xn0;

    invoke-virtual {v0}, Lcom/daaw/xn0;->f()F

    move-result v0

    return v0

    :cond_2
    return v2
.end method

.method public g(I)Lcom/daaw/xn0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/xn0;

    return-object p1
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public i(Lcom/daaw/aq0;)F
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dm0;->b:F

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xn0;

    iget v2, p0, Lcom/daaw/dm0;->b:F

    invoke-virtual {v1, p1}, Lcom/daaw/xn0;->i(Lcom/daaw/aq0;)F

    move-result v1

    add-float/2addr v2, v1

    iput v2, p0, Lcom/daaw/dm0;->b:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/dm0;->b:F

    return p1
.end method

.method public j(Lcom/daaw/aq0;Lcom/daaw/bs1;)Lcom/daaw/bs1;
    .locals 4

    const/4 v0, 0x0

    iput v0, p2, Lcom/daaw/bs1;->a:F

    iput v0, p2, Lcom/daaw/bs1;->b:F

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xn0;

    invoke-virtual {v1, p1}, Lcom/daaw/xn0;->l(Lcom/daaw/aq0;)Lcom/daaw/bs1;

    move-result-object v1

    iget v2, p2, Lcom/daaw/bs1;->a:F

    iget v3, v1, Lcom/daaw/bs1;->a:F

    add-float/2addr v2, v3

    iput v2, p2, Lcom/daaw/bs1;->a:F

    iget v2, p2, Lcom/daaw/bs1;->b:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    add-float/2addr v2, v1

    iput v2, p2, Lcom/daaw/bs1;->b:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method public k(ILcom/daaw/xn0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/xn0;

    invoke-virtual {v2, v0}, Lcom/daaw/xn0;->u(Ljava/lang/StringBuilder;)V

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/daaw/dm0;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
