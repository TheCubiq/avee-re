.class public final Lcom/daaw/dr6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xe7;


# static fields
.field public static volatile H:Lcom/daaw/dr6;


# instance fields
.field public volatile A:Ljava/lang/Boolean;

.field public B:Ljava/lang/Boolean;

.field public C:Ljava/lang/Boolean;

.field public volatile D:Z

.field public E:I

.field public final F:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final G:J

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Lcom/daaw/b52;

.field public final g:Lcom/daaw/qa2;

.field public final h:Lcom/daaw/l36;

.field public final i:Lcom/daaw/om5;

.field public final j:Lcom/daaw/vn6;

.field public final k:Lcom/daaw/ca8;

.field public final l:Lcom/daaw/dd8;

.field public final m:Lcom/daaw/xg5;

.field public final n:Lcom/daaw/ag;

.field public final o:Lcom/daaw/r48;

.field public final p:Lcom/daaw/p28;

.field public final q:Lcom/daaw/vk4;

.field public final r:Lcom/daaw/k38;

.field public final s:Ljava/lang/String;

.field public t:Lcom/daaw/re5;

.field public u:Lcom/daaw/x78;

.field public v:Lcom/daaw/lm2;

.field public w:Lcom/daaw/xb5;

.field public x:Z

.field public y:Ljava/lang/Boolean;

.field public z:J


