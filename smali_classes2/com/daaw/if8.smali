.class public final Lcom/daaw/if8;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final synthetic r:Lcom/daaw/ck8;


# direct methods
.method public constructor <init>(Lcom/daaw/vh8;Ljava/lang/String;Lcom/daaw/ck8;)V
    .locals 0

    iput-object p3, p0, Lcom/daaw/if8;->r:Lcom/daaw/ck8;

    const-string p1, "getValue"

    invoke-direct {p0, p1}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 2

    const-string v0, "getValue"

    const/4 v1, 0x2

    invoke-static {v0, v1, p2}, Lcom/daaw/ou7;->h(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gl2;

    invoke-virtual {p1, v0}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gl2;

    invoke-virtual {p1, p2}, Lcom/daaw/w07;->b(Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object p1

    invoke-interface {v0}, Lcom/daaw/gl2;->zzi()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/if8;->r:Lcom/daaw/ck8;

    invoke-interface {v0, p2}, Lcom/daaw/ck8;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p1, Lcom/daaw/wp2;

    invoke-direct {p1, p2}, Lcom/daaw/wp2;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method
