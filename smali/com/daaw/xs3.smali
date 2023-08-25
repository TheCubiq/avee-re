.class public final Lcom/daaw/xs3;
.super Lcom/daaw/qs3;
.source ""


# instance fields
.field public final synthetic p:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/daaw/zs3;Ljava/util/List;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/xs3;->p:Ljava/util/List;

    invoke-direct {p0}, Lcom/daaw/qs3;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Error recording click: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    return-void
.end method

.method public final x0(Ljava/util/List;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/xs3;->p:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Recorded click: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    return-void
.end method
