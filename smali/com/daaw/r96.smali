.class public final Lcom/daaw/r96;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r96;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/r96;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/r96;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/r96;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/r96;->e:Lcom/daaw/m08;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/y23;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/g77;)Lcom/daaw/p96;
    .locals 8

    new-instance v7, Lcom/daaw/p96;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/p96;-><init>(Ljava/lang/String;Lcom/daaw/y23;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/g77;[B)V

    return-object v7
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/daaw/r96;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/xa6;

    invoke-virtual {v0}, Lcom/daaw/xa6;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/daaw/y23;

    invoke-direct {v3}, Lcom/daaw/y23;-><init>()V

    iget-object v0, p0, Lcom/daaw/r96;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/qz3;

    iget-object v0, p0, Lcom/daaw/r96;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v6, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v6}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/p96;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/p96;-><init>(Ljava/lang/String;Lcom/daaw/y23;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/g77;[B)V

    return-object v0
.end method
