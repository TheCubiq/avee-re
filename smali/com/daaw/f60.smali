.class public Lcom/daaw/f60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        "DataType:",
        "Ljava/lang/Object;",
        "ResourceType:",
        "Ljava/lang/Object;",
        "TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public A:I

.field public B:Lcom/daaw/q41;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/q41<",
            "-TModelType;TTranscodeType;>;"
        }
    .end annotation
.end field

.field public C:Ljava/lang/Float;

.field public D:Lcom/daaw/f60;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f60<",
            "***TTranscodeType;>;"
        }
    .end annotation
.end field

.field public E:Ljava/lang/Float;

.field public F:Landroid/graphics/drawable/Drawable;

.field public G:Landroid/graphics/drawable/Drawable;

.field public H:Lcom/daaw/dz0;

.field public I:Z

.field public J:Lcom/daaw/g70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g70<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public K:I

.field public L:I

.field public M:Lcom/daaw/wt;

.field public N:Lcom/daaw/cn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cn1<",
            "TResourceType;>;"
        }
    .end annotation
.end field

.field public O:Z

.field public P:Z

.field public Q:Landroid/graphics/drawable/Drawable;

.field public R:I

.field public final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TModelType;>;"
        }
    .end annotation
.end field

.field public final q:Landroid/content/Context;

.field public final r:Lcom/daaw/e70;

.field public final s:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public final t:Lcom/daaw/v41;

.field public final u:Lcom/daaw/mj0;

.field public v:Lcom/daaw/cf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cf<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation
.end field

.field public w:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TModelType;"
        }
    .end annotation
.end field

