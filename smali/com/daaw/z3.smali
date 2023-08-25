.class public abstract Lcom/daaw/z3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/z3$b;,
        Lcom/daaw/z3$a;
    }
.end annotation


# static fields
.field public static p:Lcom/daaw/f5$a;

.field public static q:I

.field public static r:Lcom/daaw/rk0;

.field public static s:Lcom/daaw/rk0;

.field public static t:Ljava/lang/Boolean;

.field public static u:Z

.field public static v:Ljava/lang/Object;

.field public static w:Landroid/content/Context;

.field public static final x:Lcom/daaw/j6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/j6<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/z3;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final y:Ljava/lang/Object;

.field public static final z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/f5$a;

    new-instance v1, Lcom/daaw/f5$b;

    invoke-direct {v1}, Lcom/daaw/f5$b;-><init>()V

    invoke-direct {v0, v1}, Lcom/daaw/f5$a;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v0, Lcom/daaw/z3;->p:Lcom/daaw/f5$a;

    const/16 v0, -0x64

    sput v0, Lcom/daaw/z3;->q:I

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    sput-object v0, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    sput-object v0, Lcom/daaw/z3;->t:Ljava/lang/Boolean;

    const/4 v1, 0x0

    sput-boolean v1, Lcom/daaw/z3;->u:Z

    sput-object v0, Lcom/daaw/z3;->v:Ljava/lang/Object;

    sput-object v0, Lcom/daaw/z3;->w:Landroid/content/Context;

    new-instance v0, Lcom/daaw/j6;

    invoke-direct {v0}, Lcom/daaw/j6;-><init>()V

    sput-object v0, Lcom/daaw/z3;->x:Lcom/daaw/j6;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/z3;->y:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/z3;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/z3;->W(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic B(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/f5;->c(Landroid/content/Context;)V

    const/4 p0, 0x1

    sput-boolean p0, Lcom/daaw/z3;->u:Z

    return-void
.end method

.method public static K(Lcom/daaw/z3;)V
    .locals 1

    sget-object v0, Lcom/daaw/z3;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lcom/daaw/z3;->L(Lcom/daaw/z3;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static L(Lcom/daaw/z3;)V
    .locals 3

    sget-object v0, Lcom/daaw/z3;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/z3;->x:Lcom/daaw/j6;

    invoke-virtual {v1}, Lcom/daaw/j6;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/z3;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static N(Landroid/content/Context;)V
    .locals 0

    sput-object p0, Lcom/daaw/z3;->w:Landroid/content/Context;

    return-void
.end method

.method public static O(Lcom/daaw/rk0;)V
    .locals 2

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/z3;->s()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/rk0;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/z3$a;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/daaw/z3$b;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    invoke-virtual {p0, v0}, Lcom/daaw/rk0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/daaw/z3;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    invoke-static {}, Lcom/daaw/z3;->h()V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static W(Landroid/content/Context;)V
    .locals 3

    invoke-static {p0}, Lcom/daaw/z3;->z(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    sget-boolean v0, Lcom/daaw/z3;->u:Z

    if-nez v0, :cond_6

    sget-object v0, Lcom/daaw/z3;->p:Lcom/daaw/f5$a;

    new-instance v1, Lcom/daaw/x3;

    invoke-direct {v1, p0}, Lcom/daaw/x3;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/daaw/f5$a;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/daaw/z3;->z:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    if-nez v1, :cond_4

    sget-object v1, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    if-nez v1, :cond_2

    invoke-static {p0}, Lcom/daaw/f5;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/rk0;->c(Ljava/lang/String;)Lcom/daaw/rk0;

    move-result-object p0

    sput-object p0, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    :cond_2
    sget-object p0, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    invoke-virtual {p0}, Lcom/daaw/rk0;->f()Z

    move-result p0

    if-eqz p0, :cond_3

    monitor-exit v0

    return-void

    :cond_3
    sget-object p0, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    sput-object p0, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    goto :goto_0

    :cond_4
    sget-object v2, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    invoke-virtual {v1, v2}, Lcom/daaw/rk0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    sput-object v1, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    invoke-virtual {v1}, Lcom/daaw/rk0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/daaw/f5;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_5
    :goto_0
    monitor-exit v0

    :cond_6
    :goto_1
    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic c(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/z3;->B(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic d(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/z3;->A(Landroid/content/Context;)V

    return-void
.end method

.method public static e(Lcom/daaw/z3;)V
    .locals 3

    sget-object v0, Lcom/daaw/z3;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lcom/daaw/z3;->L(Lcom/daaw/z3;)V

    sget-object v1, Lcom/daaw/z3;->x:Lcom/daaw/j6;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/daaw/j6;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static h()V
    .locals 2

    sget-object v0, Lcom/daaw/z3;->x:Lcom/daaw/j6;

    invoke-virtual {v0}, Lcom/daaw/j6;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/z3;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/z3;->g()Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static l(Landroid/app/Activity;Lcom/daaw/t3;)Lcom/daaw/z3;
    .locals 1

    new-instance v0, Lcom/daaw/a4;

    invoke-direct {v0, p0, p1}, Lcom/daaw/a4;-><init>(Landroid/app/Activity;Lcom/daaw/t3;)V

    return-object v0
.end method

.method public static m(Landroid/app/Dialog;Lcom/daaw/t3;)Lcom/daaw/z3;
    .locals 1

    new-instance v0, Lcom/daaw/a4;

    invoke-direct {v0, p0, p1}, Lcom/daaw/a4;-><init>(Landroid/app/Dialog;Lcom/daaw/t3;)V

    return-object v0
.end method

.method public static o()Lcom/daaw/rk0;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/z3;->s()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/daaw/z3$b;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/rk0;->i(Landroid/os/LocaleList;)Lcom/daaw/rk0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Lcom/daaw/rk0;->e()Lcom/daaw/rk0;

    move-result-object v0

    return-object v0
.end method

.method public static q()I
    .locals 1

    sget v0, Lcom/daaw/z3;->q:I

    return v0
.end method

.method public static s()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lcom/daaw/z3;->v:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/z3;->w:Landroid/content/Context;

    if-nez v0, :cond_2

    sget-object v0, Lcom/daaw/z3;->x:Lcom/daaw/j6;

    invoke-virtual {v0}, Lcom/daaw/j6;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/z3;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/z3;->p()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    sput-object v1, Lcom/daaw/z3;->w:Landroid/content/Context;

    :cond_2
    sget-object v0, Lcom/daaw/z3;->w:Landroid/content/Context;

    if-eqz v0, :cond_3

    const-string v1, "locale"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/daaw/z3;->v:Ljava/lang/Object;

    :cond_3
    sget-object v0, Lcom/daaw/z3;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public static u()Lcom/daaw/rk0;
    .locals 1

    sget-object v0, Lcom/daaw/z3;->r:Lcom/daaw/rk0;

    return-object v0
.end method

.method public static v()Lcom/daaw/rk0;
    .locals 1

    sget-object v0, Lcom/daaw/z3;->s:Lcom/daaw/rk0;

    return-object v0
.end method

.method public static z(Landroid/content/Context;)Z
    .locals 1

    sget-object v0, Lcom/daaw/z3;->t:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {p0}, Lcom/daaw/d5;->a(Landroid/content/Context;)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    const-string v0, "autoStoreLocales"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lcom/daaw/z3;->t:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Lcom/daaw/z3;->t:Ljava/lang/Boolean;

    :cond_0
    :goto_0
    sget-object p0, Lcom/daaw/z3;->t:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract C(Landroid/content/res/Configuration;)V
.end method

.method public abstract D(Landroid/os/Bundle;)V
.end method

.method public abstract E()V
.end method

.method public abstract F(Landroid/os/Bundle;)V
.end method

.method public abstract G()V
.end method

.method public abstract H(Landroid/os/Bundle;)V
.end method

.method public abstract I()V
.end method

.method public abstract J()V
.end method

.method public abstract M(I)Z
.end method

.method public abstract P(I)V
.end method

.method public abstract Q(Landroid/view/View;)V
.end method

.method public abstract R(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract S(Landroidx/appcompat/widget/Toolbar;)V
.end method

.method public T(I)V
    .locals 0

    return-void
.end method

.method public abstract U(Ljava/lang/CharSequence;)V
.end method

.method public abstract V(Lcom/daaw/n0$a;)Lcom/daaw/n0;
.end method

.method public abstract f(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/daaw/z3;->p:Lcom/daaw/f5$a;

    new-instance v1, Lcom/daaw/y3;

    invoke-direct {v1, p1}, Lcom/daaw/y3;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/daaw/f5$a;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public j(Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public k(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/z3;->j(Landroid/content/Context;)V

    return-object p1
.end method

.method public abstract n(I)Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation
.end method

.method public p()Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public abstract t()Landroid/view/MenuInflater;
.end method

.method public abstract w()Lcom/daaw/i0;
.end method

.method public abstract x()V
.end method

.method public abstract y()V
.end method
