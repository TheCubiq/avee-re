.class public final synthetic Lcom/daaw/e64;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m36;


# instance fields
.field public final synthetic a:Lcom/daaw/n64;

.field public final synthetic b:Lcom/daaw/m36;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/n64;Lcom/daaw/m36;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e64;->a:Lcom/daaw/n64;

    iput-object p2, p0, Lcom/daaw/e64;->b:Lcom/daaw/m36;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/p46;
    .locals 2

    iget-object v0, p0, Lcom/daaw/e64;->a:Lcom/daaw/n64;

    iget-object v1, p0, Lcom/daaw/e64;->b:Lcom/daaw/m36;

    invoke-virtual {v0, v1}, Lcom/daaw/n64;->i0(Lcom/daaw/m36;)Lcom/daaw/p46;

    move-result-object v0

    return-object v0
.end method
