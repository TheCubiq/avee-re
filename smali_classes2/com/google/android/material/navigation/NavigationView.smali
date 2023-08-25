.class public Lcom/google/android/material/navigation/NavigationView;
.super Lcom/daaw/i91;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationView$SavedState;,
        Lcom/google/android/material/navigation/NavigationView$c;
    }
.end annotation


# static fields
.field public static final B:[I

.field public static final C:[I

.field public static final D:I


# instance fields
.field public A:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public final u:Lcom/daaw/bs0;

.field public final v:Lcom/daaw/cs0;

.field public w:Lcom/google/android/material/navigation/NavigationView$c;

.field public final x:I

.field public final y:[I

.field public z:Landroid/view/MenuInflater;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x10100a0

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lcom/google/android/material/navigation/NavigationView;->B:[I

    new-array v0, v0, [I

    const v1, -0x101009e

    aput v1, v0, v3

    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->C:[I

    sget v0, Lcom/daaw/k21;->f:I

    sput v0, Lcom/google/android/material/navigation/NavigationView;->D:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lcom/daaw/w01;->u:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    sget v6, Lcom/google/android/material/navigation/NavigationView;->D:I

    invoke-static {p1, p2, p3, v6}, Lcom/daaw/qn0;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/i91;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lcom/daaw/cs0;

    invoke-direct {p1}, Lcom/daaw/cs0;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->y:[I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v7

    new-instance v8, Lcom/daaw/bs0;

    invoke-direct {v8, v7}, Lcom/daaw/bs0;-><init>(Landroid/content/Context;)V

    iput-object v8, p0, Lcom/google/android/material/navigation/NavigationView;->u:Lcom/daaw/bs0;

    sget-object v2, Lcom/daaw/m21;->j3:[I

    const/4 v9, 0x0

    new-array v5, v9, [I

    move-object v0, v7

    move-object v1, p2

    move v3, p3

    move v4, v6

    invoke-static/range {v0 .. v5}, Lcom/daaw/xk1;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Lcom/daaw/ul1;

    move-result-object v0

    sget v1, Lcom/daaw/m21;->k3:I

    invoke-virtual {v0, v1}, Lcom/daaw/ul1;->s(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/daaw/xs1;->v0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v1, v1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v1, :cond_3

    :cond_1
    invoke-static {v7, p2, p3, v6}, Lcom/daaw/gc1;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)Lcom/daaw/gc1$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/gc1$b;->m()Lcom/daaw/gc1;

    move-result-object p2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    new-instance v1, Lcom/daaw/nn0;

    invoke-direct {v1, p2}, Lcom/daaw/nn0;-><init>(Lcom/daaw/gc1;)V

    instance-of p2, p3, Landroid/graphics/drawable/ColorDrawable;

    if-eqz p2, :cond_2

    check-cast p3, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p3}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/daaw/nn0;->W(Landroid/content/res/ColorStateList;)V

    :cond_2
    invoke-virtual {v1, v7}, Lcom/daaw/nn0;->M(Landroid/content/Context;)V

    invoke-static {p0, v1}, Lcom/daaw/xs1;->v0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    :cond_3
    sget p2, Lcom/daaw/m21;->n3:I

    invoke-virtual {v0, p2}, Lcom/daaw/ul1;->s(I)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {v0, p2, v9}, Lcom/daaw/ul1;->f(II)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    :cond_4
    sget p2, Lcom/daaw/m21;->l3:I

    invoke-virtual {v0, p2, v9}, Lcom/daaw/ul1;->a(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->setFitsSystemWindows(Z)V

    sget p2, Lcom/daaw/m21;->m3:I

    invoke-virtual {v0, p2, v9}, Lcom/daaw/ul1;->f(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    sget p2, Lcom/daaw/m21;->t3:I

    invoke-virtual {v0, p2}, Lcom/daaw/ul1;->s(I)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {v0, p2}, Lcom/daaw/ul1;->c(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    goto :goto_0

    :cond_5
    const p2, 0x1010038

    invoke-virtual {p0, p2}, Lcom/google/android/material/navigation/NavigationView;->d(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    :goto_0
    sget p3, Lcom/daaw/m21;->C3:I

    invoke-virtual {v0, p3}, Lcom/daaw/ul1;->s(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    invoke-virtual {v0, p3, v9}, Lcom/daaw/ul1;->n(II)I

    move-result p3

    const/4 v1, 0x1

    goto :goto_1

    :cond_6
    const/4 p3, 0x0

    const/4 v1, 0x0

    :goto_1
    sget v3, Lcom/daaw/m21;->s3:I

    invoke-virtual {v0, v3}, Lcom/daaw/ul1;->s(I)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v0, v3, v9}, Lcom/daaw/ul1;->f(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    :cond_7
    const/4 v3, 0x0

    sget v4, Lcom/daaw/m21;->D3:I

    invoke-virtual {v0, v4}, Lcom/daaw/ul1;->s(I)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v0, v4}, Lcom/daaw/ul1;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :cond_8
    if-nez v1, :cond_9

    if-nez v3, :cond_9

    const v3, 0x1010036

    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/NavigationView;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :cond_9
    sget v4, Lcom/daaw/m21;->p3:I

    invoke-virtual {v0, v4}, Lcom/daaw/ul1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-nez v4, :cond_a

    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationView;->g(Lcom/daaw/ul1;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationView;->e(Lcom/daaw/ul1;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    :cond_a
    sget v5, Lcom/daaw/m21;->q3:I

    invoke-virtual {v0, v5}, Lcom/daaw/ul1;->s(I)Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual {v0, v5, v9}, Lcom/daaw/ul1;->f(II)I

    move-result v5

    invoke-virtual {p1, v5}, Lcom/daaw/cs0;->C(I)V

    :cond_b
    sget v5, Lcom/daaw/m21;->r3:I

    invoke-virtual {v0, v5, v9}, Lcom/daaw/ul1;->f(II)I

    move-result v5

    sget v6, Lcom/daaw/m21;->u3:I

    invoke-virtual {v0, v6, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v6

    invoke-virtual {p0, v6}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    new-instance v6, Lcom/google/android/material/navigation/NavigationView$a;

    invoke-direct {v6, p0}, Lcom/google/android/material/navigation/NavigationView$a;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    invoke-virtual {v8, v6}, Landroidx/appcompat/view/menu/e;->V(Landroidx/appcompat/view/menu/e$a;)V

    invoke-virtual {p1, v2}, Lcom/daaw/cs0;->A(I)V

    invoke-virtual {p1, v7, v8}, Lcom/daaw/cs0;->i(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V

    invoke-virtual {p1, p2}, Lcom/daaw/cs0;->F(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getOverScrollMode()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/cs0;->J(I)V

    if-eqz v1, :cond_c

    invoke-virtual {p1, p3}, Lcom/daaw/cs0;->H(I)V

    :cond_c
    invoke-virtual {p1, v3}, Lcom/daaw/cs0;->I(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p1, v4}, Lcom/daaw/cs0;->B(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v5}, Lcom/daaw/cs0;->D(I)V

    invoke-virtual {v8, p1}, Landroidx/appcompat/view/menu/e;->b(Landroidx/appcompat/view/menu/i;)V

    invoke-virtual {p1, p0}, Lcom/daaw/cs0;->w(Landroid/view/ViewGroup;)Landroidx/appcompat/view/menu/j;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    sget p1, Lcom/daaw/m21;->E3:I

    invoke-virtual {v0, p1}, Lcom/daaw/ul1;->s(I)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-virtual {v0, p1, v9}, Lcom/daaw/ul1;->n(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->i(I)V

    :cond_d
    sget p1, Lcom/daaw/m21;->o3:I

    invoke-virtual {v0, p1}, Lcom/daaw/ul1;->s(I)Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-virtual {v0, p1, v9}, Lcom/daaw/ul1;->n(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->h(I)Landroid/view/View;

    :cond_e
    invoke-virtual {v0}, Lcom/daaw/ul1;->w()V

    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->j()V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/material/navigation/NavigationView;)[I
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->y:[I

    return-object p0
.end method

.method public static synthetic c(Lcom/google/android/material/navigation/NavigationView;)Lcom/daaw/cs0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    return-object p0
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->z:Landroid/view/MenuInflater;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/gi1;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/gi1;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->z:Landroid/view/MenuInflater;

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->z:Landroid/view/MenuInflater;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/daaw/px1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->k(Lcom/daaw/px1;)V

    return-void
.end method

.method public final d(I)Landroid/content/res/ColorStateList;
    .locals 10

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p1, v3}, Lcom/daaw/r4;->a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Lcom/daaw/x01;->y:I

    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v1

    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    new-instance v3, Landroid/content/res/ColorStateList;

    const/4 v4, 0x3

    new-array v5, v4, [[I

    sget-object v6, Lcom/google/android/material/navigation/NavigationView;->C:[I

    const/4 v7, 0x0

    aput-object v6, v5, v7

    sget-object v8, Lcom/google/android/material/navigation/NavigationView;->B:[I

    aput-object v8, v5, v2

    sget-object v8, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    const/4 v9, 0x2

    aput-object v8, v5, v9

    new-array v4, v4, [I

    invoke-virtual {p1, v6, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    aput p1, v4, v7

    aput v0, v4, v2

    aput v1, v4, v9

    invoke-direct {v3, v5, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v3
.end method

.method public final e(Lcom/daaw/ul1;)Landroid/graphics/drawable/Drawable;
    .locals 9

    sget v0, Lcom/daaw/m21;->v3:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->n(II)I

    move-result v0

    sget v2, Lcom/daaw/m21;->w3:I

    invoke-virtual {p1, v2, v1}, Lcom/daaw/ul1;->n(II)I

    move-result v2

    new-instance v4, Lcom/daaw/nn0;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0, v2}, Lcom/daaw/gc1;->b(Landroid/content/Context;II)Lcom/daaw/gc1$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/gc1$b;->m()Lcom/daaw/gc1;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/daaw/nn0;-><init>(Lcom/daaw/gc1;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/daaw/m21;->x3:I

    invoke-static {v0, p1, v2}, Lcom/daaw/mn0;->b(Landroid/content/Context;Lcom/daaw/ul1;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/daaw/nn0;->W(Landroid/content/res/ColorStateList;)V

    sget v0, Lcom/daaw/m21;->A3:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->f(II)I

    move-result v5

    sget v0, Lcom/daaw/m21;->B3:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->f(II)I

    move-result v6

    sget v0, Lcom/daaw/m21;->z3:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->f(II)I

    move-result v7

    sget v0, Lcom/daaw/m21;->y3:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->f(II)I

    move-result v8

    new-instance p1, Landroid/graphics/drawable/InsetDrawable;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    return-object p1
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->p(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/daaw/ul1;)Z
    .locals 1

    sget v0, Lcom/daaw/m21;->v3:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->s(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lcom/daaw/m21;->w3:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->s(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public getCheckedItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->n()Landroidx/appcompat/view/menu/g;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderCount()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->o()I

    move-result v0

    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->q()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getItemHorizontalPadding()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->r()I

    move-result v0

    return v0
.end method

.method public getItemIconPadding()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->s()I

    move-result v0

    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->v()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getItemMaxLines()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->t()I

    move-result v0

    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0}, Lcom/daaw/cs0;->u()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->u:Lcom/daaw/bs0;

    return-object v0
.end method

.method public h(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->x(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public i(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/cs0;->K(Z)V

    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->u:Lcom/daaw/bs0;

    invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/cs0;->K(Z)V

    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {p1, v0}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public final j()V
    .locals 2

    new-instance v0, Lcom/google/android/material/navigation/NavigationView$b;

    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/NavigationView$b;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->A:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->A:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Lcom/daaw/i91;->onAttachedToWindow()V

    invoke-static {p0}, Lcom/daaw/on0;->e(Landroid/view/View;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lcom/daaw/i91;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->A:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :goto_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->a()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->u:Lcom/daaw/bs0;

    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->r:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->S(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationView$SavedState;-><init>(Landroid/os/Parcelable;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->r:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->u:Lcom/daaw/bs0;

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/e;->U(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public setCheckedItem(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->u:Lcom/daaw/bs0;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    check-cast p1, Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->z(Landroidx/appcompat/view/menu/g;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->u:Lcom/daaw/bs0;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    check-cast p1, Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->z(Landroidx/appcompat/view/menu/g;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setElevation(F)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setElevation(F)V

    :cond_0
    invoke-static {p0, p1}, Lcom/daaw/on0;->d(Landroid/view/View;F)V

    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->B(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/zk;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->C(I)V

    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->C(I)V

    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->D(I)V

    return-void
.end method

.method public setItemIconPaddingResource(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->D(I)V

    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->E(I)V

    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->F(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->G(I)V

    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->H(I)V

    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->I(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->w:Lcom/google/android/material/navigation/NavigationView$c;

    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setOverScrollMode(I)V

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Lcom/daaw/cs0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/cs0;->J(I)V

    :cond_0
    return-void
.end method
