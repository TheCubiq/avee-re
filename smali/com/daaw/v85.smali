.class public final Lcom/daaw/v85;
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

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v85;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/v85;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/v85;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/v85;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/v85;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/v85;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/v85;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/daaw/v85;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/jq4;

    iget-object v0, p0, Lcom/daaw/v85;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/daaw/vr4;

    iget-object v0, p0, Lcom/daaw/v85;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/ls4;

    iget-object v0, p0, Lcom/daaw/v85;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/xs4;

    iget-object v0, p0, Lcom/daaw/v85;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/uv4;

    iget-object v0, p0, Lcom/daaw/v85;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/sm4;

    invoke-virtual {v0}, Lcom/daaw/sm4;->a()Lcom/daaw/th6;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/v85;->g:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/um4;

    invoke-virtual {v0}, Lcom/daaw/um4;->a()Lcom/daaw/wh6;

    move-result-object v8

    new-instance v0, Lcom/daaw/q85;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/daaw/q85;-><init>(Lcom/daaw/jq4;Lcom/daaw/vr4;Lcom/daaw/ls4;Lcom/daaw/xs4;Lcom/daaw/uv4;Lcom/daaw/th6;Lcom/daaw/wh6;)V

    return-object v0
.end method
