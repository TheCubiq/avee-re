.class public Lcom/daaw/el;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/el$b;,
        Lcom/daaw/el$c;
    }
.end annotation


# static fields
.field public static e:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static f:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static g:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static h:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/sd0;",
            ">;"
        }
    .end annotation
.end field

.field public static i:Lcom/daaw/pw1;

.field public static final j:Ljava/lang/Object;

.field public static k:Lcom/daaw/el;


# instance fields
.field public a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/daaw/ch0;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/daaw/el$c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Lcom/daaw/n0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/el;->e:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/el;->f:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/el;->g:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/el;->h:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/el;->i:Lcom/daaw/pw1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/el;->j:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/el;->k:Lcom/daaw/el;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/el;->c:Z

    return-void
.end method

.method public static synthetic a(Lcom/daaw/el;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/el;->c:Z

    return p0
.end method

.method public static synthetic b(Lcom/daaw/el;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/el;->c:Z

    return p1
.end method

.method public static synthetic c(Lcom/daaw/el;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/el;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic e(Lcom/daaw/el;Lcom/daaw/n0;)Lcom/daaw/n0;
    .locals 0

    iput-object p1, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    return-object p1
.end method

.method public static synthetic f(Lcom/daaw/el;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/el;->g()V

    return-void
.end method

.method public static j()Lcom/daaw/el;
    .locals 2

    sget-object v0, Lcom/daaw/el;->k:Lcom/daaw/el;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/el;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/el;->k:Lcom/daaw/el;

    if-nez v1, :cond_1

    new-instance v1, Lcom/daaw/el;

    invoke-direct {v1}, Lcom/daaw/el;-><init>()V

    sput-object v1, Lcom/daaw/el;->k:Lcom/daaw/el;

    :cond_1
    sget-object v1, Lcom/daaw/el;->k:Lcom/daaw/el;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final g()V
    .locals 1

    sget-object v0, Lcom/daaw/el;->i:Lcom/daaw/pw1;

    invoke-virtual {v0}, Lcom/daaw/pw1;->a()V

    iget-object v0, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public h(Lcom/daaw/jh0$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/el;->g:Lcom/daaw/rw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/el$c;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lcom/daaw/el$c;->a:[Lcom/daaw/l0;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_1

    iget-object v4, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/el;->n()V

    return-void
.end method

.method public i(Lcom/daaw/al;Lcom/daaw/ch0;)Z
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/el$c;

    iget-object v5, v3, Lcom/daaw/el$c;->a:[Lcom/daaw/l0;

    array-length v6, v5

    :goto_1
    if-ge v4, v6, :cond_0

    aget-object v7, v5, v4

    invoke-virtual {v7}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v8

    invoke-virtual {v8, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v3, v3, Lcom/daaw/el$c;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {p2, p1, v1, v0}, Lcom/daaw/ch0;->b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v4
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/el;->c:Z

    invoke-virtual {v0}, Lcom/daaw/n0;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    :cond_0
    return-void
.end method

.method public l([Lcom/daaw/l0;Ljava/lang/Boolean;Lcom/daaw/jh0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/l0;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Lcom/daaw/jh0$a;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lcom/daaw/el$c;

    invoke-direct {p2, p0}, Lcom/daaw/el$c;-><init>(Lcom/daaw/el;)V

    iput-object p1, p2, Lcom/daaw/el$c;->a:[Lcom/daaw/l0;

    iput-object v0, p2, Lcom/daaw/el$c;->b:Ljava/lang/Object;

    invoke-virtual {p0, p3, p2}, Lcom/daaw/el;->m(Lcom/daaw/jh0$a;Lcom/daaw/el$c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/el;->h(Lcom/daaw/jh0$a;)V

    :goto_0
    return-void
.end method

.method public m(Lcom/daaw/jh0$a;Lcom/daaw/el$c;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/daaw/el$c;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/el;->g:Lcom/daaw/rw1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object p2, p2, Lcom/daaw/el$c;->a:[Lcom/daaw/l0;

    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p2, v2

    invoke-virtual {v3}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_0

    const-string v3, "There can only be unique ItemActionBase actions per item"

    invoke-static {v3}, Lcom/daaw/q6;->k(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-nez v5, :cond_1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_1
    iget-object v6, p0, Lcom/daaw/el;->a:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/el;->n()V

    return-void
.end method

.method public n()V
    .locals 6

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lcom/daaw/el;->c:Z

    iget-object v0, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/n0;->c()V

    :cond_0
    return-void

    :cond_1
    iget-object v2, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    if-lez v2, :cond_2

    iget-object v2, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    if-nez v2, :cond_3

    new-instance v2, Lcom/daaw/el$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/daaw/el$b;-><init>(Lcom/daaw/el;Lcom/daaw/el$a;)V

    invoke-virtual {v0, v2}, Lcom/daaw/p3;->Q(Lcom/daaw/n0$a;)Lcom/daaw/n0;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    sget-object v2, Lcom/daaw/el;->f:Lcom/daaw/qw1;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/daaw/n0;->c()V

    :cond_3
    :goto_0
    iget-object v2, p0, Lcom/daaw/el;->d:Lcom/daaw/n0;

    if-eqz v2, :cond_4

    const v3, 0x7f10024a

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/daaw/el;->b:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v4

    invoke-virtual {v0, v3, v1}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/daaw/n0;->r(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method
