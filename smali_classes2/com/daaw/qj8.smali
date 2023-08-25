.class public final Lcom/daaw/qj8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e48;


# static fields
.field public static final q:Lcom/daaw/qj8;


# instance fields
.field public final p:Lcom/daaw/e48;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qj8;

    invoke-direct {v0}, Lcom/daaw/qj8;-><init>()V

    sput-object v0, Lcom/daaw/qj8;->q:Lcom/daaw/qj8;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/daaw/uj8;

    invoke-direct {v0}, Lcom/daaw/uj8;-><init>()V

    invoke-static {v0}, Lcom/daaw/q48;->b(Ljava/lang/Object;)Lcom/daaw/e48;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/daaw/q48;->a(Lcom/daaw/e48;)Lcom/daaw/e48;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/qj8;->p:Lcom/daaw/e48;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/daaw/qj8;->q:Lcom/daaw/qj8;

    invoke-virtual {v0}, Lcom/daaw/qj8;->a()Lcom/daaw/sj8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/sj8;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/daaw/qj8;->q:Lcom/daaw/qj8;

    invoke-virtual {v0}, Lcom/daaw/qj8;->a()Lcom/daaw/sj8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/sj8;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lcom/daaw/sj8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj8;->p:Lcom/daaw/e48;

    invoke-interface {v0}, Lcom/daaw/e48;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/sj8;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/qj8;->a()Lcom/daaw/sj8;

    move-result-object v0

    return-object v0
.end method
