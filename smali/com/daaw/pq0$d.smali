.class public Lcom/daaw/pq0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/pq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g0<",
        "Lcom/daaw/y31;",
        "Lcom/daaw/sr1;",
        "Lcom/daaw/w31;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pq0;


# direct methods
.method public constructor <init>(Lcom/daaw/pq0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pq0$d;->a:Lcom/daaw/pq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    check-cast p3, Lcom/daaw/w31;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/pq0$d;->b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/pq0$d;->a:Lcom/daaw/pq0;

    iget-object p1, p1, Lcom/daaw/pq0;->Y:Lcom/daaw/pr1;

    invoke-virtual {p1}, Lcom/daaw/pr1;->a()[F

    move-result-object p1

    const-string p3, "u_projView"

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0, p1}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    return-void
.end method
