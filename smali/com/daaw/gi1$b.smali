.class public Lcom/daaw/gi1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gi1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public A:Lcom/daaw/o0;

.field public B:Ljava/lang/CharSequence;

.field public C:Ljava/lang/CharSequence;

.field public D:Landroid/content/res/ColorStateList;

.field public E:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic F:Lcom/daaw/gi1;

.field public a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/gi1;Landroid/view/Menu;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/gi1$b;->D:Landroid/content/res/ColorStateList;

    iput-object p1, p0, Lcom/daaw/gi1$b;->E:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, Lcom/daaw/gi1$b;->a:Landroid/view/Menu;

    invoke-virtual {p0}, Lcom/daaw/gi1$b;->h()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->h:Z

    iget-object v0, p0, Lcom/daaw/gi1$b;->a:Landroid/view/Menu;

    iget v1, p0, Lcom/daaw/gi1$b;->b:I

    iget v2, p0, Lcom/daaw/gi1$b;->i:I

    iget v3, p0, Lcom/daaw/gi1$b;->j:I

    iget-object v4, p0, Lcom/daaw/gi1$b;->k:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/gi1$b;->i(Landroid/view/MenuItem;)V

    return-void
.end method

.method public b()Landroid/view/SubMenu;
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->h:Z

    iget-object v0, p0, Lcom/daaw/gi1$b;->a:Landroid/view/Menu;

    iget v1, p0, Lcom/daaw/gi1$b;->b:I

    iget v2, p0, Lcom/daaw/gi1$b;->i:I

    iget v3, p0, Lcom/daaw/gi1$b;->j:I

    iget-object v4, p0, Lcom/daaw/gi1$b;->k:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/gi1$b;->i(Landroid/view/MenuItem;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;)C
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/gi1$b;->h:Z

    return v0
.end method

