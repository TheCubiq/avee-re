.class public final Lcom/daaw/rc4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jf5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/zh3;

.field public final c:Lcom/daaw/bb4;

.field public final d:Lcom/daaw/rc4;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Landroid/content/Context;Lcom/daaw/zh3;Lcom/daaw/qc4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/daaw/rc4;->d:Lcom/daaw/rc4;

    iput-object p1, p0, Lcom/daaw/rc4;->c:Lcom/daaw/bb4;

    iput-object p2, p0, Lcom/daaw/rc4;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/rc4;->b:Lcom/daaw/zh3;

    invoke-static {p0}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rc4;->e:Lcom/daaw/m08;

    invoke-static {p3}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/rc4;->f:Lcom/daaw/m08;

    new-instance p3, Lcom/daaw/ff5;

    invoke-direct {p3, p2}, Lcom/daaw/ff5;-><init>(Lcom/daaw/m08;)V

    iput-object p3, p0, Lcom/daaw/rc4;->g:Lcom/daaw/m08;

    new-instance p2, Lcom/daaw/hf5;

    invoke-direct {p2, p1, p3}, Lcom/daaw/hf5;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {p2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rc4;->h:Lcom/daaw/m08;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/rc4;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/rc4;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/rc4;)Lcom/daaw/ef5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/rc4;->b:Lcom/daaw/zh3;

    invoke-static {p0}, Lcom/daaw/ff5;->b(Lcom/daaw/zh3;)Lcom/daaw/ef5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zzb()Lcom/daaw/af5;
    .locals 4

    new-instance v0, Lcom/daaw/lc4;

    iget-object v1, p0, Lcom/daaw/rc4;->c:Lcom/daaw/bb4;

    iget-object v2, p0, Lcom/daaw/rc4;->d:Lcom/daaw/rc4;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/lc4;-><init>(Lcom/daaw/bb4;Lcom/daaw/rc4;Lcom/daaw/kc4;)V

    return-object v0
.end method

.method public final zzd()Lcom/daaw/gf5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rc4;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gf5;

    return-object v0
.end method
