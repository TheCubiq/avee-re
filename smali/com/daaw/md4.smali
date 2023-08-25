.class public final Lcom/daaw/md4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/n95;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public b:Lcom/daaw/if6;

.field public c:Lcom/daaw/ge6;

.field public d:Lcom/daaw/pw4;

.field public e:Lcom/daaw/up4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/ld4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/md4;->a:Lcom/daaw/bb4;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/daaw/up4;)Lcom/daaw/n95;
    .locals 0

    iput-object p1, p0, Lcom/daaw/md4;->e:Lcom/daaw/up4;

    return-object p0
.end method

.method public final synthetic b(Lcom/daaw/pw4;)Lcom/daaw/n95;
    .locals 0

    iput-object p1, p0, Lcom/daaw/md4;->d:Lcom/daaw/pw4;

    return-object p0
.end method

.method public final synthetic f(Lcom/daaw/ge6;)Lcom/daaw/qp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/md4;->c:Lcom/daaw/ge6;

    return-object p0
.end method

.method public final synthetic j(Lcom/daaw/if6;)Lcom/daaw/qp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/md4;->b:Lcom/daaw/if6;

    return-object p0
.end method

.method public final zze()Lcom/daaw/o95;
    .locals 14

    iget-object v0, p0, Lcom/daaw/md4;->d:Lcom/daaw/pw4;

    const-class v1, Lcom/daaw/pw4;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/md4;->e:Lcom/daaw/up4;

    const-class v1, Lcom/daaw/up4;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/od4;

    iget-object v3, p0, Lcom/daaw/md4;->a:Lcom/daaw/bb4;

    new-instance v4, Lcom/daaw/ln4;

    invoke-direct {v4}, Lcom/daaw/ln4;-><init>()V

    new-instance v5, Lcom/daaw/xj6;

    invoke-direct {v5}, Lcom/daaw/xj6;-><init>()V

    new-instance v6, Lcom/daaw/cp4;

    invoke-direct {v6}, Lcom/daaw/cp4;-><init>()V

    new-instance v7, Lcom/daaw/xd5;

    invoke-direct {v7}, Lcom/daaw/xd5;-><init>()V

    iget-object v8, p0, Lcom/daaw/md4;->d:Lcom/daaw/pw4;

    iget-object v9, p0, Lcom/daaw/md4;->e:Lcom/daaw/up4;

    iget-object v11, p0, Lcom/daaw/md4;->b:Lcom/daaw/if6;

    iget-object v12, p0, Lcom/daaw/md4;->c:Lcom/daaw/ge6;

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/daaw/od4;-><init>(Lcom/daaw/bb4;Lcom/daaw/ln4;Lcom/daaw/xj6;Lcom/daaw/cp4;Lcom/daaw/xd5;Lcom/daaw/pw4;Lcom/daaw/up4;Lcom/daaw/fi6;Lcom/daaw/if6;Lcom/daaw/ge6;Lcom/daaw/nd4;)V

    return-object v0
.end method

.method public final bridge synthetic zzh()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/md4;->zze()Lcom/daaw/o95;

    move-result-object v0

    return-object v0
.end method
