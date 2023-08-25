.class public final Lcom/daaw/ff5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ff5;->a:Lcom/daaw/m08;

    return-void
.end method

.method public static b(Lcom/daaw/zh3;)Lcom/daaw/ef5;
    .locals 1

    new-instance v0, Lcom/daaw/ef5;

    invoke-direct {v0, p0}, Lcom/daaw/ef5;-><init>(Lcom/daaw/zh3;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/daaw/ef5;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ff5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/zh3;

    new-instance v1, Lcom/daaw/ef5;

    invoke-direct {v1, v0}, Lcom/daaw/ef5;-><init>(Lcom/daaw/zh3;)V

    return-object v1
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ff5;->a()Lcom/daaw/ef5;

    move-result-object v0

    return-object v0
.end method
