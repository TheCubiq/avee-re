.class public Lcom/daaw/ie1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ie1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/sd0;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ie1;


# direct methods
.method public constructor <init>(Lcom/daaw/ie1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ie1$e;->a:Lcom/daaw/ie1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/sd0;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/ie1$e;->b(Ljava/lang/Integer;Lcom/daaw/sd0;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public b(Ljava/lang/Integer;Lcom/daaw/sd0;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget p2, Lcom/daaw/j5;->M:I

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/j5;->c0(II)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget p2, Lcom/daaw/j5;->N:I

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/j5;->c0(II)V

    iget-object p1, p0, Lcom/daaw/ie1$e;->a:Lcom/daaw/ie1;

    invoke-static {p1}, Lcom/daaw/ie1;->a(Lcom/daaw/ie1;)V

    return-void
.end method
