.class public Lcom/daaw/cs0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/cs0$h;,
        Lcom/daaw/cs0$d;,
        Lcom/daaw/cs0$f;,
        Lcom/daaw/cs0$g;,
        Lcom/daaw/cs0$e;,
        Lcom/daaw/cs0$c;,
        Lcom/daaw/cs0$b;,
        Lcom/daaw/cs0$j;,
        Lcom/daaw/cs0$k;,
        Lcom/daaw/cs0$i;,
        Lcom/daaw/cs0$l;
    }
.end annotation


# instance fields
.field public A:Landroid/graphics/drawable/Drawable;

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public F:Z

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public final K:Landroid/view/View$OnClickListener;

.field public p:Lcom/google/android/material/internal/NavigationMenuView;

.field public q:Landroid/widget/LinearLayout;

.field public r:Landroidx/appcompat/view/menu/i$a;

.field public s:Landroidx/appcompat/view/menu/e;

.field public t:I

.field public u:Lcom/daaw/cs0$c;

.field public v:Landroid/view/LayoutInflater;

.field public w:I

.field public x:Z

.field public y:Landroid/content/res/ColorStateList;

.field public z:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/cs0;->F:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/cs0;->J:I

    new-instance v0, Lcom/daaw/cs0$a;

    invoke-direct {v0, p0}, Lcom/daaw/cs0$a;-><init>(Lcom/daaw/cs0;)V

    iput-object v0, p0, Lcom/daaw/cs0;->K:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/cs0;)I
    .locals 0

    iget p0, p0, Lcom/daaw/cs0;->G:I

    return p0
.end method


# virtual methods
.method public A(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/cs0;->t:I

    return-void
.end method

.method public B(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cs0;->A:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public C(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/cs0;->B:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public D(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/cs0;->C:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public E(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/cs0;->D:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/daaw/cs0;->D:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/cs0;->E:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    :cond_0
    return-void
.end method

.method public F(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cs0;->z:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public G(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/cs0;->G:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public H(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/cs0;->w:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/cs0;->x:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public I(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cs0;->y:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->c(Z)V

    return-void
.end method

.method public J(I)V
    .locals 1

    iput p1, p0, Lcom/daaw/cs0;->J:I

    iget-object v0, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    :cond_0
    return-void
.end method

.method public K(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/cs0$c;->H(Z)V

    :cond_0
    return-void
.end method

.method public final L()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/cs0;->F:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/cs0;->H:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    invoke-virtual {v2, v1, v0, v1, v3}, Landroid/view/ViewGroup;->setPadding(IIII)V

    return-void
.end method

.method public b(Landroidx/appcompat/view/menu/e;Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->r:Landroidx/appcompat/view/menu/i$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/menu/i$a;->b(Landroidx/appcompat/view/menu/e;Z)V

    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/cs0$c;->I()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroidx/appcompat/view/menu/e;Landroidx/appcompat/view/menu/g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public f(Landroidx/appcompat/view/menu/e;Landroidx/appcompat/view/menu/g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/daaw/cs0;->t:I

    return v0
.end method

.method public h(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, v1, v0}, Landroid/view/ViewGroup;->setPadding(IIII)V

    return-void
.end method

.method public i(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V
    .locals 1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/cs0;->v:Landroid/view/LayoutInflater;

    iput-object p2, p0, Lcom/daaw/cs0;->s:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/daaw/f11;->f:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/cs0;->I:I

    return-void
.end method

.method public j(Landroid/os/Parcelable;)V
    .locals 2

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "android:menu:list"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_0
    const-string v0, "android:menu:adapter"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    invoke-virtual {v1, v0}, Lcom/daaw/cs0$c;->F(Landroid/os/Bundle;)V

    :cond_1
    const-string v0, "android:menu:header"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_2
    return-void
.end method

.method public k(Lcom/daaw/px1;)V
    .locals 4

    invoke-virtual {p1}, Lcom/daaw/px1;->l()I

    move-result v0

    iget v1, p0, Lcom/daaw/cs0;->H:I

    if-eq v1, v0, :cond_0

    iput v0, p0, Lcom/daaw/cs0;->H:I

    invoke-virtual {p0}, Lcom/daaw/cs0;->L()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/px1;->i()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v3, v2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    iget-object v0, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    invoke-static {v0, p1}, Lcom/daaw/xs1;->i(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;

    return-void
.end method

.method public l(Landroidx/appcompat/view/menu/l;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public m()Landroid/os/Parcelable;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v1, :cond_0

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->saveHierarchyState(Landroid/util/SparseArray;)V

    const-string v2, "android:menu:list"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_0
    iget-object v1, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/cs0$c;->y()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "android:menu:adapter"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    iget-object v1, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_2

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->saveHierarchyState(Landroid/util/SparseArray;)V

    const-string v2, "android:menu:header"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_2
    return-object v0
.end method

.method public n()Landroidx/appcompat/view/menu/g;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    invoke-virtual {v0}, Lcom/daaw/cs0$c;->z()Landroidx/appcompat/view/menu/g;

    move-result-object v0

    return-object v0
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method public p(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public q()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->A:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lcom/daaw/cs0;->B:I

    return v0
.end method

.method public s()I
    .locals 1

    iget v0, p0, Lcom/daaw/cs0;->C:I

    return v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lcom/daaw/cs0;->G:I

    return v0
.end method

.method public u()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->y:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public v()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->z:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public w(Landroid/view/ViewGroup;)Landroidx/appcompat/view/menu/j;
    .locals 3

    iget-object v0, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/cs0;->v:Landroid/view/LayoutInflater;

    sget v1, Lcom/daaw/a21;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/NavigationMenuView;

    iput-object p1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    new-instance v0, Lcom/daaw/cs0$h;

    iget-object v1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-direct {v0, p0, v1}, Lcom/daaw/cs0$h;-><init>(Lcom/daaw/cs0;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Landroidx/recyclerview/widget/k;)V

    iget-object p1, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    if-nez p1, :cond_0

    new-instance p1, Lcom/daaw/cs0$c;

    invoke-direct {p1, p0}, Lcom/daaw/cs0$c;-><init>(Lcom/daaw/cs0;)V

    iput-object p1, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    :cond_0
    iget p1, p0, Lcom/daaw/cs0;->J:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/cs0;->v:Landroid/view/LayoutInflater;

    sget v0, Lcom/daaw/a21;->b:I

    iget-object v1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    iget-object p1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    iget-object v0, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    :cond_2
    iget-object p1, p0, Lcom/daaw/cs0;->p:Lcom/google/android/material/internal/NavigationMenuView;

    return-object p1
.end method

.method public x(I)Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lcom/daaw/cs0;->v:Landroid/view/LayoutInflater;

    iget-object v1, p0, Lcom/daaw/cs0;->q:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/cs0;->h(Landroid/view/View;)V

    return-object p1
.end method

.method public y(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/cs0;->F:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/daaw/cs0;->F:Z

    invoke-virtual {p0}, Lcom/daaw/cs0;->L()V

    :cond_0
    return-void
.end method

.method public z(Landroidx/appcompat/view/menu/g;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cs0;->u:Lcom/daaw/cs0$c;

    invoke-virtual {v0, p1}, Lcom/daaw/cs0$c;->G(Landroidx/appcompat/view/menu/g;)V

    return-void
.end method
