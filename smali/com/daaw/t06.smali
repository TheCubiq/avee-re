.class public final Lcom/daaw/t06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/f77;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/daaw/f77;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/t06;->a:Lcom/daaw/f77;

    iput-object p2, p0, Lcom/daaw/t06;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/t06;->a:Lcom/daaw/f77;

    sget-object v1, Lcom/daaw/s06;->a:Lcom/daaw/s06;

    iget-object v2, p0, Lcom/daaw/t06;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
