.class public final synthetic Lcom/daaw/qg6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/me6;


# instance fields
.field public final synthetic a:Lcom/daaw/cv3;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cv3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qg6;->a:Lcom/daaw/cv3;

    iput-object p2, p0, Lcom/daaw/qg6;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/qg6;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/qg6;->a:Lcom/daaw/cv3;

    iget-object v1, p0, Lcom/daaw/qg6;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/qg6;->c:Ljava/lang/String;

    check-cast p1, Lcom/daaw/ew3;

    new-instance v3, Lcom/daaw/pw3;

    invoke-interface {v0}, Lcom/daaw/cv3;->zzc()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Lcom/daaw/cv3;->zzb()I

    move-result v0

    invoke-direct {v3, v4, v0}, Lcom/daaw/pw3;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v3, v1, v2}, Lcom/daaw/ew3;->h3(Lcom/daaw/tv3;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