.method public final e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    iget-object v1, v1, Lcom/daaw/gi1;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Cannot instantiate class: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Landroid/util/AttributeSet;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    iget-object v0, v0, Lcom/daaw/gi1;->c:Landroid/content/Context;

    sget-object v1, Lcom/daaw/x21;->o1:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lcom/daaw/x21;->q1:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->b:I

    sget v0, Lcom/daaw/x21;->s1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->c:I

    sget v0, Lcom/daaw/x21;->t1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->d:I

    sget v0, Lcom/daaw/x21;->u1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->e:I

    sget v0, Lcom/daaw/x21;->r1:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->f:Z

    sget v0, Lcom/daaw/x21;->p1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->g:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public g(Landroid/util/AttributeSet;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    iget-object v0, v0, Lcom/daaw/gi1;->c:Landroid/content/Context;

    sget-object v1, Lcom/daaw/x21;->v1:[I

    invoke-static {v0, p1, v1}, Lcom/daaw/ul1;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lcom/daaw/ul1;

    move-result-object p1

    sget v0, Lcom/daaw/x21;->y1:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->n(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->i:I

    sget v0, Lcom/daaw/x21;->B1:I

    iget v2, p0, Lcom/daaw/gi1$b;->c:I

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v0

    sget v2, Lcom/daaw/x21;->C1:I

    iget v3, p0, Lcom/daaw/gi1$b;->d:I

    invoke-virtual {p1, v2, v3}, Lcom/daaw/ul1;->k(II)I

    move-result v2

    const/high16 v3, -0x10000

    and-int/2addr v0, v3

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/gi1$b;->j:I

    sget v0, Lcom/daaw/x21;->D1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->k:Ljava/lang/CharSequence;

    sget v0, Lcom/daaw/x21;->E1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->l:Ljava/lang/CharSequence;

    sget v0, Lcom/daaw/x21;->w1:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->n(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->m:I

    sget v0, Lcom/daaw/x21;->F1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->o(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/gi1$b;->c(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, Lcom/daaw/gi1$b;->n:C

    sget v0, Lcom/daaw/x21;->M1:I

    const/16 v2, 0x1000

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->o:I

    sget v0, Lcom/daaw/x21;->G1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->o(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/gi1$b;->c(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, Lcom/daaw/gi1$b;->p:C

    sget v0, Lcom/daaw/x21;->Q1:I

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->q:I

    sget v0, Lcom/daaw/x21;->H1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->s(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->a(IZ)Z

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/daaw/gi1$b;->e:I

    :goto_0
    iput v0, p0, Lcom/daaw/gi1$b;->r:I

    sget v0, Lcom/daaw/x21;->z1:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->s:Z

    sget v0, Lcom/daaw/x21;->A1:I

    iget-boolean v2, p0, Lcom/daaw/gi1$b;->f:Z

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ul1;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->t:Z

    sget v0, Lcom/daaw/x21;->x1:I

    iget-boolean v2, p0, Lcom/daaw/gi1$b;->g:Z

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ul1;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->u:Z

    sget v0, Lcom/daaw/x21;->R1:I

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->v:I

    sget v0, Lcom/daaw/x21;->I1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->o(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->z:Ljava/lang/String;

    sget v0, Lcom/daaw/x21;->J1:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ul1;->n(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/gi1$b;->w:I

    sget v0, Lcom/daaw/x21;->L1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->o(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->x:Ljava/lang/String;

    sget v0, Lcom/daaw/x21;->K1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->o(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget v3, p0, Lcom/daaw/gi1$b;->w:I

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/daaw/gi1$b;->x:Ljava/lang/String;

    if-nez v3, :cond_2

    sget-object v3, Lcom/daaw/gi1;->f:[Ljava/lang/Class;

    iget-object v5, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    iget-object v5, v5, Lcom/daaw/gi1;->b:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v3, v5}, Lcom/daaw/gi1$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o0;

    iput-object v0, p0, Lcom/daaw/gi1$b;->A:Lcom/daaw/o0;

    goto :goto_2

    :cond_2
    iput-object v4, p0, Lcom/daaw/gi1$b;->A:Lcom/daaw/o0;

    :goto_2
    sget v0, Lcom/daaw/x21;->N1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->B:Ljava/lang/CharSequence;

    sget v0, Lcom/daaw/x21;->S1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->C:Ljava/lang/CharSequence;

    sget v0, Lcom/daaw/x21;->P1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->s(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1, v0, v2}, Lcom/daaw/ul1;->k(II)I

    move-result v0

    iget-object v2, p0, Lcom/daaw/gi1$b;->E:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v2}, Lcom/daaw/vu;->e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->E:Landroid/graphics/PorterDuff$Mode;

    goto :goto_3

    :cond_3
    iput-object v4, p0, Lcom/daaw/gi1$b;->E:Landroid/graphics/PorterDuff$Mode;

    :goto_3
    sget v0, Lcom/daaw/x21;->O1:I

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->s(I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1, v0}, Lcom/daaw/ul1;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gi1$b;->D:Landroid/content/res/ColorStateList;

    goto :goto_4

    :cond_4
    iput-object v4, p0, Lcom/daaw/gi1$b;->D:Landroid/content/res/ColorStateList;

    :goto_4
    invoke-virtual {p1}, Lcom/daaw/ul1;->w()V

    iput-boolean v1, p0, Lcom/daaw/gi1$b;->h:Z

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/gi1$b;->b:I

    iput v0, p0, Lcom/daaw/gi1$b;->c:I

    iput v0, p0, Lcom/daaw/gi1$b;->d:I

    iput v0, p0, Lcom/daaw/gi1$b;->e:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->f:Z

    iput-boolean v0, p0, Lcom/daaw/gi1$b;->g:Z

    return-void
.end method

.method public final i(Landroid/view/MenuItem;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/gi1$b;->s:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/gi1$b;->t:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/gi1$b;->u:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Lcom/daaw/gi1$b;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/gi1$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Lcom/daaw/gi1$b;->m:I

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    iget v0, p0, Lcom/daaw/gi1$b;->v:I

    if-ltz v0, :cond_1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    :cond_1
    iget-object v0, p0, Lcom/daaw/gi1$b;->z:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    iget-object v0, v0, Lcom/daaw/gi1;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/daaw/gi1$a;

    iget-object v1, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    invoke-virtual {v1}, Lcom/daaw/gi1;->b()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, Lcom/daaw/gi1$b;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v4}, Lcom/daaw/gi1$a;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iget v0, p0, Lcom/daaw/gi1$b;->r:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_5

    instance-of v0, p1, Landroidx/appcompat/view/menu/g;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0, v3}, Landroidx/appcompat/view/menu/g;->t(Z)V

    goto :goto_2

    :cond_4
    instance-of v0, p1, Lcom/daaw/jp0;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/daaw/jp0;

    invoke-virtual {v0, v3}, Lcom/daaw/jp0;->h(Z)V

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/daaw/gi1$b;->x:Ljava/lang/String;

    if-eqz v0, :cond_6

    sget-object v1, Lcom/daaw/gi1;->e:[Ljava/lang/Class;

    iget-object v2, p0, Lcom/daaw/gi1$b;->F:Lcom/daaw/gi1;

    iget-object v2, v2, Lcom/daaw/gi1;->a:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/gi1$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    const/4 v2, 0x1

    :cond_6
    iget v0, p0, Lcom/daaw/gi1$b;->w:I

    if-lez v0, :cond_7

    if-nez v2, :cond_7

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    :cond_7
    iget-object v0, p0, Lcom/daaw/gi1$b;->A:Lcom/daaw/o0;

    if-eqz v0, :cond_8

    invoke-static {p1, v0}, Lcom/daaw/hp0;->a(Landroid/view/MenuItem;Lcom/daaw/o0;)Landroid/view/MenuItem;

    :cond_8
    iget-object v0, p0, Lcom/daaw/gi1$b;->B:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lcom/daaw/hp0;->c(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/gi1$b;->C:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lcom/daaw/hp0;->g(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    iget-char v0, p0, Lcom/daaw/gi1$b;->n:C

    iget v1, p0, Lcom/daaw/gi1$b;->o:I

    invoke-static {p1, v0, v1}, Lcom/daaw/hp0;->b(Landroid/view/MenuItem;CI)V

    iget-char v0, p0, Lcom/daaw/gi1$b;->p:C

    iget v1, p0, Lcom/daaw/gi1$b;->q:I

    invoke-static {p1, v0, v1}, Lcom/daaw/hp0;->f(Landroid/view/MenuItem;CI)V

    iget-object v0, p0, Lcom/daaw/gi1$b;->E:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_9

    invoke-static {p1, v0}, Lcom/daaw/hp0;->e(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V

    :cond_9
    iget-object v0, p0, Lcom/daaw/gi1$b;->D:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_a

    invoke-static {p1, v0}, Lcom/daaw/hp0;->d(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V

    :cond_a
    return-void
.end method
