.class public Lcom/daaw/qv1$b;
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
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
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

    iput-object p1, p0, Lcom/daaw/qv1$b;->b:Lcom/daaw/qv1;

    iput-object p2, p0, Lcom/daaw/qv1$b;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/String;

    check-cast p5, Lcom/daaw/tx0;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/qv1$b;->b(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/tx0;)V

    return-void
.end method

.method public b(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/tx0;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/qv1$b;->a:Lcom/daaw/xw0;

    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/xw0;->f(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/tx0;Z)V

    return-void
.end method
