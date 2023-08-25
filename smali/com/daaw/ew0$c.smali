.class public Lcom/daaw/ew0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ew0;-><init>()V
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
.field public final synthetic a:Lcom/daaw/ew0;


# direct methods
.method public constructor <init>(Lcom/daaw/ew0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ew0$c;->a:Lcom/daaw/ew0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Long;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ew0$c;->b(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ew0$c;->a:Lcom/daaw/ew0;

    new-instance p3, Lcom/daaw/dw0;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    mul-long v2, v2, v0

    const-string p2, "tempexport"

    invoke-direct {p3, p2, v2, v3}, Lcom/daaw/dw0;-><init>(Ljava/lang/String;J)V

    invoke-static {p1, p3}, Lcom/daaw/ew0;->d(Lcom/daaw/ew0;Lcom/daaw/dw0;)Lcom/daaw/dw0;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ew0$c;->a:Lcom/daaw/ew0;

    invoke-static {p1}, Lcom/daaw/ew0;->c(Lcom/daaw/ew0;)Lcom/daaw/dw0;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ew0$c;->a:Lcom/daaw/ew0;

    invoke-static {p1}, Lcom/daaw/ew0;->c(Lcom/daaw/ew0;)Lcom/daaw/dw0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/dw0;->b()V

    :cond_1
    iget-object p1, p0, Lcom/daaw/ew0$c;->a:Lcom/daaw/ew0;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/ew0;->d(Lcom/daaw/ew0;Lcom/daaw/dw0;)Lcom/daaw/dw0;

    :goto_0
    return-void
.end method
