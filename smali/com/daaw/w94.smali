.class public final Lcom/daaw/w94;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/e94;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/e94;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w94;->a:Lcom/daaw/e94;

    iput-object p2, p0, Lcom/daaw/w94;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/xz3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w94;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qz3;

    invoke-virtual {v0}, Lcom/daaw/qz3;->g()Lcom/daaw/xz3;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/w94;->a()Lcom/daaw/xz3;

    move-result-object v0

    return-object v0
.end method
