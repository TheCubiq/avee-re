.class public final synthetic Lcom/daaw/lt5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c15;


# instance fields
.field public final synthetic a:Lcom/daaw/mt5;

.field public final synthetic b:Lcom/daaw/tq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/mt5;Lcom/daaw/tq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lt5;->a:Lcom/daaw/mt5;

    iput-object p2, p0, Lcom/daaw/lt5;->b:Lcom/daaw/tq5;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/daaw/br4;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/lt5;->a:Lcom/daaw/mt5;

    iget-object v1, p0, Lcom/daaw/lt5;->b:Lcom/daaw/tq5;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/daaw/mt5;->c(Lcom/daaw/tq5;ZLandroid/content/Context;Lcom/daaw/br4;)V

    return-void
.end method
