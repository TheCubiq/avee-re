.class public Lcom/daaw/pv1$j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Lcom/daaw/al;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/vn;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$j0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/vn;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/pv1$j0;->b(Lcom/daaw/al;Ljava/lang/Integer;Lcom/daaw/vn;)V

    return-void
.end method

.method public b(Lcom/daaw/al;Ljava/lang/Integer;Lcom/daaw/vn;)V
    .locals 1

    invoke-static {}, Lcom/daaw/tv1;->i()Lcom/daaw/tv1;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/tv1;->g(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/daaw/tv1;->i()Lcom/daaw/tv1;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/tv1;->i()Lcom/daaw/tv1;

    move-result-object p1

    invoke-virtual {p3}, Lcom/daaw/vn;->h()I

    move-result p3

    :goto_0
    invoke-virtual {p1, p3}, Lcom/daaw/tv1;->b(I)Lcom/daaw/vn;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "Can\'t reset visualizer basedOnTemplate not valid"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p3, p2, p1, v0}, Lcom/daaw/j5;->W(ILcom/daaw/vn;Z)V

    return-void
.end method
