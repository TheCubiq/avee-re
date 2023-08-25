.class public final synthetic Lcom/daaw/u96;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/v96;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/v96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u96;->a:Lcom/daaw/v96;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u96;->a:Lcom/daaw/v96;

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {v0, p1}, Lcom/daaw/v96;->a(Ljava/lang/Exception;)Lcom/daaw/w96;

    const/4 p1, 0x0

    return-object p1
.end method
