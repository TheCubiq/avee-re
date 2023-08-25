.class public Lcom/daaw/ak0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ak0$a;,
        Lcom/daaw/ak0$b;
    }
.end annotation


# static fields
.field public static q:I = 0x3e8

.field public static r:Z = true

.field public static s:J

.field public static t:J


# instance fields
.field public a:I

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/daaw/de1;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/ak0$a;

.field public d:I

.field public e:I

.field public f:[Lcom/daaw/i6;

.field public g:Z

.field public h:Z

.field public i:[Z

.field public j:I

.field public k:I

.field public l:I

.field public final m:Lcom/daaw/gd;

.field public n:[Lcom/daaw/de1;

.field public o:I

.field public p:Lcom/daaw/ak0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ak0;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/ak0;->b:Ljava/util/HashMap;

    const/16 v2, 0x20

    iput v2, p0, Lcom/daaw/ak0;->d:I

    iput v2, p0, Lcom/daaw/ak0;->e:I

    iput-object v1, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    iput-boolean v0, p0, Lcom/daaw/ak0;->g:Z

    iput-boolean v0, p0, Lcom/daaw/ak0;->h:Z

    new-array v1, v2, [Z

    iput-object v1, p0, Lcom/daaw/ak0;->i:[Z

    const/4 v1, 0x1

    iput v1, p0, Lcom/daaw/ak0;->j:I

    iput v0, p0, Lcom/daaw/ak0;->k:I

    iput v2, p0, Lcom/daaw/ak0;->l:I

    sget v1, Lcom/daaw/ak0;->q:I

    new-array v1, v1, [Lcom/daaw/de1;

    iput-object v1, p0, Lcom/daaw/ak0;->n:[Lcom/daaw/de1;

    iput v0, p0, Lcom/daaw/ak0;->o:I

    new-array v0, v2, [Lcom/daaw/i6;

    iput-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    invoke-virtual {p0}, Lcom/daaw/ak0;->C()V

    new-instance v0, Lcom/daaw/gd;

    invoke-direct {v0}, Lcom/daaw/gd;-><init>()V

    iput-object v0, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    new-instance v1, Lcom/daaw/ez0;

    invoke-direct {v1, v0}, Lcom/daaw/ez0;-><init>(Lcom/daaw/gd;)V

    iput-object v1, p0, Lcom/daaw/ak0;->c:Lcom/daaw/ak0$a;

    sget-boolean v1, Lcom/daaw/ak0;->r:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/ak0$b;

    invoke-direct {v1, p0, v0}, Lcom/daaw/ak0$b;-><init>(Lcom/daaw/ak0;Lcom/daaw/gd;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/i6;

    invoke-direct {v1, v0}, Lcom/daaw/i6;-><init>(Lcom/daaw/gd;)V

    :goto_0
    iput-object v1, p0, Lcom/daaw/ak0;->p:Lcom/daaw/ak0$a;

    return-void
.end method

.method public static s(Lcom/daaw/ak0;Lcom/daaw/de1;Lcom/daaw/de1;F)Lcom/daaw/i6;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/i6;->j(Lcom/daaw/de1;Lcom/daaw/de1;F)Lcom/daaw/i6;

    move-result-object p0

    return-object p0
.end method

.method public static w()Lcom/daaw/dq0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public A(Lcom/daaw/ak0$a;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/ak0;->u(Lcom/daaw/ak0$a;)I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ak0;->B(Lcom/daaw/ak0$a;Z)I

    invoke-virtual {p0}, Lcom/daaw/ak0;->n()V

    return-void
.end method

.method public final B(Lcom/daaw/ak0$a;Z)I
    .locals 10

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/ak0;->j:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/ak0;->i:[Z

    aput-boolean p2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_1
    :goto_1
    if-nez v0, :cond_b

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/daaw/ak0;->j:I

    mul-int/lit8 v2, v2, 0x2

    if-lt v1, v2, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, Lcom/daaw/ak0$a;->getKey()Lcom/daaw/de1;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/daaw/ak0;->i:[Z

    invoke-interface {p1}, Lcom/daaw/ak0$a;->getKey()Lcom/daaw/de1;

    move-result-object v4

    iget v4, v4, Lcom/daaw/de1;->c:I

    aput-boolean v3, v2, v4

    :cond_3
    iget-object v2, p0, Lcom/daaw/ak0;->i:[Z

    invoke-interface {p1, p0, v2}, Lcom/daaw/ak0$a;->c(Lcom/daaw/ak0;[Z)Lcom/daaw/de1;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v4, p0, Lcom/daaw/ak0;->i:[Z

    iget v5, v2, Lcom/daaw/de1;->c:I

    aget-boolean v6, v4, v5

    if-eqz v6, :cond_4

    return v1

    :cond_4
    aput-boolean v3, v4, v5

    :cond_5
    if-eqz v2, :cond_a

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    :goto_2
    iget v7, p0, Lcom/daaw/ak0;->k:I

    if-ge v5, v7, :cond_9

    iget-object v7, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v7, v7, v5

    iget-object v8, v7, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iget-object v8, v8, Lcom/daaw/de1;->j:Lcom/daaw/de1$a;

    sget-object v9, Lcom/daaw/de1$a;->p:Lcom/daaw/de1$a;

    if-ne v8, v9, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v8, v7, Lcom/daaw/i6;->f:Z

    if-eqz v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v7, v2}, Lcom/daaw/i6;->t(Lcom/daaw/de1;)Z

    move-result v8

    if-eqz v8, :cond_8

    iget-object v8, v7, Lcom/daaw/i6;->e:Lcom/daaw/i6$a;

    invoke-interface {v8, v2}, Lcom/daaw/i6$a;->e(Lcom/daaw/de1;)F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v9, v8, v9

    if-gez v9, :cond_8

    iget v7, v7, Lcom/daaw/i6;->b:F

    neg-float v7, v7

    div-float/2addr v7, v8

    cmpg-float v8, v7, v3

    if-gez v8, :cond_8

    move v6, v5

    move v3, v7

    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-le v6, v4, :cond_1

    iget-object v3, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v3, v3, v6

    iget-object v5, v3, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iput v4, v5, Lcom/daaw/de1;->d:I

    invoke-virtual {v3, v2}, Lcom/daaw/i6;->y(Lcom/daaw/de1;)V

    iget-object v2, v3, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iput v6, v2, Lcom/daaw/de1;->d:I

    invoke-virtual {v2, v3}, Lcom/daaw/de1;->g(Lcom/daaw/i6;)V

    goto :goto_1

    :cond_a
    const/4 v0, 0x1

    goto/16 :goto_1

    :cond_b
    return v1
.end method

.method public final C()V
    .locals 4

    sget-boolean v0, Lcom/daaw/ak0;->r:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v3, v3, Lcom/daaw/gd;->a:Lcom/daaw/cy0;

    invoke-interface {v3, v0}, Lcom/daaw/cy0;->a(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v3, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v3, v3, Lcom/daaw/gd;->b:Lcom/daaw/cy0;

    invoke-interface {v3, v0}, Lcom/daaw/cy0;->a(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public D()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v3, v2, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/daaw/de1;->d()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lcom/daaw/gd;->c:Lcom/daaw/cy0;

    iget-object v2, p0, Lcom/daaw/ak0;->n:[Lcom/daaw/de1;

    iget v3, p0, Lcom/daaw/ak0;->o:I

    invoke-interface {v1, v2, v3}, Lcom/daaw/cy0;->c([Ljava/lang/Object;I)V

    iput v0, p0, Lcom/daaw/ak0;->o:I

    iget-object v1, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v1, v1, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/ak0;->b:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_2
    iput v0, p0, Lcom/daaw/ak0;->a:I

    iget-object v1, p0, Lcom/daaw/ak0;->c:Lcom/daaw/ak0$a;

    invoke-interface {v1}, Lcom/daaw/ak0$a;->clear()V

    const/4 v1, 0x1

    iput v1, p0, Lcom/daaw/ak0;->j:I

    const/4 v1, 0x0

    :goto_1
    iget v2, p0, Lcom/daaw/ak0;->k:I

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v2, v2, v1

    iput-boolean v0, v2, Lcom/daaw/i6;->c:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/ak0;->C()V

    iput v0, p0, Lcom/daaw/ak0;->k:I

    sget-boolean v0, Lcom/daaw/ak0;->r:Z

    if-eqz v0, :cond_4

    new-instance v0, Lcom/daaw/ak0$b;

    iget-object v1, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    invoke-direct {v0, p0, v1}, Lcom/daaw/ak0$b;-><init>(Lcom/daaw/ak0;Lcom/daaw/gd;)V

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/daaw/i6;

    iget-object v1, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    invoke-direct {v0, v1}, Lcom/daaw/i6;-><init>(Lcom/daaw/gd;)V

    :goto_2
    iput-object v0, p0, Lcom/daaw/ak0;->p:Lcom/daaw/ak0$a;

    return-void
.end method

.method public final a(Lcom/daaw/de1$a;Ljava/lang/String;)Lcom/daaw/de1;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v0, v0, Lcom/daaw/gd;->c:Lcom/daaw/cy0;

    invoke-interface {v0}, Lcom/daaw/cy0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/de1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/de1;

    invoke-direct {v0, p1, p2}, Lcom/daaw/de1;-><init>(Lcom/daaw/de1$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/de1;->d()V

    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/daaw/de1;->f(Lcom/daaw/de1$a;Ljava/lang/String;)V

    iget p1, p0, Lcom/daaw/ak0;->o:I

    sget p2, Lcom/daaw/ak0;->q:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    sput p2, Lcom/daaw/ak0;->q:I

    iget-object p1, p0, Lcom/daaw/ak0;->n:[Lcom/daaw/de1;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/de1;

    iput-object p1, p0, Lcom/daaw/ak0;->n:[Lcom/daaw/de1;

    :cond_1
    iget-object p1, p0, Lcom/daaw/ak0;->n:[Lcom/daaw/de1;

    iget p2, p0, Lcom/daaw/ak0;->o:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Lcom/daaw/ak0;->o:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method public b(Lcom/daaw/qj;Lcom/daaw/qj;FI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, Lcom/daaw/lj$b;->q:Lcom/daaw/lj$b;

    invoke-virtual {v1, v3}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v6

    sget-object v4, Lcom/daaw/lj$b;->r:Lcom/daaw/lj$b;

    invoke-virtual {v1, v4}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v8

    sget-object v5, Lcom/daaw/lj$b;->s:Lcom/daaw/lj$b;

    invoke-virtual {v1, v5}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v13

    sget-object v7, Lcom/daaw/lj$b;->t:Lcom/daaw/lj$b;

    invoke-virtual {v1, v7}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v9

    invoke-virtual {v2, v3}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v1

    invoke-virtual {v2, v4}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v10

    invoke-virtual {v2, v5}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v3

    invoke-virtual {v2, v7}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v2

    move/from16 v4, p3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    move/from16 v7, p4

    move-object/from16 p1, v3

    move-wide/from16 p2, v4

    int-to-double v3, v7

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v3

    double-to-float v12, v14

    move-object v7, v2

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/i6;->q(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;F)Lcom/daaw/i6;

    invoke-virtual {v0, v2}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v2

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v3

    double-to-float v10, v7

    move-object v5, v2

    move-object v7, v13

    move-object v8, v1

    move-object/from16 v9, p1

    invoke-virtual/range {v5 .. v10}, Lcom/daaw/i6;->q(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;F)Lcom/daaw/i6;

    invoke-virtual {v0, v2}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-void
.end method

.method public c(Lcom/daaw/de1;Lcom/daaw/de1;IFLcom/daaw/de1;Lcom/daaw/de1;II)V
    .locals 11

    move-object v0, p0

    move/from16 v1, p8

    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v10

    move-object v2, v10

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, Lcom/daaw/i6;->h(Lcom/daaw/de1;Lcom/daaw/de1;IFLcom/daaw/de1;Lcom/daaw/de1;I)Lcom/daaw/i6;

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v10, p0, v1}, Lcom/daaw/i6;->d(Lcom/daaw/ak0;I)Lcom/daaw/i6;

    :cond_0
    invoke-virtual {p0, v10}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-void
.end method

.method public d(Lcom/daaw/i6;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/ak0;->k:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Lcom/daaw/ak0;->l:I

    if-ge v0, v2, :cond_1

    iget v0, p0, Lcom/daaw/ak0;->j:I

    add-int/2addr v0, v1

    iget v2, p0, Lcom/daaw/ak0;->e:I

    if-lt v0, v2, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ak0;->y()V

    :cond_2
    const/4 v0, 0x0

    iget-boolean v2, p1, Lcom/daaw/i6;->f:Z

    if-nez v2, :cond_9

    invoke-virtual {p1, p0}, Lcom/daaw/i6;->D(Lcom/daaw/ak0;)V

    invoke-virtual {p1}, Lcom/daaw/i6;->u()Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/daaw/i6;->r()V

    invoke-virtual {p1, p0}, Lcom/daaw/i6;->f(Lcom/daaw/ak0;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0}, Lcom/daaw/ak0;->p()Lcom/daaw/de1;

    move-result-object v0

    iput-object v0, p1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    invoke-virtual {p0, p1}, Lcom/daaw/ak0;->l(Lcom/daaw/i6;)V

    iget-object v2, p0, Lcom/daaw/ak0;->p:Lcom/daaw/ak0$a;

    invoke-interface {v2, p1}, Lcom/daaw/ak0$a;->b(Lcom/daaw/ak0$a;)V

    iget-object v2, p0, Lcom/daaw/ak0;->p:Lcom/daaw/ak0$a;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/ak0;->B(Lcom/daaw/ak0$a;Z)I

    iget v2, v0, Lcom/daaw/de1;->d:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_7

    iget-object v2, p1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    if-ne v2, v0, :cond_4

    invoke-virtual {p1, v0}, Lcom/daaw/i6;->w(Lcom/daaw/de1;)Lcom/daaw/de1;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0}, Lcom/daaw/i6;->y(Lcom/daaw/de1;)V

    :cond_4
    iget-boolean v0, p1, Lcom/daaw/i6;->f:Z

    if-nez v0, :cond_5

    iget-object v0, p1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    invoke-virtual {v0, p1}, Lcom/daaw/de1;->g(Lcom/daaw/i6;)V

    :cond_5
    iget v0, p0, Lcom/daaw/ak0;->k:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/ak0;->k:I

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :cond_7
    :goto_0
    invoke-virtual {p1}, Lcom/daaw/i6;->s()Z

    move-result v0

    if-nez v0, :cond_8

    return-void

    :cond_8
    move v0, v1

    :cond_9
    if-nez v0, :cond_a

    invoke-virtual {p0, p1}, Lcom/daaw/ak0;->l(Lcom/daaw/i6;)V

    :cond_a
    return-void
.end method

.method public e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;
    .locals 3

    const/16 v0, 0x8

    if-ne p4, v0, :cond_0

    iget-boolean v1, p2, Lcom/daaw/de1;->g:Z

    if-eqz v1, :cond_0

    iget v1, p1, Lcom/daaw/de1;->d:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    iget p2, p2, Lcom/daaw/de1;->f:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Lcom/daaw/de1;->e(Lcom/daaw/ak0;F)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3}, Lcom/daaw/i6;->n(Lcom/daaw/de1;Lcom/daaw/de1;I)Lcom/daaw/i6;

    if-eq p4, v0, :cond_1

    invoke-virtual {v1, p0, p4}, Lcom/daaw/i6;->d(Lcom/daaw/ak0;I)Lcom/daaw/i6;

    :cond_1
    invoke-virtual {p0, v1}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-object v1
.end method

.method public f(Lcom/daaw/de1;I)V
    .locals 2

    iget v0, p1, Lcom/daaw/de1;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    int-to-float p2, p2

    invoke-virtual {p1, p0, p2}, Lcom/daaw/de1;->e(Lcom/daaw/ak0;F)V

    return-void

    :cond_0
    if-eq v0, v1, :cond_3

    iget-object v1, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v0, v1, v0

    iget-boolean v1, v0, Lcom/daaw/i6;->f:Z

    if-eqz v1, :cond_1

    :goto_0
    int-to-float p1, p2

    iput p1, v0, Lcom/daaw/i6;->b:F

    goto :goto_2

    :cond_1
    iget-object v1, v0, Lcom/daaw/i6;->e:Lcom/daaw/i6$a;

    invoke-interface {v1}, Lcom/daaw/i6$a;->b()I

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/daaw/i6;->f:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/i6;->m(Lcom/daaw/de1;I)Lcom/daaw/i6;

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/i6;->i(Lcom/daaw/de1;I)Lcom/daaw/i6;

    :goto_1
    invoke-virtual {p0, v0}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    :goto_2
    return-void
.end method

.method public g(Lcom/daaw/de1;Lcom/daaw/de1;IZ)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object p4

    invoke-virtual {p0}, Lcom/daaw/ak0;->t()Lcom/daaw/de1;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/de1;->e:I

    invoke-virtual {p4, p1, p2, v0, p3}, Lcom/daaw/i6;->o(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;I)Lcom/daaw/i6;

    invoke-virtual {p0, p4}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-void
.end method

.method public h(Lcom/daaw/de1;Lcom/daaw/de1;II)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/ak0;->t()Lcom/daaw/de1;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lcom/daaw/de1;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/daaw/i6;->o(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;I)Lcom/daaw/i6;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lcom/daaw/i6;->e:Lcom/daaw/i6$a;

    invoke-interface {p1, v1}, Lcom/daaw/i6$a;->e(Lcom/daaw/de1;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, Lcom/daaw/ak0;->m(Lcom/daaw/i6;II)V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-void
.end method

.method public i(Lcom/daaw/de1;Lcom/daaw/de1;IZ)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object p4

    invoke-virtual {p0}, Lcom/daaw/ak0;->t()Lcom/daaw/de1;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/de1;->e:I

    invoke-virtual {p4, p1, p2, v0, p3}, Lcom/daaw/i6;->p(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;I)Lcom/daaw/i6;

    invoke-virtual {p0, p4}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-void
.end method

.method public j(Lcom/daaw/de1;Lcom/daaw/de1;II)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/ak0;->t()Lcom/daaw/de1;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lcom/daaw/de1;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lcom/daaw/i6;->p(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;I)Lcom/daaw/i6;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lcom/daaw/i6;->e:Lcom/daaw/i6$a;

    invoke-interface {p1, v1}, Lcom/daaw/i6$a;->e(Lcom/daaw/de1;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, Lcom/daaw/ak0;->m(Lcom/daaw/i6;II)V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-void
.end method

.method public k(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;FI)V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/i6;->k(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;F)Lcom/daaw/i6;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    invoke-virtual {v6, p0, p6}, Lcom/daaw/i6;->d(Lcom/daaw/ak0;I)Lcom/daaw/i6;

    :cond_0
    invoke-virtual {p0, v6}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    return-void
.end method

.method public final l(Lcom/daaw/i6;)V
    .locals 3

    sget-boolean v0, Lcom/daaw/ak0;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    iget v1, p0, Lcom/daaw/ak0;->k:I

    aget-object v2, v0, v1

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v2, v2, Lcom/daaw/gd;->a:Lcom/daaw/cy0;

    aget-object v0, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    iget v1, p0, Lcom/daaw/ak0;->k:I

    aget-object v2, v0, v1

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v2, v2, Lcom/daaw/gd;->b:Lcom/daaw/cy0;

    aget-object v0, v0, v1

    :goto_0
    invoke-interface {v2, v0}, Lcom/daaw/cy0;->a(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    iget v1, p0, Lcom/daaw/ak0;->k:I

    aput-object p1, v0, v1

    iget-object v0, p1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iput v1, v0, Lcom/daaw/de1;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/ak0;->k:I

    invoke-virtual {v0, p1}, Lcom/daaw/de1;->g(Lcom/daaw/i6;)V

    return-void
.end method

.method public m(Lcom/daaw/i6;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Lcom/daaw/ak0;->o(ILjava/lang/String;)Lcom/daaw/de1;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lcom/daaw/i6;->e(Lcom/daaw/de1;I)Lcom/daaw/i6;

    return-void
.end method

.method public final n()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/ak0;->k:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v1, v1, v0

    iget-object v2, v1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iget v1, v1, Lcom/daaw/i6;->b:F

    iput v1, v2, Lcom/daaw/de1;->f:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(ILjava/lang/String;)Lcom/daaw/de1;
    .locals 2

    iget v0, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/daaw/ak0;->e:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ak0;->y()V

    :cond_0
    sget-object v0, Lcom/daaw/de1$a;->s:Lcom/daaw/de1$a;

    invoke-virtual {p0, v0, p2}, Lcom/daaw/ak0;->a(Lcom/daaw/de1$a;Ljava/lang/String;)Lcom/daaw/de1;

    move-result-object p2

    iget v0, p0, Lcom/daaw/ak0;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/ak0;->a:I

    iget v1, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/ak0;->j:I

    iput v0, p2, Lcom/daaw/de1;->c:I

    iput p1, p2, Lcom/daaw/de1;->e:I

    iget-object p1, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object p1, p1, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    aput-object p2, p1, v0

    iget-object p1, p0, Lcom/daaw/ak0;->c:Lcom/daaw/ak0$a;

    invoke-interface {p1, p2}, Lcom/daaw/ak0$a;->a(Lcom/daaw/de1;)V

    return-object p2
.end method

.method public p()Lcom/daaw/de1;
    .locals 3

    iget v0, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/daaw/ak0;->e:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ak0;->y()V

    :cond_0
    sget-object v0, Lcom/daaw/de1$a;->r:Lcom/daaw/de1$a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ak0;->a(Lcom/daaw/de1$a;Ljava/lang/String;)Lcom/daaw/de1;

    move-result-object v0

    iget v1, p0, Lcom/daaw/ak0;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/ak0;->a:I

    iget v2, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/daaw/ak0;->j:I

    iput v1, v0, Lcom/daaw/de1;->c:I

    iget-object v2, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v2, v2, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public q(Ljava/lang/Object;)Lcom/daaw/de1;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/daaw/ak0;->e:I

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ak0;->y()V

    :cond_1
    instance-of v1, p1, Lcom/daaw/lj;

    if-eqz v1, :cond_5

    check-cast p1, Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->e()Lcom/daaw/de1;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    invoke-virtual {p1, v0}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    invoke-virtual {p1}, Lcom/daaw/lj;->e()Lcom/daaw/de1;

    move-result-object p1

    move-object v0, p1

    :cond_2
    iget p1, v0, Lcom/daaw/de1;->c:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, Lcom/daaw/ak0;->a:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v2, v2, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    aget-object v2, v2, p1

    if-nez v2, :cond_5

    :cond_3
    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, Lcom/daaw/de1;->d()V

    :cond_4
    iget p1, p0, Lcom/daaw/ak0;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/ak0;->a:I

    iget v1, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/ak0;->j:I

    iput p1, v0, Lcom/daaw/de1;->c:I

    sget-object v1, Lcom/daaw/de1$a;->p:Lcom/daaw/de1$a;

    iput-object v1, v0, Lcom/daaw/de1;->j:Lcom/daaw/de1$a;

    iget-object v1, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v1, v1, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public r()Lcom/daaw/i6;
    .locals 5

    sget-boolean v0, Lcom/daaw/ak0;->r:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v0, v0, Lcom/daaw/gd;->a:Lcom/daaw/cy0;

    invoke-interface {v0}, Lcom/daaw/cy0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i6;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/ak0$b;

    iget-object v3, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    invoke-direct {v0, p0, v3}, Lcom/daaw/ak0$b;-><init>(Lcom/daaw/ak0;Lcom/daaw/gd;)V

    sget-wide v3, Lcom/daaw/ak0;->t:J

    add-long/2addr v3, v1

    sput-wide v3, Lcom/daaw/ak0;->t:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v0, v0, Lcom/daaw/gd;->b:Lcom/daaw/cy0;

    invoke-interface {v0}, Lcom/daaw/cy0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i6;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/i6;

    iget-object v3, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    invoke-direct {v0, v3}, Lcom/daaw/i6;-><init>(Lcom/daaw/gd;)V

    sget-wide v3, Lcom/daaw/ak0;->s:J

    add-long/2addr v3, v1

    sput-wide v3, Lcom/daaw/ak0;->s:J

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/i6;->z()V

    :goto_0
    invoke-static {}, Lcom/daaw/de1;->b()V

    return-object v0
.end method

.method public t()Lcom/daaw/de1;
    .locals 3

    iget v0, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/daaw/ak0;->e:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ak0;->y()V

    :cond_0
    sget-object v0, Lcom/daaw/de1$a;->r:Lcom/daaw/de1$a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ak0;->a(Lcom/daaw/de1$a;Ljava/lang/String;)Lcom/daaw/de1;

    move-result-object v0

    iget v1, p0, Lcom/daaw/ak0;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/ak0;->a:I

    iget v2, p0, Lcom/daaw/ak0;->j:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/daaw/ak0;->j:I

    iput v1, v0, Lcom/daaw/de1;->c:I

    iget-object v2, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v2, v2, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public final u(Lcom/daaw/ak0$a;)I
    .locals 18

    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, Lcom/daaw/ak0;->k:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ge v2, v3, :cond_2

    iget-object v3, v0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v6, v3, v2

    iget-object v6, v6, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iget-object v6, v6, Lcom/daaw/de1;->j:Lcom/daaw/de1$a;

    sget-object v7, Lcom/daaw/de1$a;->p:Lcom/daaw/de1$a;

    if-ne v6, v7, :cond_0

    goto :goto_1

    :cond_0
    aget-object v3, v3, v2

    iget v3, v3, Lcom/daaw/i6;->b:F

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_f

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_3
    if-nez v2, :cond_e

    add-int/lit8 v3, v3, 0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    :goto_4
    iget v12, v0, Lcom/daaw/ak0;->k:I

    if-ge v8, v12, :cond_b

    iget-object v12, v0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v12, v12, v8

    iget-object v13, v12, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iget-object v13, v13, Lcom/daaw/de1;->j:Lcom/daaw/de1$a;

    sget-object v14, Lcom/daaw/de1$a;->p:Lcom/daaw/de1$a;

    if-ne v13, v14, :cond_3

    goto :goto_8

    :cond_3
    iget-boolean v13, v12, Lcom/daaw/i6;->f:Z

    if-eqz v13, :cond_4

    goto :goto_8

    :cond_4
    iget v13, v12, Lcom/daaw/i6;->b:F

    cmpg-float v13, v13, v4

    if-gez v13, :cond_a

    const/4 v13, 0x1

    :goto_5
    iget v14, v0, Lcom/daaw/ak0;->j:I

    if-ge v13, v14, :cond_a

    iget-object v14, v0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v14, v14, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    aget-object v14, v14, v13

    iget-object v15, v12, Lcom/daaw/i6;->e:Lcom/daaw/i6$a;

    invoke-interface {v15, v14}, Lcom/daaw/i6$a;->e(Lcom/daaw/de1;)F

    move-result v15

    cmpg-float v16, v15, v4

    if-gtz v16, :cond_5

    goto :goto_7

    :cond_5
    const/4 v1, 0x0

    :goto_6
    const/16 v4, 0x9

    if-ge v1, v4, :cond_9

    iget-object v4, v14, Lcom/daaw/de1;->h:[F

    aget v4, v4, v1

    div-float/2addr v4, v15

    cmpg-float v17, v4, v6

    if-gez v17, :cond_6

    if-eq v1, v11, :cond_7

    :cond_6
    if-le v1, v11, :cond_8

    :cond_7
    move v11, v1

    move v6, v4

    move v9, v8

    move v10, v13

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    add-int/lit8 v13, v13, 0x1

    const/4 v4, 0x0

    goto :goto_5

    :cond_a
    :goto_8
    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x0

    goto :goto_4

    :cond_b
    if-eq v9, v7, :cond_c

    iget-object v1, v0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v1, v1, v9

    iget-object v4, v1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iput v7, v4, Lcom/daaw/de1;->d:I

    iget-object v4, v0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v4, v4, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    aget-object v4, v4, v10

    invoke-virtual {v1, v4}, Lcom/daaw/i6;->y(Lcom/daaw/de1;)V

    iget-object v4, v1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    iput v9, v4, Lcom/daaw/de1;->d:I

    invoke-virtual {v4, v1}, Lcom/daaw/de1;->g(Lcom/daaw/i6;)V

    goto :goto_9

    :cond_c
    const/4 v2, 0x1

    :goto_9
    iget v1, v0, Lcom/daaw/ak0;->j:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_d

    const/4 v2, 0x1

    :cond_d
    const/4 v4, 0x0

    goto/16 :goto_3

    :cond_e
    move v1, v3

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    :goto_a
    return v1
.end method

.method public v()Lcom/daaw/gd;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    return-object v0
.end method

.method public x(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->e()Lcom/daaw/de1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lcom/daaw/de1;->f:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final y()V
    .locals 3

    iget v0, p0, Lcom/daaw/ak0;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/ak0;->d:I

    iget-object v1, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/i6;

    iput-object v0, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    iget-object v0, p0, Lcom/daaw/ak0;->m:Lcom/daaw/gd;

    iget-object v1, v0, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    iget v2, p0, Lcom/daaw/ak0;->d:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/daaw/de1;

    iput-object v1, v0, Lcom/daaw/gd;->d:[Lcom/daaw/de1;

    iget v0, p0, Lcom/daaw/ak0;->d:I

    new-array v1, v0, [Z

    iput-object v1, p0, Lcom/daaw/ak0;->i:[Z

    iput v0, p0, Lcom/daaw/ak0;->e:I

    iput v0, p0, Lcom/daaw/ak0;->l:I

    return-void
.end method

.method public z()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/ak0;->g:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/ak0;->h:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/ak0;->c:Lcom/daaw/ak0$a;

    invoke-virtual {p0, v0}, Lcom/daaw/ak0;->A(Lcom/daaw/ak0$a;)V

    goto :goto_4

    :cond_1
    :goto_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget v2, p0, Lcom/daaw/ak0;->k:I

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lcom/daaw/ak0;->f:[Lcom/daaw/i6;

    aget-object v2, v2, v1

    iget-boolean v2, v2, Lcom/daaw/i6;->f:Z

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x1

    :goto_3
    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/daaw/ak0;->n()V

    :goto_4
    return-void
.end method
