.class public final Lcom/daaw/vc4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r05;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public b:Lcom/daaw/if6;

.field public c:Lcom/daaw/ge6;

.field public d:Lcom/daaw/pw4;

.field public e:Lcom/daaw/up4;

.field public f:Lcom/daaw/cx5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/uc4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vc4;->a:Lcom/daaw/bb4;

    return-void
.end method


# virtual methods
.method public final synthetic f(Lcom/daaw/ge6;)Lcom/daaw/qp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/vc4;->c:Lcom/daaw/ge6;

    return-object p0
.end method

.method public final synthetic g(Lcom/daaw/up4;)Lcom/daaw/r05;
    .locals 0

    iput-object p1, p0, Lcom/daaw/vc4;->e:Lcom/daaw/up4;

    return-object p0
.end method

.method public final synthetic h(Lcom/daaw/cx5;)Lcom/daaw/r05;
    .locals 0

    iput-object p1, p0, Lcom/daaw/vc4;->f:Lcom/daaw/cx5;

    return-object p0
.end method

.method public final synthetic j(Lcom/daaw/if6;)Lcom/daaw/qp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/vc4;->b:Lcom/daaw/if6;

    return-object p0
.end method

.method public final synthetic m(Lcom/daaw/pw4;)Lcom/daaw/r05;
    .locals 0

    iput-object p1, p0, Lcom/daaw/vc4;->d:Lcom/daaw/pw4;

    return-object p0
.end method

.method public final zzf()Lcom/daaw/s05;
    .locals 15

    iget-object v0, p0, Lcom/daaw/vc4;->d:Lcom/daaw/pw4;

    const-class v1, Lcom/daaw/pw4;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/vc4;->e:Lcom/daaw/up4;

    const-class v1, Lcom/daaw/up4;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/vc4;->f:Lcom/daaw/cx5;

    const-class v1, Lcom/daaw/cx5;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/xc4;

    iget-object v3, p0, Lcom/daaw/vc4;->a:Lcom/daaw/bb4;

    new-instance v4, Lcom/daaw/ln4;

    invoke-direct {v4}, Lcom/daaw/ln4;-><init>()V

    new-instance v5, Lcom/daaw/xj6;

    invoke-direct {v5}, Lcom/daaw/xj6;-><init>()V

    new-instance v6, Lcom/daaw/cp4;

    invoke-direct {v6}, Lcom/daaw/cp4;-><init>()V

    new-instance v7, Lcom/daaw/xd5;

    invoke-direct {v7}, Lcom/daaw/xd5;-><init>()V

    iget-object v8, p0, Lcom/daaw/vc4;->d:Lcom/daaw/pw4;

    iget-object v9, p0, Lcom/daaw/vc4;->e:Lcom/daaw/up4;

    iget-object v10, p0, Lcom/daaw/vc4;->f:Lcom/daaw/cx5;

    iget-object v12, p0, Lcom/daaw/vc4;->b:Lcom/daaw/if6;

    iget-object v13, p0, Lcom/daaw/vc4;->c:Lcom/daaw/ge6;

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v14}, Lcom/daaw/xc4;-><init>(Lcom/daaw/bb4;Lcom/daaw/ln4;Lcom/daaw/xj6;Lcom/daaw/cp4;Lcom/daaw/xd5;Lcom/daaw/pw4;Lcom/daaw/up4;Lcom/daaw/cx5;Lcom/daaw/fi6;Lcom/daaw/if6;Lcom/daaw/ge6;Lcom/daaw/wc4;)V

    return-object v0
.end method

.method public final bridge synthetic zzh()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vc4;->zzf()Lcom/daaw/s05;

    move-result-object v0

    return-object v0
.end method
