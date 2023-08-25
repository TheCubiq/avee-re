.class public abstract Lcom/daaw/v70;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/v70$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/daaw/k3$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/k3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/k3$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field public final e:Lcom/daaw/o3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/o3<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final f:Landroid/os/Looper;

.field public final g:I

.field public final h:Lcom/daaw/y70;
    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field

.field public final i:Lcom/daaw/vf1;

.field public final j:Lcom/daaw/z70;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lcom/daaw/k3;Lcom/daaw/k3$d;Lcom/daaw/v70$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/Activity;",
            "Lcom/daaw/k3<",
            "TO;>;TO;",
            "Lcom/daaw/v70$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    invoke-static {p3, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    invoke-static {p5, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/v70;->a:Landroid/content/Context;

    invoke-static {}, Lcom/daaw/vw0;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getAttributionTag"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/daaw/v70;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/v70;->c:Lcom/daaw/k3;

    iput-object p4, p0, Lcom/daaw/v70;->d:Lcom/daaw/k3$d;

    iget-object p1, p5, Lcom/daaw/v70$a;->b:Landroid/os/Looper;

    iput-object p1, p0, Lcom/daaw/v70;->f:Landroid/os/Looper;

    invoke-static {p3, p4, v1}, Lcom/daaw/o3;->a(Lcom/daaw/k3;Lcom/daaw/k3$d;Ljava/lang/String;)Lcom/daaw/o3;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/v70;->e:Lcom/daaw/o3;

    new-instance p3, Lcom/daaw/n02;

    invoke-direct {p3, p0}, Lcom/daaw/n02;-><init>(Lcom/daaw/v70;)V

    iput-object p3, p0, Lcom/daaw/v70;->h:Lcom/daaw/y70;

    iget-object p3, p0, Lcom/daaw/v70;->a:Landroid/content/Context;

    invoke-static {p3}, Lcom/daaw/z70;->x(Landroid/content/Context;)Lcom/daaw/z70;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/v70;->j:Lcom/daaw/z70;

    invoke-virtual {p3}, Lcom/daaw/z70;->m()I

    move-result p4

    iput p4, p0, Lcom/daaw/v70;->g:I

    iget-object p4, p5, Lcom/daaw/v70$a;->a:Lcom/daaw/vf1;

    iput-object p4, p0, Lcom/daaw/v70;->i:Lcom/daaw/vf1;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    invoke-static {p2, p3, p1}, Lcom/daaw/uz1;->u(Landroid/app/Activity;Lcom/daaw/z70;Lcom/daaw/o3;)V

    :cond_1
    invoke-virtual {p3, p0}, Lcom/daaw/z70;->b(Lcom/daaw/v70;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/k3;Lcom/daaw/k3$d;Lcom/daaw/v70$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/k3<",
            "TO;>;TO;",
            "Lcom/daaw/v70$a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/v70;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/daaw/k3;Lcom/daaw/k3$d;Lcom/daaw/v70$a;)V

    return-void
.end method


# virtual methods
.method public c()Lcom/daaw/xf$a;
    .locals 3

    new-instance v0, Lcom/daaw/xf$a;

    invoke-direct {v0}, Lcom/daaw/xf$a;-><init>()V

    iget-object v1, p0, Lcom/daaw/v70;->d:Lcom/daaw/k3$d;

    instance-of v2, v1, Lcom/daaw/k3$d$b;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/daaw/k3$d$b;

    invoke-interface {v1}, Lcom/daaw/k3$d$b;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->h()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/v70;->d:Lcom/daaw/k3$d;

    instance-of v2, v1, Lcom/daaw/k3$d$a;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/daaw/k3$d$a;

    invoke-interface {v1}, Lcom/daaw/k3$d$a;->b()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/daaw/xf$a;->d(Landroid/accounts/Account;)Lcom/daaw/xf$a;

    iget-object v1, p0, Lcom/daaw/v70;->d:Lcom/daaw/k3$d;

    instance-of v2, v1, Lcom/daaw/k3$d$b;

    if-eqz v2, :cond_3

    check-cast v1, Lcom/daaw/k3$d$b;

    invoke-interface {v1}, Lcom/daaw/k3$d$b;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->y()Ljava/util/Set;

    move-result-object v1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Lcom/daaw/xf$a;->c(Ljava/util/Collection;)Lcom/daaw/xf$a;

    iget-object v1, p0, Lcom/daaw/v70;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/xf$a;->e(Ljava/lang/String;)Lcom/daaw/xf$a;

    iget-object v1, p0, Lcom/daaw/v70;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/xf$a;->b(Ljava/lang/String;)Lcom/daaw/xf$a;

    return-object v0
.end method

.method public d(Lcom/daaw/sj1;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/daaw/k3$b;",
            ">(",
            "Lcom/daaw/sj1<",
            "TA;TTResult;>;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/daaw/v70;->k(ILcom/daaw/sj1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/daaw/sj1;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/daaw/k3$b;",
            ">(",
            "Lcom/daaw/sj1<",
            "TA;TTResult;>;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/v70;->k(ILcom/daaw/sj1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final f()Lcom/daaw/o3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/o3<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/v70;->e:Lcom/daaw/o3;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v70;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lcom/daaw/v70;->g:I

    return v0
.end method

.method public final i(Landroid/os/Looper;Lcom/daaw/i02;)Lcom/daaw/k3$f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/daaw/i02<",
            "TO;>;)",
            "Lcom/daaw/k3$f;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/v70;->c()Lcom/daaw/xf$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xf$a;->a()Lcom/daaw/xf;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/v70;->c:Lcom/daaw/k3;

    invoke-virtual {v0}, Lcom/daaw/k3;->a()Lcom/daaw/k3$a;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/daaw/k3$a;

    iget-object v2, p0, Lcom/daaw/v70;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/daaw/v70;->d:Lcom/daaw/k3$d;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/k3$a;->b(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Ljava/lang/Object;Lcom/daaw/y70$a;Lcom/daaw/y70$b;)Lcom/daaw/k3$f;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/v70;->g()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Lcom/daaw/pa;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/daaw/pa;

    invoke-virtual {v0, p2}, Lcom/daaw/pa;->setAttributionTag(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p1, Lcom/daaw/at0;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/daaw/at0;

    invoke-virtual {v0, p2}, Lcom/daaw/at0;->e(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final j(Landroid/content/Context;Landroid/os/Handler;)Lcom/daaw/f12;
    .locals 2

    new-instance v0, Lcom/daaw/f12;

    invoke-virtual {p0}, Lcom/daaw/v70;->c()Lcom/daaw/xf$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/xf$a;->a()Lcom/daaw/xf;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lcom/daaw/f12;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/daaw/xf;)V

    return-object v0
.end method

.method public final k(ILcom/daaw/sj1;)Lcom/daaw/rj1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/daaw/k3$b;",
            ">(I",
            "Lcom/daaw/sj1<",
            "TA;TTResult;>;)",
            "Lcom/daaw/rj1<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v6, Lcom/daaw/tj1;

    invoke-direct {v6}, Lcom/daaw/tj1;-><init>()V

    iget-object v0, p0, Lcom/daaw/v70;->j:Lcom/daaw/z70;

    iget-object v5, p0, Lcom/daaw/v70;->i:Lcom/daaw/vf1;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/z70;->D(Lcom/daaw/v70;ILcom/daaw/sj1;Lcom/daaw/tj1;Lcom/daaw/vf1;)V

    invoke-virtual {v6}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
