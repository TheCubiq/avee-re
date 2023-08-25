.class public final synthetic Lcom/daaw/sw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fm6;


# instance fields
.field public final synthetic a:Lcom/daaw/vw5;

.field public final synthetic b:Lcom/daaw/w93;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vw5;Lcom/daaw/w93;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sw5;->a:Lcom/daaw/vw5;

    iput-object p2, p0, Lcom/daaw/sw5;->b:Lcom/daaw/w93;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/sw5;->a:Lcom/daaw/vw5;

    iget-object v1, p0, Lcom/daaw/sw5;->b:Lcom/daaw/w93;

    invoke-virtual {v0, v1}, Lcom/daaw/vw5;->c(Lcom/daaw/w93;)V

    return-void
.end method