.field public x:Lcom/daaw/hi0;

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Lcom/daaw/ik0;Ljava/lang/Class;Lcom/daaw/e70;Lcom/daaw/v41;Lcom/daaw/mj0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "TModelType;>;",
            "Lcom/daaw/ik0<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;",
            "Ljava/lang/Class<",
            "TTranscodeType;>;",
            "Lcom/daaw/e70;",
            "Lcom/daaw/v41;",
            "Lcom/daaw/mj0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/uw;->b()Lcom/daaw/uw;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/f60;->x:Lcom/daaw/hi0;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/f60;->E:Ljava/lang/Float;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/f60;->I:Z

    invoke-static {}, Lcom/daaw/vs0;->d()Lcom/daaw/g70;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/f60;->J:Lcom/daaw/g70;

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/f60;->K:I

    iput v1, p0, Lcom/daaw/f60;->L:I

    sget-object v1, Lcom/daaw/wt;->u:Lcom/daaw/wt;

    iput-object v1, p0, Lcom/daaw/f60;->M:Lcom/daaw/wt;

    invoke-static {}, Lcom/daaw/np1;->b()Lcom/daaw/np1;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/f60;->N:Lcom/daaw/cn1;

    iput-object p1, p0, Lcom/daaw/f60;->q:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/f60;->p:Ljava/lang/Class;

    iput-object p4, p0, Lcom/daaw/f60;->s:Ljava/lang/Class;

    iput-object p5, p0, Lcom/daaw/f60;->r:Lcom/daaw/e70;

    iput-object p6, p0, Lcom/daaw/f60;->t:Lcom/daaw/v41;

    iput-object p7, p0, Lcom/daaw/f60;->u:Lcom/daaw/mj0;

    if-eqz p3, :cond_0

    new-instance v0, Lcom/daaw/cf;

    invoke-direct {v0, p3}, Lcom/daaw/cf;-><init>(Lcom/daaw/ik0;)V

    :cond_0
    iput-object v0, p0, Lcom/daaw/f60;->v:Lcom/daaw/cf;

    const-string p4, "Context can\'t be null"

    invoke-static {p1, p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    const-string p1, "LoadProvider must not be null"

    invoke-static {p3, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :cond_1
    return-void
.end method


# virtual methods
.method public varargs A([Lcom/daaw/cn1;)Lcom/daaw/f60;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/cn1<",
            "TResourceType;>;)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/f60;->O:Z

    array-length v1, p1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/daaw/f60;->N:Lcom/daaw/cn1;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/fr0;

    invoke-direct {v0, p1}, Lcom/daaw/fr0;-><init>([Lcom/daaw/cn1;)V

    iput-object v0, p0, Lcom/daaw/f60;->N:Lcom/daaw/cn1;

    :goto_0
    return-object p0
.end method

.method public a(Lcom/daaw/g70;)Lcom/daaw/f60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/g70<",
            "TTranscodeType;>;)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    const-string v0, "Animation factory must not be null!"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/f60;->J:Lcom/daaw/g70;

    return-object p0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/f60;->f()Lcom/daaw/f60;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lcom/daaw/pj1;)Lcom/daaw/l41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/pj1<",
            "TTranscodeType;>;)",
            "Lcom/daaw/l41;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    if-nez v0, :cond_0

    sget-object v0, Lcom/daaw/dz0;->r:Lcom/daaw/dz0;

    iput-object v0, p0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/f60;->e(Lcom/daaw/pj1;Lcom/daaw/hl1;)Lcom/daaw/l41;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lcom/daaw/pj1;Lcom/daaw/hl1;)Lcom/daaw/l41;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/pj1<",
            "TTranscodeType;>;",
            "Lcom/daaw/hl1;",
            ")",
            "Lcom/daaw/l41;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/f60;->D:Lcom/daaw/f60;

    if-eqz v0, :cond_4

    iget-boolean v1, p0, Lcom/daaw/f60;->P:Z

    if-nez v1, :cond_3

    iget-object v0, v0, Lcom/daaw/f60;->J:Lcom/daaw/g70;

    invoke-static {}, Lcom/daaw/vs0;->d()Lcom/daaw/g70;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/f60;->D:Lcom/daaw/f60;

    iget-object v1, p0, Lcom/daaw/f60;->J:Lcom/daaw/g70;

    iput-object v1, v0, Lcom/daaw/f60;->J:Lcom/daaw/g70;

    :cond_0
    iget-object v0, p0, Lcom/daaw/f60;->D:Lcom/daaw/f60;

    iget-object v1, v0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/f60;->n()Lcom/daaw/dz0;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    :cond_1
    iget v0, p0, Lcom/daaw/f60;->L:I

    iget v1, p0, Lcom/daaw/f60;->K:I

    invoke-static {v0, v1}, Lcom/daaw/tq1;->l(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/f60;->D:Lcom/daaw/f60;

    iget v1, v0, Lcom/daaw/f60;->L:I

    iget v0, v0, Lcom/daaw/f60;->K:I

    invoke-static {v1, v0}, Lcom/daaw/tq1;->l(II)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/f60;->D:Lcom/daaw/f60;

    iget v1, p0, Lcom/daaw/f60;->L:I

    iget v2, p0, Lcom/daaw/f60;->K:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/f60;->v(II)Lcom/daaw/f60;

    :cond_2
    new-instance v0, Lcom/daaw/hl1;

    invoke-direct {v0, p2}, Lcom/daaw/hl1;-><init>(Lcom/daaw/m41;)V

    iget-object p2, p0, Lcom/daaw/f60;->E:Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v1, p0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/daaw/f60;->u(Lcom/daaw/pj1;FLcom/daaw/dz0;Lcom/daaw/m41;)Lcom/daaw/l41;

    move-result-object p2

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/f60;->P:Z

    iget-object v1, p0, Lcom/daaw/f60;->D:Lcom/daaw/f60;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/f60;->e(Lcom/daaw/pj1;Lcom/daaw/hl1;)Lcom/daaw/l41;

    move-result-object p1

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/f60;->P:Z

    :goto_0
    invoke-virtual {v0, p2, p1}, Lcom/daaw/hl1;->m(Lcom/daaw/l41;Lcom/daaw/l41;)V

    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object v0, p0, Lcom/daaw/f60;->C:Ljava/lang/Float;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/daaw/hl1;

    invoke-direct {v0, p2}, Lcom/daaw/hl1;-><init>(Lcom/daaw/m41;)V

    iget-object p2, p0, Lcom/daaw/f60;->E:Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v1, p0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/daaw/f60;->u(Lcom/daaw/pj1;FLcom/daaw/dz0;Lcom/daaw/m41;)Lcom/daaw/l41;

    move-result-object p2

    iget-object v1, p0, Lcom/daaw/f60;->C:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/f60;->n()Lcom/daaw/dz0;

    move-result-object v2

    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/daaw/f60;->u(Lcom/daaw/pj1;FLcom/daaw/dz0;Lcom/daaw/m41;)Lcom/daaw/l41;

    move-result-object p1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/daaw/f60;->E:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/daaw/f60;->u(Lcom/daaw/pj1;FLcom/daaw/dz0;Lcom/daaw/m41;)Lcom/daaw/l41;

    move-result-object p1

    return-object p1
.end method

.method public f()Lcom/daaw/f60;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/f60;

    iget-object v1, p0, Lcom/daaw/f60;->v:Lcom/daaw/cf;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/cf;->i()Lcom/daaw/cf;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Lcom/daaw/f60;->v:Lcom/daaw/cf;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public i(Lcom/daaw/d51;)Lcom/daaw/f60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "TDataType;TResourceType;>;)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/f60;->v:Lcom/daaw/cf;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/cf;->j(Lcom/daaw/d51;)V

    :cond_0
    return-object p0
.end method

.method public j(Lcom/daaw/wt;)Lcom/daaw/f60;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/wt;",
            ")",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/f60;->M:Lcom/daaw/wt;

    return-object p0
.end method

.method public k()Lcom/daaw/f60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/vs0;->d()Lcom/daaw/g70;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/f60;->a(Lcom/daaw/g70;)Lcom/daaw/f60;

    move-result-object v0

    return-object v0
.end method

.method public m(I)Lcom/daaw/f60;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    iput p1, p0, Lcom/daaw/f60;->A:I

    return-object p0
.end method

.method public final n()Lcom/daaw/dz0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/f60;->H:Lcom/daaw/dz0;

    sget-object v1, Lcom/daaw/dz0;->s:Lcom/daaw/dz0;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/daaw/dz0;->r:Lcom/daaw/dz0;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/dz0;->r:Lcom/daaw/dz0;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/daaw/dz0;->q:Lcom/daaw/dz0;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/daaw/dz0;->p:Lcom/daaw/dz0;

    :goto_0
    return-object v0
.end method

.method public o(II)Lcom/daaw/x50;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/daaw/x50<",
            "TTranscodeType;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/o41;

    iget-object v1, p0, Lcom/daaw/f60;->r:Lcom/daaw/e70;

    invoke-virtual {v1}, Lcom/daaw/e70;->p()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lcom/daaw/o41;-><init>(Landroid/os/Handler;II)V

    iget-object p1, p0, Lcom/daaw/f60;->r:Lcom/daaw/e70;

    invoke-virtual {p1}, Lcom/daaw/e70;->p()Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/f60$a;

    invoke-direct {p2, p0, v0}, Lcom/daaw/f60$a;-><init>(Lcom/daaw/f60;Lcom/daaw/o41;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v0
.end method

.method public p(Landroid/widget/ImageView;)Lcom/daaw/pj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Lcom/daaw/pj1<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/tq1;->b()V

    if-eqz p1, :cond_3

    iget-boolean v0, p0, Lcom/daaw/f60;->O:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/daaw/f60$b;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/f60;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/f60;->b()V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/daaw/f60;->r:Lcom/daaw/e70;

    iget-object v1, p0, Lcom/daaw/f60;->s:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/e70;->c(Landroid/widget/ImageView;Ljava/lang/Class;)Lcom/daaw/pj1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/f60;->r(Lcom/daaw/pj1;)Lcom/daaw/pj1;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must pass in a non null View"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r(Lcom/daaw/pj1;)Lcom/daaw/pj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lcom/daaw/pj1<",
            "TTranscodeType;>;>(TY;)TY;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/tq1;->b()V

    if-eqz p1, :cond_2

    iget-boolean v0, p0, Lcom/daaw/f60;->y:Z

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/daaw/pj1;->j()Lcom/daaw/l41;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/l41;->clear()V

    iget-object v1, p0, Lcom/daaw/f60;->t:Lcom/daaw/v41;

    invoke-virtual {v1, v0}, Lcom/daaw/v41;->c(Lcom/daaw/l41;)V

    invoke-interface {v0}, Lcom/daaw/l41;->c()V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/f60;->d(Lcom/daaw/pj1;)Lcom/daaw/l41;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/pj1;->b(Lcom/daaw/l41;)V

    iget-object v1, p0, Lcom/daaw/f60;->u:Lcom/daaw/mj0;

    invoke-interface {v1, p1}, Lcom/daaw/mj0;->a(Lcom/daaw/qj0;)V

    iget-object v1, p0, Lcom/daaw/f60;->t:Lcom/daaw/v41;

    invoke-virtual {v1, v0}, Lcom/daaw/v41;->f(Lcom/daaw/l41;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must first set a model (try #load())"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must pass in a non null Target"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s(Lcom/daaw/q41;)Lcom/daaw/f60;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/q41<",
            "-TModelType;TTranscodeType;>;)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/f60;->B:Lcom/daaw/q41;

    return-object p0
.end method

.method public t(Ljava/lang/Object;)Lcom/daaw/f60;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModelType;)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/f60;->w:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/f60;->y:Z

    return-object p0
.end method

.method public final u(Lcom/daaw/pj1;FLcom/daaw/dz0;Lcom/daaw/m41;)Lcom/daaw/l41;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/pj1<",
            "TTranscodeType;>;F",
            "Lcom/daaw/dz0;",
            "Lcom/daaw/m41;",
            ")",
            "Lcom/daaw/l41;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v7, p2

    move-object/from16 v5, p3

    move-object/from16 v15, p4

    iget-object v1, v0, Lcom/daaw/f60;->v:Lcom/daaw/cf;

    iget-object v2, v0, Lcom/daaw/f60;->w:Ljava/lang/Object;

    iget-object v3, v0, Lcom/daaw/f60;->x:Lcom/daaw/hi0;

    iget-object v4, v0, Lcom/daaw/f60;->q:Landroid/content/Context;

    iget-object v8, v0, Lcom/daaw/f60;->F:Landroid/graphics/drawable/Drawable;

    iget v9, v0, Lcom/daaw/f60;->z:I

    iget-object v10, v0, Lcom/daaw/f60;->G:Landroid/graphics/drawable/Drawable;

    iget v11, v0, Lcom/daaw/f60;->A:I

    iget-object v12, v0, Lcom/daaw/f60;->Q:Landroid/graphics/drawable/Drawable;

    iget v13, v0, Lcom/daaw/f60;->R:I

    iget-object v14, v0, Lcom/daaw/f60;->B:Lcom/daaw/q41;

    move-object/from16 p1, v1

    iget-object v1, v0, Lcom/daaw/f60;->r:Lcom/daaw/e70;

    invoke-virtual {v1}, Lcom/daaw/e70;->n()Lcom/daaw/fx;

    move-result-object v16

    iget-object v1, v0, Lcom/daaw/f60;->N:Lcom/daaw/cn1;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/daaw/f60;->s:Ljava/lang/Class;

    move-object/from16 v18, v1

    iget-boolean v1, v0, Lcom/daaw/f60;->I:Z

    move/from16 v19, v1

    iget-object v1, v0, Lcom/daaw/f60;->J:Lcom/daaw/g70;

    move-object/from16 v20, v1

    iget v1, v0, Lcom/daaw/f60;->L:I

    move/from16 v21, v1

    iget v1, v0, Lcom/daaw/f60;->K:I

    move/from16 v22, v1

    iget-object v1, v0, Lcom/daaw/f60;->M:Lcom/daaw/wt;

    move-object/from16 v23, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v23}, Lcom/daaw/e60;->v(Lcom/daaw/ik0;Ljava/lang/Object;Lcom/daaw/hi0;Landroid/content/Context;Lcom/daaw/dz0;Lcom/daaw/pj1;FLandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;ILcom/daaw/q41;Lcom/daaw/m41;Lcom/daaw/fx;Lcom/daaw/cn1;Ljava/lang/Class;ZLcom/daaw/g70;IILcom/daaw/wt;)Lcom/daaw/e60;

    move-result-object v1

    return-object v1
.end method

.method public v(II)Lcom/daaw/f60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/daaw/tq1;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/f60;->L:I

    iput p2, p0, Lcom/daaw/f60;->K:I

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Width and height must be Target#SIZE_ORIGINAL or > 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public w(I)Lcom/daaw/f60;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    iput p1, p0, Lcom/daaw/f60;->z:I

    return-object p0
.end method

.method public x(Lcom/daaw/hi0;)Lcom/daaw/f60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            ")",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    const-string v0, "Signature must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/f60;->x:Lcom/daaw/hi0;

    return-object p0
.end method

.method public y(Z)Lcom/daaw/f60;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/f60;->I:Z

    return-object p0
.end method

.method public z(Lcom/daaw/zw;)Lcom/daaw/f60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zw<",
            "TDataType;>;)",
            "Lcom/daaw/f60<",
            "TModelType;TDataType;TResourceType;TTranscodeType;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/f60;->v:Lcom/daaw/cf;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/cf;->k(Lcom/daaw/zw;)V

    :cond_0
    return-object p0
.end method
