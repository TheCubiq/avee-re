.class public Lcom/daaw/hj0$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/kw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/kw1$a<",
        "Lcom/daaw/uk;",
        "Lcom/daaw/tx0$b;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$k;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/uk;

    check-cast p2, Lcom/daaw/tx0$b;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/hj0$k;->b(Lcom/daaw/uk;Lcom/daaw/tx0$b;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Lcom/daaw/uk;Lcom/daaw/tx0$b;Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hj0$k;->a:Lcom/daaw/hj0;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/hj0;->z(Lcom/daaw/uk;Lcom/daaw/tx0$b;Z)V

    return-void
.end method
