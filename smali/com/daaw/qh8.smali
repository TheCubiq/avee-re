.class public final Lcom/daaw/qh8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/yc8;

.field public static final b:Lcom/daaw/yc8;

.field public static final c:Lcom/daaw/yc8;

.field public static final d:Lcom/daaw/yc8;

.field public static volatile e:Lcom/daaw/e92;

.field public static final f:Ljava/lang/Object;

.field public static g:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/w76;

    const-string v1, "0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\u0008s\u00f9/\u008eQ\u00ed"

    invoke-static {v1}, Lcom/daaw/l68;->M(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/w76;-><init>([B)V

    sput-object v0, Lcom/daaw/qh8;->a:Lcom/daaw/yc8;

    new-instance v0, Lcom/daaw/r07;

    const-string v1, "0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"

    invoke-static {v1}, Lcom/daaw/l68;->M(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/r07;-><init>([B)V

    sput-object v0, Lcom/daaw/qh8;->b:Lcom/daaw/yc8;

    new-instance v0, Lcom/daaw/ku7;

    const-string v1, "0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"

    invoke-static {v1}, Lcom/daaw/l68;->M(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/ku7;-><init>([B)V

    sput-object v0, Lcom/daaw/qh8;->c:Lcom/daaw/yc8;

    new-instance v0, Lcom/daaw/f38;

    const-string v1, "0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"

    invoke-static {v1}, Lcom/daaw/l68;->M(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/f38;-><init>([B)V

    sput-object v0, Lcom/daaw/qh8;->d:Lcom/daaw/yc8;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/qh8;->f:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/l68;ZZ)Lcom/daaw/fx8;
    .locals 1

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    :try_start_0
    invoke-static {p0, p1, p2, p3}, Lcom/daaw/qh8;->f(Ljava/lang/String;Lcom/daaw/l68;ZZ)Lcom/daaw/fx8;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw p0
.end method

.method public static b(Ljava/lang/String;ZZZ)Lcom/daaw/fx8;
    .locals 0

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p0, p1, p2, p2, p3}, Lcom/daaw/qh8;->g(Ljava/lang/String;ZZZZ)Lcom/daaw/fx8;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLjava/lang/String;Lcom/daaw/l68;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p0, :cond_0

    invoke-static {p1, p2, v0, v1}, Lcom/daaw/qh8;->f(Ljava/lang/String;Lcom/daaw/l68;ZZ)Lcom/daaw/fx8;

    move-result-object v2

    iget-boolean v2, v2, Lcom/daaw/fx8;->a:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eq v0, v2, :cond_1

    const-string v2, "not allowed"

    goto :goto_1

    :cond_1
    const-string v2, "debug cert rejected"

    :goto_1
    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v1

    aput-object p1, v3, v0

    const-string p1, "SHA-256"

    invoke-static {p1}, Lcom/daaw/b3;->b(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    invoke-virtual {p2}, Lcom/daaw/l68;->g3()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/db0;->a([B)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v0

    const/4 p1, 0x3

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    aput-object p0, v3, p1

    const/4 p0, 0x4

    const-string p1, "12451000.false"

    aput-object p1, v3, p0

    const-string p0, "%s: pkg=%s, sha256=%s, atk=%s, ver=%s"

    invoke-static {p0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized d(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/daaw/qh8;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/qh8;->g:Landroid/content/Context;

    if-nez v1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/daaw/qh8;->g:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0

    return-void

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static e()Z
    .locals 2

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/daaw/qh8;->h()V

    sget-object v1, Lcom/daaw/qh8;->e:Lcom/daaw/e92;

    invoke-interface {v1}, Lcom/daaw/e92;->zzi()Z

    move-result v1
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return v1

    :catchall_0
    move-exception v1

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw v1

    :catch_0
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    const/4 v0, 0x0

    return v0
.end method

.method public static f(Ljava/lang/String;Lcom/daaw/l68;ZZ)Lcom/daaw/fx8;
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/daaw/qh8;->h()V
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1

    sget-object v0, Lcom/daaw/qh8;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/common/zzs;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/common/zzs;-><init>(Ljava/lang/String;Lcom/daaw/l68;ZZ)V

    :try_start_1
    sget-object p3, Lcom/daaw/qh8;->e:Lcom/daaw/e92;

    sget-object v1, Lcom/daaw/qh8;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Lcom/daaw/e92;->P1(Lcom/google/android/gms/common/zzs;Lcom/daaw/yd0;)Z

    move-result p3
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p3, :cond_0

    invoke-static {}, Lcom/daaw/fx8;->b()Lcom/daaw/fx8;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p3, Lcom/daaw/ie5;

    invoke-direct {p3, p2, p0, p1}, Lcom/daaw/ie5;-><init>(ZLjava/lang/String;Lcom/daaw/l68;)V

    new-instance p0, Lcom/daaw/uu8;

    const/4 p1, 0x0

    invoke-direct {p0, p3, p1}, Lcom/daaw/uu8;-><init>(Ljava/util/concurrent/Callable;Lcom/daaw/ut8;)V

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "module call"

    invoke-static {p1, p0}, Lcom/daaw/fx8;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/fx8;

    move-result-object p0

    return-object p0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "module init: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/daaw/fx8;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/fx8;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/String;ZZZZ)Lcom/daaw/fx8;
    .locals 6

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object p2

    :try_start_0
    sget-object p3, Lcom/daaw/qh8;->g:Landroid/content/Context;

    invoke-static {p3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {}, Lcom/daaw/qh8;->h()V
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance p3, Lcom/google/android/gms/common/zzo;

    const/4 v3, 0x0

    sget-object v0, Lcom/daaw/qh8;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p3

    move-object v1, p0

    move v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/zzo;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p4, :cond_0

    :try_start_3
    sget-object p0, Lcom/daaw/qh8;->e:Lcom/daaw/e92;

    invoke-interface {p0, p3}, Lcom/daaw/e92;->f1(Lcom/google/android/gms/common/zzo;)Lcom/google/android/gms/common/zzq;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/daaw/qh8;->e:Lcom/daaw/e92;

    invoke-interface {p0, p3}, Lcom/daaw/e92;->v1(Lcom/google/android/gms/common/zzo;)Lcom/google/android/gms/common/zzq;

    move-result-object p0
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzq;->q()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/common/zzq;->s()I

    move-result p0

    invoke-static {p0}, Lcom/daaw/fx8;->f(I)Lcom/daaw/fx8;

    move-result-object p0

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzq;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/common/zzq;->t()I

    move-result p3

    const/4 p4, 0x4

    if-ne p3, p4, :cond_2

    new-instance p3, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {p3}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    const-string p4, "error checking package certificate"

    if-nez p1, :cond_3

    move-object p1, p4

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzq;->s()I

    move-result p4

    invoke-virtual {p0}, Lcom/google/android/gms/common/zzq;->t()I

    move-result p0

    invoke-static {p4, p0, p1, p3}, Lcom/daaw/fx8;->g(IILjava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/fx8;

    move-result-object p0

    goto :goto_3

    :catch_0
    move-exception p0

    const-string p1, "module call"

    :goto_2
    invoke-static {p1, p0}, Lcom/daaw/fx8;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/fx8;

    move-result-object p0

    goto :goto_3

    :catch_1
    move-exception p0

    const-string p1, "module init: "

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :goto_3
    invoke-static {p2}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p2}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    goto :goto_5

    :goto_4
    throw p0

    :goto_5
    goto :goto_4
.end method

.method public static h()V
    .locals 4

    sget-object v0, Lcom/daaw/qh8;->e:Lcom/daaw/e92;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/qh8;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/daaw/qh8;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/qh8;->e:Lcom/daaw/e92;

    if-nez v1, :cond_1

    sget-object v1, Lcom/daaw/qh8;->g:Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/dynamite/DynamiteModule;->f:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v3, "com.google.android.gms.googlecertificates"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v1

    const-string v2, "com.google.android.gms.common.GoogleCertificatesImpl"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/x72;->I(Landroid/os/IBinder;)Lcom/daaw/e92;

    move-result-object v1

    sput-object v1, Lcom/daaw/qh8;->e:Lcom/daaw/e92;

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
