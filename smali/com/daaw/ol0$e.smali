.class public Lcom/daaw/ol0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ol0;-><init>(Lcom/daaw/az0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ol0;


# direct methods
.method public constructor <init>(Lcom/daaw/ol0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ol0$e;->a:Lcom/daaw/ol0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Long;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ol0$e;->b(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ol0$e;->a:Lcom/daaw/ol0;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {p1, p3}, Lcom/daaw/ol0;->f(Lcom/daaw/ol0;Z)Z

    iget-object p1, p0, Lcom/daaw/ol0$e;->a:Lcom/daaw/ol0;

    const/4 p3, 0x0

    iput-object p3, p1, Lcom/daaw/ol0;->c:Lcom/daaw/tx0;

    invoke-static {p1, p2}, Lcom/daaw/ol0;->h(Lcom/daaw/ol0;Z)Z

    iget-object p1, p0, Lcom/daaw/ol0$e;->a:Lcom/daaw/ol0;

    invoke-static {p1, p2}, Lcom/daaw/ol0;->j(Lcom/daaw/ol0;Z)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ol0$e;->a:Lcom/daaw/ol0;

    invoke-static {p1, p2}, Lcom/daaw/ol0;->f(Lcom/daaw/ol0;Z)Z

    :goto_0
    return-void
.end method
