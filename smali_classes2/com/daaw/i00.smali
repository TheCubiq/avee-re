.class public final Lcom/daaw/i00;
.super Lcom/daaw/m;
.source ""


# instance fields
.field public final r:Lcom/daaw/i00$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/m;-><init>()V

    new-instance v0, Lcom/daaw/i00$a;

    invoke-direct {v0}, Lcom/daaw/i00$a;-><init>()V

    iput-object v0, p0, Lcom/daaw/i00;->r:Lcom/daaw/i00$a;

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Lcom/daaw/i00;->r:Lcom/daaw/i00$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
