.class public final Lcom/daaw/r85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final a:Lcom/google/android/gms/ads/internal/zza;

.field public final b:Lcom/daaw/p74;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/daaw/kd5;

.field public final e:Lcom/daaw/on6;

.field public final f:Lcom/daaw/cq5;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lcom/daaw/sl2;

.field public final i:Lcom/google/android/gms/internal/ads/zzchu;

.field public final j:Lcom/daaw/op6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/sl2;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/p74;Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/kd5;Lcom/daaw/on6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r85;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/r85;->g:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/r85;->h:Lcom/daaw/sl2;

    iput-object p4, p0, Lcom/daaw/r85;->i:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p5, p0, Lcom/daaw/r85;->a:Lcom/google/android/gms/ads/internal/zza;

    iput-object p6, p0, Lcom/daaw/r85;->b:Lcom/daaw/p74;

    iput-object p7, p0, Lcom/daaw/r85;->f:Lcom/daaw/cq5;

    iput-object p8, p0, Lcom/daaw/r85;->j:Lcom/daaw/op6;

    iput-object p9, p0, Lcom/daaw/r85;->d:Lcom/daaw/kd5;

    iput-object p10, p0, Lcom/daaw/r85;->e:Lcom/daaw/on6;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/r85;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/r85;)Lcom/daaw/sl2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->h:Lcom/daaw/sl2;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/r85;)Lcom/google/android/gms/ads/internal/zza;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->a:Lcom/google/android/gms/ads/internal/zza;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/r85;)Lcom/google/android/gms/internal/ads/zzchu;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->i:Lcom/google/android/gms/internal/ads/zzchu;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/r85;)Lcom/daaw/p74;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->b:Lcom/daaw/p74;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/r85;)Lcom/daaw/kd5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->d:Lcom/daaw/kd5;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/r85;)Lcom/daaw/cq5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->f:Lcom/daaw/cq5;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/daaw/r85;)Lcom/daaw/on6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->e:Lcom/daaw/on6;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/daaw/r85;)Lcom/daaw/op6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->j:Lcom/daaw/op6;

    return-object p0
.end method

.method public static bridge synthetic j(Lcom/daaw/r85;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r85;->g:Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/daaw/u85;

    invoke-direct {v0, p0}, Lcom/daaw/u85;-><init>(Lcom/daaw/r85;)V

    invoke-virtual {v0}, Lcom/daaw/u85;->h()V

    return-object v0
.end method
