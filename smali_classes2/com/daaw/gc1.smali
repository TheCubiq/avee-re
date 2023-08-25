.class public Lcom/daaw/gc1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gc1$c;,
        Lcom/daaw/gc1$b;
    }
.end annotation


# static fields
.field public static final m:Lcom/daaw/ll;


# instance fields
.field public a:Lcom/daaw/ml;

.field public b:Lcom/daaw/ml;

.field public c:Lcom/daaw/ml;

.field public d:Lcom/daaw/ml;

.field public e:Lcom/daaw/ll;

.field public f:Lcom/daaw/ll;

.field public g:Lcom/daaw/ll;

.field public h:Lcom/daaw/ll;

.field public i:Lcom/daaw/rv;

.field public j:Lcom/daaw/rv;

.field public k:Lcom/daaw/rv;

.field public l:Lcom/daaw/rv;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/o31;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1}, Lcom/daaw/o31;-><init>(F)V

    sput-object v0, Lcom/daaw/gc1;->m:Lcom/daaw/ll;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/on0;->b()Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->a:Lcom/daaw/ml;

    invoke-static {}, Lcom/daaw/on0;->b()Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->b:Lcom/daaw/ml;

    invoke-static {}, Lcom/daaw/on0;->b()Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->c:Lcom/daaw/ml;

    invoke-static {}, Lcom/daaw/on0;->b()Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->d:Lcom/daaw/ml;

    new-instance v0, Lcom/daaw/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/e;-><init>(F)V

    iput-object v0, p0, Lcom/daaw/gc1;->e:Lcom/daaw/ll;

    new-instance v0, Lcom/daaw/e;

    invoke-direct {v0, v1}, Lcom/daaw/e;-><init>(F)V

    iput-object v0, p0, Lcom/daaw/gc1;->f:Lcom/daaw/ll;

    new-instance v0, Lcom/daaw/e;

    invoke-direct {v0, v1}, Lcom/daaw/e;-><init>(F)V

    iput-object v0, p0, Lcom/daaw/gc1;->g:Lcom/daaw/ll;

    new-instance v0, Lcom/daaw/e;

    invoke-direct {v0, v1}, Lcom/daaw/e;-><init>(F)V

    iput-object v0, p0, Lcom/daaw/gc1;->h:Lcom/daaw/ll;

    invoke-static {}, Lcom/daaw/on0;->c()Lcom/daaw/rv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->i:Lcom/daaw/rv;

    invoke-static {}, Lcom/daaw/on0;->c()Lcom/daaw/rv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->j:Lcom/daaw/rv;

    invoke-static {}, Lcom/daaw/on0;->c()Lcom/daaw/rv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->k:Lcom/daaw/rv;

    invoke-static {}, Lcom/daaw/on0;->c()Lcom/daaw/rv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->l:Lcom/daaw/rv;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/gc1$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/gc1$b;->a(Lcom/daaw/gc1$b;)Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->a:Lcom/daaw/ml;

    invoke-static {p1}, Lcom/daaw/gc1$b;->e(Lcom/daaw/gc1$b;)Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->b:Lcom/daaw/ml;

    invoke-static {p1}, Lcom/daaw/gc1$b;->f(Lcom/daaw/gc1$b;)Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->c:Lcom/daaw/ml;

    invoke-static {p1}, Lcom/daaw/gc1$b;->g(Lcom/daaw/gc1$b;)Lcom/daaw/ml;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->d:Lcom/daaw/ml;

    invoke-static {p1}, Lcom/daaw/gc1$b;->h(Lcom/daaw/gc1$b;)Lcom/daaw/ll;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->e:Lcom/daaw/ll;

    invoke-static {p1}, Lcom/daaw/gc1$b;->i(Lcom/daaw/gc1$b;)Lcom/daaw/ll;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->f:Lcom/daaw/ll;

    invoke-static {p1}, Lcom/daaw/gc1$b;->j(Lcom/daaw/gc1$b;)Lcom/daaw/ll;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->g:Lcom/daaw/ll;

    invoke-static {p1}, Lcom/daaw/gc1$b;->k(Lcom/daaw/gc1$b;)Lcom/daaw/ll;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->h:Lcom/daaw/ll;

    invoke-static {p1}, Lcom/daaw/gc1$b;->l(Lcom/daaw/gc1$b;)Lcom/daaw/rv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->i:Lcom/daaw/rv;

    invoke-static {p1}, Lcom/daaw/gc1$b;->b(Lcom/daaw/gc1$b;)Lcom/daaw/rv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->j:Lcom/daaw/rv;

    invoke-static {p1}, Lcom/daaw/gc1$b;->c(Lcom/daaw/gc1$b;)Lcom/daaw/rv;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gc1;->k:Lcom/daaw/rv;

    invoke-static {p1}, Lcom/daaw/gc1$b;->d(Lcom/daaw/gc1$b;)Lcom/daaw/rv;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gc1;->l:Lcom/daaw/rv;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/gc1$b;Lcom/daaw/gc1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/gc1;-><init>(Lcom/daaw/gc1$b;)V

    return-void
