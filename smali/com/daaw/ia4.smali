.class public final Lcom/daaw/ia4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/p15;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public b:Lcom/daaw/if6;

.field public c:Lcom/daaw/ge6;

.field public d:Lcom/daaw/pw4;

.field public e:Lcom/daaw/up4;

.field public f:Lcom/daaw/l15;

.field public g:Lcom/daaw/wi4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/ha4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ia4;->a:Lcom/daaw/bb4;

    return-void
.end method


# virtual methods
.method public final synthetic c(Lcom/daaw/wi4;)Lcom/daaw/p15;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ia4;->g:Lcom/daaw/wi4;

    return-object p0
.end method

.method public final synthetic d(Lcom/daaw/l15;)Lcom/daaw/p15;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ia4;->f:Lcom/daaw/l15;

    return-object p0
.end method

.method public final synthetic e(Lcom/daaw/up4;)Lcom/daaw/p15;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ia4;->e:Lcom/daaw/up4;

    return-object p0
.end method

.method public final synthetic f(Lcom/daaw/ge6;)Lcom/daaw/qp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ia4;->c:Lcom/daaw/ge6;

    return-object p0
.end method

.method public final synthetic j(Lcom/daaw/if6;)Lcom/daaw/qp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ia4;->b:Lcom/daaw/if6;

    return-object p0
.end method

.method public final synthetic l(Lcom/daaw/pw4;)Lcom/daaw/p15;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ia4;->d:Lcom/daaw/pw4;

    return-object p0
.end method

.method public final zzg()Lcom/daaw/q15;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/ia4;->d:Lcom/daaw/pw4;

    const-class v2, Lcom/daaw/pw4;

    invoke-static {v1, v2}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/daaw/ia4;->e:Lcom/daaw/up4;

    const-class v2, Lcom/daaw/up4;

    invoke-static {v1, v2}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/daaw/ia4;->f:Lcom/daaw/l15;

    const-class v2, Lcom/daaw/l15;

    invoke-static {v1, v2}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/daaw/ia4;->g:Lcom/daaw/wi4;

    const-class v2, Lcom/daaw/wi4;

    invoke-static {v1, v2}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v1, Lcom/daaw/ka4;

    iget-object v4, v0, Lcom/daaw/ia4;->a:Lcom/daaw/bb4;

    iget-object v5, v0, Lcom/daaw/ia4;->g:Lcom/daaw/wi4;

    iget-object v6, v0, Lcom/daaw/ia4;->f:Lcom/daaw/l15;

    new-instance v7, Lcom/daaw/ln4;

    invoke-direct {v7}, Lcom/daaw/ln4;-><init>()V

    new-instance v8, Lcom/daaw/xj6;

    invoke-direct {v8}, Lcom/daaw/xj6;-><init>()V

    new-instance v9, Lcom/daaw/cp4;

    invoke-direct {v9}, Lcom/daaw/cp4;-><init>()V

    new-instance v10, Lcom/daaw/xd5;

    invoke-direct {v10}, Lcom/daaw/xd5;-><init>()V

    iget-object v11, v0, Lcom/daaw/ia4;->d:Lcom/daaw/pw4;

    iget-object v12, v0, Lcom/daaw/ia4;->e:Lcom/daaw/up4;

    iget-object v14, v0, Lcom/daaw/ia4;->b:Lcom/daaw/if6;

    iget-object v15, v0, Lcom/daaw/ia4;->c:Lcom/daaw/ge6;

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Lcom/daaw/ka4;-><init>(Lcom/daaw/bb4;Lcom/daaw/wi4;Lcom/daaw/l15;Lcom/daaw/ln4;Lcom/daaw/xj6;Lcom/daaw/cp4;Lcom/daaw/xd5;Lcom/daaw/pw4;Lcom/daaw/up4;Lcom/daaw/fi6;Lcom/daaw/if6;Lcom/daaw/ge6;Lcom/daaw/ja4;)V

    return-object v1
.end method

.method public final bridge synthetic zzh()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ia4;->zzg()Lcom/daaw/q15;

    move-result-object v0

    return-object v0
.end method
