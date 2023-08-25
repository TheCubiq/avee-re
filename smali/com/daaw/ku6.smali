.class public final Lcom/daaw/ku6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/nu6;

.field public final b:Z


# direct methods
.method public constructor <init>(Lcom/daaw/nu6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ku6;->a:Lcom/daaw/nu6;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/ku6;->b:Z

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ku6;
    .locals 3

    :try_start_0
    const-string p2, "com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger"
    :try_end_0
    .catch Lcom/daaw/ot6; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v1, "com.google.android.gms.ads.dynamite"

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-virtual {v0, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    const-string v1, "com.google.android.gms.gass.internal.clearcut.IGassClearcut"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lcom/daaw/nu6;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/daaw/nu6;

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/daaw/lu6;

    invoke-direct {v1, p2}, Lcom/daaw/lu6;-><init>(Landroid/os/IBinder;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_0
    :try_start_3
    invoke-static {p0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p0

    invoke-interface {v1, p0, p1, v0}, Lcom/daaw/nu6;->p2(Lcom/daaw/yd0;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lcom/daaw/ku6;

    invoke-direct {p0, v1}, Lcom/daaw/ku6;-><init>(Lcom/daaw/nu6;)V
    :try_end_3
    .catch Lcom/daaw/ot6; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_2

    return-object p0

    :catch_0
    move-exception p0

    :try_start_4
    new-instance p1, Lcom/daaw/ot6;

    invoke-direct {p1, p0}, Lcom/daaw/ot6;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception p0

    :try_start_5
    new-instance p1, Lcom/daaw/ot6;

    invoke-direct {p1, p0}, Lcom/daaw/ot6;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_5
    .catch Lcom/daaw/ot6; {:try_start_5 .. :try_end_5} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    new-instance p0, Lcom/daaw/ou6;

    invoke-direct {p0}, Lcom/daaw/ou6;-><init>()V

    new-instance p1, Lcom/daaw/ku6;

    invoke-direct {p1, p0}, Lcom/daaw/ku6;-><init>(Lcom/daaw/nu6;)V

    return-object p1
.end method

.method public static c()Lcom/daaw/ku6;
    .locals 2

    new-instance v0, Lcom/daaw/ou6;

    invoke-direct {v0}, Lcom/daaw/ou6;-><init>()V

    new-instance v1, Lcom/daaw/ku6;

    invoke-direct {v1, v0}, Lcom/daaw/ku6;-><init>(Lcom/daaw/nu6;)V

    return-object v1
.end method


# virtual methods
.method public final a([B)Lcom/daaw/ju6;
    .locals 2

    new-instance v0, Lcom/daaw/ju6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/daaw/ju6;-><init>(Lcom/daaw/ku6;[BLcom/daaw/fu6;)V

    return-object v0
.end method
