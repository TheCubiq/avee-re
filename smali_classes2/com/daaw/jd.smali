.class public final Lcom/daaw/jd;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/id;

.field public final b:Lcom/daaw/id;

.field public final c:Lcom/daaw/id;

.field public final d:Lcom/daaw/id;

.field public final e:Lcom/daaw/id;

.field public final f:Lcom/daaw/id;

.field public final g:Lcom/daaw/id;

.field public final h:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/daaw/w01;->r:I

    const-class v1, Lcom/google/android/material/datepicker/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/daaw/en0;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result v0

    sget-object v1, Lcom/daaw/m21;->l2:[I

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/daaw/m21;->o2:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lcom/daaw/id;->a(Landroid/content/Context;I)Lcom/daaw/id;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/jd;->a:Lcom/daaw/id;

    sget v1, Lcom/daaw/m21;->m2:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lcom/daaw/id;->a(Landroid/content/Context;I)Lcom/daaw/id;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/jd;->g:Lcom/daaw/id;

    sget v1, Lcom/daaw/m21;->n2:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lcom/daaw/id;->a(Landroid/content/Context;I)Lcom/daaw/id;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/jd;->b:Lcom/daaw/id;

    sget v1, Lcom/daaw/m21;->p2:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lcom/daaw/id;->a(Landroid/content/Context;I)Lcom/daaw/id;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/jd;->c:Lcom/daaw/id;

    sget v1, Lcom/daaw/m21;->q2:I

    invoke-static {p1, v0, v1}, Lcom/daaw/mn0;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    sget v3, Lcom/daaw/m21;->s2:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {p1, v3}, Lcom/daaw/id;->a(Landroid/content/Context;I)Lcom/daaw/id;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/jd;->d:Lcom/daaw/id;

    sget v3, Lcom/daaw/m21;->r2:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {p1, v3}, Lcom/daaw/id;->a(Landroid/content/Context;I)Lcom/daaw/id;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/jd;->e:Lcom/daaw/id;

    sget v3, Lcom/daaw/m21;->t2:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {p1, v2}, Lcom/daaw/id;->a(Landroid/content/Context;I)Lcom/daaw/id;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/jd;->f:Lcom/daaw/id;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/daaw/jd;->h:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
