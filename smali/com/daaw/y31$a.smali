.class public Lcom/daaw/y31$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/y31;->N(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/f0<",
        "Lcom/daaw/y31;",
        "Lcom/daaw/sr1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/y31;


# direct methods
.method public constructor <init>(Lcom/daaw/y31;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/y31$a;->a:Lcom/daaw/y31;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/y31$a;->b(Lcom/daaw/y31;Lcom/daaw/sr1;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/y31$a;->a:Lcom/daaw/y31;

    invoke-virtual {p1}, Lcom/daaw/y31;->K()[F

    move-result-object p1

    const-string v0, "u_projView"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, p1}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    const-string p1, "u_texture"

    invoke-virtual {p2, p1, v1}, Lcom/daaw/dc1;->x(Ljava/lang/String;I)V

    return-void
.end method
