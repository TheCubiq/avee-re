.class public final Lcom/daaw/el8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/Exception;

.field public b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/el8;->a:Ljava/lang/Exception;

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/el8;->a:Ljava/lang/Exception;

    if-nez v2, :cond_0

    iput-object p1, p0, Lcom/daaw/el8;->a:Ljava/lang/Exception;

    const-wide/16 v2, 0x64

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/daaw/el8;->b:J

    :cond_0
    iget-wide v2, p0, Lcom/daaw/el8;->b:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    iget-object v0, p0, Lcom/daaw/el8;->a:Ljava/lang/Exception;

    if-eq v0, p1, :cond_1

    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Throwable;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/Throwable;

    const-string v5, "addSuppressed"

    invoke-virtual {v3, v5, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v4

    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    iget-object p1, p0, Lcom/daaw/el8;->a:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/el8;->a:Ljava/lang/Exception;

    throw p1

    :cond_2
    return-void
.end method
