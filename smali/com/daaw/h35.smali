.class public final Lcom/daaw/h35;
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

    iput-object p1, p0, Lcom/daaw/h35;->a:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/h35;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/s25;

    invoke-virtual {v0}, Lcom/daaw/s25;->a()Lcom/daaw/r25;

    move-result-object v0

    new-instance v1, Lcom/daaw/g35;

    invoke-direct {v1, v0}, Lcom/daaw/g35;-><init>(Lcom/daaw/r25;)V

    return-object v1
.end method