.end method

.method public static a()Lcom/daaw/gc1$b;
    .locals 1

    new-instance v0, Lcom/daaw/gc1$b;

    invoke-direct {v0}, Lcom/daaw/gc1$b;-><init>()V

    return-object v0
.end method

.method public static b(Landroid/content/Context;II)Lcom/daaw/gc1$b;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/daaw/gc1;->c(Landroid/content/Context;III)Lcom/daaw/gc1$b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;III)Lcom/daaw/gc1$b;
    .locals 1

    new-instance v0, Lcom/daaw/e;

    int-to-float p3, p3

    invoke-direct {v0, p3}, Lcom/daaw/e;-><init>(F)V

    invoke-static {p0, p1, p2, v0}, Lcom/daaw/gc1;->d(Landroid/content/Context;IILcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;IILcom/daaw/ll;)Lcom/daaw/gc1$b;
    .locals 6

    if-eqz p2, :cond_0

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    move p1, p2

    move-object p0, v0

    :cond_0
    sget-object p2, Lcom/daaw/m21;->U3:[I

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    :try_start_0
    sget p1, Lcom/daaw/m21;->V3:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget p2, Lcom/daaw/m21;->Y3:I

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    sget v0, Lcom/daaw/m21;->Z3:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    sget v1, Lcom/daaw/m21;->X3:I

    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    sget v2, Lcom/daaw/m21;->W3:I

    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget v2, Lcom/daaw/m21;->a4:I

    invoke-static {p0, v2, p3}, Lcom/daaw/gc1;->m(Landroid/content/res/TypedArray;ILcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object p3

    sget v2, Lcom/daaw/m21;->d4:I

    invoke-static {p0, v2, p3}, Lcom/daaw/gc1;->m(Landroid/content/res/TypedArray;ILcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object v2

    sget v3, Lcom/daaw/m21;->e4:I

    invoke-static {p0, v3, p3}, Lcom/daaw/gc1;->m(Landroid/content/res/TypedArray;ILcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object v3

    sget v4, Lcom/daaw/m21;->c4:I

    invoke-static {p0, v4, p3}, Lcom/daaw/gc1;->m(Landroid/content/res/TypedArray;ILcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object v4

    sget v5, Lcom/daaw/m21;->b4:I

    invoke-static {p0, v5, p3}, Lcom/daaw/gc1;->m(Landroid/content/res/TypedArray;ILcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object p3

    new-instance v5, Lcom/daaw/gc1$b;

    invoke-direct {v5}, Lcom/daaw/gc1$b;-><init>()V

    invoke-virtual {v5, p2, v2}, Lcom/daaw/gc1$b;->y(ILcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p2

    invoke-virtual {p2, v0, v3}, Lcom/daaw/gc1$b;->C(ILcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p2

    invoke-virtual {p2, v1, v4}, Lcom/daaw/gc1$b;->u(ILcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, Lcom/daaw/gc1$b;->q(ILcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public static e(Landroid/content/Context;Landroid/util/AttributeSet;II)Lcom/daaw/gc1$b;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lcom/daaw/gc1;->f(Landroid/content/Context;Landroid/util/AttributeSet;III)Lcom/daaw/gc1$b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroid/util/AttributeSet;III)Lcom/daaw/gc1$b;
    .locals 1

    new-instance v0, Lcom/daaw/e;

    int-to-float p4, p4

    invoke-direct {v0, p4}, Lcom/daaw/e;-><init>(F)V

    invoke-static {p0, p1, p2, p3, v0}, Lcom/daaw/gc1;->g(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/daaw/ll;)Lcom/daaw/gc1$b;
    .locals 1

    sget-object v0, Lcom/daaw/m21;->M2:[I

    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/daaw/m21;->N2:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    sget v0, Lcom/daaw/m21;->O2:I

    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p0, p2, p3, p4}, Lcom/daaw/gc1;->d(Landroid/content/Context;IILcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroid/content/res/TypedArray;ILcom/daaw/ll;)Lcom/daaw/ll;
    .locals 2

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    new-instance p2, Lcom/daaw/e;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, Lcom/daaw/e;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    new-instance p0, Lcom/daaw/o31;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, Lcom/daaw/o31;-><init>(F)V

    return-object p0

    :cond_2
    return-object p2
.end method


# virtual methods
.method public h()Lcom/daaw/rv;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->k:Lcom/daaw/rv;

    return-object v0
.end method

.method public i()Lcom/daaw/ml;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->d:Lcom/daaw/ml;

    return-object v0
.end method

.method public j()Lcom/daaw/ll;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->h:Lcom/daaw/ll;

    return-object v0
.end method

.method public k()Lcom/daaw/ml;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->c:Lcom/daaw/ml;

    return-object v0
.end method

.method public l()Lcom/daaw/ll;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->g:Lcom/daaw/ll;

    return-object v0
.end method

.method public n()Lcom/daaw/rv;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->l:Lcom/daaw/rv;

    return-object v0
.end method

.method public o()Lcom/daaw/rv;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->j:Lcom/daaw/rv;

    return-object v0
.end method

.method public p()Lcom/daaw/rv;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->i:Lcom/daaw/rv;

    return-object v0
.end method

.method public q()Lcom/daaw/ml;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->a:Lcom/daaw/ml;

    return-object v0
.end method

.method public r()Lcom/daaw/ll;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->e:Lcom/daaw/ll;

    return-object v0
.end method

.method public s()Lcom/daaw/ml;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->b:Lcom/daaw/ml;

    return-object v0
.end method

.method public t()Lcom/daaw/ll;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc1;->f:Lcom/daaw/ll;

    return-object v0
.end method

.method public u(Landroid/graphics/RectF;)Z
    .locals 5

    const-class v0, Lcom/daaw/rv;

    iget-object v1, p0, Lcom/daaw/gc1;->l:Lcom/daaw/rv;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/gc1;->j:Lcom/daaw/rv;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/gc1;->i:Lcom/daaw/rv;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/gc1;->k:Lcom/daaw/rv;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/gc1;->e:Lcom/daaw/ll;

    invoke-interface {v1, p1}, Lcom/daaw/ll;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v4, p0, Lcom/daaw/gc1;->f:Lcom/daaw/ll;

    invoke-interface {v4, p1}, Lcom/daaw/ll;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/daaw/gc1;->h:Lcom/daaw/ll;

    invoke-interface {v4, p1}, Lcom/daaw/ll;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/daaw/gc1;->g:Lcom/daaw/ll;

    invoke-interface {v4, p1}, Lcom/daaw/ll;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object v1, p0, Lcom/daaw/gc1;->b:Lcom/daaw/ml;

    instance-of v1, v1, Lcom/daaw/j61;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/gc1;->a:Lcom/daaw/ml;

    instance-of v1, v1, Lcom/daaw/j61;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/gc1;->c:Lcom/daaw/ml;

    instance-of v1, v1, Lcom/daaw/j61;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/gc1;->d:Lcom/daaw/ml;

    instance-of v1, v1, Lcom/daaw/j61;

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    return v2
.end method

.method public v()Lcom/daaw/gc1$b;
    .locals 1

    new-instance v0, Lcom/daaw/gc1$b;

    invoke-direct {v0, p0}, Lcom/daaw/gc1$b;-><init>(Lcom/daaw/gc1;)V

    return-object v0
.end method

.method public w(F)Lcom/daaw/gc1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/gc1;->v()Lcom/daaw/gc1$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/gc1$b;->o(F)Lcom/daaw/gc1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/gc1$b;->m()Lcom/daaw/gc1;

    move-result-object p1

    return-object p1
.end method

.method public x(Lcom/daaw/ll;)Lcom/daaw/gc1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/gc1;->v()Lcom/daaw/gc1$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/gc1$b;->p(Lcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/gc1$b;->m()Lcom/daaw/gc1;

    move-result-object p1

    return-object p1
.end method

.method public y(Lcom/daaw/gc1$c;)Lcom/daaw/gc1;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/gc1;->v()Lcom/daaw/gc1$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/gc1;->r()Lcom/daaw/ll;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/daaw/gc1$c;->a(Lcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/gc1$b;->B(Lcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/gc1;->t()Lcom/daaw/ll;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/daaw/gc1$c;->a(Lcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/gc1$b;->F(Lcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/gc1;->j()Lcom/daaw/ll;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/daaw/gc1$c;->a(Lcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/gc1$b;->t(Lcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/gc1;->l()Lcom/daaw/ll;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/daaw/gc1$c;->a(Lcom/daaw/ll;)Lcom/daaw/ll;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/gc1$b;->x(Lcom/daaw/ll;)Lcom/daaw/gc1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/gc1$b;->m()Lcom/daaw/gc1;

    move-result-object p1

    return-object p1
.end method
