.class public Lcom/daaw/z70;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final G:Lcom/google/android/gms/common/api/Status;

.field public static final H:Lcom/google/android/gms/common/api/Status;

.field public static final I:Ljava/lang/Object;

.field public static J:Lcom/daaw/z70;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field


# instance fields
.field public final A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/daaw/o3<",
            "*>;",
            "Lcom/daaw/i02<",
            "*>;>;"
        }
    .end annotation
.end field

.field public B:Lcom/daaw/uz1;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public final C:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/o3<",
            "*>;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public final D:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/o3<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final E:Landroid/os/Handler;
    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field

.field public volatile F:Z

.field public p:J

.field public q:J

.field public r:J

.field public s:Z

.field public t:Lcom/google/android/gms/common/internal/TelemetryData;

.field public u:Lcom/daaw/gk1;

.field public final v:Landroid/content/Context;

.field public final w:Lcom/daaw/w70;

.field public final x:Lcom/daaw/d22;

.field public final y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final z:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x4

    const-string v2, "Sign-out occurred while this API call was in progress."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/daaw/z70;->G:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "The user must be signed in to make this API call."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lcom/daaw/z70;->H:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/z70;->I:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/w70;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/daaw/z70;->p:J

    const-wide/32 v0, 0x1d4c0

    iput-wide v0, p0, Lcom/daaw/z70;->q:J

    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lcom/daaw/z70;->r:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/z70;->s:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/z70;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/z70;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v3, 0x5

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-direct {v1, v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iput-object v1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/z70;->B:Lcom/daaw/uz1;

    new-instance v1, Lcom/daaw/j6;

    invoke-direct {v1}, Lcom/daaw/j6;-><init>()V

    iput-object v1, p0, Lcom/daaw/z70;->C:Ljava/util/Set;

    new-instance v1, Lcom/daaw/j6;

    invoke-direct {v1}, Lcom/daaw/j6;-><init>()V

    iput-object v1, p0, Lcom/daaw/z70;->D:Ljava/util/Set;

    iput-boolean v2, p0, Lcom/daaw/z70;->F:Z

    iput-object p1, p0, Lcom/daaw/z70;->v:Landroid/content/Context;

    new-instance v1, Lcom/daaw/q22;

    invoke-direct {v1, p2, p0}, Lcom/daaw/q22;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    iput-object p3, p0, Lcom/daaw/z70;->w:Lcom/daaw/w70;

    new-instance p2, Lcom/daaw/d22;

    invoke-direct {p2, p3}, Lcom/daaw/d22;-><init>(Lcom/daaw/x70;)V

    iput-object p2, p0, Lcom/daaw/z70;->x:Lcom/daaw/d22;

    invoke-static {p1}, Lcom/daaw/nt;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lcom/daaw/z70;->F:Z

    :cond_0
    const/4 p1, 0x6

    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public static bridge synthetic A(Lcom/daaw/z70;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic B(Lcom/daaw/z70;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z70;->C:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic C(Lcom/daaw/z70;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/z70;->s:Z

    return-void
.end method

.method public static bridge synthetic e(Lcom/daaw/z70;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/z70;->F:Z

    return p0
.end method

.method public static h(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/o3<",
            "*>;",
            "Lcom/google/android/gms/common/ConnectionResult;",
            ")",
            "Lcom/google/android/gms/common/api/Status;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0}, Lcom/daaw/o3;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x3f

    add-int/2addr v2, v3

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "API: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is not available on this device. Connection failed with: "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/api/Status;-><init>(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V

    return-object v0
.end method

.method public static bridge synthetic n(Lcom/daaw/z70;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/z70;->p:J

    return-wide v0
.end method

.method public static bridge synthetic o(Lcom/daaw/z70;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/z70;->q:J

    return-wide v0
.end method

.method public static bridge synthetic p(Lcom/daaw/z70;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/z70;->r:J

    return-wide v0
.end method

.method public static bridge synthetic q(Lcom/daaw/z70;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z70;->v:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic r(Lcom/daaw/z70;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic s(Lcom/daaw/z70;)Lcom/daaw/w70;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z70;->w:Lcom/daaw/w70;

    return-object p0
.end method

.method public static bridge synthetic t()Lcom/google/android/gms/common/api/Status;
    .locals 1

    sget-object v0, Lcom/daaw/z70;->H:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public static bridge synthetic u(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/z70;->h(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic v(Lcom/daaw/z70;)Lcom/daaw/uz1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z70;->B:Lcom/daaw/uz1;

    return-object p0
.end method

.method public static x(Landroid/content/Context;)Lcom/daaw/z70;
    .locals 4

    sget-object v0, Lcom/daaw/z70;->I:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/z70;->J:Lcom/daaw/z70;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/daaw/u70;->c()Landroid/os/HandlerThread;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/daaw/z70;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Lcom/daaw/w70;->m()Lcom/daaw/w70;

    move-result-object v3

    invoke-direct {v2, p0, v1, v3}, Lcom/daaw/z70;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/w70;)V

    sput-object v2, Lcom/daaw/z70;->J:Lcom/daaw/z70;

    :cond_0
    sget-object p0, Lcom/daaw/z70;->J:Lcom/daaw/z70;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic y(Lcom/daaw/z70;)Lcom/daaw/d22;
    .locals 0

    iget-object p0, p0, Lcom/daaw/z70;->x:Lcom/daaw/d22;

    return-object p0
.end method

.method public static bridge synthetic z()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/daaw/z70;->I:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final D(Lcom/daaw/v70;ILcom/daaw/sj1;Lcom/daaw/tj1;Lcom/daaw/vf1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O::",
            "Lcom/daaw/k3$d;",
            "ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/v70<",
            "TO;>;I",
            "Lcom/daaw/sj1<",
            "Lcom/daaw/k3$b;",
            "TResultT;>;",
            "Lcom/daaw/tj1<",
            "TResultT;>;",
            "Lcom/daaw/vf1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p3}, Lcom/daaw/sj1;->d()I

    move-result v0

    invoke-virtual {p0, p4, v0, p1}, Lcom/daaw/z70;->l(Lcom/daaw/tj1;ILcom/daaw/v70;)V

    new-instance v0, Lcom/daaw/v12;

    invoke-direct {v0, p2, p3, p4, p5}, Lcom/daaw/v12;-><init>(ILcom/daaw/sj1;Lcom/daaw/tj1;Lcom/daaw/vf1;)V

    iget-object p2, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    new-instance p3, Lcom/daaw/a12;

    iget-object p4, p0, Lcom/daaw/z70;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-direct {p3, v0, p4, p1}, Lcom/daaw/a12;-><init>(Lcom/daaw/b22;ILcom/daaw/v70;)V

    const/4 p1, 0x4

    invoke-virtual {p2, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final E(Lcom/google/android/gms/common/internal/MethodInvocation;IJI)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    new-instance v7, Lcom/daaw/x02;

    move-object v1, v7

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/daaw/x02;-><init>(Lcom/google/android/gms/common/internal/MethodInvocation;IJI)V

    const/16 p1, 0x12

    invoke-virtual {v0, p1, v7}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final F(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 3

    invoke-virtual {p0, p1, p2}, Lcom/daaw/z70;->g(Lcom/google/android/gms/common/ConnectionResult;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final b(Lcom/daaw/v70;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v70<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final c(Lcom/daaw/uz1;)V
    .locals 2

    sget-object v0, Lcom/daaw/z70;->I:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/z70;->B:Lcom/daaw/uz1;

    if-eq v1, p1, :cond_0

    iput-object p1, p0, Lcom/daaw/z70;->B:Lcom/daaw/uz1;

    iget-object v1, p0, Lcom/daaw/z70;->C:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    :cond_0
    iget-object v1, p0, Lcom/daaw/z70;->C:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/daaw/uz1;->t()Lcom/daaw/j6;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final d(Lcom/daaw/uz1;)V
    .locals 2

    sget-object v0, Lcom/daaw/z70;->I:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/z70;->B:Lcom/daaw/uz1;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/z70;->B:Lcom/daaw/uz1;

    iget-object p1, p0, Lcom/daaw/z70;->C:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final f()Z
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/z70;->s:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lcom/daaw/g61;->b()Lcom/daaw/g61;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/g61;->a()Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/daaw/z70;->x:Lcom/daaw/d22;

    iget-object v2, p0, Lcom/daaw/z70;->v:Landroid/content/Context;

    const v3, 0xc1fa340

    invoke-virtual {v0, v2, v3}, Lcom/daaw/d22;->a(Landroid/content/Context;I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final g(Lcom/google/android/gms/common/ConnectionResult;I)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/z70;->w:Lcom/daaw/w70;

    iget-object v1, p0, Lcom/daaw/z70;->v:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/w70;->w(Landroid/content/Context;Lcom/google/android/gms/common/ConnectionResult;I)Z

    move-result p1

    return p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xd

    const-wide/32 v2, 0x493e0

    const/16 v4, 0x11

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    const/16 v1, 0x1f

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unknown message id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return v6

    :pswitch_0
    iput-boolean v6, p0, Lcom/daaw/z70;->s:Z

    goto/16 :goto_8

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/x02;

    iget-wide v0, p1, Lcom/daaw/x02;->c:J

    const-wide/16 v2, 0x0

    cmp-long v5, v0, v2

    if-nez v5, :cond_0

    new-instance v0, Lcom/google/android/gms/common/internal/TelemetryData;

    iget v1, p1, Lcom/daaw/x02;->b:I

    new-array v2, v7, [Lcom/google/android/gms/common/internal/MethodInvocation;

    iget-object p1, p1, Lcom/daaw/x02;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    aput-object p1, v2, v6

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    invoke-virtual {p0}, Lcom/daaw/z70;->j()Lcom/daaw/gk1;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/daaw/gk1;->b(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/daaw/rj1;

    goto/16 :goto_8

    :cond_0
    iget-object v0, p0, Lcom/daaw/z70;->t:Lcom/google/android/gms/common/internal/TelemetryData;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/TelemetryData;->q()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/TelemetryData;->h()I

    move-result v0

    iget v2, p1, Lcom/daaw/x02;->b:I

    if-ne v0, v2, :cond_2

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p1, Lcom/daaw/x02;->d:I

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/z70;->t:Lcom/google/android/gms/common/internal/TelemetryData;

    iget-object v1, p1, Lcom/daaw/x02;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/TelemetryData;->s(Lcom/google/android/gms/common/internal/MethodInvocation;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lcom/daaw/z70;->k()V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/z70;->t:Lcom/google/android/gms/common/internal/TelemetryData;

    if-nez v0, :cond_11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p1, Lcom/daaw/x02;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/android/gms/common/internal/TelemetryData;

    iget v2, p1, Lcom/daaw/x02;->b:I

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    iput-object v1, p0, Lcom/daaw/z70;->t:Lcom/google/android/gms/common/internal/TelemetryData;

    iget-object v0, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p1, Lcom/daaw/x02;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_8

    :pswitch_2
    invoke-virtual {p0}, Lcom/daaw/z70;->k()V

    goto/16 :goto_8

    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/k02;

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-static {p1}, Lcom/daaw/k02;->b(Lcom/daaw/k02;)Lcom/daaw/o3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-static {p1}, Lcom/daaw/k02;->b(Lcom/daaw/k02;)Lcom/daaw/o3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    invoke-static {v0, p1}, Lcom/daaw/i02;->z(Lcom/daaw/i02;Lcom/daaw/k02;)V

    goto/16 :goto_8

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/k02;

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-static {p1}, Lcom/daaw/k02;->b(Lcom/daaw/k02;)Lcom/daaw/o3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-static {p1}, Lcom/daaw/k02;->b(Lcom/daaw/k02;)Lcom/daaw/o3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    invoke-static {v0, p1}, Lcom/daaw/i02;->y(Lcom/daaw/i02;Lcom/daaw/k02;)V

    goto/16 :goto_8

    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/vz1;

    invoke-virtual {p1}, Lcom/daaw/vz1;->a()Lcom/daaw/o3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lcom/daaw/vz1;->b()Lcom/daaw/tj1;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    invoke-static {v0, v6}, Lcom/daaw/i02;->N(Lcom/daaw/i02;Z)Z

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/vz1;->b()Lcom/daaw/tj1;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_6
    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/i02;

    invoke-virtual {p1}, Lcom/daaw/i02;->a()Z

    goto/16 :goto_8

    :pswitch_7
    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/i02;

    invoke-virtual {p1}, Lcom/daaw/i02;->L()V

    goto/16 :goto_8

    :pswitch_8
    iget-object p1, p0, Lcom/daaw/z70;->D:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o3;

    iget-object v1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/daaw/i02;->K()V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/daaw/z70;->D:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto/16 :goto_8

    :pswitch_9
    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/i02;

    invoke-virtual {p1}, Lcom/daaw/i02;->J()V

    goto/16 :goto_8

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/v70;

    invoke-virtual {p0, p1}, Lcom/daaw/z70;->i(Lcom/daaw/v70;)Lcom/daaw/i02;

    goto/16 :goto_8

    :pswitch_b
    iget-object p1, p0, Lcom/daaw/z70;->v:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/app/Application;

    if-eqz p1, :cond_11

    iget-object p1, p0, Lcom/daaw/z70;->v:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/daaw/fa;->c(Landroid/app/Application;)V

    invoke-static {}, Lcom/daaw/fa;->b()Lcom/daaw/fa;

    move-result-object p1

    new-instance v0, Lcom/daaw/d02;

    invoke-direct {v0, p0}, Lcom/daaw/d02;-><init>(Lcom/daaw/z70;)V

    invoke-virtual {p1, v0}, Lcom/daaw/fa;->a(Lcom/daaw/fa$a;)V

    invoke-static {}, Lcom/daaw/fa;->b()Lcom/daaw/fa;

    move-result-object p1

    invoke-virtual {p1, v7}, Lcom/daaw/fa;->e(Z)Z

    move-result p1

    if-nez p1, :cond_11

    iput-wide v2, p0, Lcom/daaw/z70;->r:J

    goto/16 :goto_8

    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/ConnectionResult;

    iget-object v2, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/i02;

    invoke-virtual {v3}, Lcom/daaw/i02;->o()I

    move-result v6

    if-ne v6, v0, :cond_7

    move-object v5, v3

    :cond_8
    if-eqz v5, :cond_a

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result v0

    if-ne v0, v1, :cond_9

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    iget-object v1, p0, Lcom/daaw/z70;->w:Lcom/daaw/w70;

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/daaw/w70;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->q()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v6, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x45

    add-int/2addr v2, v3

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Error resolution was canceled by the user, original error message: "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v4, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v5, v0}, Lcom/daaw/i02;->v(Lcom/daaw/i02;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_8

    :cond_9
    invoke-static {v5}, Lcom/daaw/i02;->t(Lcom/daaw/i02;)Lcom/daaw/o3;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/z70;->h(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-static {v5, p1}, Lcom/daaw/i02;->v(Lcom/daaw/i02;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_8

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    const/16 v1, 0x4c

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Could not find API instance "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " while trying to fail enqueued calls."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "GoogleApiManager"

    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_8

    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/a12;

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    iget-object v1, p1, Lcom/daaw/a12;->c:Lcom/daaw/v70;

    invoke-virtual {v1}, Lcom/daaw/v70;->f()Lcom/daaw/o3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    if-nez v0, :cond_b

    iget-object v0, p1, Lcom/daaw/a12;->c:Lcom/daaw/v70;

    invoke-virtual {p0, v0}, Lcom/daaw/z70;->i(Lcom/daaw/v70;)Lcom/daaw/i02;

    move-result-object v0

    :cond_b
    invoke-virtual {v0}, Lcom/daaw/i02;->P()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/daaw/z70;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p1, Lcom/daaw/a12;->b:I

    if-eq v1, v2, :cond_c

    iget-object p1, p1, Lcom/daaw/a12;->a:Lcom/daaw/b22;

    sget-object v1, Lcom/daaw/z70;->G:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v1}, Lcom/daaw/b22;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0}, Lcom/daaw/i02;->K()V

    goto/16 :goto_8

    :cond_c
    iget-object p1, p1, Lcom/daaw/a12;->a:Lcom/daaw/b22;

    invoke-virtual {v0, p1}, Lcom/daaw/i02;->C(Lcom/daaw/b22;)V

    goto/16 :goto_8

    :pswitch_e
    iget-object p1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    invoke-virtual {v0}, Lcom/daaw/i02;->A()V

    invoke-virtual {v0}, Lcom/daaw/i02;->B()V

    goto :goto_4

    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/g22;

    invoke-virtual {p1}, Lcom/daaw/g22;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/o3;

    iget-object v3, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/i02;

    if-nez v3, :cond_d

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p1, v2, v0, v5}, Lcom/daaw/g22;->b(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v3}, Lcom/daaw/i02;->O()Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, Lcom/google/android/gms/common/ConnectionResult;->t:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v3}, Lcom/daaw/i02;->s()Lcom/daaw/k3$f;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/k3$f;->getEndpointPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v4, v3}, Lcom/daaw/g22;->b(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    invoke-virtual {v3}, Lcom/daaw/i02;->q()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {p1, v2, v4, v5}, Lcom/daaw/g22;->b(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V

    goto :goto_5

    :cond_f
    invoke-virtual {v3, p1}, Lcom/daaw/i02;->H(Lcom/daaw/g22;)V

    invoke-virtual {v3}, Lcom/daaw/i02;->B()V

    goto :goto_5

    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eq v7, p1, :cond_10

    goto :goto_6

    :cond_10
    const-wide/16 v2, 0x2710

    :goto_6
    iput-wide v2, p0, Lcom/daaw/z70;->r:J

    iget-object p1, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/o3;

    iget-object v2, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-wide v3, p0, Lcom/daaw/z70;->r:J

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_7

    :cond_11
    :goto_8
    return v7

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lcom/daaw/v70;)Lcom/daaw/i02;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v70<",
            "*>;)",
            "Lcom/daaw/i02<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/v70;->f()Lcom/daaw/o3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/i02;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/i02;

    invoke-direct {v1, p0, p1}, Lcom/daaw/i02;-><init>(Lcom/daaw/z70;Lcom/daaw/v70;)V

    iget-object p1, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/i02;->P()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/z70;->D:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v1}, Lcom/daaw/i02;->B()V

    return-object v1
.end method

.method public final j()Lcom/daaw/gk1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z70;->u:Lcom/daaw/gk1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/z70;->v:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/fk1;->a(Landroid/content/Context;)Lcom/daaw/gk1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/z70;->u:Lcom/daaw/gk1;

    :cond_0
    iget-object v0, p0, Lcom/daaw/z70;->u:Lcom/daaw/gk1;

    return-object v0
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/z70;->t:Lcom/google/android/gms/common/internal/TelemetryData;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/TelemetryData;->h()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/z70;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/z70;->j()Lcom/daaw/gk1;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/daaw/gk1;->b(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/daaw/rj1;

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/z70;->t:Lcom/google/android/gms/common/internal/TelemetryData;

    :cond_2
    return-void
.end method

.method public final l(Lcom/daaw/tj1;ILcom/daaw/v70;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/tj1<",
            "TT;>;I",
            "Lcom/daaw/v70;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p3}, Lcom/daaw/v70;->f()Lcom/daaw/o3;

    move-result-object p3

    invoke-static {p0, p2, p3}, Lcom/daaw/w02;->b(Lcom/daaw/z70;ILcom/daaw/o3;)Lcom/daaw/w02;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object p1

    iget-object p3, p0, Lcom/daaw/z70;->E:Landroid/os/Handler;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/daaw/c02;

    invoke-direct {v0, p3}, Lcom/daaw/c02;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p1, v0, p2}, Lcom/daaw/rj1;->c(Ljava/util/concurrent/Executor;Lcom/daaw/cu0;)Lcom/daaw/rj1;

    :cond_0
    return-void
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/z70;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    return v0
.end method

.method public final w(Lcom/daaw/o3;)Lcom/daaw/i02;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/o3<",
            "*>;)",
            "Lcom/daaw/i02;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/z70;->A:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/i02;

    return-object p1
.end method
