.class public final synthetic Lcom/daaw/ex6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cu0;


# instance fields
.field public final synthetic a:Lcom/daaw/qx6;

.field public final synthetic b:Lcom/daaw/tj1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qx6;Lcom/daaw/tj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex6;->a:Lcom/daaw/qx6;

    iput-object p2, p0, Lcom/daaw/ex6;->b:Lcom/daaw/tj1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ex6;->a:Lcom/daaw/qx6;

    iget-object v1, p0, Lcom/daaw/ex6;->b:Lcom/daaw/tj1;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/qx6;->q(Lcom/daaw/tj1;Lcom/daaw/rj1;)V

    return-void
.end method
