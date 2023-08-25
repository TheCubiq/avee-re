.class public final Lcom/daaw/r78;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/u78;


# direct methods
.method public constructor <init>(Lcom/daaw/u78;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/r78;->p:Lcom/daaw/u78;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/r78;->p:Lcom/daaw/u78;

    iget-object v0, v0, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/x78;->K(Lcom/daaw/x78;Lcom/daaw/ua5;)V

    iget-object v0, p0, Lcom/daaw/r78;->p:Lcom/daaw/u78;

    iget-object v0, v0, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    invoke-static {v0}, Lcom/daaw/x78;->L(Lcom/daaw/x78;)V

    return-void
.end method
