.class public final Lcom/daaw/lc4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/af5;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public final b:Lcom/daaw/rc4;

.field public c:Ljava/lang/Long;

.field public d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/rc4;Lcom/daaw/kc4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lc4;->a:Lcom/daaw/bb4;

    iput-object p2, p0, Lcom/daaw/lc4;->b:Lcom/daaw/rc4;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(J)Lcom/daaw/af5;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/lc4;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public final synthetic zza(Ljava/lang/String;)Lcom/daaw/af5;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/lc4;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final zzc()Lcom/daaw/bf5;
    .locals 8

    iget-object v0, p0, Lcom/daaw/lc4;->c:Ljava/lang/Long;

    const-class v1, Ljava/lang/Long;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/lc4;->d:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/nc4;

    iget-object v3, p0, Lcom/daaw/lc4;->a:Lcom/daaw/bb4;

    iget-object v4, p0, Lcom/daaw/lc4;->b:Lcom/daaw/rc4;

    iget-object v5, p0, Lcom/daaw/lc4;->c:Ljava/lang/Long;

    iget-object v6, p0, Lcom/daaw/lc4;->d:Ljava/lang/String;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/daaw/nc4;-><init>(Lcom/daaw/bb4;Lcom/daaw/rc4;Ljava/lang/Long;Ljava/lang/String;Lcom/daaw/mc4;)V

    return-object v0
.end method
