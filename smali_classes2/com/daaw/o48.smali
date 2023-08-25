.class public final Lcom/daaw/o48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/r48;


# direct methods
.method public constructor <init>(Lcom/daaw/r48;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o48;->p:Lcom/daaw/r48;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/o48;->p:Lcom/daaw/r48;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/r48;->u(Lcom/daaw/r48;Lcom/daaw/t38;)V

    return-void
.end method
