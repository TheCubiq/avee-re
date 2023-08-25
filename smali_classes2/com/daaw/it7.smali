.class public final Lcom/daaw/it7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/it7;->p:Lcom/daaw/p28;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/it7;->p:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/p28;->n:Lcom/daaw/gr8;

    invoke-virtual {v0}, Lcom/daaw/gr8;->b()V

    return-void
.end method
