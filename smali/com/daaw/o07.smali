.class public final Lcom/daaw/o07;
.super Lcom/daaw/e17;
.source ""


# instance fields
.field public final synthetic t:Lcom/daaw/i17;


# direct methods
.method public constructor <init>(Lcom/daaw/i17;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/o07;->t:Lcom/daaw/i17;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/e17;-><init>(Lcom/daaw/i17;Lcom/daaw/n07;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/daaw/g17;

    iget-object v1, p0, Lcom/daaw/o07;->t:Lcom/daaw/i17;

    invoke-direct {v0, v1, p1}, Lcom/daaw/g17;-><init>(Lcom/daaw/i17;I)V

    return-object v0
.end method
