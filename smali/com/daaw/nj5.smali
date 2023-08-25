.class public final Lcom/daaw/nj5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ok5;


# static fields
.field public static final h:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lcom/daaw/ki5;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/ri6;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lcom/daaw/zo5;

.field public final f:Lcom/daaw/to6;

.field public final g:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "Received error HTTP response code: (.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/daaw/nj5;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ri6;Lcom/daaw/ki5;Lcom/daaw/g77;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/zo5;Lcom/daaw/to6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nj5;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/nj5;->c:Lcom/daaw/ri6;

    iput-object p3, p0, Lcom/daaw/nj5;->a:Lcom/daaw/ki5;

    iput-object p4, p0, Lcom/daaw/nj5;->b:Lcom/daaw/g77;

    iput-object p5, p0, Lcom/daaw/nj5;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Lcom/daaw/nj5;->e:Lcom/daaw/zo5;

    iput-object p7, p0, Lcom/daaw/nj5;->f:Lcom/daaw/to6;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/nj5;)Lcom/daaw/zo5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nj5;->e:Lcom/daaw/zo5;

    return-object p0
.end method

.method public static bridge synthetic d()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/daaw/nj5;->h:Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 5

    iget-object v0, p0, Lcom/daaw/nj5;->a:Lcom/daaw/ki5;

    invoke-virtual {v0, p1}, Lcom/daaw/ki5;->b(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/nj5;->g:Landroid/content/Context;

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/so6;->d(Lcom/daaw/f77;Lcom/daaw/io6;)V

    new-instance v1, Lcom/daaw/kj5;

    invoke-direct {v1, p0}, Lcom/daaw/kj5;-><init>(Lcom/daaw/nj5;)V

    iget-object v2, p0, Lcom/daaw/nj5;->b:Lcom/daaw/g77;

    invoke-static {p1, v1, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    sget-object v1, Lcom/daaw/g93;->V4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/daaw/g93;->W4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/nj5;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p1

    const-class v1, Ljava/util/concurrent/TimeoutException;

    sget-object v2, Lcom/daaw/lj5;->a:Lcom/daaw/lj5;

    sget-object v3, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p1, v1, v2, v3}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    :cond_0
    iget-object v1, p0, Lcom/daaw/nj5;->f:Lcom/daaw/to6;

    invoke-static {p1, v1, v0}, Lcom/daaw/so6;->a(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    new-instance v0, Lcom/daaw/mj5;

    invoke-direct {v0, p0}, Lcom/daaw/mj5;-><init>(Lcom/daaw/nj5;)V

    sget-object v1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p1, v0, v1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method public final synthetic c(Ljava/io/InputStream;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/fi6;

    new-instance v1, Lcom/daaw/ci6;

    iget-object v2, p0, Lcom/daaw/nj5;->c:Lcom/daaw/ri6;

    invoke-direct {v1, v2}, Lcom/daaw/ci6;-><init>(Lcom/daaw/ri6;)V

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v2}, Lcom/daaw/ei6;->a(Ljava/io/Reader;)Lcom/daaw/ei6;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/fi6;-><init>(Lcom/daaw/ci6;Lcom/daaw/ei6;)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
