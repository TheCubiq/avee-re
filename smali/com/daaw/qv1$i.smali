.class public Lcom/daaw/qv1$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uw1$a<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        "Lcom/daaw/tx0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;

.field public final synthetic b:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$i;->b:Lcom/daaw/qv1;

    iput-object p2, p0, Lcom/daaw/qv1$i;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Long;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, Lcom/daaw/tx0;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/qv1$i;->b(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/daaw/tx0;)V

    return-void
.end method

.method public b(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/daaw/tx0;)V
    .locals 7

    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/daaw/qv1$i;->a:Lcom/daaw/xw0;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/xw0;->g(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ZLcom/daaw/tx0;)V

    :cond_0
    return-void
.end method
