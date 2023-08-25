.class public Lcom/daaw/xs1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "PrivateConstructorForUtilityClass"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/xs1$l;,
        Lcom/daaw/xs1$p;,
        Lcom/daaw/xs1$h;,
        Lcom/daaw/xs1$i;,
        Lcom/daaw/xs1$g;,
        Lcom/daaw/xs1$k;,
        Lcom/daaw/xs1$j;,
        Lcom/daaw/xs1$o;,
        Lcom/daaw/xs1$r;,
        Lcom/daaw/xs1$q;,
        Lcom/daaw/xs1$n;,
        Lcom/daaw/xs1$m;,
        Lcom/daaw/xs1$v;,
        Lcom/daaw/xs1$e;,
        Lcom/daaw/xs1$f;,
        Lcom/daaw/xs1$u;,
        Lcom/daaw/xs1$t;,
        Lcom/daaw/xs1$s;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Lcom/daaw/ut1;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Ljava/lang/reflect/Field;

.field public static e:Z

.field public static f:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:[I

.field public static final h:Lcom/daaw/iu0;

.field public static final i:Lcom/daaw/xs1$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/daaw/xs1;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/xs1;->c:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/daaw/xs1;->e:Z

    const/16 v2, 0x20

    new-array v2, v2, [I

    sget v3, Lcom/daaw/q11;->b:I

    aput v3, v2, v0

    sget v0, Lcom/daaw/q11;->c:I

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->n:I

    const/4 v1, 0x2

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->y:I

    const/4 v1, 0x3

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->B:I

    const/4 v1, 0x4

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->C:I

    const/4 v1, 0x5

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->D:I

    const/4 v1, 0x6

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->E:I

    const/4 v1, 0x7

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->F:I

    const/16 v1, 0x8

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->G:I

    const/16 v1, 0x9

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->d:I

    const/16 v1, 0xa

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->e:I

    const/16 v1, 0xb

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->f:I

    const/16 v1, 0xc

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->g:I

    const/16 v1, 0xd

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->h:I

    const/16 v1, 0xe

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->i:I

    const/16 v1, 0xf

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->j:I

    const/16 v1, 0x10

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->k:I

    const/16 v1, 0x11

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->l:I

    const/16 v1, 0x12

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->m:I

    const/16 v1, 0x13

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->o:I

    const/16 v1, 0x14

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->p:I

    const/16 v1, 0x15

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->q:I

    const/16 v1, 0x16

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->r:I

    const/16 v1, 0x17

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->s:I

    const/16 v1, 0x18

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->t:I

    const/16 v1, 0x19

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->u:I

    const/16 v1, 0x1a

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->v:I

    const/16 v1, 0x1b

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->w:I

    const/16 v1, 0x1c

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->x:I

    const/16 v1, 0x1d

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->z:I

    const/16 v1, 0x1e

    aput v0, v2, v1

    sget v0, Lcom/daaw/q11;->A:I

    const/16 v1, 0x1f

    aput v0, v2, v1

    sput-object v2, Lcom/daaw/xs1;->g:[I

    sget-object v0, Lcom/daaw/ws1;->p:Lcom/daaw/ws1;

    sput-object v0, Lcom/daaw/xs1;->h:Lcom/daaw/iu0;

    new-instance v0, Lcom/daaw/xs1$e;

    invoke-direct {v0}, Lcom/daaw/xs1$e;-><init>()V

    sput-object v0, Lcom/daaw/xs1;->i:Lcom/daaw/xs1$e;

    return-void
.end method

.method public static A(Landroid/view/View;)Lcom/daaw/iu0;
    .locals 1

    instance-of v0, p0, Lcom/daaw/iu0;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/iu0;

    return-object p0

    :cond_0
    sget-object p0, Lcom/daaw/xs1;->h:Lcom/daaw/iu0;

    return-object p0
.end method

.method public static A0(Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/xs1$h;->r(Landroid/view/View;Z)V

    return-void
.end method

.method public static B(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->b(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static B0(Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/xs1$h;->s(Landroid/view/View;I)V

    return-void
.end method

.method public static C(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->c(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static C0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lcom/daaw/xs1$o;->l(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public static D(Landroid/view/View;)I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$o;->b(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static D0(Landroid/view/View;Lcom/daaw/vt0;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lcom/daaw/xs1$m;->u(Landroid/view/View;Lcom/daaw/vt0;)V

    :cond_0
    return-void
.end method

.method public static E(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$i;->d(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static E0(Landroid/view/View;IIII)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/xs1$i;->k(Landroid/view/View;IIII)V

    return-void
.end method

.method public static F(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->d(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static F0(Landroid/view/View;Z)V
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->q0()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/daaw/xs1$f;->g(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method public static G(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->e(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static G0(Landroid/view/View;II)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lcom/daaw/xs1$n;->d(Landroid/view/View;II)V

    :cond_0
    return-void
.end method

.method public static H(Landroid/view/View;)[Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$s;->a(Landroid/view/View;)[Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    sget v0, Lcom/daaw/q11;->N:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static H0(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->K0()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/daaw/xs1$f;->g(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method public static I(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$i;->e(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static I0(Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lcom/daaw/xs1$m;->v(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/xs1;->b:Ljava/util/WeakHashMap;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/daaw/xs1;->b:Ljava/util/WeakHashMap;

    :cond_1
    sget-object v0, Lcom/daaw/xs1;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public static J(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$i;->f(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static J0(Landroid/view/View;)V
    .locals 3

    invoke-static {p0}, Lcom/daaw/xs1;->C(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/daaw/xs1;->B0(Landroid/view/View;I)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Lcom/daaw/xs1;->C(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lcom/daaw/xs1;->B0(Landroid/view/View;I)V

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static K(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->f(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object p0

    return-object p0
.end method

.method public static K0()Lcom/daaw/xs1$f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/xs1$f<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/xs1$c;

    sget v1, Lcom/daaw/q11;->P:I

    const-class v2, Ljava/lang/CharSequence;

    const/16 v3, 0x40

    const/16 v4, 0x1e

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/xs1$c;-><init>(ILjava/lang/Class;II)V

    return-object v0
.end method

.method public static L(Landroid/view/View;)Lcom/daaw/px1;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$n;->a(Landroid/view/View;)Lcom/daaw/px1;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lcom/daaw/xs1$m;->j(Landroid/view/View;)Lcom/daaw/px1;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static L0(Landroid/view/View;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$m;->z(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/daaw/es0;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/es0;

    invoke-interface {p0}, Lcom/daaw/es0;->stopNestedScroll()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static M(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->K0()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/xs1$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static M0(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v1, v0

    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static N(Landroid/view/View;)Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$m;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lcom/daaw/xs1;->b:Ljava/util/WeakHashMap;

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static O(Landroid/view/View;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/daaw/xs1$h;->g(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static P(Landroid/view/View;)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$m;->m(Landroid/view/View;)F

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Q(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$g;->a(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static R(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->h(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static S(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->i(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static T(Landroid/view/View;)Z
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->b()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/xs1$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static U(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$k;->b(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static V(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$k;->c(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static W(Landroid/view/View;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$m;->p(Landroid/view/View;)Z

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/es0;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/es0;

    invoke-interface {p0}, Lcom/daaw/es0;->isNestedScrollingEnabled()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static X(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$i;->g(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static Y(Landroid/view/View;)Z
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->q0()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/xs1$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic Z(Lcom/daaw/tk;)Lcom/daaw/tk;
    .locals 0

    return-object p0
.end method

.method public static synthetic a(Lcom/daaw/tk;)Lcom/daaw/tk;
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1;->Z(Lcom/daaw/tk;)Lcom/daaw/tk;

    move-result-object p0

    return-object p0
.end method

.method public static a0(Landroid/view/View;I)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/daaw/xs1;->r(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p0}, Lcom/daaw/xs1;->q(Landroid/view/View;)I

    move-result v2

    const/16 v3, 0x20

    if-nez v2, :cond_4

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    if-ne p1, v3, :cond_3

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-static {v1, p1}, Lcom/daaw/xs1$k;->g(Landroid/view/accessibility/AccessibilityEvent;I)V

    invoke-virtual {v1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object p1

    invoke-static {p0}, Lcom/daaw/xs1;->r(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :try_start_0
    invoke-static {v0, p0, p0, p1}, Lcom/daaw/xs1$k;->e(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " does not fully implement ViewParent"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_4
    :goto_1
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const/16 v3, 0x800

    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-static {v0, p1}, Lcom/daaw/xs1$k;->g(Landroid/view/accessibility/AccessibilityEvent;I)V

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object p1

    invoke-static {p0}, Lcom/daaw/xs1;->r(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lcom/daaw/xs1;->J0(Landroid/view/View;)V

    :cond_6
    invoke-virtual {p0, v0}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_7
    :goto_3
    return-void
.end method

.method public static b()Lcom/daaw/xs1$f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/xs1$f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/xs1$d;

    sget v1, Lcom/daaw/q11;->J:I

    const-class v2, Ljava/lang/Boolean;

    const/16 v3, 0x1c

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/xs1$d;-><init>(ILjava/lang/Class;I)V

    return-object v0
.end method

.method public static b0(Landroid/view/View;I)V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    invoke-static {}, Lcom/daaw/xs1;->z()Landroid/graphics/Rect;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_1

    move-object v1, v2

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {v0, v3, v4, v5, v1}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    :cond_1
    invoke-static {p0, p1}, Lcom/daaw/xs1;->f(Landroid/view/View;I)V

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    invoke-virtual {v0, p1, v1, v3, p0}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p0

    if-eqz p0, :cond_3

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_2
    invoke-static {p0, p1}, Lcom/daaw/xs1;->f(Landroid/view/View;I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static c(Landroid/view/View;Ljava/lang/CharSequence;Lcom/daaw/b0;)I
    .locals 2

    invoke-static {p0, p1}, Lcom/daaw/xs1;->t(Landroid/view/View;Ljava/lang/CharSequence;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v1, Lcom/daaw/y$a;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/y$a;-><init>(ILjava/lang/CharSequence;Lcom/daaw/b0;)V

    invoke-static {p0, v1}, Lcom/daaw/xs1;->d(Landroid/view/View;Lcom/daaw/y$a;)V

    :cond_0
    return v0
.end method

.method public static c0(Landroid/view/View;I)V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    invoke-static {}, Lcom/daaw/xs1;->z()Landroid/graphics/Rect;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_1

    move-object v1, v2

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {v0, v3, v4, v5, v1}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    :cond_1
    invoke-static {p0, p1}, Lcom/daaw/xs1;->g(Landroid/view/View;I)V

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    invoke-virtual {v0, p1, v1, v3, p0}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p0

    if-eqz p0, :cond_3

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_2
    invoke-static {p0, p1}, Lcom/daaw/xs1;->g(Landroid/view/View;I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static d(Landroid/view/View;Lcom/daaw/y$a;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1;->l(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/daaw/y$a;->b()I

    move-result v0

    invoke-static {v0, p0}, Lcom/daaw/xs1;->m0(ILandroid/view/View;)V

    invoke-static {p0}, Lcom/daaw/xs1;->s(Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/daaw/xs1;->a0(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public static d0(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/px1;->v()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Lcom/daaw/xs1$l;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1, p0}, Lcom/daaw/px1;->x(Landroid/view/WindowInsets;Landroid/view/View;)Lcom/daaw/px1;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static e(Landroid/view/View;)Lcom/daaw/ut1;
    .locals 2

    sget-object v0, Lcom/daaw/xs1;->c:Ljava/util/WeakHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/daaw/xs1;->c:Ljava/util/WeakHashMap;

    :cond_0
    sget-object v0, Lcom/daaw/xs1;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ut1;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/ut1;

    invoke-direct {v0, p0}, Lcom/daaw/ut1;-><init>(Landroid/view/View;)V

    sget-object v1, Lcom/daaw/xs1;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public static e0(Landroid/view/View;Lcom/daaw/y;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/y;->C0()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-void
.end method

.method public static f(Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1;->M0(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of p1, p0, Landroid/view/View;

    if-eqz p1, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Lcom/daaw/xs1;->M0(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static f0()Lcom/daaw/xs1$f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/xs1$f<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/xs1$b;

    sget v1, Lcom/daaw/q11;->K:I

    const-class v2, Ljava/lang/CharSequence;

    const/16 v3, 0x8

    const/16 v4, 0x1c

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/xs1$b;-><init>(ILjava/lang/Class;II)V

    return-object v0
.end method

.method public static g(Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1;->M0(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of p1, p0, Landroid/view/View;

    if-eqz p1, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Lcom/daaw/xs1;->M0(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static g0(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/xs1$h;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method public static h(Landroid/view/View;Lcom/daaw/px1;Landroid/graphics/Rect;)Lcom/daaw/px1;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lcom/daaw/xs1$m;->b(Landroid/view/View;Lcom/daaw/px1;Landroid/graphics/Rect;)Lcom/daaw/px1;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static h0(Landroid/view/View;Lcom/daaw/tk;)Lcom/daaw/tk;
    .locals 2

    const-string v0, "ViewCompat"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "performReceiveContent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", view="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Lcom/daaw/xs1$s;->b(Landroid/view/View;Lcom/daaw/tk;)Lcom/daaw/tk;

    move-result-object p0

    return-object p0

    :cond_1
    sget v0, Lcom/daaw/q11;->M:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/hu0;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0, p1}, Lcom/daaw/hu0;->a(Landroid/view/View;Lcom/daaw/tk;)Lcom/daaw/tk;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p0, 0x0

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lcom/daaw/xs1;->A(Landroid/view/View;)Lcom/daaw/iu0;

    move-result-object p0

    invoke-interface {p0, p1}, Lcom/daaw/iu0;->a(Lcom/daaw/tk;)Lcom/daaw/tk;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_3
    invoke-static {p0}, Lcom/daaw/xs1;->A(Landroid/view/View;)Lcom/daaw/iu0;

    move-result-object p0

    invoke-interface {p0, p1}, Lcom/daaw/iu0;->a(Lcom/daaw/tk;)Lcom/daaw/tk;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/px1;->v()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Lcom/daaw/xs1$l;->a(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1, p0}, Lcom/daaw/px1;->x(Landroid/view/WindowInsets;Landroid/view/View;)Lcom/daaw/px1;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static i0(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$h;->k(Landroid/view/View;)V

    return-void
.end method

.method public static j(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0}, Lcom/daaw/xs1$v;->a(Landroid/view/View;)Lcom/daaw/xs1$v;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/daaw/xs1$v;->b(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static j0(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/xs1$h;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static k(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0}, Lcom/daaw/xs1$v;->a(Landroid/view/View;)Lcom/daaw/xs1$v;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/daaw/xs1$v;->f(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static k0(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/xs1$h;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static l(Landroid/view/View;)V
    .locals 1

    invoke-static {p0}, Lcom/daaw/xs1;->n(Landroid/view/View;)Lcom/daaw/w;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/w;

    invoke-direct {v0}, Lcom/daaw/w;-><init>()V

    :cond_0
    invoke-static {p0, v0}, Lcom/daaw/xs1;->r0(Landroid/view/View;Lcom/daaw/w;)V

    return-void
.end method

.method public static l0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p1, p0}, Lcom/daaw/xs1;->m0(ILandroid/view/View;)V

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/daaw/xs1;->a0(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public static m()I
    .locals 1

    invoke-static {}, Lcom/daaw/xs1$i;->a()I

    move-result v0

    return v0
.end method

.method public static m0(ILandroid/view/View;)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/xs1;->s(Landroid/view/View;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/y$a;

    invoke-virtual {v1}, Lcom/daaw/y$a;->b()I

    move-result v1

    if-ne v1, p0, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static n(Landroid/view/View;)Lcom/daaw/w;
    .locals 1

    invoke-static {p0}, Lcom/daaw/xs1;->o(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/w$a;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/w$a;

    iget-object p0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    return-object p0

    :cond_1
    new-instance v0, Lcom/daaw/w;

    invoke-direct {v0, p0}, Lcom/daaw/w;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    return-object v0
.end method

.method public static n0(Landroid/view/View;Lcom/daaw/y$a;Ljava/lang/CharSequence;Lcom/daaw/b0;)V
    .locals 0

    if-nez p3, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/y$a;->b()I

    move-result p1

    invoke-static {p0, p1}, Lcom/daaw/xs1;->l0(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/daaw/y$a;->a(Ljava/lang/CharSequence;Lcom/daaw/b0;)Lcom/daaw/y$a;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/daaw/xs1;->d(Landroid/view/View;Lcom/daaw/y$a;)V

    :goto_0
    return-void
.end method

.method public static o(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$q;->a(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/daaw/xs1;->p(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    return-object p0
.end method

.method public static o0(Landroid/view/View;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$l;->c(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/daaw/xs1$h;->p(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public static p(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .locals 4

    sget-boolean v0, Lcom/daaw/xs1;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lcom/daaw/xs1;->d:Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    if-nez v0, :cond_1

    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v3, "mAccessibilityDelegate"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lcom/daaw/xs1;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    sput-boolean v2, Lcom/daaw/xs1;->e:Z

    return-object v1

    :cond_1
    :goto_0
    :try_start_1
    sget-object v0, Lcom/daaw/xs1;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/view/View$AccessibilityDelegate;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/View$AccessibilityDelegate;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object p0

    :cond_2
    return-object v1

    :catchall_1
    sput-boolean v2, Lcom/daaw/xs1;->e:Z

    return-object v1
.end method

.method public static p0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "ContextFirst"
            }
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static/range {p0 .. p6}, Lcom/daaw/xs1$q;->c(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :cond_0
    return-void
.end method

.method public static q(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$k;->a(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static q0()Lcom/daaw/xs1$f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/xs1$f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/xs1$a;

    sget v1, Lcom/daaw/q11;->O:I

    const-class v2, Ljava/lang/Boolean;

    const/16 v3, 0x1c

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/xs1$a;-><init>(ILjava/lang/Class;I)V

    return-object v0
.end method

.method public static r(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->f0()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/xs1$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static r0(Landroid/view/View;Lcom/daaw/w;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1;->o(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v0

    instance-of v0, v0, Lcom/daaw/w$a;

    if-eqz v0, :cond_0

    new-instance p1, Lcom/daaw/w;

    invoke-direct {p1}, Lcom/daaw/w;-><init>()V

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/w;->d()Landroid/view/View$AccessibilityDelegate;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    return-void
.end method

.method public static s(Landroid/view/View;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/y$a;",
            ">;"
        }
    .end annotation

    sget v0, Lcom/daaw/q11;->H:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static s0(Landroid/view/View;Z)V
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->b()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/daaw/xs1$f;->g(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method public static t(Landroid/view/View;Ljava/lang/CharSequence;)I
    .locals 8

    invoke-static {p0}, Lcom/daaw/xs1;->s(Landroid/view/View;)Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/y$a;

    invoke-virtual {v2}, Lcom/daaw/y$a;->c()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/y$a;

    invoke-virtual {p0}, Lcom/daaw/y$a;->b()I

    move-result p0

    return p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    :goto_1
    sget-object v3, Lcom/daaw/xs1;->g:[I

    array-length v4, v3

    if-ge v1, v4, :cond_5

    if-ne v2, p1, :cond_5

    aget v3, v3, v1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_3

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/y$a;

    invoke-virtual {v7}, Lcom/daaw/y$a;->b()I

    move-result v7

    if-eq v7, v3, :cond_2

    const/4 v7, 0x1

    goto :goto_3

    :cond_2
    const/4 v7, 0x0

    :goto_3
    and-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    if-eqz v6, :cond_4

    move v2, v3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    return v2
.end method

.method public static t0(Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/xs1$k;->f(Landroid/view/View;I)V

    return-void
.end method

.method public static u(Landroid/view/View;)Landroid/content/res/ColorStateList;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$m;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/vl1;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/vl1;

    invoke-interface {p0}, Lcom/daaw/vl1;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static u0(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-static {}, Lcom/daaw/xs1;->f0()Lcom/daaw/xs1$f;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/daaw/xs1$f;->g(Landroid/view/View;Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/xs1;->i:Lcom/daaw/xs1$e;

    invoke-virtual {p1, p0}, Lcom/daaw/xs1$e;->a(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/daaw/xs1;->i:Lcom/daaw/xs1$e;

    invoke-virtual {p1, p0}, Lcom/daaw/xs1$e;->d(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public static v(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$m;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/vl1;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/vl1;

    invoke-interface {p0}, Lcom/daaw/vl1;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static v0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/xs1$h;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static w(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$j;->a(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static w0(Landroid/view/View;Landroid/content/res/ColorStateList;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    invoke-static {p0, p1}, Lcom/daaw/xs1$m;->q(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p0}, Lcom/daaw/xs1$m;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/daaw/xs1$m;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_2
    invoke-static {p0, p1}, Lcom/daaw/xs1$h;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    :cond_3
    instance-of v0, p0, Lcom/daaw/vl1;

    if-eqz v0, :cond_4

    check-cast p0, Lcom/daaw/vl1;

    invoke-interface {p0, p1}, Lcom/daaw/vl1;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public static x(Landroid/view/View;)Landroid/view/Display;
    .locals 0

    invoke-static {p0}, Lcom/daaw/xs1$i;->b(Landroid/view/View;)Landroid/view/Display;

    move-result-object p0

    return-object p0
.end method

.method public static x0(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    invoke-static {p0, p1}, Lcom/daaw/xs1$m;->r(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p0}, Lcom/daaw/xs1$m;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/daaw/xs1$m;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_2
    invoke-static {p0, p1}, Lcom/daaw/xs1$h;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    :cond_3
    instance-of v0, p0, Lcom/daaw/vl1;

    if-eqz v0, :cond_4

    check-cast p0, Lcom/daaw/vl1;

    invoke-interface {p0, p1}, Lcom/daaw/vl1;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public static y(Landroid/view/View;)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/xs1$m;->i(Landroid/view/View;)F

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static y0(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/xs1$j;->c(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method public static z()Landroid/graphics/Rect;
    .locals 2

    sget-object v0, Lcom/daaw/xs1;->f:Ljava/lang/ThreadLocal;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/daaw/xs1;->f:Ljava/lang/ThreadLocal;

    :cond_0
    sget-object v0, Lcom/daaw/xs1;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-nez v0, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sget-object v1, Lcom/daaw/xs1;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    return-object v0
.end method

.method public static z0(Landroid/view/View;F)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lcom/daaw/xs1$m;->s(Landroid/view/View;F)V

    :cond_0
    return-void
.end method
