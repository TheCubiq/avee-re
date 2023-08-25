.class public final Lcom/daaw/nn0$c;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nn0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:Lcom/daaw/gc1;

.field public b:Lcom/daaw/yv;

.field public c:Landroid/graphics/ColorFilter;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/content/res/ColorStateList;

.field public g:Landroid/content/res/ColorStateList;

.field public h:Landroid/graphics/PorterDuff$Mode;

.field public i:Landroid/graphics/Rect;

.field public j:F

.field public k:F

.field public l:F

.field public m:I

.field public n:F

.field public o:F

.field public p:F

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:Z

.field public v:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(Lcom/daaw/gc1;Lcom/daaw/yv;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/nn0$c;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->g:Landroid/content/res/ColorStateList;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lcom/daaw/nn0$c;->h:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lcom/daaw/nn0$c;->i:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/nn0$c;->j:F

    iput v0, p0, Lcom/daaw/nn0$c;->k:F

    const/16 v0, 0xff

    iput v0, p0, Lcom/daaw/nn0$c;->m:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/nn0$c;->n:F

    iput v0, p0, Lcom/daaw/nn0$c;->o:F

    iput v0, p0, Lcom/daaw/nn0$c;->p:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/nn0$c;->q:I

    iput v0, p0, Lcom/daaw/nn0$c;->r:I

    iput v0, p0, Lcom/daaw/nn0$c;->s:I

    iput v0, p0, Lcom/daaw/nn0$c;->t:I

    iput-boolean v0, p0, Lcom/daaw/nn0$c;->u:Z

    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lcom/daaw/nn0$c;->v:Landroid/graphics/Paint$Style;

    iput-object p1, p0, Lcom/daaw/nn0$c;->a:Lcom/daaw/gc1;

    iput-object p2, p0, Lcom/daaw/nn0$c;->b:Lcom/daaw/yv;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/nn0$c;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/nn0$c;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->g:Landroid/content/res/ColorStateList;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lcom/daaw/nn0$c;->h:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lcom/daaw/nn0$c;->i:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/nn0$c;->j:F

    iput v0, p0, Lcom/daaw/nn0$c;->k:F

    const/16 v0, 0xff

    iput v0, p0, Lcom/daaw/nn0$c;->m:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/nn0$c;->n:F

    iput v0, p0, Lcom/daaw/nn0$c;->o:F

    iput v0, p0, Lcom/daaw/nn0$c;->p:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/nn0$c;->q:I

    iput v0, p0, Lcom/daaw/nn0$c;->r:I

    iput v0, p0, Lcom/daaw/nn0$c;->s:I

    iput v0, p0, Lcom/daaw/nn0$c;->t:I

    iput-boolean v0, p0, Lcom/daaw/nn0$c;->u:Z

    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lcom/daaw/nn0$c;->v:Landroid/graphics/Paint$Style;

    iget-object v0, p1, Lcom/daaw/nn0$c;->a:Lcom/daaw/gc1;

    iput-object v0, p0, Lcom/daaw/nn0$c;->a:Lcom/daaw/gc1;

    iget-object v0, p1, Lcom/daaw/nn0$c;->b:Lcom/daaw/yv;

    iput-object v0, p0, Lcom/daaw/nn0$c;->b:Lcom/daaw/yv;

    iget v0, p1, Lcom/daaw/nn0$c;->l:F

    iput v0, p0, Lcom/daaw/nn0$c;->l:F

    iget-object v0, p1, Lcom/daaw/nn0$c;->c:Landroid/graphics/ColorFilter;

    iput-object v0, p0, Lcom/daaw/nn0$c;->c:Landroid/graphics/ColorFilter;

    iget-object v0, p1, Lcom/daaw/nn0$c;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->d:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lcom/daaw/nn0$c;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->e:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lcom/daaw/nn0$c;->h:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lcom/daaw/nn0$c;->h:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p1, Lcom/daaw/nn0$c;->g:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->g:Landroid/content/res/ColorStateList;

    iget v0, p1, Lcom/daaw/nn0$c;->m:I

    iput v0, p0, Lcom/daaw/nn0$c;->m:I

    iget v0, p1, Lcom/daaw/nn0$c;->j:F

    iput v0, p0, Lcom/daaw/nn0$c;->j:F

    iget v0, p1, Lcom/daaw/nn0$c;->s:I

    iput v0, p0, Lcom/daaw/nn0$c;->s:I

    iget v0, p1, Lcom/daaw/nn0$c;->q:I

    iput v0, p0, Lcom/daaw/nn0$c;->q:I

    iget-boolean v0, p1, Lcom/daaw/nn0$c;->u:Z

    iput-boolean v0, p0, Lcom/daaw/nn0$c;->u:Z

    iget v0, p1, Lcom/daaw/nn0$c;->k:F

    iput v0, p0, Lcom/daaw/nn0$c;->k:F

    iget v0, p1, Lcom/daaw/nn0$c;->n:F

    iput v0, p0, Lcom/daaw/nn0$c;->n:F

    iget v0, p1, Lcom/daaw/nn0$c;->o:F

    iput v0, p0, Lcom/daaw/nn0$c;->o:F

    iget v0, p1, Lcom/daaw/nn0$c;->p:F

    iput v0, p0, Lcom/daaw/nn0$c;->p:F

    iget v0, p1, Lcom/daaw/nn0$c;->r:I

    iput v0, p0, Lcom/daaw/nn0$c;->r:I

    iget v0, p1, Lcom/daaw/nn0$c;->t:I

    iput v0, p0, Lcom/daaw/nn0$c;->t:I

    iget-object v0, p1, Lcom/daaw/nn0$c;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lcom/daaw/nn0$c;->f:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lcom/daaw/nn0$c;->v:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lcom/daaw/nn0$c;->v:Landroid/graphics/Paint$Style;

    iget-object v0, p1, Lcom/daaw/nn0$c;->i:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    iget-object p1, p1, Lcom/daaw/nn0$c;->i:Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lcom/daaw/nn0$c;->i:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lcom/daaw/nn0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/nn0;-><init>(Lcom/daaw/nn0$c;Lcom/daaw/nn0$a;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/nn0;->e(Lcom/daaw/nn0;Z)Z

    return-object v0
.end method
