.class public final Lcom/daaw/i02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/y70$a;
.implements Lcom/daaw/y70$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/daaw/k3$d;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/y70$a;",
        "Lcom/daaw/y70$b;"
    }
.end annotation


# instance fields
.field public A:I

.field public final synthetic B:Lcom/daaw/z70;

.field public final p:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/daaw/b22;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/k3$f;
    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field

.field public final r:Lcom/daaw/o3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/o3<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final s:Lcom/daaw/tz1;

.field public final t:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/g22;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/daaw/gk0<",
            "*>;",
            "Lcom/daaw/b12;",
            ">;"
        }
    .end annotation
.end field

.field public final v:I

.field public final w:Lcom/daaw/f12;

.field public x:Z

.field public final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/k02;",
            ">;"
        }
    .end annotation
.end field

.field public z:Lcom/google/android/gms/common/ConnectionResult;


# direct methods
.method public constructor <init>(Lcom/daaw/z70;Lcom/daaw/v70;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v70<",
            "TO;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/i02;->t:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/i02;->u:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/i02;->y:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/i02;->z:Lcom/google/android/gms/common/ConnectionResult;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/i02;->A:I

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {p2, v1, p0}, Lcom/daaw/v70;->i(Landroid/os/Looper;Lcom/daaw/i02;)Lcom/daaw/k3$f;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-virtual {p2}, Lcom/daaw/v70;->f()Lcom/daaw/o3;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    new-instance v2, Lcom/daaw/tz1;

    invoke-direct {v2}, Lcom/daaw/tz1;-><init>()V

    iput-object v2, p0, Lcom/daaw/i02;->s:Lcom/daaw/tz1;

    invoke-virtual {p2}, Lcom/daaw/v70;->h()I

    move-result v2

    iput v2, p0, Lcom/daaw/i02;->v:I

    invoke-interface {v1}, Lcom/daaw/k3$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lcom/daaw/z70;->q(Lcom/daaw/z70;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/daaw/v70;->j(Landroid/content/Context;Landroid/os/Handler;)Lcom/daaw/f12;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/i02;->w:Lcom/daaw/f12;

    return-void

    :cond_0
    iput-object v0, p0, Lcom/daaw/i02;->w:Lcom/daaw/f12;

    return-void
.end method

.method public static bridge synthetic N(Lcom/daaw/i02;Z)Z
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->n(Z)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic r(Lcom/daaw/i02;)Lcom/daaw/k3$f;
    .locals 0

    iget-object p0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    return-object p0
.end method

.method public static bridge synthetic t(Lcom/daaw/i02;)Lcom/daaw/o3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    return-object p0
.end method

.method public static bridge synthetic v(Lcom/daaw/i02;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->d(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public static bridge synthetic w(Lcom/daaw/i02;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/i02;->g()V

    return-void
.end method

.method public static bridge synthetic x(Lcom/daaw/i02;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->h(I)V

    return-void
.end method

.method public static bridge synthetic y(Lcom/daaw/i02;Lcom/daaw/k02;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lcom/daaw/i02;->x:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {p1}, Lcom/daaw/k3$f;->isConnected()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/i02;->B()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/i02;->f()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic z(Lcom/daaw/i02;Lcom/daaw/k02;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/i02;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    invoke-static {p1}, Lcom/daaw/k02;->a(Lcom/daaw/k02;)Lcom/google/android/gms/common/Feature;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/b22;

    instance-of v3, v2, Lcom/daaw/q02;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/daaw/q02;

    invoke-virtual {v3, p0}, Lcom/daaw/q02;->g(Lcom/daaw/i02;)[Lcom/google/android/gms/common/Feature;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3, p1}, Lcom/daaw/k6;->c([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/b22;

    iget-object v4, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    new-instance v4, Lcom/daaw/rp1;

    invoke-direct {v4, p1}, Lcom/daaw/rp1;-><init>(Lcom/google/android/gms/common/Feature;)V

    invoke-virtual {v3, v4}, Lcom/daaw/b22;->b(Ljava/lang/Exception;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/i02;->z:Lcom/google/android/gms/common/ConnectionResult;

    return-void
.end method

.method public final B()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v0}, Lcom/daaw/k3$f;->isConnected()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v0}, Lcom/daaw/k3$f;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v0, 0xa

    :try_start_0
    iget-object v1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v1}, Lcom/daaw/z70;->y(Lcom/daaw/z70;)Lcom/daaw/d22;

    move-result-object v2

    invoke-static {v1}, Lcom/daaw/z70;->q(Lcom/daaw/z70;)Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-virtual {v2, v1, v3}, Lcom/daaw/d22;->b(Landroid/content/Context;Lcom/daaw/k3$f;)I

    move-result v1

    if-eqz v1, :cond_1

    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    iget-object v1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x23

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "The service for "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not available: "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v3}, Lcom/daaw/i02;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :cond_1
    new-instance v1, Lcom/daaw/m02;

    iget-object v2, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    iget-object v3, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    iget-object v4, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/m02;-><init>(Lcom/daaw/z70;Lcom/daaw/k3$f;Lcom/daaw/o3;)V

    invoke-interface {v3}, Lcom/daaw/k3$f;->requiresSignIn()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/i02;->w:Lcom/daaw/f12;

    invoke-static {v2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/f12;

    invoke-virtual {v2, v1}, Lcom/daaw/f12;->j3(Lcom/daaw/e12;)V

    :cond_2
    :try_start_1
    iget-object v2, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v2, v1}, Lcom/daaw/k3$f;->connect(Lcom/daaw/pa$c;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v1

    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {v2, v0}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    :goto_0
    invoke-virtual {p0, v2, v1}, Lcom/daaw/i02;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v1

    new-instance v2, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {v2, v0}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final C(Lcom/daaw/b22;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v0}, Lcom/daaw/k3$f;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->l(Lcom/daaw/b22;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/i02;->i()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/i02;->z:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->t()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/i02;->z:Lcom/google/android/gms/common/ConnectionResult;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/i02;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/i02;->B()V

    return-void
.end method

.method public final D(I)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->h(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/f02;

    invoke-direct {v1, p0, p1}, Lcom/daaw/f02;-><init>(Lcom/daaw/i02;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final E()V
    .locals 1

    iget v0, p0, Lcom/daaw/i02;->A:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/i02;->A:I

    return-void
.end method

.method public final F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/daaw/i02;->w:Lcom/daaw/f12;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/f12;->k3()V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/i02;->A()V

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->y(Lcom/daaw/z70;)Lcom/daaw/d22;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/d22;->c()V

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    instance-of v0, v0, Lcom/daaw/o22;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result v0

    const/16 v2, 0x18

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0, v1}, Lcom/daaw/z70;->C(Lcom/daaw/z70;Z)V

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    const/16 v3, 0x13

    invoke-virtual {v0, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    const-wide/32 v3, 0x493e0

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    invoke-static {}, Lcom/daaw/z70;->t()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->d(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lcom/daaw/i02;->z:Lcom/google/android/gms/common/ConnectionResult;

    return-void

    :cond_3
    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/i02;->e(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p2}, Lcom/daaw/z70;->e(Lcom/daaw/z70;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-static {p2, p1}, Lcom/daaw/z70;->u(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    invoke-virtual {p0, p2, v0, v1}, Lcom/daaw/i02;->e(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    iget-object p2, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {p2}, Ljava/util/Queue;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0, p1}, Lcom/daaw/i02;->m(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result p2

    if-eqz p2, :cond_6

    return-void

    :cond_6
    iget-object p2, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    iget v0, p0, Lcom/daaw/i02;->v:I

    invoke-virtual {p2, p1, v0}, Lcom/daaw/z70;->g(Lcom/google/android/gms/common/ConnectionResult;I)Z

    move-result p2

    if-nez p2, :cond_9

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result p2

    const/16 v0, 0x12

    if-ne p2, v0, :cond_7

    iput-boolean v1, p0, Lcom/daaw/i02;->x:Z

    :cond_7
    iget-boolean p2, p0, Lcom/daaw/i02;->x:Z

    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-static {p1, v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->n(Lcom/daaw/z70;)J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_8
    iget-object p2, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-static {p2, p1}, Lcom/daaw/z70;->u(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->d(Lcom/google/android/gms/common/api/Status;)V

    :cond_9
    return-void

    :cond_a
    iget-object p2, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-static {p2, p1}, Lcom/daaw/z70;->u(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->d(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final G(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x19

    add-int/2addr v3, v4

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "onSignInFailed for "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " with "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/k3$f;->disconnect(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/i02;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void
.end method

.method public final H(Lcom/daaw/g22;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/daaw/i02;->t:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/i02;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void
.end method

.method public final J()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-boolean v0, p0, Lcom/daaw/i02;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/i02;->B()V

    :cond_0
    return-void
.end method

.method public final K()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    sget-object v0, Lcom/daaw/z70;->G:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/daaw/i02;->d(Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Lcom/daaw/i02;->s:Lcom/daaw/tz1;

    invoke-virtual {v0}, Lcom/daaw/tz1;->d()V

    iget-object v0, p0, Lcom/daaw/i02;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Lcom/daaw/gk0;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/gk0;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    new-instance v4, Lcom/daaw/y12;

    new-instance v5, Lcom/daaw/tj1;

    invoke-direct {v5}, Lcom/daaw/tj1;-><init>()V

    invoke-direct {v4, v3, v5}, Lcom/daaw/y12;-><init>(Lcom/daaw/gk0;Lcom/daaw/tj1;)V

    invoke-virtual {p0, v4}, Lcom/daaw/i02;->C(Lcom/daaw/b22;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/daaw/i02;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v0}, Lcom/daaw/k3$f;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    new-instance v1, Lcom/daaw/h02;

    invoke-direct {v1, p0}, Lcom/daaw/h02;-><init>(Lcom/daaw/i02;)V

    invoke-interface {v0, v1}, Lcom/daaw/k3$f;->onUserSignOut(Lcom/daaw/pa$e;)V

    :cond_1
    return-void
.end method

.method public final L()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-boolean v0, p0, Lcom/daaw/i02;->x:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/i02;->k()V

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->s(Lcom/daaw/z70;)Lcom/daaw/w70;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/z70;->q(Lcom/daaw/z70;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/w70;->g(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x15

    const-string v2, "Connection timed out waiting for Google Play services update to complete."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x16

    const-string v2, "API failed to connect while resuming due to an unknown error."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/i02;->d(Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    const-string v1, "Timing out connection while resuming."

    invoke-interface {v0, v1}, Lcom/daaw/k3$f;->disconnect(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/i02;->g()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/daaw/e02;

    invoke-direct {v0, p0}, Lcom/daaw/e02;-><init>(Lcom/daaw/i02;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final O()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v0}, Lcom/daaw/k3$f;->isConnected()Z

    move-result v0

    return v0
.end method

.method public final P()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v0}, Lcom/daaw/k3$f;->requiresSignIn()Z

    move-result v0

    return v0
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/i02;->n(Z)Z

    move-result v0

    return v0
.end method

.method public final b([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/Feature;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    iget-object v1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v1}, Lcom/daaw/k3$f;->getAvailableFeatures()[Lcom/google/android/gms/common/Feature;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    new-array v1, v2, [Lcom/google/android/gms/common/Feature;

    :cond_1
    array-length v3, v1

    new-instance v4, Lcom/daaw/g6;

    invoke-direct {v4, v3}, Lcom/daaw/g6;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    aget-object v6, v1, v5

    invoke-virtual {v6}, Lcom/google/android/gms/common/Feature;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/google/android/gms/common/Feature;->q()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v4, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_5

    aget-object v3, p1, v2

    invoke-virtual {v3}, Lcom/google/android/gms/common/Feature;->h()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v3}, Lcom/google/android/gms/common/Feature;->q()J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-gez v9, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-object v3

    :cond_5
    :goto_3
    return-object v0
.end method

.method public final c(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/i02;->t:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/g22;

    sget-object v2, Lcom/google/android/gms/common/ConnectionResult;->t:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {p1, v2}, Lcom/daaw/ot0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v2}, Lcom/daaw/k3$f;->getEndpointPackageName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-virtual {v1, v3, p1, v2}, Lcom/daaw/g22;->b(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/i02;->t:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final d(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/i02;->e(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    if-eq v2, v0, :cond_6

    iget-object v0, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/b22;

    if-eqz p3, :cond_3

    iget v2, v1, Lcom/daaw/b22;->a:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {v1, p1}, Lcom/daaw/b22;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v1, p2}, Lcom/daaw/b22;->b(Ljava/lang/Exception;)V

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Status XOR exception should be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method

.method public final f()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/b22;

    iget-object v4, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v4}, Lcom/daaw/k3$f;->isConnected()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v3}, Lcom/daaw/i02;->l(Lcom/daaw/b22;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/daaw/i02;->p:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final g()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/i02;->A()V

    sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->t:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {p0, v0}, Lcom/daaw/i02;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {p0}, Lcom/daaw/i02;->k()V

    iget-object v0, p0, Lcom/daaw/i02;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/i02;->f()V

    invoke-virtual {p0}, Lcom/daaw/i02;->i()V

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b12;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    throw v0
.end method

.method public final h(I)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/i02;->A()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/i02;->x:Z

    iget-object v0, p0, Lcom/daaw/i02;->s:Lcom/daaw/tz1;

    iget-object v1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v1}, Lcom/daaw/k3$f;->getLastDisconnectMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/tz1;->c(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    const/16 v2, 0x9

    invoke-static {p1, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v1}, Lcom/daaw/z70;->n(Lcom/daaw/z70;)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    const/16 v2, 0xb

    invoke-static {p1, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v1}, Lcom/daaw/z70;->o(Lcom/daaw/z70;)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p1}, Lcom/daaw/z70;->y(Lcom/daaw/z70;)Lcom/daaw/d22;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/d22;->c()V

    iget-object p1, p0, Lcom/daaw/i02;->u:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b12;

    iget-object v0, v0, Lcom/daaw/b12;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    iget-object v3, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-virtual {v0, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v2}, Lcom/daaw/z70;->p(Lcom/daaw/z70;)J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final j(Lcom/daaw/b22;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/i02;->s:Lcom/daaw/tz1;

    invoke-virtual {p0}, Lcom/daaw/i02;->P()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/b22;->d(Lcom/daaw/tz1;Z)V

    :try_start_0
    invoke-virtual {p1, p0}, Lcom/daaw/b22;->c(Lcom/daaw/i02;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->D(I)V

    iget-object p1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    const-string v0, "DeadObjectException thrown while running ApiCallRunner."

    invoke-interface {p1, v0}, Lcom/daaw/k3$f;->disconnect(Ljava/lang/String;)V

    return-void
.end method

.method public final k()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/i02;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/i02;->x:Z

    :cond_0
    return-void
.end method

.method public final l(Lcom/daaw/b22;)Z
    .locals 9

    instance-of v0, p1, Lcom/daaw/q02;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->j(Lcom/daaw/b22;)V

    return v1

    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/daaw/q02;

    invoke-virtual {v0, p0}, Lcom/daaw/q02;->g(Lcom/daaw/i02;)[Lcom/google/android/gms/common/Feature;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/daaw/i02;->b([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/Feature;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->j(Lcom/daaw/b22;)V

    return v1

    :cond_1
    iget-object p1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Lcom/google/android/gms/common/Feature;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/common/Feature;->q()J

    move-result-wide v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x4d

    add-int/2addr v6, v7

    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " could not execute call because it requires feature ("

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {p1}, Lcom/daaw/z70;->e(Lcom/daaw/z70;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, p0}, Lcom/daaw/q02;->f(Lcom/daaw/i02;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lcom/daaw/k02;

    iget-object v0, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v2, v1}, Lcom/daaw/k02;-><init>(Lcom/daaw/o3;Lcom/google/android/gms/common/Feature;Lcom/daaw/j02;)V

    iget-object v0, p0, Lcom/daaw/i02;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/16 v2, 0xf

    if-ltz v0, :cond_2

    iget-object p1, p0, Lcom/daaw/i02;->y:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/k02;

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->n(Lcom/daaw/z70;)J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/i02;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v3

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v2}, Lcom/daaw/z70;->n(Lcom/daaw/z70;)J

    move-result-wide v4

    invoke-virtual {v3, v0, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    const/16 v3, 0x10

    invoke-static {v0, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->o(Lcom/daaw/z70;)J

    move-result-wide v3

    invoke-virtual {v2, p1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v0, 0x2

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, p1}, Lcom/daaw/i02;->m(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    iget v1, p0, Lcom/daaw/i02;->v:I

    invoke-virtual {v0, p1, v1}, Lcom/daaw/z70;->g(Lcom/google/android/gms/common/ConnectionResult;I)Z

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    new-instance p1, Lcom/daaw/rp1;

    invoke-direct {p1, v2}, Lcom/daaw/rp1;-><init>(Lcom/google/android/gms/common/Feature;)V

    invoke-virtual {v0, p1}, Lcom/daaw/b22;->b(Ljava/lang/Exception;)V

    return v1
.end method

.method public final m(Lcom/google/android/gms/common/ConnectionResult;)Z
    .locals 3

    invoke-static {}, Lcom/daaw/z70;->z()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v1}, Lcom/daaw/z70;->v(Lcom/daaw/z70;)Lcom/daaw/uz1;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/z70;->B(Lcom/daaw/z70;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/i02;->r:Lcom/daaw/o3;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v1}, Lcom/daaw/z70;->v(Lcom/daaw/z70;)Lcom/daaw/uz1;

    move-result-object v1

    iget v2, p0, Lcom/daaw/i02;->v:I

    invoke-virtual {v1, p1, v2}, Lcom/daaw/p22;->s(Lcom/google/android/gms/common/ConnectionResult;I)V

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final n(Z)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    invoke-interface {v0}, Lcom/daaw/k3$f;->isConnected()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/i02;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/i02;->s:Lcom/daaw/tz1;

    invoke-virtual {v0}, Lcom/daaw/tz1;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/i02;->i()V

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    const-string v0, "Timing out service connection."

    invoke-interface {p1, v0}, Lcom/daaw/k3$f;->disconnect(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lcom/daaw/i02;->v:I

    return v0
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Lcom/daaw/i02;->A:I

    return v0
.end method

.method public final q()Lcom/google/android/gms/common/ConnectionResult;
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/daaw/i02;->z:Lcom/google/android/gms/common/ConnectionResult;

    return-object v0
.end method

.method public final s()Lcom/daaw/k3$f;
    .locals 1

    iget-object v0, p0, Lcom/daaw/i02;->q:Lcom/daaw/k3$f;

    return-object v0
.end method

.method public final u()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/daaw/gk0<",
            "*>;",
            "Lcom/daaw/b12;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/i02;->u:Ljava/util/Map;

    return-object v0
.end method
