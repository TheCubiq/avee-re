.class public abstract Lcom/daaw/wm6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/daaw/f77;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Lcom/daaw/xm6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    sput-object v0, Lcom/daaw/wm6;->d:Lcom/daaw/f77;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/g77;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/xm6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wm6;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/wm6;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/daaw/wm6;->c:Lcom/daaw/xm6;

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/wm6;)Lcom/daaw/xm6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wm6;->c:Lcom/daaw/xm6;

    return-object p0
.end method

.method public static bridge synthetic d()Lcom/daaw/f77;
    .locals 1

    sget-object v0, Lcom/daaw/wm6;->d:Lcom/daaw/f77;

    return-object v0
.end method

.method public static bridge synthetic e(Lcom/daaw/wm6;)Lcom/daaw/g77;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wm6;->a:Lcom/daaw/g77;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/wm6;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wm6;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method


# virtual methods
.method public final varargs a(Ljava/lang/Object;[Lcom/daaw/f77;)Lcom/daaw/jm6;
    .locals 2

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Lcom/daaw/jm6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/daaw/jm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/im6;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;
    .locals 9

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v8, Lcom/daaw/vm6;

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;Lcom/daaw/rm6;)V

    return-object v8
.end method

.method public abstract f(Ljava/lang/Object;)Ljava/lang/String;
.end method