# direct methods
.method public constructor <init>(Lcom/daaw/vn7;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/dr6;->x:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/dr6;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lcom/daaw/vn7;->a:Landroid/content/Context;

    new-instance v2, Lcom/daaw/b52;

    invoke-direct {v2, v1}, Lcom/daaw/b52;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/daaw/dr6;->f:Lcom/daaw/b52;

    sput-object v2, Lcom/daaw/d45;->a:Lcom/daaw/b52;

    iput-object v1, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    iget-object v2, p1, Lcom/daaw/vn7;->b:Ljava/lang/String;

    iput-object v2, p0, Lcom/daaw/dr6;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/daaw/vn7;->c:Ljava/lang/String;

    iput-object v2, p0, Lcom/daaw/dr6;->c:Ljava/lang/String;

    iget-object v2, p1, Lcom/daaw/vn7;->d:Ljava/lang/String;

    iput-object v2, p0, Lcom/daaw/dr6;->d:Ljava/lang/String;

    iget-boolean v2, p1, Lcom/daaw/vn7;->h:Z

    iput-boolean v2, p0, Lcom/daaw/dr6;->e:Z

    iget-object v2, p1, Lcom/daaw/vn7;->e:Ljava/lang/Boolean;

    iput-object v2, p0, Lcom/daaw/dr6;->A:Ljava/lang/Boolean;

    iget-object v2, p1, Lcom/daaw/vn7;->j:Ljava/lang/String;

    iput-object v2, p0, Lcom/daaw/dr6;->s:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/daaw/dr6;->D:Z

    iget-object v3, p1, Lcom/daaw/vn7;->g:Lcom/google/android/gms/internal/measurement/zzcl;

    if-eqz v3, :cond_1

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzcl;->v:Landroid/os/Bundle;

    if-eqz v4, :cond_1

    const-string v5, "measurementEnabled"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/Boolean;

    iput-object v4, p0, Lcom/daaw/dr6;->B:Ljava/lang/Boolean;

    :cond_0
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzcl;->v:Landroid/os/Bundle;

    const-string v4, "measurementDeactivated"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/Boolean;

    iput-object v3, p0, Lcom/daaw/dr6;->C:Ljava/lang/Boolean;

    :cond_1
    invoke-static {v1}, Lcom/daaw/j38;->e(Landroid/content/Context;)V

    invoke-static {}, Lcom/daaw/mq;->d()Lcom/daaw/ag;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/dr6;->n:Lcom/daaw/ag;

    iget-object v4, p1, Lcom/daaw/vn7;->i:Ljava/lang/Long;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lcom/daaw/ag;->a()J

    move-result-wide v3

    :goto_0
    iput-wide v3, p0, Lcom/daaw/dr6;->G:J

    new-instance v3, Lcom/daaw/qa2;

    invoke-direct {v3, p0}, Lcom/daaw/qa2;-><init>(Lcom/daaw/dr6;)V

    iput-object v3, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    new-instance v3, Lcom/daaw/l36;

    invoke-direct {v3, p0}, Lcom/daaw/l36;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/ud7;->k()V

    iput-object v3, p0, Lcom/daaw/dr6;->h:Lcom/daaw/l36;

    new-instance v3, Lcom/daaw/om5;

    invoke-direct {v3, p0}, Lcom/daaw/om5;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/ud7;->k()V

    iput-object v3, p0, Lcom/daaw/dr6;->i:Lcom/daaw/om5;

    new-instance v3, Lcom/daaw/dd8;

    invoke-direct {v3, p0}, Lcom/daaw/dd8;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/ud7;->k()V

    iput-object v3, p0, Lcom/daaw/dr6;->l:Lcom/daaw/dd8;

    new-instance v3, Lcom/daaw/sm7;

    invoke-direct {v3, p1, p0}, Lcom/daaw/sm7;-><init>(Lcom/daaw/vn7;Lcom/daaw/dr6;)V

    new-instance v4, Lcom/daaw/xg5;

    invoke-direct {v4, v3}, Lcom/daaw/xg5;-><init>(Lcom/daaw/uf5;)V

    iput-object v4, p0, Lcom/daaw/dr6;->m:Lcom/daaw/xg5;

    new-instance v3, Lcom/daaw/vk4;

    invoke-direct {v3, p0}, Lcom/daaw/vk4;-><init>(Lcom/daaw/dr6;)V

    iput-object v3, p0, Lcom/daaw/dr6;->q:Lcom/daaw/vk4;

    new-instance v3, Lcom/daaw/r48;

    invoke-direct {v3, p0}, Lcom/daaw/r48;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/c86;->h()V

    iput-object v3, p0, Lcom/daaw/dr6;->o:Lcom/daaw/r48;

    new-instance v3, Lcom/daaw/p28;

    invoke-direct {v3, p0}, Lcom/daaw/p28;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/c86;->h()V

    iput-object v3, p0, Lcom/daaw/dr6;->p:Lcom/daaw/p28;

    new-instance v3, Lcom/daaw/ca8;

    invoke-direct {v3, p0}, Lcom/daaw/ca8;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/c86;->h()V

    iput-object v3, p0, Lcom/daaw/dr6;->k:Lcom/daaw/ca8;

    new-instance v3, Lcom/daaw/k38;

    invoke-direct {v3, p0}, Lcom/daaw/k38;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/ud7;->k()V

    iput-object v3, p0, Lcom/daaw/dr6;->r:Lcom/daaw/k38;

    new-instance v3, Lcom/daaw/vn6;

    invoke-direct {v3, p0}, Lcom/daaw/vn6;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v3}, Lcom/daaw/ud7;->k()V

    iput-object v3, p0, Lcom/daaw/dr6;->j:Lcom/daaw/vn6;

    iget-object v4, p1, Lcom/daaw/vn7;->g:Lcom/google/android/gms/internal/measurement/zzcl;

    if-eqz v4, :cond_3

    iget-wide v4, v4, Lcom/google/android/gms/internal/measurement/zzcl;->q:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object v2, v2, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Application;

    if-eqz v2, :cond_6

    iget-object v2, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object v2, v2, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    iget-object v4, v1, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    if-nez v4, :cond_4

    new-instance v4, Lcom/daaw/m28;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lcom/daaw/m28;-><init>(Lcom/daaw/p28;Lcom/daaw/j28;)V

    iput-object v4, v1, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    :cond_4
    if-eqz v0, :cond_6

    iget-object v0, v1, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    invoke-virtual {v2, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    invoke-virtual {v2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    :goto_2
    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/daaw/bq6;

    invoke-direct {v0, p0, p1}, Lcom/daaw/bq6;-><init>(Lcom/daaw/dr6;Lcom/daaw/vn7;)V

    invoke-virtual {v3, v0}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)Lcom/daaw/dr6;
    .locals 12

    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzcl;->t:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzcl;->u:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcl;

    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzcl;->p:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/measurement/zzcl;->q:J

    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/zzcl;->r:Z

    iget-object v7, p1, Lcom/google/android/gms/internal/measurement/zzcl;->s:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object v10, p1, Lcom/google/android/gms/internal/measurement/zzcl;->v:Landroid/os/Bundle;

    const/4 v11, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/measurement/zzcl;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-static {p0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/daaw/dr6;->H:Lcom/daaw/dr6;

    if-nez v0, :cond_3

    const-class v0, Lcom/daaw/dr6;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/dr6;->H:Lcom/daaw/dr6;

    if-nez v1, :cond_2

    new-instance v1, Lcom/daaw/vn7;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/vn7;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)V

    new-instance p0, Lcom/daaw/dr6;

    invoke-direct {p0, v1}, Lcom/daaw/dr6;-><init>(Lcom/daaw/vn7;)V

    sput-object p0, Lcom/daaw/dr6;->H:Lcom/daaw/dr6;

    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    if-eqz p1, :cond_4

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzcl;->v:Landroid/os/Bundle;

    if-eqz p0, :cond_4

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lcom/daaw/dr6;->H:Lcom/daaw/dr6;

    invoke-static {p0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/daaw/dr6;->H:Lcom/daaw/dr6;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzcl;->v:Landroid/os/Bundle;

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dr6;->A:Ljava/lang/Boolean;

    :cond_4
    :goto_0
    sget-object p0, Lcom/daaw/dr6;->H:Lcom/daaw/dr6;

    invoke-static {p0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/daaw/dr6;->H:Lcom/daaw/dr6;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/dr6;Lcom/daaw/vn7;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {v0}, Lcom/daaw/qa2;->w()Ljava/lang/String;

    new-instance v0, Lcom/daaw/lm2;

    invoke-direct {v0, p0}, Lcom/daaw/lm2;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v0}, Lcom/daaw/ud7;->k()V

    iput-object v0, p0, Lcom/daaw/dr6;->v:Lcom/daaw/lm2;

    new-instance v0, Lcom/daaw/xb5;

    iget-wide v1, p1, Lcom/daaw/vn7;->f:J

    invoke-direct {v0, p0, v1, v2}, Lcom/daaw/xb5;-><init>(Lcom/daaw/dr6;J)V

    invoke-virtual {v0}, Lcom/daaw/c86;->h()V

    iput-object v0, p0, Lcom/daaw/dr6;->w:Lcom/daaw/xb5;

    new-instance p1, Lcom/daaw/re5;

    invoke-direct {p1, p0}, Lcom/daaw/re5;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {p1}, Lcom/daaw/c86;->h()V

    iput-object p1, p0, Lcom/daaw/dr6;->t:Lcom/daaw/re5;

    new-instance p1, Lcom/daaw/x78;

    invoke-direct {p1, p0}, Lcom/daaw/x78;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {p1}, Lcom/daaw/c86;->h()V

    iput-object p1, p0, Lcom/daaw/dr6;->u:Lcom/daaw/x78;

    iget-object p1, p0, Lcom/daaw/dr6;->l:Lcom/daaw/dd8;

    invoke-virtual {p1}, Lcom/daaw/ud7;->l()V

    iget-object p1, p0, Lcom/daaw/dr6;->h:Lcom/daaw/l36;

    invoke-virtual {p1}, Lcom/daaw/ud7;->l()V

    iget-object p1, p0, Lcom/daaw/dr6;->w:Lcom/daaw/xb5;

    invoke-virtual {p1}, Lcom/daaw/c86;->j()V

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->u()Lcom/daaw/hk5;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {v1}, Lcom/daaw/qa2;->p()J

    const-wide/32 v1, 0x1212d

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "App measurement initialized, version"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->u()Lcom/daaw/hk5;

    move-result-object p1

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {p1, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/daaw/xb5;->s()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/dr6;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/dd8;->T(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->u()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->u()Lcom/daaw/hk5;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "Debug-level message logging enabled"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget p1, p0, Lcom/daaw/dr6;->E:I

    iget-object v0, p0, Lcom/daaw/dr6;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    iget v0, p0, Lcom/daaw/dr6;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/dr6;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/dr6;->x:Z

    return-void
.end method

.method public static final t()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final u(Lcom/daaw/rc7;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final v(Lcom/daaw/c86;)V
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/c86;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final w(Lcom/daaw/ud7;)V
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ud7;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A()Lcom/daaw/lm2;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->v:Lcom/daaw/lm2;

    invoke-static {v0}, Lcom/daaw/dr6;->w(Lcom/daaw/ud7;)V

    iget-object v0, p0, Lcom/daaw/dr6;->v:Lcom/daaw/lm2;

    return-object v0
.end method

.method public final B()Lcom/daaw/xb5;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->w:Lcom/daaw/xb5;

    invoke-static {v0}, Lcom/daaw/dr6;->v(Lcom/daaw/c86;)V

    iget-object v0, p0, Lcom/daaw/dr6;->w:Lcom/daaw/xb5;

    return-object v0
.end method

.method public final C()Lcom/daaw/re5;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->t:Lcom/daaw/re5;

    invoke-static {v0}, Lcom/daaw/dr6;->v(Lcom/daaw/c86;)V

    iget-object v0, p0, Lcom/daaw/dr6;->t:Lcom/daaw/re5;

    return-object v0
.end method

.method public final D()Lcom/daaw/xg5;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->m:Lcom/daaw/xg5;

    return-object v0
.end method

.method public final E()Lcom/daaw/om5;
    .locals 2

    iget-object v0, p0, Lcom/daaw/dr6;->i:Lcom/daaw/om5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ud7;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final F()Lcom/daaw/l36;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->h:Lcom/daaw/l36;

    invoke-static {v0}, Lcom/daaw/dr6;->u(Lcom/daaw/rc7;)V

    iget-object v0, p0, Lcom/daaw/dr6;->h:Lcom/daaw/l36;

    return-object v0
.end method

.method public final G()Lcom/daaw/vn6;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->j:Lcom/daaw/vn6;

    return-object v0
.end method

.method public final I()Lcom/daaw/p28;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->p:Lcom/daaw/p28;

    invoke-static {v0}, Lcom/daaw/dr6;->v(Lcom/daaw/c86;)V

    iget-object v0, p0, Lcom/daaw/dr6;->p:Lcom/daaw/p28;

    return-object v0
.end method

.method public final J()Lcom/daaw/k38;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->r:Lcom/daaw/k38;

    invoke-static {v0}, Lcom/daaw/dr6;->w(Lcom/daaw/ud7;)V

    iget-object v0, p0, Lcom/daaw/dr6;->r:Lcom/daaw/k38;

    return-object v0
.end method

.method public final K()Lcom/daaw/r48;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->o:Lcom/daaw/r48;

    invoke-static {v0}, Lcom/daaw/dr6;->v(Lcom/daaw/c86;)V

    iget-object v0, p0, Lcom/daaw/dr6;->o:Lcom/daaw/r48;

    return-object v0
.end method

.method public final L()Lcom/daaw/x78;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->u:Lcom/daaw/x78;

    invoke-static {v0}, Lcom/daaw/dr6;->v(Lcom/daaw/c86;)V

    iget-object v0, p0, Lcom/daaw/dr6;->u:Lcom/daaw/x78;

    return-object v0
.end method

.method public final M()Lcom/daaw/ca8;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->k:Lcom/daaw/ca8;

    invoke-static {v0}, Lcom/daaw/dr6;->v(Lcom/daaw/c86;)V

    iget-object v0, p0, Lcom/daaw/dr6;->k:Lcom/daaw/ca8;

    return-object v0
.end method

.method public final N()Lcom/daaw/dd8;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->l:Lcom/daaw/dd8;

    invoke-static {v0}, Lcom/daaw/dr6;->u(Lcom/daaw/rc7;)V

    iget-object v0, p0, Lcom/daaw/dr6;->l:Lcom/daaw/dd8;

    return-object v0
.end method

.method public final O()Ljava/lang/String;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final Q()Ljava/lang/String;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final R()Ljava/lang/String;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final a()Lcom/daaw/b52;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->f:Lcom/daaw/b52;

    return-object v0
.end method

.method public final b()Lcom/daaw/ag;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->n:Lcom/daaw/ag;

    return-object v0
.end method

.method public final d()Landroid/content/Context;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dr6;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final synthetic f(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    const-string p1, "timestamp"

    const-string p5, "gclid"

    const-string v0, ""

    const-string v1, "deeplink"

    const/16 v2, 0x130

    const/16 v3, 0xc8

    if-eq p2, v3, :cond_0

    const/16 v3, 0xcc

    if-eq p2, v3, :cond_0

    if-ne p2, v2, :cond_8

    const/16 p2, 0x130

    :cond_0
    if-nez p3, :cond_8

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/l36;->s:Lcom/daaw/qw5;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lcom/daaw/qw5;->a(Z)V

    if-eqz p4, :cond_7

    array-length p2, p4

    if-nez p2, :cond_1

    goto/16 :goto_2

    :cond_1
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p4}, Ljava/lang/String;-><init>([B)V

    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-wide/16 v2, 0x0

    invoke-virtual {p3, p1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "Deferred Deep Link is empty."

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p3

    iget-object v0, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_1

    :cond_3
    iget-object p3, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object p3, p3, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    new-instance v0, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/4 v4, 0x0

    invoke-virtual {p3, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_6

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_6

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, p5, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "_cis"

    const-string p5, "ddp"

    invoke-virtual {p3, p4, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p0, Lcom/daaw/dr6;->p:Lcom/daaw/p28;

    const-string p5, "auto"

    const-string v0, "_cmp"

    invoke-virtual {p4, p5, v0, p3}, Lcom/daaw/p28;->u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p4, :cond_4

    goto :goto_0

    :cond_4
    :try_start_1
    iget-object p4, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object p4, p4, Lcom/daaw/dr6;->a:Landroid/content/Context;

    const-string p5, "google.analytics.deferred.deeplink.prefs"

    invoke-virtual {p4, p5, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p4

    invoke-interface {p4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p4

    invoke-interface {p4, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-interface {p4, p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz p1, :cond_5

    :try_start_2
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.google.analytics.action.DEEPLINK_ACTION"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object p2, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object p2, p2, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_5
    :goto_0
    return-void

    :catch_0
    move-exception p1

    iget-object p2, p3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p2

    const-string p3, "Failed to persist Deferred Deep Link. exception"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_6
    :goto_1
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    const-string p3, "Deferred Deep Link validation failed. gclid, deep link"

    invoke-virtual {p1, p3, p4, p2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p2

    const-string p3, "Failed to parse the Deferred Deep Link response. exception"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_7
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "Deferred Deep Link response empty."

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p4, "Network Request for Deferred Deep Link failed. response, exception"

    invoke-virtual {p1, p4, p2, p3}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final g()V
    .locals 1

    iget v0, p0, Lcom/daaw/dr6;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/dr6;->E:I

    return-void
.end method

.method public final h()V
    .locals 11

    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/dr6;->J()Lcom/daaw/k38;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/dr6;->w(Lcom/daaw/ud7;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xb5;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/l36;->o(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {v2}, Lcom/daaw/qa2;->A()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/dr6;->J()Lcom/daaw/k38;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/ud7;->j()V

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object v2, v2, Lcom/daaw/dr6;->a:Landroid/content/Context;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_1
    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v2

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object v3, v3, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {v3}, Lcom/daaw/qa2;->p()J

    const-wide/32 v3, 0x1212d

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/l36;->t:Lcom/daaw/xy5;

    invoke-virtual {v1}, Lcom/daaw/xy5;->a()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    add-long/2addr v6, v8

    move-object v1, v2

    move-wide v2, v3

    move-object v4, v0

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/dd8;->s(JLjava/lang/String;Ljava/lang/String;J)Ljava/net/URL;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lcom/daaw/dr6;->J()Lcom/daaw/k38;

    move-result-object v2

    new-instance v7, Lcom/daaw/yo6;

    invoke-direct {v7, p0}, Lcom/daaw/yo6;-><init>(Lcom/daaw/dr6;)V

    invoke-virtual {v2}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v2}, Lcom/daaw/ud7;->j()V

    invoke-static {v4}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v9

    new-instance v10, Lcom/daaw/h38;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, v10

    move-object v3, v0

    invoke-direct/range {v1 .. v8}, Lcom/daaw/h38;-><init>(Lcom/daaw/k38;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/daaw/yo6;[B)V

    invoke-virtual {v9, v10}, Lcom/daaw/vn6;->y(Ljava/lang/Runnable;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Network is not available for Deferred Deep Link request. Skipping"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final i()Lcom/daaw/om5;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->i:Lcom/daaw/om5;

    invoke-static {v0}, Lcom/daaw/dr6;->w(Lcom/daaw/ud7;)V

    iget-object v0, p0, Lcom/daaw/dr6;->i:Lcom/daaw/om5;

    return-object v0
.end method

.method public final j(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dr6;->A:Ljava/lang/Boolean;

    return-void
.end method

.method public final k(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iput-boolean p1, p0, Lcom/daaw/dr6;->D:Z

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/measurement/zzcl;)V
    .locals 10

    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l36;->p()Lcom/daaw/cd2;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v1}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "consent_source"

    const/16 v3, 0x64

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    iget-object v4, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    const-string v4, "google_analytics_default_allow_ad_storage"

    invoke-virtual {v2, v4}, Lcom/daaw/qa2;->t(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    iget-object v5, v4, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    const-string v5, "google_analytics_default_allow_analytics_storage"

    invoke-virtual {v4, v5}, Lcom/daaw/qa2;->t(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    const/16 v5, -0xa

    const/16 v6, 0x1e

    const/4 v7, 0x0

    if-nez v2, :cond_0

    if-eqz v4, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v8

    invoke-virtual {v8, v5}, Lcom/daaw/l36;->w(I)Z

    move-result v8

    if-eqz v8, :cond_1

    new-instance p1, Lcom/daaw/cd2;

    invoke-direct {p1, v2, v4}, Lcom/daaw/cd2;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    const/16 v3, -0xa

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    if-eqz v1, :cond_2

    if-eq v1, v6, :cond_2

    const/16 v2, 0xa

    if-eq v1, v2, :cond_2

    if-eq v1, v6, :cond_2

    if-eq v1, v6, :cond_2

    const/16 v2, 0x28

    if-ne v1, v2, :cond_3

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    sget-object v1, Lcom/daaw/cd2;->b:Lcom/daaw/cd2;

    iget-wide v8, p0, Lcom/daaw/dr6;->G:J

    invoke-virtual {p1, v1, v5, v8, v9}, Lcom/daaw/p28;->G(Lcom/daaw/cd2;IJ)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz p1, :cond_4

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzcl;->v:Landroid/os/Bundle;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/daaw/l36;->w(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzcl;->v:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/daaw/cd2;->a(Landroid/os/Bundle;)Lcom/daaw/cd2;

    move-result-object p1

    sget-object v1, Lcom/daaw/cd2;->b:Lcom/daaw/cd2;

    invoke-virtual {p1, v1}, Lcom/daaw/cd2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const/16 v3, 0x1e

    goto :goto_1

    :cond_4
    :goto_0
    move-object p1, v7

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    iget-wide v1, p0, Lcom/daaw/dr6;->G:J

    invoke-virtual {v0, p1, v3, v1, v2}, Lcom/daaw/p28;->G(Lcom/daaw/cd2;IJ)V

    move-object v0, p1

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/p28;->J(Lcom/daaw/cd2;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->e:Lcom/daaw/xy5;

    invoke-virtual {p1}, Lcom/daaw/xy5;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object p1

    iget-wide v0, p0, Lcom/daaw/dr6;->G:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Persisting first open"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->e:Lcom/daaw/xy5;

    iget-wide v0, p0, Lcom/daaw/dr6;->G:J

    invoke-virtual {p1, v0, v1}, Lcom/daaw/xy5;->b(J)V

    :cond_6
    invoke-virtual {p0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/p28;->n:Lcom/daaw/gr8;

    invoke-virtual {p1}, Lcom/daaw/gr8;->c()V

    invoke-virtual {p0}, Lcom/daaw/dr6;->q()Z

    move-result p1

    if-nez p1, :cond_b

    invoke-virtual {p0}, Lcom/daaw/dr6;->n()Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p1

    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, Lcom/daaw/dd8;->S(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "App is missing INTERNET permission"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p1

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p1, v0}, Lcom/daaw/dd8;->S(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_8
    iget-object p1, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/ez1;->a(Landroid/content/Context;)Lcom/daaw/iv0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/iv0;->g()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {p1}, Lcom/daaw/qa2;->G()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/dd8;->Y(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_9
    iget-object p1, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/dd8;->Z(Landroid/content/Context;Z)Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "AppMeasurementService not registered/enabled"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "Uploading is not possible. App measurement disabled"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_b
    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xb5;->q()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_f

    :cond_c
    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v1}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "gmp_app_id"

    invoke-interface {v1, v2, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/xb5;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v4}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "admob_app_id"

    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v0, v1, v3, v4}, Lcom/daaw/dd8;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->u()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p1}, Lcom/daaw/l36;->q()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-eqz v0, :cond_d

    invoke-virtual {p1, v0}, Lcom/daaw/l36;->s(Ljava/lang/Boolean;)V

    :cond_d
    invoke-virtual {p0}, Lcom/daaw/dr6;->C()Lcom/daaw/re5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/re5;->p()V

    iget-object p1, p0, Lcom/daaw/dr6;->u:Lcom/daaw/x78;

    invoke-virtual {p1}, Lcom/daaw/x78;->Q()V

    iget-object p1, p0, Lcom/daaw/dr6;->u:Lcom/daaw/x78;

    invoke-virtual {p1}, Lcom/daaw/x78;->P()V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->e:Lcom/daaw/xy5;

    iget-wide v0, p0, Lcom/daaw/dr6;->G:J

    invoke-virtual {p1, v0, v1}, Lcom/daaw/xy5;->b(J)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->g:Lcom/daaw/i26;

    invoke-virtual {p1, v7}, Lcom/daaw/i26;->b(Ljava/lang/String;)V

    :cond_e
    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p1}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xb5;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p1}, Lcom/daaw/l36;->n()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_f
    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/l36;->p()Lcom/daaw/cd2;

    move-result-object p1

    sget-object v0, Lcom/daaw/vb2;->r:Lcom/daaw/vb2;

    invoke-virtual {p1, v0}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->g:Lcom/daaw/i26;

    invoke-virtual {p1, v7}, Lcom/daaw/i26;->b(Ljava/lang/String;)V

    :cond_10
    invoke-virtual {p0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->g:Lcom/daaw/i26;

    invoke-virtual {v0}, Lcom/daaw/i26;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/p28;->C(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/qj8;->b()Z

    iget-object p1, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    sget-object v0, Lcom/daaw/m75;->e0:Lcom/daaw/j65;

    invoke-virtual {p1, v7, v0}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p1

    :try_start_0
    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object p1, p1, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v0, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->u:Lcom/daaw/i26;

    invoke-virtual {p1}, Lcom/daaw/i26;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_11

    invoke-virtual {p0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    const-string v0, "Remote config removed with active feature rollouts"

    invoke-virtual {p1, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->u:Lcom/daaw/i26;

    invoke-virtual {p1, v7}, Lcom/daaw/i26;->b(Ljava/lang/String;)V

    :cond_11
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_12

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xb5;->q()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_15

    :cond_12
    invoke-virtual {p0}, Lcom/daaw/dr6;->n()Z

    move-result p1

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l36;->u()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {v0}, Lcom/daaw/qa2;->E()Z

    move-result v0

    if-nez v0, :cond_13

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/l36;->t(Z)V

    :cond_13
    if-eqz p1, :cond_14

    invoke-virtual {p0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/p28;->f0()V

    :cond_14
    invoke-virtual {p0}, Lcom/daaw/dr6;->M()Lcom/daaw/ca8;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/ca8;->d:Lcom/daaw/z98;

    invoke-virtual {p1}, Lcom/daaw/z98;->a()V

    invoke-virtual {p0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object p1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/x78;->S(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->x:Lcom/daaw/ux5;

    invoke-virtual {v0}, Lcom/daaw/ux5;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/x78;->v(Landroid/os/Bundle;)V

    :cond_15
    :goto_3
    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/l36;->n:Lcom/daaw/qw5;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/qw5;->a(Z)V

    return-void
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/dr6;->A:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dr6;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final n()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dr6;->x()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-boolean v0, p0, Lcom/daaw/dr6;->D:Z

    return v0
.end method

.method public final p()Z
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public final q()Z
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/dr6;->x:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/dr6;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lcom/daaw/dr6;->z:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/daaw/dr6;->n:Lcom/daaw/ag;

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/dr6;->z:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-lez v4, :cond_5

    :cond_0
    iget-object v0, p0, Lcom/daaw/dr6;->n:Lcom/daaw/ag;

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/dr6;->z:J

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/daaw/dd8;->S(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v0

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v3}, Lcom/daaw/dd8;->S(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/ez1;->a(Landroid/content/Context;)Lcom/daaw/iv0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/iv0;->g()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {v0}, Lcom/daaw/qa2;->G()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/dd8;->Y(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/dr6;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/daaw/dd8;->Z(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dr6;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/xb5;->t()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/xb5;->q()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/daaw/dd8;->L(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xb5;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dr6;->y:Ljava/lang/Boolean;

    :cond_5
    iget-object v0, p0, Lcom/daaw/dr6;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r()Lcom/daaw/vn6;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->j:Lcom/daaw/vn6;

    invoke-static {v0}, Lcom/daaw/dr6;->w(Lcom/daaw/ud7;)V

    iget-object v0, p0, Lcom/daaw/dr6;->j:Lcom/daaw/vn6;

    return-object v0
.end method

.method public final s()Z
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/dr6;->e:Z

    return v0
.end method

.method public final x()I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    invoke-virtual {v0}, Lcom/daaw/qa2;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/dr6;->C:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    return v0

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    iget-boolean v0, p0, Lcom/daaw/dr6;->D:Z

    if-nez v0, :cond_3

    const/16 v0, 0x8

    return v0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l36;->q()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    const/4 v0, 0x3

    return v0

    :cond_5
    iget-object v0, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    iget-object v2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    iget-object v2, v2, Lcom/daaw/dr6;->f:Lcom/daaw/b52;

    const-string v2, "firebase_analytics_collection_enabled"

    invoke-virtual {v0, v2}, Lcom/daaw/qa2;->t(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x4

    return v0

    :cond_7
    iget-object v0, p0, Lcom/daaw/dr6;->B:Ljava/lang/Boolean;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    const/4 v0, 0x5

    return v0

    :cond_9
    iget-object v0, p0, Lcom/daaw/dr6;->A:Ljava/lang/Boolean;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/daaw/dr6;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    return v1

    :cond_a
    const/4 v0, 0x7

    return v0

    :cond_b
    return v1
.end method

.method public final y()Lcom/daaw/vk4;
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->q:Lcom/daaw/vk4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z()Lcom/daaw/qa2;
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    iget-object v0, p0, Lcom/daaw/dr6;->g:Lcom/daaw/qa2;

    return-object v0
.end method
