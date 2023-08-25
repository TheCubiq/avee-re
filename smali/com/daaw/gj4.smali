.class public Lcom/daaw/gj4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/xl4;

.field public final b:Landroid/view/View;

.field public final c:Lcom/daaw/uh6;

.field public final d:Lcom/daaw/a74;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/uh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gj4;->b:Landroid/view/View;

    iput-object p2, p0, Lcom/daaw/gj4;->d:Lcom/daaw/a74;

    iput-object p3, p0, Lcom/daaw/gj4;->a:Lcom/daaw/xl4;

    iput-object p4, p0, Lcom/daaw/gj4;->c:Lcom/daaw/uh6;

    return-void
.end method

.method public static final f(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/th6;Lcom/daaw/ri6;)Lcom/daaw/ly4;
    .locals 2

    new-instance v0, Lcom/daaw/ly4;

    new-instance v1, Lcom/daaw/ej4;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/ej4;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/th6;Lcom/daaw/ri6;)V

    sget-object p0, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-direct {v0, v1, p0}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static final g(Lcom/daaw/ol4;)Ljava/util/Set;
    .locals 2

    new-instance v0, Lcom/daaw/ly4;

    sget-object v1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-direct {v0, p0, v1}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/daaw/ml4;)Lcom/daaw/ly4;
    .locals 2

    new-instance v0, Lcom/daaw/ly4;

    sget-object v1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    invoke-direct {v0, p0, v1}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gj4;->b:Landroid/view/View;

    return-object v0
.end method

.method public final b()Lcom/daaw/a74;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gj4;->d:Lcom/daaw/a74;

    return-object v0
.end method

.method public final c()Lcom/daaw/xl4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gj4;->a:Lcom/daaw/xl4;

    return-object v0
.end method

.method public d(Ljava/util/Set;)Lcom/daaw/as4;
    .locals 1

    new-instance v0, Lcom/daaw/as4;

    invoke-direct {v0, p1}, Lcom/daaw/as4;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public final e()Lcom/daaw/uh6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gj4;->c:Lcom/daaw/uh6;

    return-object v0
.end method
