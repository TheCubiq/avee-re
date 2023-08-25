.class public final Lcom/daaw/p07;
.super Lcom/daaw/e17;
.source ""


# instance fields
.field public final synthetic t:Lcom/daaw/i17;


# direct methods
.method public constructor <init>(Lcom/daaw/i17;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/p07;->t:Lcom/daaw/i17;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/e17;-><init>(Lcom/daaw/i17;Lcom/daaw/n07;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p07;->t:Lcom/daaw/i17;

    invoke-static {v0, p1}, Lcom/daaw/i17;->l(Lcom/daaw/i17;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
