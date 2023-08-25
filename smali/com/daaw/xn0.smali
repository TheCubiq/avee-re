.class public Lcom/daaw/xn0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/daaw/bs1;

.field public c:Lcom/daaw/bs1;


# direct methods
.method public constructor <init>(Lcom/daaw/xn0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    iget-object v0, p1, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget-object p1, p1, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v1, p1, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/bs1;->a:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    iput p1, v0, Lcom/daaw/bs1;->b:F

    invoke-virtual {p0}, Lcom/daaw/xn0;->c()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;F)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    iput-object p1, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iput p2, p1, Lcom/daaw/bs1;->a:F

    iput p2, p1, Lcom/daaw/bs1;->b:F

    invoke-virtual {p0}, Lcom/daaw/xn0;->c()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FF)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    iput-object p1, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iput p2, p1, Lcom/daaw/bs1;->a:F

    iput p3, p1, Lcom/daaw/bs1;->b:F

    invoke-virtual {p0}, Lcom/daaw/xn0;->c()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/bs1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    iput-object p1, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, p2, Lcom/daaw/bs1;->a:F

    iput v0, p1, Lcom/daaw/bs1;->a:F

    iget p2, p2, Lcom/daaw/bs1;->b:F

    iput p2, p1, Lcom/daaw/bs1;->b:F

    invoke-virtual {p0}, Lcom/daaw/xn0;->c()V

    return-void
.end method

.method public static final a()Lcom/daaw/xn0;
    .locals 3

    new-instance v0, Lcom/daaw/xn0;

    const-string v1, "Nothing"

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {v0, v1, v2, v2}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Lcom/daaw/xn0;)Lcom/daaw/xn0;
    .locals 5

    const-string v0, " "

    const/4 v1, 0x0

    if-nez p0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/xn0;->d()Lcom/daaw/xn0;

    move-result-object v1

    :cond_0
    return-object v1

    :cond_1
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    if-ltz v2, :cond_3

    if-gez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lcom/daaw/xn0;

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-direct {v0, v2, v3, p0}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    return-object v0

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/daaw/xn0;->d()Lcom/daaw/xn0;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-object v1

    :catch_0
    nop

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/daaw/xn0;->d()Lcom/daaw/xn0;

    move-result-object v1

    :cond_5
    return-object v1
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    :cond_0
    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/xn0;->d()Lcom/daaw/xn0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/daaw/xn0;
    .locals 4

    new-instance v0, Lcom/daaw/xn0;

    iget-object v1, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    invoke-direct {v0, v1, v3, v2}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public f()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->a:F

    return v0
.end method

.method public g()Lcom/daaw/bs1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    return-object v0
.end method

.method public h(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->a(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    return-object p1
.end method

.method public i(Lcom/daaw/aq0;)F
    .locals 3

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget-object v2, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/aq0;->n(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    iget p1, p1, Lcom/daaw/bs1;->a:F

    return p1
.end method

.method public j(Lcom/daaw/aq0;F)F
    .locals 2

    iget-object v0, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    iput p2, v0, Lcom/daaw/bs1;->a:F

    iput p2, v0, Lcom/daaw/bs1;->b:F

    iget-object p2, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    invoke-virtual {p1, p2, v1, v0}, Lcom/daaw/aq0;->n(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    iget p1, p1, Lcom/daaw/bs1;->a:F

    return p1
.end method

.method public k(Lcom/daaw/aq0;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/daaw/aq0;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l(Lcom/daaw/aq0;)Lcom/daaw/bs1;
    .locals 3

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget-object v2, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/aq0;->n(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xn0;->c:Lcom/daaw/bs1;

    return-object p1
.end method

.method public m(Lcom/daaw/un;Ljava/lang/String;F)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p3}, Lcom/daaw/xn0;->n(Lcom/daaw/un;Ljava/lang/String;FF)V

    return-void
.end method

.method public n(Lcom/daaw/un;Ljava/lang/String;FF)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "measureWhat"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    iget-object p2, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    const-string v0, "A"

    invoke-virtual {p1, v0, p3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p3

    iput p3, p2, Lcom/daaw/bs1;->a:F

    iget-object p2, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    const-string p3, "B"

    invoke-virtual {p1, p3, p4}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    iput p1, p2, Lcom/daaw/bs1;->b:F

    invoke-virtual {p0}, Lcom/daaw/xn0;->c()V

    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    sget-object v1, Lcom/daaw/wn0;->c:[Ljava/lang/String;

    const-string v2, "measureWhat"

    const-string v3, "misc"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v1, "Nothing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->a:F

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public p(Lcom/daaw/un;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v1, "Nothing"

    const-string v2, "BeatCamShakeMore"

    const-string v3, "BeatCamShakeLess"

    const-string v4, "BeatRandomShake"

    const-string v5, "ConstantShakeMore"

    const-string v6, "ConstantShake"

    const-string v7, "TrackPosition"

    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "measureWhat"

    const-string v3, "misc"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v1, "Nothing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->a:F

    const/4 v5, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public q(Lcom/daaw/un;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    sget-object v1, Lcom/daaw/wn0;->c:[Ljava/lang/String;

    const-string v2, "measureWhat"

    const-string v3, "misc"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v1, "Nothing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->a:F

    const/high16 v5, -0x40800000    # -1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public r(Lcom/daaw/un;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    sget-object v1, Lcom/daaw/wn0;->c:[Ljava/lang/String;

    const-string v2, "measureWhat"

    const-string v3, "misc"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v1, "Nothing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->a:F

    const/4 v5, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "A"

    const-string v4, "misc"

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "B"

    const-string v4, "misc"

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/un;->P(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public s(Ljava/lang/StringBuilder;ZLandroid/content/Context;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v1, "Constant"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ")"

    const-string v2, "("

    const-string v3, " "

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v6, "%.3f"

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v7, "Nothing"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/xn0;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p3, v5, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->a:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v4

    invoke-static {p2, v6, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p3, v5, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v4

    invoke-static {p2, v6, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p3, v5, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->a:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v4

    invoke-static {p2, v6, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p3, v5, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v4

    invoke-static {p2, v6, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p3, v5, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->a:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v4

    invoke-static {p2, v6, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p3, v5, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v4

    invoke-static {p2, v6, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public t(Ljava/lang/StringBuilder;ZLandroid/content/Context;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/wn0;->d(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v2, "Constant"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, ")"

    const-string v3, "("

    const-string v4, " "

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v7, "%.3f"

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const-string v8, "Nothing"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/xn0;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p3, v6, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v1, v1, Lcom/daaw/bs1;->a:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, p3, v5

    invoke-static {p2, v7, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p3, v6, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v5

    invoke-static {p2, v7, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p3, v6, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v1, v1, Lcom/daaw/bs1;->a:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, p3, v5

    invoke-static {p2, v7, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p3, v6, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v5

    invoke-static {p2, v7, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p3, v6, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v1, v1, Lcom/daaw/bs1;->a:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, p3, v5

    invoke-static {p2, v7, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p3, v6, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, p3, v5

    invoke-static {p2, v7, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v2, v2, Lcom/daaw/bs1;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v2, v2, Lcom/daaw/bs1;->b:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "%s %f %f"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/StringBuilder;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xn0;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v1, v1, Lcom/daaw/bs1;->a:F

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/xn0;->b:Lcom/daaw/bs1;

    iget v0, v0, Lcom/daaw/bs1;->b:F

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    return-void
.end method
