.class public abstract Lcom/daaw/in1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/in1$e;,
        Lcom/daaw/in1$d;,
        Lcom/daaw/in1$f;
    }
.end annotation


# static fields
.field public static final V:[I

.field public static final W:Lcom/daaw/aw0;

.field public static X:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/daaw/g6<",
            "Landroid/animation/Animator;",
            "Lcom/daaw/in1$d;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public E:Lcom/daaw/pn1;

.field public F:Lcom/daaw/pn1;

.field public G:Lcom/daaw/mn1;

.field public H:[I

.field public I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/on1;",
            ">;"
        }
    .end annotation
.end field

.field public J:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/on1;",
            ">;"
        }
    .end annotation
.end field

.field public K:Landroid/view/ViewGroup;

.field public L:Z

.field public M:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public N:I

.field public O:Z

.field public P:Z

.field public Q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/in1$f;",
            ">;"
        }
    .end annotation
.end field

.field public R:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public S:Lcom/daaw/in1$e;

.field public T:Lcom/daaw/g6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g6<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public U:Lcom/daaw/aw0;

.field public p:Ljava/lang/String;

.field public q:J

.field public r:J

.field public s:Landroid/animation/TimeInterpolator;

.field public t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/in1;->V:[I

    new-instance v0, Lcom/daaw/in1$a;

    invoke-direct {v0}, Lcom/daaw/in1$a;-><init>()V

    sput-object v0, Lcom/daaw/in1;->W:Lcom/daaw/aw0;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/daaw/in1;->X:Ljava/lang/ThreadLocal;

    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x1
        0x3
        0x4
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/in1;->p:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/in1;->q:J

    iput-wide v0, p0, Lcom/daaw/in1;->r:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/in1;->s:Landroid/animation/TimeInterpolator;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->v:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->w:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->x:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->y:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->z:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->A:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->B:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->C:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/daaw/in1;->D:Ljava/util/ArrayList;

    new-instance v1, Lcom/daaw/pn1;

    invoke-direct {v1}, Lcom/daaw/pn1;-><init>()V

    iput-object v1, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    new-instance v1, Lcom/daaw/pn1;

    invoke-direct {v1}, Lcom/daaw/pn1;-><init>()V

    iput-object v1, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iput-object v0, p0, Lcom/daaw/in1;->G:Lcom/daaw/mn1;

    sget-object v1, Lcom/daaw/in1;->V:[I

    iput-object v1, p0, Lcom/daaw/in1;->H:[I

    iput-object v0, p0, Lcom/daaw/in1;->K:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/in1;->L:Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/daaw/in1;->M:Ljava/util/ArrayList;

    iput v1, p0, Lcom/daaw/in1;->N:I

    iput-boolean v1, p0, Lcom/daaw/in1;->O:Z

    iput-boolean v1, p0, Lcom/daaw/in1;->P:Z

    iput-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/in1;->R:Ljava/util/ArrayList;

    sget-object v0, Lcom/daaw/in1;->W:Lcom/daaw/aw0;

    iput-object v0, p0, Lcom/daaw/in1;->U:Lcom/daaw/aw0;

    return-void
.end method

.method public static B()Lcom/daaw/g6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/g6<",
            "Landroid/animation/Animator;",
            "Lcom/daaw/in1$d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/in1;->X:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/g6;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/g6;

    invoke-direct {v0}, Lcom/daaw/g6;-><init>()V

    sget-object v1, Lcom/daaw/in1;->X:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public static L(Lcom/daaw/on1;Lcom/daaw/on1;Ljava/lang/String;)Z
    .locals 0

    iget-object p0, p0, Lcom/daaw/on1;->a:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p1, Lcom/daaw/on1;->a:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p2, p0

    :cond_2
    :goto_0
    return p2
.end method

.method public static d(Lcom/daaw/pn1;Landroid/view/View;Lcom/daaw/on1;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1

    iget-object v1, p0, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/daaw/xs1;->N(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v1, p0, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    invoke-virtual {v1, p2}, Lcom/daaw/cd1;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    invoke-virtual {v1, p2, v0}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    invoke-virtual {v1, p2, p1}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p2, p1}, Landroid/widget/ListView;->getPositionForView(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/ListView;->getItemIdAtPosition(I)J

    move-result-wide v1

    iget-object p2, p0, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {p2, v1, v2}, Lcom/daaw/sl0;->i(J)I

    move-result p2

    if-ltz p2, :cond_4

    iget-object p1, p0, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {p1, v1, v2}, Lcom/daaw/sl0;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_5

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/xs1;->A0(Landroid/view/View;Z)V

    iget-object p0, p0, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {p0, v1, v2, v0}, Lcom/daaw/sl0;->k(JLjava/lang/Object;)V

    goto :goto_2

    :cond_4
    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/daaw/xs1;->A0(Landroid/view/View;Z)V

    iget-object p0, p0, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {p0, v1, v2, p1}, Lcom/daaw/sl0;->k(JLjava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public A()Lcom/daaw/ln1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public C()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/in1;->q:J

    return-wide v0
.end method

.method public D()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    return-object v0
.end method

.method public E()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/in1;->v:Ljava/util/ArrayList;

    return-object v0
.end method

.method public F()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/in1;->w:Ljava/util/ArrayList;

    return-object v0
.end method

.method public G()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    return-object v0
.end method

.method public H()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public I(Landroid/view/View;Z)Lcom/daaw/on1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->G:Lcom/daaw/mn1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/in1;->I(Landroid/view/View;Z)Lcom/daaw/on1;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    :goto_0
    iget-object p2, p2, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-virtual {p2, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/on1;

    return-object p1
.end method

.method public J(Lcom/daaw/on1;Lcom/daaw/on1;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/daaw/in1;->H()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    invoke-static {p1, p2, v5}, Lcom/daaw/in1;->L(Lcom/daaw/on1;Lcom/daaw/on1;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p1, Lcom/daaw/on1;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p1, p2, v3}, Lcom/daaw/in1;->L(Lcom/daaw/on1;Lcom/daaw/on1;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public K(Landroid/view/View;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/in1;->x:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lcom/daaw/in1;->y:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lcom/daaw/in1;->z:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    iget-object v4, p0, Lcom/daaw/in1;->z:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/daaw/in1;->A:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    invoke-static {p1}, Lcom/daaw/xs1;->N(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/daaw/in1;->A:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/daaw/xs1;->N(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/daaw/in1;->w:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_5
    iget-object v1, p0, Lcom/daaw/in1;->v:Ljava/util/ArrayList;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    return v3

    :cond_7
    iget-object v1, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lcom/daaw/in1;->v:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-static {p1}, Lcom/daaw/xs1;->N(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return v3

    :cond_9
    iget-object v0, p0, Lcom/daaw/in1;->w:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/daaw/in1;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_b

    iget-object v1, p0, Lcom/daaw/in1;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return v3

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_b
    return v2

    :cond_c
    :goto_2
    return v3
.end method

.method public final M(Lcom/daaw/g6;Lcom/daaw/g6;Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/on1;

    invoke-virtual {p2, v3}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/on1;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final N(Lcom/daaw/g6;Lcom/daaw/g6;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/cd1;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/on1;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual {p0, v2}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Lcom/daaw/cd1;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/on1;

    iget-object v3, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final O(Lcom/daaw/g6;Lcom/daaw/g6;Lcom/daaw/sl0;Lcom/daaw/sl0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Lcom/daaw/sl0<",
            "Landroid/view/View;",
            ">;",
            "Lcom/daaw/sl0<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Lcom/daaw/sl0;->o()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Lcom/daaw/sl0;->p(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Lcom/daaw/sl0;->j(I)J

    move-result-wide v3

    invoke-virtual {p4, v3, v4}, Lcom/daaw/sl0;->e(J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/on1;

    invoke-virtual {p2, v3}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/on1;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final P(Lcom/daaw/g6;Lcom/daaw/g6;Lcom/daaw/g6;Lcom/daaw/g6;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Lcom/daaw/g6<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Lcom/daaw/g6<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Lcom/daaw/cd1;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Lcom/daaw/cd1;->m(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p4, v3}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/on1;

    invoke-virtual {p2, v3}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/on1;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final Q(Lcom/daaw/pn1;Lcom/daaw/pn1;)V
    .locals 5

    new-instance v0, Lcom/daaw/g6;

    iget-object v1, p1, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-direct {v0, v1}, Lcom/daaw/g6;-><init>(Lcom/daaw/cd1;)V

    new-instance v1, Lcom/daaw/g6;

    iget-object v2, p2, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-direct {v1, v2}, Lcom/daaw/g6;-><init>(Lcom/daaw/cd1;)V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/in1;->H:[I

    array-length v4, v3

    if-ge v2, v4, :cond_4

    aget v3, v3, v2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p1, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    iget-object v4, p2, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {p0, v0, v1, v3, v4}, Lcom/daaw/in1;->O(Lcom/daaw/g6;Lcom/daaw/g6;Lcom/daaw/sl0;Lcom/daaw/sl0;)V

    goto :goto_1

    :cond_1
    iget-object v3, p1, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    iget-object v4, p2, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    invoke-virtual {p0, v0, v1, v3, v4}, Lcom/daaw/in1;->M(Lcom/daaw/g6;Lcom/daaw/g6;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    iget-object v4, p2, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    invoke-virtual {p0, v0, v1, v3, v4}, Lcom/daaw/in1;->P(Lcom/daaw/g6;Lcom/daaw/g6;Lcom/daaw/g6;Lcom/daaw/g6;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0, v1}, Lcom/daaw/in1;->N(Lcom/daaw/g6;Lcom/daaw/g6;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0, v1}, Lcom/daaw/in1;->c(Lcom/daaw/g6;Lcom/daaw/g6;)V

    return-void
.end method

.method public R(Landroid/view/View;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/in1;->P:Z

    if-nez v0, :cond_3

    invoke-static {}, Lcom/daaw/in1;->B()Lcom/daaw/g6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/cd1;->size()I

    move-result v1

    invoke-static {p1}, Lcom/daaw/gu1;->d(Landroid/view/View;)Lcom/daaw/ox1;

    move-result-object p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/daaw/cd1;->m(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/in1$d;

    iget-object v4, v3, Lcom/daaw/in1$d;->a:Landroid/view/View;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lcom/daaw/in1$d;->d:Lcom/daaw/ox1;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-static {v3}, Lcom/daaw/j3;->b(Landroid/animation/Animator;)V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/in1$f;

    invoke-interface {v3, p0}, Lcom/daaw/in1$f;->b(Lcom/daaw/in1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v2, p0, Lcom/daaw/in1;->O:Z

    :cond_3
    return-void
.end method

.method public S(Landroid/view/ViewGroup;)V
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object v1, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    invoke-virtual {p0, v0, v1}, Lcom/daaw/in1;->Q(Lcom/daaw/pn1;Lcom/daaw/pn1;)V

    invoke-static {}, Lcom/daaw/in1;->B()Lcom/daaw/g6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/cd1;->size()I

    move-result v1

    invoke-static {p1}, Lcom/daaw/gu1;->d(Landroid/view/View;)Lcom/daaw/ox1;

    move-result-object v2

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    :goto_0
    if-ltz v1, :cond_6

    invoke-virtual {v0, v1}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    if-eqz v4, :cond_5

    invoke-virtual {v0, v4}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/in1$d;

    if-eqz v5, :cond_5

    iget-object v6, v5, Lcom/daaw/in1$d;->a:Landroid/view/View;

    if-eqz v6, :cond_5

    iget-object v6, v5, Lcom/daaw/in1$d;->d:Lcom/daaw/ox1;

    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, v5, Lcom/daaw/in1$d;->c:Lcom/daaw/on1;

    iget-object v7, v5, Lcom/daaw/in1$d;->a:Landroid/view/View;

    invoke-virtual {p0, v7, v3}, Lcom/daaw/in1;->I(Landroid/view/View;Z)Lcom/daaw/on1;

    move-result-object v8

    invoke-virtual {p0, v7, v3}, Lcom/daaw/in1;->x(Landroid/view/View;Z)Lcom/daaw/on1;

    move-result-object v9

    if-nez v8, :cond_0

    if-nez v9, :cond_0

    iget-object v9, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iget-object v9, v9, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-virtual {v9, v7}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lcom/daaw/on1;

    :cond_0
    if-nez v8, :cond_1

    if-eqz v9, :cond_2

    :cond_1
    iget-object v5, v5, Lcom/daaw/in1$d;->e:Lcom/daaw/in1;

    invoke-virtual {v5, v6, v9}, Lcom/daaw/in1;->J(Lcom/daaw/on1;Lcom/daaw/on1;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_5

    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v4}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    :cond_5
    :goto_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    iget-object v6, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object v7, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iget-object v8, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    iget-object v9, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    move-object v4, p0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/in1;->s(Landroid/view/ViewGroup;Lcom/daaw/pn1;Lcom/daaw/pn1;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Lcom/daaw/in1;->X()V

    return-void
.end method

.method public T(Lcom/daaw/in1$f;)Lcom/daaw/in1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    :cond_1
    return-object p0
.end method

.method public U(Landroid/view/View;)Lcom/daaw/in1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public V(Landroid/view/View;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/in1;->O:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/daaw/in1;->P:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/daaw/in1;->B()Lcom/daaw/g6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/cd1;->size()I

    move-result v2

    invoke-static {p1}, Lcom/daaw/gu1;->d(Landroid/view/View;)Lcom/daaw/ox1;

    move-result-object p1

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v0, v2}, Lcom/daaw/cd1;->m(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/in1$d;

    iget-object v4, v3, Lcom/daaw/in1$d;->a:Landroid/view/View;

    if-eqz v4, :cond_0

    iget-object v3, v3, Lcom/daaw/in1$d;->d:Lcom/daaw/ox1;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-static {v3}, Lcom/daaw/j3;->c(Landroid/animation/Animator;)V

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/in1$f;

    invoke-interface {v3, p0}, Lcom/daaw/in1$f;->e(Lcom/daaw/in1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v1, p0, Lcom/daaw/in1;->O:Z

    :cond_3
    return-void
.end method

.method public final W(Landroid/animation/Animator;Lcom/daaw/g6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "Lcom/daaw/g6<",
            "Landroid/animation/Animator;",
            "Lcom/daaw/in1$d;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Lcom/daaw/in1$b;

    invoke-direct {v0, p0, p2}, Lcom/daaw/in1$b;-><init>(Lcom/daaw/in1;Lcom/daaw/g6;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0, p1}, Lcom/daaw/in1;->e(Landroid/animation/Animator;)V

    :cond_0
    return-void
.end method

.method public X()V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/in1;->e0()V

    invoke-static {}, Lcom/daaw/in1;->B()Lcom/daaw/g6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/in1;->R:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v0, v2}, Lcom/daaw/cd1;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/daaw/in1;->e0()V

    invoke-virtual {p0, v2, v0}, Lcom/daaw/in1;->W(Landroid/animation/Animator;Lcom/daaw/g6;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/in1;->R:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lcom/daaw/in1;->t()V

    return-void
.end method

.method public Y(J)Lcom/daaw/in1;
    .locals 0

    iput-wide p1, p0, Lcom/daaw/in1;->r:J

    return-object p0
.end method

.method public Z(Lcom/daaw/in1$e;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/in1;->S:Lcom/daaw/in1$e;

    return-void
.end method

.method public a(Lcom/daaw/in1$f;)Lcom/daaw/in1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a0(Landroid/animation/TimeInterpolator;)Lcom/daaw/in1;
    .locals 0

    iput-object p1, p0, Lcom/daaw/in1;->s:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public b(Landroid/view/View;)Lcom/daaw/in1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b0(Lcom/daaw/aw0;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/in1;->W:Lcom/daaw/aw0;

    :cond_0
    iput-object p1, p0, Lcom/daaw/in1;->U:Lcom/daaw/aw0;

    return-void
.end method

.method public final c(Lcom/daaw/g6;Lcom/daaw/g6;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;",
            "Lcom/daaw/g6<",
            "Landroid/view/View;",
            "Lcom/daaw/on1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/cd1;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Lcom/daaw/cd1;->m(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/on1;

    iget-object v4, v2, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual {p0, v4}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p2}, Lcom/daaw/cd1;->size()I

    move-result p1

    if-ge v0, p1, :cond_3

    invoke-virtual {p2, v0}, Lcom/daaw/cd1;->m(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/on1;

    iget-object v1, p1, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual {p0, v1}, Lcom/daaw/in1;->K(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public c0(Lcom/daaw/ln1;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/in1;->p()Lcom/daaw/in1;

    move-result-object v0

    return-object v0
.end method

.method public d0(J)Lcom/daaw/in1;
    .locals 0

    iput-wide p1, p0, Lcom/daaw/in1;->q:J

    return-object p0
.end method

.method public e(Landroid/animation/Animator;)V
    .locals 5

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/in1;->t()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/in1;->u()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    invoke-virtual {p0}, Lcom/daaw/in1;->u()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/in1;->C()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    invoke-virtual {p0}, Lcom/daaw/in1;->C()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/in1;->w()Landroid/animation/TimeInterpolator;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/daaw/in1;->w()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_3
    new-instance v0, Lcom/daaw/in1$c;

    invoke-direct {v0, p0}, Lcom/daaw/in1$c;-><init>(Lcom/daaw/in1;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    :goto_0
    return-void
.end method

.method public e0()V
    .locals 5

    iget v0, p0, Lcom/daaw/in1;->N:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/in1$f;

    invoke-interface {v4, p0}, Lcom/daaw/in1$f;->d(Lcom/daaw/in1;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lcom/daaw/in1;->P:Z

    :cond_1
    iget v0, p0, Lcom/daaw/in1;->N:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/in1;->N:I

    return-void
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/in1;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/in1;->M:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/in1$f;

    invoke-interface {v3, p0}, Lcom/daaw/in1$f;->c(Lcom/daaw/in1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public f0(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "@"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-wide v0, p0, Lcom/daaw/in1;->r:J

    const-wide/16 v2, -0x1

    const-string v4, ") "

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "dur("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lcom/daaw/in1;->r:J

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iget-wide v0, p0, Lcom/daaw/in1;->q:J

    cmp-long v5, v0, v2

    if-eqz v5, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "dly("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/in1;->q:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lcom/daaw/in1;->s:Landroid/animation/TimeInterpolator;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "interp("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/daaw/in1;->s:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    iget-object v0, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "tgts("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, ", "

    const/4 v2, 0x0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    if-lez v0, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7

    :goto_1
    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    if-lez v2, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_8
    return-object p1
.end method

.method public abstract i(Lcom/daaw/on1;)V
.end method

.method public final j(Landroid/view/View;Z)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/in1;->x:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/in1;->y:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Lcom/daaw/in1;->z:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    iget-object v4, p0, Lcom/daaw/in1;->z:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    return-void

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_7

    new-instance v1, Lcom/daaw/on1;

    invoke-direct {v1, p1}, Lcom/daaw/on1;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_5

    invoke-virtual {p0, v1}, Lcom/daaw/in1;->m(Lcom/daaw/on1;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v1}, Lcom/daaw/in1;->i(Lcom/daaw/on1;)V

    :goto_1
    iget-object v3, v1, Lcom/daaw/on1;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Lcom/daaw/in1;->k(Lcom/daaw/on1;)V

    if-eqz p2, :cond_6

    iget-object v3, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    goto :goto_2

    :cond_6
    iget-object v3, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    :goto_2
    invoke-static {v3, p1, v1}, Lcom/daaw/in1;->d(Lcom/daaw/pn1;Landroid/view/View;Lcom/daaw/on1;)V

    :cond_7
    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/daaw/in1;->B:Ljava/util/ArrayList;

    if-eqz v1, :cond_8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/daaw/in1;->C:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-void

    :cond_9
    iget-object v0, p0, Lcom/daaw/in1;->D:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v0, :cond_b

    iget-object v3, p0, Lcom/daaw/in1;->D:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    return-void

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_b
    check-cast p1, Landroid/view/ViewGroup;

    :goto_4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_c

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/daaw/in1;->j(Landroid/view/View;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    return-void
.end method

.method public k(Lcom/daaw/on1;)V
    .locals 0

    return-void
.end method

.method public abstract m(Lcom/daaw/on1;)V
.end method

.method public n(Landroid/view/ViewGroup;Z)V
    .locals 5

    invoke-virtual {p0, p2}, Lcom/daaw/in1;->o(Z)V

    iget-object v0, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/daaw/in1;->v:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/daaw/in1;->w:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/daaw/in1;->j(Landroid/view/View;Z)V

    goto/16 :goto_7

    :cond_3
    :goto_0
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_7

    iget-object v2, p0, Lcom/daaw/in1;->t:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Lcom/daaw/on1;

    invoke-direct {v3, v2}, Lcom/daaw/on1;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_4

    invoke-virtual {p0, v3}, Lcom/daaw/in1;->m(Lcom/daaw/on1;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v3}, Lcom/daaw/in1;->i(Lcom/daaw/on1;)V

    :goto_2
    iget-object v4, v3, Lcom/daaw/on1;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3}, Lcom/daaw/in1;->k(Lcom/daaw/on1;)V

    if-eqz p2, :cond_5

    iget-object v4, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    :goto_3
    invoke-static {v4, v2, v3}, Lcom/daaw/in1;->d(Lcom/daaw/pn1;Landroid/view/View;Lcom/daaw/on1;)V

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    :goto_4
    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_a

    iget-object v0, p0, Lcom/daaw/in1;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    new-instance v2, Lcom/daaw/on1;

    invoke-direct {v2, v0}, Lcom/daaw/on1;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_8

    invoke-virtual {p0, v2}, Lcom/daaw/in1;->m(Lcom/daaw/on1;)V

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v2}, Lcom/daaw/in1;->i(Lcom/daaw/on1;)V

    :goto_5
    iget-object v3, v2, Lcom/daaw/on1;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2}, Lcom/daaw/in1;->k(Lcom/daaw/on1;)V

    if-eqz p2, :cond_9

    iget-object v3, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    goto :goto_6

    :cond_9
    iget-object v3, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    :goto_6
    invoke-static {v3, v0, v2}, Lcom/daaw/in1;->d(Lcom/daaw/pn1;Landroid/view/View;Lcom/daaw/on1;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_a
    :goto_7
    if-nez p2, :cond_d

    iget-object p1, p0, Lcom/daaw/in1;->T:Lcom/daaw/g6;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/daaw/cd1;->size()I

    move-result p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :goto_8
    if-ge v0, p1, :cond_b

    iget-object v2, p0, Lcom/daaw/in1;->T:Lcom/daaw/g6;

    invoke-virtual {v2, v0}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object v3, v3, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    invoke-virtual {v3, v2}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    if-ge v1, p1, :cond_d

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_c

    iget-object v2, p0, Lcom/daaw/in1;->T:Lcom/daaw/g6;

    invoke-virtual {v2, v1}, Lcom/daaw/cd1;->m(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object v3, v3, Lcom/daaw/pn1;->d:Lcom/daaw/g6;

    invoke-virtual {v3, v2, v0}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_d
    return-void
.end method

.method public o(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object p1, p1, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-virtual {p1}, Lcom/daaw/cd1;->clear()V

    iget-object p1, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object p1, p1, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iget-object p1, p1, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-virtual {p1}, Lcom/daaw/cd1;->clear()V

    iget-object p1, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iget-object p1, p1, Lcom/daaw/pn1;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    :goto_0
    iget-object p1, p1, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {p1}, Lcom/daaw/sl0;->b()V

    return-void
.end method

.method public p()Lcom/daaw/in1;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/in1;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lcom/daaw/in1;->R:Ljava/util/ArrayList;

    new-instance v2, Lcom/daaw/pn1;

    invoke-direct {v2}, Lcom/daaw/pn1;-><init>()V

    iput-object v2, v1, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    new-instance v2, Lcom/daaw/pn1;

    invoke-direct {v2}, Lcom/daaw/pn1;-><init>()V

    iput-object v2, v1, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iput-object v0, v1, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    iput-object v0, v1, Lcom/daaw/in1;->J:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public r(Landroid/view/ViewGroup;Lcom/daaw/on1;Lcom/daaw/on1;)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public s(Landroid/view/ViewGroup;Lcom/daaw/pn1;Lcom/daaw/pn1;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lcom/daaw/pn1;",
            "Lcom/daaw/pn1;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/on1;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/on1;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v6, p0

    invoke-static {}, Lcom/daaw/in1;->B()Lcom/daaw/g6;

    move-result-object v7

    new-instance v8, Landroid/util/SparseIntArray;

    invoke-direct {v8}, Landroid/util/SparseIntArray;-><init>()V

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_0
    const-wide v0, 0x7fffffffffffffffL

    if-ge v11, v9, :cond_d

    move-object/from16 v12, p4

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/on1;

    move-object/from16 v13, p5

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/on1;

    if-eqz v0, :cond_0

    iget-object v3, v0, Lcom/daaw/on1;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v1, :cond_1

    iget-object v3, v1, Lcom/daaw/on1;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v1, 0x0

    :cond_1
    if-nez v0, :cond_4

    if-nez v1, :cond_4

    :cond_2
    move-object/from16 v14, p1

    :cond_3
    move-object/from16 v15, p3

    move/from16 v17, v9

    goto/16 :goto_7

    :cond_4
    if-eqz v0, :cond_6

    if-eqz v1, :cond_6

    invoke-virtual {v6, v0, v1}, Lcom/daaw/in1;->J(Lcom/daaw/on1;Lcom/daaw/on1;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v3, 0x1

    :goto_2
    if-eqz v3, :cond_2

    move-object/from16 v14, p1

    invoke-virtual {v6, v14, v0, v1}, Lcom/daaw/in1;->r(Landroid/view/ViewGroup;Lcom/daaw/on1;Lcom/daaw/on1;)Landroid/animation/Animator;

    move-result-object v3

    if-eqz v3, :cond_3

    if-eqz v1, :cond_b

    iget-object v0, v1, Lcom/daaw/on1;->b:Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/in1;->H()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    array-length v4, v1

    if-lez v4, :cond_a

    new-instance v4, Lcom/daaw/on1;

    invoke-direct {v4, v0}, Lcom/daaw/on1;-><init>(Landroid/view/View;)V

    move-object/from16 v15, p3

    iget-object v5, v15, Lcom/daaw/pn1;->a:Lcom/daaw/g6;

    invoke-virtual {v5, v0}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/on1;

    if-eqz v5, :cond_7

    const/4 v2, 0x0

    :goto_3
    array-length v10, v1

    if-ge v2, v10, :cond_7

    iget-object v10, v4, Lcom/daaw/on1;->a:Ljava/util/Map;

    move-object/from16 v16, v3

    aget-object v3, v1, v2

    move/from16 v17, v9

    iget-object v9, v5, Lcom/daaw/on1;->a:Ljava/util/Map;

    move-object/from16 v18, v5

    aget-object v5, v1, v2

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v10, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v3, v16

    move/from16 v9, v17

    move-object/from16 v5, v18

    goto :goto_3

    :cond_7
    move-object/from16 v16, v3

    move/from16 v17, v9

    invoke-virtual {v7}, Lcom/daaw/cd1;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_9

    invoke-virtual {v7, v2}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-virtual {v7, v3}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/in1$d;

    iget-object v5, v3, Lcom/daaw/in1$d;->c:Lcom/daaw/on1;

    if-eqz v5, :cond_8

    iget-object v5, v3, Lcom/daaw/in1$d;->a:Landroid/view/View;

    if-ne v5, v0, :cond_8

    iget-object v5, v3, Lcom/daaw/in1$d;->b:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/in1;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v3, v3, Lcom/daaw/in1$d;->c:Lcom/daaw/on1;

    invoke-virtual {v3, v4}, Lcom/daaw/on1;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v2, 0x0

    goto :goto_5

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    move-object/from16 v2, v16

    goto :goto_5

    :cond_a
    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move/from16 v17, v9

    move-object/from16 v2, v16

    const/4 v4, 0x0

    :goto_5
    move-object v1, v0

    move-object v9, v2

    move-object v5, v4

    goto :goto_6

    :cond_b
    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move/from16 v17, v9

    iget-object v0, v0, Lcom/daaw/on1;->b:Landroid/view/View;

    move-object v1, v0

    move-object/from16 v9, v16

    const/4 v5, 0x0

    :goto_6
    if-eqz v9, :cond_c

    new-instance v10, Lcom/daaw/in1$d;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/in1;->y()Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/gu1;->d(Landroid/view/View;)Lcom/daaw/ox1;

    move-result-object v4

    move-object v0, v10

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/in1$d;-><init>(Landroid/view/View;Ljava/lang/String;Lcom/daaw/in1;Lcom/daaw/ox1;Lcom/daaw/on1;)V

    invoke-virtual {v7, v9, v10}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v6, Lcom/daaw/in1;->R:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    :goto_7
    add-int/lit8 v11, v11, 0x1

    move/from16 v9, v17

    goto/16 :goto_0

    :cond_d
    invoke-virtual {v8}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-eqz v2, :cond_e

    const/4 v10, 0x0

    :goto_8
    invoke-virtual {v8}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v10, v2, :cond_e

    invoke-virtual {v8, v10}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    iget-object v3, v6, Lcom/daaw/in1;->R:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v8, v10}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v3, v0

    invoke-virtual {v2}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v11

    add-long/2addr v3, v11

    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_e
    return-void
.end method

.method public t()V
    .locals 6

    iget v0, p0, Lcom/daaw/in1;->N:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/in1;->N:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/in1;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/in1$f;

    invoke-interface {v5, p0}, Lcom/daaw/in1$f;->a(Lcom/daaw/in1;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget-object v3, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object v3, v3, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {v3}, Lcom/daaw/sl0;->o()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Lcom/daaw/in1;->E:Lcom/daaw/pn1;

    iget-object v3, v3, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {v3, v0}, Lcom/daaw/sl0;->p(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_1

    invoke-static {v3, v2}, Lcom/daaw/xs1;->A0(Landroid/view/View;Z)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iget-object v3, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iget-object v3, v3, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {v3}, Lcom/daaw/sl0;->o()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lcom/daaw/in1;->F:Lcom/daaw/pn1;

    iget-object v3, v3, Lcom/daaw/pn1;->c:Lcom/daaw/sl0;

    invoke-virtual {v3, v0}, Lcom/daaw/sl0;->p(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_3

    invoke-static {v3, v2}, Lcom/daaw/xs1;->A0(Landroid/view/View;Z)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    iput-boolean v1, p0, Lcom/daaw/in1;->P:Z

    :cond_5
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/daaw/in1;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/in1;->r:J

    return-wide v0
.end method

.method public v()Lcom/daaw/in1$e;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->S:Lcom/daaw/in1$e;

    return-object v0
.end method

.method public w()Landroid/animation/TimeInterpolator;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->s:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method public x(Landroid/view/View;Z)Lcom/daaw/on1;
    .locals 6

    iget-object v0, p0, Lcom/daaw/in1;->G:Lcom/daaw/mn1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/in1;->x(Landroid/view/View;Z)Lcom/daaw/on1;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_5

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/on1;

    if-nez v5, :cond_3

    return-object v1

    :cond_3
    iget-object v5, v5, Lcom/daaw/on1;->b:Landroid/view/View;

    if-ne v5, p1, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-ltz v3, :cond_7

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/daaw/in1;->J:Ljava/util/ArrayList;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/daaw/in1;->I:Ljava/util/ArrayList;

    :goto_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/daaw/on1;

    :cond_7
    return-object v1
.end method

.method public y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->p:Ljava/lang/String;

    return-object v0
.end method

.method public z()Lcom/daaw/aw0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/in1;->U:Lcom/daaw/aw0;

    return-object v0
.end method
