.class public final Lcom/daaw/ff7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gf7;


# instance fields
.field public final a:Lcom/daaw/dq7;

.field public final b:Lcom/daaw/vm7;


# direct methods
.method public constructor <init>(Lcom/daaw/vm7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ff7;->b:Lcom/daaw/vm7;

    invoke-virtual {p1}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/pf7;->a(Ljava/lang/String;)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ff7;->a:Lcom/daaw/dq7;

    return-void
.end method

.method public static a(Lcom/daaw/vm7;)Lcom/daaw/ff7;
    .locals 1

    new-instance v0, Lcom/daaw/ff7;

    invoke-direct {v0, p0}, Lcom/daaw/ff7;-><init>(Lcom/daaw/vm7;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/daaw/vm7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ff7;->b:Lcom/daaw/vm7;

    return-object v0
.end method

.method public final zzd()Lcom/daaw/dq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ff7;->a:Lcom/daaw/dq7;

    return-object v0
.end method
