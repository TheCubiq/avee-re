.class public final Lcom/daaw/a46;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a46;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/a46;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/a46;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/cq4;

    invoke-virtual {v1}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v1

    new-instance v2, Lcom/daaw/y36;

    invoke-direct {v2, v0, v1}, Lcom/daaw/y36;-><init>(Lcom/daaw/g77;Lcom/daaw/ri6;)V

    return-object v2
.end method
