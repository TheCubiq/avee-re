.class public final Lcom/daaw/pl8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e48;


# static fields
.field public static final q:Lcom/daaw/pl8;


# instance fields
.field public final p:Lcom/daaw/e48;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/pl8;

    invoke-direct {v0}, Lcom/daaw/pl8;-><init>()V

    sput-object v0, Lcom/daaw/pl8;->q:Lcom/daaw/pl8;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/daaw/tl8;

    invoke-direct {v0}, Lcom/daaw/tl8;-><init>()V

    invoke-static {v0}, Lcom/daaw/q48;->b(Ljava/lang/Object;)Lcom/daaw/e48;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/daaw/q48;->a(Lcom/daaw/e48;)Lcom/daaw/e48;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/pl8;->p:Lcom/daaw/e48;

    return-void
.end method

.method public static a()D
    .locals 2

    sget-object v0, Lcom/daaw/pl8;->q:Lcom/daaw/pl8;

    invoke-virtual {v0}, Lcom/daaw/pl8;->d()Lcom/daaw/rl8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/rl8;->zza()D

    move-result-wide v0

    return-wide v0
.end method

.method public static b()J
    .locals 2

    sget-object v0, Lcom/daaw/pl8;->q:Lcom/daaw/pl8;

    invoke-virtual {v0}, Lcom/daaw/pl8;->d()Lcom/daaw/rl8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/rl8;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c()J
    .locals 2

    sget-object v0, Lcom/daaw/pl8;->q:Lcom/daaw/pl8;

    invoke-virtual {v0}, Lcom/daaw/pl8;->d()Lcom/daaw/rl8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/rl8;->zzc()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/daaw/pl8;->q:Lcom/daaw/pl8;

    invoke-virtual {v0}, Lcom/daaw/pl8;->d()Lcom/daaw/rl8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/rl8;->zzd()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f()Z
    .locals 1

    sget-object v0, Lcom/daaw/pl8;->q:Lcom/daaw/pl8;

    invoke-virtual {v0}, Lcom/daaw/pl8;->d()Lcom/daaw/rl8;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/rl8;->zze()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final d()Lcom/daaw/rl8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pl8;->p:Lcom/daaw/e48;

    invoke-interface {v0}, Lcom/daaw/e48;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/rl8;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pl8;->d()Lcom/daaw/rl8;

    move-result-object v0

    return-object v0
.end method
