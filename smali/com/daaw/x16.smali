.class public final synthetic Lcom/daaw/x16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/y16;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y16;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x16;->a:Lcom/daaw/y16;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/x16;->a:Lcom/daaw/y16;

    check-cast p1, Ljava/lang/Exception;

    iget-object v0, v0, Lcom/daaw/y16;->a:Lcom/daaw/qz3;

    const-string v1, "AppSetIdInfoSignal"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/z16;

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-direct {p1, v0, v1}, Lcom/daaw/z16;-><init>(Ljava/lang/String;I)V

    return-object p1
.end method
