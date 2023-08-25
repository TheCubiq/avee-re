.class public final synthetic Lcom/daaw/ek;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# instance fields
.field public final synthetic a:Lcom/daaw/dk$g;

.field public final synthetic b:Lcom/daaw/yj;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dk$g;Lcom/daaw/yj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ek;->a:Lcom/daaw/dk$g;

    iput-object p2, p0, Lcom/daaw/ek;->b:Lcom/daaw/yj;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ek;->a:Lcom/daaw/dk$g;

    iget-object v1, p0, Lcom/daaw/ek;->b:Lcom/daaw/yj;

    check-cast p1, Lcom/daaw/lo1;

    invoke-static {v0, v1, p1, p2}, Lcom/daaw/dk$g;->b(Lcom/daaw/dk$g;Lcom/daaw/yj;Lcom/daaw/lo1;Z)V

    return-void
.end method
