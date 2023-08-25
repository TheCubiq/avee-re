.class public final Lcom/daaw/kd5;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Lcom/daaw/pd5;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/daaw/pd5;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kd5;->a:Lcom/daaw/pd5;

    invoke-virtual {p1}, Lcom/daaw/pd5;->f()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/kd5;->c:Ljava/util/Map;

    iput-object p2, p0, Lcom/daaw/kd5;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/kd5;)Lcom/daaw/pd5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kd5;->a:Lcom/daaw/pd5;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/kd5;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kd5;->c:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/kd5;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kd5;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/daaw/jd5;
    .locals 1

    new-instance v0, Lcom/daaw/jd5;

    invoke-direct {v0, p0}, Lcom/daaw/jd5;-><init>(Lcom/daaw/kd5;)V

    invoke-static {v0}, Lcom/daaw/jd5;->a(Lcom/daaw/jd5;)Lcom/daaw/jd5;

    return-object v0
.end method
