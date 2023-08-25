.class public final Lcom/daaw/za4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m08;


# instance fields
.field public final synthetic a:Lcom/daaw/bb4;


# direct methods
.method public constructor <init>(Lcom/daaw/bb4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/za4;->a:Lcom/daaw/bb4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/daaw/oa4;

    iget-object v1, p0, Lcom/daaw/za4;->a:Lcom/daaw/bb4;

    invoke-static {v1}, Lcom/daaw/bb4;->F(Lcom/daaw/bb4;)Lcom/daaw/bb4;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/oa4;-><init>(Lcom/daaw/bb4;Lcom/daaw/na4;)V

    return-object v0
.end method
