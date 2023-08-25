.class public final Lcom/daaw/oa4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c96;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public b:Lcom/daaw/ma6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/na4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oa4;->a:Lcom/daaw/bb4;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/daaw/ma6;)Lcom/daaw/c96;
    .locals 0

    iput-object p1, p0, Lcom/daaw/oa4;->b:Lcom/daaw/ma6;

    return-object p0
.end method

.method public final zzb()Lcom/daaw/d96;
    .locals 4

    iget-object v0, p0, Lcom/daaw/oa4;->b:Lcom/daaw/ma6;

    const-class v1, Lcom/daaw/ma6;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/qa4;

    iget-object v1, p0, Lcom/daaw/oa4;->a:Lcom/daaw/bb4;

    iget-object v2, p0, Lcom/daaw/oa4;->b:Lcom/daaw/ma6;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/qa4;-><init>(Lcom/daaw/bb4;Lcom/daaw/ma6;Lcom/daaw/pa4;)V

    return-object v0
.end method
