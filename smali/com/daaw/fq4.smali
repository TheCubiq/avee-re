.class public final Lcom/daaw/fq4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fq4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/fq4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/fq4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/fq4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/fq4;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/eq4;
    .locals 7

    iget-object v0, p0, Lcom/daaw/fq4;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/fq4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/tm4;

    invoke-virtual {v0}, Lcom/daaw/tm4;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/fq4;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/vq5;

    iget-object v0, p0, Lcom/daaw/fq4;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/um4;

    invoke-virtual {v0}, Lcom/daaw/um4;->a()Lcom/daaw/wh6;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/fq4;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    new-instance v0, Lcom/daaw/eq4;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/eq4;-><init>(Lcom/daaw/th6;Ljava/lang/String;Lcom/daaw/vq5;Lcom/daaw/wh6;Ljava/lang/String;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fq4;->a()Lcom/daaw/eq4;

    move-result-object v0

    return-object v0
.end method
