.class public final Lcom/daaw/k06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/ag;

.field public final b:Lcom/daaw/ri6;


# direct methods
.method public constructor <init>(Lcom/daaw/ag;Lcom/daaw/ri6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k06;->a:Lcom/daaw/ag;

    iput-object p2, p0, Lcom/daaw/k06;->b:Lcom/daaw/ri6;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 4

    new-instance v0, Lcom/daaw/l06;

    iget-object v1, p0, Lcom/daaw/k06;->b:Lcom/daaw/ri6;

    iget-object v2, p0, Lcom/daaw/k06;->a:Lcom/daaw/ag;

    invoke-interface {v2}, Lcom/daaw/ag;->a()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/l06;-><init>(Lcom/daaw/ri6;J)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
