.class public final Lcom/daaw/sl6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/sl6;
    .locals 1

    invoke-static {}, Lcom/daaw/ol6;->a()Lcom/daaw/sl6;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/daaw/fv6;->a()Lcom/daaw/zu6;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/daaw/zu6;->a(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/m77;->a(Ljava/util/concurrent/ExecutorService;)Lcom/daaw/g77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
